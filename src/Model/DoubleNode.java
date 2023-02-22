package Model;

/**
 * The type Double node.
 *
 * @param <T> the type parameter
 */
public class DoubleNode<T> {
    private T value;
    private DoubleNode<T> next;
    private DoubleNode<T> previous;

    /**
     * Instantiates a new Double node.
     *
     * @param value the value
     */
    public DoubleNode(T value) {
        this.setValue(value);
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public T getValue() {
        return value;
    }

    /**
     * Sets value.
     *
     * @param value the value to set
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Gets next.
     *
     * @return the next
     */
    public DoubleNode<T> getNext() {
        return next;
    }

    /**
     * Sets next.
     *
     * @param next the next to set
     */
    public void setNext(DoubleNode<T> next) {
        this.next = next;
    }

    /**
     * Gets previous.
     *
     * @return the previous
     */
    public DoubleNode<T> getPrevious() {
        return previous;
    }

    /**
     * Sets previous.
     *
     * @param previous the previous to set
     */
    public void setPrevious(DoubleNode<T> previous) {
        this.previous = previous;
    }


}
