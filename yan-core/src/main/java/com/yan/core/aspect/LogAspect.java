/*
 * Copyright (c) 2017 Yanzheng [https://github.com/micyo202/yan]
 * 
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS
 * BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN
 * ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.yan.core.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * 名称：LogAspect
 * <p>
 * 描述：面向切面编程（自定义日志输出）（order=3 优先级低）
 *
 * @author Yanzheng 严正
 * 时间：
 * 2017-08-25 16:00:34
 * 版权：
 * Copyright 2017 <a href="https://github.com/micyo202" target="_blank">https://github.com/micyo202</a>. All rights reserved.
 */
@Component
@Aspect
@Order(3)
public class LogAspect {

    /**
     * 日志记录类
     */
    private static final Logger log = LoggerFactory.getLogger(LogAspect.class);

    /**
     * 切入点表达式
     */
    @Pointcut("execution(* com.yan..*.controller..*.*(..))")
    public void logPointCut() {
    }

    /**
     * 前置通知
     */
    /*
	@Before("logPointCut()")
	public void beforeMethod(JoinPoint joinPoint) {
		// 执行的类名
		String className = joinPoint.getTarget().getClass().getName();
		// 执行方法名
		String methodName = joinPoint.getSignature().getName();
		// 传入参数
		List<Object> parameters = Arrays.asList(joinPoint.getArgs());
		
		if(parameters.size() > 0){
			log.debug("Yan -> [LogAspect 前置通知] 执行类方法 : " + className + "." + methodName + "(), 参数 : " + parameters + ", 开始执行...[Begin]...");
		}else{
			log.debug("Yan -> [LogAspect 前置通知] 执行类方法 : " + className + "." + methodName + "(), 无参数, 开始执行...[Begin]...");
		}
	}
	*/

    /**
     * 后置通知
     */
	/*
	@After("logPointCut()")
	public void afterMethod(JoinPoint joinPoint) {
		String className = joinPoint.getTarget().getClass().getName();
		String methodName = joinPoint.getSignature().getName();
		log.debug("Yan -> [LogAspect 后置通知] 执行类方法 : " + className + "." + methodName + "(), 执行完毕...[End]...");
	}
	*/

    /**
     * 返回通知
     *
     * @param joinPoint 目标类连接点对象
     * @param result    返回结果
     */
    @AfterReturning(value = "logPointCut()", returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint, Object result) {
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        List<Object> parameters = Arrays.asList(joinPoint.getArgs());
        if (parameters.size() > 0) {
            log.info("Yan -> [LogAspect 返回通知] 执行类方法 : " + className + "." + methodName + "(" + parameters + "), 返回结果 : " + result);
        } else {
            log.info("Yan -> [LogAspect 返回通知] 执行类方法 : " + className + "." + methodName + "(), 返回结果 : " + result);
        }
    }


    /**
     * 异常通知
     *
     * @param joinPoint 目标类连接点对象
     * @param exception 异常类
     */
    @AfterThrowing(value = "logPointCut()", throwing = "exception")
    public void afterThrowingMethod(JoinPoint joinPoint, Exception exception) {
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        List<Object> parameters = Arrays.asList(joinPoint.getArgs());
        if (parameters.size() > 0) {
            log.warn("Yan -> [LogAspect 异常通知] 执行类方法 : " + className + "." + methodName + "(" + parameters + "), 异常 : " + exception.getMessage());
        } else {
            log.warn("Yan -> [LogAspect 异常通知] 执行类方法 : " + className + "." + methodName + "(), 异常 : " + exception.getMessage());
        }
    }

    /**
     * 环绕通知
     */
	/*
	@Around("logPointCut()")
	public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint) {
		// 执行的类名
		String className = proceedingJoinPoint.getTarget().getClass().getName();
		// 执行方法名
		String methodName = proceedingJoinPoint.getSignature().getName();
		// 传入参数
		List<Object> parameters = Arrays.asList(proceedingJoinPoint.getArgs());
		Object result = null;
		try {
			System.out.println("Yan -> [Aspect 环绕通知] 执行类方法 : " + className + "." + methodName + "(), 参数 : " + parameters);
			result = proceedingJoinPoint.proceed();
			System.out.println("Yan -> [Aspect 环绕通知] 执行类方法 : " + className + "." + methodName + "(), 执行完毕...[End]...");
		} catch (Throwable exception) {
			System.out.println("Yan -> [Aspect 环绕通知] 执行类方法 : " + className + "." + methodName + "(), 异常 : " + exception.getMessage());
		}

		System.out.println("Yan -> [Aspect 环绕通知] 执行类方法 : " + className + "." + methodName + "(), 返回结果 : " + result);
		return result;
	}
	*/

}
