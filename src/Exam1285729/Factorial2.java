package Exam1285729;

public class Factorial2 {
    public static void main(String[] args) {
        int number = 5;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The Factorial Value Of " + number + " is: " + factorial);
    }
}
