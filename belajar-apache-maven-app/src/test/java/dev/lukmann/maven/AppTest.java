package dev.lukmann.maven;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldReturnsName() {
        Person person = new Person("Lukman");

        assertTrue(person.getName().equals("Lukman"));
    }
}
