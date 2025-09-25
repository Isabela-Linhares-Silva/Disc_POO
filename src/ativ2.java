package src;

public class ativ2 {
    public static void main(String[] args) {
        AulaEstudante aluno1 = new AulaEstudante("Isabela", 20,"088.025","123.456.789-00";);
        AulaEstudante aluno2 = new AulaEstudante();// construtores padrão(vazios)
        aluno2.nome= "Joao";
        aluno2.idade = 20;
        aluno2.matricula = "095.458";
        aluno2.CPF = "987.654.321-00";

        System.out.println(aluno1.nome + ' '+ aluno1.idade+ ' '+aluno1.matricula+ ' '+ aluno1.CPF);
    }
    
}
