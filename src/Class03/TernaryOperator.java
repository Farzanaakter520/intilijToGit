package Class03;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne = sc.nextInt();
        sc.nextLine();
        int numberTwo = sc.nextInt();
        sc.nextLine();
        int max;

        System.out.println("First num: " + numberOne);
        System.out.println("Second num: " + numberTwo);

        max = (numberOne > numberTwo) ? numberOne : numberTwo;

        System.out.println("Maximum num is = " + max);
    }
}
