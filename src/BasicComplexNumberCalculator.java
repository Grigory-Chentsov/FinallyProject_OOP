// Реализация интерфейса ComplexNumberCalculator
class BasicComplexNumberCalculator implements ComplexNumberCalculator {
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        double realSum = a.getReal() + b.getReal();
        double imaginarySum = a.getImaginary() + b.getImaginary();
        return new ComplexNumber(realSum, imaginarySum);
    }

    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double real = (a.getReal() * b.getReal()) - (a.getImaginary() * b.getImaginary());
        double imaginary = (a.getReal() * b.getImaginary()) + (a.getImaginary() * b.getReal());
        return new ComplexNumber(real, imaginary);
    }

    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        double real = ((a.getReal() * b.getReal()) + (a.getImaginary() * b.getImaginary())) / (Math.pow(b.getReal(), 2) + Math.pow(b.getImaginary(), 2));
        double imaginary = ((a.getImaginary() * b.getReal()) - (a.getReal() * b.getImaginary())) / (Math.pow(b.getReal(), 2) + Math.pow(b.getImaginary(), 2));
        return new ComplexNumber(real, imaginary);
    }
}
