package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import imappers.ICarServicesMapper;
import models.CarServices;
import utils.MyBatisUtil;

public class ServiceCarServiceMapper implements ICarServicesMapper {

	public List<CarServices> getALLEntities(){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		List<CarServices> carServicesList =session.selectList("selectAllCarServices");
		session.commit();
		session.close();
		return carServicesList;	
	}

	public void insertEntity(CarServices carservices){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.insert("insertCarService",carservices);
		session.commit();
		session.close();
	}
	public void updateEntity(CarServices carserv){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("updateCarService",carserv);
		session.commit();
		session.close();
	}
	public void deleteEntity(long carServiceId){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("deleteCarService",carServiceId);
		session.commit();
		session.close();
	}
}
