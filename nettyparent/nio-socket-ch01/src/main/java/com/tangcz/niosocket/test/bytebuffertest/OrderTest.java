package com.tangcz.niosocket.test.bytebuffertest;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * @author 月汐
 * @date 2019/07/29 13:48
 */
public class OrderTest {

    /**
     * 设置获得字节排序（即从高位开始读还是从低位开始读）
     * @param args
     */
    public static void main(String[] args) {
        int value = 123456789;
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        System.out.println(byteBuffer.order());
        byteBuffer.putInt(value);
        byte[] array = byteBuffer.array();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        byteBuffer.clear();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.putInt(value);
        byte[] bytes = byteBuffer.array();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i]);
            System.out.print(" ");
        }
    }
    
}
