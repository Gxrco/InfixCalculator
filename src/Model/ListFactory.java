package Model;

public class ListFactory<T> {
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
