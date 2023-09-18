import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class MultiSet {

    // declare class attributes
    private ArrayList<Integer> list;  // MultiSet implemented using an ArrayList

    // default constructor
    public MultiSet() {
        // create a new empty ArrayList
        this.list = new ArrayList<Integer>();
    }

    public boolean add(Integer item) {
        this.list.add(item);
        return true; // didn't state any case where it should throw F
    }

    public void remove(Integer item) {
        this.list.remove(item);
    }

    public boolean contains(Integer item) {
        return this.list.contains(item);
    }

    public boolean is_empty() {
        return this.list.isEmpty();
    }

    public Integer count(Integer item) {
        return Collections.frequency(this.list, item);
    }

    public Integer size() {
        return this.list.size();
    }

}
