package Class21;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {41, 5, 71, 9, 11, 15, 20};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }
}
