package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Objetos.Cliente;

/**
 *
 * @author Helen Cassia
 */
public class DAOCliente {

    public static boolean insertCliente(Connection conn, Cliente cliente) {
        PreparedStatement ps = null;
        String insert = "INSERT INTO CLIENTE(CLIENTE_NOME,CLIENTE_ENDERECO,CLIENTE_BAIRRO,CLIENTE_CONTATO) VALUES(?,?,?,?)";

        try {
            if (conn != null) {
                ps = conn.prepareStatement(insert);
                ps.setString(1, cliente.getClienteNome());
                ps.setString(2, cliente.getClienteEndereco());
                ps.setString(3, cliente.getClienteBairro());
                ps.setString(4, cliente.getClienteContato());
                ps.executeUpdate();
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return false;

    }

    public static ArrayList<Cliente> getCliente(Connection conn, String nomeCliente) {

        String select = "";
        if (nomeCliente.equalsIgnoreCase(" ")) {
            select = "SELECT * FROM CLIENTE ORDER BY CLIENTE_NOME ASC";
        } else {
            select = "SELECT * FROM CLIENTE WHERE CLIENTE_NOME  LIKE '%" + nomeCliente + "%' ORDER BY CLIENTE_NOME ASC";
        }
        
        ArrayList<Cliente> allCliente = new ArrayList<Cliente>();
        Cliente cliente;
        PreparedStatement ps;
        ResultSet rs;

        if (conn != null) {
            try {
                ps = conn.prepareStatement(select);
                rs = ps.executeQuery();

                while (rs.next()) {
                    cliente = new Cliente();
                    cliente.setClienteCodigo(rs.getInt("CLIENTE_CODIGO"));
                    cliente.setClienteNome(rs.getString("CLIENTE_NOME"));
                    cliente.setClienteEndereco(rs.getString("CLIENTE_ENDERECO"));
                    cliente.setClienteBairro(rs.getString("CLIENTE_BAIRRO"));
                    cliente.setClienteContato(rs.getString("CLIENTE_CONTATO"));
                    allCliente.add(cliente);
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        } else {
            System.out.println("Houve uma falha ao recuperar os dados do Cliente");
        }

        return allCliente;
    }

}
