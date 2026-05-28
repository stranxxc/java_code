package ch08_03_ProxyFactoryBean_proxy_dxc_53;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect_dxc_53 implements MethodInterceptor{
	
	public Object invoke(MethodInvocation mi) throws Throwable{
		
		this.before();
		Object obj =mi.proceed();
		
		this.after();
		
		return null;
	}
	
	public static void before(){
		System.out.println("---------前增强---------");
	}
	
	public static void after(){
		System.out.println("---------后增强---------");
	}

}
