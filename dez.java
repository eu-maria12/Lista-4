import java.util.Scanner;

public class dez{
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int numero;

        System.out.println("Digite algum número de 0 a 10:");
        numero = input.nextInt();

        while(numero != 0) {
            System.out.println("Você digitou: " + numero + ". Digite outro número: ");
            numero= input.nextInt();
        }
            System.out.println("Você digitou o número 0. Programa encerrado.");
        }
    }