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
 * @author SailendraBharadwaj
 */
public class tahExploreGUI extends javax.swing.JFrame {

    /**
     * Creates new form tahExploreGUI
     */
    public tahExploreGUI() {
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

        explorePanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        terrainPanel = new javax.swing.JPanel();
        terrain_1 = new javax.swing.JPanel();
        terrain_img_1 = new javax.swing.JLabel();
        terrain_2 = new javax.swing.JPanel();
        terrain_img_2 = new javax.swing.JLabel();
        terrain_3 = new javax.swing.JPanel();
        terrain_img_3 = new javax.swing.JLabel();
        terrain_4 = new javax.swing.JPanel();
        terrain_img_4 = new javax.swing.JLabel();
        terrain_5 = new javax.swing.JPanel();
        terrain_img_5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        explorePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255,255,255,1));
        jTextField1.setText("Select a terrain tile:");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        explorePanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 10, 110, -1));

        terrainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        terrain_img_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terrain_img_1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout terrain_1Layout = new javax.swing.GroupLayout(terrain_1);
        terrain_1.setLayout(terrain_1Layout);
        terrain_1Layout.setHorizontalGroup(
            terrain_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(terrain_img_1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        terrain_1Layout.setVerticalGroup(
            terrain_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(terrain_img_1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        terrainPanel.add(terrain_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        terrain_img_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terrain_img_2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout terrain_2Layout = new javax.swing.GroupLayout(terrain_2);
        terrain_2.setLayout(terrain_2Layout);
        terrain_2Layout.setHorizontalGroup(
            terrain_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(terrain_img_2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        terrain_2Layout.setVerticalGroup(
            terrain_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(terrain_img_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        terrainPanel.add(terrain_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 11, -1, -1));

        terrain_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terrain_3MouseClicked(evt);
            }
        });

        terrain_img_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terrain_img_3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout terrain_3Layout = new javax.swing.GroupLayout(terrain_3);
        terrain_3.setLayout(terrain_3Layout);
        terrain_3Layout.setHorizontalGroup(
            terrain_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(terrain_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(terrain_3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(terrain_img_3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        terrain_3Layout.setVerticalGroup(
            terrain_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
            .addGroup(terrain_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(terrain_3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(terrain_img_3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        terrainPanel.add(terrain_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 11, 90, 90));

        terrain_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terrain_4MouseClicked(evt);
            }
        });

        terrain_img_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terrain_img_4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout terrain_4Layout = new javax.swing.GroupLayout(terrain_4);
        terrain_4.setLayout(terrain_4Layout);
        terrain_4Layout.setHorizontalGroup(
            terrain_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, terrain_4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(terrain_img_4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        terrain_4Layout.setVerticalGroup(
            terrain_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, terrain_4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(terrain_img_4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        terrainPanel.add(terrain_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 11, 90, 90));

        terrain_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terrain_5MouseClicked(evt);
            }
        });

        terrain_img_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terrain_img_5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout terrain_5Layout = new javax.swing.GroupLayout(terrain_5);
        terrain_5.setLayout(terrain_5Layout);
        terrain_5Layout.setHorizontalGroup(
            terrain_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, terrain_5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(terrain_img_5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        terrain_5Layout.setVerticalGroup(
            terrain_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(terrain_5Layout.createSequentialGroup()
                .addComponent(terrain_img_5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        terrainPanel.add(terrain_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 11, 90, 90));

        explorePanel.add(terrainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 540, 120));

        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        explorePanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(explorePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(explorePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void terrain_img_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terrain_img_1MouseClicked

        if (god == true && selectedCount == 0) {
            boolean terrainSuccess = this.board.terrainHandler(evt);
            if (terrainSuccess == true) {
                this.board.artemisExploreHandler(evt, terrainPanel, god);
            }
            selectedCount++;
        } else {
            boolean terrainSuccess = this.board.terrainHandler(evt);
            if (terrainSuccess == true) {
                this.board.tahExploreHandler(evt, terrainPanel, god);
                this.setVisible(false);
                //board.initPlayPermCards();
                board.configureTurnFormation(board.getCurrentPlayerTurn()+1);

            }
        }
    }//GEN-LAST:event_terrain_img_1MouseClicked

    private void terrain_img_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terrain_img_2MouseClicked
        if (god == true && selectedCount == 0) {
            boolean terrainSuccess = this.board.terrainHandler(evt);
            if (terrainSuccess == true) {
                this.board.artemisExploreHandler(evt, terrainPanel, god);
            }
            selectedCount++;
        } else {
            boolean terrainSuccess = this.board.terrainHandler(evt);
            if (terrainSuccess == true) {
                this.board.tahExploreHandler(evt, terrainPanel, god);
                this.setVisible(false);
                //board.initPlayPermCards();
                board.configureTurnFormation(board.getCurrentPlayerTurn()+1);

            }
        }
    }//GEN-LAST:event_terrain_img_2MouseClicked

    private void terrain_img_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terrain_img_3MouseClicked
        // TODO add your handling code here:
        if (god == true && selectedCount == 0) {
            boolean terrainSuccess = this.board.terrainHandler(evt);
            if (terrainSuccess == true) {
                this.board.artemisExploreHandler(evt, terrainPanel, god);
            }
            selectedCount++;
        } else {
            boolean terrainSuccess = this.board.terrainHandler(evt);
            if (terrainSuccess == true) {
                this.board.tahExploreHandler(evt, terrainPanel, god);
                this.setVisible(false);
                //board.initPlayPermCards();
                board.configureTurnFormation(board.getCurrentPlayerTurn()+1);
            }
        }
    }//GEN-LAST:event_terrain_img_3MouseClicked

    private void terrain_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terrain_3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_terrain_3MouseClicked

    private void terrain_img_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terrain_img_4MouseClicked
        // TODO add your handling code here:
        if (god == true && selectedCount == 0) {
            boolean terrainSuccess = this.board.terrainHandler(evt);
            if (terrainSuccess == true) {
                this.board.tahExploreHandler(evt, terrainPanel, god);
            }
            selectedCount++;
        } else {
            boolean terrainSuccess = this.board.terrainHandler(evt);
            if (terrainSuccess == true) {
                this.board.tahExploreHandler(evt, terrainPanel, god);
                this.setVisible(false);
                //board.initPlayPermCards();
                board.configureTurnFormation(board.getCurrentPlayerTurn()+1);

            }
        }
    }//GEN-LAST:event_terrain_img_4MouseClicked

    private void terrain_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terrain_4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_terrain_4MouseClicked

    private void terrain_img_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terrain_img_5MouseClicked
        // TODO add your handling code here:
        if (god == true && selectedCount == 0) {
            boolean terrainSuccess = this.board.terrainHandler(evt);
            if (terrainSuccess == true) {
                this.board.tahExploreHandler(evt, terrainPanel, god);
            }
            selectedCount++;
        } else {
            boolean terrainSuccess = this.board.terrainHandler(evt);
            if (terrainSuccess == true) {
                this.board.tahExploreHandler(evt, terrainPanel, god);
                this.setVisible(false);
                //board.initPlayPermCards();
                board.configureTurnFormation(board.getCurrentPlayerTurn()+1);

            }
        }
    }//GEN-LAST:event_terrain_img_5MouseClicked

    private void terrain_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terrain_5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_terrain_5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.setVisible(false);
        //board.initPlayPermCards();
        board.configureTurnFormation(board.getCurrentPlayerTurn()+1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public void setTerrainIcon(List<TerrainTiles> terrainList) {
        Component[] terrainComponents = terrainPanel.getComponents();
        int count = 0;

        for (Component terrainComponent : terrainComponents) {
            if (terrainComponent instanceof javax.swing.JPanel) {
                javax.swing.JPanel panel = (javax.swing.JPanel) terrainComponent;
                javax.swing.JLabel label = (javax.swing.JLabel) panel.getComponent(0);
                TerrainTiles terrain = terrainList.get(count);
                label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/" + terrain.getFileName())));
                label.getAccessibleContext().setAccessibleDescription(Integer.toString(terrain.getIndex()));
                count++;
            }
        }
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
            java.util.logging.Logger.getLogger(tahExploreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tahExploreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tahExploreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tahExploreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tahExploreGUI().setVisible(true);
            }
        });
    }

    private BoardController board;
    private int selectedCount = 0;
    private boolean god = false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel explorePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel terrainPanel;
    private javax.swing.JPanel terrain_1;
    private javax.swing.JPanel terrain_2;
    private javax.swing.JPanel terrain_3;
    private javax.swing.JPanel terrain_4;
    private javax.swing.JPanel terrain_5;
    private javax.swing.JLabel terrain_img_1;
    private javax.swing.JLabel terrain_img_2;
    private javax.swing.JLabel terrain_img_3;
    private javax.swing.JLabel terrain_img_4;
    private javax.swing.JLabel terrain_img_5;
    // End of variables declaration//GEN-END:variables
}
