package threeclasses;

/**
 *
 * @author Barb Beiswenger
 */
public class CalculatorService implements GenericCalculator {
    
    private GenericCalculator calculator;

    public CalculatorService(GenericCalculator calculator) {
        this.calculator = calculator;
    }
    
    @Override
    public double getTotal() {
        return calculator.getTotal();
    }
    
    @Override
    public double add(double num1, double num2) {
        return calculator.add(num1, num2);
    }
    
    @Override
    public double subtract(double num1, double num2) {
        return calculator.subtract(num1, num2);
    }
    
    @Override
    public double multiply(double num1, double num2) {
        return calculator.multiply(num1, num2);
    }
    
    @Override
    public double divide(double num1, double num2) {
        return calculator.divide(num1, num2);
    }
    
    @Override
    public double getNumOne(){
        return calculator.getNumOne();
    }
    
    @Override
    public double getNumTwo(){
        return calculator.getNumTwo();
    }

}
    
