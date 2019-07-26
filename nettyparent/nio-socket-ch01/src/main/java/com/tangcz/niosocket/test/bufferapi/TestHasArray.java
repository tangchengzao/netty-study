package com.tangcz.niosocket.test.bufferapi;

import java.nio.ByteBuffer;

/**
 * @author 月汐
 * @date 2019/07/25 14:29
 */
public class TestHasArray {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(100);
        buffer.put((byte) 1);
        buffer.put((byte) 2);
        System.out.println(buffer.hasArray());
    }

}
