import java.util.Locale;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        String lowerCase = s.toLowerCase(Locale.ROOT);

        for (int i = 0; i < lowerCase.length(); i++) {
            if (lowerCase.charAt(i) != lowerCase.charAt(lowerCase.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}