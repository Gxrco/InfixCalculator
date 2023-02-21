package View;

import Model.IStack;
import Model.StackFactory;

import java.util.Scanner;

public class DriverProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stackType = selector(sc);
        StackFactory stackFactory = new StackFactory();
        IStack<Integer> stack;
        stack = stackFactory.getInstance(stackType);


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
                    return "linkedlist";
                } else if (opt2.equals("2")) {
                    return "doublelinkedlist";
                } else {
                    System.out.println("La opcion seleccionada no existe");
                }
                break;
        }
        return "0";
    }
}
