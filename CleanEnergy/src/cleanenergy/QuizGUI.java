package cleanenergy;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Greg
 */
public class QuizGUI extends javax.swing.JFrame {

    /**
     * Creates new form QuizGUI
     */
    public QuizGUI() {
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

        titlLBL = new javax.swing.JLabel();
        exitBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        questioTA = new javax.swing.JTextArea();
        instuctionLBL = new javax.swing.JLabel();
        nextBTN = new javax.swing.JButton();
        scoreLBL = new javax.swing.JLabel();
        startBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        factTA = new javax.swing.JTextArea();
        answer1RBTN = new javax.swing.JRadioButton();
        answer2RBTN = new javax.swing.JRadioButton();
        answer3RBTN = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(609, 374));
        setResizable(false);

        titlLBL.setBackground(new java.awt.Color(204, 204, 204));
        titlLBL.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        titlLBL.setText("Welcome to the Quiz!");

        exitBTN.setBackground(new java.awt.Color(255, 51, 0));
        exitBTN.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        exitBTN.setForeground(new java.awt.Color(255, 255, 255));
        exitBTN.setText("Back");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        questioTA.setColumns(20);
        questioTA.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        questioTA.setRows(5);
        questioTA.setText("QUESTIONS WILL BE DISPLAYED HERE");
        jScrollPane1.setViewportView(questioTA);

        instuctionLBL.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        instuctionLBL.setText("Select one of the three buttons");

        nextBTN.setBackground(new java.awt.Color(51, 255, 51));
        nextBTN.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        nextBTN.setText("Next");

        scoreLBL.setBackground(new java.awt.Color(204, 204, 204));
        scoreLBL.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        scoreLBL.setText("Score: ");

        startBTN.setBackground(new java.awt.Color(51, 255, 51));
        startBTN.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        startBTN.setText("Start");
        startBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBTNActionPerformed(evt);
            }
        });

        factTA.setColumns(20);
        factTA.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        factTA.setRows(5);
        factTA.setText("QUESTION FACT\n");
        jScrollPane2.setViewportView(factTA);

        answer1RBTN.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        answer1RBTN.setText("1");
        answer1RBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer1RBTNActionPerformed(evt);
            }
        });

        answer2RBTN.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        answer2RBTN.setText("2");
        answer2RBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer2RBTNActionPerformed(evt);
            }
        });

        answer3RBTN.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        answer3RBTN.setText("3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(exitBTN)
                        .addGap(97, 97, 97)
                        .addComponent(titlLBL))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(startBTN)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(answer1RBTN)
                        .addGap(57, 57, 57)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(answer2RBTN)
                    .addComponent(scoreLBL))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addComponent(nextBTN)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(answer3RBTN)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(instuctionLBL)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitBTN)
                    .addComponent(titlLBL))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nextBTN)
                            .addComponent(startBTN))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(instuctionLBL)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(answer2RBTN)
                            .addComponent(answer1RBTN)
                            .addComponent(answer3RBTN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(scoreLBL)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startBTNActionPerformed

    private void answer1RBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer1RBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer1RBTNActionPerformed

    private void answer2RBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer2RBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer2RBTNActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
        CleanEnergyGUI mainGUI = new CleanEnergyGUI();
        mainGUI.setVisible(true); 
        this.setVisible(false); 
        this.dispose();
    }//GEN-LAST:event_exitBTNActionPerformed

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
            java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton answer1RBTN;
    private javax.swing.JRadioButton answer2RBTN;
    private javax.swing.JRadioButton answer3RBTN;
    private javax.swing.JButton exitBTN;
    private javax.swing.JTextArea factTA;
    private javax.swing.JLabel instuctionLBL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nextBTN;
    private javax.swing.JTextArea questioTA;
    private javax.swing.JLabel scoreLBL;
    private javax.swing.JButton startBTN;
    private javax.swing.JLabel titlLBL;
    // End of variables declaration//GEN-END:variables
}
