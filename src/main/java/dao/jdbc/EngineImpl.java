package dao.jdbc;

import java.sql.SQLException;

import dao.IEngine;
import models.Engine;
import utils.MySqlDao;

public class EngineImpl extends MySqlDao implements IEngine {





	public void insertEntity(Engine t) {
		// TODO Auto-generated method stub

	}

	

	public Engine readEntityById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEntityById(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void updateEntityById(int id, Engine t) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
