package com.tangcz.niosocket.test.charbuffertest;

import java.nio.CharBuffer;

/**
 * @author 月汐
 * @date 2019/08/01 15:50
 */
public class CharAtTest {

    public static void main(String[] args) {
        CharBuffer buffer = CharBuffer.allocate(10);
        buffer.append("abcdefh");
        buffer.position(2);
        System.out.println(buffer.charAt(0));
        System.out.println(buffer.charAt(1));
        System.out.println(buffer.charAt(2));
    }

}
