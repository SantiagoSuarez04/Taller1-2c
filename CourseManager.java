import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class CourseManager {
    public static ArrayList<Course> loadCoursesFromFile(String fileName) {
        ArrayList<Course> courses = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            String category = "";
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.startsWith("#")) { // Nueva categoría
                    category = line.substring(1).trim();
                } else if (!line.isEmpty()) { // Nombre del curso
                    switch (category) {
                        case "Programming":
                            courses.add(new ProgrammingCourse(line));
                            break;
                        case "Physics":
                            courses.add(new PhysicsCourse(line));
                            break;
                        case "Math":
                            courses.add(new MathCourse(line));
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return courses;
    }
}
