package com.tangcz.highconcurrency.ch01.ex5;

import java.util.stream.IntStream;

/**
 * @author 月汐
 * @date 2019/10/16 16:02
 */
public class ThreadName {

    private final static String PREFIX = "ALEX-";

    public static void main(String[] args) {
        IntStream.range(0, 5).boxed().map(integer ->
                new Thread(() -> System.out.println(Thread.currentThread().getName()))
        ).forEach(Thread::start);

        IntStream.range(0, 5).boxed().map(integer ->
            new Thread(() -> System.out.println(Thread.currentThread().getName()), PREFIX + integer)
        ).forEach(Thread::start);

        IntStream.range(6, 10).mapToObj(i ->
                new Thread(() -> System.out.println(Thread.currentThread().getName()), PREFIX + i)
        ).forEach(Thread::start);

        IntStream.range(0, 5).mapToObj(ThreadName::createThread).forEach(Thread::start);
    }

    private static Thread createThread(int intName) {
        return new Thread(() -> System.out.println(Thread.currentThread().getName()), PREFIX + intName);
    }

}
