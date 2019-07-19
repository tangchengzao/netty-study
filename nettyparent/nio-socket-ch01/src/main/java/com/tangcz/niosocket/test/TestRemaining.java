package com.tangcz.niosocket.test;

import java.nio.CharBuffer;

/**
 * @author 月汐
 * @date 2019/07/19 15:47
 */
public class TestRemaining {

    public static void main(String[] args) {
        char[] chars = new char[] {'a', 'b', 'c', 'd', 'e'};
        CharBuffer buffer = CharBuffer.wrap(chars);
        System.out.println("A capacity = " + buffer.capacity() + "\tlimit = " + buffer.limit() +
                "\tposition = " + buffer.position() + "\tremaining = " + buffer.remaining());
        buffer.position(2);
        System.out.println("A capacity = " + buffer.capacity() + "\tlimit = " + buffer.limit() +
                "\tposition = " + buffer.position() + "\tremaining = " + buffer.remaining());
    }

}
