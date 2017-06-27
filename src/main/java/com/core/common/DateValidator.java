package com.core.common;

import java.util.Calendar;
import java.util.Date;

public class DateValidator {

    public static boolean isDateEqual(final Date date1, final Date date2) {
        final Calendar c1 = Calendar.getInstance();
        final Calendar c2 = Calendar.getInstance();
        c1.setTime(date1);
        c2.setTime(date2);
        return c1.get(Calendar.DAY_OF_YEAR) == c2.get(Calendar.DAY_OF_YEAR);
    }

    public static boolean isPreviousDate(final Date myDate) {
        final Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int day = calendar.get(Calendar.DAY_OF_YEAR);

        final Calendar now = Calendar.getInstance();
        now.setTime(myDate);
        final int selectedYear = now.get(Calendar.YEAR);
        final int selectedDay = now.get(Calendar.DAY_OF_YEAR);

        return (year > selectedYear) || ((year == selectedYear) && (day > selectedDay));
    }

    public static boolean isFutureDate(final Date myDate) {
        final Calendar calendar = Calendar.getInstance();
        final Calendar now = Calendar.getInstance();
        now.setTime(myDate);
        long effectiveDiff = (calendar.getTime().getTime() - now.getTime().getTime()) / 1000 / 60;
        // Kiritimati island is +14:00 of UTC
        return effectiveDiff < -840;
    }

}
