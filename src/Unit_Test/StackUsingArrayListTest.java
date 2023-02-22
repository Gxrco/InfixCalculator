package Unit_Test;

import Model.StackUsingArrayList;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Stack using array list test.
 */
public class StackUsingArrayListTest {
    /**
     * The Stack.
     */
    StackUsingArrayList<Integer> stack = new StackUsingArrayList<>();

    /**
     * Stack test.
     */
    @Test
    public void stackTest(){
        stack.push(1);
        stack.push(2);
        stack.push(4);
        assertEquals(3, stack.count());
    }
}