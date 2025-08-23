package lista_atividade1;

import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float parafuso = 2f, porcas  = 3f, arruelas = 4f;
        int pcount = 0, pocount = 0, acount = 0;
        String nome;
        int recebe, qtd ;
        do {
            System.out.println("--- ITENS ---");
            System.out.printf("1-Parafuso \n2-Porcas \n3-Arruelas \n4-Sair");
            recebe = sc.nextInt();
            System.out.println("Quantos itens voce deseja: ");
            qtd = sc.nextInt();
            switch (recebe) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;        
                case 4: 
                    break;
                default:
                    break;
            }
        } while (recebe != 4);

        sc.close();
    }
}
