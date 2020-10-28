package kr.co.anbtech.hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.anbtech.hello.dao.ArticleDAO;
import kr.co.anbtech.hello.vo.Article;

@Service
public class BbsService {
	
	@Autowired 
	private ArticleDAO articleDAO ;
	
	public void registArticle(Article article) {
		articleDAO.insertArticle(article);
	}

	public Article queryArticle(String articleId) {
		return articleDAO.selectArticleById(articleId) ;
	}
	
}
