package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import imappers.ITiresMapper;
import models.Engine;
import models.Tires;
import utils.MyBatisUtil;

public class ServiceTiresMapper implements ITiresMapper {

	public List<Tires> getALLEntities(){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		List<Tires> tiresList =session.selectList("selectAllTires");
		session.commit();
		session.close();
		return tiresList;	
	}
	public void insertEntity(Tires tire){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.insert("insertTires",tire);
		session.commit();
		session.close();
	}
	public void updateEntity(Tires tire){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("updateTires",tire);
		session.commit();
		session.close();
	}
	public void deleteEntity(long tireId){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("deleteTires",tireId);
		session.commit();
		session.close();
	}
}
