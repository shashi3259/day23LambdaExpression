package com.bridegelab.LamdaExpression;

import java.util.List;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Create a Number Play List and Iterate and print each element
 * Use forEach to demonstrate Iteration
 * Show using proper Class, Anonymous Class and Lambda Function.
 */

public class NumberPlayList {
	public static void main(String[] args) {
		// Creating sample Collection
		List<Integer> myNumberList = new ArrayList<Integer>();
		for(int i=0; i<5; i++) {
			myNumberList.add(i);
		}
		
		// Method 1: Traversing using Iterator
		Iterator<Integer> iterate = myNumberList.iterator();
		while(iterate.hasNext()) {
			Integer i = iterate.next();
			System.out.println("Method 1: Iterator Value: " + i);			
		}
		
		// Method 2: Traversing with Explicit Consumer Interface implementation.
		class Myconsumer implements Consumer<Integer>{
			@Override
			public void accept(Integer t) {
				System.out.println("Mth2: Consumer impl Value: "+ t);			
			}
		}
		Myconsumer action = new Myconsumer();
		myNumberList.forEach(action);
		
		// Method 3: Traversing with Anonymous Consumer interface implementation
		myNumberList.forEach(new Consumer<Integer>(){
			public void accept(Integer t) {
				System.out.println("Method 3: forEach anonymous class Value: "+ t);
			}
		});
		
		//Method 4 : Explicit Lambda Function
		Consumer<Integer> myListAction = n ->{
			System.out.println("Method4: forEach impl Values:" + n);
		};
		myNumberList.forEach(myListAction);
		
		//Method 5: Implicit Lambda Function
		myNumberList.forEach(n->{
			System.out.println("Method5: forEach Lambda impl Value:"+ n);
		});

	}

}
