import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Conexao conector = new Conexao();
            conector.conectar();

            Statement st = conector.conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM usuario"); //variavel da classe ResultSet para receber o valor da consulta
            rs.next();
            System.out.println(rs.getInt("COUNT(*)"));
            
        } catch (SQLException ex) {
            
        }
    }
}