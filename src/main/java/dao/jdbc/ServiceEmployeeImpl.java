package dao.jdbc;

import java.sql.SQLException;

import dao.IServiceEmployee;
import models.ServiceEmployee;
import utils.MySqlDao;

public class ServiceEmployeeImpl extends MySqlDao implements IServiceEmployee {





	public void insertEntity(ServiceEmployee t) {
		// TODO Auto-generated method stub

	}



	public ServiceEmployee readEntityById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntityById(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void updateEntityById(int id, ServiceEmployee t) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
