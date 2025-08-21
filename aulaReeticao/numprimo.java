package aulaReeticao;

import java.util.Scanner;

public class numprimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um numero|| ");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i ==0) {
                count++;
            }
        }
        if (count <= 2) {
            System.out.println("primo!");
        }
        else
            System.out.println("Nao primo!");

        sc.close();
    }
}
