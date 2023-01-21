package dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dao.IPerson;
import models.Person;
import utils.ConnectionPool;
import utils.MySqlDao;

public class PersonImpl extends MySqlDao implements IPerson {
	
	
	 private static final Logger LOGGER = LogManager.getLogger(PersonImpl.class);

	ConnectionPool conPool = ConnectionPool.getinstance();
	
	public Person readEntityById(int personId)  {
		
		
		Connection connection = conPool.retrieve();
		Person person = null;
		
		String query = "SELECT * FROM person WHERE person_id=?";
		PreparedStatement ps=null;
		ResultSet rs = null;
		try {
			ps = connection.prepareStatement(query);
			
		ps.setInt(1, personId);
		
		 rs = ps.executeQuery();
		if(rs.next()) {
			int person2Id = rs.getInt(1);
			String name = rs.getString(2);
			String lastName= rs.getString(3);
			int age = rs.getInt(4);
			
			person = new Person(person2Id,name,lastName,age);
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
				LOGGER.info("Connection putback is successfull");
			}
		}
		return person;	

	}
	
	
	
	
	
	
	
	
	public void insertEntity(Person t) {
		Connection connection = conPool.retrieve();
		
		String query = "INSERT INTO person VALUES(?,?,?,?)";
		PreparedStatement ps = null;
		
		
		try {
			ps=connection.prepareStatement(query);
			ps.setLong(1, t.getPersonId());
			ps.setString(2,t.getFirstName());
			ps.setString(3,t.getLastName());
			ps.setInt(4,t.getAge());

			ps.execute();
			LOGGER.info("person successfully inserted");

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
		String query = "DELETE FROM person WHERE person_id=?";
		PreparedStatement ps = null;


		try {
			ps=connection.prepareStatement(query);
			ps.setLong(1, id);
			

			ps.execute();
			LOGGER.info("person successfully deleted");

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
	public void updateEntityById(int id, Person t) throws SQLException {
		Connection connection = conPool.retrieve();
		
		String query = "UPDATE  person SET first_name=?, last_name=?, age=? where person_id=? ";
		PreparedStatement ps = null;
		
		

		try {
			ps=connection.prepareStatement(query);
			ps.setString(1,t.getFirstName());
			ps.setString(2, t.getLastName());
			ps.setInt(3, t.getAge());
			ps.setLong(4, id);

			

			ps.execute();
			LOGGER.info("person successfully updated");

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
