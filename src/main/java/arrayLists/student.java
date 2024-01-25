package arrayLists;
import java.util.ArrayList;
public class student {
    String firstName;
    String lastName;
    double GPA;

    // Constructor
    public student(String firstName, String lastName, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }
}


class FilterStudentsByGPA {


    public static void main(String[] args) {
        // Create an ArrayList of Students
        ArrayList<student> studentList = new ArrayList<>();
        studentList.add(new student("John", "Doe", 3.5));
        studentList.add(new student("Jane", "Smith", 4.0));
        studentList.add(new student("Bob", "Johnson", 3.2));
        studentList.add(new student("Alice", "Williams", 3.8));

        // Remove students with GPA less than the average GPA
        removeStudentsBelowAverageGPA(studentList);

        // Print the remaining students
        System.out.println("Remaining Students:");
        for (student student : studentList) {
            System.out.println("Name: " + student.firstName + " " + student.lastName + ", GPA: " + student.GPA);
        }
    }

    public static ArrayList<student> removeStudentsBelowAverageGPA(ArrayList<student> studentList) {

        // Calculate the average GPA
        double averageGPA = calculateAverageGPA(studentList);
        System.out.println(averageGPA);
        // Remove students with GPA less than the average GPA
        studentList.removeIf(student -> student.GPA < averageGPA);

        return studentList;
    }

    public static double calculateAverageGPA(ArrayList<student> students) {
        if (students.isEmpty()) {
            return 0.0;
        }

        double totalGPA = 0.0;
        for (student student : students) {
            totalGPA += student.GPA;
        }

        return totalGPA / students.size();
    }
}
