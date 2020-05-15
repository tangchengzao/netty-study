package com.tangcz.javatec01.ch05.objectanalyzer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 月汐
 * @date 2019/09/23 15:24
 */
public class ObjectAnalyzerTest {

    private static int SIZE = 5;

    public static void main(String[] args) {
        List<Integer> squares = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            squares.add(i);
        }
        System.out.println(new ObjectAnalyzer().toString(squares));
    }

}
