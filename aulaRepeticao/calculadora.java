package aulaRepeticao;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao, n1, n2;
        do {
            System.out.println("--- CALCULADORA ---");
            System.out.println("1- Soma");
            System.out.println("2- Subtrair");
            System.out.println("0- Sair");
            System.out.println("Digite a opcao: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("N1: ");
                    n1 = sc.nextInt();
                    System.out.print("N2: ");
                    n2 = sc.nextInt();
                    System.out.println("Soma: "+ (n1+n2));
                    break;
                case 2: 
                    System.out.print("N1: ");
                    n1 = sc.nextInt();
                    System.out.print("N2: ");
                    n2 = sc.nextInt();
                    System.out.println("Subtracao: "+ (n1-n2));
                    break;
                case 0:
                    System.out.println("=== FIM ===");
                    break;
            
                default:
                    System.out.println("Opcao invalida!");
            }
            
        } while (opcao != 0);
        sc.close();
    }
}
