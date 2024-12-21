import java.util.*;

class Student {
    int id;
    String firstName;
    double cgpa;

    public Student(int id, String firstName, double cgpa) {
        this.id = id;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (Double.compare(s2.cgpa, s1.cgpa) != 0) {
            return Double.compare(s2.cgpa, s1.cgpa);
        }
        int nameComparison = s1.firstName.compareTo(s2.firstName);
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Integer.compare(s1.id, s2.id);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = scan.nextInt();
            String firstName = scan.next();
            double cgpa = scan.nextDouble();
            students.add(new Student(id, firstName, cgpa));
        }

        Collections.sort(students, new StudentComparator());

        for (Student student : students) {
            System.out.println(student.firstName);
        }

        scan.close();
    }
}
