package dev.lukmann.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionTest {
    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testRunOnlyOnWindows() {

    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    public void testDisabledOnWindows() {

    }

    @Test
    @EnabledOnJre({JRE.JAVA_11})
    public void testEnabledOnJava11() {

    }


    @Test
    @DisabledOnJre({JRE.JAVA_11})
    public void testDisabledOnJava22() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_22)
    public void testEnabledOnJava11To22() {

    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_22)
    public void testDisabledOnJava11To22() {

    }
}
