package dao.jdbc;

import dao.ICarOwner;
import models.CarOwner;
import utils.ConnectionPool;
import utils.MySqlDao;

public class CarOwnerImpl extends MySqlDao implements ICarOwner {

	ConnectionPool conPool = ConnectionPool.getinstance();

	public CarOwner readEntityById(int carOwnerId) {

		return null;
	}

	public void insertEntity(CarOwner t) {

	}

	public void deleteEntityById(int id) {

	}

	public void updateEntityById(int id, CarOwner t) {

	}

}
