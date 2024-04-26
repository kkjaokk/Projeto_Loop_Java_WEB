/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudodecaso.modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 10698079663
 */
public class ConnectionFactory {
    
    private static final String DB_URL="jdbc:mysql:localhost:3306/bdestudodecasosi";
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_USER = "root";
    private static final String DB_PASSAWORD = "";
    
    private static ConnectionFactory instance;
    
    
    //construtor privado para impedir a criação direita de instância fora dela mesma. Padrão Singleton
    private ConnectionFactory(){
        
        try{
            
            Class.forName(DB_DRIVER);
            
        }catch(ClassNotFoundException e){
            
            throw new RuntimeException("Driver do banco de dados não encontrado",e);
            
        }
        
    }
    
    
    //permite acesso a uma instância única
    public static ConnectionFactory getInstace(){
        
        if(instance == null){
            
            instance = new ConnectionFactory();
            
        }
        return instance;
    }
    
    public Connection getConnection() throws SQLException{
        
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSAWORD);
        
        
        
    }
    
    
    public PreparedStatement getPreparedStatament(String sql) throws SQLException{
        
        Connection con = getConnection();
        return con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS); //retorna p id
        
    }
    
}
