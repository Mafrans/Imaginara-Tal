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

    public ComplexDouble arg() {
        throw new UnsupportedOperationException("Not Implemented Yet");
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
