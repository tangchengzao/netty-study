package com.tangcz.niosocket.test.bufferapi;

import java.nio.ByteBuffer;

/**
 * @author 月汐
 * @date 2019/07/19 15:51
 */
public class TestMark {

    public static void main(String[] args) {
        byte[] bytes = new byte[] {1, 2, 3};
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        System.out.println("A capacity = " + buffer.capacity());
        System.out.println();
        buffer.position(1);
        System.out.println("position = " + buffer.position());
        buffer.mark();
        buffer.position(2);
        buffer.reset();
        System.out.println("position = " + buffer.position());
        buffer.position(0);
        buffer.reset();
        System.out.println("position = " + buffer.position());
    }

}
