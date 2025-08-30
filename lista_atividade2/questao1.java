package lista_atividade2;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = {8, -2, 15, 0, 22, -5, 7, 1};
        //item 1
        int contPosi = 0, contNegat= 0, contZero = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                contPosi++;
            }
            else if (vetor[i] < 0) {
                contNegat++;
            }
            else{
                contZero++;
            }
        }

        //item 2
        int divisivelPor2 = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0 ){
                divisivelPor2 += vetor[i];
            }
        }
        //item 3
        int maior = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]> maior) {
                maior = vetor[i];
            }
        }

        System.out.println("Positivos: "+contPosi);
        System.out.println("Negativo: "+contNegat);
        System.out.println("Zeros: " + contZero);
        System.out.println("Soma pares: "+divisivelPor2);
        System.out.println("Maior: "+maior);
        sc.close();
    }
}
