package dev.lukmann.test;

import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@DisplayNameGeneration(value = DisplayNameGenerator.IndicativeSentences.class)
public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }

    @BeforeEach
    public void setUp() {
        assumeTrue("DEV".equals(System.getenv("STAGE")), "Test dibatalkan karena bukan di stage development");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After Each is running");
    }

    @Test
    public void testAddSuccess() {
        var result = calculator.add(10, 10);

        assertEquals(20, result);
    }

    @Test
    public void testDivideSuccess() {
        var result = calculator.divide(100, 10);
        assertEquals(10, result);
    }

    @Test
    public void testDivideFailed() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(0, 0));
    }
}
