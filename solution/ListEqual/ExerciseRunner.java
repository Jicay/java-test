import java.util.List;

public class ExerciseRunner {
    public static void main(String[] args) {
        System.out.println(ListEqual.areListEquals(List.of("Alice", "Bob", "Charly", "Emily"), List.of("Alice", "Bob", "Charly", "Emily")));
        System.out.println(ListEqual.areListEquals(List.of("Alice", "Bob", "Charly", "Emily"), List.of("Alice", "Bob", "Emily", "Charly")));
    }
}