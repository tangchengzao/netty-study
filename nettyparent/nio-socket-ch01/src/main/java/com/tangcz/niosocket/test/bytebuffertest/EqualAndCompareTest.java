package com.tangcz.niosocket.test.bytebuffertest;

import java.nio.ByteBuffer;

/**
 * @author 月汐
 * @date 2019/07/31 20:16
 */
public class EqualAndCompareTest {

    public static void main(String[] args) {
        byte[] bytes = {1, 2, 3, 4, 5};
        byte[] bytes1 = {1, 2, 3, 4, 5};
        ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        System.out.println("equal = " + byteBuffer.equals(bytes));
        System.out.println("compare to = " + byteBuffer.compareTo(ByteBuffer.wrap(bytes1)));
    }

}
