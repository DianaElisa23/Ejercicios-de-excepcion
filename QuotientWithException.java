import java.util.Scanner;
public class QuotientWithException {
    public static int quotient(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("El divisor no puede ser cero");
        }
        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa dos numeros: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int resultado = 0; 
        try {
            resultado = quotient(number1, number2);
            System.out.println(number1 + " / " + number2 + " es " + resultado);
        } catch (ArithmeticException ex) {
            System.out.println("Excepcion: un entero no puede ser dividido entre cero ");
        }

        System.out.println("Exepcion sigue");
    }
}
