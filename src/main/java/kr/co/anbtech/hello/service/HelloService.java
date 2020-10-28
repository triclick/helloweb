package kr.co.anbtech.hello.service;

import kr.co.anbtech.hello.dao.HelloDAO;

public class HelloService {
	private HelloDAO helloDAO ;
	
	public HelloService(HelloDAO helloDAO) {
		this.helloDAO = helloDAO ;
	}
	
	public int calcTwoNumbers(int a, int b) {
		return helloDAO.addTwoNumber(a, b) ;
	}
	
	

}
