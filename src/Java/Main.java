package Java;

import Java.counter.ElementCounter;

public class Main {
    public static void main(String[] args) {
        int[] elements = {1, 3, 4, 5, 1, 5, 4};
        ElementCounter elementCounter = new ElementCounter();
        System.out.println(elementCounter.counterElementListToMap(elements));
    }
}
