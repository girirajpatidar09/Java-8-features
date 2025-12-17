package com.giriraj.service.impl;

import java.io.IOException;

import com.giriraj.service.Operation;

public class OperationImpl implements Operation {

	@Override
	public int divide(int num1, int num2)  throws IOException{
		if(num2==0)
			throw new IOException("value cannnot ve zero");
		
		return num1/num2;
	}

	

}
