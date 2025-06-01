
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author： hmly
 * @date： 2025/5/23
 * @description：
 * @modifiedBy：
 * @version: 1.0
 */
public class A {
    /**
     * Main method to demonstrate the use of HashMap.
     */
    public static void main(String[] args) {
        System.out.println("...A.main()");
        Map<String,String> map = new HashMap<>();
        Map<String, String> d3 = map;
        d3.put("1", "1");

        // Attempting to retrieve a value using a key that does not exist in the map
        String value = d3.get("2");
        if (value == null) {
            System.out.println("Key '2' does not exist in the map.");
        } else {
            System.out.println("Value for key '2': " + value);
        }
    }
}
