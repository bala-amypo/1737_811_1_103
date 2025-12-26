
package com.example.demo.util;

import java.time.LocalTime;

public class TimeUtils {
    public static long minutesBetween(LocalTime s, LocalTime e) {
        return java.time.Duration.between(s, e).toMinutes();
    }
}
