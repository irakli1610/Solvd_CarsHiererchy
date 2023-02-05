package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import imappers.IServicedCarsMapper;
import models.Engine;
import models.ServicedCars;
import utils.MyBatisUtil;

public class ServiceServicedCarsMapper implements IServicedCarsMapper {

	public List<ServicedCars> getALLEntities(){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		List<ServicedCars> servicedCarsList =session.selectList("selectAllServicedCars");
		session.commit();
		session.close();
		return servicedCarsList;	
	}
	public void insertEntity(ServicedCars servedcars){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.insert("insertServedCars",servedcars);
		session.commit();
		session.close();
	}
	public void updateEntity(ServicedCars servedcars){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("updateServicedCars",servedcars);
		session.commit();
		session.close();
	}
	public void deleteEntity(long servicedCarsId){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("deleteServicedCars",servicedCarsId);
		session.commit();
		session.close();
	}
}
