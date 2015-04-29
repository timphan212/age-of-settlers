/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.ageofsettlers;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tim
 */
public class attackUnitSelectionGUI extends javax.swing.JFrame {

    /**
     * Creates new form attackUnitSelectionGUI
     */
    public attackUnitSelectionGUI() {
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
        jTextField1 = new javax.swing.JTextField();
        unitsPanel = new javax.swing.JPanel();
        unit_1 = new javax.swing.JPanel();
        unit_1_marked = new javax.swing.JLabel();
        unit_1_marked.setVisible(false);
        unit_1_img = new javax.swing.JLabel();
        unit_2 = new javax.swing.JPanel();
        unit_2_marked = new javax.swing.JLabel();
        unit_2_marked.setVisible(false);
        unit_2_img = new javax.swing.JLabel();
        unit_3 = new javax.swing.JPanel();
        unit_3_marked = new javax.swing.JLabel();
        unit_3_marked.setVisible(false);
        unit_3_img = new javax.swing.JLabel();
        unit_4 = new javax.swing.JPanel();
        unit_4_marked = new javax.swing.JLabel();
        unit_4_marked.setVisible(false);
        unit_4_img = new javax.swing.JLabel();
        unit_5 = new javax.swing.JPanel();
        unit_5_marked = new javax.swing.JLabel();
        unit_5_marked.setVisible(false);
        unit_5_img = new javax.swing.JLabel();
        unit_6 = new javax.swing.JPanel();
        unit_6_marked = new javax.swing.JLabel();
        unit_6_marked.setVisible(false);
        unit_6_img = new javax.swing.JLabel();
        unit_7 = new javax.swing.JPanel();
        unit_7_marked = new javax.swing.JLabel();
        unit_7_marked.setVisible(false);
        unit_7_img = new javax.swing.JLabel();
        unit_8 = new javax.swing.JPanel();
        unit_8_marked = new javax.swing.JLabel();
        unit_8_marked.setVisible(false);
        unit_8_img = new javax.swing.JLabel();
        unit_9 = new javax.swing.JPanel();
        unit_9_marked = new javax.swing.JLabel();
        unit_9_marked.setVisible(false);
        unit_9_img = new javax.swing.JLabel();
        unit_10 = new javax.swing.JPanel();
        unit_10_marked = new javax.swing.JLabel();
        unit_10_marked.setVisible(false);
        unit_10_img = new javax.swing.JLabel();
        unit_11 = new javax.swing.JPanel();
        unit_11_marked = new javax.swing.JLabel();
        unit_11_marked.setVisible(false);
        unit_11_img = new javax.swing.JLabel();
        unit_12 = new javax.swing.JPanel();
        unit_12_marked = new javax.swing.JLabel();
        unit_12_marked.setVisible(false);
        unit_12_img = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255,255,255,1));
        jTextField1.setText("Select units to go into battle:");
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        unitsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unit_1.setOpaque(false);
        unit_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unit_1_marked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Marking.png"))); // NOI18N
        unit_1.add(unit_1_marked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 125, 125));

        unit_1_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unit_1_imgMouseClicked(evt);
            }
        });
        unit_1.add(unit_1_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 225));

        unitsPanel.add(unit_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 150, 225));

        unit_2.setOpaque(false);
        unit_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unit_2_marked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Marking.png"))); // NOI18N
        unit_2.add(unit_2_marked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 125, 125));

        unit_2_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unit_2_imgMouseClicked(evt);
            }
        });
        unit_2.add(unit_2_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 225));

        unitsPanel.add(unit_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 11, 150, 225));

        unit_3.setOpaque(false);
        unit_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unit_3_marked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Marking.png"))); // NOI18N
        unit_3.add(unit_3_marked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 125, 125));

        unit_3_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unit_3_imgMouseClicked(evt);
            }
        });
        unit_3.add(unit_3_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 225));

        unitsPanel.add(unit_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 11, 150, 225));

        unit_4.setOpaque(false);
        unit_4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unit_4_marked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Marking.png"))); // NOI18N
        unit_4.add(unit_4_marked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 125, 125));

        unit_4_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unit_4_imgMouseClicked(evt);
            }
        });
        unit_4.add(unit_4_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 225));

        unitsPanel.add(unit_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 11, 150, 225));

        unit_5.setOpaque(false);
        unit_5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unit_5_marked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Marking.png"))); // NOI18N
        unit_5.add(unit_5_marked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 125, 125));

        unit_5_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unit_5_imgMouseClicked(evt);
            }
        });
        unit_5.add(unit_5_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 225));

        unitsPanel.add(unit_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 11, 150, 225));

        unit_6.setOpaque(false);
        unit_6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unit_6_marked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Marking.png"))); // NOI18N
        unit_6.add(unit_6_marked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 125, 125));

        unit_6_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unit_6_imgMouseClicked(evt);
            }
        });
        unit_6.add(unit_6_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 225));

        unitsPanel.add(unit_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 11, 150, 225));

        unit_7.setOpaque(false);
        unit_7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unit_7_marked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Marking.png"))); // NOI18N
        unit_7.add(unit_7_marked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 125, 125));

        unit_7_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unit_7_imgMouseClicked(evt);
            }
        });
        unit_7.add(unit_7_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 225));

        unitsPanel.add(unit_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 246, 150, 225));

        unit_8.setOpaque(false);
        unit_8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unit_8_marked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Marking.png"))); // NOI18N
        unit_8.add(unit_8_marked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 125, 125));

        unit_8_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unit_8_imgMouseClicked(evt);
            }
        });
        unit_8.add(unit_8_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 225));

        unitsPanel.add(unit_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 246, 150, 225));

        unit_9.setOpaque(false);
        unit_9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unit_9_marked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Marking.png"))); // NOI18N
        unit_9.add(unit_9_marked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 125, 125));

        unit_9_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unit_9_imgMouseClicked(evt);
            }
        });
        unit_9.add(unit_9_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 225));

        unitsPanel.add(unit_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 246, 150, 225));

        unit_10.setOpaque(false);
        unit_10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unit_10_marked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Marking.png"))); // NOI18N
        unit_10.add(unit_10_marked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 125, 125));

        unit_10_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unit_10_imgMouseClicked(evt);
            }
        });
        unit_10.add(unit_10_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 225));

        unitsPanel.add(unit_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 246, 150, 225));

        unit_11.setOpaque(false);
        unit_11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unit_11_marked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Marking.png"))); // NOI18N
        unit_11.add(unit_11_marked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 125, 125));

        unit_11_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unit_11_imgMouseClicked(evt);
            }
        });
        unit_11.add(unit_11_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 225));

        unitsPanel.add(unit_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 246, 150, 225));

        unit_12.setOpaque(false);
        unit_12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unit_12_marked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Marking.png"))); // NOI18N
        unit_12.add(unit_12_marked, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 125, 125));

        unit_12_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unit_12_imgMouseClicked(evt);
            }
        });
        unit_12.add(unit_12_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 225));

        unitsPanel.add(unit_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 246, 150, 225));

        jPanel1.add(unitsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 980, 500));

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, -1, -1));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 540, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unit_1_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unit_1_imgMouseClicked
        if(unit_1_marked.isVisible() == false && drawnCardCount >= 1) {
            if(count < maxCards) {
                unit_1_marked.setVisible(true);
                count++;
            }
        }
        else if(unit_1_marked.isVisible() == true) {
            unit_1_marked.setVisible(false);
            count--;
        }
    }//GEN-LAST:event_unit_1_imgMouseClicked

    private void unit_2_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unit_2_imgMouseClicked
        if(unit_2_marked.isVisible() == false && drawnCardCount >= 2 ) {
            if(count < maxCards) {
                unit_2_marked.setVisible(true);
                count++;
            }
        }
        else if(unit_2_marked.isVisible() == true) {
            unit_2_marked.setVisible(false);
            count--;
        }
    }//GEN-LAST:event_unit_2_imgMouseClicked

    private void unit_3_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unit_3_imgMouseClicked
        if(unit_3_marked.isVisible() == false && drawnCardCount >= 3) {
            if(count < maxCards) {
                unit_3_marked.setVisible(true);
                count++;
            }
        }
        else if(unit_3_marked.isVisible() == true) {
            unit_3_marked.setVisible(false);
            count--;
        }
    }//GEN-LAST:event_unit_3_imgMouseClicked

    private void unit_4_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unit_4_imgMouseClicked
        if(unit_4_marked.isVisible() == false && drawnCardCount >= 4) {
            if(count < maxCards) {
                unit_4_marked.setVisible(true);
                count++;
             }
        }
        else if(unit_4_marked.isVisible() == true) {
            unit_4_marked.setVisible(false);
            count--;
        }
    }//GEN-LAST:event_unit_4_imgMouseClicked

    private void unit_5_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unit_5_imgMouseClicked
        if(unit_5_marked.isVisible() == false && drawnCardCount >= 5) {
            if(count < maxCards) {
                unit_5_marked.setVisible(true);
                count++;
            }
        }
        else if(unit_5_marked.isVisible() == true) {
            unit_5_marked.setVisible(false);
            count--;
        }
    }//GEN-LAST:event_unit_5_imgMouseClicked

    private void unit_6_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unit_6_imgMouseClicked
        if(unit_6_marked.isVisible() == false && drawnCardCount >= 6) {
            if(count < maxCards) {
                unit_6_marked.setVisible(true);
                count++;
            }
        }
        else if(unit_6_marked.isVisible() == true) {
            unit_6_marked.setVisible(false);
            count--;
        }
    }//GEN-LAST:event_unit_6_imgMouseClicked

    private void unit_7_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unit_7_imgMouseClicked
        if(unit_7_marked.isVisible() == false && drawnCardCount >= 7) {
            if(count < maxCards) {
                unit_7_marked.setVisible(true);
                count++;
            }
        }
        else if(unit_7_marked.isVisible() == true) {
            unit_7_marked.setVisible(false);
            count--;
        }
    }//GEN-LAST:event_unit_7_imgMouseClicked

    private void unit_8_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unit_8_imgMouseClicked
        if(unit_8_marked.isVisible() == false && drawnCardCount >= 8) {
            if(count < maxCards) {
                unit_8_marked.setVisible(true);
                count++;
            }
        }
        else if(unit_8_marked.isVisible() == true) {
            unit_8_marked.setVisible(false);
            count--;
        }
    }//GEN-LAST:event_unit_8_imgMouseClicked

    private void unit_9_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unit_9_imgMouseClicked
        if(unit_9_marked.isVisible() == false && drawnCardCount >= 9) {
            if(count < maxCards) {
                unit_9_marked.setVisible(true);
                count++;
            }
        }
        else if(unit_9_marked.isVisible() == true) {
            unit_9_marked.setVisible(false);
            count--;
        }
    }//GEN-LAST:event_unit_9_imgMouseClicked

    private void unit_10_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unit_10_imgMouseClicked
        if(unit_10_marked.isVisible() == false && drawnCardCount >= 10) {
            if(count < maxCards) {
                unit_10_marked.setVisible(true);
                count++;
            }
        }
        else if(unit_10_marked.isVisible() == true) {
            unit_10_marked.setVisible(false);
            count--;
        }
    }//GEN-LAST:event_unit_10_imgMouseClicked

    private void unit_11_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unit_11_imgMouseClicked
        if(unit_11_marked.isVisible() == false && drawnCardCount >= 11) {
            if(count < maxCards) {
                unit_11_marked.setVisible(true);
                count++;
            }
        }
        else if(unit_11_marked.isVisible() == true) {
            unit_11_marked.setVisible(false);
            count--;
        }
    }//GEN-LAST:event_unit_11_imgMouseClicked

    private void unit_12_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unit_12_imgMouseClicked
        if(unit_12_marked.isVisible() == false && drawnCardCount >= 12) {
            if(count < maxCards) {
                unit_12_marked.setVisible(true);
                count++;
            }
        }
        else if(unit_12_marked.isVisible() == true) {
            unit_12_marked.setVisible(false);
            count--;
        }
    }//GEN-LAST:event_unit_12_imgMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        List<UnitCard> selectedUnits = new ArrayList<>();
        List<Integer> cardIndexes = new ArrayList<>();
        
        if(board.getPlayerCulture().compareTo("Norse") == 0) {
            Norse norsePlayer = Norse.getInstance();
            cardIndexes = getCardIndexes();
            List<UnitCard> norseCurrentUnits = norsePlayer.getCurrentUnitList();
            
            for(int i = 0; i < cardIndexes.size(); i++) {
                UnitCard playerCard = norsePlayer.getTotalUnitList().get(cardIndexes.get(i));
                selectedUnits.add(playerCard);
                norseCurrentUnits.remove(playerCard);
            }
            norsePlayer.setCurrentUnitList(norseCurrentUnits);
        }
        else if(board.getPlayerCulture().compareTo("Greek") == 0) {
            Greek greekPlayer = Greek.getInstance();
            cardIndexes = getCardIndexes();
            List<UnitCard> greekCurrentUnits = greekPlayer.getCurrentUnitList();
            
            for(int i = 0; i < cardIndexes.size(); i++) {
                UnitCard playerCard = greekPlayer.getTotalUnitList().get(cardIndexes.get(i));
                selectedUnits.add(playerCard);
                greekCurrentUnits.remove(playerCard);
            }
            greekPlayer.setCurrentUnitList(greekCurrentUnits);
        }
        else {
            Egyptian egyptianPlayer = Egyptian.getInstance();
            cardIndexes = getCardIndexes();
            List<UnitCard> egyptianCurrentUnits = egyptianPlayer.getCurrentUnitList();
            
            for(int i = 0; i < cardIndexes.size(); i++) {
                UnitCard playerCard = egyptianPlayer.getTotalUnitList().get(cardIndexes.get(i));
                selectedUnits.add(playerCard);
                egyptianCurrentUnits.remove(playerCard);
            }
            egyptianPlayer.setCurrentUnitList(egyptianCurrentUnits);
        }
        
        this.setVisible(false);
        board.setupBattle(selectedUnits, this.opponent, this.attackingArea);
    }//GEN-LAST:event_jButton1ActionPerformed

    private List<Integer> getCardIndexes() {
        List<Integer> cardIndexes = new ArrayList<>();

        if(unit_1_marked.isVisible() == true) {
            cardIndexes.add(Integer.parseInt(unit_1_img.getAccessibleContext().getAccessibleName()));
        }
        if(unit_2_marked.isVisible() == true) {
            cardIndexes.add(Integer.parseInt(unit_2_img.getAccessibleContext().getAccessibleName()));
        }
        if(unit_3_marked.isVisible() == true) {
            cardIndexes.add(Integer.parseInt(unit_3_img.getAccessibleContext().getAccessibleName()));
        }
        if(unit_4_marked.isVisible() == true) {
            cardIndexes.add(Integer.parseInt(unit_4_img.getAccessibleContext().getAccessibleName()));
        }
        if(unit_5_marked.isVisible() == true) {
            cardIndexes.add(Integer.parseInt(unit_5_img.getAccessibleContext().getAccessibleName()));
        }
        if(unit_6_marked.isVisible() == true) {
            cardIndexes.add(Integer.parseInt(unit_6_img.getAccessibleContext().getAccessibleName()));
        }
        if(unit_7_marked.isVisible() == true) {
            cardIndexes.add(Integer.parseInt(unit_7_img.getAccessibleContext().getAccessibleName()));
        }
        if(unit_8_marked.isVisible() == true) {
            cardIndexes.add(Integer.parseInt(unit_8_img.getAccessibleContext().getAccessibleName()));
        }
        if(unit_9_marked.isVisible() == true) {
            cardIndexes.add(Integer.parseInt(unit_9_img.getAccessibleContext().getAccessibleName()));
        }
        if(unit_10_marked.isVisible() == true) {
            cardIndexes.add(Integer.parseInt(unit_10_img.getAccessibleContext().getAccessibleName()));
        }
        if(unit_11_marked.isVisible() == true) {
            cardIndexes.add(Integer.parseInt(unit_11_img.getAccessibleContext().getAccessibleName()));
        }
        if(unit_12_marked.isVisible() == true) {
            cardIndexes.add(Integer.parseInt(unit_12_img.getAccessibleContext().getAccessibleName()));
        }
        
        return cardIndexes;
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        //board.initPlayPermCards();
        board.configureTurnFormation(board.getCurrentPlayerTurn()+1);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void setMaxCards(int maxCards) {
        this.maxCards = maxCards;
    }

    public void setupAttackGUI(String culture, String opponent) {
        List<UnitCard> unitList = new ArrayList<>();
        Component[] unitComponents = unitsPanel.getComponents();
        this.opponent = opponent;
        int ndx = 0;
        
        if(culture.compareTo("Norse") == 0) {
            Norse norsePlayer = Norse.getInstance();
            unitList = norsePlayer.getCurrentUnitList();
        }
        else if(culture.compareTo("Greek") == 0) {
            Greek greekPlayer = Greek.getInstance();
            unitList = greekPlayer.getCurrentUnitList();
        }
        else {
            Egyptian egyptianPlayer = Egyptian.getInstance();
            unitList = egyptianPlayer.getCurrentUnitList();
        }

        for (Component unitComponent : unitComponents) {
            if (unitComponent instanceof javax.swing.JPanel) {
                javax.swing.JPanel panel = (javax.swing.JPanel) unitComponent;
                javax.swing.JLabel label = (javax.swing.JLabel) panel.getComponent(1);
                if(ndx < unitList.size()) {
                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/" + unitList.get(ndx).getFileName())));
                    label.getAccessibleContext().setAccessibleName(String.valueOf(unitList.get(ndx).getIndex()));
                    ndx++;
                    drawnCardCount++;
                }
            }
        }
    }

    public void setAttackingArea(String attackingArea) {
        this.attackingArea = attackingArea;
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
            java.util.logging.Logger.getLogger(attackUnitSelectionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(attackUnitSelectionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(attackUnitSelectionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(attackUnitSelectionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new attackUnitSelectionGUI().setVisible(true);
            }
        });
    }

    int count = 0;
    private int drawnCardCount = 0;
    private int maxCards = 0;
    private BoardController board;
    private String opponent;
    private String attackingArea;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel unit_1;
    private javax.swing.JPanel unit_10;
    private javax.swing.JLabel unit_10_img;
    private javax.swing.JLabel unit_10_marked;
    private javax.swing.JPanel unit_11;
    private javax.swing.JLabel unit_11_img;
    private javax.swing.JLabel unit_11_marked;
    private javax.swing.JPanel unit_12;
    private javax.swing.JLabel unit_12_img;
    private javax.swing.JLabel unit_12_marked;
    private javax.swing.JLabel unit_1_img;
    private javax.swing.JLabel unit_1_marked;
    private javax.swing.JPanel unit_2;
    private javax.swing.JLabel unit_2_img;
    private javax.swing.JLabel unit_2_marked;
    private javax.swing.JPanel unit_3;
    private javax.swing.JLabel unit_3_img;
    private javax.swing.JLabel unit_3_marked;
    private javax.swing.JPanel unit_4;
    private javax.swing.JLabel unit_4_img;
    private javax.swing.JLabel unit_4_marked;
    private javax.swing.JPanel unit_5;
    private javax.swing.JLabel unit_5_img;
    private javax.swing.JLabel unit_5_marked;
    private javax.swing.JPanel unit_6;
    private javax.swing.JLabel unit_6_img;
    private javax.swing.JLabel unit_6_marked;
    private javax.swing.JPanel unit_7;
    private javax.swing.JLabel unit_7_img;
    private javax.swing.JLabel unit_7_marked;
    private javax.swing.JPanel unit_8;
    private javax.swing.JLabel unit_8_img;
    private javax.swing.JLabel unit_8_marked;
    private javax.swing.JPanel unit_9;
    private javax.swing.JLabel unit_9_img;
    private javax.swing.JLabel unit_9_marked;
    private javax.swing.JPanel unitsPanel;
    // End of variables declaration//GEN-END:variables
}
