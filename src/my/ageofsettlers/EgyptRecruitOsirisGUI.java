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
public class EgyptRecruitOsirisGUI extends javax.swing.JFrame {

    /**
     * Creates new form EgyptRecruitOsirisGUI
     */
    public EgyptRecruitOsirisGUI() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Hero has been added to your unit!");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jButton1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        //board.initPlayPermCards();
        board.configureTurnFormation(board.getCurrentPlayerTurn()+1);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void classical() {
        Egyptian egyptianPlayer = Egyptian.getInstance();
       // List<UnitCard> selectedUnits = new ArrayList<>();
        List<UnitCard> egyptianUnits = egyptianPlayer.getCurrentUnitList();
        List<UnitCard> egyptianAllUnits = egyptianPlayer.getTotalUnitList();
        UnitCard card = egyptianAllUnits.get(6);
        egyptianUnits.add(card);
        egyptianPlayer.setCurrentUnitList(egyptianUnits);
        OsirisPlayedGUI success = new OsirisPlayedGUI();
        success.setVisible(true);
        this.setVisible(false);
            
       // board.updateResources("Egyptian");
    }
    
    public void heroic() {
        Egyptian egyptianPlayer = Egyptian.getInstance();
       // List<UnitCard> selectedUnits = new ArrayList<>();
        List<UnitCard> egyptianUnits = egyptianPlayer.getCurrentUnitList();
        List<UnitCard> egyptianAllUnits = egyptianPlayer.getTotalUnitList();
        UnitCard card = egyptianAllUnits.get(0);
        egyptianUnits.add(card);
        egyptianPlayer.setCurrentUnitList(egyptianUnits);
        OsirisPlayedGUI success = new OsirisPlayedGUI();
        success.setVisible(true);
        this.setVisible(false);
            
       // board.updateResources("Egyptian");
    }
     public void mythic() {
        Egyptian egyptianPlayer = Egyptian.getInstance();
       // List<UnitCard> selectedUnits = new ArrayList<>();
        List<UnitCard> egyptianUnits = egyptianPlayer.getCurrentUnitList();
        List<UnitCard> egyptianAllUnits = egyptianPlayer.getTotalUnitList();
        UnitCard card = egyptianAllUnits.get(4);
        egyptianUnits.add(card);
        egyptianPlayer.setCurrentUnitList(egyptianUnits);
        OsirisPlayedGUI success = new OsirisPlayedGUI();
        success.setVisible(true);
        this.setVisible(false);
            
       // board.updateResources("Egyptian");
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
            java.util.logging.Logger.getLogger(EgyptRecruitOsirisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EgyptRecruitOsirisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EgyptRecruitOsirisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EgyptRecruitOsirisGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EgyptRecruitOsirisGUI().setVisible(true);
            }
        });
    }

    private BoardController board;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
