package com.learning.core.day4session1;
import java.util.Stack;

public class D04P093 {
	    public static int evaluateExpression(String expression) {
	        Stack<Integer> operands = new Stack<>();
	        Stack<Character> operators = new Stack<>();
	 
	        for (int i = 0; i < expression.length(); i++) {
	            char c = expression.charAt(i);
	 
	            if (Character.isDigit(c)) {
	                int num = 0;
	                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
	                    num = num * 10 + (expression.charAt(i) - '0');
	                    i++;
	                }
	                operands.push(num);
	                i--;
	            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
	                while (!operators.isEmpty() && hasPrecedence(c, operators.peek())) {
	                    int operand2 = operands.pop();
	                    int operand1 = operands.pop();
	                    char operator = operators.pop();
	                    operands.push(applyOperation(operand1, operand2, operator));
	                }
	                operators.push(c);
	            }
	        }
	 
	        while (!operators.isEmpty()) {
	            int operand2 = operands.pop();
	            int operand1 = operands.pop();
	            char operator = operators.pop();
	            operands.push(applyOperation(operand1, operand2, operator));
	        }
	 
	        return operands.pop();
	    }
	 
	    private static boolean hasPrecedence(char op1, char op2) {
	        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
	            return false;
	        return true;
	    }
	 
	    private static int applyOperation(int a, int b, char operator) {
	        switch (operator) {
	            case '+':
	                return a + b;
	            case '-':
	                return a - b;
	            case '*':
	                return a * b;
	            case '/':
	                if (b == 0) throw new ArithmeticException("Cannot divide by zero");
	                return a / b;
	        }
	        return 0;
	    }
	 
	    public static void main(String[] args) {
	        String input = "10+2*6";
	        int result = evaluateExpression(input);
	        System.out.println("Output: " + result);
	    }
}