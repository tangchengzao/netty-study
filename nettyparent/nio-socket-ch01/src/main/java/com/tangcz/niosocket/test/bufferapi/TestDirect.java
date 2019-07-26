package com.tangcz.niosocket.test.bufferapi;

import java.nio.ByteBuffer;

/**
 * @author 月汐
 * @date 2019/07/19 16:13
 */
public class TestDirect {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(1);
        ByteBuffer directBuffer = ByteBuffer.allocateDirect(1);
        System.out.println("is direct = " + buffer.isDirect());
        System.out.println("is direct = " + directBuffer.isDirect());
    }

}
