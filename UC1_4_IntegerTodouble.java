package com.bridegelab.LamdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class UC1_4_IntegerTodouble {

	public static void main(String[] args) {
		List<Integer> myNumberList = new ArrayList<Integer>();
		for(int i =0; i<5; i++) {
			myNumberList.add(i);
		}
		
		//Converting Integer to double:-  n-> n.doubleValue(); or Integer:: double
		Function<Integer, Double> toDoubleFunction = Integer::doubleValue;
		myNumberList.forEach(n->{
			System.out.println("Converting Int to Double:" +
						toDoubleFunction.apply(n));
		});
	}
}
