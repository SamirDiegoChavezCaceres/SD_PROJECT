/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment.bank;

/**
 *
 * @author Vj
 */
public class Option_Panel extends javax.swing.JFrame {

    /**
     * Creates new form Option_Panel
     */
    
    static String opt_disp = "";
    
    void display_message()
    {
        info_panel.setText(opt_disp);
    }
    
    public Option_Panel() {
        initComponents();
        if ("depo".equals(Main_Driver.opt)||"with".equals(Main_Driver.opt)||"pay".equals(Main_Driver.opt))
        {
            info_panel.setText(opt_disp);
            opt1_btn.setText("SI");
            opt2_btn.setText("NO");
            opt3_btn.setVisible(false);
        }
        else if ("pay_acc".equals(Main_Driver.opt))
        {
            info_panel.setText(opt_disp);
            opt1_btn.setText("ENERGÍA FIJI LTD");
            opt2_btn.setText("AUTORIDAD DEL AGUA FIJI");
            opt3_btn.setText("CIELO PACÍFICO");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        info_panel = new javax.swing.JLabel();
        cancel_btn = new javax.swing.JButton();
        opt4_btn = new javax.swing.JButton();
        opt3_btn = new javax.swing.JButton();
        opt2_btn = new javax.swing.JButton();
        opt1_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 640));
        setResizable(false);

        info_panel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        info_panel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        info_panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assignment/bank/images/opt_panel.png"))); // NOI18N
        info_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        info_panel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cancel_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cancel_btn.setForeground(new java.awt.Color(255, 255, 255));
        cancel_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assignment/bank/images/lrg_btn.png"))); // NOI18N
        cancel_btn.setText("CANCELAR");
        cancel_btn.setContentAreaFilled(false);
        cancel_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        opt4_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        opt4_btn.setForeground(new java.awt.Color(255, 255, 255));
        opt4_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assignment/bank/images/lrg_btn.png"))); // NOI18N
        opt4_btn.setText("REGRESAR");
        opt4_btn.setContentAreaFilled(false);
        opt4_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        opt4_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt4_btnActionPerformed(evt);
            }
        });

        opt3_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        opt3_btn.setForeground(new java.awt.Color(255, 255, 255));
        opt3_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assignment/bank/images/lrg_btn.png"))); // NOI18N
        opt3_btn.setText("OPCIÓN 3");
        opt3_btn.setContentAreaFilled(false);
        opt3_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        opt3_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt3_btnActionPerformed(evt);
            }
        });

        opt2_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        opt2_btn.setForeground(new java.awt.Color(255, 255, 255));
        opt2_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assignment/bank/images/lrg_btn.png"))); // NOI18N
        opt2_btn.setText("OPCIÓN 2");
        opt2_btn.setContentAreaFilled(false);
        opt2_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        opt2_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt2_btnActionPerformed(evt);
            }
        });

        opt1_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        opt1_btn.setForeground(new java.awt.Color(255, 255, 255));
        opt1_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/assignment/bank/images/lrg_btn.png"))); // NOI18N
        opt1_btn.setText("OPCIÓN 1");
        opt1_btn.setContentAreaFilled(false);
        opt1_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        opt1_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt1_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opt4_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opt3_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opt2_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opt1_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(info_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(info_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opt1_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opt2_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opt3_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(opt4_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opt1_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt1_btnActionPerformed
        if (null != Main_Driver.opt)
        switch (Main_Driver.opt) {
            case "depo":
                Main_Process.pros_depo();
                this.setVisible(false);
                break;
            case "with":
                Main_Process.pros_with();
                this.setVisible(false);
                break;
            case "pay_acc":
                Main_Driver.pay = "EFL";
                Main_Driver.fun_pay_num();
                this.setVisible(false);
                break;
            case "pay":
                Main_Process.pros_pay();
                this.setVisible(false);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_opt1_btnActionPerformed

    private void opt2_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt2_btnActionPerformed
        if (null != Main_Driver.opt)
        switch (Main_Driver.opt) {
            case "depo":
                Main_Driver.fun_depo();
                this.setVisible(false);
                break;
            case "with":
                Main_Driver.fun_with();
                this.setVisible(false);
                break;
            case "pay_acc":
                Main_Driver.pay = "WAF";
                Main_Driver.fun_pay_num();
                this.setVisible(false);
                break;
            case "pay":
                Main_Driver.fun_pay_sel();
                this.setVisible(false);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_opt2_btnActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        new Home_Panel().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void opt3_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt3_btnActionPerformed
        if ("pay_acc".equals(Main_Driver.opt))
        {
            Main_Driver.pay = "SKY";
            Main_Driver.fun_pay_num();
            this.setVisible(false);
        }
    }//GEN-LAST:event_opt3_btnActionPerformed

    private void opt4_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt4_btnActionPerformed
        new Menu_Panel().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_opt4_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Option_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Option_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Option_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Option_Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Option_Panel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_btn;
    private javax.swing.JLabel info_panel;
    private javax.swing.JButton opt1_btn;
    private javax.swing.JButton opt2_btn;
    private javax.swing.JButton opt3_btn;
    private javax.swing.JButton opt4_btn;
    // End of variables declaration//GEN-END:variables
}
