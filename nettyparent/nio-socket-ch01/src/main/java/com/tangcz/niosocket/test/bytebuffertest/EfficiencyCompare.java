package com.tangcz.niosocket.test.bytebuffertest;

import java.nio.ByteBuffer;

/**
 * @author 月汐
 * @date 2019/07/25 17:52
 */
public class EfficiencyCompare {

    private static final int _512_MB = 512 * 1024 * 1024 * 2;

    public static void main(String[] args) {
        System.out.println("start");
        long beginTime = System.currentTimeMillis();

        ByteBuffer buffer = ByteBuffer.allocate(_512_MB);
        for (int i = 0; i < _512_MB; i++) {
            buffer.put((byte)123);
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - beginTime);
        System.out.println("end");
    }

}
