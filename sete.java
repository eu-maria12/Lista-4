import java.util.Scanner;

public class sete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        int quantMaior = 0;

        for(int i= 1; i <=10; i++){
            System.out.println("Digite sua idade" + i + ":");
            idade = input.nextInt();

            if(idade >= 18){
                quantMaior++;
            }
        }
        System.out.println("Quantidade de pessoas que tem 18 anos ou mais: " + quantMaior);

        }
    }

