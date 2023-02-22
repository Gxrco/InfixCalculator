package Model;

import java.util.ArrayList;
import java.util.Arrays;

public class PostfixCalculator implements IPostfixCalculator{

    /**
     * Cuenta cuantos elementos hay en el Stack
     * @param operandos
     * @return
     */
    @Override
    public boolean isOneItem(IStack operandos) {
        return operandos.count() == 1;
    }

    /**
     *  suma dos numeros
     * @param a
     * @param b
     * @return
     */
    @Override
    public int suma(int a, int b) {
        return a+b;
    }

    /**
     * resta dos numeros
     * @param a
     * @param b
     * @return
     */
    @Override
    public int resta(int a, int b) {
        return a-b;
    }

    /**
     * multiplica dos numeros
     * @param a
     * @param b
     * @return
     */
    @Override
    public int multiplicacion(int a, int b) {
        return a*b;
    }

    /**
     * divide dos numeros
     * @param a
     * @param b
     * @return
     */
    @Override
    public int division(int a, int b) {
        return a/b;
    }

    /**
     * Realiza Una verificacion de si es un numero o un operando
     * @param item
     * @return
     */
    @Override
    public boolean isOperator(String item) {
        return item.equals("+") || item.equals("-") || item.equals("/") || item.equals("*");
    }

    /**
     * Separa el string en un arraylist
     * @param _expresion
     * @return
     */
    @Override
    public ArrayList<String> getItems(String _expresion) {
        String[] splitInput = _expresion.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(splitInput));
        return list;
    }
}