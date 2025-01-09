package Exam;

import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Midterm Marks");
        double midMarks = sc.nextInt();
        System.out.println("Enter Monthly Exam Marks");
        double monthlyMarks = sc.nextInt();
        double sum =(midMarks * 0.2) + (monthlyMarks * 0.8);
        if( sum >= 30 ){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}
