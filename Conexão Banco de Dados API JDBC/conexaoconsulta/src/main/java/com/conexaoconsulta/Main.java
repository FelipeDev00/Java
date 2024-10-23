package com.conexaoconsulta;

import java.sql.ResultSet;
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

        try {
            String sql = "select id,nome,idade,endereco from alunos" ;
        
            /* Executando o comando select */
            ResultSet rs = stmt.executeQuery(sql);
        
            /* Exibindo os resultados */
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                int idade = rs.getInt("idade");
                String endereco = rs.getString("endereco");
                                    
                System.out.println("dados da tabela autor do banco de dados");
                System.out.println("--------------------------");
                System.out.println(id + " - " + nome + " - "+ idade+ " - "+ endereco);
            }
        } catch (SQLException sqle) {
            System.out.println( "Erro efetuando consulta : " + sqle.getMessage() );
        }

        try {
            conector.conn.close();
            System.out.println( "Conexão com o banco de dados fechada" );
        } catch (SQLException sqle) {
            System.out.println( "Erro no fechamento da conexão : " + sqle.getMessage() );
        }
    }
} 
              
