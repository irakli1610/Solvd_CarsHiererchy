package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import imappers.IShopEmployeeMapper;
import models.Engine;
import models.ShopEmployee;
import utils.MyBatisUtil;

public class ServiceShopEmployeeMapper implements IShopEmployeeMapper {

	public List<ShopEmployee> getALLEntities(){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		List<ShopEmployee> shopemployeeLint =session.selectList("selectAllShopEmployee");
		session.commit();
		session.close();
		return shopemployeeLint;	
	}
	public void insertEntity(ShopEmployee shopemp){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.insert("insertShopEmployee",shopemp);
		session.commit();
		session.close();
	}
	public void updateEntity(ShopEmployee shopemp){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("updateEntity",shopemp);
		session.commit();
		session.close();
	}
	public void deleteEntity(long shopEmployeeId){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("deleteEntity",shopEmployeeId);
		session.commit();
		session.close();
	}
}
