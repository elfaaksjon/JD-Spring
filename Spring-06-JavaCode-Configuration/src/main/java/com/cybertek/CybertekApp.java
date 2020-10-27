package com.cybertek;

import com.cybertek.config.CybertekAppConfig;
import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CybertekApp {

    public static void main(String[] args) {
        //create container, we dont need config.xml anymore.
        //You have to put ClassName or my config Class Name in ().
        ApplicationContext container =new AnnotationConfigApplicationContext(CybertekAppConfig.class);

        Course course =container.getBean("java",Course.class);

        course.getTeachingHours();

    }
}
