package spring_config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Spring_mybatisInitializer extends 
AbstractAnnotationConfigDispatcherServletInitializer {//��չ�ó����ཫ�Զ�������DispatcherServlet��Spring������

	protected Class<?>[] getRootConfigClasses() {
	//ָ����ContextLoaderListen���ص������ĵ������࣬��Щbeanͨ��������Ӧ�ú�˵��м������ݲ����������springWeb�����bean��
		return new Class<?>[] {RootConfig.class};
	}

	protected Class<?>[] getServletConfigClasses() {
	//ָ����DispatcherServlet���ص������ĵ�������,DispatcherServlet�����ļ��ذ���web�����bean,��������������ͼ��������������ӳ��
		return new Class<?>[]{WebConfig.class};
	}

	protected String[] getServletMappings() {
		//����DispatcherServlet��ӳ��·��
		return new String[]{"/"};
	}

}
