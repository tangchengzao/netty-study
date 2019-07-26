package com.tangcz.niosocket.test.bufferapi;

import java.nio.ByteBuffer;

/**
 * @author 月汐
 * @date 2019/07/25 14:34
 */
public class TestHasRemaining {

    public static void main(String[] args) {
        byte[] bytes = new byte[]{1, 2, 3, 4, 5};
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }

}
