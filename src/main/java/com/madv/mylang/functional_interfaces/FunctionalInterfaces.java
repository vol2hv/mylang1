package com.madv.mylang.functional_interfaces;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import static java.lang.StrictMath.sqrt;
import static org.junit.Assert.*;

@FunctionalInterface
interface Formula {
    double calculate(double a);

    default double sqrt(double a) {
        return Math.sqrt(a);
    }
}

public class FunctionalInterfaces {
    @Test
//    мой функциональный интерфейс
    public void calculatorTest () {
        Formula f = x -> sqrt(x +100);
        assertEquals("", 25.0, f.calculate(525.0), 0.0);
        assertEquals("", 7.0, f.sqrt(49.0), 0.0);
    }
// =========== Системные функциональняе интерфейсы ==============================
    @Test
    public void predicateTest() {
        Predicate<Integer> isPositive = x -> x > 0;
        assertTrue(isPositive.test(5));
        assertFalse(isPositive.test(-13));
    }

    @Test
    public void binaryOperatorTest() {
        BinaryOperator<String> multiply = (x, y) -> x+y;
        assertEquals  ("12",  multiply.apply("1", "2"));;
    }
    @Test
    public void functionTest() {
        Function<Integer, String> convert = x-> String.valueOf(x) + " $";
        assertEquals  ("5 $",  convert.apply(5));
    }
    @Test
    public void consumerTest() {
        Consumer<Integer> consumer = x-> {int y = x*x;};
        assertTrue("Что взять с черной дыры", true);
    }
    @Test
    public void  supplierTest() {
        Supplier<List<Integer>> supplier =
                () -> Arrays.asList(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5);
        List<Integer> list = supplier.get();
        assertEquals  (11, list.size());
        int i = list.get(5);
        assertEquals( 0, i);

    }

}
