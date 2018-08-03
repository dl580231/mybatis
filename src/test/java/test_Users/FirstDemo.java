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
        SqlSession session = sessionFactory.openSession();//创建执行映射文件中SQL的sqlSession
		String statement="mapping.userMapper.getUser";//映射SQL标识字符串
		Users users=session.selectOne(statement,1);
		System.out.println(users);
	}
}
