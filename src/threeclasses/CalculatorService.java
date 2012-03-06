package threeclasses;

/**
 *
 * @author Barb Beiswenger
 */
public class CalculatorService {
    
    Calculator calculator;

    public CalculatorService(Calculator calculator) {
        this.calculator = calculator;
    }
    
    public double getTotal() {
        return calculator.getTotal();
    }
    
    public double add(double num1, double num2) {
        return calculator.add(num1, num2);
    }
    
    public double subtract(double num1, double num2) {
        return calculator.subtract(num1, num2);
    }
    
    public double multiply(double num1, double num2) {
        return calculator.multiply(num1, num2);
    }
    
    public double divide(double num1, double num2) {
        return calculator.divide(num1, num2);
    }
    
    public double getNumOne(){
        return calculator.getNumOne();
    }
    
    public double getNumTwo(){
        return calculator.getNumTwo();
    }

}
    
