/*
 * ControlePonto_v2.0
 * Cedup Hermmann Hering 20/04/19
 * @MecSystem
 */
package Activitys;

import java.awt.Color;
import java.awt.Cursor;
import mecsystem.Classes.Admin;

/**
 *
 * @author LOL
 */
public class actCreateAdmin extends javax.swing.JDialog {

    /**
     * Creates new form actLogin
     */
    public actCreateAdmin() {
        initComponents();
        this.setModal(true);
        Desfoque.setVisible(false);
        this.setLocationRelativeTo(null);   //Centraliza a Tela
        imgBackground.requestFocus();
        btnPronto.setVisible(false);
        Desfoque.setBackground(new Color(0, 0, 0, 100));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desfoque = new javax.swing.JPanel();
        btnPronto = new javax.swing.JLabel();
        imgPronto = new javax.swing.JLabel();
        btnSair = new javax.swing.JLabel();
        edtLogin = new javax.swing.JTextField();
        edtPassword = new javax.swing.JPasswordField();
        edtCPF = new javax.swing.JFormattedTextField();
        lblTitle = new javax.swing.JLabel();
        imgBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Desfoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1028, 720));

        btnPronto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Activitys/images/BotaoProntoLogin2.jpg"))); // NOI18N
        btnPronto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProntoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProntoMouseExited(evt);
            }
        });
        getContentPane().add(btnPronto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 405, -1, -1));

        imgPronto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Activitys/images/BotaoProntoLogin.jpg"))); // NOI18N
        imgPronto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgProntoMouseEntered(evt);
            }
        });
        getContentPane().add(imgPronto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 405, -1, -1));

        btnSair.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 24)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Voltar");
        btnSair.setToolTipText("Voltar");
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSairMouseEntered(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        edtLogin.setBackground(new java.awt.Color(51, 170, 236));
        edtLogin.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        edtLogin.setForeground(new java.awt.Color(255, 255, 255));
        edtLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edtLogin.setText("Login");
        edtLogin.setToolTipText("Login");
        edtLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        edtLogin.setOpaque(false);
        edtLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                edtLoginFocusLost(evt);
            }
        });
        getContentPane().add(edtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 220, 260, 40));

        edtPassword.setBackground(new java.awt.Color(51, 170, 236));
        edtPassword.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        edtPassword.setForeground(new java.awt.Color(255, 255, 255));
        edtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edtPassword.setText("Senha");
        edtPassword.setToolTipText("Senha");
        edtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        edtPassword.setOpaque(false);
        edtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                edtPasswordFocusLost(evt);
            }
        });
        getContentPane().add(edtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 280, 260, 40));

        edtCPF.setBackground(new java.awt.Color(51, 170, 236));
        edtCPF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        edtCPF.setForeground(new java.awt.Color(255, 255, 255));
        try {
            edtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edtCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edtCPF.setToolTipText("CPF");
        edtCPF.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        edtCPF.setOpaque(false);
        getContentPane().add(edtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 340, 260, 40));

        lblTitle.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 40)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Cadastro de Administrador");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 15, 828, -1));

        imgBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Activitys/images/TelasCRUD1.jpg"))); // NOI18N
        imgBackground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgBackgroundMouseClicked(evt);
            }
        });
        getContentPane().add(imgBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtLoginFocusGained
        if (edtLogin.getText().equals("Login")) {
            edtLogin.setText("");
        }
    }//GEN-LAST:event_edtLoginFocusGained

    private void edtLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtLoginFocusLost
        if (edtLogin.getText().trim().isEmpty()) {
            edtLogin.setText("Login");
        }
    }//GEN-LAST:event_edtLoginFocusLost

    private void btnProntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProntoMouseClicked
        if (doValidations()) {
            Admin a = new Admin();
            a.setLoginAdmin(edtLogin.getText());
            a.setCPF(edtCPF.getText());
            a.setPassword(edtPassword.getText());
            if (a.Create()) {
                actAlert alert = new actAlert();
                alert.lbMsg.setText("<html><p align=\"center\">Administrador cadastrado com sucesso!</p></html>");
                alert.setVisible(true);
            } else {
                actAlert alert = new actAlert();
                alert.lbMsg.setText("<html><p align=\"center\">Esse CPF já está <br> Cadastrado para outro Admin!</p></html>");
                alert.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnProntoMouseClicked

    private void btnProntoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProntoMouseExited
        btnPronto.setVisible(false);
        imgPronto.setVisible(true);
    }//GEN-LAST:event_btnProntoMouseExited

    private void imgProntoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgProntoMouseEntered
        imgPronto.setVisible(false);
        btnPronto.setVisible(true);
        btnPronto.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_imgProntoMouseEntered

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnSairMouseClicked

    private void btnSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseEntered
        btnSair.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnSairMouseEntered

    private void edtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtPasswordFocusGained
        if (edtPassword.getText().equals("Senha")) {
            edtPassword.setText("");
        }
    }//GEN-LAST:event_edtPasswordFocusGained

    private void edtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtPasswordFocusLost
        if (edtPassword.getText().trim().isEmpty()) {
            edtPassword.setText("Senha");
        }
    }//GEN-LAST:event_edtPasswordFocusLost

    private void imgBackgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBackgroundMouseClicked
        imgBackground.requestFocus();
    }//GEN-LAST:event_imgBackgroundMouseClicked

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        Desfoque.setVisible(true);
    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        Desfoque.setVisible(false);

    }//GEN-LAST:event_formWindowGainedFocus

    public boolean CheckIsEmpty() {
        if ((edtLogin.getText().trim().isEmpty() || edtLogin.getText().equals("Login"))) {
            return false;
        } else if ((edtPassword.getText().trim().isEmpty() || edtPassword.getText().equals("Senha"))) {
            return false;
        } else if (edtCPF.getText().trim().length() != 14) {
            return false;
        }
        return true;
    }

    public boolean CheckIfExists() {
        Admin a = new Admin();
        a.setLoginAdmin(edtLogin.getText());
        a.ReadByLogin();
        return a.getCPF() == null;
    }

    public boolean CheckCPF() {
        Admin a = new Admin();
        return a.isCPF((edtCPF.getText().replace(".", "").replace("-", "")));
    }

    public boolean doValidations() {
        if (!CheckIsEmpty()) {
            new actAlert().setVisible(true);
            return false;
        } else if (!CheckIfExists()) {
            actAlert a = new actAlert();
            a.lbMsg.setText("<html><p align='center'>Esse Login já está <br> Cadastrado para outro Admin!</p></html>");
            a.setVisible(true);
            return false;
        } else if (!CheckCPF()) {
            actAlert a = new actAlert();
            a.lbMsg.setText("<html><p align=\"center\">O CPF Informado<br>é inválido!</p></html>");
            a.setVisible(true);
            return false;
        }
        return true;
    }

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
            java.util.logging.Logger.getLogger(actCreateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(actCreateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(actCreateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(actCreateAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new actCreateAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Desfoque;
    private javax.swing.JLabel btnPronto;
    private javax.swing.JLabel btnSair;
    private javax.swing.JFormattedTextField edtCPF;
    private javax.swing.JTextField edtLogin;
    private javax.swing.JPasswordField edtPassword;
    private javax.swing.JLabel imgBackground;
    private javax.swing.JLabel imgPronto;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
