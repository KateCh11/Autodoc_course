package lesson30.calculator;

public class Calculator {

    private IOperation iOpration;

    public Calculator(IOperation iOpration) {
        this.iOpration = iOpration;
    }

    public void setiOpration(IOperation iOpration) {
        this.iOpration = iOpration;
    }

    public double performOperation(double value1, double value2){
        return iOpration.operation(value1, value2);
    }
}
