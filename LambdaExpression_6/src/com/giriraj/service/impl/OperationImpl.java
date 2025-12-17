package com.giriraj.service.impl;

import com.giriraj.service.Operation;

public class OperationImpl implements Operation {

	@Override
	public boolean isGreater(int num1, int num2) {

		return num1 > num2;
	}

}
