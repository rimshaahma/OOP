/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concept1;
import java.util.ArrayList;
import java.util.List;
class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Student class
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class TeachingAssignment {
    private Teacher teacher;
    private List<Student> students;

    public TeachingAssignment(Teacher teacher) {
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayTeachingAssignment() {
        System.out.println("Teacher: " + teacher.getName());
        System.out.println("Students:");

        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}
public class Concept1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teacher mathTeacher = new Teacher("Mr. Smith");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Creating an instance of TeachingAssignment (Association)
        TeachingAssignment mathTeachingAssignment = new TeachingAssignment(mathTeacher);
        mathTeachingAssignment.addStudent(student1);
        mathTeachingAssignment.addStudent(student2);

        // Displaying the teaching assignment
        mathTeachingAssignment.displayTeachingAssignment();
    }
}
