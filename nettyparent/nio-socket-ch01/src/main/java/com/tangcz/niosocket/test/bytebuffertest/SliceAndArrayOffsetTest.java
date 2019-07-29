package com.tangcz.niosocket.test.bytebuffertest;

import java.nio.ByteBuffer;

/**
 * @author 月汐
 * @date 2019/07/26 17:42
 */
public class SliceAndArrayOffsetTest {

    public static void main(String[] args) {
        byte[] bytes = new byte[]{1, 2, 3, 4, 5, 6, 7};
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        buffer.position(3);
        ByteBuffer slice = buffer.slice();
        System.out.println("slice capacity = " + slice.capacity() + "\tlimit = " + slice.limit() + "\tposition = " + slice.position());
        System.out.println("arrayOffset = " + slice.arrayOffset());
    }

}
