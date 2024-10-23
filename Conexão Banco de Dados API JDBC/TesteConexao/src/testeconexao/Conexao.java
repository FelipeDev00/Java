package testeconexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {

    Connection conn; //Criando um objeto do tipo connection


    //Criação das variáveis com a url, user e senha do banco de dados
    public String url = "jdbc:mysql://localhost:3306/nome_do_banco";
    public String user = ""; //Nome do usuário MySQL
    public String password = ""; //Senha do usuário MySQL

    //Criação do método boolean para validar a conexão com o banco de dados
    public boolean conectar(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão realizada com sucesso");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Falha na conexão com o banco de dados " + ex.getMessage());
            return false;
        }
    }

    //Criação do método para fechar a conexão com o banco de dados
    public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
            
        }
    }

}
