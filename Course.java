import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Course {
    protected String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class ProgrammingCourse extends Course {
    public ProgrammingCourse(String name) {
        super(name);
    }
}

class PhysicsCourse extends Course {
    public PhysicsCourse(String name) {
        super(name);
    }
}

class MathCourse extends Course {
    public MathCourse(String name) {
        super(name);
    }
}
