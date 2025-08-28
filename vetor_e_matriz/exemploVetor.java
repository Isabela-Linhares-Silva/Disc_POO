package vetor_e_matriz;

import java.util.Scanner;

public class exemploVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[4];
        vetor[0] = 1;
        System.out.println(vetor.length);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor para o vetor["+i+"]: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor["+i+"]: "+vetor[i]);
        }
        sc.close();
    }
}
