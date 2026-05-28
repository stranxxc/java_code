package ch08_04_AspectJ_proxy_dxc_53;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect_dxc_53 {
	
	public static void before(JoinPoint joinPoint){
		System.out.println("---------前增强-AspectJ---------");
	}
	
	public static void after(JoinPoint joinPoint){
		System.out.println("---------后增强-AspectJ---------");
	}

	public static void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		System.out.println("---------环绕前增强-AspectJ---------");
		Object obj = proceedingJoinPoint.proceed();
		
		System.out.println("---------环绕后增强-AspectJ---------");
	}

}
