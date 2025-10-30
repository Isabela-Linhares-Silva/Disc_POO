package Excecoes;

import java.util.Date;
public class Main {
    public static void main(String[] args) {

        Date ci = new Date("2025/10/10");
        Date co = new Date("2025/10/11");

        try{
            Reserva r = new Reserva(5,ci,co);
            r.exibirReserva();
        }
        catch(DateException e){
            System.out.println(e.getMessage());

        }
    }
}
