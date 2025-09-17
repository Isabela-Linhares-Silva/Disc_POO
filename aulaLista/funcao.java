package aulaLista;

import java.util.Scanner;

public class funcao {
    public static void main(String[] args) {
        System.out.println(somar(5, 2));
        subtrair(10, 7);
        multiplicar();// ver como resolve
        
    }
    
    public static int somar (int n1,int n2){
        return n1+n2;
    }

    public static void subtrair (int n1,int n2){// poderia deixar duas funções com o mesmo nome bastaria mudar a assinatura, oq recebe
        System.out.println(n1-n2);
    }
    public static int multiplicar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("n1 e n2: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        sc.close();
        return n1*n2;
    }
}


