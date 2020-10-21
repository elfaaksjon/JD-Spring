package com.cybertek;

import com.cybertek.Interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CyberTekApp {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        //I mgana create container which is gana give me beans, giverefrance from configuration.

        //intenfece is manageing for me, spring take control fow me.
        Course course = container.getBean("java" , Course.class);
        course.getTeachingHours();



    }
}
