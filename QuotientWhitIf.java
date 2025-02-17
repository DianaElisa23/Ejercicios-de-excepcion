import java.util.Scanner;
public class QuotientWhitIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa dos numeros: ");
        int  numero1 = input.nextInt(); 
        int numero2 = input.nextInt();

        if (numero2 != 0){
            System.out.println(numero1 + "/" + numero2 + "es" + (numero1 / numero2));
        }
        else{
            System.out.println("El divisor no puede ser cero");
        }
    }
}
