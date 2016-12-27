package vn.thanh.spring.beans;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import vn.thanh.spring.bean.MusicPlayer;
import vn.thanh.spring.config.SpringConfiguration;
import vn.thanh.spring.qualifier.Old;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class SpringConfigurationTest {
  

  @Autowired
  @Old
  private MusicPlayer player;
  
  
  @Test
  public void testAutoWiring() {
    player.play();
    player.startRadio();
    
  }

}
