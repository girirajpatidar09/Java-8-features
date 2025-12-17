package com.giriraj.service.impl;

import com.giriraj.service.Operation;

public class OperationImpl implements Operation {

	@Override
	public void show(String language, int version) {
		System.out.println("" + language + "" + version);

	}

}
