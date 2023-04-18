package Seminar_07.HW_Calc_IRD.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {

    private Date date;
    private SimpleDateFormat formatForDate = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    public DateToString(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return formatForDate.format(date);
    }
}
