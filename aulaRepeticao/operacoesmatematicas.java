package aulaRepeticao;

import java.util.Scanner;

public class operacoesmatematicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        double num = sc.nextDouble();
        int opt;
        do {
            System.out.println(" ");
            System.out.println("=== Opcoes ===");
            System.out.println("101- Raiz quadrada");
            System.out.println("102- Metade");
            System.out.println("103- 10% do valor");
            System.out.println("104- Dobro");
            System.out.println("0- Sair");
            System.out.println("Digite sua opcao:  ");
            opt = sc.nextInt();
            switch (opt) {
                case 101:
                    System.out.printf("A raiz de %f eh %f\n", num, Math.sqrt(num));
                    break;
                case 102:
                    System.out.println("A metade de "+ num + " eh "+ num/2);
                    break;
                case 103:
                    System.out.println("10% de " + num + " eh" + (num *0.1));
                    break;
                case 104:
                    System.out.println("O dobro do valor digitado eh: "+ num *2);
                    break;
                case 0:
                    System.out.println("== FIM ==");
                    break;        
            
                default:
                    System.out.println("Voce digitou um valor invalido");
                    break;
            }
            
        } while (opt != 0);

        sc.close();
    }
}
