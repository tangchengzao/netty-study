package com.tangcz.javatec01.ch05.methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.Math;

/**
 * @author 月汐
 * @date 2019/09/25 10:30
 */
public class MethodTableTest {

    private static final int MAX_SIZE = 10;

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = Math.class.getMethod("sqrt", double.class);
        for (int i = 0; i < MAX_SIZE; i++) {
            System.out.println((i + 1) + "|      " + method.invoke(null, i + 1));
        }
    }

}
