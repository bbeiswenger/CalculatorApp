package threeclasses;

/**
 * Branch 1 - Final working solution
 * 
 * @author Barb Beiswenger
 */
public class CalculatorDemo {

    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();
                 
        calculator.add(8, 4);
        System.out.println("Add: " + calculator.getNumOne() 
                + " + " + calculator.getNumTwo() + " = " + calculator.getTotal());
         
        calculator.subtract(20, 10);
        System.out.println("Subtract: " + calculator.getNumOne() 
                + " - " + calculator.getNumTwo() + " = " + calculator.getTotal());
        
        calculator.multiply(13, 3);
        System.out.println("Multiply: " + calculator.getNumOne() 
                + " * " + calculator.getNumTwo() + " = " + calculator.getTotal());

        calculator.divide(25, 10);                
        System.out.println("Divide: " + calculator.getNumOne() 
                + " / " + calculator.getNumTwo() + " = " + calculator.getTotal());
    }
}
