package arrayLists;
import java.util.ArrayList;
public class arrayListTraversal {

    /*public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("string1");
        stringList.add("string2");
        stringList.add("string3");
        stringList.add("string4");

        // Traverse using a regular for loop
        traverseArrayListUsingRegularForLoop(stringList);


        // Traverse using an enhanced for loop
        traverseArrayListUsingEnhancedForLoop(stringList);
    }*/

    public static ArrayList<String> traverseArrayListUsingEnhancedForLoop() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("string1");
        stringList.add("string2");
        stringList.add("string3");
        stringList.add("string4");
        System.out.println("\nTraversing using an enhanced for loop:");
        for (String element : stringList) {
            System.out.println(element);
        }

        return stringList;
    }

    public static ArrayList<String> traverseArrayListUsingRegularForLoop(){
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("string1");
        stringList.add("string2");
        stringList.add("string3");
        stringList.add("string4");
        System.out.println("Traversing using a regular for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println(element);
        }

        return stringList;
    }
}
