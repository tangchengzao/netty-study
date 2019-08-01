package com.tangcz.niosocket.test.bytebuffertest;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;

/**
 * @author 月汐
 * @date 2019/07/29 11:24
 */
public class ChangeToOtherBuffer {

    /**
     * put_(Double,Float,Int...)
     * as_(Double,Float,Int...)Buffer
     * @param args
     */
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(32);
        byteBuffer.putDouble(1.1D);
        byteBuffer.putDouble(1.2D);
        byteBuffer.putDouble(1.3D);
        byteBuffer.flip();
        DoubleBuffer doubleBuffer = byteBuffer.asDoubleBuffer();
        System.out.println(doubleBuffer);
        doubleBuffer.limit(2);
        for (int i = 0; i < doubleBuffer.capacity(); i++) {
            System.out.print(doubleBuffer.get() + " ");
        }
        System.out.println();

    }

}
