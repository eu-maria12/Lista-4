import java.util.Scanner;

public class oito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    double numero;
    double metade;

        for(int i=1; i<=10; i++){
            System.out.println("Número " + i + ":");
            numero = input.nextDouble();

            metade = numero / 2;
            System.out.println("A metade de " + numero + " é: " + metade);
        }
    }
}