/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacrud.dao;

/**
 *
 * @author Aluno
 */
import java.sql.*;
public class ModuloConexao {
//Metodo responsável por estabelecer conexão.
public static Connection conector(){
    java.sql.Connection conexao = null;
    
    //Dados para conexão: Drive; URL; User e password.
    String drive ="com.mysql.cj.jbdc.Drive";
    String url = "jbdc:mysql...";
    String user = "ifsertao";
    String  password = "jr0linfo";
    
    //Estabilidade a conexão.
    try {
    Class.forName(drive);
    conexao = DriveManager.getConnection(url,user,password);
    return conexao;
            
} catch (Exception e) {
    e.getMessage();
    e.getStackTrace();
}
    return null;
}

    public static Connection conecter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Connection conecter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
