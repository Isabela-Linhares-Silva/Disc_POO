package lista_atividade1;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Informe a temperatura em Celsius: ");
        int C = sc.nextInt();
        int F = (9 * C + 160)/5;
        System.out.println(C+ " Celsius em Fahrenheit "+F);
        sc.close();
    }
}
