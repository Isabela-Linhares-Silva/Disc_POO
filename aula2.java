import java.util.Scanner;

public class aula2 {
    public static void main(String[] args) {
        //Transforma polegadas em cm
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor em polegadas: ");
        float pol = sc.nextFloat();
        float cm = pol*2.54f;//coloca o f só pra reconhecer que é um float
        System.out.println(cm+" cm");

        // Transforma C em F
        System.out.print("Informe a temperatura em Celsius: ");
        float c = sc.nextFloat();
        float f = 1.8f*c + 32;
        System.out.println("Fahrenheit: "+f);
        

        //Area e perimetro
        System.out.print("Informe o valor do raio: ");
        float raio = sc.nextFloat();
        float pi = 3.1415f;
        float area = pi * raio * raio;
        float perimetro= 2* pi*raio;
        System.out.println("Area: "+area);
        System.out.println("Perimetro: "+perimetro);
        sc.close();
    } 
}
