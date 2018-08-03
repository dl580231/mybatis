package test_Class;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import entity.Class;
import utils.MybatisUtils;

public class TestByXMLMapper {

	private SqlSession session=MybatisUtils.getSession(true);
	
	//一对一多表联合查询
	public void getClassById() {
		String statement="mapping.classMapper.getClassById";
		Class class1 = session.selectOne(statement, 1);
		System.out.println(class1);
	}
	
	//一对一多表嵌套查询
	public void selectClassById() {
		String statement="mapping.classMapper.selectClassById";
		Class class1=session.selectOne(statement,1);
		System.out.println(class1);
	}
	
	//一对多多表联合查询
	public void getClassById_m() {
		String statement="mapping.classMapper.getClassById_m";
		Class class1=session.selectOne(statement,1);
		System.out.println(class1);
	}
	
	@Test//一对多多表嵌套查询
	public void getClassById_m_2() {
		String statement="mapping.classMapper.getClassById_m_2";
		Class class1=session.selectOne(statement,1);
		System.out.println(class1);
	}
}
