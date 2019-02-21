package cn.hr.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.hr.aop.Book;

public class TestAop {
	
	@Test
	public void testHeightenBook() {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Book book = (Book) context.getBean("book");
		book.buy();
	}

}
