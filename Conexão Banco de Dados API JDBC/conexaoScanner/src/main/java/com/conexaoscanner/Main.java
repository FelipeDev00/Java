package com.conexaoscanner;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Conexao conector = new Conexao();
        Statement stmt = null;

        //Testar conexão
        try {
            conector.conectar();
        } catch (Exception e) {}

        //Testar se stmt está pronto para comandos sql
        try {
            stmt = conector.conn.createStatement();
            System.out.println("Pronto para execução de comandos SQL.");
        } catch (SQLException sqle) {
            System.out.println("Erro no acesso ao Banco de Dados: " + sqle.getMessage());
        }

        //Atualizando dados pelo Scanner / interação com o usuário
        int idBusca, idadeNova;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o id que será atualizado no banco de dados:");
        idBusca = sc.nextInt();

        System.out.println("Informe a nova idade:");
        idadeNova = sc.nextInt();

        // Armazenando e validando as informações inseridas pelo usuário para atualização no banco de dados.
        try {
            String sql = null;
            sql = "UPDATE alunos SET idade = " + idadeNova +" WHERE id ="+ idBusca;
            stmt.executeUpdate(sql);
            System.out.println("Dados atualizados");
        } catch (SQLException sqle) {
            System.out.println("Erro na atualização dos dados: " + sqle.getMessage());
        }

    }    
}