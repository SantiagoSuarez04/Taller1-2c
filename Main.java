import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Course> courses = CourseManager.loadCoursesFromFile("courses.txt");

        Student student = new Student("Juan", "123456789", "juan@example.com");

        student.isEligibleToEnroll(courses);

        System.out.println("\nCursos inscritos por el estudiante:");
        student.displayCoursesTaken();
    }
}

