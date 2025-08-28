package vetor_e_matriz;

import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Matriz %d: ", i);
                matriz[i][j] = sc.nextInt();
            }
            
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (i==j) {
                    System.out.printf("Matriz [%d][%d]: %d\n", i,j,matriz[i][j]);
                }
                else
                    System.out.print("* ");
            }
            
        }

        sc.close();
    }
}
