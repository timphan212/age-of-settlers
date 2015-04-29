/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.ageofsettlers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SailendraBharadwaj
 */
public class horusAttackNorseGUI extends javax.swing.JFrame {

    /**
     * Creates new form horusAttackNorseGUI
     */
    public horusAttackNorseGUI() {
        this.board = BoardController.getInstance();
        this.playerCulture = board.getPlayerCulture();
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
        towerSelection = new javax.swing.JRadioButton();
        storehouseSelection = new javax.swing.JRadioButton();
        marketSelection = new javax.swing.JRadioButton();
        armorySelection = new javax.swing.JRadioButton();
        quarrySelection = new javax.swing.JRadioButton();
        monumentSelection = new javax.swing.JRadioButton();
        granarySelection = new javax.swing.JRadioButton();
        goldmintSelection = new javax.swing.JRadioButton();
        woodworkshopSelection = new javax.swing.JRadioButton();
        siegeworkshopSelection = new javax.swing.JRadioButton();
        greattempleSelection = new javax.swing.JRadioButton();
        wonderSelection = new javax.swing.JRadioButton();
        houseSelection = new javax.swing.JRadioButton();
        wallSelection = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        towerSelection.setText("Tower");

        storehouseSelection.setText("Storehouse");

        marketSelection.setText("Market");

        armorySelection.setText("Armory");

        quarrySelection.setText("Quarry");

        monumentSelection.setText("Monument");

        granarySelection.setText("Granary");

        goldmintSelection.setText("Gold Mint");

        woodworkshopSelection.setText("Wood Workshop");

        siegeworkshopSelection.setText("Siege Engine Workshop");

        greattempleSelection.setText("Great Temple");

        wonderSelection.setText("The Wonder");

        houseSelection.setText("House");
        houseSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseSelectionActionPerformed(evt);
            }
        });

        wallSelection.setText("Wall");

        jButton1.setText("Destroy");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
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
                        .addGap(131, 131, 131)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wallSelection)
                            .addComponent(houseSelection)
                            .addComponent(towerSelection)
                            .addComponent(storehouseSelection)
                            .addComponent(marketSelection)
                            .addComponent(armorySelection)
                            .addComponent(quarrySelection)
                            .addComponent(monumentSelection)
                            .addComponent(granarySelection)
                            .addComponent(goldmintSelection)
                            .addComponent(woodworkshopSelection)
                            .addComponent(siegeworkshopSelection)
                            .addComponent(greattempleSelection)
                            .addComponent(wonderSelection)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton1)
                        .addGap(125, 125, 125)
                        .addComponent(jButton2)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(houseSelection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wallSelection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(towerSelection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(storehouseSelection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(marketSelection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(armorySelection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quarrySelection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monumentSelection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(granarySelection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(goldmintSelection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(woodworkshopSelection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(siegeworkshopSelection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(greattempleSelection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wonderSelection)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void houseSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseSelectionActionPerformed

    }//GEN-LAST:event_houseSelectionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Norse n = new Norse();
        List<String> buildings = new ArrayList<String>();
        buildings.add("House.png");
        buildings.add("Armor.png");
        buildings.add("GoldMint.png");
        buildings.add("Granary.png");
        buildings.add("GreatTemple.png");
        buildings.add("Market.png");
        buildings.add("Monument.png");
        buildings.add("Quarry.png");
        buildings.add("SiegeWork.png");
        buildings.add("Storehouse.png");
        buildings.add("Tower.png");
        buildings.add("Wall.png");
        buildings.add("Wonder.png");
        buildings.add("WoodWork.png");

        if(houseSelection.isSelected() == true) {
            if(n.getHouse() > 0)
            board.removeBuildingTiles(playerCulture, buildings);
        }
        else if(armorySelection.isSelected() == true) {
            if(n.isArmory())
            board.removeBuildingTiles(playerCulture, buildings);
        }
        else if(goldmintSelection.isSelected() == true) {
            if(n.isGoldmint())
            board.removeBuildingTiles(playerCulture, buildings);
        }
        else if(granarySelection.isSelected() == true) {
            if(n.isGranary())
            board.removeBuildingTiles(playerCulture, buildings);
        }
        else if (greattempleSelection.isSelected() == true) {
            if(n.isGreattemple())
            board.removeBuildingTiles(playerCulture, buildings);
        }
        else if(marketSelection.isSelected() == true) {
            if(n.isMarket())
            board.removeBuildingTiles(playerCulture, buildings);
        }
        else if(monumentSelection.isSelected() == true) {
            if(n.isMonument())
            board.removeBuildingTiles(playerCulture, buildings);
        }
        else if(quarrySelection.isSelected() == true) {
            if(n.isQuarry())
            board.removeBuildingTiles(playerCulture, buildings);
        }
        else if(siegeworkshopSelection.isSelected() == true) {
            if(n.isSiegeworkshop())
            board.removeBuildingTiles(playerCulture, buildings);
        }
        else if(storehouseSelection.isSelected() == true) {
            if(n.isStorehouse())
            board.removeBuildingTiles(playerCulture, buildings);
        }
        else if(towerSelection.isSelected() == true) {
            if(n.isTower())
            board.removeBuildingTiles(playerCulture, buildings);
        }
        else if(wallSelection.isSelected() == true) {
            if(n.isWall())
            board.removeBuildingTiles(playerCulture, buildings);
        }
        else if(wonderSelection.isSelected() == true) {
            if(n.isWonder())
            board.removeBuildingTiles(playerCulture, buildings);
        }
        else if(woodworkshopSelection.isSelected() == true) {
            if(n.isWoodworkshop())
            board.removeBuildingTiles(playerCulture, buildings);
        }
        this.setVisible(false);
        //board.initPlayPermCards();
        board.configureTurnFormation(board.getCurrentPlayerTurn()+1);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        //board.initPlayPermCards();
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
            java.util.logging.Logger.getLogger(horusAttackNorseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(horusAttackNorseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(horusAttackNorseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(horusAttackNorseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new horusAttackNorseGUI().setVisible(true);
            }
        });
    }

    private BoardController board;
    private String playerCulture;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton armorySelection;
    private javax.swing.JRadioButton goldmintSelection;
    private javax.swing.JRadioButton granarySelection;
    private javax.swing.JRadioButton greattempleSelection;
    private javax.swing.JRadioButton houseSelection;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton marketSelection;
    private javax.swing.JRadioButton monumentSelection;
    private javax.swing.JRadioButton quarrySelection;
    private javax.swing.JRadioButton siegeworkshopSelection;
    private javax.swing.JRadioButton storehouseSelection;
    private javax.swing.JRadioButton towerSelection;
    private javax.swing.JRadioButton wallSelection;
    private javax.swing.JRadioButton wonderSelection;
    private javax.swing.JRadioButton woodworkshopSelection;
    // End of variables declaration//GEN-END:variables
}
