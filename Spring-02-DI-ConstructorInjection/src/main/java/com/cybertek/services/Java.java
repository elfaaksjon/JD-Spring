package com.cybertek.services;

import com.cybertek.Interfaces.Course;

public class Java  implements Course {
    OfficeHourse officeHourse;
    @Override
    public void getTeachingHours() {

        System.out.println("Weekly Teaching Hours : " + (20+officeHourse.getHours())    );
    }
}
