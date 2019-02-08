package postfix;

import java.util.Stack;

public class Postfix {
	
	public enum Operators{
		ADDITION       ("+"),
		SUBSTRACTION   ("-"),
		MULTIPLICATION ("*"),
		INVALID_OPERATION ("E");		   
		
		public final String sign;
		
		Operators(String sign){
			this.sign = sign;
		}
	}
	
	public static void main(String[] args) {
		String expression = "5 1 2 + 4 * + 3 -";
		int result = postfixCalculator(expression);
		System.out.println(result);		
	}
	
	static int postfixCalculator(String expression) {
		String[] items = expression.split(" ");
		
		Stack<Integer> numbers = new Stack<Integer>();
		int numberOne;
		int numberTwo;
		
		for (int i = 0; i < items.length; i++) {
			if(isNumber(items[i])) {
				numbers.push(Integer.parseInt(items[i]));
			}else{ 
				Operators operator = getOperator(items[i]);
				if(!operator.equals(Operators.INVALID_OPERATION)){
					numberTwo = numbers.pop();
					numberOne = numbers.pop();
					numbers.push(calculate(numberOne, numberTwo, operator));
				}else{
					System.out.println("Error:: " + items[i]);
				}
			}
		}
		return numbers.peek();
	}
	
	static Operators getOperator(String operator) {
		if(operator.equals(Operators.ADDITION.sign))
			return Operators.ADDITION;
		
		if(operator.equals(Operators.SUBSTRACTION.sign)) 
			return Operators.SUBSTRACTION;
		
		if(operator.equals(Operators.MULTIPLICATION.sign)) 
			return Operators.MULTIPLICATION;
		
		return Operators.INVALID_OPERATION;
	}
	
	static boolean isNumber(String number) {
		try {
			int integer = Integer.parseInt(number);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	static int calculate(int numberOne, int numberTwo, Operators operator) {
		
		switch (operator) {
			case ADDITION:
				return numberOne + numberTwo;
			case SUBSTRACTION:
				return numberOne - numberTwo;
			case MULTIPLICATION:
				return numberOne * numberTwo;
			default:
				return -1; //lanzar excepcion
		}
	}

}
