package Excecoes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
    private Integer numerodoQuarto;
    private Date checkIn;
    private Date checkOut;

    public Reserva(Integer numerodoQuarto, Date checkIn, Date checkOut) throws DateException{
        if(checkIn.after(checkOut))
            throw new DateException("Datas invalidas");
        this.numerodoQuarto = numerodoQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long duracao(){
        long diff = checkOut.getTime()-checkIn.getTime();
        return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
    }

    public void atualizarDatas (Date checkIn, Date checkOut){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public void exibirReserva(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Quarto: "+ numerodoQuarto);
        System.out.println("Check-in: "+ sdf.format(checkIn));
        System.out.println("Check-out: "+ sdf.format(checkOut));


    }

}