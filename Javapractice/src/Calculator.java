import java.util.Scanner;
public class Calculator {
		   public static void main(String [] args) {
           Scanner scanner = new Scanner (System.in);
           System.out.print("Enter a number: ");
           int num1 = scanner.nextInt();
           System.out.print("Enter a number: ");
           int num2 = scanner.nextInt();
           System.out.print("Pick an operation( +, -, *, /): ");
           char operation = scanner.next().charAt(0);
           double result = 0;
           boolean ValidOperation = true;
          
           // Performs Calculation
           if (operation == '+') {
        	    result = num1 + num2;
           } else if(operation == '-') {
        	   	result = num1 - num2;
           } else if (operation == '*') {
        	    result = num1 * num2;
           } else if (operation == '/') {
        	   	if (num2 != 0) {
        	    result = (double) num1 / num2;
        	   
           } else {
        	   System.out.print("Cannot divide by zero!");
        	   		 ValidOperation = false;
           	   }
		   } else {
	       
           System.out.print("Invalid operation");
           		 ValidOperation = false;
	        }
	        
	        //Prints output only if operation is valid
	        if (ValidOperation) {
	        	    System.out.println("Result: " + result);
	        	    
	        }
	        scanner.close();
   }
}
           

      
           
        	   
        	
           
           
	
        	   
        	   
        	   
           
           
           
           
           
           

           
           
	

	
	
	

			
		
		
	

