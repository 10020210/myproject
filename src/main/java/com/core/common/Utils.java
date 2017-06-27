package com.core.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import com.core.exception.InvalidDataException;

public class Utils {

    private static final org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(Utils.class);

    // protected static final SimpleDateFormat iso = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssz");

    public static Date getStartOfWeek(final Date date) {
        final Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        return cal.getTime();
    }

    public static Date getEndOfWeek(final Date date) {
        final Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
        return cal.getTime();
    }

    public static Date getStartOfMonth(final Date date) {
        final Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DATE, 1);
        return cal.getTime();
    }

    public static Date getEndOfMonth(final Date date) {
        final Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.DATE, 1);
        cal.add(Calendar.MONTH, 1);
        cal.add(Calendar.DATE, -1);
        return cal.getTime();

    }

    public static Date getDateValue(final String strDate) throws InvalidDataException {
        try {
            final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            if (strDate != null) {
                sdf.parse(strDate); // just check the format if not throws error
                return new DateTime(strDate + "T00:00:00.000Z").toDate();
            } else {
                throw new InvalidDataException("date.missing");
            }
        } catch (final Exception e) {
            LOG.error("Date value parsing failed", e);
            e.printStackTrace();
            throw new InvalidDataException("date.missing");
        }
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd", iso = DateTimeFormat.ISO.DATE)
    public static Date getISODateValue(final String strDate) throws InvalidDataException {
        return getDateValue(strDate);
    }

    public static double round(final double value, final int places) {
        // if (places < 0)
        // throw new IllegalArgumentException();
        //
        // long factor = (long) Math.pow(10, places);
        // value = value * factor;
        // long tmp = Math.round(value);
        //
        // return (double) tmp / factor;

        return Double.parseDouble(String.format("%.0" + places + "f", value));
    }
}
