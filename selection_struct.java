import java.util.Scanner;

public class selection_struct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        if (num%2 ==0) {
            System.out.println("E par");
        }

        System.out.print("Altura: ");
        float altura = sc.nextFloat();//recebe com "," e nao "."
        System.out.print("Idade: ");
        int idade = sc.nextInt();

        if ((idade>18) && (altura>1.6f)){
            System.out.println("Classificado!");
        }
        else
            System.out.println("Desclassificado!");


        int age = 10;
        String a = age >= 18 ? "Maior" : "Menor";

        System.out.println(a);
        sc.close();
    }
}