package cn.hr.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.junit.validator.PublicClassValidator;

//Book的增强类
public class HeightenBook {
	
	//前置增强
	public void before1() {
		System.out.println("before buy...");
	}
	//后置增强
	public void after1() {
		System.out.println("after buy....");
	}
	
	//环绕增强
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		//方法之前
		System.out.println("环绕增强之前....");
		//执行被增强的方法
		proceedingJoinPoint.proceed();
		//方法之后
		System.out.println("环绕增强之后....");
	}
}    
