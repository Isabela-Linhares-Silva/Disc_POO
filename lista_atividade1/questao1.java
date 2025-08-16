package lista_atividade1;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int HT,VH,PD;
        System.out.print("Horas trabalhadas no mes: ");
        HT = sc.nextInt();
        System.out.print("Valor hora trabalhada: ");
        VH = sc.nextInt();
        System.out.print("Percentual de desconto: ");
        PD = sc.nextInt();

        int SB = HT * VH; // salário bruto
        float TD = (PD/100f) * SB; // total de desconto
        float SL = SB - TD; // salário líquido 

        System.out.println("Horas trabalhadas: "+ HT);
        System.out.println("Salario Bruto: "+SB);
        System.out.println("Desconto: "+ TD);
        System.out.println("Salario Liquido: "+SL);
        sc.close();
    }
}
