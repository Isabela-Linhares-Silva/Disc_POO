package aulaLista;

public class verificaPar {
    public static void main(String[] args) {
        par(4);
        
    }

    public static void par(int num) {
        if (num%2==0) {
            System.out.println("PAR ");
        }
        else
            System.out.println("IMPAR ");
    }
}
