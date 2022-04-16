public class StringContain {
    public static boolean isStringContainedIn(String subString, String s) {
        if (subString == null || s == null) {
            return false;
        }
        return s.contains(subString);
    }
}