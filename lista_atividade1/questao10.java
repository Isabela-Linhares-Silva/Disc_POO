package lista_atividade1;

import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] vendas = new float[3];     // vendas
        float[] comissao = new float[3]; // comissão calculada

        float totalVendas = 0;

        // Entrada de dados
        for (int i = 0; i < 3; i++) {
            System.out.print("Informe o valor de venda: ");
            vendas[i] = sc.nextFloat();

            // Cálculo da comissão
            if (vendas[i] > 50000) {
                comissao[i] = vendas[i] * 0.12f;
            } else if (vendas[i] >= 30000) {
                comissao[i] = vendas[i] * 0.095f;
            } else {
                comissao[i] = vendas[i] * 0.07f;
            }

            totalVendas += vendas[i];
        }

        // Relatório
        System.out.println("\n--- Relatorio---");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Vendedor: %d | Vendas: %.2f | Comissao: %.2f%n",i, vendas[i], comissao[i]);
        }

        System.out.printf("\nTotal de vendas: %.2f%n", totalVendas);

        sc.close();
    }
}
