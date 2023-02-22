package Controller;

import Model.AbstractStack;
import Model.IStack;
import Model.PostfixCalculator;

import java.util.ArrayList;

/**
 * The type Calculator.
 */
public class Calculator {

    private static boolean instance_flag = false;
    private static Calculator _uniqueCalculator;

    private Calculator(){
        instance_flag = true;
    }

    /**
     * Get instance calculator.
     *
     * @return the calculator
     */
    public static Calculator getInstance(){
        if (!instance_flag) {
            _uniqueCalculator = new Calculator();
        }
        return _uniqueCalculator;
    }

    /**
     * The Pc.
     */
    PostfixCalculator pc = new PostfixCalculator();

    /**
     * Get value.
     *
     * @param operator the operator
     * @param A        the a
     * @param B        the b
     * @param stack    the stack
     */
    public void getValue(String operator, int A, int B, AbstractStack<Integer> stack){
        switch(operator){
            case "+":
                stack.push(pc.suma(A, B));
                break;

            case "-":
                stack.push(pc.resta(A, B));
                break;

            case "*":
                stack.push(pc.multiplicacion(A, B));
                break;

            case "/":
                stack.push(pc.division(A, B));
                break;
        }
    }


    /**
     * Main operation int.
     *
     * @param postfix the postfix
     * @param stack   the stack
     * @return the int
     */
    public int mainOperation(String postfix, AbstractStack<Integer> stack){
        ArrayList<String> data = pc.getItems(postfix);
        for (String datum : data) {
            if (!pc.isOperator(datum)) {
                stack.push(Integer.valueOf(datum));
            }
        }


        for (String datum : data) {
            if (pc.isOperator(datum)) {
                int A = stack.pull();
                int B = stack.pull();
                getValue(datum, A, B, stack);
            }
        }
        return stack.pull();
    }

}
//Decription: Algoritmo de calculadora para hoja de trabajo 2
//Author: Grupo 4 de Algoritmos y Estructuras de datos
//Date: S.F
//URL: https://github.com/Gxrco/CalculatorPostFix/blob/master/src/Controller/Calculator.java