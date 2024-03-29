/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.ageofsettlers;

import java.awt.Component;
import java.util.List;

/**
 *
 * @author Tim
 */
public class SelectedPermanentCardsGUI extends javax.swing.JFrame {

    /**
     * Creates new form SelectedPermanentCardsGUI
     */
    public SelectedPermanentCardsGUI() {
        this.board = BoardController.getInstance();
        initComponents();
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
        selectedCard_1 = new javax.swing.JPanel();
        card_1_marked = new javax.swing.JLabel();
        card_1_marked.setVisible(false);
        card_1_img = new javax.swing.JLabel();
        selectedCard_2 = new javax.swing.JPanel();
        card_2_marked = new javax.swing.JLabel();
        card_2_marked.setVisible(false);
        card_2_img = new javax.swing.JLabel();
        selectedCard_3 = new javax.swing.JPanel();
        card_3_marked = new javax.swing.JLabel();
        card_3_marked.setVisible(false);
        card_3_img = new javax.swing.JLabel();
        selectedCard_4 = new javax.swing.JPanel();
        card_4_marked = new javax.swing.JLabel();
        card_4_marked.setVisible(false);
        card_4_img = new javax.swing.JLabel();
        selectedCard_5 = new javax.swing.JPanel();
        card_5_marked = new javax.swing.JLabel();
        card_5_marked.setVisible(false);
        card_5_img = new javax.swing.JLabel();
        selectedCard_6 = new javax.swing.JPanel();
        card_6_marked = new javax.swing.JLabel();
        card_6_marked.setVisible(false);
        card_6_img = new javax.swing.JLabel();
        selectedCard_7 = new javax.swing.JPanel();
        card_7_marked = new javax.swing.JLabel();
        card_7_marked.setVisible(false);
        card_7_img = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectedCard_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card_1_marked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Marking.png"))); // NOI18N
        selectedCard_1.add(card_1_marked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 125, 125));

        card_1_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card_1_imgMouseClicked(evt);
            }
        });
        selectedCard_1.add(card_1_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 225));

        selectedCard_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card_2_marked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Marking.png"))); // NOI18N
        selectedCard_2.add(card_2_marked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 125, 125));

        card_2_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card_2_imgMouseClicked(evt);
            }
        });
        selectedCard_2.add(card_2_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 225));

        selectedCard_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card_3_marked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Marking.png"))); // NOI18N
        selectedCard_3.add(card_3_marked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 125, 125));

        card_3_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card_3_imgMouseClicked(evt);
            }
        });
        selectedCard_3.add(card_3_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 225));

        selectedCard_4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card_4_marked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Marking.png"))); // NOI18N
        selectedCard_4.add(card_4_marked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 125, 125));

        card_4_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card_4_imgMouseClicked(evt);
            }
        });
        selectedCard_4.add(card_4_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 225));

        selectedCard_5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card_5_marked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Marking.png"))); // NOI18N
        selectedCard_5.add(card_5_marked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 125, 125));

        card_5_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card_5_imgMouseClicked(evt);
            }
        });
        selectedCard_5.add(card_5_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 225));

        selectedCard_6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card_6_marked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Marking.png"))); // NOI18N
        selectedCard_6.add(card_6_marked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 125, 125));

        card_6_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card_6_imgMouseClicked(evt);
            }
        });
        selectedCard_6.add(card_6_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 225));

        selectedCard_7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card_7_marked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Marking.png"))); // NOI18N
        selectedCard_7.add(card_7_marked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 125, 125));

        card_7_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card_7_imgMouseClicked(evt);
            }
        });
        selectedCard_7.add(card_7_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 225));

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Pass");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectedCard_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectedCard_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectedCard_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(selectedCard_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectedCard_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectedCard_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectedCard_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectedCard_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedCard_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedCard_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedCard_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedCard_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedCard_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedCard_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setupCards() {
        List<String> cardList = board.getPlayerPermCards();
        Component[] cardComponents = jPanel1.getComponents();
        int count = 0;
        
        for (Component cardComponent : cardComponents) {
            if (cardComponent instanceof javax.swing.JPanel) {
                javax.swing.JPanel panel = (javax.swing.JPanel) cardComponent;
                javax.swing.JLabel label = (javax.swing.JLabel) panel.getComponent(1);
                if(count < cardList.size()) {
                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/" + cardList.get(count))));
                    label.getAccessibleContext().setAccessibleName(cardList.get(count));
                    count++;
                }
            } 
        }
    }
    
    private void card_1_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card_1_imgMouseClicked
        if(maxCards >= 1) {
            if(card_1_marked.isVisible() == true) {
                card_1_marked.setVisible(false);
            }
            else {
                card_1_marked.setVisible(true);
                card_2_marked.setVisible(false);
                card_3_marked.setVisible(false);
                card_4_marked.setVisible(false);
                card_5_marked.setVisible(false);
                card_6_marked.setVisible(false);
                card_7_marked.setVisible(false);
            }
        }
    }//GEN-LAST:event_card_1_imgMouseClicked

    private void card_2_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card_2_imgMouseClicked
        if(maxCards >= 2) {
            if(card_2_marked.isVisible() == true) {
                card_2_marked.setVisible(false);
            }
            else {
                card_1_marked.setVisible(false);
                card_2_marked.setVisible(true);
                card_3_marked.setVisible(false);
                card_4_marked.setVisible(false);
                card_5_marked.setVisible(false);
                card_6_marked.setVisible(false);
                card_7_marked.setVisible(false);
            }
        }
    }//GEN-LAST:event_card_2_imgMouseClicked

    private void card_3_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card_3_imgMouseClicked
        if(maxCards >= 3) {
            if(card_3_marked.isVisible() == true) {
                card_3_marked.setVisible(false);
            }
            else {
                card_1_marked.setVisible(false);
                card_2_marked.setVisible(false);
                card_3_marked.setVisible(true);
                card_4_marked.setVisible(false);
                card_5_marked.setVisible(false);
                card_6_marked.setVisible(false);
                card_7_marked.setVisible(false);
            }
        }
    }//GEN-LAST:event_card_3_imgMouseClicked

    private void card_4_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card_4_imgMouseClicked
        if(maxCards >= 4) {
            if(card_4_marked.isVisible() == true) {
                card_4_marked.setVisible(false);
            }
            else {
                card_1_marked.setVisible(false);
                card_2_marked.setVisible(false);
                card_3_marked.setVisible(false);
                card_4_marked.setVisible(true);
                card_5_marked.setVisible(false);
                card_6_marked.setVisible(false);
                card_7_marked.setVisible(false);
            }
        }
    }//GEN-LAST:event_card_4_imgMouseClicked

    private void card_5_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card_5_imgMouseClicked
        if(maxCards >= 5) {
            if(card_5_marked.isVisible() == true) {
                card_5_marked.setVisible(false);
            }
            else {
                card_1_marked.setVisible(false);
                card_2_marked.setVisible(false);
                card_3_marked.setVisible(false);
                card_4_marked.setVisible(false);
                card_5_marked.setVisible(true);
                card_6_marked.setVisible(false);
                card_7_marked.setVisible(false);
            }
        }
    }//GEN-LAST:event_card_5_imgMouseClicked

    private void card_6_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card_6_imgMouseClicked
        if(maxCards >= 6) {
            if(card_6_marked.isVisible() == true) {
                card_6_marked.setVisible(false);
            }
            else {
                card_1_marked.setVisible(false);
                card_2_marked.setVisible(false);
                card_3_marked.setVisible(false);
                card_4_marked.setVisible(false);
                card_5_marked.setVisible(false);
                card_6_marked.setVisible(true);
                card_7_marked.setVisible(false);
            }
        }
    }//GEN-LAST:event_card_6_imgMouseClicked

    private void card_7_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card_7_imgMouseClicked
        if(maxCards == 7) {
            if(card_7_marked.isVisible() == true) {
                card_7_marked.setVisible(false);
            }
            else {
                card_1_marked.setVisible(false);
                card_2_marked.setVisible(false);
                card_3_marked.setVisible(false);
                card_4_marked.setVisible(false);
                card_5_marked.setVisible(false);
                card_6_marked.setVisible(false);
                card_7_marked.setVisible(true);
            }
        }
    }//GEN-LAST:event_card_7_imgMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String str = "";
        
        if(card_1_marked.isVisible() == true) {
            str = parseString(card_1_img.getAccessibleContext().getAccessibleName());
            board.removePlayerPermCards(card_1_img.getAccessibleContext().getAccessibleName());
        }
        else if(card_2_marked.isVisible() == true) {
            str = parseString(card_2_img.getAccessibleContext().getAccessibleName());
            board.removePlayerPermCards(card_2_img.getAccessibleContext().getAccessibleName());
        }
        else if(card_3_marked.isVisible() == true) {
            str = parseString(card_3_img.getAccessibleContext().getAccessibleName());
            board.removePlayerPermCards(card_3_img.getAccessibleContext().getAccessibleName());
        }
        else if(card_4_marked.isVisible() == true) {
            str = parseString(card_4_img.getAccessibleContext().getAccessibleName());
            board.removePlayerPermCards(card_4_img.getAccessibleContext().getAccessibleName());
        }
        else if(card_5_marked.isVisible() == true) {
            str = parseString(card_5_img.getAccessibleContext().getAccessibleName());
            board.removePlayerPermCards(card_5_img.getAccessibleContext().getAccessibleName());
        }
        else if(card_6_marked.isVisible() == true) {
            str = parseString(card_6_img.getAccessibleContext().getAccessibleName());
            board.removePlayerPermCards(card_6_img.getAccessibleContext().getAccessibleName());
        }
        else if(card_7_marked.isVisible() == true) {
            str = parseString(card_7_img.getAccessibleContext().getAccessibleName());
            board.removePlayerPermCards(card_7_img.getAccessibleContext().getAccessibleName());
        }

        board.playCard(str);
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if(card_1_marked.isVisible() == true) {
            board.removePlayerPermCards(card_1_img.getAccessibleContext().getAccessibleName());
        }
        else if(card_2_marked.isVisible() == true) {
            board.removePlayerPermCards(card_2_img.getAccessibleContext().getAccessibleName());
        }
        else if(card_3_marked.isVisible() == true) {
            board.removePlayerPermCards(card_3_img.getAccessibleContext().getAccessibleName());
        }
        else if(card_4_marked.isVisible() == true) {
            board.removePlayerPermCards(card_4_img.getAccessibleContext().getAccessibleName());
        }
        else if(card_5_marked.isVisible() == true) {
            board.removePlayerPermCards(card_5_img.getAccessibleContext().getAccessibleName());
        }
        else if(card_6_marked.isVisible() == true) {
            board.removePlayerPermCards(card_6_img.getAccessibleContext().getAccessibleName());
        }
        else if(card_7_marked.isVisible() == true) {
            board.removePlayerPermCards(card_7_img.getAccessibleContext().getAccessibleName());
        }
        else {
            board.removePlayerPermCards(card_1_img.getAccessibleContext().getAccessibleName());
        }
        
        this.setVisible(false);
        //board.initPlayPermCards();
        board.configureTurnFormation(board.getCurrentPlayerTurn()+1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private String parseString(String str) {
        String str2 = "";

        if(str.toLowerCase().contains("attack") && str.toLowerCase().startsWith("cardperm")) {
            str2 = "attack";
        }
        else if(str.toLowerCase().contains("trade") && str.toLowerCase().startsWith("cardperm")) {
            str2 = "trade";
        }
        else if(str.toLowerCase().contains("gather") && str.toLowerCase().startsWith("cardperm")) {
            str2 = "gather";
        }
        else if(str.toLowerCase().contains("recruit") && str.toLowerCase().startsWith("cardperm")) {
            str2 = "recruit";
        }
        else if(str.toLowerCase().contains("age") && str.toLowerCase().startsWith("cardperm")) {
            str2 = "age";
        }
        else if(str.toLowerCase().contains("build")&& str.toLowerCase().startsWith("cardperm")) {
            str2 = "build";
        }
        else if(str.toLowerCase().contains("explore") && str.toLowerCase().startsWith("cardperm")) {
                str2 = "explore";
        }
        else if(str.contains("rsz_CardRandEgyptAttackThoth")){
            str2 = "thoth";
        }
         else if(str.toLowerCase().contains("horus")){
            str2 = "horus";
        }
         else if(str.contains("CardRandEgyptGatherRa")){
            str2 = "gatherra";
        }
         else if(str.contains("CardRandEgyptExplorePtah")){
            str2 = "ptah";
        }
         else if(str.contains("Hathor")){
            str2 = "hathor";
        }
         else if(str.contains("CardRandEgyptTradeTah")){
            str2 = "tah";
        }
         else if(str.contains("CardRandEgyptRecruitOsiris")){
            str2 = "osiris";
        }
         else if(str.toLowerCase().contains("attackares")){
            str2 = "ares";
        }
         else if(str.toLowerCase().contains("buildhera")){
            str2 = "hera";
        }
         else if(str.toLowerCase().contains("poseidon")){
            str2 = "poseidon";
        }
         else if(str.toLowerCase().contains("exploreartemis")){
            str2 = "artemis";
        }
         else if(str.toLowerCase().contains("zeus")){
            str2 = "zeus";
        }
         else if(str.toLowerCase().contains("hermes")){
            str2 = "hermes";
        }
        else if(str.toLowerCase().contains("apollo")){
            str2 = "apollo";
        }
        else if(str.toLowerCase().contains("heimdall")){
            str2 = "heimdall";
        }
        else if(str.toLowerCase().contains("njord")){
            str2 = "njord";
        }
        else if(str.toLowerCase().contains("freya")){
            str2 = "freya";
        }
        else if(str.toLowerCase().contains("baldr")){
            str2 = "baldr";
        }
        else if(str.toLowerCase().contains("odin")){
            str2 = "odin";
        }
         else if(str.toLowerCase().contains("loki")){
            str2 = "loki";
        }
         else if(str.toLowerCase().contains("recruithel")){
            str2 = "hel";
        }
        return str2;
    }
    
    public void setMaxCards(int maxCards) {
        this.maxCards = maxCards;
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
            java.util.logging.Logger.getLogger(SelectedPermanentCardsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectedPermanentCardsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectedPermanentCardsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectedPermanentCardsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectedPermanentCardsGUI().setVisible(true);
            }
        });
    }

    private BoardController board;
    private int maxCards = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel card_1_img;
    private javax.swing.JLabel card_1_marked;
    private javax.swing.JLabel card_2_img;
    private javax.swing.JLabel card_2_marked;
    private javax.swing.JLabel card_3_img;
    private javax.swing.JLabel card_3_marked;
    private javax.swing.JLabel card_4_img;
    private javax.swing.JLabel card_4_marked;
    private javax.swing.JLabel card_5_img;
    private javax.swing.JLabel card_5_marked;
    private javax.swing.JLabel card_6_img;
    private javax.swing.JLabel card_6_marked;
    private javax.swing.JLabel card_7_img;
    private javax.swing.JLabel card_7_marked;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel selectedCard_1;
    private javax.swing.JPanel selectedCard_2;
    private javax.swing.JPanel selectedCard_3;
    private javax.swing.JPanel selectedCard_4;
    private javax.swing.JPanel selectedCard_5;
    private javax.swing.JPanel selectedCard_6;
    private javax.swing.JPanel selectedCard_7;
    // End of variables declaration//GEN-END:variables
}
