package com.tangcz.niosocket.test.bytebuffertest;

import java.nio.ByteBuffer;

/**
 * @author 月汐
 * @date 2019/07/29 14:03
 */
public class AsReadOnlyTest {

    public static void main(String[] args) {
        byte[] bytes = {1, 2, 3, 4, 5};
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        ByteBuffer buffer = byteBuffer.asReadOnlyBuffer();
        System.out.println("byte buffer is read only:" + byteBuffer.isReadOnly());
        System.out.println("buffer is read only:" + buffer.isReadOnly());
        buffer.rewind();
        buffer.putInt((byte)123);
    }

}
