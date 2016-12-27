package vn.thanh.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import vn.thanh.spring.aspect.MyAspect;
import vn.thanh.spring.bean.SpringConfigMarker;

@ComponentScan(basePackageClasses = {SpringConfigMarker.class})
@Configuration
@EnableAspectJAutoProxy
@PropertySource("classpath:externalSource.properties")
public class SpringConfiguration {
  
  @Bean
  public PropertySourcesPlaceholderConfigurer configurer() {
    return new PropertySourcesPlaceholderConfigurer();
  }
  
  @Bean
  public MyAspect myAspect() {
    return new MyAspect();
  }

}
