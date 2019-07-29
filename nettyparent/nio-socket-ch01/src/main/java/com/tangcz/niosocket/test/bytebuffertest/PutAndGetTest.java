package com.tangcz.niosocket.test.bytebuffertest;

import java.nio.ByteBuffer;

/**
 * @author 月汐
 * @date 2019/07/26 17:02
 */
public class PutAndGetTest {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        System.out.println("buffer capacity = " + buffer.capacity() + "\tlimit = " + buffer.limit() + "\tposition = " + buffer.position());
        buffer.put((byte)125);
        System.out.println("buffer capacity = " + buffer.capacity() + "\tlimit = " + buffer.limit() + "\tposition = " + buffer.position());
        System.out.println(buffer.get());
        System.out.println("buffer capacity = " + buffer.capacity() + "\tlimit = " + buffer.limit() + "\tposition = " + buffer.position());

        byte[] bytes = new byte[]{1, 2, 3, 4};
        buffer.put(bytes, 1, 3);

        buffer.position(7);
        byte[] result = new byte[buffer.capacity()];
        buffer.get(result, 2, 5);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "-");
        }
    }

}
