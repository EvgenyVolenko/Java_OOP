package Seminar_07.HW_Calc_IRD_Class.controllers;

import Seminar_07.HW_Calc_IRD.model.Calculable;

public class CalcLogger implements Calculable {

    private Calculable calculable;
    private Loggable loggable;

    public CalcLogger(Calculable calculable, Loggable loggable) {
        this.calculable = calculable;
        this.loggable = loggable;
        loggable.log(String.format("Число z = %d + (%d) * i \n", calculable.getResult()[0], calculable.getResult()[1]));
    }

    @Override
    public Calculable sum(int[] arg) {
        loggable.log(String.format("Прибавляем z = %d + (%d) * i \n", arg[0], arg[1]));
        return calculable.sum(arg);
    }

    @Override
    public Calculable multi(int[] arg) {
        loggable.log(String.format("Умножаем на z = %d + (%d) * i \n", arg[0], arg[1]));
        return calculable.multi(arg);
    }

    @Override
    public int[] getResult() {
        int[] res = calculable.getResult();
        return res;
    }
}
