package myspring.di.xml;

import static org.junit.jupiter.api.Assertions.assertEquals;
//Assertions에 포함된 모든 static method를 import
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloJunitTest {
	ApplicationContext context;
	
	@BeforeEach
	void container() {
		//1. Container 객체생성
		context = new GenericXmlApplicationContext("classpath:hello-di.xml");	
	}
	
	@Test
	void helloBean() {
		//2. Container 객체가 생성한 Spring Bean 요청하기
		Hello helloById = (Hello)context.getBean("hello");
		Hello helloByType = context.getBean("hello", Hello.class);
		
		//Spring Bean의 주소 비교
		System.out.println(helloById == helloByType);
		assertSame(helloById, helloByType);
		
		//값 비교
		//<property name="name" value="스프링" /> 이 설정을 테스트 한 것
		assertEquals("Hello 스프링", helloById.sayHello());
		
		helloById.print();
		
		//Container 객체가 생성한 SpringPrinter 스프링빈 요청
		//<property name="printer" ref="strPrinter" /> 이 설정 테스트 한 것
		Printer printer = context.getBean("strPrinter", Printer.class);
		assertEquals("Hello 스프링", printer.toString());
	}
}
