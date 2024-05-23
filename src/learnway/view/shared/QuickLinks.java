/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package learnway.view.shared;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;
import learnway.components.Card;
import learnway.model.Model_Card;
import learnway.swing.QuickLinkClickListener;

import learnway.util.GlobalVar;

/**
 *
 * @author sandu
 */
public class QuickLinks extends javax.swing.JPanel {


    /**
     * Creates new form QuickLinks
     */
    private void hideCards() {
        card1.setVisible(false);
        card2.setVisible(false);
        card3.setVisible(false);
        card4.setVisible(false);
        card5.setVisible(false);
        card6.setVisible(false);
        card7.setVisible(false);
        card8.setVisible(false);
        card9.setVisible(false);
        card10.setVisible(false);
        card11.setVisible(false);
    }

    public QuickLinks() {
        initComponents();



        hideCards();
        jPanel2.removeAll();
        
        if (GlobalVar.userType.equals("Owner")) {
            ownerQuickLinks();
        } else if (GlobalVar.userType.equals("Admin")) {
            adminQuickLinks();
        } else if (GlobalVar.userType.equals("Academic")) {
            academicQuickLinks();
        } else {
            instructorQuickLinks();
        }

       
        QuickLinkClickListener listener = new QuickLinkClickListener() {
            @Override
            public void onQuickLinkClick(String title) {
                System.out.println("QuickLink clicked: " + title);
            }
        };

        card1.setQuickLinkClickListener(listener);
        card2.setQuickLinkClickListener(listener);
        card3.setQuickLinkClickListener(listener);
        card4.setQuickLinkClickListener(listener);
        card5.setQuickLinkClickListener(listener);
        card6.setQuickLinkClickListener(listener);
        card7.setQuickLinkClickListener(listener);
        card8.setQuickLinkClickListener(listener);
        card9.setQuickLinkClickListener(listener);
        card10.setQuickLinkClickListener(listener);
        card11.setQuickLinkClickListener(listener);
    }
    private void setCardProperties(Card card, String title, Color color1, Color color2) {
        card.setTitle(title);
        card.setColor1(color1);
        card.setColor2(color2);
        card.setVisible(true);
    }

    private void addCardsToPanel(Card[] cards) {
        jPanel2.setLayout(new java.awt.GridLayout((int) Math.ceil(cards.length / 4.0), 4, 10, 10));
        for (Card card : cards) {
            jPanel2.add(card);
        }
    }
    private void academicQuickLinks() {
        
        setCardProperties(card1, "Attendence", new Color(59, 188, 162), new Color(55, 64, 223));
        setCardProperties(card3, "Subject", new Color(255, 65, 0), new Color(255, 197, 90));
        setCardProperties(card4, "Invoice", new Color(133, 15, 41), new Color(199, 56, 189));
        setCardProperties(card5, "Payment", new Color(255, 0, 128), new Color(255, 170, 128));
        setCardProperties(card6, "Students", new Color(3, 174, 210), new Color(253, 222, 85));
        setCardProperties(card8, "Enrollments", new Color(255, 101, 0), new Color(109, 197, 209));
        setCardProperties(card9, "Class", new Color(254, 185, 65), new Color(238, 69, 64));
        setCardProperties(card10, "Meetings", new Color(41, 52, 89), new Color(33, 101, 131));
        setCardProperties(card11, "Exams", new Color(61, 90, 241), new Color(34, 209, 238));
   
        addCardsToPanel(new Card[]{card1, card3, card4, card5, card6, card8, card9, card10, card11});
    }
    private void adminQuickLinks() {
        setCardProperties(card1, "Attendence", new Color(59, 188, 162), new Color(55, 64, 223));
        setCardProperties(card2, "Staff", new Color(255, 95, 0), new Color(255, 159, 102));
        setCardProperties(card3, "Subject", new Color(255, 65, 0), new Color(255, 197, 90));
        setCardProperties(card4, "Invoice", new Color(133, 15, 41), new Color(199, 56, 189));
        setCardProperties(card5, "Payment", new Color(255, 0, 128), new Color(255, 170, 128));
        setCardProperties(card6, "Students", new Color(3, 174, 210), new Color(253, 222, 85));
        setCardProperties(card7, "Lectures", new Color(196, 12, 12), new Color(55, 64, 223));
        setCardProperties(card8, "Enrollments", new Color(255, 101, 0), new Color(109, 197, 209));
        setCardProperties(card9, "Class", new Color(254, 185, 65), new Color(238, 69, 64));
        setCardProperties(card10, "Meetings", new Color(41, 52, 89), new Color(33, 101, 131));
        setCardProperties(card11, "Exams", new Color(61, 90, 241), new Color(34, 209, 238));

        addCardsToPanel(new Card[]{card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11});
    }


    private void ownerQuickLinks() {
        setCardProperties(card2, "Staff", new Color(255, 95, 0), new Color(255, 159, 102));
        setCardProperties(card4, "Invoice", new Color(133, 15, 41), new Color(199, 56, 189));
        setCardProperties(card5, "Payment", new Color(255, 0, 128), new Color(255, 170, 128));
        setCardProperties(card7, "Lectures", new Color(196, 12, 12), new Color(55, 64, 223));
        setCardProperties(card9, "Class", new Color(254, 185, 65), new Color(238, 69, 64));
        setCardProperties(card10, "Meetings", new Color(41, 52, 89), new Color(33, 101, 131));

        addCardsToPanel(new Card[]{card2, card4, card5, card7, card9, card10});
    }

    private void instructorQuickLinks() {
        setCardProperties(card3, "Subject", new Color(255, 65, 0), new Color(255, 197, 90));
        setCardProperties(card6, "Students", new Color(3, 174, 210), new Color(253, 222, 85));
        setCardProperties(card9, "Class", new Color(254, 185, 65), new Color(238, 69, 64));
        setCardProperties(card10, "Meetings", new Color(41, 52, 89), new Color(33, 101, 131));
        setCardProperties(card11, "Exams", new Color(61, 90, 241), new Color(34, 209, 238));
       
        addCardsToPanel(new Card[]{card3, card6, card9, card10, card11});
    }

//   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        card1 = new learnway.components.Card();
        card2 = new learnway.components.Card();
        card3 = new learnway.components.Card();
        card4 = new learnway.components.Card();
        card5 = new learnway.components.Card();
        card6 = new learnway.components.Card();
        card7 = new learnway.components.Card();
        card8 = new learnway.components.Card();
        card9 = new learnway.components.Card();
        card10 = new learnway.components.Card();
        card11 = new learnway.components.Card();

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+25));
        jLabel1.setText("Quick Links");

        jPanel2.setLayout(new java.awt.GridLayout(3, 4, 10, 10));

        card1.setToolTipText("");
        jPanel2.add(card1);

        card2.setToolTipText("");
        jPanel2.add(card2);

        card3.setToolTipText("");
        jPanel2.add(card3);

        card4.setToolTipText("");
        jPanel2.add(card4);

        card5.setToolTipText("");
        jPanel2.add(card5);

        card6.setToolTipText("");
        jPanel2.add(card6);

        card7.setToolTipText("");
        jPanel2.add(card7);

        card8.setToolTipText("");
        jPanel2.add(card8);

        card9.setToolTipText("");
        jPanel2.add(card9);

        card10.setToolTipText("");
        jPanel2.add(card10);

        card11.setToolTipText("");
        jPanel2.add(card11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private learnway.components.Card card1;
    private learnway.components.Card card10;
    private learnway.components.Card card11;
    private learnway.components.Card card2;
    private learnway.components.Card card3;
    private learnway.components.Card card4;
    private learnway.components.Card card5;
    private learnway.components.Card card6;
    private learnway.components.Card card7;
    private learnway.components.Card card8;
    private learnway.components.Card card9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
