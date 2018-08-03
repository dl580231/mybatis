package spring_config;

import java.io.IOException;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import dao.UserMapper;


@Configuration
@ComponentScan(basePackages= {"dao","service"})
@MapperScan(basePackageClasses= {UserMapper.class})
public class Spring_mybatis {
	
	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource ba=new BasicDataSource();
		ba.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ba.setUrl("jdbc:mysql:///mybatis?serverTimezone=GMT&useSSL=false");
		ba.setUsername("root");
		ba.setPassword("root");
		ba.setInitialSize(3);//设置初始连接数
		ba.setMinIdle(3);
		ba.setMaxTotal(10);
		return ba;
	}
	
	@Bean
	public SqlSessionFactoryBean sessionFactory() throws IOException {
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource());
		factoryBean.setTypeAliasesPackage("entity");//设置别名，不再用写全限定类名
		factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mapping/*.xml"));//设置映射文件
		return factoryBean;
	}
	
	@Bean
	public DataSourceTransactionManager transactionManager() {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(dataSource());
		return transactionManager;
	}
}
