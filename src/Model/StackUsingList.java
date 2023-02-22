package Model;

/**
 * The type Stack using list.
 *
 * @param <T> the type parameter
 */
public class StackUsingList<T> extends AbstractStack<T>{

    private AbstractList<T> List;

    /**
     * Instantiates a new Stack using list.
     *
     * @param type the type
     */
    public StackUsingList(String type) {
        ListFactory<T> factory = new ListFactory<>();
        List = factory.getInstance(type);
    }

    @Override
    public int count() {
        return List.Count();
    }

    @Override
    public boolean isEmpty() {
        return List.IsEmpty();
    }

    @Override
    public void push(T value) {
        List.InsertAtEnd(value);
    }

    @Override
    public T pull() {
        return List.DeleteAtStart();
    }

    @Override
    public T peek() {
        return List.Get(0);
    }

}
