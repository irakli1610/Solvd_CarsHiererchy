package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import imappers.ILightsMapper;
import models.Engine;
import models.Lights;
import utils.MyBatisUtil;

public class ServiceLightsMapper implements ILightsMapper {

	public List<Lights> getALLEntities(){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		List<Lights> lightsList =session.selectList("selectAllLights");
		session.commit();
		session.close();
		return lightsList;	
	}
	public void insertEntity(Lights light){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.insert("insertLight",light);
		session.commit();
		session.close();
	}
	public void updateEntity(Lights light){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("updateLights",light);
		session.commit();
		session.close();
	}
	public void deleteEntity(long lightsId){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("deleteLights",lightsId);
		session.commit();
		session.close();
	}

}
