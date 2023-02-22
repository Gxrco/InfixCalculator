package Model;

/**
 * The type Node.
 *
 * @param <T> the type parameter
 */
public class Node<T> {
    private T value;
    private Node<T> next;

    /**
     * Instantiates a new Node.
     *
     * @param value the value
     */
    public Node(T value) {
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
    public Node<T> getNext() {
        return next;
    }

    /**
     * Sets next.
     *
     * @param next the next to set
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }


}
