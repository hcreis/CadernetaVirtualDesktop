package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Objetos.Produto;

/**
 *
 * @author Helen Cassia
 */
public class DAOProduto {

    public void insertProdutos(Connection conn, Produto produto) {

        PreparedStatement ps = null;
        String insert = "INSERT INTO PRODUTOS(PRODUTO_NOME,PRODUTO_VALOR) VALUES(?,?)";
        try {
            ps = conn.prepareStatement(insert);
            ps.setString(1, produto.getProdutoNome());
            ps.setDouble(2, produto.getProdutoValor());            
            ps.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public ArrayList<Produto> getProdutos(Connection conn) {

        ArrayList<Produto> allProdutos = new ArrayList<Produto>();
        String select = "SELECT * FROM PRODUTO";
        ResultSet rs = null;
        PreparedStatement ps = null;
        Produto produtos = null;
        
        try {
            ps = conn.prepareStatement(select);
            rs = ps.executeQuery();
            while(rs.next()){    
                
                produtos = new Produto();
                produtos.setProdutoCodigo(rs.getString("PRODUTO_CODIGO"));
                produtos.setProdutoNome(rs.getString("PRODUTO_NOME"));
                produtos.setProdutoValor(rs.getDouble("PRODUTO_VALOR"));
                allProdutos.add(produtos);
            }
        } catch (Exception ex) {

            ex.printStackTrace();
        }

        return allProdutos;

    }
    
    public Produto getProdutosValor(Connection conn, String produtoCodigo) {

        //ArrayList<Produtos> allProdutos = new ArrayList();
        String select = "SELECT * FROM PRODUTO WHERE PRODUTO_CODIGO = ?";
        ResultSet rs = null;
        PreparedStatement ps = null;
        Produto produtos = null;
        
        try {
            ps = conn.prepareStatement(select);            
            ps.setString(1, produtoCodigo);
            rs = ps.executeQuery();
            while(rs.next()){    
                
                produtos = new Produto();
                produtos.setProdutoCodigo(rs.getString("PRODUTO_CODIGO"));
                produtos.setProdutoNome(rs.getString("PRODUTO_NOME"));
                produtos.setProdutoValor(Double.parseDouble(rs.getString("PRODUTO_VALOR")));
                //allProdutos.add(produtos);
            }
        } catch (Exception ex) {

            ex.printStackTrace();
        }

        //return allProdutos;
        return produtos;

    }
}
