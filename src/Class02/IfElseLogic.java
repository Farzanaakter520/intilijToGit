package Class02;

import java.util.Scanner;

public class IfElseLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int mark = sc.nextInt();
        sc.nextLine();

        if (mark >= 0 && mark <= 100) {
            if (mark > 80 && mark <= 100) {
                System.out.println("You got A+");
                System.out.println();
            } else if (mark >= 70 && mark < 80) {
                System.out.println("You got A-");
            } else if (mark >= 60 && mark < 70) {
                System.out.println("You got A");
            } else {
                System.out.println(" You Failed");
            }
        }
            else {
                System.out.println(" Invalid number");
            }

        }

}
