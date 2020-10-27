package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java  implements Course {
    //Filed Injection
    @Autowired
    private ExtraSessions extraSessions;

    //1. we do Constructor injection , step one is create Constructor, then type @Autowired
    // 1.Constructor Injection
    // 2.Seeter Injection
    /* 3.field Injection
    @Autowired for Constructor Injection
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
    */
    //Setter Injection
//    @Autowired
//    public void setOfficeHours(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//
//    }



    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours :" + (30 +extraSessions.getHours()));

    }
}
