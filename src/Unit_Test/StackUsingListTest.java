package Unit_Test;

import Model.StackUsingList;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Stack using list test.
 */
public class StackUsingListTest {
    /**
     * The Stack.
     */
    StackUsingList<Integer> stack = new StackUsingList<>("single");

    /**
     * Test for list
     */
    @Test
    public void ListTest(){
        stack.push(1);
        stack.push(2);
        assertEquals(1,stack.peek());
    }
}