import java.util.Scanner;

public class quatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = input.nextInt();

            for(int i=1; i<=10; i++){
                System.out.println( numero + "x" + i + "=" + (i*numero));
            }
        }

    }