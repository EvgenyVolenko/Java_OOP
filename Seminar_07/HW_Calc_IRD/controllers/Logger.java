package Seminar_07.HW_Calc_IRD.controllers;

import java.util.Date;

public class Logger implements Loggable {

    @Override
    public void log(String message) {
        DateToString dateTS = new DateToString(null);
        dateTS.setDate(new Date());
        System.out.printf("%s \n %s", dateTS.toString(), message);
    }
}