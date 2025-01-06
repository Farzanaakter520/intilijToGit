package Class15;
import java.util.HashSet;

public class DuplicatesValues {
    public static void main(String[] args) {
                int[] arr = {10,20,30,40,20,50,60,70,80,30,80,20};
                findDuplicates(arr);
            }

            public static void findDuplicates(int[] arr) {
                HashSet<Integer> set = new HashSet<>();

                for (int num : arr) {
                    if (set.contains(num)) {
                        System.out.println("Duplicate found: " + num);
                    } else {
                        set.add(num);
                    }
                }
            }
        }



