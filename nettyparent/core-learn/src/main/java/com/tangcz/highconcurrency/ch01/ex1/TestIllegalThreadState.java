package com.tangcz.highconcurrency.ch01.ex1;

import java.util.concurrent.TimeUnit;

/**
 * @author 月汐
 * @date 2019/10/16 14:43
 */
public class TestIllegalThreadState {

    public static void main(String[] args) {
//        testRestartException();
        startAfterTerminated();
    }

    private static void testRestartException() {
        Thread thread = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        thread.start();
    }

    private static void startAfterTerminated() {
        Thread thread = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.start();
    }

}
