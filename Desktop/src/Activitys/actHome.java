/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activitys;

import java.awt.Color;
import java.awt.Cursor;
import static java.lang.Thread.sleep;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author LOL
 */
public class actHome extends javax.swing.JFrame {

    /**
     * Creates new form actHome
     */
    private String Login;
    private Boolean doInstruciton = false;

    public Boolean getDoInstruciton() {
        return doInstruciton;
    }

    public void setDoInstruciton(Boolean doInstruciton) {
        this.doInstruciton = doInstruciton;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public actHome() {
        initComponents();
        btnSearch.setVisible(false);
        btnManageEmployee.setVisible(false);
        lblHelp.setVisible(false);
        lblConfig.setVisible(false);
        pnInstructions.setVisible(false);
        InstructionBackground.setBackground(new Color(0, 0, 0, 100));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnLogin = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        loginBackground = new javax.swing.JLabel();
        pnInstructions = new javax.swing.JPanel();
        pnMessage4 = new javax.swing.JPanel();
        lblMesssage4 = new javax.swing.JLabel();
        pnMessage3 = new javax.swing.JPanel();
        lblMesssage3 = new javax.swing.JLabel();
        pnMessage2 = new javax.swing.JPanel();
        lblMesssage2 = new javax.swing.JLabel();
        pnMessage1 = new javax.swing.JPanel();
        lblMesssage1 = new javax.swing.JLabel();
        imgSearchTutorial = new javax.swing.JLabel();
        imgManageEmployeeTutorial = new javax.swing.JLabel();
        btnHelpInstruction = new javax.swing.JLabel();
        btnConfigInstruction = new javax.swing.JLabel();
        lblInstructionSubtitle = new javax.swing.JLabel();
        lblInstructionTitle = new javax.swing.JLabel();
        btnExitInstructions = new javax.swing.JLabel();
        pnConfirm = new javax.swing.JPanel();
        lblOkay = new javax.swing.JLabel();
        InstructionBackground = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnManageEmployee = new javax.swing.JLabel();
        imgManageEmployee = new javax.swing.JLabel();
        btnSearch = new javax.swing.JLabel();
        imgSearch = new javax.swing.JLabel();
        btnHelp = new javax.swing.JLabel();
        lblHelp = new javax.swing.JLabel();
        btnConfig = new javax.swing.JLabel();
        lblConfig = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();
        edtBackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnLogin.setOpaque(false);
        pnLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogin.setFont(new java.awt.Font("Microsoft YaHei", 0, 48)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("Olá, Fernando");
        pnLogin.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1028, 720));

        loginBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Activitys/images/background.jpg"))); // NOI18N
        pnLogin.add(loginBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(pnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1028, 720));

        pnInstructions.setOpaque(false);
        pnInstructions.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnMessage4.setBackground(new java.awt.Color(0, 255, 204));
        pnMessage4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMesssage4.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        lblMesssage4.setForeground(new java.awt.Color(255, 255, 255));
        lblMesssage4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMesssage4.setText("<html> <p align='center'>No Botão ? Você abre toda a documentação do Programa.<br>Na engrenagem você tem acesso<br>Configurar Administradores e Pontos.</p></html>");
        pnMessage4.add(lblMesssage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 120));

        pnInstructions.add(pnMessage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, 240, 120));

        pnMessage3.setBackground(new java.awt.Color(0, 255, 204));
        pnMessage3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMesssage3.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        lblMesssage3.setForeground(new java.awt.Color(255, 255, 255));
        lblMesssage3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMesssage3.setText("Aqui Você Sai.");
        pnMessage3.add(lblMesssage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 60));

        pnInstructions.add(pnMessage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(912, 42, 110, 60));

        pnMessage2.setBackground(new java.awt.Color(0, 255, 204));
        pnMessage2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMesssage2.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        lblMesssage2.setForeground(new java.awt.Color(255, 255, 255));
        lblMesssage2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMesssage2.setText("<html> <p align='center'>Aqui Você Visualiza os Registros<br>de Datas ou Funcionários especiíicos<br> e pode Gerar Relatóios.</p></html>");
        pnMessage2.add(lblMesssage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 120));

        pnInstructions.add(pnMessage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 102, 240, 120));

        pnMessage1.setBackground(new java.awt.Color(0, 255, 204));
        pnMessage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMesssage1.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        lblMesssage1.setForeground(new java.awt.Color(255, 255, 255));
        lblMesssage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMesssage1.setText("<html> <p align='center'>Aqui Você Gerencia os Funcionários<br>Cadastra Novos, Altera,<br> Visualiza seus Perfis e até Exclui.</p></html>");
        pnMessage1.add(lblMesssage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 120));

        pnInstructions.add(pnMessage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 105, 240, 120));

        imgSearchTutorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Activitys/images/BuscarRelatorio.jpg"))); // NOI18N
        pnInstructions.add(imgSearchTutorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 227, -1, -1));

        imgManageEmployeeTutorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Activitys/images/BotaoGerenciar.jpg"))); // NOI18N
        pnInstructions.add(imgManageEmployeeTutorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 227, -1, -1));

        btnHelpInstruction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Activitys/images/BotaoAjuda.jpg"))); // NOI18N
        pnInstructions.add(btnHelpInstruction, new org.netbeans.lib.awtextra.AbsoluteConstraints(972, 661, -1, -1));

        btnConfigInstruction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Activitys/images/BotaoConfiguracoes.jpg"))); // NOI18N
        pnInstructions.add(btnConfigInstruction, new org.netbeans.lib.awtextra.AbsoluteConstraints(909, 661, -1, -1));

        lblInstructionSubtitle.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 24)); // NOI18N
        lblInstructionSubtitle.setForeground(new java.awt.Color(255, 255, 255));
        lblInstructionSubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstructionSubtitle.setText("Para começarmos vou te dar algumas informações...");
        pnInstructions.add(lblInstructionSubtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 828, -1));

        lblInstructionTitle.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 40)); // NOI18N
        lblInstructionTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblInstructionTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstructionTitle.setText("Bem Vindo ao MS Controle de Ponto");
        pnInstructions.add(lblInstructionTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 15, 828, -1));

        btnExitInstructions.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 24)); // NOI18N
        btnExitInstructions.setForeground(new java.awt.Color(255, 255, 255));
        btnExitInstructions.setText("Sair");
        pnInstructions.add(btnExitInstructions, new org.netbeans.lib.awtextra.AbsoluteConstraints(973, 10, 40, -1));

        pnConfirm.setBackground(new java.awt.Color(0, 255, 204));
        pnConfirm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        pnConfirm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOkay.setFont(new java.awt.Font("Microsoft YaHei", 0, 30)); // NOI18N
        lblOkay.setForeground(new java.awt.Color(255, 255, 255));
        lblOkay.setText("   Ok, Entendi.");
        lblOkay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOkayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOkayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOkayMouseExited(evt);
            }
        });
        pnConfirm.add(lblOkay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 60));

        pnInstructions.add(pnConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 300, 60));

        InstructionBackground.setOpaque(true);
        pnInstructions.add(InstructionBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1028, 720));

        getContentPane().add(pnInstructions, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1028, 720));

        lblTitle.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 40)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Home");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 15, 828, -1));

        btnManageEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Activitys/images/BotaoGerenciar2.jpg"))); // NOI18N
        btnManageEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnManageEmployeeMouseExited(evt);
            }
        });
        getContentPane().add(btnManageEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 227, -1, -1));

        imgManageEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Activitys/images/BotaoGerenciar.jpg"))); // NOI18N
        imgManageEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgManageEmployeeMouseEntered(evt);
            }
        });
        getContentPane().add(imgManageEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 227, -1, -1));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Activitys/images/BuscarRelatorio2.jpg"))); // NOI18N
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchMouseExited(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 227, -1, -1));
        btnSearch.getAccessibleContext().setAccessibleDescription("");

        imgSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Activitys/images/BuscarRelatorio.jpg"))); // NOI18N
        imgSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imgSearchMouseEntered(evt);
            }
        });
        getContentPane().add(imgSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 227, -1, -1));

        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Activitys/images/BotaoAjuda.jpg"))); // NOI18N
        btnHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHelpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHelpMouseExited(evt);
            }
        });
        getContentPane().add(btnHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(972, 661, -1, -1));

        lblHelp.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        lblHelp.setForeground(new java.awt.Color(255, 255, 255));
        lblHelp.setText("Ajuda");
        getContentPane().add(lblHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(912, 671, -1, -1));

        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Activitys/images/BotaoConfiguracoes.jpg"))); // NOI18N
        btnConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfigMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfigMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfigMouseExited(evt);
            }
        });
        getContentPane().add(btnConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(909, 661, -1, -1));

        lblConfig.setFont(new java.awt.Font("Microsoft YaHei", 0, 20)); // NOI18N
        lblConfig.setForeground(new java.awt.Color(255, 255, 255));
        lblConfig.setText("Configurações");
        getContentPane().add(lblConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 671, -1, -1));

        btnExit.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Sair");
        btnExit.setToolTipText("Sair");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(973, 10, 40, -1));

        edtBackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Activitys/images/background.jpg"))); // NOI18N
        getContentPane().add(edtBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        btnSearch.setVisible(false);
    }//GEN-LAST:event_btnSearchMouseExited

    private void imgSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgSearchMouseEntered
        if (!doInstruciton) {
            btnSearch.setVisible(true);
            btnSearch.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_imgSearchMouseEntered

    private void btnManageEmployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageEmployeeMouseExited
        btnManageEmployee.setVisible(false);
    }//GEN-LAST:event_btnManageEmployeeMouseExited

    private void imgManageEmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgManageEmployeeMouseEntered
        if (!doInstruciton) {
            btnManageEmployee.setVisible(true);
            btnManageEmployee.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_imgManageEmployeeMouseEntered

    private void btnHelpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHelpMouseEntered
        if (!doInstruciton) {
            lblHelp.setVisible(true);
            btnHelp.setCursor(new Cursor(Cursor.HAND_CURSOR));
            btnConfig.setVisible(false);
        }
    }//GEN-LAST:event_btnHelpMouseEntered

    private void btnHelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHelpMouseExited
        lblHelp.setVisible(false);
        btnConfig.setVisible(true);
    }//GEN-LAST:event_btnHelpMouseExited

    private void btnConfigMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigMouseEntered
        if (!doInstruciton) {
            lblConfig.setVisible(true);
            btnConfig.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_btnConfigMouseEntered

    private void btnConfigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigMouseExited
        lblConfig.setVisible(false);
    }//GEN-LAST:event_btnConfigMouseExited

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnExitMouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        LoginAnimation();
    }//GEN-LAST:event_formWindowOpened

    private void lblOkayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOkayMouseEntered
        lblOkay.setForeground(new Color(220, 255, 255));
        lblOkay.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblOkayMouseEntered

    private void lblOkayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOkayMouseExited
        lblOkay.setForeground(Color.white);
    }//GEN-LAST:event_lblOkayMouseExited

    private void lblOkayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOkayMouseClicked
        doInstruciton = false;
        pnInstructions.setVisible(false);
    }//GEN-LAST:event_lblOkayMouseClicked

    private void btnConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigMouseClicked
        new actSettings().setVisible(true);
    }//GEN-LAST:event_btnConfigMouseClicked

    public void LoginAnimation() {
        lblLogin.setText("Olá, " + this.Login);
        new Thread() {
            public void run() {
                int x = 0;
                while (x <= 255) {
                    try {
                        Color Degradation = new Color(255, 255, 255, x);
                        lblLogin.setForeground(Degradation);
                        x += 2;
                        sleep(5);
                    } catch (InterruptedException ex) {
                    }
                }
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                }
                x = 255;
                while (x >= 0) {
                    try {
                        Color Degradation = new Color(255, 255, 255, x);
                        lblLogin.setForeground(Degradation);
                        x -= 2;
                        sleep(5);
                    } catch (InterruptedException ex) {
                    }
                }
                pnLogin.setVisible(false);
                if (doInstruciton) {
                    InstructionAnimation();
                }
            }
        }.start();
    }

    public void InstructionAnimation() {
        new Thread() {
            public void run() {
                lblInstructionSubtitle.setVisible(false);
                lblTitle.setVisible(false);
                btnExitInstructions.setVisible(false);
                pnInstructions.setVisible(true);
                pnMessage1.setVisible(false);
                pnMessage2.setVisible(false);
                pnMessage3.setVisible(false);
                pnMessage4.setVisible(false);
                pnConfirm.setVisible(false);
                imgManageEmployeeTutorial.setVisible(false);
                imgSearchTutorial.setVisible(false);
                btnHelpInstruction.setVisible(false);
                btnConfigInstruction.setVisible(false);
                int x = 0;
                while (x <= 255) {
                    Color Degradation = new Color(255, 255, 255, x);
                    lblInstructionTitle.setForeground(Degradation);
                    try {
                        x += 2;
                        sleep(5);
                    } catch (InterruptedException ex) {
                    }
                }
                lblInstructionSubtitle.setVisible(true);
                x = 0;
                while (x <= 255) {
                    Color Degradation = new Color(255, 255, 255, x);
                    lblInstructionSubtitle.setForeground(Degradation);
                    try {
                        x += 2;
                        sleep(5);
                    } catch (InterruptedException ex) {
                    }
                }
                pnMessage1.setVisible(true);
                x = 0;
                while (x <= 85) {
                    Color Background = new Color(0, 255, 204, x / 5);
                    Color Degradation = new Color(255, 255, 255, x);
                    Border Border = BorderFactory.createLineBorder(Degradation, 2, true);
                    pnMessage1.setBackground(Background);
                    pnMessage1.setBorder(Border);
                    try {
                        x += 3;
                        sleep(8);
                    } catch (InterruptedException ex) {
                    }
                }
                try {
                    sleep(150);
                    imgManageEmployeeTutorial.setVisible(true);
                    sleep(1600);
                } catch (InterruptedException ex) {
                }

                pnMessage2.setVisible(true);
                pnMessage1.setVisible(false);
                pnMessage1.setVisible(true);

                x = 0;
                while (x <= 85) {
                    Color Background = new Color(0, 255, 204, x / 2);
                    Color Degradation = new Color(255, 255, 255, x);
                    Border Border = BorderFactory.createLineBorder(Degradation, 2, true);
                    pnMessage2.setBackground(Background);
                    pnMessage2.setBorder(Border);
                    try {
                        x += 3;
                        sleep(8);
                    } catch (InterruptedException ex) {
                    }
                }
                try {
                    sleep(150);
                    imgSearchTutorial.setVisible(true);
                    sleep(1600);
                } catch (InterruptedException ex) {
                }

                pnMessage3.setVisible(true);
                pnMessage2.setVisible(false);
                pnMessage2.setVisible(true);

                x = 0;
                while (x <= 85) {
                    Color Background = new Color(0, 255, 204, x / 2);
                    Color Degradation = new Color(255, 255, 255, x);
                    Border Border = BorderFactory.createLineBorder(Degradation, 2, true);
                    pnMessage3.setBackground(Background);
                    pnMessage3.setBorder(Border);
                    try {
                        x += 3;
                        sleep(8);
                    } catch (InterruptedException ex) {
                    }
                }
                try {
                    sleep(150);
                    btnExitInstructions.setVisible(true);
                    sleep(1600);
                } catch (InterruptedException ex) {
                }

                pnMessage4.setVisible(true);
                pnMessage3.setVisible(false);
                pnMessage3.setVisible(true);

                x = 0;
                while (x <= 85) {
                    Color Background = new Color(0, 255, 204, x / 2);
                    Color Degradation = new Color(255, 255, 255, x);
                    Border Border = BorderFactory.createLineBorder(Degradation, 2, true);
                    pnMessage4.setBackground(Background);
                    pnMessage4.setBorder(Border);
                    try {
                        x += 3;
                        sleep(8);
                    } catch (InterruptedException ex) {
                    }
                }
                try {
                    sleep(150);
                    btnConfigInstruction.setVisible(true);
                    btnHelpInstruction.setVisible(true);
                    sleep(1000);
                } catch (InterruptedException ex) {
                }
                pnMessage4.setVisible(false);
                pnMessage4.setVisible(true);
                pnConfirm.setVisible(true);
            }

        }.start();
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
            java.util.logging.Logger.getLogger(actHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(actHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(actHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(actHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new actHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel InstructionBackground;
    private javax.swing.JLabel btnConfig;
    private javax.swing.JLabel btnConfigInstruction;
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnExitInstructions;
    private javax.swing.JLabel btnHelp;
    private javax.swing.JLabel btnHelpInstruction;
    private javax.swing.JLabel btnManageEmployee;
    private javax.swing.JLabel btnSearch;
    private javax.swing.JLabel edtBackGround;
    private javax.swing.JLabel imgManageEmployee;
    private javax.swing.JLabel imgManageEmployeeTutorial;
    private javax.swing.JLabel imgSearch;
    private javax.swing.JLabel imgSearchTutorial;
    private javax.swing.JLabel lblConfig;
    private javax.swing.JLabel lblHelp;
    private javax.swing.JLabel lblInstructionSubtitle;
    private javax.swing.JLabel lblInstructionTitle;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblMesssage1;
    private javax.swing.JLabel lblMesssage2;
    private javax.swing.JLabel lblMesssage3;
    private javax.swing.JLabel lblMesssage4;
    private javax.swing.JLabel lblOkay;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel loginBackground;
    private javax.swing.JPanel pnConfirm;
    private javax.swing.JPanel pnInstructions;
    private javax.swing.JPanel pnLogin;
    private javax.swing.JPanel pnMessage1;
    private javax.swing.JPanel pnMessage2;
    private javax.swing.JPanel pnMessage3;
    private javax.swing.JPanel pnMessage4;
    // End of variables declaration//GEN-END:variables
}
