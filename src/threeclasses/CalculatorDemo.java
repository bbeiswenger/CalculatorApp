package threeclasses;

/**
 * Branch 1
 * @author Barb Beiswenger
 */
public class CalculatorDemo {

    public static void main(String[] args) {
        
        Calculator calculator = new Calculator();
        
        double numOne;
        double numTwo;
        
        calculator.add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + calculator.getTotal());
         
        calculator.subtract(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + calculator.getTotal());
        
        calculator.multiply(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + calculator.getTotal());

        calculator.divide(num1, num2);                
        System.out.println(num1 + " / " + num2 + " = " + calculator.getTotal());
    }
}
