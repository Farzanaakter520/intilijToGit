package Exam1285729;

import java.util.Scanner;

public class SumInteger1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            int number;

            System.out.println("Enter Integers : ");

            while (true) {
                number = scanner.nextInt();
                if (number < 0) {
                    break;
                }
                sum += number;
            }

            System.out.println("The sum of positive integers is: " + sum);
            scanner.close();
        }
}

