package Model;

public class StackFactory {
    public AbstractStack<Integer> getInstance(String type){
        AbstractStack<Integer> stack = null;
        switch (type){
            case "vector":
                stack = new StackUsingVector<>();
                break;
            case "arraylist":
                stack = new StackUsingArrayList<>();
                break;
            case "single":
                stack = new StackUsingList<>(type);
                break;
            case "double":
                stack = new StackUsingList<>(type);
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
        return stack;
    }
}
