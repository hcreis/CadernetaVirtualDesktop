package Telas;

import Objetos.Funcionario;
import DAO.DAOConexao;
import DAO.DAOFuncionario;
import javax.swing.JOptionPane;

/**
 *
 * @author Helen Cassia
 */
public class TelaLogin extends javax.swing.JDialog {


    public TelaLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtLogin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBtnLogar = new javax.swing.JButton();
        jBtnSair = new javax.swing.JButton();
        jTxtSenha = new javax.swing.JPasswordField();
        jLblfundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTxtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 180, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Login: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, 20));

        jBtnLogar.setText("Logar");
        jBtnLogar.setBorderPainted(false);
        jBtnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLogarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnLogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 90, 40));

        jBtnSair.setText("Sair");
        jBtnSair.setBorderPainted(false);
        jBtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSairActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 90, 40));

        jTxtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 180, -1));

        jLblfundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back1.jpg"))); // NOI18N
        jLblfundo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 102), null));
        jLblfundo.setMaximumSize(new java.awt.Dimension(400, 158));
        jLblfundo.setMinimumSize(new java.awt.Dimension(400, 158));
        jLblfundo.setPreferredSize(new java.awt.Dimension(400, 158));
        getContentPane().add(jLblfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doClick()
    {
        TelaCadernetaVirtual caderneta = new TelaCadernetaVirtual();
        Funcionario func = new Funcionario();
        Funcionario logar = null;
        DAOFuncionario daoFuncionario = new DAOFuncionario();

        String login = jTxtLogin.getText() != null ? jTxtLogin.getText() : "";
        String senha = new String(jTxtSenha.getPassword());
        
        func.setUsuarioLogin(login);
        func.setUsuarioSenha(senha);
        logar = daoFuncionario.getUsuario(DAOConexao.connectar(), func);

        if (logar != null) {

            this.setVisible(false);
            caderneta.setVisible(true);
            caderneta.setUsuarioLogado(logar);

        } else {
            JOptionPane.showConfirmDialog(null, "Usuário ou Senha incorretos", "Atenção", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }
    private void jBtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSairActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jBtnSairActionPerformed

    private void jBtnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLogarActionPerformed

        doClick();
    }//GEN-LAST:event_jBtnLogarActionPerformed

    private void jTxtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtSenhaActionPerformed
        
        doClick();
        
    }//GEN-LAST:event_jTxtSenhaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaLogin dialog = new TelaLogin(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnLogar;
    private javax.swing.JButton jBtnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLblfundo;
    private javax.swing.JTextField jTxtLogin;
    private javax.swing.JPasswordField jTxtSenha;
    // End of variables declaration//GEN-END:variables
}
