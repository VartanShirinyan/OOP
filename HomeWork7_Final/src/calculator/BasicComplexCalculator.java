package calculator;

import logger.Logger;

public class BasicComplexCalculator implements ComplexCalculator {
    private final Logger logger;

    public BasicComplexCalculator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        logger.log("Сложение " + a + " и " + b);
        return new ComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        logger.log("Умножение " + a + " и " + b);
        double realPart = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginaryPart = a.getImaginary() * b.getReal() + a.getReal() * b.getImaginary();
        return new ComplexNumber(realPart, imaginaryPart);
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        logger.log("Деление " + a + " на " + b);
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        if (denominator == 0) {
            throw new ArithmeticException("Ошибка: Делить на ноль нельзя.");
        }
        double realPart = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        double imaginaryPart = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
