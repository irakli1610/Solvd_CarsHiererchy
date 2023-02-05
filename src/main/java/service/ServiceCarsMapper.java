package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import imappers.ICarsMapper;
import models.CarParts;
import models.Cars;
import models.Engine;
import utils.MyBatisUtil;

public class ServiceCarsMapper implements ICarsMapper {

	public List<Cars> getALLEntities(){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		List<Cars> carsList =session.selectList("selectAllCars");
		session.commit();
		session.close();
		return carsList;	
	}
	public void insertEntity(Cars car){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.insert("insertCar",car);
		session.commit();
		session.close();
	}
	public void updateEntity(Cars cars){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("updateCars",cars);
		session.commit();
		session.close();
	}
	public void deleteEntity(long carsListId){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("deleteCars",carsListId);
		session.commit();
		session.close();
	}
}
