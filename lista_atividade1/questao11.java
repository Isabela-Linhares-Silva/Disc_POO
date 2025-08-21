package lista_atividade1;

import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();
        int dias = 12 * 30 * idade;
        System.out.println("Voce viveu "+ dias + " dias");
        sc.close();
    }
}
