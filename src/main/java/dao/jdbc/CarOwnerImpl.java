package dao.jdbc;

import java.sql.SQLException;

import dao.ICarOwner;
import models.CarOwner;
import utils.ConnectionPool;
import utils.MySqlDao;

public class CarOwnerImpl extends MySqlDao implements ICarOwner {

	ConnectionPool conPool= ConnectionPool.getinstance();
	
		public CarOwner readEntityById(int carOwnerId) throws SQLException {

		return null;
	}



	public void insertEntity(models.CarOwner t) {
		// TODO Auto-generated method stub

	}



	@Override
	public void deleteEntityById(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void updateEntityById(int id, CarOwner t) throws SQLException {
		// TODO Auto-generated method stub
		
	}


}
