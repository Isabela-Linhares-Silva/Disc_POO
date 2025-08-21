package aulaRepeticao;

import java.util.Scanner;

public class somapares{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        int num = sc.nextInt();
        int soma = 0;
        while (num > 0) {
            if (num % 2 == 0 ) {
                soma+= num;
            }
            System.out.print("Informe um numero: ");
            num = sc.nextInt();
        }
        System.out.println("A soma dos numeros pares: "+ soma);

        sc.close();
   } 
    
}