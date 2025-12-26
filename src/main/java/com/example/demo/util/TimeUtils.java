package com.example.demo.util;

import java.time.LocalTime;
import java.time.Duration;

public class TimeUtils {

    /**
     * Calculate minutes between two LocalTime instances
     *
     * @param start Start time
     * @param end   End time
     * @return long Minutes difference
     */
    public static long minutesBetween(LocalTime start, LocalTime end) {
        if (start == null || end == null) return 0;
        return Duration.between(start, end).toMinutes();
    }
}
