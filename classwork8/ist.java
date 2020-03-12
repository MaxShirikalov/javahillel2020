package classwork8;
import java.util.List;
import java.util.Vector;


public class ist {
    public static void main(String[] args) {
        List<String> vector = new Vector<>();
        vector.add("One");
        vector.add("Two");
        vector.add("Three");
        vector.add("Four");
        vector.add("Five");

        vector.size();
        System.out.println(vector.toString());
        vector.remove(1);
        System.out.println(vector.toString());

    }
}
