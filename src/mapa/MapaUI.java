/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapa;

import javax.swing.JFrame;

/**
 *
 * @author Buta
 */
public class MapaUI extends javax.swing.JFrame {

    int scoreA = 0, scoreB = 0, currentScoreA = 0, currentScoreB = 0;
    
    /**
     * Creates new form MapaUI
     */
    public MapaUI() {
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblScoreB = new javax.swing.JLabel();
        lblScoreA = new javax.swing.JLabel();
        onePointA = new javax.swing.JButton();
        minutsOnePointA = new javax.swing.JButton();
        threePointA = new javax.swing.JButton();
        onePointB = new javax.swing.JButton();
        minusOnePointB = new javax.swing.JButton();
        threePointB = new javax.swing.JButton();
        lblCurrentScoreB = new javax.swing.JLabel();
        lblCurrentScoreA = new javax.swing.JLabel();
        restart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Equipe A");

        jLabel2.setText("Equipe B");

        jLabel3.setText("Placar");

        lblScoreB.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblScoreB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScoreB.setText("0");

        lblScoreA.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblScoreA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblScoreA.setText("0");

        onePointA.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        onePointA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/onepoint.png"))); // NOI18N
        onePointA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onePointAActionPerformed(evt);
            }
        });

        minutsOnePointA.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        minutsOnePointA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minusone.png"))); // NOI18N
        minutsOnePointA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minutsOnePointAActionPerformed(evt);
            }
        });

        threePointA.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        threePointA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3point.png"))); // NOI18N
        threePointA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threePointAActionPerformed(evt);
            }
        });

        onePointB.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        onePointB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/onepoint.png"))); // NOI18N
        onePointB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onePointBActionPerformed(evt);
            }
        });

        minusOnePointB.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        minusOnePointB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minusone.png"))); // NOI18N
        minusOnePointB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusOnePointBActionPerformed(evt);
            }
        });

        threePointB.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        threePointB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3point.png"))); // NOI18N
        threePointB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threePointBActionPerformed(evt);
            }
        });

        lblCurrentScoreB.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblCurrentScoreB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCurrentScoreB.setText("0");

        lblCurrentScoreA.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lblCurrentScoreA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCurrentScoreA.setText("0");

        restart.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        restart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/restart.png"))); // NOI18N
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(onePointA, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(threePointA, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(minutsOnePointA, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(restart)
                .addGap(209, 209, 209)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(onePointB, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(threePointB, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(minusOnePointB, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblScoreA, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCurrentScoreA, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblScoreB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lblCurrentScoreB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(140, 140, 140))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblScoreA, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblScoreB, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(lblCurrentScoreA, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCurrentScoreB, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(onePointA)
                                    .addComponent(threePointA))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minutsOnePointA))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(onePointB)
                                    .addComponent(threePointB))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minusOnePointB))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(restart)))
                .addContainerGap(474, Short.MAX_VALUE))
        );

        lblScoreB.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restartActionPerformed

    private void threePointBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threePointBActionPerformed
        currentScoreB += 3;
        lblCurrentScoreB.setText(Integer.toString(currentScoreB));
    }//GEN-LAST:event_threePointBActionPerformed

    private void minusOnePointBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusOnePointBActionPerformed
        currentScoreB--;
        lblCurrentScoreB.setText(Integer.toString(currentScoreB));
    }//GEN-LAST:event_minusOnePointBActionPerformed

    private void onePointBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onePointBActionPerformed
        currentScoreB++;
        lblCurrentScoreB.setText(Integer.toString(currentScoreB));
    }//GEN-LAST:event_onePointBActionPerformed

    private void threePointAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threePointAActionPerformed
        currentScoreA += 3;
        lblCurrentScoreA.setText(Integer.toString(currentScoreA));
    }//GEN-LAST:event_threePointAActionPerformed

    private void minutsOnePointAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minutsOnePointAActionPerformed
        currentScoreA--;
        lblCurrentScoreA.setText(Integer.toString(currentScoreA));
    }//GEN-LAST:event_minutsOnePointAActionPerformed

    private void onePointAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onePointAActionPerformed
        currentScoreA++;
        lblCurrentScoreA.setText(Integer.toString(currentScoreA));
    }//GEN-LAST:event_onePointAActionPerformed

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
            java.util.logging.Logger.getLogger(MapaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MapaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MapaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MapaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MapaUI frame = new MapaUI();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCurrentScoreA;
    private javax.swing.JLabel lblCurrentScoreB;
    private javax.swing.JLabel lblScoreA;
    private javax.swing.JLabel lblScoreB;
    private javax.swing.JButton minusOnePointB;
    private javax.swing.JButton minutsOnePointA;
    private javax.swing.JButton onePointA;
    private javax.swing.JButton onePointB;
    private javax.swing.JButton restart;
    private javax.swing.JButton threePointA;
    private javax.swing.JButton threePointB;
    // End of variables declaration//GEN-END:variables
}
