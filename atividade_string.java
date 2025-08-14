import java.util.Scanner;

public class atividade_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = sc.nextLine();
        System.out.println("Length: "+word.length());
        System.out.println("First caracter: "+word.charAt(0));
        System.out.println("toLower: "+word.toLowerCase());
        System.out.println("toUpper: "+word.toUpperCase());

        sc.close();
    }
}
