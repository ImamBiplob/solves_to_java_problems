import java.util.Arrays;

public class University {
    public static class Department {
        private String name;
        private String[] courses;

        public Department(String name, String[] courses) {
            setName(name);
            setCourses(courses);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String[] getCourses() {
            return courses;
        }

        public void setCourses(String[] courses) {
            this.courses = courses;
        }


    }

    public static Department department;

    public static void showDetails() {
        System.out.println("Department: " + department.getName());
        System.out.println("Courses: " + Arrays.toString(department.getCourses()));
    }
}
