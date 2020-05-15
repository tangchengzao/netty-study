package com.tangcz.highconcurrency.ch01.ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 月汐
 * @date 2019/10/17 18:58
 */
public class CalAverageScore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double score = 0.0;
        int num = 0;
        while (scanner.hasNextDouble()) {
            score += scanner.nextDouble();
            num++;
        }
        System.out.println(score);
        System.out.println(num);
        System.out.println(score / num);
    }

}
