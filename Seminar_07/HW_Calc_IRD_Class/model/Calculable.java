package Seminar_07.HW_Calc_IRD_Class.model;

public interface Calculable {

    Calculable sum(int[] arg);

    Calculable multi(int[] arg);

    int[] getResult();
}
