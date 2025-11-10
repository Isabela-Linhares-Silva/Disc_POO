package Excecoes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class MainDB {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement st = null;
        //ResultSet rs = null;  como nao buscar nada nao vai utilizar
        try{
            //BUSCAR NO BANCO
            // conn = DB.getConn();
            // st = conn.createStatement();
            // rs = st.executeQuery("select * from aluno");

            // while (rs.next()) {
            //     System.out.println(rs.getString("nome")+ " " + rs.getString("cpf"));
            // }

            //INSERIR NO BANCO

            conn = DB.getConn();
            st = conn.prepareStatement("insert into aluno(nome,cpf) values (?,?)");
            st.setString(1,"Josefina");
            st.setString(2,"444.444.444-44");
            st.executeUpdate();
            st.setString(2,"444.444.444-44");
            st.executeUpdate();

        }
        catch(SQLException e){
            throw new RuntimeException(e);
        } finally{
            //DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
    
}
