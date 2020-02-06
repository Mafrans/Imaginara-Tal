package me.mafrans.imaginaratal;

public class ComplexDouble {
    private double real;
    private double imaginary;

    public ComplexDouble(double imaginary) {
        this.imaginary = imaginary;
    }

    public ComplexDouble(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public ComplexDouble add(ComplexDouble b) {
        return ComplexDouble.add(this, b);
    }

    public ComplexDouble mult(ComplexDouble b) throws NoSuchMethodException {
        return ComplexDouble.mult(this, b);
    }

    public static ComplexDouble add(ComplexDouble a, ComplexDouble b) {
        double real = a.getReal() + b.getReal();
        double imaginary = a.getImaginary() + b.getImaginary();

        return new ComplexDouble(real, imaginary);
    }

    public static ComplexDouble mult(ComplexDouble a, ComplexDouble b) {
        double r1 = a.getReal() * b.getReal();
        double r2 = a.getImaginary() * b.getImaginary();

        double i1 = a.getImaginary() * b.getReal();
        double i2 = a.getReal() * b.getImaginary();

        double real = r1 - r2;
        double imaginary = i1 + i2;

        return new ComplexDouble(real, imaginary);
    }

    public double arg() {
        return Math.atan2(getReal(), getImaginary());
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComplexDouble that = (ComplexDouble) o;

        if (Double.compare(that.getReal(), getReal()) != 0) return false;
        return Double.compare(that.getImaginary(), getImaginary()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getReal());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getImaginary());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
