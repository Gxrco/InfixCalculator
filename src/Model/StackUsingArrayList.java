package Model;

import java.util.ArrayList;

/**
 * The type Stack using array list.
 *
 * @param <T> the type parameter
 */
public class StackUsingArrayList<T> extends AbstractStack<T>{

    private ArrayList<T> miListaInterna;

    /**
     * Instantiates a new Stack using array list.
     */
    public StackUsingArrayList() {
        miListaInterna = new ArrayList<T>();
    }

    @Override
    public int count() {
        return miListaInterna.size();
    }

    @Override
    public boolean isEmpty() {
        return miListaInterna.isEmpty();
    }

    @Override
    public void push(T value) {
        miListaInterna.add(value);
    }

    @Override
    public T pull() {
        return miListaInterna.remove(0);
    }

    @Override
    public T peek() {
        return miListaInterna.get(0);
    }

}
