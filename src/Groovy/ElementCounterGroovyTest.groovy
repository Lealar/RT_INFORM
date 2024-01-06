package Groovy

import org.junit.jupiter.api.Test


class ElementCounterGroovyTest{
    @Test
    void testInvokeMethod() {
        def elements = [1,3,4,5,1,5,4]
        def result = ElementCounterGroovy.counterElementListToMap(elements)
        def expected = [1 : 2, 3 : 1, 4 : 2, 5 : 2]
        assert expected == result
    }
}
