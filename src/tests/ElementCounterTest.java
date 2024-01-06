package tests;

import Java.counter.ElementCounter;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


class ElementCounterTest {

    @Test
    void counterElementListToMap() {
        ElementCounter elementCounter = new ElementCounter();
        int[] elements = {1, 3, 4, 5, 1, 5, 4};
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put(1,2);
        expected.put(3,1);
        expected.put(4,2);
        expected.put(5,2);
        Map<Integer, Integer> resultMap = elementCounter.counterElementListToMap(elements);
        Assert.assertEquals(expected, resultMap);
    }


}