package Class04;

/*public class LoopPlus {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i<=1000; i+=2){
            result = result + i;
        }
        System.out.println("Total sum is " + result);
    }
}*/


public class LoopPlus {
    public static void main(String[] args) {
        int result = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0)
                result += i;
            }
            System.out.println( result);
        }
    }


/*public class LoopPlus {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                //System.out.println(i);
                result += i;
        }
        System.out.println( result);
    }
}*/

