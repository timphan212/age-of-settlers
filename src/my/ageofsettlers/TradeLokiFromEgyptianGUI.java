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
public class TradeLokiFromEgyptianGUI extends javax.swing.JFrame {

    /**
     * Creates new form TradeLokiFromEgyptianGUI
     */
    public TradeLokiFromEgyptianGUI() {
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

        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        playerGoldSelection = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        playerWoodSelection = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        playerFavorSelection = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        playerFoodSelection = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Gold:");

        playerGoldSelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        playerGoldSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerGoldSelectionActionPerformed(evt);
            }
        });

        jLabel4.setText("Wood:");

        playerWoodSelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        playerWoodSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerWoodSelectionActionPerformed(evt);
            }
        });

        jLabel3.setText("Favor:");

        playerFavorSelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        playerFavorSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerFavorSelectionActionPerformed(evt);
            }
        });

        jLabel2.setText("Food:");

        playerFoodSelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        playerFoodSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerFoodSelectionActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Select any 5 resources of Egyptians to steal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel1)
                .addContainerGap(171, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(playerFoodSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(48, 48, 48)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(playerFavorSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton1))
                    .addGap(56, 56, 56)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(playerWoodSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton2))
                    .addGap(44, 44, 44)
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(playerGoldSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(playerFoodSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(playerFavorSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(playerWoodSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(playerGoldSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGap(36, 36, 36)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addContainerGap(26, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int playerFoodCount = Integer.parseInt((String)playerFoodSelection.getSelectedItem());
        int playerFavorCount = Integer.parseInt((String)playerFavorSelection.getSelectedItem());
        int playerWoodCount = Integer.parseInt((String)playerWoodSelection.getSelectedItem());
        int playerGoldCount = Integer.parseInt((String)playerGoldSelection.getSelectedItem());

        int sum1 = playerFoodCount + playerFavorCount + playerWoodCount + playerGoldCount;
        int sum2 = 5;

        if(sum1 == sum2) {
            Egyptian ePlayer = Egyptian.getInstance();
            ePlayer.setFood(ePlayer.getFood() - playerFoodCount);
            ePlayer.setFavor(ePlayer.getFavor() - playerFavorCount);
            ePlayer.setWood(ePlayer.getWood() - playerWoodCount);
            ePlayer.setGold(ePlayer.getGold() - playerGoldCount);
            
            Norse nPlayer = Norse.getInstance();
            nPlayer.setFood(nPlayer.getFood() + playerFoodCount);
            nPlayer.setFavor(nPlayer.getFavor() + playerFavorCount);
            nPlayer.setWood(nPlayer.getWood() + playerWoodCount);
            nPlayer.setGold(nPlayer.getGold() + playerGoldCount);

            board.updateResources("Egyptian");
            board.updateResources("Norse");
            
            this.setVisible(false);
            tradeGUI tGUI = new tradeGUI();
            tGUI.setVisible(true);
            tGUI.setupTradeGUI("Norse");
        }
        else if(sum1 < sum2) {

        }
        else {
            tradeCostErrorGUI tecGUI = new tradeCostErrorGUI();
            tecGUI.setVisible(true);
        }
        }

        public void setupTradeCostGUI(String culture) {
            String[] foodCount;
            String[] favorCount;
            String[] woodCount;
            String[] goldCount;

            Egyptian ePlayer = Egyptian.getInstance();
            foodCount = new String[ePlayer.getFood()+1];
            favorCount = new String[ePlayer.getFavor()+1];
            woodCount = new String[ePlayer.getWood()+1];
            goldCount = new String[ePlayer.getGold()+1];
            for(int i = 0; i < foodCount.length; i++) {
                foodCount[i] = String.valueOf(i);
            }
            playerFoodSelection.setModel(new javax.swing.DefaultComboBoxModel(foodCount));
            for(int i = 0; i < favorCount.length; i++) {
                favorCount[i] = String.valueOf(i);
            }
            playerFavorSelection.setModel(new javax.swing.DefaultComboBoxModel(favorCount));
            for(int i = 0; i < woodCount.length; i++) {
                woodCount[i] = String.valueOf(i);
            }
            playerWoodSelection.setModel(new javax.swing.DefaultComboBoxModel(woodCount));
            for(int i = 0; i < goldCount.length; i++) {
                goldCount[i] = String.valueOf(i);
            }
            playerGoldSelection.setModel(new javax.swing.DefaultComboBoxModel(goldCount));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void playerGoldSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerGoldSelectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playerGoldSelectionActionPerformed

    private void playerWoodSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerWoodSelectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playerWoodSelectionActionPerformed

    private void playerFavorSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerFavorSelectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playerFavorSelectionActionPerformed

    private void playerFoodSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerFoodSelectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playerFoodSelectionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        //board.initPlayPermCards();        // TODO add your handling code here:
        board.configureTurnFormation(board.getCurrentPlayerTurn()+1);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TradeLokiFromEgyptianGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TradeLokiFromEgyptianGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TradeLokiFromEgyptianGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TradeLokiFromEgyptianGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TradeLokiFromEgyptianGUI().setVisible(true);
            }
        });
    }

    private BoardController board;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox playerFavorSelection;
    private javax.swing.JComboBox playerFoodSelection;
    private javax.swing.JComboBox playerGoldSelection;
    private javax.swing.JComboBox playerWoodSelection;
    // End of variables declaration//GEN-END:variables
}
