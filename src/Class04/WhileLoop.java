package Class04;

public class WhileLoop {
    public static void main(String[] args) {
        int result = 0;
        int i = 0;

        while (i <= 100) {
            System.out.println(i);

            result +=i;

            i++;
        }
        System.out.println(result);
    }
}
