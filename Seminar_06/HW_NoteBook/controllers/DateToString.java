package Seminar_06.HW_NoteBook.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {

    private Date date;
    private SimpleDateFormat formatForDate = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss E");

    public DateToString(Date date) {
        this.date = date;
    }

    public Date setDate() {
        return date;
    }

    @Override
    public String toString() {
        return formatForDate.format(date);
    }
}
