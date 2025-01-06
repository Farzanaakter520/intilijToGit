package Class21;

import java.util.LinkedList;
import java.util.ListIterator;

public class IterateReverseOrder {
    public static void main(String[] args) {
        LinkedList<String> List = new LinkedList<>();

        List.add("A");
        List.add("B");
        List.add("C");
        List.add("D");
        List.add("E");

        ListIterator<String> iterator = List.listIterator(List.size());

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

    }
}
