package Seminar_07.HW_Calc_IRD_Class.view;

import java.util.Scanner;

import Seminar_07.HW_Calc_IRD_Class.model.Calculable;
import Seminar_07.HW_Calc_IRD_Class.model.ICalculableFactory;
import Seminar_07.HW_Calc_IRD_Class.model.IrDigit;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {

        while (true) {

            IrDigit primaryArg = promptComplex("Введите первый аргумент (вещественная часть, а затем мнимая): ");
            Calculable calculator = calculableFactory.create(primaryArg);

            while (true) {

                String cmd = prompt("Введите команду (*, +, -, =) : ");
                if (cmd.equals("*")) {
                    IrDigit arg = promptComplex("Введите второй аргумент (вещественная часть, а затем мнимая): ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    IrDigit arg = promptComplex("Введите второй аргумент (вещественная часть, а затем мнимая): ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("-")) {
                    IrDigit arg = promptComplex("Введите второй аргумент (вещественная часть, а затем мнимая): ");
                    calculator.sub(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    IrDigit result = calculator.getResult();
                    System.out.printf("Результат z = %s \n", result.toString());
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equalsIgnoreCase("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {

        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private IrDigit promptComplex(String message) {

        Scanner in = new Scanner(System.in);
        System.out.print(message);
        IrDigit ird = new IrDigit();
        int a = Integer.parseInt(in.nextLine());
        ird.setMaterial(a);
        int b = Integer.parseInt(in.nextLine());
        ird.setImaginary(b);
        return ird;
    }
}
