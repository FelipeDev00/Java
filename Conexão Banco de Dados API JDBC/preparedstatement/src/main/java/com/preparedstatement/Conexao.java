package com.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    Connection conn;

    public String url = "jdbc:mysql://localhost:3306/nome_do_banco";
    public String user = ""; //Nome do usuário MySQL
    public String password = ""; //Senha do usuário MySQL


    public boolean conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Driver JDBC carregado");
            System.out.println("Conexão realizada com sucesso");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Driver JDBC não encontrado.");
            System.out.println("Falha na conexão com o banco de dados:" + ex.getMessage());
            return false;
        }
    }
    public void desconectar(){
        try {
            conn.close();
        } catch (SQLException sqle) {
        }
    }
}
