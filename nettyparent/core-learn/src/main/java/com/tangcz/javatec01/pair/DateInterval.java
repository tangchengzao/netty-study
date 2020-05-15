package com.tangcz.javatec01.pair;

import java.time.LocalDate;

/**
 * @author 月汐
 * @date 2019/09/29 13:56
 */
public class DateInterval extends Pair<LocalDate> {

    @Override
    public void setSecond(LocalDate second) {
        if (second.compareTo(getFirst()) >= 0) {
            super.setSecond(second);
        }
    }

}
