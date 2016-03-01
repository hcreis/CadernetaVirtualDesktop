package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Objetos.Bairro;

/**
 *
 * @author Helen Cassia
 */
public class DAOBairro {

    public void insertBairro(Connection conn, String nomeBairro) {
        PreparedStatement ps = null;
        String insert = "INSERT INTO BAIRRO(BAIRRO_NOME) VALUES(?)";

        try {
            if (conn != null) {

                ps = conn.prepareStatement(insert);
                ps.setString(1, nomeBairro);
                ps.executeUpdate();
                System.out.println(nomeBairro + " inserido com sucesso");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    
    public ArrayList<Bairro> getBairro(Connection conn) {

        String select = "SELECT * FROM BAIRRO";
        ArrayList<Bairro> allBairro = new ArrayList<Bairro>();
        Bairro bairro;
        PreparedStatement ps;
        ResultSet rs;

        if (conn != null) {
            try {
                ps = conn.prepareStatement(select);
                rs = ps.executeQuery();
                
                while(rs.next()){
                    bairro = new Bairro();
                    bairro.setCodigoBairro(String.valueOf(rs.getInt("BAIRRO_CODIGO")));
                    bairro.setNomeBairro(rs.getString("BAIRRO_NOME"));
                    allBairro.add(bairro);
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }else{
            System.out.println("Houve uma falha ao recuperar os dados do Bairro");
        }

        return allBairro;
    }
}
