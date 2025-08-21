package aulaRepeticao;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login = "Isabela";
        String senha = "ifce";
        String recebeLogin, recebeSenha;
        do {
            System.out.println("Digite seu login: ");
            recebeLogin = sc.next();
            System.out.println("Digite sua senha: ");
            recebeSenha = sc.next();
            if (login.equals(recebeLogin) && senha.equals(recebeSenha)) {
                System.out.println("Seja bem-vind@!!");
            } 
            else
                System.out.println("Acesso negado");
        } while (!senha.equals(recebeSenha)|| !login.equals(recebeLogin));
        

        sc.close();
    }
}
