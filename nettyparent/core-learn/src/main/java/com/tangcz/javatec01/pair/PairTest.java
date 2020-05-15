package com.tangcz.javatec01.pair;

/**
 * @author 月汐
 * @date 2019/09/29 10:49
 */
public class PairTest {

    public static void main(String[] args) {
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        Pair<String> minMax = ArrayAlg.minMax(words);
        System.out.println("min = " + minMax.getFirst());
        System.out.println("max = " + minMax.getSecond());
    }

}

class ArrayAlg {

    public static Pair<String> minMax(String[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        String min = a[0];
        String max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }
            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }
        }

        return new Pair<>(min, max);
    }

}