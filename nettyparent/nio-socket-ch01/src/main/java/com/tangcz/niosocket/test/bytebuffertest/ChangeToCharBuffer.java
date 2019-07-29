package com.tangcz.niosocket.test.bytebuffertest;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/**
 * @author 月汐
 * @date 2019/07/26 17:47
 */
public class ChangeToCharBuffer {

    public static void main(String[] args) throws UnsupportedEncodingException {
        method1();
        method2();
    }

    private static void method1() throws UnsupportedEncodingException {
        byte[] bytes = "我是中国人".getBytes("utf-16BE");
        System.out.println(Charset.defaultCharset().name());
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        System.out.println("byteBuffer = " + buffer.getClass().getName());
        CharBuffer charBuffer = buffer.asCharBuffer();
        System.out.println("charBuffer = " + charBuffer.getClass().getName());
        System.out.println("byteBuffer.position = " + buffer.position()
                + "\tcapacity = " + buffer.capacity()
                + "\tlimit = " + buffer.limit());
        System.out.println("charBuffer.position = " + charBuffer.position()
                + "\tcapacity = " + charBuffer.capacity()
                + "\tlimit = " + charBuffer.limit());
        charBuffer.position(0);
        for (int i = 0; i < charBuffer.capacity(); i++) {
            System.out.print(charBuffer.get());
        }
    }

    private static void method2() throws UnsupportedEncodingException {
        byte[] bytes = "我是中国人".getBytes();
        System.out.println(Charset.defaultCharset().name());
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        System.out.println("byteBuffer = " + buffer.getClass().getName());
        CharBuffer charBuffer = Charset.forName("utf-8").decode(buffer);
        System.out.println("charBuffer = " + charBuffer.getClass().getName());
        System.out.println("byteBuffer.position = " + buffer.position()
                + "\tcapacity = " + buffer.capacity()
                + "\tlimit = " + buffer.limit());
        System.out.println("charBuffer.position = " + charBuffer.position()
                + "\tcapacity = " + charBuffer.capacity()
                + "\tlimit = " + charBuffer.limit());
        charBuffer.position(0);
        for (int i = 0; i < charBuffer.limit(); i++) {
            System.out.print(charBuffer.get());
        }
    }

}
