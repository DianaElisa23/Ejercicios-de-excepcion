import java.util.*;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Ingresa un numero: ");
                int number = input.nextInt();

    
                System.out.println("El numero ingresado es: " + number);

                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Intenta otra vez. (Entrada incorrecta: necesita un número entero)");
                input.nextLine(); 
        } while (continueInput);
    }
}

