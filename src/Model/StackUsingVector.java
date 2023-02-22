package Model;
import java.util.Vector;

/**
 * The type Stack using vector.
 *
 * @param <T> the type parameter
 */
public class StackUsingVector<T> extends AbstractStack<T> {

    private Vector<T> vector;

    /**
     * Instantiates a new Stack using vector.
     */
    public StackUsingVector(){
            vector = new Vector<T>();
    }

    @Override
    public int count() {
        return vector.size();
    }

    @Override
    public boolean isEmpty() {
        return vector.isEmpty();
    }

    @Override
    public void push(T value) {
        vector.add(value);
    }

    @Override
    public T pull() {
        return vector.remove(0);
    }

    @Override
    public T peek() {
        return vector.get(vector.size()-1);
    }
}
