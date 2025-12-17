package com.giriraj;

import com.giriraj.service.Operation;
import com.giriraj.service.impl.OperationImpl;

public class Demo1 {
	
	public static void main(String ar[])
	{
		Operation operation = new OperationImpl();
		boolean result = operation.isPositive(10);
		System.out.println(result);
	}

}
