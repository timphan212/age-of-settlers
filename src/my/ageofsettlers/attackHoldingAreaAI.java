/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.ageofsettlers;

import java.util.Random;

/**
 *
 * @author Tim
 */
public class attackHoldingAreaAI extends javax.swing.JFrame {

    /**
     * Creates new form attackHoldingAreaGUI
     */
    public attackHoldingAreaAI() {
        this.board = BoardController.getInstance();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        this.board = BoardController.getInstance();
    }                      

    public void playAI(){   
        Random rand = new Random(System.nanoTime());
        int playerFoodCount = rand.nextInt(4);
        int playerFavorCount = rand.nextInt(4);
        int playerWoodCount = rand.nextInt(4);
        int playerGoldCount = rand.nextInt(4);

        int sum1 = playerFoodCount + playerFavorCount + playerWoodCount + playerGoldCount;
        int sum2 = 5;

        if(sum1 == sum2) {
            if(attacker.compareTo("Norse") == 0) {
                Norse norsePlayer = Norse.getInstance();
                norsePlayer.setFood(norsePlayer.getFood() + playerFoodCount);
                norsePlayer.setFavor(norsePlayer.getFavor() + playerFavorCount);
                norsePlayer.setWood(norsePlayer.getWood() + playerWoodCount);
                norsePlayer.setGold(norsePlayer.getGold() + playerGoldCount);
            }
            else if(attacker.compareTo("Greek") == 0) {
                Greek greekPlayer = Greek.getInstance();
                greekPlayer.setFood(greekPlayer.getFood() + playerFoodCount);
                greekPlayer.setFavor(greekPlayer.getFavor() + playerFavorCount);
                greekPlayer.setWood(greekPlayer.getWood() + playerWoodCount);
                greekPlayer.setGold(greekPlayer.getGold() + playerGoldCount);
            }
            else {
                Egyptian egyptianPlayer = Egyptian.getInstance();
                egyptianPlayer.setFood(egyptianPlayer.getFood() + playerFoodCount);
                egyptianPlayer.setFavor(egyptianPlayer.getFavor() + playerFavorCount);
                egyptianPlayer.setWood(egyptianPlayer.getWood() + playerWoodCount);
                egyptianPlayer.setGold(egyptianPlayer.getGold() + playerGoldCount);
            }

            if(defender.compareTo("Norse") == 0) {
                Norse norsePlayer = Norse.getInstance();
                norsePlayer.setFood(norsePlayer.getFood() - playerFoodCount);
                norsePlayer.setFavor(norsePlayer.getFavor() - playerFavorCount);
                norsePlayer.setWood(norsePlayer.getWood() - playerWoodCount);
                norsePlayer.setGold(norsePlayer.getGold() - playerGoldCount);
            }
            else if(defender.compareTo("Greek") == 0) {
                Greek greekPlayer = Greek.getInstance();
                greekPlayer.setFood(greekPlayer.getFood() - playerFoodCount);
                greekPlayer.setFavor(greekPlayer.getFavor() - playerFavorCount);
                greekPlayer.setWood(greekPlayer.getWood() - playerWoodCount);
                greekPlayer.setGold(greekPlayer.getGold() - playerGoldCount);
            }
            else {
                Egyptian egyptianPlayer = Egyptian.getInstance();
                egyptianPlayer.setFood(egyptianPlayer.getFood() - playerFoodCount);
                egyptianPlayer.setFavor(egyptianPlayer.getFavor() - playerFavorCount);
                egyptianPlayer.setWood(egyptianPlayer.getWood() - playerWoodCount);
                egyptianPlayer.setGold(egyptianPlayer.getGold() - playerGoldCount);
            }
            
            board.updateResources(attacker);
            board.updateResources(defender);
            board.configureTurnFormation(board.getCurrentPlayerTurn()+1);
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
            java.util.logging.Logger.getLogger(attackHoldingAreaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(attackHoldingAreaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(attackHoldingAreaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(attackHoldingAreaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new attackHoldingAreaGUI().setVisible(true);
            }
        });
    }
    
    private String attacker;
    private String defender;
    private BoardController board;
    // Variables declaration - do not modify                     

    // End of variables declaration                   
}