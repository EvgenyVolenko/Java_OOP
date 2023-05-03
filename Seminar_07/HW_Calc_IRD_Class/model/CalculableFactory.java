package Seminar_07.HW_Calc_IRD_Class.model;

public class CalculableFactory implements ICalculableFactory {

    public Calculable create(int[] primaryArg) {
        return new Calculator(primaryArg);
    }
}
