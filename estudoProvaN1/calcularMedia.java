package estudoProvaN1;

import java.util.Scanner;

public class calcularMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float media=0, maiornota = 0;
        float notas[] = new float[3];
        System.out.print("Digite 3 notas: ");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextFloat();
            media += notas[i];
            if (notas[i]> maiornota) {
                maiornota = notas[i];
            }
        } 
        System.out.println("A media da turma foi: "+media/notas.length);
        System.out.println("Maior nota da turma: "+maiornota);        

        sc.close();
    }
}
