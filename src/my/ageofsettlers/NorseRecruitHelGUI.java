/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.ageofsettlers;

/**
 *
 * @author SailendraBharadwaj
 */
public class NorseRecruitHelGUI extends javax.swing.JFrame {

    /**
     * Creates new form NorseRecruitHelGUI
     */
    public NorseRecruitHelGUI() {
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        selectedCard_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card_1_marked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Marking.png"))); // NOI18N
        selectedCard_1.add(card_1_marked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 125, 125));

        card_1_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/CardBattleNorse2.png"))); // NOI18N
        card_1_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card_1_imgMouseClicked(evt);
            }
        });
        selectedCard_1.add(card_1_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 225));

        selectedCard_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card_2_marked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Marking.png"))); // NOI18N
        selectedCard_2.add(card_2_marked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 125, 125));

        card_2_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/CardBattleNorse8.png"))); // NOI18N
        card_2_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card_2_imgMouseClicked(evt);
            }
        });
        selectedCard_2.add(card_2_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 225));

        selectedCard_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        card_3_marked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Marking.png"))); // NOI18N
        selectedCard_3.add(card_3_marked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 125, 125));

        card_3_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/CardBattleNorse3.png"))); // NOI18N
        card_3_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                card_3_imgMouseClicked(evt);
            }
        });
        selectedCard_3.add(card_3_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 225));

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(selectedCard_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectedCard_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(selectedCard_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectedCard_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedCard_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedCard_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        this.setVisible(false);
        board.initPlayPermCards();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       

        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void card_3_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card_3_imgMouseClicked
        if(maxCards >= 3) {
            if(card_3_marked.isVisible() == true) {
                card_3_marked.setVisible(false);
            }
            else {
                card_1_marked.setVisible(false);
                card_2_marked.setVisible(false);
                card_3_marked.setVisible(true);
            }
        }
    }//GEN-LAST:event_card_3_imgMouseClicked

    private void card_2_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card_2_imgMouseClicked
        if(maxCards >= 2) {
            if(card_2_marked.isVisible() == true) {
                card_2_marked.setVisible(false);
            }
            else {
                card_1_marked.setVisible(false);
                card_2_marked.setVisible(true);
                card_3_marked.setVisible(false);
              
            }
        }
    }//GEN-LAST:event_card_2_imgMouseClicked

    private void card_1_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card_1_imgMouseClicked
        if(maxCards >= 1) {
            if(card_1_marked.isVisible() == true) {
                card_1_marked.setVisible(false);
            }
            else {
                card_1_marked.setVisible(true);
                card_2_marked.setVisible(false);
                card_3_marked.setVisible(false);
             
            }
        }
    }//GEN-LAST:event_card_1_imgMouseClicked

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
            java.util.logging.Logger.getLogger(NorseRecruitHelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NorseRecruitHelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NorseRecruitHelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NorseRecruitHelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NorseRecruitHelGUI().setVisible(true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel selectedCard_1;
    private javax.swing.JPanel selectedCard_2;
    private javax.swing.JPanel selectedCard_3;
    // End of variables declaration//GEN-END:variables
}
