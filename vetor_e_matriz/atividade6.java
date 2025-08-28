package vetor_e_matriz;

import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] =  new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite um numero: ");
                matriz[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    System.out.printf("Matriz[%d][%d]: %d\n",i,j,matriz[i][j]);
                }
            }
        }

        sc.close();
    }
}
