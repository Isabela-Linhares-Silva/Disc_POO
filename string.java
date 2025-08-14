import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "Maria";
        String b = "maria";
        if (a.equals(b)) {
            System.out.println("Iguais");
        }
        System.out.println(a.length());
        System.out.println(b.charAt(0));//mostra o primeiro caractere da string
        System.out.println(b.charAt(b.length()-1));//pega o ultimo caractere da string, pelo tamanho e "tira" o \n
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());

        

        sc.close();
    }
}
