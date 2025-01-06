package Class05;

public class MultiplicationTable176 {
    public static void main(String[] args) {
        System.out.println("        Multiplication Table");

        System.out.print("    ");

        for (int k=1; k<=6; k++)
            System.out.print("   " + k);

        System.out.println("\n------------------------------");

            for(int i = 1; i<=6; i++){
                System.out.print(i + " | ");

                for(int k=1; k<=6; k++){
                    System.out.printf("%4d", i*k);
                }
                System.out.println();
            }
    }
}
