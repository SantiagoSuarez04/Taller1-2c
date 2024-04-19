import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Student extends Person {
    private ArrayList<Course> coursesTaken;

    public Student(String name, String phone_number, String email) {
        super(name, phone_number, email);
        coursesTaken = new ArrayList<>();
    }

    public void isEligibleToEnroll(ArrayList<Course> courses) {
        HashMap<String, ArrayList<Course>> coursesByCategory = new HashMap<>();
        for (Course course : courses) {
            String category = course.getClass().getSimpleName();
            if (!coursesByCategory.containsKey(category)) {
                coursesByCategory.put(category, new ArrayList<>());
            }
            coursesByCategory.get(category).add(course);
        }

        Scanner scanner = new Scanner(System.in);
        for (String category : coursesByCategory.keySet()) {
            System.out.println("Seleccione un curso de " + category + ":");
            ArrayList<Course> categoryCourses = coursesByCategory.get(category);
            for (int i = 0; i < categoryCourses.size(); i++) {
                System.out.println((i + 1) + ". " + categoryCourses.get(i).getName());
            }
            int choice = scanner.nextInt();
            coursesTaken.add(categoryCourses.get(choice - 1));
        }
    }

    public void displayCoursesTaken() {
        System.out.println("Cursos inscritos:");
        for (Course course : coursesTaken) {
            System.out.println(course.getName());
        }
    }
}

