package logic;

import java.util.ArrayList;

import interfaces.ArithmeticOperation;


public class Printer {

    public void print(ArrayList<ArithmeticOperation> operations) {
        for (ArithmeticOperation operation : operations) {
            System.out.println(operation.performOperation());
        }
    }
}
