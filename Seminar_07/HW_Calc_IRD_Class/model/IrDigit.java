package Seminar_07.HW_Calc_IRD_Class.model;

public class IrDigit {

    private int material;
    private int imaginary;

    public int getMaterial() {
        return material;
    }

    public void setMaterial(int material) {
        this.material = material;
    }

    public int getImaginary() {
        return imaginary;
    }
    
    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {

        StringBuilder res = new StringBuilder();

        if (material < 0) {
            res.append("- ")
               .append(Math.abs(material));
        }
        else {
            res.append(material);
        }

        if (imaginary < 0) {
            res.append(" - ")
               .append(Math.abs(imaginary));
        }
        else {
            res.append(" + ")
               .append(imaginary);
        }
        res.append(" * i");
        return res.toString();
    }
}
