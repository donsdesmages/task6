import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculate.Cal();
    }

     static class Calculate {

        public static void Cal () {

            double num1;
            double num2;
            String symbol;
            double answer = 0;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter numbers for calculation");
            num1 = scanner.nextDouble();
            symbol = scanner.next();
            num2 = scanner.nextDouble();

            switch(symbol)

            {
                case "-": answer = num1 - num2; break;
                case "+": answer = num1 + num2; break;
                case "/": answer = num1 / num2; break;
                case "*": answer = num1 * num2; break;

                default:
                    System.out.println("Вы ввели что-то не то. Введите символ!");
                    return;
            }

            System.out.println(num1 +" "+ num2 +" = " + answer);
        }
    }
}
