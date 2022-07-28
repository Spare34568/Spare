
/**
 * Write a description of class Daythree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Computer
{
   private String inputUnit;
   private String memoryUnit;
   private String controlUnit;
   private String arithmeticLogicUnit;
   private String outputUnit;
   
   public Computer (String inputUnit, String memoryUnit, String controlUnit, String arithmeticLogicUnit,String outputUnit){
   this.inputUnit = inputUnit;
   this.memoryUnit = memoryUnit;
   this.controlUnit = controlUnit;
   this.arithmeticLogicUnit = arithmeticLogicUnit;
   this.outputUnit = outputUnit;
}
public String getinputUnit(){
    return this.inputUnit;
}
public String getmemoryUnit(){
    return this.memoryUnit;
}
public String getcontrolUnit(){
    return this.controlUnit;
} 
public String getarithmeticLogicUnit(){
    return this.arithmeticLogicUnit;
}
public String outputUnit(){
    return this.outputUnit;
    
}
}
