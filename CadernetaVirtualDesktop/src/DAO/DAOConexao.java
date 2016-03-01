/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Helen Cassia
 */

public class DAOConexao {

    public static Connection connectar(){       
        
        Connection conn=null;
        try {
            //String conexao = "jdbc:sqlserver://localhost:1433;databaseName=CadernetaVirtual;user=sa;password=root";
            String conexao = "jdbc:mysql://localhost:3306/cadernetavirtual";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(conexao,"root","M@n@g3r");
            System.out.println("Conectado com Sucesso");
        
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
}
