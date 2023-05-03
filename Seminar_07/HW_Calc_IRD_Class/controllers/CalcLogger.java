package Seminar_07.HW_Calc_IRD_Class.controllers;

import Seminar_07.HW_Calc_IRD_Class.model.Calculable;
import Seminar_07.HW_Calc_IRD_Class.model.IrDigit;

public class CalcLogger implements Calculable {

    private Calculable calculable;
    private Loggable loggable;

    public CalcLogger(Calculable calculable, Loggable loggable) {
        this.calculable = calculable;
        this.loggable = loggable;
        loggable.log(String.format("Число z = %s \n", getResult().toString()));
    }

    @Override
    public Calculable sum(IrDigit arg) {
        loggable.log(String.format("Прибавляем z = %s \n", arg.toString()));
        return calculable.sum(arg);
    }

    @Override
    public Calculable sub(IrDigit arg) {
        loggable.log(String.format("Вычитаем z = %s \n", arg.toString()));
        return calculable.sub(arg);
    }

    @Override
    public Calculable multi(IrDigit arg) {
        loggable.log(String.format("Умножаем на z = %s \n", arg.toString()));
        return calculable.multi(arg);
    }

    @Override
    public IrDigit getResult() {
        IrDigit res = calculable.getResult();
        return res;
    }
}
