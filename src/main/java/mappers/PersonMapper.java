package mappers;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import models.Person;
import utils.MyBatisUtil;

public class PersonMapper {

	public List<Person> getALLPersons(){
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();	
		List<Person> personList =session.selectList("selectAllPersons");
		session.commit();
		session.close();
		return personList;	
	}
}
