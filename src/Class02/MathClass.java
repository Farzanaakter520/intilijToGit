package Class02;

public class MathClass {
    public static void main(String[] args) {
        int abs = Math.abs(-98);

        System.out.println(abs);

        double power = Math.pow(3,5);
        System.out.println(power);

        double ceil = Math.ceil(123.543);
        System.out.println(ceil);

        double floor = Math.floor(1245.7645);
        System.out.println(floor);

        long round = Math.round(65345.5456);
        System.out.println(round);

        double random = Math.random();
        System.out.println(random);

        int castedInd = (int) (random * 100);
        System.out.println(castedInd);

        

    }
}
