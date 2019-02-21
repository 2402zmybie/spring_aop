package cn.hr.aop.anno;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCarAopAnno {
	


	@Test
	public void test() {
		//导入配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("car.xml");
		Car car =  (Car) context.getBean("car");
		car.add();
	}
}	
