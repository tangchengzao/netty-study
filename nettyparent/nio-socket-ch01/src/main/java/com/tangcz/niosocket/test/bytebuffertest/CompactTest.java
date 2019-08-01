package com.tangcz.niosocket.test.bytebuffertest;

import java.nio.ByteBuffer;

/**
 * @author 月汐
 * @date 2019/07/31 19:47
 */
public class CompactTest {

    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[]{1, 2, 3, 4, 5, 6});
        System.out.println("byte buffer capacity = " + byteBuffer.capacity()
                + "\tposition = " + byteBuffer.position()
                + "\tlimit = " + byteBuffer.limit());
        System.out.println("1 getValue = " + byteBuffer.get());
        System.out.println("byte buffer capacity = " + byteBuffer.capacity()
                + "\tposition = " + byteBuffer.position()
                + "\tlimit = " + byteBuffer.limit());
        byteBuffer.compact();
        System.out.println("byte buffer capacity = " + byteBuffer.capacity()
                + "\tposition = " + byteBuffer.position()
                + "\tlimit = " + byteBuffer.limit());
    }

}
