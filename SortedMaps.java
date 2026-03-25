import java.util.*;

public class SortedMaps {
    public static void main(String[] args) {

        SortedMap<Integer,String> m = new TreeMap<>();

        // insertion
        m.put(3,"C");
        m.put(1,"A");
        m.put(2,"B");

        System.out.println(m);

        // deletion
        m.remove(1);

        System.out.println(m);

        // update
        m.put(2,"Z");

        System.out.println(m);
    }
}