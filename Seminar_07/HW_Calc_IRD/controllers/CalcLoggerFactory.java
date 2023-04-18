package Seminar_07.HW_Calc_IRD.controllers;

import Seminar_07.HW_Calc_IRD.model.Calculable;
import Seminar_07.HW_Calc_IRD.model.Calculator;
import Seminar_07.HW_Calc_IRD.model.ICalculableFactory;

public class CalcLoggerFactory implements ICalculableFactory {

    private Loggable loggable;

    public CalcLoggerFactory(Loggable loggable) {
        this.loggable = loggable;
    }

    @Override
    public Calculable create(int primaryArg) {
        return new CalcLogger(new Calculator(primaryArg), loggable);
    }
}
