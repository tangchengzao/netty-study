package com.tangcz.niosocket.test.charbuffertest;

import java.nio.CharBuffer;

/**
 * @author 月汐
 * @date 2019/08/01 15:17
 */
public class AppendTest {

    public static void main(String[] args) {
        CharBuffer charBuffer = CharBuffer.allocate(15);
        System.out.println("position = " + charBuffer.position());
        charBuffer.append('a');
        System.out.println("position = " + charBuffer.position());
        charBuffer.append("bcdefg");
        System.out.println("position = " + charBuffer.position());
        charBuffer.append("abchijklmn", 3, 8);
        System.out.println("position = " + charBuffer.position());
        char[] chars = charBuffer.array();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();
        System.out.println("capacity = " + charBuffer.capacity());
    }

}
