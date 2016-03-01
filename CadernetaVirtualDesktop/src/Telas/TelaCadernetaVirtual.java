package Telas;

import Objetos.Cliente;
import DAO.DAOCliente;
import DAO.DAOConexao;
import DAO.DAOVenda;
import Objetos.Funcionario;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Helen Cassia
 */
public class TelaCadernetaVirtual extends javax.swing.JFrame {

    ArrayList<Cliente> todosClientes;
    Cliente cliente = new Cliente();
    static Funcionario login;
    JPopupMenu pm;
    JMenuItem menuItem;

    public TelaCadernetaVirtual() {
        initComponents();
        this.setLocationRelativeTo(this);
        jFundoTabela.getViewport().setOpaque(false);
        carregaClientes();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFundoTabela = new javax.swing.JScrollPane();
        jTblCliente = new javax.swing.JTable();
        jBtnCadastrarCompra = new javax.swing.JButton();
        jBtnNovoCliente = new javax.swing.JButton();
        JLblNome = new javax.swing.JLabel();
        jCbxNome = new javax.swing.JComboBox();
        jLblFundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cjmiPgConta = new javax.swing.JMenuItem();
        cjmiSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caderneta Virtual versão 1.0");
        setLocationByPlatform(true);
        setName("TelaPrincipal"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quantidade", "Produto", "Data Compra", "Valor", "Login"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblCliente.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTblCliente.setMaximumSize(new java.awt.Dimension(1200, 300));
        jTblCliente.setRowHeight(20);
        jFundoTabela.setViewportView(jTblCliente);

        getContentPane().add(jFundoTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 540, 290));

        jBtnCadastrarCompra.setText("Cadastrar Compra");
        jBtnCadastrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnCadastrarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 140, 40));

        jBtnNovoCliente.setText("Novo Cliente");
        jBtnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNovoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnNovoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 110, 40));

        JLblNome.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        JLblNome.setForeground(new java.awt.Color(255, 255, 255));
        JLblNome.setText("Nome:");
        getContentPane().add(JLblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jCbxNome.setMaximumRowCount(12);
        jCbxNome.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione um nome" }));
        jCbxNome.setToolTipText("");
        jCbxNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbxNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jCbxNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 380, -1));

        jLblFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back1.jpg"))); // NOI18N
        jLblFundo.setAutoscrolls(true);
        jLblFundo.setMaximumSize(new java.awt.Dimension(1200, 650));
        jLblFundo.setMinimumSize(new java.awt.Dimension(1200, 650));
        jLblFundo.setPreferredSize(new java.awt.Dimension(1200, 650));
        getContentPane().add(jLblFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 480));

        jMenu1.setText("File");

        cjmiPgConta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        cjmiPgConta.setText("Pagar Conta");
        cjmiPgConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjmiPgContaActionPerformed(evt);
            }
        });
        jMenu1.add(cjmiPgConta);

        cjmiSair.setText("Sair");
        cjmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjmiSairActionPerformed(evt);
            }
        });
        jMenu1.add(cjmiSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carregaClientes() {
        ArrayList<Cliente> clientes = DAOCliente.getCliente(DAOConexao.connectar(), "");

        for (int i = 0; i < clientes.size(); i++) {

            jCbxNome.addItem(clientes.get(i));
        }
    }

    public static void setUsuarioLogado(Funcionario login) {
        TelaCadernetaVirtual.login = login;
    }

    public static Funcionario getUsuarioLogado() {
        return login;
    }

    private void preencheDados(Object[] elementos, DefaultTableModel model) {

        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
        centro.setHorizontalAlignment(SwingConstants.CENTER);

        jTblCliente.getColumnModel().getColumn(0).setCellRenderer(direita);
        jTblCliente.getColumnModel().getColumn(3).setCellRenderer(direita);

        jTblCliente.getColumnModel().getColumn(1).setCellRenderer(centro);
        jTblCliente.getColumnModel().getColumn(2).setCellRenderer(centro);
        jTblCliente.getColumnModel().getColumn(4).setCellRenderer(centro);

        jTblCliente.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        model.addRow(new Object[]{
            elementos[0],
            elementos[1],
            sdf.format(elementos[2]),
            nf.format(elementos[3]),
            elementos[4]
        });

    }
    private void jBtnCadastrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarCompraActionPerformed

        if (jCbxNome.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor selecione um cliente!", "Mensagem Caderneta Virtual", JOptionPane.ERROR_MESSAGE);
            return;
        }

        TelaCadastroCompras cadastraCompra = new TelaCadastroCompras(this, true, (Cliente) jCbxNome.getSelectedItem());
        cadastraCompra.setVisible(true);
    }//GEN-LAST:event_jBtnCadastrarCompraActionPerformed

    private void jBtnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNovoClienteActionPerformed

        TelaCadastroCliente cadastraCliente = new TelaCadastroCliente(this, true);
        cadastraCliente.setVisible(true);

    }//GEN-LAST:event_jBtnNovoClienteActionPerformed

    private void jCbxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbxNomeActionPerformed

        if (jCbxNome.getSelectedIndex() == 0) {
            jBtnCadastrarCompra.setEnabled(false);
        } else {
            jBtnCadastrarCompra.setEnabled(true);
            ArrayList<Object[]> todos = DAOVenda.getByCliente(DAOConexao.connectar(), ((Cliente) jCbxNome.getSelectedItem()).getClienteCodigo());
            DefaultTableModel model = (DefaultTableModel) jTblCliente.getModel();
            model.setNumRows(0);
            if (todos.size() > 0) {
                for (Object[] elementos : todos) {

                    preencheDados(elementos, model);
                }
            }

        }
    }//GEN-LAST:event_jCbxNomeActionPerformed

    private void cjmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjmiSairActionPerformed

        System.exit(0);
    }//GEN-LAST:event_cjmiSairActionPerformed

    private void cjmiPgContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjmiPgContaActionPerformed
        
        if (jCbxNome.getSelectedIndex() != 0) {
          
            int codigoCliente = ((Cliente) jCbxNome.getSelectedItem()).getClienteCodigo();
            boolean pagou = DAOVenda.pagarConta(DAOConexao.connectar(),codigoCliente);
            
            if(pagou)
            {
                JOptionPane.showMessageDialog(null, "Conta paga com sucesso!", "Mensagem Caderneta Virtual", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Erro ao pagar a conta!", "Mensagem Caderneta Virtual", JOptionPane.ERROR_MESSAGE);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Por favor selecione um cliente!", "Mensagem Caderneta Virtual", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cjmiPgContaActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadernetaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadernetaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadernetaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadernetaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadernetaVirtual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLblNome;
    private javax.swing.JMenuItem cjmiPgConta;
    private javax.swing.JMenuItem cjmiSair;
    private javax.swing.JButton jBtnCadastrarCompra;
    private javax.swing.JButton jBtnNovoCliente;
    private javax.swing.JComboBox jCbxNome;
    private javax.swing.JScrollPane jFundoTabela;
    private javax.swing.JLabel jLblFundo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTable jTblCliente;
    // End of variables declaration//GEN-END:variables
}
