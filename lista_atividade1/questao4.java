package lista_atividade1;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A,B, AUX;
        System.out.print("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.print("Digite o valor de A: ");
        B = sc.nextInt();

        System.out.println("Valores antes:");
        System.out.println("A = "+ A);
        System.out.println("B = "+ B);

        AUX = A;
        A = B;
        B = AUX;

        System.out.println("Valores depois:");
        System.out.println("A = "+ A);
        System.out.println("B = "+ B);

        sc.close();
    }
}
