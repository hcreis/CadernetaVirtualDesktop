/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Objetos.Produto;
import DAO.DAOProduto;
import DAO.DAOConexao;

/**
 *
 * @author Helen Cassia
 */
public class CadastroProdutos extends javax.swing.JDialog {

    /**
     * Creates new form CadastroProdutos
     */
    public CadastroProdutos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLblProduto = new javax.swing.JLabel();
        jTxtProduto = new javax.swing.JTextField();
        jLblPreco = new javax.swing.JLabel();
        jBtnCadastrarProdutos = new javax.swing.JButton();
        jFTxtPreco = new javax.swing.JFormattedTextField();
        jLblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLblProduto.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        JLblProduto.setForeground(new java.awt.Color(255, 255, 255));
        JLblProduto.setText("Nome Produto:");
        getContentPane().add(JLblProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 50, -1, -1));
        getContentPane().add(jTxtProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 270, -1));

        jLblPreco.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLblPreco.setForeground(new java.awt.Color(255, 255, 255));
        jLblPreco.setText("Preço:");
        getContentPane().add(jLblPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 85, -1, -1));

        jBtnCadastrarProdutos.setText("Cadastrar Produto");
        jBtnCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnCadastrarProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 140, 40));

        jFTxtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##"))));
        getContentPane().add(jFTxtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 85, 80, -1));

        jLblFundo.setBackground(new java.awt.Color(185, 229, 214));
        jLblFundo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back1.jpg"))); // NOI18N
        jLblFundo.setAutoscrolls(true);
        jLblFundo.setMaximumSize(new java.awt.Dimension(1200, 650));
        jLblFundo.setMinimumSize(new java.awt.Dimension(1200, 650));
        jLblFundo.setPreferredSize(new java.awt.Dimension(1200, 650));
        getContentPane().add(jLblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarProdutosActionPerformed


        Produto produtos = new Produto();
        String nomeProduto = jTxtProduto.getText();
        Double precoProduto = Double.parseDouble(jFTxtPreco.getText().replace(".", ","));
        
        produtos.setProdutoNome(nomeProduto);
        produtos.setProdutoValor(precoProduto);
        DAOProduto daoProdutos = new DAOProduto();
        
       // daoProdutos.insertProdutos(DAOConexao.connectar(), produtos);

    }//GEN-LAST:event_jBtnCadastrarProdutosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroProdutos dialog = new CadastroProdutos(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel JLblProduto;
    private javax.swing.JButton jBtnCadastrarProdutos;
    private javax.swing.JFormattedTextField jFTxtPreco;
    private javax.swing.JLabel jLblFundo;
    private javax.swing.JLabel jLblPreco;
    private javax.swing.JTextField jTxtProduto;
    // End of variables declaration//GEN-END:variables
}
