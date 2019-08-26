/*
 * ControlePonto_v2.0
 * Cedup Hermmann Hering 20/04/19
 * @MecSystem
 */
package Activitys;

import java.awt.Color;
import java.awt.Cursor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mecsystem.Classes.Employee;
import mecsystem.Classes.Function;

/**
 *
 * @author LOL
 */
public class actCreateEmployer extends javax.swing.JDialog {

    /**
     * Creates new form actLogin
     */
    public actCreateEmployer() {
        initComponents();
        this.setModal(true);
        Desfoque.setVisible(false);
        this.setLocationRelativeTo(null);   //Centraliza a Tela
        imgBackground.requestFocus();
        btnPronto.setVisible(false);
        Desfoque.setBackground(new Color(0, 0, 0, 100));
        fillFucntion();
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
        edtName = new javax.swing.JTextField();
        edtLastname = new javax.swing.JTextField();
        edtPassword = new javax.swing.JTextField();
        edtNrCard = new javax.swing.JTextField();
        lbCPF = new javax.swing.JLabel();
        lbRG = new javax.swing.JLabel();
        lbPIS = new javax.swing.JLabel();
        cbFunction = new javax.swing.JComboBox();
        edtRG = new javax.swing.JFormattedTextField();
        edtPIS = new javax.swing.JFormattedTextField();
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

        btnPronto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Activitys/images/BotaoProntoLogin2.jpg"))); // NOI18N
        btnPronto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProntoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProntoMouseExited(evt);
            }
        });
        getContentPane().add(btnPronto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 525, -1, -1));

        imgPronto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Activitys/images/BotaoProntoLogin.jpg"))); // NOI18N
        imgPronto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgProntoMouseEntered(evt);
            }
        });
        getContentPane().add(imgPronto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 525, -1, -1));

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

        edtName.setBackground(new java.awt.Color(51, 170, 236));
        edtName.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        edtName.setForeground(new java.awt.Color(255, 255, 255));
        edtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edtName.setText("Nome");
        edtName.setToolTipText("Nome");
        edtName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        edtName.setOpaque(false);
        edtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                edtNameFocusLost(evt);
            }
        });
        getContentPane().add(edtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 190, 310, 40));

        edtLastname.setBackground(new java.awt.Color(51, 170, 236));
        edtLastname.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        edtLastname.setForeground(new java.awt.Color(255, 255, 255));
        edtLastname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edtLastname.setText("Sobrenome");
        edtLastname.setToolTipText("Sobrenome");
        edtLastname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        edtLastname.setOpaque(false);
        edtLastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtLastnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                edtLastnameFocusLost(evt);
            }
        });
        getContentPane().add(edtLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 190, 310, 40));

        edtPassword.setBackground(new java.awt.Color(51, 170, 236));
        edtPassword.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
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
        getContentPane().add(edtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 260, 310, 40));

        edtNrCard.setBackground(new java.awt.Color(51, 170, 236));
        edtNrCard.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        edtNrCard.setForeground(new java.awt.Color(255, 255, 255));
        edtNrCard.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edtNrCard.setText("Nr Cartão");
        edtNrCard.setToolTipText("Número do Cartão");
        edtNrCard.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        edtNrCard.setOpaque(false);
        edtNrCard.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtNrCardFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                edtNrCardFocusLost(evt);
            }
        });
        getContentPane().add(edtNrCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 260, 310, 40));

        lbCPF.setBackground(new java.awt.Color(60, 158, 219));
        lbCPF.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 22)); // NOI18N
        lbCPF.setForeground(new java.awt.Color(255, 255, 255));
        lbCPF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCPF.setText("CPF");
        lbCPF.setOpaque(true);
        getContentPane().add(lbCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 335, 130, -1));

        lbRG.setBackground(new java.awt.Color(60, 158, 219));
        lbRG.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 22)); // NOI18N
        lbRG.setForeground(new java.awt.Color(255, 255, 255));
        lbRG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRG.setText("RG");
        lbRG.setOpaque(true);
        getContentPane().add(lbRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 335, 130, -1));

        lbPIS.setBackground(new java.awt.Color(60, 166, 216));
        lbPIS.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 22)); // NOI18N
        lbPIS.setForeground(new java.awt.Color(255, 255, 255));
        lbPIS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPIS.setText("PIS");
        lbPIS.setOpaque(true);
        getContentPane().add(lbPIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 405, 130, -1));

        cbFunction.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        cbFunction.setForeground(new java.awt.Color(255, 255, 255));
        cbFunction.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Função" }));
        cbFunction.setToolTipText("Função");
        cbFunction.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        cbFunction.setOpaque(false);
        getContentPane().add(cbFunction, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 315, 40));

        edtRG.setBackground(new java.awt.Color(51, 170, 236));
        edtRG.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        edtRG.setForeground(new java.awt.Color(255, 255, 255));
        try {
            edtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edtRG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edtRG.setToolTipText("RG");
        edtRG.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        edtRG.setOpaque(false);
        edtRG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtRGFocusGained(evt);
            }
        });
        getContentPane().add(edtRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 330, 310, 40));

        edtPIS.setBackground(new java.awt.Color(51, 170, 236));
        edtPIS.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        edtPIS.setForeground(new java.awt.Color(255, 255, 255));
        try {
            edtPIS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.#####.##-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edtPIS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edtPIS.setToolTipText("PIS");
        edtPIS.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        edtPIS.setOpaque(false);
        edtPIS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtPISFocusGained(evt);
            }
        });
        getContentPane().add(edtPIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 400, 310, 40));

        edtCPF.setBackground(new java.awt.Color(51, 170, 236));
        edtCPF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        edtCPF.setForeground(new java.awt.Color(255, 255, 255));
        try {
            edtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edtCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edtCPF.setText("");
        edtCPF.setToolTipText("CPF");
        edtCPF.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24)); // NOI18N
        edtCPF.setOpaque(false);
        edtCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                edtCPFFocusGained(evt);
            }
        });
        getContentPane().add(edtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 330, 310, 40));

        lblTitle.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 40)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Cadastro de Funcionário");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 15, 828, -1));

        imgBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Activitys/images/background.jpg"))); // NOI18N
        imgBackground.setOpaque(true);
        imgBackground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgBackgroundMouseClicked(evt);
            }
        });
        getContentPane().add(imgBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtNameFocusGained
        if (edtName.getText().equals("Nome")) {
            edtName.setText("");
        }
    }//GEN-LAST:event_edtNameFocusGained

    private void edtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtNameFocusLost
        if (edtName.getText().trim().isEmpty()) {
            edtName.setText("Nome");
        }
    }//GEN-LAST:event_edtNameFocusLost

    private void btnProntoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProntoMouseClicked
        System.out.println(CheckPIS());
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

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        Desfoque.setVisible(true);
    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        Desfoque.setVisible(false);

    }//GEN-LAST:event_formWindowGainedFocus

    private void imgBackgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgBackgroundMouseClicked
        imgBackground.requestFocus();
    }//GEN-LAST:event_imgBackgroundMouseClicked

    private void edtLastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtLastnameFocusGained
        if(edtLastname.getText().equals("Sobrenome")){
            edtLastname.setText("");
        }
    }//GEN-LAST:event_edtLastnameFocusGained

    private void edtLastnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtLastnameFocusLost
        if(edtLastname.getText().trim().isEmpty()){
            edtLastname.setText("Sobrenome");
        }
    }//GEN-LAST:event_edtLastnameFocusLost

    private void edtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtPasswordFocusGained
        if(edtPassword.getText().equals("Senha")){
            edtPassword.setText("");
        }
    }//GEN-LAST:event_edtPasswordFocusGained

    private void edtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtPasswordFocusLost
        if(edtPassword.getText().trim().isEmpty()){
            edtPassword.setText("Senha");
        }
    }//GEN-LAST:event_edtPasswordFocusLost

    private void edtNrCardFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtNrCardFocusGained
        if(edtNrCard.getText().equals("Nr Cartão")){
            edtNrCard.setText("");
        }
    }//GEN-LAST:event_edtNrCardFocusGained

    private void edtNrCardFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtNrCardFocusLost
        if(edtNrCard.getText().trim().isEmpty()){
            edtNrCard.setText("Nr Cartão");
        }
    }//GEN-LAST:event_edtNrCardFocusLost

    private void edtCPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtCPFFocusGained
        lbCPF.setVisible(false);
    }//GEN-LAST:event_edtCPFFocusGained

    private void edtRGFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtRGFocusGained
        lbRG.setVisible(false);
    }//GEN-LAST:event_edtRGFocusGained

    private void edtPISFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_edtPISFocusGained
        lbPIS.setVisible(false);
    }//GEN-LAST:event_edtPISFocusGained

    
    public boolean CheckIsEmpty(){
        if((edtName.getText().equals("Nome")) || (edtName.getText().trim().isEmpty())){
            return false;
        } else if((edtLastname.getText().equals("Sobrenome")) || (edtLastname.getText().trim().isEmpty())){
            return false;
        } else if((edtPassword.getText().equals("Senha")) || (edtPassword.getText().trim().isEmpty())){
            return false;
        } else if((edtNrCard.getText().equals("Nr Cartão")) || (edtNrCard.getText().trim().isEmpty())){
            return false;
        } else if((edtCPF.getText().equals("   .   .   -  ")) || (edtCPF.getText().equals("..-"))){
            return false;
        } else if((edtRG.getText().equals("  .   .   -  ")) || (edtRG.getText().equals("..-"))){
            return false;
        } else if((edtPIS.getText().equals("   .     .  - ")) || (edtPIS.getText().equals("..-"))){
            return false;
        } else if (cbFunction.getSelectedIndex() == 0){
            return false;
        }
            
        return true;
    }
    public boolean CheckCPF() {
        Employee e = new Employee();
        return e.isCPF((edtCPF.getText().replace(".", "").replace("-", "")));
    }
    
    public boolean CheckPIS() {
        Employee e = new Employee();
        e.setPIS(edtPIS.getText());
        return e.isPis();
    }
    
    public void fillFucntion(){
        Function f = new Function();
        ResultSet rs = f.ReadAll();
        try {
            while(rs.next()){               
                cbFunction.addItem(rs.getString("FunctionName"));
            }
        } catch (SQLException ex) {
        }
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
            java.util.logging.Logger.getLogger(actCreateEmployer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(actCreateEmployer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(actCreateEmployer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(actCreateEmployer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new actCreateEmployer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Desfoque;
    private javax.swing.JLabel btnPronto;
    private javax.swing.JLabel btnSair;
    private javax.swing.JComboBox cbFunction;
    private javax.swing.JFormattedTextField edtCPF;
    private javax.swing.JTextField edtLastname;
    private javax.swing.JTextField edtName;
    private javax.swing.JTextField edtNrCard;
    private javax.swing.JFormattedTextField edtPIS;
    private javax.swing.JTextField edtPassword;
    private javax.swing.JFormattedTextField edtRG;
    private javax.swing.JLabel imgBackground;
    private javax.swing.JLabel imgPronto;
    private javax.swing.JLabel lbCPF;
    private javax.swing.JLabel lbPIS;
    private javax.swing.JLabel lbRG;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}