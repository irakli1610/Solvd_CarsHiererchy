package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import imappers.ICarShopsMapper;
import models.CarShops;
import utils.MyBatisUtil;

public class ServiceCarShopsMapper implements ICarShopsMapper {

	public List<CarShops> getALLEntities(){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		List<CarShops> carShopList =session.selectList("selectAllCarShops");
		session.commit();
		session.close();
		return carShopList;	
	}
	public void insertEntity(CarShops carshop){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.insert("insertCarShops",carshop);
		session.commit();
		session.close();
	}
	public void updateEntity(CarShops carshop){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("updateEntity",carshop);
		session.commit();
		session.close();
	}
	public void deleteEntity(long carShopsId){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("deleteEntity",carShopsId);
		session.commit();
		session.close();
	}
}
