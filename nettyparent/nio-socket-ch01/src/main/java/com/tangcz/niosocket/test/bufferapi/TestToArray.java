package com.tangcz.niosocket.test.bufferapi;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 月汐
 * @date 2019/07/25 15:24
 */
public class TestToArray {

    public static void main(String[] args) {
        ByteBuffer buffer1 = ByteBuffer.wrap(new byte[]{'a', 'b', 'c'});
        ByteBuffer buffer2 = ByteBuffer.wrap(new byte[]{1, 2, 3});
        ByteBuffer buffer3 = ByteBuffer.wrap(new byte[]{'x', 'y', 'z'});
        List<ByteBuffer> list = new ArrayList<>();
        list.add(buffer1);
        list.add(buffer2);
        list.add(buffer3);
        ByteBuffer[] byteBuffers = new ByteBuffer[list.size()];
        list.toArray(byteBuffers);
        System.out.println(byteBuffers.length);
        for (int i = 0; i < byteBuffers.length; i++) {
            ByteBuffer byteBuffer = byteBuffers[i];
            while (byteBuffer.hasRemaining()) {
                System.out.print((char) byteBuffer.get());
            }
            System.out.println();
        }
    }

}
