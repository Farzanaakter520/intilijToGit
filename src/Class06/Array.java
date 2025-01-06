package Class06;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] marks = new int[14];

        marks[0] = 5;
        marks[2] = 5;
        marks[3] = 23;

        String[] names = {"Meme","Bithi","Saima"};

        System.out.println(names[1]);
        System.out.println(names);

        System.out.println(marks[13]);
        for (int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + ", ");
        }

        System.out.println();
        System.out.println("For each");
        System.out.print("[");
        String st = "";
        String v = "";
;
        for (int m : marks){

            st = st + m +", ";
        }
        st = st.substring(0, st.length() - 2);
        System.out.print(st);
        System.out.print("]");

        v=Arrays.toString(marks);
        v = v.substring(1, v.length() - 1);

        System.out.println();
        System.out.print(v);


        System.out.println();
        System.out.println("Print with Arrays class");
        System.out.println(Arrays.toString(marks));
    }
}
