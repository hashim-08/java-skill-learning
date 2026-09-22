import java.util.*;
public class Main{
    public static void main(String[] args) {
        String name = "Hashim";
        int age;
        double gpa;
        boolean isEnrolled;
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        System.out.println("Enter your gpa: ");
        gpa = sc.nextDouble();
        System.out.println("Are you enrolled? (true/false): ");
        isEnrolled = sc.nextBoolean();
        System.out.println("Enter your marks: ");
        for(int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();

        System.out.println("Hello " + name + ", your age is " + age + ", your gpa is " + gpa + ", you are enrolled: " + isEnrolled);
    }
}   }