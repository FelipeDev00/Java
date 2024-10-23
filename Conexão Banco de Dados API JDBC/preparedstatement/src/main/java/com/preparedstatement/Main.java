package com.preparedstatement;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        
        Conexao conector = new Conexao();
        PreparedStatement ps = null;

        String sql = "INSERT INTO alunos VALUES (?,?,?,?)";

        try {
            conector.conectar();
        } catch (Exception e) {}
        
        try {
            ps = conector.conn.prepareStatement(sql);
            ps.setInt(1,2);
            ps.setString(2, "Érico");
            ps.setInt(3,30);
            ps.setString(4, "Rua das araucárias 20");

            ps.executeUpdate();
            System.out.println("Dados inseridos com sucesso!");
        } catch (SQLException sqle) {
            System.out.println( "Erro no acesso ao Bando de Dados : "+ sqle.getMessage());
        }

        try {
            conector.desconectar();
        } catch (Exception e) {}



    }
}