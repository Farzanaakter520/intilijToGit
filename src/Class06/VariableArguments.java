package Class06;

public class VariableArguments {
    public static void main(String[] args) {
        int number = biggestNumber(245,654,124);
        System.out.println(number);

        int biggestNumber = biggestNumber(745,254,924);
        System.out.println(number);
    }

    public static int biggestNumber(int n1, int n2, int n3){
        return Math.max(Math.max(n1,n2),n3);
    }

    /*public static int biggestNumber(int... numbers){
        if(numbers.length == 0){
            return 0;
        }
        int max = numbers[0];
        for (int num : numbers){
            if (num > max){
                max : num;
            }
        }
        return max;
    }*/
}
