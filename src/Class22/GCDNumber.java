package Class22;

public class GCDNumber {
    public static void main(String[] args) {

        int num1 = 78;
        int num2 = 57;

        System.out.println("GCD Of " + num1 + " and " + num2 + " is : " + GCD.gcd(num1, num2));
    }

    public static class GCD {
        public static int gcd(int a, int b){
            if(b == 0){
                return a;
            }
            return gcd(b, a % b);
        }
    }
}
