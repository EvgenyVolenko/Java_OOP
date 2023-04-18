package Seminar_07.HW_Calc_IRD.model;

public interface Calculable {

    Calculable sum(int[] arg);

    Calculable multi(int[] arg);

    int[] getResult();
}
