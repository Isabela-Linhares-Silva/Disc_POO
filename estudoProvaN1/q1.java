package estudoProvaN1;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        int idade = sc.nextInt();
        double salario = sc.nextDouble();

        System.out.printf("Ola %s, voce tem %d anos e ganha R$ %.2f",nome,idade,salario);

        sc.close();
    }
}
