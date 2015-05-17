package com.mrptech.giveLife.util;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspects {

	private static final Logger LOG = LoggerFactory.getLogger("[ Way4Cause ]");
	
	
	@Before("execution(* com.*.*.*.*.* (..))")
	public void beforeExecutingAdvice(JoinPoint jp) {
		Signature signature = jp.getSignature();
		Object[] args = jp.getArgs();
		String argList = Arrays.toString(args);
		LOG.info(signature.getDeclaringTypeName() + "." + signature.getName()
				+ " method started with the arguments" + "("
				+ argList.toString() + ")");
		
		

	}

	@AfterReturning(pointcut = "execution(* com.*.*.*.*.* (..))", returning = "returnVal")
	public void afterReturningAdvice(JoinPoint jp, Object returnVal) {
		Signature signature = jp.getSignature();
		LOG.info(signature.getDeclaringTypeName() + "." + signature.getName()
				+ " method ended with return values " + "(" + returnVal + ")");
	}

	@AfterThrowing(pointcut = "execution(* com.*.*.*.*.* (..))", throwing = "exception")
	public void afterReturningWithException(JoinPoint jp, Throwable exception) {
		Signature signature = jp.getSignature();
		LOG.info("Exception in method: " + signature.getName()
				+ " with arguments " + jp.getArgs() + "\nthe exception is: "
				+ exception.getMessage());
	}
}
