package Class03;

import java.util.Scanner;

public class Page01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        sc.nextLine();

        if(year % 4 == 0 ){
            System.out.println(" is leap year " + year);
        }else{
            System.out.println("is not leap year " + year);
        }

    }
}
