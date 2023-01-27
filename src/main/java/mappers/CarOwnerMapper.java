package mappers;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import models.CarOwner;
import utils.MyBatisUtil;

public class CarOwnerMapper {

	public List<CarOwner> getALLCarOwners(){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		List<CarOwner> carOwnerList =session.selectList("selectAllCarOwners");
		session.commit();
		session.close();
		return carOwnerList;	
	}
}
