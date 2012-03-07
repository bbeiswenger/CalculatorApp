package threeclasses;

/**
 * Branch 1 - Final working solution
 * 
 * @author Barb Beiswenger
 */
public class CalculatorDemo {

    public static void main(String[] args) {
        
        GenericCalculator calculator = new SimpleCalculator();
        
        CalculatorService cs = new CalculatorService(calculator);
                 
        cs.add(8, 4);
        System.out.println("Add: " + cs.getNumOne() 
                + " + " + cs.getNumTwo() + " = " + cs.getTotal());
         
        cs.subtract(20, 10);
        System.out.println("Subtract: " + cs.getNumOne() 
                + " - " + cs.getNumTwo() + " = " + cs.getTotal());
        
        cs.multiply(13, 3);
        System.out.println("Multiply: " + cs.getNumOne() 
                + " * " + cs.getNumTwo() + " = " + cs.getTotal());

        cs.divide(25, 10);                
        System.out.println("Divide: " + cs.getNumOne() 
                + " / " + cs.getNumTwo() + " = " + cs.getTotal());
    }
}
