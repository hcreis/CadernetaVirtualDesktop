package Telas;


import CadernetaJna.CadernetaDll;
import CadernetaJna.CadernetaDllJna;
import Objetos.Cliente;
import Objetos.Produto;
import DAO.DAOProduto;
import DAO.DAOConexao;
import DAO.DAOVenda;
import Enum.VendaStatus;
import Objetos.Venda;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Helen Cassia
 */
public class TelaCadastroCompras extends javax.swing.JDialog {

    Cliente cliente;
    DAOProduto daoProduto = new DAOProduto();
    ArrayList<Produto> allProdutos;
    Produto prod = new Produto();
    
    public TelaCadastroCompras(java.awt.Frame parent, boolean modal, Cliente cliente) {
        super(parent, modal);
        
        this.cliente = cliente;
        initComponents();
        this.setLocationRelativeTo(this);                
        jLblNome.setText(cliente.getClienteNome());
        populaComboBox();
        
        
    }

    public void populaComboBox(){
        
        allProdutos = daoProduto.getProdutos(DAOConexao.connectar());
        
        for (Produto produto : allProdutos) {
            jCbxProdutos.addItem(produto);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblProd = new javax.swing.JLabel();
        JLblQtd = new javax.swing.JLabel();
        jLblValor = new javax.swing.JLabel();
        jTxtQtd = new javax.swing.JTextField();
        jTxtValor = new javax.swing.JTextField();
        jCbxProdutos = new javax.swing.JComboBox();
        jBtnCadastrarCompra = new javax.swing.JButton();
        jLblTotal = new javax.swing.JLabel();
        jLblNome = new javax.swing.JLabel();
        jLblNomeBeneficiario = new javax.swing.JLabel();
        jLblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Compras ");
        setName("CadastrarCompras"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblProd.setBackground(new java.awt.Color(255, 255, 255));
        jLblProd.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLblProd.setForeground(new java.awt.Color(255, 255, 255));
        jLblProd.setText("Escolher Produto:");
        getContentPane().add(jLblProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 110, -1));

        JLblQtd.setBackground(new java.awt.Color(255, 255, 255));
        JLblQtd.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        JLblQtd.setForeground(new java.awt.Color(255, 255, 255));
        JLblQtd.setText("Quantidade Comprada:");
        getContentPane().add(JLblQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 160, -1, -1));

        jLblValor.setBackground(new java.awt.Color(255, 255, 255));
        jLblValor.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLblValor.setForeground(new java.awt.Color(255, 255, 255));
        jLblValor.setText("Valor do Produto:");
        getContentPane().add(jLblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 120, -1, -1));

        jTxtQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtQtdActionPerformed(evt);
            }
        });
        jTxtQtd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtQtdKeyReleased(evt);
            }
        });
        getContentPane().add(jTxtQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 210, -1));

        jTxtValor.setEditable(false);
        jTxtValor.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTxtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 210, -1));

        jCbxProdutos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione o Produto" }));
        jCbxProdutos.setOpaque(false);
        jCbxProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbxProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(jCbxProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 210, -1));

        jBtnCadastrarCompra.setText("Cadastrar Compra");
        jBtnCadastrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnCadastrarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 140, 40));

        jLblTotal.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLblTotal.setForeground(new java.awt.Color(255, 255, 255));
        jLblTotal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Total ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 120, 60));

        jLblNome.setBackground(new java.awt.Color(255, 255, 255));
        jLblNome.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLblNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 210, 20));

        jLblNomeBeneficiario.setBackground(new java.awt.Color(255, 255, 255));
        jLblNomeBeneficiario.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLblNomeBeneficiario.setForeground(new java.awt.Color(255, 255, 255));
        jLblNomeBeneficiario.setText("Nome Cliente:");
        getContentPane().add(jLblNomeBeneficiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, 20));

        jLblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back1.jpg"))); // NOI18N
        jLblFundo.setAutoscrolls(true);
        jLblFundo.setMaximumSize(new java.awt.Dimension(1200, 650));
        jLblFundo.setMinimumSize(new java.awt.Dimension(1200, 650));
        jLblFundo.setPreferredSize(new java.awt.Dimension(1200, 650));
        getContentPane().add(jLblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCadastrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarCompraActionPerformed

        Venda venda = new Venda();
        venda.setClienteCodigo(cliente.getClienteCodigo());
        
        String codigoProduto = ((Produto)jCbxProdutos.getSelectedItem()).getProdutoCodigo();
        venda.setProdutoCodigo(Integer.parseInt(codigoProduto));
        
        venda.setVendaData(new Timestamp(System.currentTimeMillis()));
        
        venda.setVendaLogin(TelaCadernetaVirtual.getUsuarioLogado().getUsuarioLogin());
        venda.setVendaProdutoQtd(Double.parseDouble(jTxtQtd.getText()));
        venda.setVendaTotal(Double.parseDouble(jLblTotal.getText()));
        venda.setVendaStatus(VendaStatus.DEVE);
        
        boolean inseriu = DAOVenda.insertVenda(DAOConexao.connectar(), venda);
        if(inseriu)
        {
            JOptionPane.showConfirmDialog(null,"Venda cadastrada com sucesso!","Mensagem Caderneta Virtual",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showConfirmDialog(null,"Venda cadastrada com sucesso!","Mensagem Caderneta Virtual",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jBtnCadastrarCompraActionPerformed

    private void jCbxProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbxProdutosActionPerformed

         jTxtValor.setText(String.valueOf(((Produto)jCbxProdutos.getSelectedItem()).getProdutoValor()));

    }//GEN-LAST:event_jCbxProdutosActionPerformed

    private void jTxtQtdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtQtdKeyReleased
        
        Double valor = Double.parseDouble(jTxtValor.getText());
        Double quantidade = Double.parseDouble(jTxtQtd.getText());
        
        Double total = CadernetaDllJna.INSTANCE.mult(valor, quantidade);
        jLblTotal.setText(String.valueOf(total));
        //jLblTotal.setText(String.valueOf(Double.parseDouble(jTxtValor.getText()) * Double.parseDouble(jTxtQtd.getText())));       
    }//GEN-LAST:event_jTxtQtdKeyReleased

    private void jTxtQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtQtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtQtdActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadastroCompras dialog = new TelaCadastroCompras(new javax.swing.JFrame(), true,null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLblQtd;
    private javax.swing.JButton jBtnCadastrarCompra;
    private javax.swing.JComboBox jCbxProdutos;
    private javax.swing.JLabel jLblFundo;
    private javax.swing.JLabel jLblNome;
    private javax.swing.JLabel jLblNomeBeneficiario;
    private javax.swing.JLabel jLblProd;
    private javax.swing.JLabel jLblTotal;
    private javax.swing.JLabel jLblValor;
    private javax.swing.JTextField jTxtQtd;
    private javax.swing.JTextField jTxtValor;
    // End of variables declaration//GEN-END:variables
}
