import java.util.Scanner;
public class Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa dos numeros: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {
            System.out.println(number1 + " / " + number2 + " es " + (number1 / number2));
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
}