package OOP_7;

import java.util.Scanner;


public class ViewCalculator {
    private ComplexCalculator calculator;

    public ViewCalculator(ComplexCalculatorFactory calculatorFactory) {
        this.calculator = calculatorFactory.createCalculator();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        // Read input from the user and perform calculator operations

        scanner.close();
    }
}
