package lista_atividade1;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para saber o quadrado e o cubo: ");
        int num = sc.nextInt();


        System.out.println("Quadrado: "+ Math.pow(num, 2));
        System.out.println("Cubo: "+Math.pow(num, 3));

        sc.close();
    }
}
