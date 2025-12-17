package com.giriraj;

import com.giriraj.service.Operation;

public class Demo2 {

	public static void main(String ar[]) {
		Operation operation = new Operation() { // Anonymous inner class 
			@Override
			public  void show(String language, int version) {
				System.out.println("" + language + "" + version);

			}
		};

	 operation.show("java",20);
	}

}
