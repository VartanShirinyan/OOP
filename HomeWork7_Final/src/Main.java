
import java.io.IOException;
import java.util.Scanner;

import calculator.BasicComplexCalculator;
import calculator.ComplexNumber;
import logger.Logger;

public class Main {
    public static void main(String[] args) {
        try (Logger logger = new Logger("output.txt")) {
            BasicComplexCalculator calculator = new BasicComplexCalculator(logger);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите первое комплексное число (в формате 'a + bi'):");
            ComplexNumber first = inputComplexNumber(scanner);

            System.out.println("Введите второе комплексное число (в формате 'a + bi'):");
            ComplexNumber second = inputComplexNumber(scanner);

            System.out.println("Результаты:");
            System.out.println("Сложение: " + calculator.add(first, second));
            System.out.println("Умножение: " + calculator.multiply(first, second));
            System.out.println("Деление: " + calculator.divide(first, second));
        } catch (IOException e) {
            System.err.println("Ошибка при записи в лог: " + e.getMessage());
        }
    }

    private static ComplexNumber inputComplexNumber(Scanner scanner) {
        while (true) {
            System.out.print("Введите комплексное число (в формате 'a + bi' или 'a-bi'): ");
            String input = scanner.nextLine().trim();
            String regex = "([-+]?[\\d]*\\.?[\\d]+)\\s*([-+])?\\s*(\\d*\\.?\\d+)i"; // Регулярное выражение
            java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
            java.util.regex.Matcher matcher = pattern.matcher(input);

            if (matcher.matches()) {
                double real = Double.parseDouble(matcher.group(1));
                double imaginary = Double.parseDouble(matcher.group(3));
                if (matcher.group(2) != null && matcher.group(2).equals("-")) {
                    imaginary = -imaginary;
                }
                return new ComplexNumber(real, imaginary);
            } else {
                System.out.println("Неверный формат. Пожалуйста, попробуйте снова.");
            }
        }
    }
}
