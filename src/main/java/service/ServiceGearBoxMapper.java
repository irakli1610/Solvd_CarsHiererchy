package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import imappers.IGearBoxMapper;
import models.CarParts;
import models.Engine;
import models.GearBox;
import utils.MyBatisUtil;

public class ServiceGearBoxMapper implements IGearBoxMapper {

	public List<GearBox> getALLEntities(){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		List<GearBox> gearboxList =session.selectList("selectAllGearBox");
		session.commit();
		session.close();
		return gearboxList;	
	}
	public void insertEntity(GearBox gearbox){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.insert("insertGearBox",gearbox);
		session.commit();
		session.close();
	}
	public void updateEntity(GearBox gearbox){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("updateEntity",gearbox);
		session.commit();
		session.close();
	}
	public void deleteEntity(long gearboxId){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		session.update("deleteEntity",gearboxId);
		session.commit();
		session.close();
	}
}
