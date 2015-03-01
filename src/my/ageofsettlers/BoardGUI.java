/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.ageofsettlers;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;


/**
 *
 * @author Tim
 */
public class BoardGUI extends javax.swing.JFrame {

    /**
     * Creates new form BoardGUI
     */
    public BoardGUI() {
        initComponents();
    }
    
    public BoardGUI(String boardType) {
        initComponents();
        
        if(boardType.compareTo("Norse") == 0) {
            jTabbedPane1.setSelectedIndex(0);
        }
        else if(boardType.compareTo("Greek") == 0) {
            jTabbedPane1.setSelectedIndex(1);
        }
        else if(boardType.compareTo("Egyptian") == 0) {
            jTabbedPane1.setSelectedIndex(2);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        norseBoard = new javax.swing.JPanel();
        norseBoardImg = new javax.swing.JLabel();
        greekBoard = new javax.swing.JPanel();
        greekBoardImg = new javax.swing.JLabel();
        egyptianBoard = new javax.swing.JPanel();
        egyptianBoardImg = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        terrain1 = new javax.swing.JPanel();
        terrain2 = new javax.swing.JPanel();
        terrain3 = new javax.swing.JPanel();
        terrain4 = new javax.swing.JPanel();
        terrain5 = new javax.swing.JPanel();
        terrain6 = new javax.swing.JPanel();
        terrain7 = new javax.swing.JPanel();
        terrain8 = new javax.swing.JPanel();
        terrain9 = new javax.swing.JPanel();
        terrain10 = new javax.swing.JPanel();
        terrain11 = new javax.swing.JPanel();
        terrain12 = new javax.swing.JPanel();
        terrain13 = new javax.swing.JPanel();
        terrain14 = new javax.swing.JPanel();
        terrain15 = new javax.swing.JPanel();
        terrain16 = new javax.swing.JPanel();
        terrain17 = new javax.swing.JPanel();
        terrain18 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(1100, 768));

        norseBoard.setLayout(null);

        norseBoardImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/NorseBoardResized.png"))); // NOI18N
        norseBoard.add(norseBoardImg);
        norseBoardImg.setBounds(0, 0, 800, 700);

        jTabbedPane1.addTab("Norse", norseBoard);

        greekBoard.setLayout(null);

        greekBoardImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/GreekBoardResized.png"))); // NOI18N
        greekBoard.add(greekBoardImg);
        greekBoardImg.setBounds(0, 0, 790, 700);

        jTabbedPane1.addTab("Greek", greekBoard);

        egyptianBoard.setLayout(null);

        egyptianBoardImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/EgyptBoardResized.png"))); // NOI18N
        egyptianBoard.add(egyptianBoardImg);
        egyptianBoardImg.setBounds(0, 0, 790, 710);

        jTabbedPane1.addTab("Egyptian", egyptianBoard);

        terrain1.setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout terrain1Layout = new javax.swing.GroupLayout(terrain1);
        terrain1.setLayout(terrain1Layout);
        terrain1Layout.setHorizontalGroup(
            terrain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        terrain1Layout.setVerticalGroup(
            terrain1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        terrain2.setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout terrain2Layout = new javax.swing.GroupLayout(terrain2);
        terrain2.setLayout(terrain2Layout);
        terrain2Layout.setHorizontalGroup(
            terrain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        terrain2Layout.setVerticalGroup(
            terrain2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        terrain3.setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout terrain3Layout = new javax.swing.GroupLayout(terrain3);
        terrain3.setLayout(terrain3Layout);
        terrain3Layout.setHorizontalGroup(
            terrain3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        terrain3Layout.setVerticalGroup(
            terrain3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        terrain4.setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout terrain4Layout = new javax.swing.GroupLayout(terrain4);
        terrain4.setLayout(terrain4Layout);
        terrain4Layout.setHorizontalGroup(
            terrain4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        terrain4Layout.setVerticalGroup(
            terrain4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        terrain5.setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout terrain5Layout = new javax.swing.GroupLayout(terrain5);
        terrain5.setLayout(terrain5Layout);
        terrain5Layout.setHorizontalGroup(
            terrain5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        terrain5Layout.setVerticalGroup(
            terrain5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        terrain6.setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout terrain6Layout = new javax.swing.GroupLayout(terrain6);
        terrain6.setLayout(terrain6Layout);
        terrain6Layout.setHorizontalGroup(
            terrain6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        terrain6Layout.setVerticalGroup(
            terrain6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        terrain7.setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout terrain7Layout = new javax.swing.GroupLayout(terrain7);
        terrain7.setLayout(terrain7Layout);
        terrain7Layout.setHorizontalGroup(
            terrain7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        terrain7Layout.setVerticalGroup(
            terrain7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        terrain8.setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout terrain8Layout = new javax.swing.GroupLayout(terrain8);
        terrain8.setLayout(terrain8Layout);
        terrain8Layout.setHorizontalGroup(
            terrain8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        terrain8Layout.setVerticalGroup(
            terrain8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        terrain9.setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout terrain9Layout = new javax.swing.GroupLayout(terrain9);
        terrain9.setLayout(terrain9Layout);
        terrain9Layout.setHorizontalGroup(
            terrain9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        terrain9Layout.setVerticalGroup(
            terrain9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        terrain10.setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout terrain10Layout = new javax.swing.GroupLayout(terrain10);
        terrain10.setLayout(terrain10Layout);
        terrain10Layout.setHorizontalGroup(
            terrain10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        terrain10Layout.setVerticalGroup(
            terrain10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        terrain11.setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout terrain11Layout = new javax.swing.GroupLayout(terrain11);
        terrain11.setLayout(terrain11Layout);
        terrain11Layout.setHorizontalGroup(
            terrain11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        terrain11Layout.setVerticalGroup(
            terrain11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        terrain12.setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout terrain12Layout = new javax.swing.GroupLayout(terrain12);
        terrain12.setLayout(terrain12Layout);
        terrain12Layout.setHorizontalGroup(
            terrain12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        terrain12Layout.setVerticalGroup(
            terrain12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        terrain13.setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout terrain13Layout = new javax.swing.GroupLayout(terrain13);
        terrain13.setLayout(terrain13Layout);
        terrain13Layout.setHorizontalGroup(
            terrain13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        terrain13Layout.setVerticalGroup(
            terrain13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        terrain14.setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout terrain14Layout = new javax.swing.GroupLayout(terrain14);
        terrain14.setLayout(terrain14Layout);
        terrain14Layout.setHorizontalGroup(
            terrain14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        terrain14Layout.setVerticalGroup(
            terrain14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        terrain15.setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout terrain15Layout = new javax.swing.GroupLayout(terrain15);
        terrain15.setLayout(terrain15Layout);
        terrain15Layout.setHorizontalGroup(
            terrain15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        terrain15Layout.setVerticalGroup(
            terrain15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        terrain16.setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout terrain16Layout = new javax.swing.GroupLayout(terrain16);
        terrain16.setLayout(terrain16Layout);
        terrain16Layout.setHorizontalGroup(
            terrain16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        terrain16Layout.setVerticalGroup(
            terrain16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        terrain17.setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout terrain17Layout = new javax.swing.GroupLayout(terrain17);
        terrain17.setLayout(terrain17Layout);
        terrain17Layout.setHorizontalGroup(
            terrain17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        terrain17Layout.setVerticalGroup(
            terrain17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        terrain18.setPreferredSize(new java.awt.Dimension(90, 90));

        javax.swing.GroupLayout terrain18Layout = new javax.swing.GroupLayout(terrain18);
        terrain18.setLayout(terrain18Layout);
        terrain18Layout.setHorizontalGroup(
            terrain18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        terrain18Layout.setVerticalGroup(
            terrain18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(terrain1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(terrain2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(terrain3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(terrain4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(terrain5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(terrain6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(terrain7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(terrain8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(terrain9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(terrain10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(terrain11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(terrain12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(terrain13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(terrain14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(terrain15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(terrain16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(terrain17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(terrain18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(terrain1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terrain2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terrain3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(terrain4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terrain5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terrain6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(terrain7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terrain8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terrain9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(terrain10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terrain11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terrain12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(terrain13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terrain14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terrain15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(terrain16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terrain17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terrain18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Terrain", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Options", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addComponent(jTabbedPane2)
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("Terrain");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(BoardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BoardGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel egyptianBoard;
    private javax.swing.JLabel egyptianBoardImg;
    private javax.swing.JPanel greekBoard;
    private javax.swing.JLabel greekBoardImg;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel norseBoard;
    private javax.swing.JLabel norseBoardImg;
    private javax.swing.JPanel terrain1;
    private javax.swing.JPanel terrain10;
    private javax.swing.JPanel terrain11;
    private javax.swing.JPanel terrain12;
    private javax.swing.JPanel terrain13;
    private javax.swing.JPanel terrain14;
    private javax.swing.JPanel terrain15;
    private javax.swing.JPanel terrain16;
    private javax.swing.JPanel terrain17;
    private javax.swing.JPanel terrain18;
    private javax.swing.JPanel terrain2;
    private javax.swing.JPanel terrain3;
    private javax.swing.JPanel terrain4;
    private javax.swing.JPanel terrain5;
    private javax.swing.JPanel terrain6;
    private javax.swing.JPanel terrain7;
    private javax.swing.JPanel terrain8;
    private javax.swing.JPanel terrain9;
    // End of variables declaration//GEN-END:variables
}
