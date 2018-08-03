package utils;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import test_Users.FirstDemo;

public class MybatisUtils {

	public static SqlSessionFactory getSessionFactory() {
		String resource="conf.xml";
		/*Reader reader = Resources.getResourceAsReader(resource);*/
		InputStream is = FirstDemo.class.getClassLoader().getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        return sessionFactory;
	}
	
	public static SqlSession getSession() {
		return getSessionFactory().openSession();
	}
	
	//ͨ��isAutoCommit�������Ծ����Ƿ���ִ����sql���֮���Ƿ��Զ��ύ����
	public static SqlSession getSession(boolean isAutoCommit) {
		return getSessionFactory().openSession(isAutoCommit);
	}
}
