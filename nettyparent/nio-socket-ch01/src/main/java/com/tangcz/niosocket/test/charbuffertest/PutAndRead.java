package com.tangcz.niosocket.test.charbuffertest;

import java.io.IOException;
import java.nio.CharBuffer;

/**
 * @author 月汐
 * @date 2019/08/01 16:31
 */
public class PutAndRead {

    public static void main(String[] args) throws IOException {
        CharBuffer charBuffer = CharBuffer.allocate(8);
        charBuffer.append("ab123456");
        charBuffer.position(2);
        charBuffer.put("cde");
        charBuffer.rewind();
        for (int i = 0; i < charBuffer.limit(); i++) {
            System.out.print(charBuffer.get());
        }
        System.out.println();
        charBuffer.position(1);
        CharBuffer charBuffer1 = CharBuffer.allocate(4);
        System.out.println("char buffer 1 position = " + charBuffer1.position());
        charBuffer.read(charBuffer1);
        System.out.println("char buffer 1 position = " + charBuffer1.position());
        charBuffer1.rewind();
        for (int i = charBuffer1.position(); i < charBuffer1.limit(); i++) {
            System.out.print(charBuffer1.get());
        }
        System.out.println();
        charBuffer.position(2);
        CharBuffer charBuffer2 = charBuffer.subSequence(0, 2);
        System.out.println("char buffer 2 position = " + charBuffer2.position() + "\tcapacity = " + charBuffer2.capacity() + "\tlimit = " + charBuffer2.limit());
        for (int i = charBuffer2.position(); i < charBuffer2.limit(); i++) {
            System.out.print(charBuffer2.get());
        }
    }

}
