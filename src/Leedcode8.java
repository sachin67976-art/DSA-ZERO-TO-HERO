
import java.util.*;

public class Leedcode8{
    public static void main(String[] args) {

        String[] strs = {
                "eat", "tea", "tan", "ate", "nat", "bat"
        };

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);
        }

        System.out.println(new ArrayList<>(map.values()));
    }
}
