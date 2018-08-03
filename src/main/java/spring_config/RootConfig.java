package spring_config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import dao.UserMapper;

@Configuration
@ComponentScan(basePackageClasses=UserMapper.class)
public class RootConfig {
}
