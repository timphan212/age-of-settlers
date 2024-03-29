/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.ageofsettlers;

import java.util.Random;

/**
 *
 * @author SailendraBharadwaj
 */
public class TradeHermesAI extends javax.swing.JFrame {

    /**
     * Creates new form TradeHermesGUI
     */
    public TradeHermesAI() {
        this.board = BoardController.getInstance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")                                     

    public void playAI() {  
        Random randHermes = new Random(System.nanoTime());
        int playerFoodCount =randHermes.nextInt(5);
        int playerFavorCount = randHermes.nextInt(5);
        int playerWoodCount =randHermes.nextInt(5);
        int playerGoldCount = randHermes.nextInt(5);
        
        int sum1 = playerFoodCount + playerFavorCount + playerWoodCount + playerGoldCount;
        int sum2 = 4;

        if(sum1 == sum2) {
            Greek greekPlayer = Greek.getInstance();
            greekPlayer.setFood(greekPlayer.getFood() + playerFoodCount);
            greekPlayer.setFavor(greekPlayer.getFavor() + playerFavorCount);
            greekPlayer.setWood(greekPlayer.getWood() + playerWoodCount);
            greekPlayer.setGold(greekPlayer.getGold() + playerGoldCount);
              
            board.updateResources("Greek");
            tradeGUI tGUI = new tradeGUI();
            tGUI.setupTradeGUI("Greek");
        }
        else {
                playAI();
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
            java.util.logging.Logger.getLogger(TradeHermesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TradeHermesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TradeHermesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TradeHermesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    private BoardController board;
    private String playerCulture;
    // Variables declaration - do not modify                     
}
