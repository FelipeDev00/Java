package com.conexao2;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    
    public static void main(String[] args) {
        try {
            
            Class.forName( "com.mysql.cj.jdbc.Driver" );
            System.out.println( "Driver JDBC carregado" );
        } catch ( ClassNotFoundException cnfe ) {
            System.out.println( "Driver JDBC nao encontrado : " +
                            cnfe.getMessage() );
        }

        Connection con = null;
        try {
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escola","root","");
            System.out.println( "Conexao com o banco de dados estabelecida." );
        } catch ( SQLException sqle ) {
            System.out.println( "Erro na conexao ao Bando de Dados : " +
                                        sqle.getMessage() );
        }
    }
    
}