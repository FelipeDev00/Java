package com.conexaoscanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    //Criando um objeto do tipo conexão para conectar com o banco de dados
    Connection conn;

    //Criação das variáveis com a url, user e senha do banco de dados
    public String url = "jdbc:mysql://localhost:3306/escola";
    public String user = "root";
    public String password = "Mago@eletrico0000";

    //Criação do método boolean para validar a conexão com o banco de dados em Main
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
    //Criação do método para fechar a conexão com o banco de dados
    public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {}
    }
}
