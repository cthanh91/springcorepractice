package vn.thanh.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {

  @Pointcut("execution(* vn.thanh.spring.bean.*.*(..))")
  public void marker() {
  }

  @Before("marker()")
  public void beforeMethod() {
    System.out.println(this.getClass().getName() + "'s before method is run");
  }

  @After("marker()")
  public void afterFinallyMethod() {
    System.out.println(this.getClass().getName() + "'s afterFinally method is run");

  }

  @AfterReturning("marker()")
  public void afterSuccessful() {
    System.out.println(this.getClass().getName() + "'s afterSuccessful method is run");

  }

  @AfterThrowing("marker()")
  public void afterException() {
    System.out.println(this.getClass().getName() + "'s afterException method is run");

  }

}
