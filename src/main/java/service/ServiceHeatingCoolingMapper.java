package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import imappers.IHeatingCoolingMapper;
import models.HeatingCooling;
import models.Person;
import utils.MyBatisUtil;

public class ServiceHeatingCoolingMapper implements IHeatingCoolingMapper {

	public List<HeatingCooling> getALLEntities(){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		List<HeatingCooling> heatingCoolingList =session.selectList("selectAllHeatingCooling");
		session.commit();
		session.close();
		return heatingCoolingList;	
	}
	public void insertEntity(HeatingCooling heatcool){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.insert("insertEntity",heatcool);
		session.commit();
		session.close();
	}
	public void updateEntity(HeatingCooling heatcool){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("updateEntity",heatcool);
		session.commit();
		session.close();
	}
	public void deleteEntity(long heatingCoolingId){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("deleteEntity",heatingCoolingId);
		session.commit();
		session.close();
	}
}
