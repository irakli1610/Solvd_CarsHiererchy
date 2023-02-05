package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import imappers.IServiceEmployeeMapper;
import models.Engine;
import models.ServiceEmployee;
import utils.MyBatisUtil;

public class ServiceServiceEmployeeMapper implements IServiceEmployeeMapper {

	public List<ServiceEmployee> getALLEntities(){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		List<ServiceEmployee> serviceEmployeeList =session.selectList("selectAllServiceEmployee");
		session.commit();
		session.close();
		return serviceEmployeeList;	
	}
	public void insertEntity(ServiceEmployee serviceemp){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.insert("insertServiceEmployee",serviceemp);
		session.commit();
		session.close();
	}
	public void updateEntity(ServiceEmployee servenp){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("updateServiceEmployee",servenp);
		session.commit();
		session.close();
	}
	public void deleteEntity(long servenp){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("deleteServiceEmployee",servenp);
		session.commit();
		session.close();
	}
}
