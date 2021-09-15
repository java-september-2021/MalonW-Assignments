public class Calculator {
	private double operandOne;
	private String operator;
	private double operandTwo;
	private double results;
	
	
	public Calculator() {
	
	}
	public Calculator(double num1, double num2) {
		this.operandOne = num1;
		this.operandTwo = num2;
	}
	public double getOperandOne() {
		return operandOne;
	}


	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}


	public double getOperandTwo() {
		return operandTwo;
	}


	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}


	public String getOperator() {
		return operator;
	}


	public void setOperator(String operator) {
		this.operator = operator;
		}

	public void performOperation() {
		if (this.operator == "+") {
			results = operandOne + operandTwo;
		}else if(this.operator == "-") {
			results = operandOne - operandTwo;
		}
		else if(this.operator == "*") {
			results = operandOne * operandTwo;
		}
		else if(this.operator == "/") {
			results = operandOne / operandTwo;
		}
	}
	
	
	public double getResults() {
		
		return this.results;
	}
}
