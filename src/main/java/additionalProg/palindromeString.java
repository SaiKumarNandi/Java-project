package additionalProg;

public class palindromeString {
    public static boolean checkPalindromeString(String s){
        String reversedString = new StringBuilder(s).reverse().toString();
        return s.equals(reversedString);
    }
}
