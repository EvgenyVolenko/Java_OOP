package Seminar_07.HW_Calc_IRD_Class;

import Seminar_07.HW_Calc_IRD.controllers.CalcLoggerFactory;
import Seminar_07.HW_Calc_IRD.controllers.Logger;
import Seminar_07.HW_Calc_IRD.model.ICalculableFactory;
import Seminar_07.HW_Calc_IRD.view.ViewCalculator;

public class Main {
    public static void main(String[] args) {

        ICalculableFactory calculableFactory = new CalcLoggerFactory(new Logger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }
}
