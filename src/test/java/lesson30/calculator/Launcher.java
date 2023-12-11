package lesson30.calculator;

public class Launcher {
    public static void main(String[] args) {
        /*
        IOperation additional = new IOperation() {
            @Override
            public double operation(double value1, double value2) {
                return value1 + value2;
            }
        };
         */

        IOperation additional = Double::sum;
        //IOperation additional = (value1, value2) -> value1 + value2;


        Calculator calculator = new Calculator(additional);
        double additionalResult = calculator.performOperation(2, 2);
        System.out.println("Additing result = " + additionalResult);

        IOperation subtraction = (value1, value2) -> value1 - value2;
        calculator.setiOpration(subtraction);
        double subtractionResult = calculator.performOperation(10, 4);
        System.out.println("Subtraction result = " + subtractionResult);

    }
}
