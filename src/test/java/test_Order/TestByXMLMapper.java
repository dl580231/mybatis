package test_Order;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import entity.Order;
import utils.MybatisUtils;

public class TestByXMLMapper {

	private SqlSession session=MybatisUtils.getSession();

	
	public void getOrder() {
		session = MybatisUtils.getSession(true);
		String statement="mapping.orderMapper.getOrder";
		Order one = session.selectOne(statement, 1);
		System.out.println(one);
	}
	
	
	public void selectOrder() {
		session = MybatisUtils.getSession(true);
		String statement="mapping.orderMapper.selectOrder";
		Order one = session.selectOne(statement, 1);
		System.out.println(one);
	}
	
	@Test
	public void getOrderResultMap() {
		session = MybatisUtils.getSession(true);
		String statement="mapping.orderMapper.getOrderResultMap";
		Order one = session.selectOne(statement, 1);
		System.out.println(one);
	}
}
