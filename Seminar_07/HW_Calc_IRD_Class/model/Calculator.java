package Seminar_07.HW_Calc_IRD_Class.model;

public final class Calculator implements Calculable {

    private int[] primaryArg;

    public Calculator(int[] primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculable sum(int[] arg) {
        for (int i = 0; i < arg.length; i++) {
            primaryArg[i] += arg[i];
        }
        return this;
    }

    @Override
    public Calculable multi(int[] arg) {
        int temp = primaryArg[0];
        primaryArg[0] = primaryArg[0] * arg[0] - primaryArg[1] * arg[1];
        primaryArg[1] = primaryArg[1] * arg[0] + arg[1] * temp;
        return this;
    }

    @Override
    public int[] getResult() {
        return primaryArg;
    }
}
