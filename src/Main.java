// Основной класс для запуска калькулятора комплексных чисел
public class Main {
    public static void main(String[] args) {
        // Создайте экземпляр калькулятора
        ComplexNumberCalculator calculator = new BasicComplexNumberCalculator();

        // Создание комплексных чисел
        ComplexNumber num1 = new ComplexNumber(3.0, 2.0);
        ComplexNumber num2 = new ComplexNumber(1.5, 4.0);

        // Выполнять арифметические операции
        ComplexNumber sum = calculator.add(num1, num2);
        ComplexNumber product = calculator.multiply(num1, num2);
        ComplexNumber quotient = calculator.divide(num1, num2);

        // Зарегистрируйте результаты

        Logger.log("Sum: " + sum.getReal() + " + " + sum.getImaginary() + "i");
        Logger.log("Product: " + product.getReal() + " + " + product.getImaginary() + "i");
        Logger.log("Quotient: " + quotient.getReal() + " + " + quotient.getImaginary() + "i");
    }
}