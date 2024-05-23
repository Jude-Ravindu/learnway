/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package learnway.components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
import learnway.swing.LogoutListener;
import learnway.util.GlobalVar;
import learnway.view.Main;

/**
 *
 * @author macintosh
 */
public class Header extends JPanel implements ActionListener {

    private LogoutListener logoutListener;

    public Header() {
        initComponents();
        lbluserType.setText((GlobalVar.userType + " Dashboard").toUpperCase());
        lbluserEmail.setText(("Welcome " +GlobalVar.userEmail).toUpperCase());
        setOpaque(false);
    }

    public void setLogoutListener(LogoutListener logoutListener) {
        this.logoutListener = logoutListener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("clicked");
        if (e.getSource() == logoutButton) {
            logoutListener.onLogout();
        }
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setPaint(new GradientPaint(0, 0, new Color(21, 94, 117), 0, getHeight(), new Color(19, 110, 134)));
        g2.fill(new Rectangle2D.Double(0, 0, getWidth(), getHeight()));
        g2.dispose();
        super.paintComponent(grphcs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        logoutButton = new learnway.components.Button();
        lbluserType = new javax.swing.JLabel();
        lbluserEmail = new javax.swing.JLabel();

        jLabel1.setFont(jLabel1.getFont().deriveFont((float)26));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/learnway/resources/menu/learnWay.png"))); // NOI18N
        jLabel1.setText("LearnWay");

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        lbluserType.setFont(lbluserType.getFont().deriveFont((float)24));
        lbluserType.setForeground(new java.awt.Color(255, 255, 255));
        lbluserType.setText("UserType");

        lbluserEmail.setFont(lbluserEmail.getFont().deriveFont((float)16));
        lbluserEmail.setForeground(new java.awt.Color(255, 255, 255));
        lbluserEmail.setText("UserEmail");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(172, 172, 172)
                .addComponent(lbluserType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 278, Short.MAX_VALUE)
                .addComponent(lbluserEmail)
                .addGap(18, 18, 18)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbluserType)
                    .addComponent(lbluserEmail))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        // 1. Logout Logic (if any)
        // Add any code you need to perform when the user logs out,
        // such as clearing session data or invalidating tokens.

        // 2. Close Current Form (Main.java)
        System.out.println("btn clikced");
        actionPerformed(evt);
    }//GEN-LAST:event_logoutButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbluserEmail;
    private javax.swing.JLabel lbluserType;
    private learnway.components.Button logoutButton;
    // End of variables declaration//GEN-END:variables
}
