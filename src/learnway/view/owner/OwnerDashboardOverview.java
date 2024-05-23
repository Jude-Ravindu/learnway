/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package learnway.view.owner;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.util.Random;
import javax.swing.JLabel;
import raven.chart.data.pie.DefaultPieDataset;
import raven.chart.pie.PieChart;

/**
 *
 * @author Ishara Deshan
 */
public class OwnerDashboardOverview extends javax.swing.JPanel {

    /**
     * Creates new form OwnerDashboardOverview
     */
    public OwnerDashboardOverview() {
        initComponents();
        createPieChart();
    }

    private void createPieChart() {
        pieChart1 = new PieChart();
        JLabel header1 = new JLabel("Students For Science Stream");
        header1.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:+1");
        pieChart1.setHeader(header1);
        pieChart1.getChartColor().addColor(Color.decode("#f87171"), Color.decode("#fb923c"), Color.decode("#fbbf24"), Color.decode("#a3e635"), Color.decode("#34d399"), Color.decode("#22d3ee"), Color.decode("#818cf8"), Color.decode("#c084fc"));
        pieChart1.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:5,5,5,5,$Component.borderColor,,20");
        pieChart1.setDataset(createPieData1());
        jPanel9.add(pieChart1, "split 3,height 290");

        pieChart2 = new PieChart();
        JLabel header2 = new JLabel("Students For Commerce Stream");
        header2.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:+1");
        pieChart2.setHeader(header2);
        pieChart2.getChartColor().addColor(Color.decode("#f87171"), Color.decode("#fb923c"), Color.decode("#fbbf24"), Color.decode("#a3e635"), Color.decode("#34d399"), Color.decode("#22d3ee"), Color.decode("#818cf8"), Color.decode("#c084fc"));
        pieChart2.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:5,5,5,5,$Component.borderColor,,20");
        pieChart2.setDataset(createPieData2());
        jPanel10.add(pieChart2, "split 3,height 290");

        pieChart3 = new PieChart();
        JLabel header3 = new JLabel("Students For Technology Stream");
        header3.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:+1");
        pieChart3.setHeader(header3);
        pieChart3.getChartColor().addColor(Color.decode("#f87171"), Color.decode("#fb923c"), Color.decode("#fbbf24"), Color.decode("#a3e635"), Color.decode("#34d399"), Color.decode("#22d3ee"), Color.decode("#818cf8"), Color.decode("#c084fc"));
        pieChart3.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:5,5,5,5,$Component.borderColor,,20");
        pieChart3.setDataset(createPieData3());
        jPanel11.add(pieChart3, "split 3,height 290");

        pieChart4 = new PieChart();
        JLabel header4 = new JLabel("Students For Art Stream");
        header4.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:+1");
        pieChart4.setHeader(header4);
        pieChart4.getChartColor().addColor(Color.decode("#f87171"), Color.decode("#fb923c"), Color.decode("#fbbf24"), Color.decode("#a3e635"), Color.decode("#34d399"), Color.decode("#22d3ee"), Color.decode("#818cf8"), Color.decode("#c084fc"));
        pieChart4.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:5,5,5,5,$Component.borderColor,,20");
        pieChart4.setDataset(createPieData4());
        jPanel12.add(pieChart4, "split 3,height 290");
    }

    private DefaultPieDataset createPieData1() {
        DefaultPieDataset<String> dataset = new DefaultPieDataset<>();
        Random random = new Random();
        dataset.addValue("Biology", random.nextInt(100) + 50);
        dataset.addValue("Combine Maths", random.nextInt(100) + 50);
        dataset.addValue("Chemistry", random.nextInt(100) + 50);
        dataset.addValue("Physics", random.nextInt(100) + 50);
         dataset.addValue("ICT", random.nextInt(100) + 50);
              return dataset;
    }
    
      private DefaultPieDataset createPieData2() {
        DefaultPieDataset<String> dataset = new DefaultPieDataset<>();
        Random random = new Random();
        dataset.addValue("Account", random.nextInt(100) + 50);
        dataset.addValue("Buisness Studies", random.nextInt(100) + 50);
        dataset.addValue("Econ", random.nextInt(100) + 50);
        dataset.addValue("ICT", random.nextInt(100) + 50);
      
              return dataset;
    }
        private DefaultPieDataset createPieData3() {
        DefaultPieDataset<String> dataset = new DefaultPieDataset<>();
        Random random = new Random();
        dataset.addValue("ET", random.nextInt(100) + 50);
        dataset.addValue("SFT", random.nextInt(100) + 50);
        dataset.addValue("ICT", random.nextInt(100) + 50);
        dataset.addValue("BST", random.nextInt(100) + 50);
      
              return dataset;
    }
          private DefaultPieDataset createPieData4() {
        DefaultPieDataset<String> dataset = new DefaultPieDataset<>();
        Random random = new Random();
        dataset.addValue("Media", random.nextInt(100) + 50);
        dataset.addValue("Geogrophy", random.nextInt(100) + 50);
        dataset.addValue("Logistics", random.nextInt(100) + 50);
        dataset.addValue("Sinhala Literature", random.nextInt(100) + 50);
        dataset.addValue("English Literature", random.nextInt(100) + 50);
        
              return dataset;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        card_AttendanceDetails1 = new learnway.components.Card_AttendanceDetails();
        card_AttendanceDetails2 = new learnway.components.Card_AttendanceDetails();
        card_AttendanceDetails3 = new learnway.components.Card_AttendanceDetails();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();

        setLayout(new javax.swing.OverlayLayout(this));

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+24));
        jLabel1.setText("Owner Overview");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        card_AttendanceDetails1.setColor1(new java.awt.Color(195, 20, 50));
        card_AttendanceDetails1.setColor2(new java.awt.Color(36, 11, 54));
        jPanel3.add(card_AttendanceDetails1);

        card_AttendanceDetails2.setColor1(new java.awt.Color(195, 20, 50));
        card_AttendanceDetails2.setColor2(new java.awt.Color(36, 11, 54));
        jPanel3.add(card_AttendanceDetails2);

        card_AttendanceDetails3.setColor1(new java.awt.Color(195, 20, 50));
        card_AttendanceDetails3.setColor2(new java.awt.Color(36, 11, 54));
        jPanel3.add(card_AttendanceDetails3);

        jPanel5.setLayout(new javax.swing.OverlayLayout(jPanel5));

        jPanel6.setLayout(new java.awt.GridLayout(2, 2, 10, 10));

        jPanel9.setLayout(new javax.swing.OverlayLayout(jPanel9));
        jPanel6.add(jPanel9);

        jPanel10.setLayout(new javax.swing.OverlayLayout(jPanel10));
        jPanel6.add(jPanel10);

        jPanel11.setLayout(new javax.swing.OverlayLayout(jPanel11));
        jPanel6.add(jPanel11);

        jPanel12.setLayout(new javax.swing.OverlayLayout(jPanel12));
        jPanel6.add(jPanel12);

        jPanel5.add(jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private PieChart pieChart1;
    private PieChart pieChart2;
    private PieChart pieChart3;
    private PieChart pieChart4;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private learnway.components.Card_AttendanceDetails card_AttendanceDetails1;
    private learnway.components.Card_AttendanceDetails card_AttendanceDetails2;
    private learnway.components.Card_AttendanceDetails card_AttendanceDetails3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
