import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    Connection conn;

    public String url = "jdbc:mysql://localhost:3306/exemplo_senac"; //Nome da base de dados
    public String user = "root"; //nome do usuário do MySQL
    public String password = "Mago@eletrico0000"; //senha do MySQL 

    public boolean conectar(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão realizada com sucesso");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Falha na conexão com o banco " + ex.getMessage());
            return false;
        }
    }
    public void desconectar() {
        try {
            conn.close();
        } catch (SQLException ex) {
            
        }
    }
}
