package vn.thanh.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import vn.thanh.spring.qualifier.Testable;

@Component
@Testable
public class CassettePlayerForTest implements MusicPlayer {

  @Autowired
  private Environment env;
  
  public void play() {
    System.out.println("Cassette player for test is playing");
    System.out.println(env.getProperty("dics.title", "Not found"));
  }

  public void startRadio() {
    System.out.println("No radio function");
  }

}
