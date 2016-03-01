
package Telas;

import Objetos.Cliente;
import Objetos.Bairro;
import DAO.DAOCliente;
import DAO.DAOBairro;
import DAO.DAOConexao;
import comparador.ComparadorBairro;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Helen Cassia
 */
public class TelaCadastroCliente extends javax.swing.JDialog {

    public TelaCadastroCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
        populaBairro();
    }

    public void populaBairro(){
        DAOBairro daoBairro = new DAOBairro();        
        ArrayList<Bairro> todosBairros = daoBairro.getBairro(DAOConexao.connectar());   
        Collections.sort(todosBairros, new ComparadorBairro());
        
        for (int i = 0; i<todosBairros.size();i++) {
            jCbxBairros.addItem(todosBairros.get(i));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtNome = new javax.swing.JTextField();
        JLblNome = new javax.swing.JLabel();
        jLblEndereco = new javax.swing.JLabel();
        jTxtEndereco = new javax.swing.JTextField();
        jCbxBairros = new javax.swing.JComboBox();
        jBtnCadastrar = new javax.swing.JButton();
        jLblTelefone = new javax.swing.JLabel();
        jTxtTelefone = new javax.swing.JTextField();
        jLblVencimento = new javax.swing.JLabel();
        jLblFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTxtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 330, -1));

        JLblNome.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        JLblNome.setForeground(new java.awt.Color(255, 255, 255));
        JLblNome.setText("Nome:");
        getContentPane().add(JLblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 20, -1, -1));

        jLblEndereco.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLblEndereco.setForeground(new java.awt.Color(255, 255, 255));
        jLblEndereco.setText("Endereco:");
        getContentPane().add(jLblEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));
        getContentPane().add(jTxtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 330, -1));

        jCbxBairros.setBackground(new java.awt.Color(185, 229, 214));
        jCbxBairros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCbxBairros.setForeground(new java.awt.Color(153, 153, 153));
        jCbxBairros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione um Bairro" }));
        jCbxBairros.setMaximumSize(new java.awt.Dimension(118, 20));
        getContentPane().add(jCbxBairros, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 330, -1));

        jBtnCadastrar.setText("Cadastrar Cliente");
        jBtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 140, 40));

        jLblTelefone.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLblTelefone.setForeground(new java.awt.Color(255, 255, 255));
        jLblTelefone.setText("Telefone:");
        getContentPane().add(jLblTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        getContentPane().add(jTxtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 330, -1));

        jLblVencimento.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLblVencimento.setForeground(new java.awt.Color(255, 255, 255));
        jLblVencimento.setText("Bairro:");
        getContentPane().add(jLblVencimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 120, -1, -1));

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
    private void jBtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCadastrarActionPerformed

        Cliente cliente = new Cliente();
        String nome = jTxtNome.getText();
        String endereco = jTxtEndereco.getText();        
        String bairro = ((Bairro) jCbxBairros.getSelectedItem()).getCodigoBairro();
        String telefone = jTxtTelefone.getText();
        
        cliente.setClienteNome(nome);
        cliente.setClienteEndereco(endereco);
        cliente.setClienteBairro(bairro);
        cliente.setClienteContato(telefone);       
        
        if(DAOCliente.insertCliente(DAOConexao.connectar(), cliente))
        {
            JOptionPane.showConfirmDialog(null,"Cliente salvo com sucesso","Dados salvoss",JOptionPane.DEFAULT_OPTION);
        }
        else
        {
            JOptionPane.showConfirmDialog(null,"Houve uma falha ao savar os dados","Dados salvoss",JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_jBtnCadastrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadastroCliente dialog = new TelaCadastroCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel JLblNome;
    private javax.swing.JButton jBtnCadastrar;
    private javax.swing.JComboBox jCbxBairros;
    private javax.swing.JLabel jLblEndereco;
    private javax.swing.JLabel jLblFundo;
    private javax.swing.JLabel jLblTelefone;
    private javax.swing.JLabel jLblVencimento;
    private javax.swing.JTextField jTxtEndereco;
    private javax.swing.JTextField jTxtNome;
    private javax.swing.JTextField jTxtTelefone;
    // End of variables declaration//GEN-END:variables
}
