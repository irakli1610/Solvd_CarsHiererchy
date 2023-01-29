package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import imappers.IEngineMapper;
import models.Engine;
import models.HeatingCooling;
import utils.MyBatisUtil;

public class ServiceEngineMapper implements IEngineMapper {

	public List<Engine> getALLEntities(){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		List<Engine> engineList =session.selectList("selectAllEngine");
		session.commit();
		session.close();
		return engineList;	
	}
	public void insertEntity(Engine engine){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.insert("insertEngine",engine);
		session.commit();
		session.close();
	}
	public void updateEntity(Engine eng){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("updateEntity",eng);
		session.commit();
		session.close();
	}
	public void deleteEntity(long engineId){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("deleteEntity",engineId);
		session.commit();
		session.close();
	}
}
