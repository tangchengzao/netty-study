package com.tangcz.niosocket.test.bufferapi;

import java.nio.ByteBuffer;

/**
 * @author 月汐
 * @date 2019/07/25 15:05
 */
public class TestArrayOffset {

    public static void main(String[] args) {
        byte[] bytes = new byte[]{1, 2, 3};
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        System.out.println("buffer.arrayOffset = " + buffer.arrayOffset());
    }

}
