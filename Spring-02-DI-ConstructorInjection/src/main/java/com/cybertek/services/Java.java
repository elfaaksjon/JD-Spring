package com.cybertek.services;

import com.cybertek.Interfaces.Course;
import com.cybertek.Interfaces.ExtraSessions;

public class Java  implements Course {

    //OfficeHourse officeHourse;

    ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {

        System.out.println("Weekly Teaching Hours : " + (20+extraSessions.getHours())    );

    }
}
