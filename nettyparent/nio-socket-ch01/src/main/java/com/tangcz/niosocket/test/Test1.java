package com.tangcz.niosocket.test;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/**
 * @author 月汐
 * @date 2019/07/18 14:13
 */
public class Test1 {

    public static void main(String[] args) {
        byte[]   byteArray   = new byte[]{1, 2, 3};
        short[]  shortArray  = new short[]{1, 2, 3, 4};
        int[]    intArray    = new int[]{1, 2, 3, 4, 5};
        long[]   longArray   = new long[]{1,2, 3, 4, 5, 6};
        float[]  floatArray  = new float[]{1, 2, 3, 4, 5, 6, 7};
        double[] doubleArray = new double[]{1, 2, 3, 4, 5, 6, 7, 8};
        char[]   charArray   = new char[]{'a', 'b', 'c', 'd'};
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        ShortBuffer shortBuffer = ShortBuffer.wrap(shortArray);
        IntBuffer intBuffer = IntBuffer.wrap(intArray);
        LongBuffer longBuffer = LongBuffer.wrap(longArray);
        FloatBuffer floatBuffer = FloatBuffer.wrap(floatArray);
        DoubleBuffer doubleBuffer = DoubleBuffer.wrap(doubleArray);
        CharBuffer charBuffer = CharBuffer.wrap(charArray);
        System.out.println("byte buffer = " + byteBuffer.getClass().getName());
        System.out.println("short buffer = " + shortBuffer.getClass().getName());
        System.out.println("int buffer = " + intBuffer.getClass().getName());
        System.out.println("long buffer = " + longBuffer.getClass().getName());
        System.out.println("float buffer = " + floatBuffer.getClass().getName());
        System.out.println("double buffer = " + doubleBuffer.getClass().getName());
        System.out.println("char buffer = " + charBuffer.getClass().getName());

        System.out.println("byte buffer capacity = " + byteBuffer.capacity());
        System.out.println("short buffer capacity = " + shortBuffer.capacity());
        System.out.println("int buffer capacity = " + intBuffer.capacity());
        System.out.println("long buffer capacity = " + longBuffer.capacity());
        System.out.println("float buffer capacity = " + floatBuffer.capacity());
        System.out.println("double buffer capacity = " + doubleBuffer.capacity());
        System.out.println("char buffer capacity = " + charBuffer.capacity());
    }

}
