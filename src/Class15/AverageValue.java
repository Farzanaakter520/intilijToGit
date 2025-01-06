package Class15;

public class AverageValue {
    public static void main(String[] args) {

        int[] array ={20,30,40,50,60,70};

        int sum = 0;
        for (int j : array) {
            sum += j;
        }

        double avg = (double) sum / array.length;

        System.out.println("Average: " + avg);


    }
}
