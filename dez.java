import java.util.Scanner;

public class dez{
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int numero;
        int total = 0;
        int pares = 0; 
        int impares = 0;
        int multiplosDe5 = 0;
    
        System.out.println("Digite algum número de 0 a 10:");
        numero = input.nextInt();

        while(numero != 0) {
                total++;
            if(numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            if (numero % 5 == 0){
                    multiplosDe5++;
            }
             System.out.println("Digite outro número de 0 a 10:");
             numero = input.nextInt();
        }
        System.out.println("Total de números digitados: " + total);
        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
        System.out.println("Múltiplos de 5: " + multiplosDe5);
        System.out.println("Programa encerrado!")
    }
}
