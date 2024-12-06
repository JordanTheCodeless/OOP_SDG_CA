/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cleanenergy;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.UIManager;

/**
 *
 * @author jordancarthy
 */
public class CarbonGUI extends javax.swing.JFrame {
    ArrayList usersList;
// declare my variables
        ArrayList<CarbonFootPrint> footPrints;
    double value;
    double electricBill;
    double gasBill;
    double oilBill;
    double flightLessFour;
    double flightMoreFour;
    double carYearlyMileage;
    String name  = "Jordan";
    /**
     * Creates new form CarbonFootCalc
     */
    public CarbonGUI() {
        usersList = new ArrayList<>();
        
        initComponents();
        footPrints = new ArrayList<>();
        errorLBL.setVisible(false);
        carbonTabPane.setSelectedComponent(introPane);
        displayPanel.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carbonButtonGroup = new javax.swing.ButtonGroup();
        hiddenTabPanel = new javax.swing.JPanel();
        billsRB = new javax.swing.JRadioButton();
        transportRB = new javax.swing.JRadioButton();
        recyclingRB = new javax.swing.JRadioButton();
        carbonTabPane = new javax.swing.JTabbedPane();
        recyclePane = new javax.swing.JPanel();
        aluminumCB = new javax.swing.JCheckBox();
        newspaperCB = new javax.swing.JCheckBox();
        aluminiumLBL = new javax.swing.JLabel();
        newspaperLBL = new javax.swing.JLabel();
        recyclingTitleLBL = new javax.swing.JLabel();
        recyclingTitleLBLTwo = new javax.swing.JLabel();
        introPane = new javax.swing.JPanel();
        introFirstTextLBL = new javax.swing.JLabel();
        introSecondTextLBL = new javax.swing.JLabel();
        introThirdTextLBL = new javax.swing.JLabel();
        billsPane = new javax.swing.JPanel();
        electricBillLBL = new javax.swing.JLabel();
        gasBIllLBL = new javax.swing.JLabel();
        oilBillLBL = new javax.swing.JLabel();
        electricTF = new javax.swing.JTextField();
        gasTF = new javax.swing.JTextField();
        oilTF = new javax.swing.JTextField();
        transportPane = new javax.swing.JPanel();
        flightsLessLBL = new javax.swing.JLabel();
        flightsMoreTF = new javax.swing.JTextField();
        flightsLessTF = new javax.swing.JTextField();
        carYearlyTF = new javax.swing.JTextField();
        carYearlyLBL = new javax.swing.JLabel();
        flightsMoreLBL = new javax.swing.JLabel();
        errorLBL = new javax.swing.JLabel();
        displayPanel = new javax.swing.JPanel();
        loadBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayTA = new javax.swing.JTextArea();
        addBTN = new javax.swing.JButton();
        saveBTN = new javax.swing.JButton();
        displayBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(186, 204, 65));
        setPreferredSize(new java.awt.Dimension(691, 360));
        setResizable(false);
        setSize(new java.awt.Dimension(691, 360));
        getContentPane().setLayout(null);

        hiddenTabPanel.setLayout(new javax.swing.OverlayLayout(hiddenTabPanel));
        getContentPane().add(hiddenTabPanel);
        hiddenTabPanel.setBounds(-30, -20, 44, 270);

        carbonButtonGroup.add(billsRB);
        billsRB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        billsRB.setText("Bills");
        billsRB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                billsRBItemStateChanged(evt);
            }
        });
        billsRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billsRBActionPerformed(evt);
            }
        });
        getContentPane().add(billsRB);
        billsRB.setBounds(70, 20, 90, 20);

        carbonButtonGroup.add(transportRB);
        transportRB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        transportRB.setText("Transport");
        transportRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transportRBActionPerformed(evt);
            }
        });
        getContentPane().add(transportRB);
        transportRB.setBounds(210, 20, 140, 20);

        carbonButtonGroup.add(recyclingRB);
        recyclingRB.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        recyclingRB.setText("Recycling");
        recyclingRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recyclingRBActionPerformed(evt);
            }
        });
        getContentPane().add(recyclingRB);
        recyclingRB.setBounds(380, 20, 150, 20);

        carbonTabPane.setBackground(new java.awt.Color(255, 255, 255, 20));
        carbonTabPane.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        recyclePane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aluminumCB.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        aluminumCB.setPreferredSize(new java.awt.Dimension(24, 24));
        aluminumCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aluminumCBActionPerformed(evt);
            }
        });
        recyclePane.add(aluminumCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 40, 20));

        newspaperCB.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        newspaperCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newspaperCBActionPerformed(evt);
            }
        });
        recyclePane.add(newspaperCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        aluminiumLBL.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        aluminiumLBL.setText("Aluminium : ");
        recyclePane.add(aluminiumLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 120, -1));

        newspaperLBL.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        newspaperLBL.setText("Newspaper :");
        recyclePane.add(newspaperLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        recyclingTitleLBL.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        recyclingTitleLBL.setText("Please Tick The Following Boxes ");
        recyclePane.add(recyclingTitleLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 340, 20));

        recyclingTitleLBLTwo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        recyclingTitleLBLTwo.setText("If you Recycle These Materials :");
        recyclePane.add(recyclingTitleLBLTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 310, -1));

        carbonTabPane.addTab("recycleTab", recyclePane);

        introFirstTextLBL.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        introFirstTextLBL.setText("This is the Carbon Footprint Calculator");

        introSecondTextLBL.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        introSecondTextLBL.setText("To begin please select one of the radio buttons above");

        introThirdTextLBL.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        introThirdTextLBL.setText("p.s don't enter any letters when entering values ....");

        javax.swing.GroupLayout introPaneLayout = new javax.swing.GroupLayout(introPane);
        introPane.setLayout(introPaneLayout);
        introPaneLayout.setHorizontalGroup(
            introPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(introPaneLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(introPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, introPaneLayout.createSequentialGroup()
                        .addGroup(introPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(introSecondTextLBL)
                            .addComponent(introThirdTextLBL))
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, introPaneLayout.createSequentialGroup()
                        .addComponent(introFirstTextLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );
        introPaneLayout.setVerticalGroup(
            introPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(introPaneLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(introFirstTextLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(introSecondTextLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(introThirdTextLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        carbonTabPane.addTab("tab4", introPane);

        electricBillLBL.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        electricBillLBL.setText("Electric bill :");

        gasBIllLBL.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        gasBIllLBL.setText("Gas Bill :");

        oilBillLBL.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        oilBillLBL.setText("Oil bill :");

        electricTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                electricTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout billsPaneLayout = new javax.swing.GroupLayout(billsPane);
        billsPane.setLayout(billsPaneLayout);
        billsPaneLayout.setHorizontalGroup(
            billsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billsPaneLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(billsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gasBIllLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(electricBillLBL)
                    .addComponent(oilBillLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(billsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gasTF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(electricTF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oilTF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        billsPaneLayout.setVerticalGroup(
            billsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billsPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(billsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(electricTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(electricBillLBL))
                .addGap(18, 18, 18)
                .addGroup(billsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gasBIllLBL)
                    .addComponent(gasTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(billsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oilBillLBL)
                    .addComponent(oilTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        carbonTabPane.addTab("tab4", billsPane);

        flightsLessLBL.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        flightsLessLBL.setText("Flights that were four hours or more :");

        carYearlyLBL.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        carYearlyLBL.setText("Your cars yearly mileage :");

        flightsMoreLBL.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        flightsMoreLBL.setText("Flights that were less than four hours :");

        javax.swing.GroupLayout transportPaneLayout = new javax.swing.GroupLayout(transportPane);
        transportPane.setLayout(transportPaneLayout);
        transportPaneLayout.setHorizontalGroup(
            transportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transportPaneLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(transportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transportPaneLayout.createSequentialGroup()
                        .addComponent(carYearlyLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carYearlyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(transportPaneLayout.createSequentialGroup()
                        .addGroup(transportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(flightsMoreLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(flightsLessLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(transportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(flightsMoreTF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(flightsLessTF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(103, 103, 103))
        );
        transportPaneLayout.setVerticalGroup(
            transportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transportPaneLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(transportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flightsLessLBL)
                    .addComponent(flightsMoreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(transportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flightsMoreLBL)
                    .addComponent(flightsLessTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(transportPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carYearlyLBL)
                    .addComponent(carYearlyTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        carbonTabPane.addTab("tab4", transportPane);

        getContentPane().add(carbonTabPane);
        carbonTabPane.setBounds(-100, 70, 670, 150);

        errorLBL.setBackground(new java.awt.Color(204, 0, 0));
        errorLBL.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        errorLBL.setForeground(new java.awt.Color(153, 0, 0));
        errorLBL.setText("PLEASE ENTER A NUMBER !!!!");
        getContentPane().add(errorLBL);
        errorLBL.setBounds(180, 50, 210, 20);

        loadBTN.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        loadBTN.setText("Load");
        loadBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBTNActionPerformed(evt);
            }
        });

        displayTA.setColumns(20);
        displayTA.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        displayTA.setRows(5);
        jScrollPane2.setViewportView(displayTA);

        addBTN.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        saveBTN.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        saveBTN.setText("Save");
        saveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBTNActionPerformed(evt);
            }
        });

        displayBTN.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        displayBTN.setText("Display");
        displayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout displayPanelLayout = new javax.swing.GroupLayout(displayPanel);
        displayPanel.setLayout(displayPanelLayout);
        displayPanelLayout.setHorizontalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(addBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saveBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(displayBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        displayPanelLayout.setVerticalGroup(
            displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayPanelLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(displayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBTN)
                    .addComponent(loadBTN)
                    .addComponent(saveBTN)
                    .addComponent(displayBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(displayPanel);
        displayPanel.setBounds(50, 220, 500, 130);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cleanenergy/sunrise-7674594_640.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -50, 610, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//    Created a show display function to ensure that the display of textarea for file reading is only shown when a radio button is selected
    public void showDisplay(){
        displayPanel.setVisible(true);
    }
   
      
//   public boolean isObjAlreadyInList() {
//    for(CarbonFootPrint obj : this.footPrints)
//        if(obj instanceof CarbonFootPrint)
//            return true;
//    return false;
//}
    
    
    private void electricTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_electricTFActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_electricTFActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        // TODO add your handling code here:
        
        double totalValue;
        try{
        if (billsRB.isSelected()) {
            electricBill = Double.parseDouble(electricTF.getText());
            gasBill = Double.parseDouble(gasTF.getText());
            oilBill = Double.parseDouble(oilTF.getText());
            
            CarbonFootPrint carbonBills = new CarbonBills("Bills", value, electricBill, gasBill, oilBill);
            
            carbonBills.computeCarbonFoot();
            footPrints.add(carbonBills);
            displayTA.append("\nMonthly Bills Added");
            errorLBL.setVisible(false);
            clearFields();
        } 
        if (recyclingRB.isSelected()) {  // addBTN logic for recycling radio button or equivalent
            // Get the checkbox states to determine if aluminum or newspaper is being recycled
            displayPanel.setVisible(true);
            boolean isAluminumRecycled = false;
            boolean isNewspaperRecycled = false;
            if (aluminumCB.isSelected()) {
                isAluminumRecycled = true;
            }
            if (newspaperCB.isSelected()) {
                isNewspaperRecycled = true;
            }

            CarbonRecycle carbonRecycle = new CarbonRecycle("Recycling", value, isAluminumRecycled, isNewspaperRecycled);
            carbonRecycle.computeCarbonFoot();

            footPrints.add(carbonRecycle);
            displayTA.append("\nRecycling added");
            errorLBL.setVisible(false);
            clearFields();       
    }//GEN-LAST:event_addBTNActionPerformed
         if(transportRB.isSelected()){
            flightLessFour = Double.parseDouble(flightsLessTF.getText());
            flightMoreFour = Double.parseDouble(flightsMoreTF.getText());
            carYearlyMileage = Double.parseDouble(carYearlyTF.getText());

            CarbonFootPrint carbonTransport = new CarbonTransport("Transport", value, flightLessFour, flightMoreFour,  carYearlyMileage);
            carbonTransport.computeCarbonFoot();
            footPrints.add(carbonTransport);
            displayTA.append("\nTransport added");
            errorLBL.setVisible(false);
            clearFields();
            
        }
        } 
        
        catch(NumberFormatException e){
            System.out.println("Error : " + e);
            errorLBL.setVisible(true);
            clearFields();
        }
    }
       
    
    private void saveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBTNActionPerformed
        // TODO add your handling code here:
        File f;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        try {
            f = new File("footprints.dat");
            fStream = new FileOutputStream(f);
            oStream = new ObjectOutputStream(fStream);
            oStream.writeObject(footPrints);
            oStream.close();
            displayTA.append("\nSuccesfully saved file");
            footPrints.clear();
            System.out.println(footPrints);
        } catch (IOException e) {
            System.out.println("I/O e :" + e);
        }
    }//GEN-LAST:event_saveBTNActionPerformed
     private void loadFile() {
        File f;
        FileInputStream fStream;
        ObjectInputStream oStream;
        try {
            f = new File("footprints.dat");
            fStream = new FileInputStream(f);
            oStream = new ObjectInputStream(fStream);
            footPrints = (ArrayList<CarbonFootPrint>) oStream.readObject();
            oStream.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File input" + e);
        }

    }
//     Clear Fields method
    private void clearFields() {
        oilTF.setText("");
        electricTF.setText("");
        gasTF.setText("");
        flightsLessTF.setText("");
        flightsMoreTF.setText("");
        carYearlyTF.setText("");
        newspaperCB.setSelected(false);
        aluminumCB.setSelected(false);
         
    }
    private void loadBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBTNActionPerformed
        // TODO add your handling code here:
        loadFile();
        displayTA.append("\nData loaded successfully.\n");
        for (CarbonFootPrint footPrint : footPrints) {
            displayTA.append(footPrint.toString() + "\n");
            
        }
    
    }//GEN-LAST:event_loadBTNActionPerformed

    private void displayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTNActionPerformed
        // TODO add your handling code here:
        for (CarbonFootPrint print : footPrints) {
            displayTA.append("\n" + print.toString());
        }
    }//GEN-LAST:event_displayBTNActionPerformed

    private void billsRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billsRBActionPerformed
        // TODO add your handling code here:
        if (billsRB.isSelected()) {
            carbonTabPane.setSelectedComponent(billsPane);
            showDisplay();
        } else {
            billsPane.setVisible(false);
        }

    }//GEN-LAST:event_billsRBActionPerformed

    private void billsRBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_billsRBItemStateChanged
        // TODO add your handling code here:
      
    }//GEN-LAST:event_billsRBItemStateChanged

    private void transportRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transportRBActionPerformed
        // TODO add your handling code here:
        if (transportRB.isSelected()) {
            carbonTabPane.setSelectedComponent(transportPane);
            showDisplay();
        } else {
            transportPane.setVisible(false);
        }
    }//GEN-LAST:event_transportRBActionPerformed

    private void newspaperCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newspaperCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newspaperCBActionPerformed

    private void recyclingRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recyclingRBActionPerformed
        // TODO add your handling code here:
        if (recyclingRB.isSelected()) {
            carbonTabPane.setSelectedComponent(recyclePane);
            showDisplay();
        } else {
            billsPane.setVisible(false);
        }
    }//GEN-LAST:event_recyclingRBActionPerformed

    private void aluminumCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aluminumCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aluminumCBActionPerformed
   

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
            java.util.logging.Logger.getLogger(CarbonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarbonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarbonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarbonGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
try {
    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
} catch (Exception e) {
    e.printStackTrace();
}
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarbonGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JLabel aluminiumLBL;
    private javax.swing.JCheckBox aluminumCB;
    private javax.swing.JPanel billsPane;
    private javax.swing.JRadioButton billsRB;
    private javax.swing.JLabel carYearlyLBL;
    private javax.swing.JTextField carYearlyTF;
    private javax.swing.ButtonGroup carbonButtonGroup;
    private javax.swing.JTabbedPane carbonTabPane;
    private javax.swing.JButton displayBTN;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JTextArea displayTA;
    private javax.swing.JLabel electricBillLBL;
    private javax.swing.JTextField electricTF;
    private javax.swing.JLabel errorLBL;
    private javax.swing.JLabel flightsLessLBL;
    private javax.swing.JTextField flightsLessTF;
    private javax.swing.JLabel flightsMoreLBL;
    private javax.swing.JTextField flightsMoreTF;
    private javax.swing.JLabel gasBIllLBL;
    private javax.swing.JTextField gasTF;
    private javax.swing.JPanel hiddenTabPanel;
    private javax.swing.JLabel introFirstTextLBL;
    private javax.swing.JPanel introPane;
    private javax.swing.JLabel introSecondTextLBL;
    private javax.swing.JLabel introThirdTextLBL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton loadBTN;
    private javax.swing.JCheckBox newspaperCB;
    private javax.swing.JLabel newspaperLBL;
    private javax.swing.JLabel oilBillLBL;
    private javax.swing.JTextField oilTF;
    private javax.swing.JPanel recyclePane;
    private javax.swing.JRadioButton recyclingRB;
    private javax.swing.JLabel recyclingTitleLBL;
    private javax.swing.JLabel recyclingTitleLBLTwo;
    private javax.swing.JButton saveBTN;
    private javax.swing.JPanel transportPane;
    private javax.swing.JRadioButton transportRB;
    // End of variables declaration//GEN-END:variables
}
