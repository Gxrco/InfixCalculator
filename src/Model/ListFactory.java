package Model;

/**
 * The type List factory.
 *
 * @param <T> the type parameter
 */
public class ListFactory<T> {
    /**
     * Get instance abstract list.
     *
     * @param type the type
     * @return the abstract list
     */
    public AbstractList<T> getInstance(String type){
        AbstractList<T> list = null;
        switch (type){
            case "single":
                list = new SingleLinkedList<>();
                break;
            case "double":
                list = new DoubleLinkedList<>();
                break;
        }
        return list;
    }
}
