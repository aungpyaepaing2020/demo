package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Player player=context.getBean("player",Player.class);
        System.out.println(player.getDevice().getDeviceName()+" is playing "+player.getSongName());

    }
}
