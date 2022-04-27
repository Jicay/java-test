import java.util.List;
import java.util.Map;

public class ExerciseRunner {

    public static void main(String[] args) {
        System.out.println(WeddingComplex.createBestCouple(
                Map.of("Naruto", List.of("Sakura", "Hinata"), "Sasuke", List.of("Sakura", "Hinata")),
                Map.of("Sakura", List.of("Sasuke", "Naruto"), "Hinata", List.of("Naruto", "Sasuke"))));
        System.out.println(WeddingComplex.createBestCouple(
                Map.of("X", List.of("B", "A", "C"), "Y", List.of("C", "B", "A"), "Z", List.of("A", "C", "B")),
                Map.of("A", List.of("Y", "X", "Z"), "B", List.of("Z", "Y", "X"), "C", List.of("X", "Z", "Y"))));
    }
}