package com.androidstudiomanju;

import android.widget.ListView;

public class CourseModel {
    // TextView as String and ImageView as int
    private String course_name;
    private int course_img;
// constructor
    public CourseModel(String course_name, int course_img) {
        this.course_name = course_name;
        this.course_img = course_img;
    }
// getter and setter
    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getCourse_img() {
        return course_img;
    }

    public void setCourse_img(int course_img) {
        this.course_img = course_img;

    }
}
