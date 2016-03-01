/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Objetos.Funcionario;

/**
 *
 * @author Helen Cassia
 */
public class DAOFuncionario{

        public Funcionario getUsuario(Connection conn, Funcionario user) {
        String select = "SELECT * FROM FUNCIONARIO WHERE FUNCIONARIOS_LOGIN = ? AND FUNCIONARIOS_SENHA = ?";        
        PreparedStatement ps=null;
        ResultSet rs = null;
        Funcionario func = null;

        try {
            ps = conn.prepareStatement(select);
            ps.setString(1, user.getUsuarioLogin());
            ps.setString(2, user.getUsuarioSenha());
            rs = ps.executeQuery();

            while (rs.next()) {
                func = new Funcionario();
                func.setUsuarioLogin(rs.getString("FUNCIONARIOS_LOGIN"));
                func.setUsuarioSenha(rs.getString("FUNCIONARIOS_SENHA"));                
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return func;
    }
        
    public static void insert(Connection conn, Funcionario func)
    {
        String insert = "INSERT INTO FUNCIONARIO(FUNCIONARIO_LOGIN,FUNCIONARIO_SENHA) VALUES(?,?)";
        PreparedStatement ps=null;
        
        try {
            if (conn != null) {
                ps = conn.prepareStatement(insert);
                ps.setString(1, func.getUsuarioLogin());
                ps.setString(2, func.getUsuarioSenha());
                ps.executeUpdate();
            }
        } catch (SQLException exs) {
            exs.printStackTrace();
        }
    }

}
