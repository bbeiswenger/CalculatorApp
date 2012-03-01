package threeclasses;

/**
 *
 * @author Barb Beiswenger
 */
public class Calculator {
    
    private double  numOne,
                    numTwo;

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
    
    public double add(double numOne, double numTwo) {
        return numOne + numTwo;
    }
    
    public double subtract(double numOne, double numTwo) {
        return numOne - numTwo;
    }
    
    public double multiply(double numOne, double numTwo) {
        return numOne * numTwo;
    }
    
    public double divide(double numOne, double numTwo) {
        return numOne / numTwo;
    }    
}
