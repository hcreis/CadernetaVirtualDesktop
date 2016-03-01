/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Enum.VendaStatus;
import Objetos.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author helen
 */
public class DAOVenda {

    public static boolean insertVenda(Connection conn, Venda venda) {
        PreparedStatement ps = null;
        String insert = "INSERT INTO VENDA(PRODUTO_CODIGO,CLIENTE_CODIGO,"
                + "VENDA_DATA,VENDA_PRODUTO_QTD,VENDA_TOTAL,FUNCIONARIO_LOGIN,VENDA_STATUS) "
                + "VALUES(?,?,?,?,?,?,?)";

        try {
            if (conn != null) {
                ps = conn.prepareStatement(insert);
                ps.setInt(1, venda.getProdutoCodigo());
                ps.setInt(2, venda.getClienteCodigo());
                ps.setTimestamp(3, venda.getVendaData());
                ps.setDouble(4, venda.getVendaProdutoQtd());
                ps.setDouble(5, venda.getVendaTotal());
                ps.setString(6, venda.getVendaLogin());
                ps.setInt(7, venda.getVendaStatus());
                ps.executeUpdate();
                return true;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(DAOVenda.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return false;
    }

    public static ArrayList<Object[]> getByCliente(Connection conn, int clienteCodigo) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Object[]> todos = new ArrayList<Object[]>();

        String select = "SELECT VENDA.VENDA_PRODUTO_QTD,PRODUTO.PRODUTO_NOME,"
                + "VENDA.VENDA_DATA,VENDA.VENDA_TOTAL,VENDA.FUNCIONARIO_LOGIN "
                + "FROM VENDA INNER JOIN PRODUTO ON VENDA.PRODUTO_CODIGO = PRODUTO.PRODUTO_CODIGO "
                + "AND VENDA.CLIENTE_CODIGO=? AND VENDA.VENDA_STATUS = " + VendaStatus.DEVE + " ORDER BY VENDA.VENDA_DATA DESC";

        try {
            ps = conn.prepareStatement(select);
            ps.setInt(1, clienteCodigo);
            rs = ps.executeQuery();

            while (rs.next()) {
                Object[] dados = new Object[5];

                dados[0] = rs.getDouble("VENDA_PRODUTO_QTD");
                dados[1] = rs.getString("PRODUTO_NOME");
                dados[2] = rs.getTimestamp("VENDA_DATA");
                dados[3] = rs.getDouble("VENDA_TOTAL");
                dados[4] = rs.getString("FUNCIONARIO_LOGIN");
                todos.add(dados);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(DAOVenda.class.getName()).log(Level.SEVERE, null, ex);
        }

        return todos;

    }

    public static boolean pagarConta(Connection conn, int clienteCodigo) {

        String update = "UPDATE VENDA SET VENDA_STATUS = " + VendaStatus.PAGO + " WHERE VENDA.CLIENTE_CODIGO = ?";
        PreparedStatement ps;

        try {
            ps = conn.prepareStatement(update);
            ps.setInt(1, clienteCodigo);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
