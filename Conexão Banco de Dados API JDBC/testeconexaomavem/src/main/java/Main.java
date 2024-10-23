
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) throws SQLException {
        Connection conexao = null;
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    conexao = DriverManager.getConnection("jdbc:mysql://localhost/exemplo_senac","root","Mago@eletrico0000");
    System.out.println("Conexão estabelecida com o MySQL e com o banco de dados!");
} catch (ClassNotFoundException ex) {
    System.out.println("Driver do banco de dados não localizado!");
} catch (SQLException ex) {
    System.out.println("Ocorreu um erro ao acessar o banco: "+ ex.getMessage());
} finally {
    if (conexao != null) {
        conexao.close();
    }
}
    }
}