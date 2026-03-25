import java.util.*;

public class Sets {
    public static void main(String[] args) {

        Set<String> s = new HashSet<>();

        // insertion
        s.add("A");
        s.add("B");
        s.add("C");

        System.out.println(s);

        // deletion
        s.remove("B");

        System.out.println(s);

        // updation
        s.remove("A");
        s.add("D");

        System.out.println(s);
    }
}