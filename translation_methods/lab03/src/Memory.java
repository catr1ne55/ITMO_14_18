import java.util.HashMap;

/**
 * Created by vladimir on 01.06.17.
 */
public class Memory {

    private HashMap<String, Integer> map;

    public Memory() {
        map = new HashMap<>();
    }

    public int get(String id) {
        return map.get(id);
    }

    public void set(String id, int value) {
        map.put(id, value);
    }

    public boolean lookup(String id) {
        return map.containsKey(id);
    }
}
