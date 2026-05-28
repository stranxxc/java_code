package ch08_01_jdk_proxy_dxc_53;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Proxy_jdk_dxc_53 implements InvocationHandler {

	User_interFace user_server_dxc_53;

	public Proxy_jdk_dxc_53(User_interFace cur_user_server_dxc_53) {
		this.user_server_dxc_53 = cur_user_server_dxc_53;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {

		System.out.println("---------前增强->dxc_53>---------");

		method.invoke(user_server_dxc_53, args);

		System.out.println("---------后增强->dxc_53>---------");

		return proxy;
	}

}
