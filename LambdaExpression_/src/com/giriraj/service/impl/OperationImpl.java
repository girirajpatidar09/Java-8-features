package com.giriraj.service.impl;

import com.giriraj.service.Operation;

public class OperationImpl implements Operation {

	@Override
	public int increament(int num) {

		return ++num;
	}

}
