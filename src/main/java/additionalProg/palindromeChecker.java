package additionalProg;

public class palindromeChecker {

        // Function to check if a number is a palindrome
        public static boolean isPalindrome(int num) {
            int originalNum = num;
            int reversedNum = 0;

            // Reverse the number
            while (num > 0) {
                int digit = num % 10;
                reversedNum = reversedNum * 10 + digit;
                num /= 10;
            }

            // Check if the reversed number is equal to the original number
            return originalNum == reversedNum;
        }
}
