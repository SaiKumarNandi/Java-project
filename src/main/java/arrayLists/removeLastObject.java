package arrayLists;
import java.util.ArrayList;
public class removeLastObject {
    public static void main(String[] args) {
        // Create an ArrayList of Objects
        ArrayList<Object> objectList = new ArrayList<>();
        objectList.add("Apple");
        objectList.add(42);
        objectList.add(3.14);
        objectList.add(true);

        System.out.println("ArrayList before removing the last object:");
        System.out.println(objectList);

        // Remove the last object
        removeLastObject(objectList);

        System.out.println("\nArrayList after removing the last object:");
        System.out.println(objectList);
    }

    private static void removeLastObject(ArrayList<Object> list) {
        // Check if the list is not empty before removing
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }

    }
}
