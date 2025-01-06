package Class04;

public class Loop {
    public static void main(String[] args) {
        for (int i=1; i>0; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("Omar Faruk " + i);
            System.out.println(i);

            if (i == 10) {
                break;
            }
        }
    }
}
