public class Operators {
    public static void main(String[] args) {
        // Arithmetic operators
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational operators
        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is a not equal to b? " + (a != b));
        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Is a less than b? " + (a < b));
        System.out.println("Is a greater than or equal to b? " + (a >= b));
        System.out.println("Is a less than or equal to b? " + (a <= b));

        // Logical operators
        boolean condition1 = true;
        boolean condition2 = false;
        System.out.println("Logical AND: " + (condition1 && condition2));
        System.out.println("Logical OR: " + (condition1 || condition2));
        System.out.println("Logical NOT: " + (!condition1));

    }
}