package com.tangcz.niosocket.test.bytebuffertest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/**
 * @author 月汐
 * @date 2019/07/25 17:35
 */
public class DirectReleaseTest {

    private static final int _512_Mb = 512 * 1024 * 1024;

    public static void main(String[] args) throws InterruptedException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        handlerRelease();
    }

    private static void handlerRelease() throws InterruptedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println("A");
        ByteBuffer buffer = ByteBuffer.allocateDirect(_512_Mb);
        System.out.println("B");
        byte[] bytes = new byte[]{1};
        System.out.println(_512_Mb);
        for (int i = 0; i < _512_Mb; i++) {
            buffer.put(bytes);
        }
        System.out.println("put end!");
        Thread.sleep(2000);
        Method cleanerMethod = buffer.getClass().getMethod("cleaner");
        cleanerMethod.setAccessible(true);
        Object returnValue = cleanerMethod.invoke(buffer);
        Method cleanMethod = returnValue.getClass().getMethod("clean");
        cleanMethod.setAccessible(true);
        cleanMethod.invoke(returnValue);
    }

}
