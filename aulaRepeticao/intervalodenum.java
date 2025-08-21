package aulaRepeticao;

import java.util.Scanner;

public class intervalodenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();
        int inicio=0, meio=0, fim =0;
        while (valor >= 0) {
            if (valor < 26 ) {
                inicio++;
            }
            else if (valor< 51) {
                meio++;
            }
            else {
                fim++;
            }
            System.out.print("Digite um valor: ");
            valor = sc.nextInt();
        }
        System.out.printf("Quantidade de numeros digitados: \nDe 0 a 25: %d \nDe 26 a 50: %d \nMaiores que 50: %d\n",inicio,meio,fim);

        sc.close();
    }
}
