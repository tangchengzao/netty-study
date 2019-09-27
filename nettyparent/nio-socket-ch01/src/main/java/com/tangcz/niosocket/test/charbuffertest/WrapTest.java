package com.tangcz.niosocket.test.charbuffertest;

import java.nio.CharBuffer;

/**
 * @author 月汐
 * @date 2019/08/01 20:28
 */
public class WrapTest {

    public static void main(String[] args) {
        CharBuffer charBuffer = CharBuffer.wrap("abcdefg", 3, 5);
        System.out.println("capacity = " + charBuffer.capacity() + "\tlimit = " + charBuffer.limit() + "\tposition = " + charBuffer.position());
        for (int i = 0; i < charBuffer.limit(); i++) {
            System.out.print(charBuffer.get() + " ");
        }
        charBuffer.append("我是只读的，不能添加数据，会出异常！");
    }

}
