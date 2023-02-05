package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import imappers.ICarOwnersMapper;
import models.CarOwner;
import models.Engine;
import models.Person;
import utils.MyBatisUtil;

public class ServiceCarOwnerMapper implements ICarOwnersMapper {

	public List<CarOwner> getALLEntities(){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		List<CarOwner> carOwnerList =session.selectList("selectAllCarOwners");
		session.commit();
		session.close();
		return carOwnerList;	
	}
	
	public void insertEntity(CarOwner carowner){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.insert("insertCarOwner",carowner);
		session.commit();
		session.close();
	}
	public void updateEntity(CarOwner carow){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("updateCarOwner",carow);
		session.commit();
		session.close();
	}
	public void deleteEntity(long carOwnerId){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("deleteCarOwner",carOwnerId);
		session.commit();
		session.close();
	}
}
