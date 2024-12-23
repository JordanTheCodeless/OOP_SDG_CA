package cleanenergy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Greg
 */
public class QuizGUI extends javax.swing.JFrame {
    UnifieQuiz uQuiz = new UnifieQuiz();
    int currentQindex;
    int score;
    
    /**
     * Creates new form QuizGUI
     */
    public QuizGUI() {
        initComponents();
        currentQindex = 0;
        score = 0;
        loadQ();// loads the initial question, and choices with it.
    }
    
    private void loadQ(){
        if (currentQindex < uQuiz.getNumQ()){//compares the current index int with the total size of the amount of questions, and displays the next question using the index int
            questionTA.setText(uQuiz.getQ(currentQindex));
            ArrayList<String> choices = uQuiz.getCh(currentQindex);
            
            answer1RBTN.setText(choices.get(0));
            answer2RBTN.setText(choices.get(1));
            answer3RBTN.setText(choices.get(2));
            buttonGroup1.clearSelection();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        titlLBL = new javax.swing.JLabel();
        exitBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        questionTA = new javax.swing.JTextArea();
        instuctionLBL = new javax.swing.JLabel();
        nextBTN = new javax.swing.JButton();
        scoreLBL = new javax.swing.JLabel();
        startBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        errorTA = new javax.swing.JTextArea();
        answer1RBTN = new javax.swing.JRadioButton();
        answer2RBTN = new javax.swing.JRadioButton();
        answer3RBTN = new javax.swing.JRadioButton();
        scoreTF = new javax.swing.JTextField();
        reviewTF = new javax.swing.JTextField();
        reviewLBL = new javax.swing.JLabel();
        submitBTN = new javax.swing.JButton();
        displayBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 609, 374));
        setMinimumSize(new java.awt.Dimension(600, 374));
        setResizable(false);
        getContentPane().setLayout(null);

        titlLBL.setBackground(new java.awt.Color(204, 204, 204));
        titlLBL.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        titlLBL.setForeground(new java.awt.Color(255, 255, 255));
        titlLBL.setText("Welcome to the Quiz!");
        getContentPane().add(titlLBL);
        titlLBL.setBounds(166, 18, 193, 23);

        exitBTN.setBackground(new java.awt.Color(255, 51, 0));
        exitBTN.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        exitBTN.setForeground(new java.awt.Color(255, 255, 255));
        exitBTN.setText("Back");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });
        getContentPane().add(exitBTN);
        exitBTN.setBounds(31, 21, 72, 23);

        questionTA.setEditable(false);
        questionTA.setBackground(new java.awt.Color(51, 51, 51));
        questionTA.setColumns(20);
        questionTA.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        questionTA.setForeground(new java.awt.Color(255, 255, 255));
        questionTA.setLineWrap(true);
        questionTA.setRows(5);
        questionTA.setText("QUESTIONS WILL BE DISPLAYED HERE");
        questionTA.setWrapStyleWord(true);
        jScrollPane1.setViewportView(questionTA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(45, 60, 297, 72);

        instuctionLBL.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        instuctionLBL.setForeground(new java.awt.Color(255, 255, 255));
        instuctionLBL.setText("Select one of the three buttons");
        getContentPane().add(instuctionLBL);
        instuctionLBL.setBounds(90, 140, 260, 19);

        nextBTN.setBackground(new java.awt.Color(51, 255, 51));
        nextBTN.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        nextBTN.setText("Next");
        nextBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBTNActionPerformed(evt);
            }
        });
        getContentPane().add(nextBTN);
        nextBTN.setBounds(220, 200, 110, 30);

        scoreLBL.setBackground(new java.awt.Color(204, 204, 204));
        scoreLBL.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        scoreLBL.setForeground(new java.awt.Color(255, 255, 255));
        scoreLBL.setText("Score: ");
        getContentPane().add(scoreLBL);
        scoreLBL.setBounds(120, 240, 39, 16);

        startBTN.setBackground(new java.awt.Color(51, 255, 51));
        startBTN.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        startBTN.setText("Start");
        startBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBTNActionPerformed(evt);
            }
        });
        getContentPane().add(startBTN);
        startBTN.setBounds(70, 200, 110, 30);

        errorTA.setEditable(false);
        errorTA.setBackground(new java.awt.Color(51, 51, 51));
        errorTA.setColumns(20);
        errorTA.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        errorTA.setForeground(new java.awt.Color(255, 255, 255));
        errorTA.setLineWrap(true);
        errorTA.setRows(5);
        jScrollPane2.setViewportView(errorTA);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(50, 270, 297, 58);

        buttonGroup1.add(answer1RBTN);
        answer1RBTN.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        answer1RBTN.setForeground(new java.awt.Color(102, 102, 102));
        answer1RBTN.setText("1");
        answer1RBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer1RBTNActionPerformed(evt);
            }
        });
        getContentPane().add(answer1RBTN);
        answer1RBTN.setBounds(20, 170, 130, 24);

        buttonGroup1.add(answer2RBTN);
        answer2RBTN.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        answer2RBTN.setForeground(new java.awt.Color(102, 102, 102));
        answer2RBTN.setText("2");
        answer2RBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer2RBTNActionPerformed(evt);
            }
        });
        getContentPane().add(answer2RBTN);
        answer2RBTN.setBounds(150, 170, 140, 24);

        buttonGroup1.add(answer3RBTN);
        answer3RBTN.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        answer3RBTN.setForeground(new java.awt.Color(102, 102, 102));
        answer3RBTN.setText("3");
        answer3RBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer3RBTNActionPerformed(evt);
            }
        });
        getContentPane().add(answer3RBTN);
        answer3RBTN.setBounds(300, 170, 140, 24);

        scoreTF.setBackground(new java.awt.Color(51, 51, 51));
        scoreTF.setForeground(new java.awt.Color(255, 255, 255));
        scoreTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreTFActionPerformed(evt);
            }
        });
        getContentPane().add(scoreTF);
        scoreTF.setBounds(180, 240, 43, 22);

        reviewTF.setBackground(new java.awt.Color(51, 51, 51));
        reviewTF.setForeground(new java.awt.Color(255, 255, 255));
        reviewTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewTFActionPerformed(evt);
            }
        });
        getContentPane().add(reviewTF);
        reviewTF.setBounds(400, 90, 87, 22);

        reviewLBL.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        reviewLBL.setForeground(new java.awt.Color(255, 255, 255));
        reviewLBL.setText("Leave a Review 1-5?");
        getContentPane().add(reviewLBL);
        reviewLBL.setBounds(370, 60, 140, 20);

        submitBTN.setBackground(new java.awt.Color(102, 102, 102));
        submitBTN.setForeground(new java.awt.Color(255, 255, 255));
        submitBTN.setText("Submit");
        submitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBTNActionPerformed(evt);
            }
        });
        getContentPane().add(submitBTN);
        submitBTN.setBounds(352, 120, 90, 23);

        displayBTN.setBackground(new java.awt.Color(102, 102, 102));
        displayBTN.setForeground(new java.awt.Color(255, 255, 255));
        displayBTN.setText("Display");
        displayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBTNActionPerformed(evt);
            }
        });
        getContentPane().add(displayBTN);
        displayBTN.setBounds(460, 120, 90, 23);

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cleanenergy/sunrise-7674594_640.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -10, 600, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBTNActionPerformed
        // TODO add your handling code here:
       currentQindex = 0;
       score = 0;
       scoreTF.setText("0");
       startBTN.setText("Start/Restart");
       loadQ();
       errorTA.setText("");
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

    private void scoreTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scoreTFActionPerformed

    private void nextBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBTNActionPerformed
        // TODO add your handling code here:
        int selectAns = 0;
        if (currentQindex >= uQuiz.getNumQ()){ //method used to check if any questions are left to answer if none are left simply returns to prevent erors
            errorTA.setText("no more questions left quiz complete");
            startBTN.setText("Restart?");
            return;
        }
        if(answer1RBTN.isSelected()){
            selectAns = 1;
        } else if (answer2RBTN.isSelected()){
            selectAns = 2;
        } else if (answer3RBTN.isSelected()){
            selectAns = 3;
        }
        
        if(selectAns != 0){//increase scores with correct answers, and loads next set of questions, these questions depends on the index of the currentQindex so that increases aswell
            if(uQuiz.getCorrectAnsI(currentQindex) == selectAns) {
                score++;
            }
                scoreTF.setText(String.valueOf(score));
                currentQindex++;
                loadQ();
                errorTA.setText("");
        }else{
            errorTA.setText("choose an answer first");
        }
    }//GEN-LAST:event_nextBTNActionPerformed

    private void answer3RBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer3RBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer3RBTNActionPerformed

    private void reviewTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reviewTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reviewTFActionPerformed

    private void submitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBTNActionPerformed
        // TODO add your handling code here:
        File oFile;
        BufferedWriter buffW;
        FileWriter fileW;
        
        String rev = reviewTF.getText();
        
        try{// adding file, file writer and buffered writer, to add reviews into the file. also creates a new line on each review submission
            oFile = new File("reviews.txt");
            fileW = new FileWriter(oFile, true);//true appends new data to the end of the file
            buffW = new BufferedWriter(fileW);
            buffW.write(rev);
            buffW.newLine();
            buffW.close();
            errorTA.setText("review added");
        }catch(IOException e){
            errorTA.setText("error: " +e.getMessage());
        }
    }//GEN-LAST:event_submitBTNActionPerformed

    private void displayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTNActionPerformed
        // TODO add your handling code here:
        File iFile;
        BufferedReader buffR;
        FileReader  fileR;
        
        try{//reads from the file and displays it one by one in a popup windows
            iFile = new File("reviews.txt");
            fileR = new FileReader(iFile);
            buffR = new BufferedReader(fileR);
            String revList = buffR.readLine();
            
            while(revList != null){
               JOptionPane.showMessageDialog(null,"user review:"+ revList);
                revList = buffR.readLine();
                
            }
            
            buffR.close();
        }catch(IOException e){
            errorTA.setText("error: "+e.getMessage());
        }
    }//GEN-LAST:event_displayBTNActionPerformed

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
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton displayBTN;
    private javax.swing.JTextArea errorTA;
    private javax.swing.JButton exitBTN;
    private javax.swing.JLabel instuctionLBL;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nextBTN;
    private javax.swing.JTextArea questionTA;
    private javax.swing.JLabel reviewLBL;
    private javax.swing.JTextField reviewTF;
    private javax.swing.JLabel scoreLBL;
    private javax.swing.JTextField scoreTF;
    private javax.swing.JButton startBTN;
    private javax.swing.JButton submitBTN;
    private javax.swing.JLabel titlLBL;
    // End of variables declaration//GEN-END:variables
}
