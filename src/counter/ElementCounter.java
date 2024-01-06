package counter;

import java.util.HashMap;
import java.util.Map;

public class ElementCounter {

    public Map<Integer, Integer> counterElementListToMap(int[] elements) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int element : elements) {
            result.merge(element, 1, Integer::sum);
        }
        return result;
    }
}


