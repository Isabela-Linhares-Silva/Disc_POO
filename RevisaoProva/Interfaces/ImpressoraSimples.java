package RevisaoProva.Interfaces;

public class ImpressoraSimples implements Impressora {

    @Override
    public void imprimir(String documento) {
        System.out.println("Imprimindo "+ documento + "...");
    }
    
}
