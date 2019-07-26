package com.tangcz.niosocket.test.bufferapi;

import java.nio.CharBuffer;

/**
 * @author 月汐
 * @date 2019/07/19 14:40
 */
public class TestLimit {

    public static void main(String[] args) {
        char[] charArray = new char[] {'a', 'b', 'c', 'd'};
        CharBuffer charBuffer = CharBuffer.wrap(charArray);
        System.out.println("A capacity = " + charBuffer.capacity() + "\tlimit = " + charBuffer.limit());
        charBuffer.limit(3);
        System.out.println();
        System.out.println("B capacity = " + charBuffer.capacity() + "\tlimit = " + charBuffer.limit());

        charBuffer.put(0, 'o');
        charBuffer.put(1, 'p');
        charBuffer.put(2, 'q');
        charBuffer.put(3, 'r');
        charBuffer.put(4, 's');
        charBuffer.put(5, 't');
    }

}
