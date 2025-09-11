package lista_atividade2;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSecreto = 75;
        int adivinha;
        System.out.print("Chute um valor para saber se e o numero secreto: ");
        adivinha = sc.nextInt();
        while (adivinha != numSecreto) {
            if (adivinha > numSecreto) {
                System.out.println("Maior");
                System.out.print("Chute outro valor para saber se e o numero secreto: ");
                adivinha = sc.nextInt();
            }
            else{
                System.out.println("Menor");
                System.out.print("Chute outro valor para saber se e o numero secreto: ");
                adivinha = sc.nextInt();
            }
                
        }
        System.out.println("Parabens! Voce acertou o valor!");

        String nome, nome2 ;
        nome = sc.nextLine();
        nome2 = sc.nextLine();

        nome.concat(nome2);
        System.out.println(nome);
        sc.close();
    }
}
