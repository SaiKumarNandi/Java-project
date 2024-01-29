package mapList;
import java.util.HashMap;
import arrayLists.student;
public class studentHashMap {


    // Method to retrieve a Student object by first name from the HashMap
    public static student getStudentByName(HashMap<String, student> studentMap, String firstName) {
        return studentMap.get(firstName);
    }
}
