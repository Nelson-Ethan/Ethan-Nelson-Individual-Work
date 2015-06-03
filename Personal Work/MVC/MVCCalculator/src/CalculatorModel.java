// The Model performs all the calculations needed

public class CalculatorModel {
	// Holds the value of the sum of the numbers
 // entered in the view
	     
private int calculationValue; //data	     
public void addTwoNumbers(int firstNumber, int secondNumber){//method
	        calculationValue = firstNumber + secondNumber;
		         
	    }
		     
		    public int getCalculationValue(){
		         	        return calculationValue;}//provide access to the data
    
	}
