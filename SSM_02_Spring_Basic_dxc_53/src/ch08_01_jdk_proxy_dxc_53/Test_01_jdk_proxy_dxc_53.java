package ch08_01_jdk_proxy_dxc_53;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test_01_jdk_proxy_dxc_53 {

	public static void main(String[] args) {

		User_server_dxc_53 user_server_dxc_53 = new User_server_dxc_53();

		ClassLoader loader = User_server_dxc_53.class.getClassLoader();

		Class<?>[] interfaces = User_server_dxc_53.class.getInterfaces();

		InvocationHandler h = new Proxy_jdk_dxc_53( user_server_dxc_53 );
		User_interFace user_server_dxc_02_proxy = (User_interFace) Proxy
				.newProxyInstance(loader, interfaces, h);

		user_server_dxc_02_proxy.add_user_dxc_53();
	}
}
