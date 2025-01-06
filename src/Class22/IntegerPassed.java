package Class22;

import java.util.Scanner;

public class IntegerPassed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");

        int num = sc.nextInt();
        int nextNumber = nextNumber(num);
        System.out.println("The Next Number is : " + nextNumber);
    }

    public static int nextNumber(int num) {
        return num + 1;
    }
}

