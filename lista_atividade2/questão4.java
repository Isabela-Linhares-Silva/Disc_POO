package lista_atividade2;

import java.util.Scanner;

public class questão4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float notas[][] = new float[3][2];
        float medias[] = new float[3];
        float mediaGeral=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Digite a nota %d do Aluno %d: ",j+1,i+1);
                notas[i][j]= sc.nextFloat();
                medias[i] += notas[i][j]/2 ;
            }
            
        }
       
        for (int i = 0; i < medias.length; i++) {
            System.out.printf("Media aluno %d: %f\n",i,medias[i]);
            if (medias[i]>=7) {
                System.out.println("Aprovado!");
            }
            else
                System.out.println("Reprovado");
        }

        for (int i = 0; i < medias.length; i++) {
            mediaGeral += medias[i];
        }
        System.out.println("Media geral da turma eh: "+mediaGeral/3);
        

        sc.close();
    }
}
