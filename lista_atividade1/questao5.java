package lista_atividade1;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float comprimento, altura, largura;

        System.out.print("Informe o comprimento: ");
        comprimento = sc.nextFloat();
        System.out.print("Informe a altura: ");
        altura = sc.nextFloat();
        System.out.print("Informe a largura: ");
        largura = sc.nextFloat();

        float volume = comprimento * altura * largura;

        System.out.println("O volume da caixa retangular e: "+ volume );
        sc.close();
    }
}
