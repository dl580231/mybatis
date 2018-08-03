package spring_config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Spring_mybatisInitializer extends 
AbstractAnnotationConfigDispatcherServletInitializer {//扩展该抽象类将自动的配置DispatcherServlet和Spring上下文

	protected Class<?>[] getRootConfigClasses() {
	//指定由ContextLoaderListen加载的上下文的配置类，这些bean通常是驱动应用后端的中间层和数据层组件（除了springWeb组件的bean）
		return new Class<?>[] {RootConfig.class};
	}

	protected Class<?>[] getServletConfigClasses() {
	//指定由DispatcherServlet加载的上下文的配置类,DispatcherServlet上下文加载包含web组件的bean,包括控制器、视图解析器、处理器映射
		return new Class<?>[]{WebConfig.class};
	}

	protected String[] getServletMappings() {
		//配置DispatcherServlet的映射路径
		return new String[]{"/"};
	}

}
