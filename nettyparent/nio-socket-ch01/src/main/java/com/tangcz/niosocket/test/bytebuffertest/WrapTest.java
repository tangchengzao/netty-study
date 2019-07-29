package com.tangcz.niosocket.test.bytebuffertest;

import java.nio.ByteBuffer;

/**
 * @author 月汐
 * @date 2019/07/26 16:55
 */
public class WrapTest {

    public static void main(String[] args) {
        byte[] bytes = new byte[]{1, 2, 3, 4, 5, 6, 7};
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        ByteBuffer subBuffer = ByteBuffer.wrap(bytes, 2, 4);
        System.out.println("buffer capacity = " + buffer.capacity()
                + "\tlimit = " + buffer.limit()
                + "\tposition = " + buffer.position());
        System.out.println();
        System.out.println("subBuffer capacity = " + subBuffer.capacity()
                + "\tlimit = " + subBuffer.limit()
                + "\tposition = " + subBuffer.position());
    }

}
