package Model;

/**
 * The interface List.
 *
 * @param <T> the type parameter
 */
public interface IList<T> {

    /**
     * Insert at start.
     *
     * @param value the value
     */
    void InsertAtStart(T value);

    /**
     * Insert at end.
     *
     * @param value the value
     */
    void InsertAtEnd(T value);

    /**
     * Insert.
     *
     * @param value the value
     * @param index the index
     */
    void Insert(T value, int index);

    /**
     * Delete t.
     *
     * @param index the index
     * @return the t
     */
    T Delete(int index);

    /**
     * Delete at start t.
     *
     * @return the t
     */
    T DeleteAtStart();

    /**
     * Delete at end t.
     *
     * @return the t
     */
    T DeleteAtEnd();

    /**
     * Get t.
     *
     * @param index the index
     * @return the t
     */
    T Get(int index);

    /**
     * Is empty boolean.
     *
     * @return the boolean
     */
    boolean IsEmpty();

    /**
     * Count int.
     *
     * @return the int
     */
    int Count();
}
