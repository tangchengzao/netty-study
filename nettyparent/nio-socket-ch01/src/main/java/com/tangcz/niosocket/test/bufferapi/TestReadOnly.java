package com.tangcz.niosocket.test.bufferapi;

import java.nio.ByteBuffer;

/**
 * @author 月汐
 * @date 2019/07/19 16:12
 */
public class TestReadOnly {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(1);
        System.out.println("is read only = " + buffer.isReadOnly());
    }

}
