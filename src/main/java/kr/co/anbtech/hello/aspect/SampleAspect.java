package kr.co.anbtech.hello.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SampleAspect {
	
	@Before("execution(* kr.co.anbtech.hello..*.*(..))")
	public void before(JoinPoint joinPoint) {
		String targetMethodName = joinPoint.getSignature().getName() ;
		System.out.println(targetMethodName + "is invoked..") ;		
	}

}
