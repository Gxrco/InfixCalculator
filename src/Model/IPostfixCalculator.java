package Model;

/**
 * The interface Postfix calculator.
 */
public interface IPostfixCalculator {
    /**
     * Is one item boolean.
     *
     * @param operandos the operandos
     * @return the boolean
     */
    boolean isOneItem(IStack operandos);

    /**
     * Suma int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    int suma(int a, int b);

    /**
     * Resta int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    int resta(int a, int b);

    /**
     * Multiplicacion int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    int multiplicacion(int a, int b);

    /**
     * Division int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    int division(int a, int b);

    /**
     * Is operator boolean.
     *
     * @param item the item
     * @return the boolean
     */
    boolean isOperator(String item);

    /**
     * Gets items.
     *
     * @param _expresion the expresion
     * @return the items
     */
    java.util.ArrayList<String> getItems(String _expresion);
}
