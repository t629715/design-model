package com.example.designmodel.factory.simplefactory;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new CourseFactory();
        ICourse course = courseFactory.create(JavaCourse.class);
        course.record();
    }
}
