package ch08_03_ProxyFactoryBean_proxy_dxc_53;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//这是一个测试程序。演示Spring中创建实例的过程。
public class Test_01_proxyFactoryBaen_proxy_di_dxc_53 {

	public static void main(String[] args) {
		
		// 以下代码，是由Spring负责对象的创建，即Bean
		String configLocation = "applicationContext_spring.xml";// Bean配置文件的文件名。
		// 加载spring配置，完成bean的实例化。这个过程叫控制反转Ioc
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				configLocation);

		// 第一个bean，使用无参构造方式，实例化bean
		// 详见教材93页，该方法来自于BeanFactory工厂
		User_server_dxc_53 proxy_user_server_dxc_53 = (User_server_dxc_53) context
				.getBean("proxy_user_server_dxc_53");
		proxy_user_server_dxc_53.add_user_dxc_53();
	}
	

	
}
