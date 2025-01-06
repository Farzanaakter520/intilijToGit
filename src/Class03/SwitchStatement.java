package Class03;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month for if else : ");
        int monthForIfElse = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter month for case expression : ");
        int monthForCaseExpression = sc.nextInt();
        sc.nextLine();

        //IF ELSE
        ifElse(monthForIfElse);

        //Case Expression
        caseExpression(monthForCaseExpression);



    }

    private static void ifElse(int monthInNumber) {
        if(monthInNumber == 1){
            System.out.println("JANUARY");
        } else if (monthInNumber == 2) {
            System.out.println("FEBRUARY");
        }else if (monthInNumber == 3) {
            System.out.println("MARCH");
        }else if (monthInNumber == 4) {
            System.out.println("APRIL");
        }else if (monthInNumber == 5) {
            System.out.println("MAY");
        }else if (monthInNumber == 6) {
            System.out.println("JUNE");
        }else if (monthInNumber == 7) {
            System.out.println("JULY");
        }else if (monthInNumber == 8) {
            System.out.println("AUGUST");
        }else if (monthInNumber == 9) {
            System.out.println("SEPTEMBER");
        }else if (monthInNumber == 10) {
            System.out.println("OCTOBER");
        }else if (monthInNumber == 11) {
            System.out.println("NOVEMBER");
        }else if (monthInNumber == 12) {
            System.out.println("DECEMBER");
        }else {
            System.out.println("Please give valid month");
        }
    }

    private static void caseExpression(int monthInNumber) {
        switch (monthInNumber) {
            case 1 -> System.out.println("JANUARY");
            case 2 -> System.out.println("FEBRUARY");
            case 3 -> System.out.println("MARCH");
            case 4 -> System.out.println("APRIL");
            case 5 -> System.out.println("MAY");
            case 6 -> System.out.println("JUNE");
            case 7 -> System.out.println("JULY");
            case 8 -> System.out.println("AUGUST");
            case 9 -> System.out.println("SEPTEMBER");
            case 10 -> System.out.println("OCTOBER");
            case 11 -> System.out.println("NOVEMBER");
            case 12 -> System.out.println("DECEMBER");
            default -> System.out.println("Please give valid month");
        }
    }
}


/*package Class03;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number : ");
        int monthInNumber = sc.nextInt();

        ******if else statement

        if(monthInNumber == 1){
            System.out.println("JANUARY");
        } else if (monthInNumber == 2) {
            System.out.println("FEBRUARY");
        }else if (monthInNumber == 3) {
            System.out.println("MARCH");
        }else if (monthInNumber == 4) {
            System.out.println("APRIL");
        }else if (monthInNumber == 5) {
            System.out.println("MAY");
        }else if (monthInNumber == 6) {
            System.out.println("JUNE");
        }else if (monthInNumber == 7) {
            System.out.println("JULY");
        }else if (monthInNumber == 8) {
            System.out.println("AUGUST");
        }else if (monthInNumber == 9) {
            System.out.println("SEPTEMBER");
        }else if (monthInNumber == 10) {
            System.out.println("OCTOBER");
        }else if (monthInNumber == 11) {
            System.out.println("NOVEMBER");
        }else if (monthInNumber == 12) {
            System.out.println("DECEMBER");
        }else {
            System.out.println("Please give valid month");
        }


    }
}*/
