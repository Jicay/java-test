public class ExerciseRunner {
    public static void main(String[] args) {
        System.out.println("Add");
        System.out.println(IntOperation.addTwoIntegers(1, 2));
        System.out.println(IntOperation.addTwoIntegers(15, 68));

        System.out.println("Subtract");
        System.out.println(IntOperation.subtractTwoIntegers(4, 1));
        System.out.println(IntOperation.subtractTwoIntegers(10, 23));

        System.out.println("Multiply");
        System.out.println(IntOperation.multiplyTwoIntegers(3, 6));
        System.out.println(IntOperation.multiplyTwoIntegers(12, 11));

        System.out.println("Divide");
        System.out.println(IntOperation.divideTwoIntegers(8, 2));
        System.out.println(IntOperation.divideTwoIntegers(13, 4));
    }
}