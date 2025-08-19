package lista_atividade1;

import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int n = sc.nextInt();
        if (n <=10) 
            System.out.println("F1");
        
        else if (n <= 100) 
            System.out.println("F2");
        
        else
            System.out.println("F3");

        sc.close();
    }
}
