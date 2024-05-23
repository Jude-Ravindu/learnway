package learnway.components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import learnway.model.ExamModel_Card;
import learnway.model.Model_Card;


public class ExamCard extends javax.swing.JPanel {
    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    private Color color1;
    private Color color2;

    public ExamCard() {
        initComponents();
        setOpaque(false);
        color1 = Color.decode("#141E30");
        color2 = Color.decode("#243B55");
    }

    public void setData(ExamModel_Card data){
lbExamId.setText(data.getExamId());
lbDatetime.setText(data.getDatetime());
lbName.setText(data.getExamName());
lbStatus.setText(data.getStatus());
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbExamId = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbDatetime = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lbExamId.setFont(lbExamId.getFont().deriveFont(lbExamId.getFont().getStyle() | java.awt.Font.BOLD, lbExamId.getFont().getSize()+11));
        lbExamId.setForeground(new java.awt.Color(255, 255, 255));
        lbExamId.setText("Exam ID");

        lbName.setFont(lbName.getFont().deriveFont(lbName.getFont().getStyle() | java.awt.Font.BOLD, lbName.getFont().getSize()+3));
        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setText("Exam Name , Batch");

        lbDatetime.setFont(lbDatetime.getFont().deriveFont(lbDatetime.getFont().getSize()+1f));
        lbDatetime.setForeground(new java.awt.Color(255, 255, 255));
        lbDatetime.setText("Date Time");

        lbStatus.setFont(lbStatus.getFont().deriveFont(lbStatus.getFont().getSize()-1f));
        lbStatus.setForeground(new java.awt.Color(255, 255, 255));
        lbStatus.setText("Done");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbExamId)
                    .addComponent(lbName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbStatus, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbDatetime, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDatetime)
                    .addComponent(lbExamId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(lbStatus))
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

       @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(getWidth() - (getHeight() / 2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth() - (getHeight() / 2) - 20, getHeight() / 2 + 20, getHeight(), getHeight());
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbDatetime;
    private javax.swing.JLabel lbExamId;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbStatus;
    // End of variables declaration//GEN-END:variables
}
