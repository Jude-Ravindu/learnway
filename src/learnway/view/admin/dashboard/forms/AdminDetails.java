/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package learnway.view.admin.dashboard.forms;

import com.lms.asserts.db.DbConnection;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import learnway.view.components.SimpleForm;

/**
 *
 * @author Ishara Deshan
 */
public class AdminDetails extends SimpleForm {

   public AdminDetails() {
        initComponents();
        loadGender();
        loadPosition();
    }

    private void loadGender() {
        try {
            DbConnection dbConnection = DbConnection.getInstance();
            String query = "SELECT * FROM `gender`";
            ResultSet resultSet = dbConnection.executeQuery(query);
            Vector vector = new Vector();
            vector.add("Select");

            while (resultSet.next()) {
                vector.add(resultSet.getString("name"));
            }

            DefaultComboBoxModel defaultComboBoxModel = (DefaultComboBoxModel) jComboBox1.getModel();
            defaultComboBoxModel.removeAllElements();
            defaultComboBoxModel.addAll(vector);
            jComboBox1.setSelectedIndex(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadPosition() {
        try {

            DbConnection dbConnection = DbConnection.getInstance();
            String query = "SELECT * FROM `position`";
            ResultSet resultSet = dbConnection.executeQuery(query);
            

            Vector vector = new Vector();
            vector.add("Select");

            while (resultSet.next()) {
                vector.add(resultSet.getString("name"));
            }

            DefaultComboBoxModel defaultComboBoxModel = (DefaultComboBoxModel) jComboBox2.getModel();
            defaultComboBoxModel.removeAllElements();
            defaultComboBoxModel.addAll(vector);
            jComboBox2.setSelectedIndex(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        button2 = new learnway.view.components.Button();
        button3 = new learnway.view.components.Button();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textField1 = new learnway.view.components.TextField();
        jLabel3 = new javax.swing.JLabel();
        textField2 = new learnway.view.components.TextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        textField3 = new learnway.view.components.TextField();
        jLabel6 = new javax.swing.JLabel();
        textField4 = new learnway.view.components.TextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        textField5 = new learnway.view.components.TextField();
        jLabel8 = new javax.swing.JLabel();
        passwordField1 = new learnway.view.components.PasswordField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        textField6 = new learnway.view.components.TextField();
        jLabel11 = new javax.swing.JLabel();
        textField8 = new learnway.view.components.TextField();

        setPreferredSize(new java.awt.Dimension(915, 700));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(915, 102));

        button2.setBackground(new java.awt.Color(51, 153, 255));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("Update");
        button2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        button3.setBackground(new java.awt.Color(255, 0, 102));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("Exit");
        button3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button2, button3});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {button2, button3});

        jPanel3.setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel4.setPreferredSize(new java.awt.Dimension(457, 550));
        jPanel4.setLayout(new java.awt.GridLayout(10, 1));

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() & ~java.awt.Font.BOLD, jLabel2.getFont().getSize()+1));
        jLabel2.setText("FirstName");
        jPanel4.add(jLabel2);

        textField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField1ActionPerformed(evt);
            }
        });
        jPanel4.add(textField1);

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getStyle() & ~java.awt.Font.BOLD, jLabel3.getFont().getSize()+1));
        jLabel3.setText("Username");
        jPanel4.add(jLabel3);

        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });
        jPanel4.add(textField2);

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getStyle() & ~java.awt.Font.BOLD, jLabel4.getFont().getSize()+1));
        jLabel4.setText("Mobile");
        jPanel4.add(jLabel4);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboBox1);

        jLabel5.setFont(jLabel5.getFont().deriveFont(jLabel5.getFont().getStyle() & ~java.awt.Font.BOLD, jLabel5.getFont().getSize()+1));
        jLabel5.setText("Gender");
        jPanel4.add(jLabel5);
        jPanel4.add(textField3);

        jLabel6.setFont(jLabel6.getFont().deriveFont(jLabel6.getFont().getStyle() & ~java.awt.Font.BOLD, jLabel6.getFont().getSize()+1));
        jLabel6.setText("NIC");
        jPanel4.add(jLabel6);
        jPanel4.add(textField4);

        jPanel5.setLayout(new java.awt.GridLayout(10, 1));

        jLabel7.setFont(jLabel7.getFont().deriveFont(jLabel7.getFont().getStyle() & ~java.awt.Font.BOLD, jLabel7.getFont().getSize()+1));
        jLabel7.setText("LastName");
        jPanel5.add(jLabel7);
        jPanel5.add(textField5);

        jLabel8.setFont(jLabel8.getFont().deriveFont(jLabel8.getFont().getStyle() & ~java.awt.Font.BOLD, jLabel8.getFont().getSize()+1));
        jLabel8.setText("Password");
        jPanel5.add(jLabel8);

        passwordField1.setText("passwordField1");
        jPanel5.add(passwordField1);

        jLabel10.setFont(jLabel10.getFont().deriveFont(jLabel10.getFont().getStyle() & ~java.awt.Font.BOLD, jLabel10.getFont().getSize()+1));
        jLabel10.setText("Position");
        jPanel5.add(jLabel10);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel5.add(jComboBox2);

        jLabel9.setFont(jLabel9.getFont().deriveFont(jLabel9.getFont().getStyle() & ~java.awt.Font.BOLD, jLabel9.getFont().getSize()+1));
        jLabel9.setText("Email");
        jPanel5.add(jLabel9);
        jPanel5.add(textField6);

        jLabel11.setFont(jLabel11.getFont().deriveFont(jLabel11.getFont().getStyle() & ~java.awt.Font.BOLD, jLabel11.getFont().getSize()+1));
        jLabel11.setText("Address");
        jPanel5.add(jLabel11);
        jPanel5.add(textField8);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel4, jPanel5});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField1ActionPerformed

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        System.out.println(jPanel1.getParent());
        System.out.println("_________________________________");
        System.out.println(jPanel1.getParent().getParent());
        System.out.println("_________________________________");
        System.out.println("_________________________________");
        System.out.println(jPanel1.getParent().getParent().getParent());
        System.out.println(jPanel1.getParent().getParent().getParent().getParent());
        
        
        
    }//GEN-LAST:event_button3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private learnway.view.components.Button button2;
    private learnway.view.components.Button button3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private learnway.view.components.PasswordField passwordField1;
    private learnway.view.components.TextField textField1;
    private learnway.view.components.TextField textField2;
    private learnway.view.components.TextField textField3;
    private learnway.view.components.TextField textField4;
    private learnway.view.components.TextField textField5;
    private learnway.view.components.TextField textField6;
    private learnway.view.components.TextField textField8;
    // End of variables declaration//GEN-END:variables
}
