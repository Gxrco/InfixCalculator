package Unit_Test;

import Controller.Calculator;
import Model.StackUsingVector;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Calculator test.
 */
public class CalculatorTest {
    /**
     * The Calculator.
     */
    Calculator calculator = Calculator.getInstance();
    /**
     * The Stack.
     */
    StackUsingVector<Integer> stack = new StackUsingVector<>();

    /**
     * Calculator test.
     */
    @Test
    public void calculatorTest(){
        assertEquals(18, calculator.mainOperation("32+3*", stack));
    }
}