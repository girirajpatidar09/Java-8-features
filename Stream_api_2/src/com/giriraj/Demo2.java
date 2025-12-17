//How to generate Stream
package com.giriraj;

import java.util.Random;
import java.util.stream.Stream;

public class Demo2 {
	public static void main(String[] args) {
		
		System.out.println("___Stream from array ");
		// create a stream  from a given array and print the elements
		Integer[] array = {20,30,10};
		Stream<Integer> stream= Stream.of(array);
		stream.forEach((Integer data)->System.out.println(data));
		
		System.out.println("__Stream fomr raw data___");
		//create a stream form given data and print the elements
		Stream<Integer> stream1=Stream.of(10,20,40,30);
		stream1.forEach(System.out::println);
		
		System.out.println("__Stream form generate____");
		//create a stream from random generated data and print the elements
		Stream<Integer> stream2 =Stream.generate(()-> new Random().nextInt()).limit(3);
		stream2.forEach(System.out::println);
		
		System.out.println("---STREAM FROM ITERATE---");
		//Create a stream starting from 1 and print the elements
		Stream<Integer> stream3 = Stream.iterate(1, i -> i <= 3 ,i -> i + 1);
		stream3.forEach(System.out::println);

		System.out.println("---EMPTY STREAM---");
		//Create an empty stream and print the elements
		Stream<Integer> stream4 = Stream.empty();
		stream4.forEach(System.out::println);
		
//		System.out.println("---EMPTY STREAM---");
//		//Create an empty stream and print the elements
//		Stream<Integer> stream4 = null;
//		stream4.forEach(System.out::println);
//		
//		Here:
//
//			You did not create a Stream.
//            You created a null reference.
//            Then you called a method (forEach) on null.
//            Java cannot call methods on a null object → NullPointerException.
//		
//		
		
		
		
	}

}