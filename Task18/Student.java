package Task18;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Student {
    public int studentId;
    public String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        return studentId == student.studentId && name == student.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, name);
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1,"Imam"));
        students.add(new Student(2, "Paul"));
        students.add(new Student(3, "Rakib"));
        students.add(new Student(4,"Nafisha"));

        System.out.println(students.get(1).equals(new Student(2, "Paul")));
    }
}
