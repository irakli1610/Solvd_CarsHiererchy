package dao;

import java.sql.SQLException;

public interface IBaseDao<T> {

	T readEntityById(int id) throws SQLException ;
	
	void updateEntityById(int id,T t)throws SQLException;
	
	void insertEntity(T t)throws SQLException;
	
	void deleteEntityById(int id)throws SQLException;
	
	
	
}
