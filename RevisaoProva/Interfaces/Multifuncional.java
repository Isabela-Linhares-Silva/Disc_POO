package RevisaoProva.Interfaces;

public class Multifuncional implements Impressora,Scanner {

    @Override
    public String digitalizar() {
        return "Digitalizando na multifuncional";
    }

    @Override
    public void imprimir(String documento) {
        System.out.println("Imprimindo na multifuncional");
    }
    
}
