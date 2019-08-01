package com.tangcz.niosocket.test.bytebuffertest;

import java.nio.ByteBuffer;

/**
 * @author 月汐
 * @date 2019/08/01 14:43
 */
public class DuplicateAndSlice {

    public static void main(String[] args) {
        byte[] intBytes = {1, 2, 3, 4, 5};
        ByteBuffer intByteBuffer = ByteBuffer.wrap(intBytes);
        intByteBuffer.position(2);
        System.out.println("int byte buffer capacity = " + intByteBuffer.capacity()
                + "\tlimit = " + intByteBuffer.limit()
                + "\tposition = " + intByteBuffer.position());
        ByteBuffer sliceByteBuffer = intByteBuffer.slice();
        ByteBuffer duplicateByteBuffer = intByteBuffer.duplicate();
        System.out.println("int byte buffer capacity = " + sliceByteBuffer.capacity()
                + "\tlimit = " + sliceByteBuffer.limit()
                + "\tposition = " + sliceByteBuffer.position());
        System.out.println("int byte buffer capacity = " + duplicateByteBuffer.capacity()
                + "\tlimit = " + duplicateByteBuffer.limit()
                + "\tposition = " + duplicateByteBuffer.position());
        sliceByteBuffer.position(0);
        for (int i = 0; i < sliceByteBuffer.limit(); i++) {
            System.out.print(sliceByteBuffer.get());
        }
        System.out.println();
        duplicateByteBuffer.position(0);
        for (int i = 0; i < duplicateByteBuffer.limit(); i++) {
            System.out.print(duplicateByteBuffer.get());
        }
    }

}
