package cn.hr.aop.anno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyCar {
	
	@Before(value="execution(* cn.hr.aop.anno.Car.*(..))")
	public void before() {
		System.out.println("before car add....");
	}
}
