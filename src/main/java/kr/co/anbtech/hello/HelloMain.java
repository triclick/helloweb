package kr.co.anbtech.hello;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.anbtech.hello.service.BbsService;
import kr.co.anbtech.hello.vo.Article;

public class HelloMain {
	
	private static AbstractApplicationContext ctx ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx = new ClassPathXmlApplicationContext("/spring-context.xml") ;
		
		BbsService service = ctx.getBean("bbsService",BbsService.class) ;
		service.registArticle(new Article());
	}

}
