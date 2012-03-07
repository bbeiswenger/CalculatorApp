package threeclasses;

/**
 *
 * @author Barb Beiswenger
 */
public class SimpleCalculator implements GenericCalculator {
    
    private double  numOne,
                    numTwo,
                    total;
    
    public double getNumOne() {
        return numOne;
    }

    public void setNumOne(double numOne) {
        this.numOne = numOne;
    }

    public double getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(double numTwo) {
        this.numTwo = numTwo;
    }
    
    public double getTotal() {
        return total;
    }
    
    public double add(double num1, double num2) {
        this.setNumOne(num1);
        this.setNumTwo(num2);
        total = num1 + num2;
        return total;
    }
    
    public double subtract(double num1, double num2) {
        this.setNumOne(num1);
        this.setNumTwo(num2);
        total = numOne - numTwo;
        return total;
    }
    
    public double multiply(double num1, double num2) {
        this.setNumOne(num1);
        this.setNumTwo(num2);
        total = numOne * numTwo;
        return total;
    }
    
    public double divide(double num1, double num2) {
        this.setNumOne(num1);
        this.setNumTwo(num2);
        total = numOne / numTwo;
        return total;
    }    
}
