package AnalyticCompany;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Student {
    private long studentId;
    String name;

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(long studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public static void main(String[] args) {
        Stream<Student> stStream = Stream.of(
                new Student(0054, "Albert Einstein"),
                new Student(1234, "Gottfried Wilhelm Leibniz"),
                new Student(5421, "Carl Friedrich Gauss"));

        String format = "%-40s %4d\n";
        List<Student> students = new ArrayList<Student>();
        stStream.sorted(new StudentComparator()).forEach(p -> System.out.format(format, p.getName(), p.getStudentId()));
    }

    static class StudentComparator implements Comparator<Student> {
        public int compare(Student a, Student b) {
            return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
        }
    }
}