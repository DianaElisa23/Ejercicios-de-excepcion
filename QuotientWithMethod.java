import java.util.Scanner;

public class QuotientWithMethod {
    public static int quotient(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("Error: Divisor no puede ser cero");
            return -1; 
        }
        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa dos numeros: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int resultado = quotient(number1, number2);
        if (resultado != -1) { 
            System.out.println(number1 + "/" + number2 + " es " + resultado);
        }
    }
}
