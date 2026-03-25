import java.util.*;

public class Maps {
    public static void main(String[] args) {

        Map<Integer,String> m = new HashMap<>();

        // insertion
        m.put(1,"A");
        m.put(2,"B");
        m.put(3,"C");

        System.out.println(m);

        // deletion
        m.remove(2);

        System.out.println(m);

        // updation
        m.put(1,"Z");

        System.out.println(m);
    }
}