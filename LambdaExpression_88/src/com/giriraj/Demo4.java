package com.giriraj;

import java.io.IOException;
import java.util.function.BiFunction;

public class Demo4 {

	public static void main(String ar[]) {
		
		BiFunction<Integer,Integer,Integer> bifunction = (num1,num2)->
		{
			try
			{
			if(num2==0)
				throw new IOException("Value cannot be zero");
			
		
			return num1/num2;
			}
			catch(IOException exception)
			{ 
				///throw new RuntimeException();

				//throw new RuntimeException(exception.getMessage());
				throw new RuntimeException(exception);
			}
		};
		
	  int result = bifunction.apply(10,0);
	  System.out.println(result);
	}

}
