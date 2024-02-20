import java.util.Scanner;


public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите пример: ");
        String input = scanner.nextLine();
        try {
            String[] parts = input.split(" ");
            if (parts.length !=3) {
                throw new IllegalArgumentException("Неправильный формат ввода");
            }
            int a = Integer.parseInt(parts[0]);
            char op = parts[1].charAt(0);
            int b = Integer.parseInt(parts[2]);

            if (a < 1 || a > 10 || b < 1 || b > 10) {
                throw new IllegalArgumentException("Вводимое число должно быть от 1 до 10");
            }
            int result;
            switch (op) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b != 0) result = a / b;
                    else throw new ArithmeticException("Деление на ноль!");
                    break;
                default:
                    throw new IllegalArgumentException("Неверный оператор!");
            }

            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        scanner.close();
    }
}
