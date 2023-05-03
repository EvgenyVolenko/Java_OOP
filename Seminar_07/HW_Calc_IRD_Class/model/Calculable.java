package Seminar_07.HW_Calc_IRD_Class.model;

public interface Calculable {

    Calculable sum(IrDigit arg);

    Calculable sub(IrDigit arg);

    Calculable multi(IrDigit arg);

    IrDigit getResult();
}
