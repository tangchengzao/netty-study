package com.tangcz.highconcurrency.ch01.ex6;

/**
 * @author 月汐
 * @date 2019/10/16 16:33
 */
public class ThreadGroupTest {

    public static void main(String[] args) {
        Thread t1 = new Thread("t1");
        ThreadGroup group = new ThreadGroup("TestGroup");
        Thread t2 = new Thread(group, "t2");
        ThreadGroup mainThreadGroup = Thread.currentThread().getThreadGroup();

        System.out.println("Main:" + mainThreadGroup.getName());
        System.out.println("t1  :" + t1.getThreadGroup().getName());
        System.out.println("t2  :" + t2.getThreadGroup().getName());
    }

}
