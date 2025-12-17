package com.giriraj.service;

import java.io.IOException;

@FunctionalInterface
public interface Operation {

    int divide(int num1,int num2) throws IOException;

}
