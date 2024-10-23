package com.conexao2;

import java.sql.SQLException;
import java.sql.Statement;
public class Main {
    
    public static void main(String[] args)throws Exception {

        Conexao conector = new Conexao();
        Statement stmt = null;

        try {
            conector.conectar();
        } catch (Exception ex) {}

        try {
            stmt = conector.conn.createStatement();
            System.out.println("Pronto para execução de comandos SQL.");
        } catch (SQLException sqle) {
            System.out.println("Erro no acesso ao Banco de Dados: " +
                                                           sqle.getMessage());
        }

        try{
            String sql = null;
        
            sql = "insert into alunos (nome, idade, endereco) values ('Ana','23','Rua 7 de setembro 826')";
            stmt.executeUpdate(sql);
            System.out.println("Dados inseridos.");
        }
        catch (SQLException sqle ){
            System.out.println( "Erro inserindo : " + sqle.getMessage() );
        }

    }
}
              