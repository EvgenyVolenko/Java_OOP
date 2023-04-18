package Seminar_07.DecoratorFactory.calculator;

public class CalcLoggerFactory implements ICalculableFactory {

    private Loggable loggable;

    public CalcLoggerFactory(Loggable loggable) {
        this.loggable = loggable;
    }

    @Override
    public Calculable create(int primaryArg) {
        return new CalcLogger(new Calculator(primaryArg), loggable);
    }
}
