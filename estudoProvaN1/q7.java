package estudoProvaN1;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 2 num: ");
        double n1 = sc.nextInt();
        double n2 = sc.nextInt();
        System.out.printf("1-soma\n2-subtrai\n3-multiplica\n4-Divisao\n5-potenciacao\n6-Raiz do primeiro valor\n");
        System.out.print("Informe a opcao: ");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Soma: "+ (n1+n2));
                break;
            case 2:
                System.out.println("Subtracao: "+ (n1-n2));
                break;
            case 3:
                System.out.println("multiplicacao: "+ (n1*n2));
                break;
            case 4: 
                if (n2 == 0) {
                    System.out.println("Nao eh posivel realiza a divisao!");
                }
                else
                    System.out.println("divisao "+ (n1/n2));
                break;
            case 5:
                
                System.out.println("potenciacao: "+ Math.pow(n1, n2));
                break;
            case 6:
                System.out.println("raiz quadrada: "+ Math.sqrt(n1));
                break;
            default:
                System.out.println("Valor invalido");
                break;
            
        }

        sc.close();
    }
}
