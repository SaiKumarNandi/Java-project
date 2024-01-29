package mapList;
import arrayLists.student;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import java.util.HashMap;

public class studentHashMapTest {

    @Test
    public void testgetStudentByName(){
        HashMap<String, student> studentMap = new HashMap<>();

        // Add 8 students to the HashMap
        studentMap.put("John", new student("John", "Doe", 3.5));
        studentMap.put("Jane", new student("Jane", "Smith", 3.8));
        studentMap.put("Bob", new student("Bob", "Johnson", 3.2));
        studentMap.put("Alice", new student("Alice", "Williams", 3.9));
        studentMap.put("Charlie", new student("Charlie", "Brown", 3.4));
        studentMap.put("Eva", new student("Eva", "Davis", 3.6));
        studentMap.put("Michael", new student("Michael", "Taylor", 3.7));
        studentMap.put("Sophie", new student("Sophie", "Miller", 3.1));

        // Example: Retrieve a Student object by first name
        String studentNameToSearch = "Alice";
        String studentNameToSearch1="Ali";


        student result=studentHashMap.getStudentByName(studentMap, studentNameToSearch);
        System.out.println(result.getFirstName());
        studentNameToSearch.equals(result.getFirstName());
        studentNameToSearch1.equals(null);

    }
}
