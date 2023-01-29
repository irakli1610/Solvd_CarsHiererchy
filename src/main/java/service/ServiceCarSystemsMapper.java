package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import imappers.ICarSystemsMapper;
import models.CarParts;
import models.CarSystems;
import models.Engine;
import utils.MyBatisUtil;

public class ServiceCarSystemsMapper implements ICarSystemsMapper {

	public List<CarSystems> getALLEntities(){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		List<CarSystems> carsystems =session.selectList("selectAllCarSystems");
		session.commit();
		session.close();
		return carsystems;	
	}
	public void insertEntity(CarSystems carsystem){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.insert("insertCarSystem",carsystem);
		session.commit();
		session.close();
	}
	public void updateEntity(CarSystems carsys){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("updateEntity",carsys);
		session.commit();
		session.close();
	}
	public void deleteEntity(long carSystemsId){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("deleteEntity",carSystemsId);
		session.commit();
		session.close();
	}
}
