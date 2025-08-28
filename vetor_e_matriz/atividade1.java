package vetor_e_matriz;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet1[] = new int[3];
        int vet2[] = new int[3];
        int uniao[] = new int[6];
        for (int i = 0; i < vet1.length; i++) {
            System.out.printf("Digite o valor para o vetor 1[%d]: ",i);
            vet1[i] = sc.nextInt();
            System.out.printf("Digite o valor para o vetor 2[%d]: ",i);
            vet2[i] = sc.nextInt();
        }

        for (int i = 0; i < vet1.length; i++) {
            uniao[i] = vet1[i];
        }

        for (int i = 0; i < vet2.length; i++) {
            uniao[i+3] = vet2[i];
        }

        for (int i = 0; i < uniao.length; i++) {
            System.out.printf("vetor[%d] = %d\n",i,uniao[i]);
        }

        sc.close();
    }
}
