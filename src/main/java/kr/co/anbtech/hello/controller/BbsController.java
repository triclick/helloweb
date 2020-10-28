package kr.co.anbtech.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.anbtech.hello.service.BbsService;
import kr.co.anbtech.hello.vo.Article;

@Controller
@RequestMapping("/bbs")
public class BbsController {
	@Autowired
	private BbsService bbsService ;
	
	@GetMapping("")
	public String index() {
		return "index" ;
	}
	
	@GetMapping("/{articleId}")
	public ModelAndView viewDetail(@PathVariable String articleId) {
		Article article = bbsService.queryArticle(articleId) ;
		System.out.println("글 번호:" + articleId) ;
		return new ModelAndView("write_ok").addObject("article",article) ;		
	}
	//public String viewDetail(@PathVariable String articleId) {
	//	System.out.println("글 번호:" + articleId) ;
	//	return "write_ok" ;		
	//}
	
	@PostMapping("/write")
	public ModelAndView doWrite(Article article) {
		bbsService.registArticle(article);
		System.out.println("Post request..") ;
		return new ModelAndView("write_ok").addObject("article",article) ;		
	}
	
	@GetMapping("/write")
	public String Write() {
		bbsService.registArticle(new Article());
		System.out.println("Get request..") ;
		return "write_ok" ;
	}

}
