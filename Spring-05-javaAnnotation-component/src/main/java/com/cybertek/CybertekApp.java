package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
Most useful and most important Annotation we use in Application Design
    @Component : it id used to marl a class from which a bean will be created

        @Controller
        @Service
        @Repostid
We use
 */
public class CybertekApp {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        /*
        When spring creates a Bean Definition from @COmponent annotation, it will by default create
        an id for the bean by lowercasing the first letter of the Class Name
        , if it as all capital letter, we have write all capital letter.
         */
        Course course = container.getBean("API",Course.class);


        course.getTeachingHours();
        ((ClassPathXmlApplicationContext) container).close();


    }
}
