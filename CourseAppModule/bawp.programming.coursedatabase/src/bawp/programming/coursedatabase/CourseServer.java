package bawp.programming.coursedatabase;

import java.util.ArrayList;
import java.util.List;

public class CourseServer {

    public List<Course> getCourses() {
        List<Course> courses = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Course course = new Course();
            course.setCourseName("Course name: " + i);
            course.setCourseAuthor("Author: " + i);

            courses.add(course);
        }

        return courses;
    }
}
