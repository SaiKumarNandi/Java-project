package additionalProg;

public class swapCase {
    public static String swapCase(String input) {
        char[] charArray = input.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            if (Character.isUpperCase(charArray[i]))
                charArray[i] = Character.toLowerCase(charArray[i]);
            else if (Character.isLowerCase(charArray[i]))
                charArray[i] = Character.toUpperCase(charArray[i]);

        }

        return new String(charArray);
    }
}
