import java.util.Scanner;

public class other_selection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu codigo de comprador: ");
        System.out.printf("1-Comum\n2-Funcionario\n3-Vip\n");
        int tipo = sc.nextInt();
        System.out.print("Informe o valor da compra: ");
        float valor = sc.nextFloat();
        float novo_valor=0;
        switch (tipo) {
            case 1:
                novo_valor = valor;
                break;
            case 2:
                novo_valor = valor -(valor *0.1f);
                break;
            case 3:
                novo_valor = valor - (valor *0.05f);
                break;
            default:
                System.out.println("Valor invalido");
                break;
            
        }

        System.out.println("O valor final da compra sera: R$"+ novo_valor);
        sc.close();
    }
}