package RevisaoProva.Excessoes;

public class Main {
    public static void main(String[] args) {
        try{
            Usuario usuario = new Usuario("Joao", 20, "Joaozinho1234@gmail.com");
            usuario.toString();
        }catch(NomeInvalidoException e){
            System.out.println(e.getMessage());
        }catch(IdadeInvalidaException e){
            System.out.println(e.getMessage());
        }catch(EmailInvalidoException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Operacao finalizada");
        }
       
    }

}
