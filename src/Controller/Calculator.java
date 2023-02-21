package Controller;

import Model.IStack;
import Model.PostfixCalculator;

import java.util.ArrayList;

public class Calculator {

    private static boolean instance_flag = false;
    private static Calculator _uniqueCalculator;

    private Calculator(){
        instance_flag = true;
    }

    public static Calculator getInstance(){
        if (!instance_flag) {
            _uniqueCalculator = new Calculator();
        }
        return _uniqueCalculator;
    }

    PostfixCalculator pc = new PostfixCalculator();

    public void getValue(String operator, int A, int B, IStack<Integer> stack){
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


    public int mainOperation(String postfix, IStack<Integer> stack){
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