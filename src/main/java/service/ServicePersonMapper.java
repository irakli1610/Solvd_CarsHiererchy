package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import imappers.IPersonMapper;
import models.Person;
import utils.MyBatisUtil;

public class ServicePersonMapper implements IPersonMapper {

	public List<Person> getALLEntities(){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		List<Person> personList =session.selectList("selectAllPerson");
		session.commit();
		session.close();
		return personList;	
	}
	
	public void insertEntity(Person person){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.insert("insertPerson",person);
		session.commit();
		session.close();
	}
	public void updateEntity(Person person){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("updateEntity",person);
		session.commit();
		session.close();
	}
	public void deleteEntity(long personId){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("deleteEntity",personId);
		session.commit();
		session.close();
	}
	
}
