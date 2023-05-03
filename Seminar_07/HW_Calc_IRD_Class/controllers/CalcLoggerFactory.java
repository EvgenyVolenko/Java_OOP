package Seminar_07.HW_Calc_IRD_Class.controllers;

import Seminar_07.HW_Calc_IRD_Class.model.Calculable;
import Seminar_07.HW_Calc_IRD_Class.model.Calculator;
import Seminar_07.HW_Calc_IRD_Class.model.ICalculableFactory;
import Seminar_07.HW_Calc_IRD_Class.model.IrDigit;

public class CalcLoggerFactory implements ICalculableFactory {

    private Loggable loggable;

    public CalcLoggerFactory(Loggable loggable) {
        this.loggable = loggable;
    }

    @Override
    public Calculable create(IrDigit primaryArg) {
        return new CalcLogger(new Calculator(primaryArg), loggable);
    }
}
