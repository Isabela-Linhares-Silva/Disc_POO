package vetor_e_matriz;

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite um valor: ");
                matriz[i][j] = sc.nextInt();
                matriz[i][j] *= 10;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Matriz[%d][%d]: %d\n",i,j,matriz[i][j]);
            }
        }
        sc.close();
    }
}
