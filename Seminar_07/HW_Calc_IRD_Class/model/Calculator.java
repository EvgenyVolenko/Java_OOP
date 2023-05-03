package Seminar_07.HW_Calc_IRD_Class.model;

public final class Calculator implements Calculable {

    private IrDigit primaryArg;

    public Calculator(IrDigit primaryArg) {

        this.primaryArg = primaryArg;
    }

    @Override
    public Calculable sum(IrDigit arg) {
        primaryArg.setMaterial(primaryArg.getMaterial() + arg.getMaterial());
        primaryArg.setImaginary(primaryArg.getImaginary() + arg.getImaginary());
        return this;
    }

    @Override
    public Calculable sub(IrDigit arg) {
        primaryArg.setMaterial(primaryArg.getMaterial() - arg.getMaterial());
        primaryArg.setImaginary(primaryArg.getImaginary() - arg.getImaginary());
        return this;
    }

    @Override
    public Calculable multi(IrDigit arg) {
        int temp = primaryArg.getMaterial();
        primaryArg.setMaterial(
                primaryArg.getMaterial() * arg.getMaterial() - primaryArg.getImaginary() * arg.getImaginary());
        primaryArg.setImaginary(primaryArg.getImaginary() * arg.getMaterial() + arg.getImaginary() * temp);
        return this;
    }

    @Override
    public IrDigit getResult() {
        return primaryArg;
    }
}
