import java.util.*;

public class SortedSets {
    public static void main(String[] args) {

        SortedSet<Integer> s = new TreeSet<>();

        // insertion
        s.add(30);
        s.add(10);
        s.add(20);

        System.out.println(s);

        // deletion
        s.remove(10);

        System.out.println(s);

        // updation
        s.remove(20);
        s.add(50);

        System.out.println(s);
    }
}