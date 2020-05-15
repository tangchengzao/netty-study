package com.tangcz.highconcurrency.ch01.ex2;

/**
 * @author 月汐
 * @date 2019/10/16 15:07
 */
public class TemplateMethod {

    public final void print(String message) {
        System.out.println("####################");
        wrapPrint(message);
        System.out.println("####################");
    }

    protected void wrapPrint(String message) {

    }

    public static void main(String[] args) {
        TemplateMethod t1 = new TemplateMethod() {
            @Override
            protected void wrapPrint(String message) {
                System.out.println("*" + message + "*");
            }
        };
        t1.print("Hello Thread");
        TemplateMethod t2 = new TemplateMethod() {
            @Override
            protected void wrapPrint(String message) {
                System.out.println("+" + message + "+");
            }
        };
        t2.print("Hello Thread");
    }

}
