package com.bridegelab.LamdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UC1_5_PrintEvenNumber {

	public static void main(String[] args) {
		List<Integer> myNumberList = new ArrayList<Integer>();
		for(int i=0; i<5; i++) {
			myNumberList.add(i);
		}
		
		// Print Even number from the List Iteration
		// Predicate Functional Interface
		Predicate<Integer> isEvenFunction = n-> n>0 && n%2 ==0;
		myNumberList.forEach(n->{
			System.out.println("forEach value of: "+ n + "check for Even: "
					+ isEvenFunction.test(n));
		});
	}
}
