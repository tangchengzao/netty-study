package com.tangcz.niosocket.test.bufferapi;

import java.nio.CharBuffer;

/**
 * @author 月汐
 * @date 2019/07/19 15:35
 */
public class TestPosition {

    public static void main(String[] args) {
        char[] chars = new char[] {'a', 'b', 'c', 'd'};
        CharBuffer buffer = CharBuffer.wrap(chars);
        System.out.println("A capacity = " + buffer.capacity() + "\tlimit = " + buffer.limit() + "\tposition = " + buffer.position());
        buffer.position(2);
        System.out.println("B capacity = " + buffer.capacity() + "\tlimit = " + buffer.limit() + "\tposition = " + buffer.position());
        buffer.put('z');
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
    }

}
