package Model;

public class StackFactory {
    public IStack<Integer> getInstance(String type){
        IStack<Integer> stack = null;
        switch (type){
            case "vector":
                stack = new StackUsingVector<>();
                break;
            case "arraylist":
                stack = new StackUsingArrayList<>();
                break;
            case "doublelinkedlist":
                stack = new StackUsingDoubleLinkedList<>();
                break;
            case "linkedlist":
                stack = new StackUsingLinkedList<>();
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
        return stack;
    }
}
