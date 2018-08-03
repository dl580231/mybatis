package test_Class;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import entity.Class;
import utils.MybatisUtils;

public class TestByXMLMapper {

	private SqlSession session=MybatisUtils.getSession(true);
	
	//һ��һ������ϲ�ѯ
	public void getClassById() {
		String statement="mapping.classMapper.getClassById";
		Class class1 = session.selectOne(statement, 1);
		System.out.println(class1);
	}
	
	//һ��һ���Ƕ�ײ�ѯ
	public void selectClassById() {
		String statement="mapping.classMapper.selectClassById";
		Class class1=session.selectOne(statement,1);
		System.out.println(class1);
	}
	
	//һ�Զ������ϲ�ѯ
	public void getClassById_m() {
		String statement="mapping.classMapper.getClassById_m";
		Class class1=session.selectOne(statement,1);
		System.out.println(class1);
	}
	
	@Test//һ�Զ���Ƕ�ײ�ѯ
	public void getClassById_m_2() {
		String statement="mapping.classMapper.getClassById_m_2";
		Class class1=session.selectOne(statement,1);
		System.out.println(class1);
	}
}
