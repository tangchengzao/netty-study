package com.tangcz.niosocket.test.bufferapi;

import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/**
 * @author 月汐
 * @date 2019/07/25 10:33
 */
public class TestFlip {

    public static void main(String[] args) {
        byte[] bytes = new byte[]{1, 2, 3};
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        buffer.position(2);
        buffer.mark();
        buffer.flip();
        System.out.println("buffer.position = " + buffer.position());
        System.out.println();
        System.out.println("bufferlimit = " + buffer.limit());
        System.out.println();
        System.out.println();
        try {
            buffer.reset();
        } catch (InvalidMarkException e) {
            System.out.println("buffer mark 丢失");
        }
    }

}
