package com.bridegelab.LamdaExpression;

@FunctionalInterface
interface IMathFunction{
	int calculate(int a, int b);
	static void printResult(int a, int b, String function, IMathFunction fobj) {
		System.out.println("Result of "+ function + "is: "+ fobj.calculate(a,b));
	}
}

public class MathOperationApp {

	public static void main(String[] args) {
//		IMathFunction add = Integer::sum;        Another method to sum numbers.
		IMathFunction add = (x,y) -> x+y;           
		IMathFunction subtract = (x,y) -> x+y;
		IMathFunction multiply = (x,y) -> x+y;
		IMathFunction divide = (x,y) -> x+y;
		/*
		System.out.println("Addition is " + add.calculate(5, 6));
		System.out.println("subtract is " + subtract.calculate(30, 10));
		System.out.println("multiply is " + multiply.calculate(5, 6));
		System.out.println("divide is " + divide.calculate(33, 11));
		*/
		IMathFunction.printResult(5, 6, "Addition ",add );
		IMathFunction.printResult(30, 10, "subtract ",subtract );
		IMathFunction.printResult(5, 6, "multiply ",multiply );
		IMathFunction.printResult(54, 6, "divide ",divide);
		

	}

}
