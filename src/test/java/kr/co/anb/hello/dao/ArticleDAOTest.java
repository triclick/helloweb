package kr.co.anb.hello.dao;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.anbtech.hello.dao.ArticleDAO;
import kr.co.anbtech.hello.vo.Article;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/spring-context.xml")
//@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/*.xml")
public class ArticleDAOTest {
	
	@Autowired
	private ArticleDAO dao ;
	
	@Test
	@Ignore 
	public void testInsertArticle() {
		Article article = new Article(2,"lee","test","This content is test") ;
		dao.insertArticle(article);
	}
	
	@Test
	public void testSelectArticleById() {		
		//ApplicationContext ctx = new FileSystemXmlApplicationContext("file:src/main/resources/spring-context.xml") ;
		//ApplicationContext ctx = new FileSystemXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/*.xml") ;
		//ArticleDAO dao = ctx.getBean("articleDAO", ArticleDAO.class ) ;
		Article article = dao.selectArticleById("2") ;
		System.out.println(article);		
		Assert.assertTrue(article.getAuthor().equals("lee"));
	}

}
