package View;

import Controller.Calculator;
import Controller.InfixInterpreter;
import Controller.ReadFile;
import Model.AbstractStack;
import Model.StackFactory;

import java.util.Scanner;

public class DriverProgram {
    public static void main(String[] args) {
        //Creacion de recursos necesarios
        String path = "C:\\Users\\thege\\GitAED\\InfixCalculator\\src\\View\\infix.txt";
        Scanner sc = new Scanner(System.in);
        String stackType = selector(sc);
        StackFactory stackFactory = new StackFactory();
        AbstractStack<Integer> stack;
        //Inicia el programa

        stack = stackFactory.getInstance(stackType);
        ReadFile reader = new ReadFile();
        String infix = reader.text(path);
        System.out.println(infix);
        InfixInterpreter machine = new InfixInterpreter();
        String postfix = machine.infixToPostfix(infix);
        System.out.println(postfix);

        Calculator calculator = Calculator.getInstance();
        System.out.println(calculator.mainOperation(postfix, stack));

    }

    public static String selector(Scanner sc){
        System.out.println("¿Que estructura desea utilizar para el Stack?: ");
        System.out.println("-".repeat(40));
        System.out.println("1. Vector\n2. ArrayList\n3. List");
        System.out.println("-".repeat(40));
        String opt = sc.nextLine();
        switch (opt){
            case "1":
                return "vector";
            case "2":
                return "arraylist";
            case "3":
                System.out.println("¿Que tipo de lista desea utilizar?:\n1. SinglyLinkedList\n2. DoublyLinkedList");
                String opt2 = sc.nextLine();
                if(opt2.equals("1")){
                    return "single";
                } else if (opt2.equals("2")) {
                    return "double";
                } else {
                    System.out.println("La opcion seleccionada no existe");
                }
                break;
        }
        return "0";
    }
}
