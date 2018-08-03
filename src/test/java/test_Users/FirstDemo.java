package test_Users;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import entity.Users;

public class FirstDemo {

	public static void main(String args[]) throws IOException {
		String resource="conf.xml";
		/*Reader reader = Resources.getResourceAsReader(resource);*/
		InputStream is = FirstDemo.class.getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = sessionFactory.openSession();//����ִ��ӳ���ļ���SQL��sqlSession
		String statement="mapping.userMapper.getUser";//ӳ��SQL��ʶ�ַ���
		Users users=session.selectOne(statement,1);
		System.out.println(users);
	}
}
