package com.kfh.java.library;

import org.junit.Test;

import java.util.Calendar;

/**
 * @author: kfhu
 * @date: 2018/7/26
 * @description:
 */
public class TimeTest {

    @Test
    public void testCalendar(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR_OF_DAY,1);
        System.out.println(calendar.getTime());
    }
}
