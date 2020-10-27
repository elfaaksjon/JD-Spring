package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;

public class Java  implements Course {
 private OfficeHourse officeHourse;

    public OfficeHourse getOfficeHourse() {
        return officeHourse;
    }

    public void setOfficeHourse(OfficeHourse officeHourse) {//set + officHours
        this.officeHourse = officeHourse;
    }

    public void getTeachingHours() {

        System.out.println("Weekly Teaching Hours : " + (20+officeHourse.getHours())  );

    }
}
