package Model;

public class StackUsingList<T> extends AbstractStack<T>{

    private AbstractList<T> List;

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
        List.InsertAtStart(value);
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
