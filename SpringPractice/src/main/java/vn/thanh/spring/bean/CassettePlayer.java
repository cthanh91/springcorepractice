package vn.thanh.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import vn.thanh.spring.qualifier.Old;

@Component
@Old
public class CassettePlayer implements MusicPlayer {

  private Radio radio;
  private String name;

  static {
    System.out.println("CassettePlayer is initialized");
  }

  public CassettePlayer(@Value("#{systemProperties['dics.noname'] ?: 'default name'}") String name) {
    this.name = name;
  }

  public void play() {
    System.out.println("Cassette Player is playing");
    System.out.println("Cassette name: " + name);
    internalMethod();
  }

  public void startRadio() {
    radio.start();
  }

  public Radio getRadio() {
    return radio;
  }

  @Autowired
  public void setRadio(Radio radio) {
    this.radio = radio;
  }
  
  private void internalMethod() {
    System.out.println("internalMethod is called");
  }

}
