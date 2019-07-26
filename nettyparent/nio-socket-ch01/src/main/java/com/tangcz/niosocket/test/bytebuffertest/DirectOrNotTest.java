package com.tangcz.niosocket.test.bytebuffertest;

import java.nio.ByteBuffer;

/**
 * @author 月汐
 * @date 2019/07/25 16:15
 */
public class DirectOrNotTest {

    public static void main(String[] args) {
        ByteBuffer buffer       = ByteBuffer.allocate(100);
        ByteBuffer directBuffer = ByteBuffer.allocateDirect(200);
        System.out.println("buffer position = " + buffer.position() + "\tlimit = " + buffer.limit());
        System.out.println("direct buffer position = " + directBuffer.position() + "\tlimit = " + directBuffer.limit());
        System.out.println("buffer = " + buffer + "\tis direct = " + buffer.isDirect());
        System.out.println("direct buffer = " + directBuffer + "\tis direct = " + directBuffer.isDirect());
    }

}
