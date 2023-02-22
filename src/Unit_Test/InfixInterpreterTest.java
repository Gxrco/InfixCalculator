package Unit_Test;

import Controller.InfixInterpreter;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Infix interpreter test.
 */
public class InfixInterpreterTest {
    /**
     * The Infix.
     */
    InfixInterpreter infix = new InfixInterpreter();

    /**
     * Infix test.
     */
    @Test
    public void infixTest(){
        assertEquals("255+66+", infix.infixToPostfix("2+((5+5)6)6)"));
    }

}