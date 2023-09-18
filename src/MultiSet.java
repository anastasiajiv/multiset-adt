import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class MultiSet {

    // declare class attributes
    private ArrayList<Integer> list;  // MultiSet implemented using an ArrayList

    // default constructor
    public MultiSet() {
        // create a new empty ArrayList
        self.list = new ArrayList<Integer>();
    }

    public static boolean add(Integer item) {
        self.list.add(item);
        return True; // didn't state any case where it should throw F
    }

    public static void remove(Integer item) {
        return self.list.remove(item);  // if successfully removed, return T
    }

    public static boolean contains(Integer item) {
        return self.list.contains(item);
    }

    public static boolean is_empty() {
        return self.list.is_empty();
    }

    public static Integer count(Integer item) {
        return Collections.frequency(self.list, item);
    }

    public static Integer size() {
        return self.list.size();
    }

}
