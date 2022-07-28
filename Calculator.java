
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    double num1;
    double num2;
    String operator;
    
    public Calculator(double num1, String operator, double num2){
        this.num1 = 0;
        this.operator = " ";
        this.num2 = 0;
    }
    public double addition(){
        return this.num1 + this.num2;
    }
    public double subtraction(){
        return this.num1 + this.num2;
    }
    public double multiplication(){
        return this.num1 + this.num2;
    }
    public double division(){
        return this.num1 + this.num2;
    }
    
    public void calculate(){
        Scanner scan = new Scanner(System.in);
        System.out.println("input a number.");
        this.num1 = scan.nextDouble();
        System.out.println("Input another number");
        this.num2 = scan.nextDouble();
        System.out.println("Input an operator");
        this.opearator = scan.nextline();
        
        if(operator.equals("+")){
            return this.addition();
        }
        else if(operator.equals("-")){
            return this.subtraction();
        }
        else if(operator.equals("*")){
            return this.multiplication();
        }
    else if(operator.equals("/")){
            return this.division();
    }
}
}
