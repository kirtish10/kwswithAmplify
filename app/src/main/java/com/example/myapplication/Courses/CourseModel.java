package com.example.myapplication.Courses;

public class CourseModel {
    String course_id;
    String course_name;
    String course_image;


    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_image() {
        return course_image;
    }

    public void setCourse_image(String course_image) {
        this.course_image = course_image;
    }

    public CourseModel(String course_id, String course_name, String course_image) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.course_image = course_image;
    }
}
