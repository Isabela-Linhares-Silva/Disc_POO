package lista_atividade1;

import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe 3 valores: ");
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int v3 = sc.nextInt();

        if (v1>v2 && v1>v3) {//v1 é maior
            if (v2 > v3) { // v2 o do meio
                System.out.println(" em ordem crescente: " + v3 + v2 + v1);
            }
            else //v3 o do meio
                System.out.println(" em ordem crescente: " + v2 + v3 + v1);
        }
        else if (v2 > v3) {// v2 é maior
            if (v1 > v3) {
                System.out.println(" em ordem crescente: " + v3 + v1 + v2);
            }
            else 
                System.out.println(" em ordem crescente: " + v1 + v3 + v2);   
        }
        else{// v3 é maior
            if (v1>v2) {
                System.out.println(" em ordem crescente: " + v2 + v1 + v3);
            }
            else
                System.out.println(" em ordem crescente: " + v1 + v2 + v3);
        }
        sc.close();
    }
}
