package vn.thanh.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class CassetteRadio implements Radio {

  static {
    System.out.println("CassetteRadio is initialized");
  }

  public void start() {
    System.out.println("Cassette Radio is playing");
  }

}
