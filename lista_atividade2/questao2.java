package lista_atividade2;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000;
        double deposito;
        double saque;
        int menu;
        do {
            System.out.println("=== MENU ===");
            System.out.println("1- Ver Saldo");
            System.out.println("2- Depositar");
            System.out.println("3- Sacar");
            System.out.println("4- Sair");
            System.out.println("=== ==== ===");
            System.out.print("Escolha: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Seu saldo no momento eh: "+ saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor que gostaria de depositar: ");
                    deposito = sc.nextDouble();
                    saldo += deposito;
                    break;
                case 3:
                    System.out.println("Informe o valor que gostaria de sacar: ");
                    saque = sc.nextDouble();
                    saldo -= saque;
                    break;
                case 4:
                    System.out.println("Finalizado!!");
                    break;            
            
                default:
                    System.out.println("Digite um valor valido!");
                    break;
                } 
        } while (menu!=4);
        
        sc.close();
    }
}
