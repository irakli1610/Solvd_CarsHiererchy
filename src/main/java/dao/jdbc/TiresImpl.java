package dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dao.ITires;
import models.Tires;
import utils.ConnectionPool;
import utils.MySqlDao;

public class TiresImpl extends MySqlDao implements ITires {

	ConnectionPool conPool = ConnectionPool.getinstance();
	public final static Logger LOGGER = LogManager.getLogger(TiresImpl.class);
	
	public Tires readEntityById(int tireId)  {
		
		
		Connection connection = conPool.retrieve();
		Tires tires = null;
		
		String query = "SELECT * FROM tires WHERE tire_id=?";
		PreparedStatement ps=null;
		ResultSet rs = null;
		try {
			ps = connection.prepareStatement(query);
			
		ps.setInt(1, tireId);
		
		 rs = ps.executeQuery();
		if(rs.next()) {
			int tire2Id = rs.getInt(1);
			int numberOfTires = rs.getInt(2);
			int tireSize= rs.getInt(3);
			String tireBrand = rs.getString(4);
			
			tires = new Tires(tire2Id,numberOfTires,tireSize,tireBrand);
		}

		} catch (SQLException e) {
			LOGGER.error(e);
		}finally {
			if(rs !=null)
				try {
					rs.close();
					LOGGER.info("ResultSet closed succesfully");
				} catch (SQLException e) {
					LOGGER.error(e);
			}
			if(ps != null) {
				try {
					ps.close();
					LOGGER.info("PreparedStarement closed succesfully");
				} catch (SQLException e) {
					LOGGER.error(e);
				}
			}
			
			if(connection != null)
			{
				conPool.putback(connection);
				LOGGER.info("Connection closed succesfully");
			}
		}
		return tires;	

	}
	
	public void insertEntity(Tires t) {
			Connection connection = conPool.retrieve();
			
			String query = "INSERT INTO tires VALUES(?,?,?,?)";
			PreparedStatement ps = null;
			
			
			try {
				ps=connection.prepareStatement(query);
				ps.setLong(1, t.getTireId());
				ps.setInt(2,t.getNumberOfTires());
				ps.setInt(3,t.getTireSize());
				ps.setString(4,t.getTireBrand());

				ps.execute();
				LOGGER.info("tires successfully inserted");

			}catch(SQLException e){
				LOGGER.error(e);
			}finally {
				if(ps != null) {
					try {
						ps.close();
						LOGGER.info("PreparedStatement closed succesfully");

					}catch(SQLException e) {
						LOGGER.error(e);
					}
				}
				if(connection != null) {
					conPool.putback(connection);
					LOGGER.info("Connection putback is successfull");
				}
			}
	}
		
	@Override
	public void deleteEntityById(int id)  {
		
		Connection connection = conPool.retrieve();
		String query = "DELETE FROM tires WHERE tire_id=?";
		PreparedStatement ps = null;


		try {
			ps=connection.prepareStatement(query);
			ps.setLong(1, id);
			

			ps.execute();
			LOGGER.info("tires successfully deleted");

		}catch(SQLException e){
			LOGGER.error(e);
		}finally {
			if(ps != null) {
				try {
					ps.close();
					LOGGER.info("PreparedStatement closed succesfully");

				}catch(SQLException e) {
					LOGGER.error(e);
				}
			}
			if(connection != null) {
				conPool.putback(connection);
				LOGGER.info("Connection putback is successfull");
				}
		}
	}




	@Override
	public void updateEntityById(int id, Tires t) throws SQLException {
		Connection connection = conPool.retrieve();
		
		String query = "UPDATE  tires SET number_of_tires=?, tire_size=?, tire_brand=? where tire_id=? ";
		PreparedStatement ps = null;
		
		

		try {
			ps=connection.prepareStatement(query);
			ps.setInt(1,t.getNumberOfTires());
			ps.setInt(2, t.getTireSize());
			ps.setString(3, t.getTireBrand());
			ps.setLong(4, id);

			

			ps.execute();
			LOGGER.info("tires successfully updated");

		}catch(SQLException e){
			LOGGER.error(e);
		}finally {
			if(ps != null) {
				try {
					ps.close();
					LOGGER.info("PreparedStatement closed succesfully");

				}catch(SQLException e) {
					LOGGER.error(e);
				}
			}
			if(connection != null) {
				conPool.putback(connection);
				LOGGER.info("Connection putback is successfull");
				}
		}
				
	}

}
