public class StringConcat {
    public static String concat(String s1, String s2) {
        if (s1 == null) {
            return s2;
        }
        if (s2 == null) {
            return s1;
        }
        return s1 + s2;
    }
}