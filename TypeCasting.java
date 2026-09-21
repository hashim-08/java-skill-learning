public class TypeCasting {
    public static void main(String[] args) {
        // Implicit type casting (widening)
        int num1 = 10;
        double num2 = num1; // int to double
        System.out.println("Implicit type casting: " + num2);

        // Explicit type casting (narrowing)
        double num3 = 20.5;
        int num4 = (int) num3; // double to int
        System.out.println("Explicit type casting: " + num4);

        // Type casting with arithmetic operations
        int a = 5;
        int b = 2;
        double result = (double) a / b; // int to double
        System.out.println("Result of division with type casting: " + result);

    }
}
