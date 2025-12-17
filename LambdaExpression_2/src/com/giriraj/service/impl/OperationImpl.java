package com.giriraj.service.impl;

import com.giriraj.service.Operation;

public class OperationImpl implements Operation {

	@Override
	public boolean isPositive(int num) {
		
		return num>=0;
	}

	

}
