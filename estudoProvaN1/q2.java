package estudoProvaN1;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float peso, altura;
        System.out.println("Informe seu peso e altura: ");
        peso = sc.nextFloat();
        altura = sc.nextFloat();

        float imc = peso /(altura * altura);
        System.out.printf("IMC = %.2f",imc);
        sc.close();
    }
}
