package com.giriraj;

import java.io.IOException;

import com.giriraj.service.Operation;
import com.giriraj.service.impl.OperationImpl;

public class Demo1 {
	
	public static void main(String ar[])
	{
		Operation operation = new OperationImpl();
		 int result=0;
		try {
			result = operation.divide(10,0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println(result);
		
		
		
	}

}
