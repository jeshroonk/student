import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class Student {
    String name;
    LocalDate dob;

    Student(String name, String dobStr) {
        this.name = name;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.dob = LocalDate.parse(dobStr, formatter);
    }

    void displayDetails() {
        int age = Period.between(dob, LocalDate.now()).getYears();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Course {
    String semester;
    String[] courseNames;
    int[] marks;

    Course(String semester, String[] courseNames, int[] marks) {
        this.semester = semester;
        this.courseNames = courseNames;
        this.marks = marks;
    }

    void displayCourses() {
        System.out.println("Semester: " + semester);
        for (int i = 0; i < courseNames.length; i++) {
            System.out.println("Course: " + courseNames[i] + ", Marks: " + marks[i]);
        }
    }
}

public class Experiment2 {
    public static void main(String[] args) {
       
        Student s1 = new Student("Ravi", "15-08-2002");
        s1.displayDetails();

      
        String[] sem1Courses = {"Maths", "Physics"};
        int[] sem1Marks = {85, 78};
        Course semester1 = new Course("Semester 1", sem1Courses, sem1Marks);

       
        String[] sem2Courses = {"Chemistry", "Biology"};
        int[] sem2Marks = {88, 91};
        Course semester2 = new Course("Semester 2", sem2Courses, sem2Marks);

        semester1.displayCourses();
        semester2.displayCourses();
    }
}
