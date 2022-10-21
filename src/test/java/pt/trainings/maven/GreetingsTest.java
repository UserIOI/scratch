package pt.trainings.maven;
import static org.junit.Assert.*;
import org.junit.Test;

public class GreetingsTest {
    private static final String DEFAULT_NAME = "Jonh Doe";
    private static final String GREETINGS_MESSAGE = "Hello ";
    @Test
    public void testNullNameShouldPrintDefaultName() {
    Greetings objectUnderTest = new Greetings();
    String expectedString = GREETINGS_MESSAGE+DEFAULT_NAME;
    assertEquals(expectedString, objectUnderTest.sayHello(null));
    }
    @Test
    public void testShouldPrintCorrectGreeting() {
    Greetings objectUnderTest = new Greetings();
    String expectedString = GREETINGS_MESSAGE+"Bob";
    assertEquals(expectedString, objectUnderTest.sayHello("Bob"));
    }
}