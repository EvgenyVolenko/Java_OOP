package Seminar_07.HW_Calc_IRD.view;

import java.util.Scanner;

import Seminar_07.HW_Calc_IRD.model.Calculable;
import Seminar_07.HW_Calc_IRD.model.ICalculableFactory;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {

        while (true) {

            int[] primaryArg = promptComplex("Введите первый аргумент (вещественная часть, а затем мнимая): ");
            Calculable calculator = calculableFactory.create(primaryArg);

            while (true) {

                String cmd = prompt("Введите команду (*, +, =) : ");
                if (cmd.equals("*")) {
                    int[] arg = promptComplex("Введите второй аргумент (вещественная часть, а затем мнимая): ");
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                    int[] arg = promptComplex("Введите второй аргумент (вещественная часть, а затем мнимая): ");
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    int[] result = calculator.getResult();
                    System.out.printf("Результат z = %d + (%d) * i \n", result[0], result[1]);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
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

    private int[] promptComplex(String message) {

        Scanner in = new Scanner(System.in);
        System.out.print(message);
        int[] arr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(in.nextLine());
        }
        return arr;
    }
}
