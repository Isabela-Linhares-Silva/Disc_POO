package vetor_e_matriz;

import java.util.Scanner;

public class atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[]= new int[20];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o vetor %d: ",i);
            vetor[i] = sc.nextInt();
            if (vetor[i] < 0 ) {
                System.out.println("Digite outro valor: ");
                vetor[i] = sc.nextInt();
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Vetor[%d]: %d\n",i,vetor[i]);
        }
        sc.close();
    }
}
