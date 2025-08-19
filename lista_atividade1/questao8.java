package lista_atividade1;

import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe as tres notas do aluno: ");
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();

        float notaFinal = (n1*2f + n2*3f+ n3*5f)/10;
        System.out.println("A nota final foi: "+ notaFinal);

        sc.close();
    }
        
}
