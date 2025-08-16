package lista_atividade1;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o raio da lata: ");
        double raio = sc.nextFloat();
        System.out.print("Informe a altura da lata: ");
        double altura = sc.nextFloat();
        double VOLUME = 3.14159f * Math.pow(raio, 2)* altura;
        System.out.println("O volume da lata de oleo eh: "+ VOLUME);

        sc.close();
    }
}
