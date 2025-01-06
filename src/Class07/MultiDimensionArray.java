package Class07;

import java.util.Arrays;

public class MultiDimensionArray {

        public static void main(String[] args) {
            int[] primeNumber = {2,3,5,7,11,13,47,53,59,61,17,19,23,29,31,37,41,43,67,71,73,79,83,89,97};

            //System.out.println(Arrays.toString(primeNumber));

            Arrays.sort(primeNumber);
            int[] copyOfPrimeNumber = Arrays.copyOf(primeNumber, primeNumber.length);

            Integer[] test = new Integer[primeNumber.length];

            for (int i = 0; i< primeNumber.length; i++){
                test[i] = primeNumber[i];
            }

            //Arrays.sort(test, Collection.reverseOrder());
            System.out.println(Arrays.toString(primeNumber));

            int[][] axis = new int [3][2];
            axis [0][0] =1;
            axis [0][1] =2;

            axis [1][0] =17;
            axis [1][1] =12;

            axis [2][0] =33;
            axis [2][1] =22;

            int [][] matrix = {
                    {2541,122,4571,22},
                    {45452,112,144,447},
                    {2533,5554,8745}
        };
            System.out.println(Arrays.deepToString(matrix));
    }

}
