package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import imappers.ICarParstMapper;
import models.CarParts;
import utils.MyBatisUtil;

public class ServiceCarPartsMapper implements ICarParstMapper {

	public List<CarParts> getALLEntities(){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		List<CarParts> carPartsList =session.selectList("selectAllCarParts");
		session.commit();
		session.close();
		return carPartsList;	
	}
	
	public void insertEntity(CarParts carParts){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.insert("insertCarParts",carParts);
		session.commit();
		session.close();
	}
	public void updateEntity(CarParts carpa){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("updateEntity",carpa);
		session.commit();
		session.close();
	}
	public void deleteEntity(long carPartsId){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("deleteEntity",carPartsId);
		session.commit();
		session.close();
	}
}
