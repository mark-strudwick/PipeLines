/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoursework;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.text.DecimalFormat;

/**
 *
 * @author up819561, up823183
 */
public class PipeInterface extends javax.swing.JFrame {

    /**
     * Creates new form PipeInterface
     */
    public PipeInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lengthLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        diameterLabel = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        plasticGradeLabel = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        insulationLabel = new javax.swing.JLabel();
        reinforcementLabel = new javax.swing.JLabel();
        insulationCheckBox = new javax.swing.JCheckBox();
        reinforcementCheckBox2 = new javax.swing.JCheckBox();
        resistanceLabel = new javax.swing.JLabel();
        resistanceCheckBox = new javax.swing.JCheckBox();
        colourLabel = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        quantityLabel = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        lenghtErrorLabel = new javax.swing.JLabel();
        diameterErrorLabel = new javax.swing.JLabel();
        plasticGradeErrorLabel = new javax.swing.JLabel();
        quantityErrorLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        totalCostLabel = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        colourErrorLabel = new javax.swing.JLabel();
        generalErrorLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        errorLabel = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("LongPipes"));
        jPanel1.setPreferredSize(new java.awt.Dimension(715, 495));

        lengthLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lengthLabel.setText("Length (m)");

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        diameterLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        diameterLabel.setText("Diameter (inch)");
        diameterLabel.setToolTipText("");

        jButton2.setText("Calculate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        plasticGradeLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        plasticGradeLabel.setText("Plastic Grade (1-5)");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        insulationLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        insulationLabel.setText("Insulation");

        reinforcementLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        reinforcementLabel.setText("Reinforcement");

        insulationCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insulationCheckBoxActionPerformed(evt);
            }
        });

        resistanceLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        resistanceLabel.setText("Resistance");

        colourLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        colourLabel.setText("Colour");

        quantityLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        quantityLabel.setText("Quantity");

        lenghtErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lenghtErrorLabel.setForeground(new java.awt.Color(255, 0, 0));

        diameterErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        diameterErrorLabel.setForeground(new java.awt.Color(255, 0, 0));

        plasticGradeErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        plasticGradeErrorLabel.setForeground(new java.awt.Color(255, 0, 0));

        quantityErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        quantityErrorLabel.setForeground(new java.awt.Color(255, 0, 0));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(6);
        jTextArea1.setTabSize(9);
        jScrollPane1.setViewportView(jTextArea1);

        totalCostLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        totalCostLabel.setText("Total cost:");

        jTextField6.setEditable(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        colourErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        colourErrorLabel.setForeground(new java.awt.Color(255, 0, 0));

        generalErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        generalErrorLabel.setForeground(new java.awt.Color(255, 0, 0));

        errorLabel.setColumns(20);
        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setRows(5);
        jScrollPane2.setViewportView(errorLabel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resistanceLabel)
                            .addComponent(reinforcementLabel))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resistanceCheckBox)
                            .addComponent(reinforcementCheckBox2)
                            .addComponent(insulationCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(totalCostLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plasticGradeLabel)
                            .addComponent(colourLabel)
                            .addComponent(insulationLabel)
                            .addComponent(lengthLabel)
                            .addComponent(diameterLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(generalErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(colourErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(plasticGradeErrorLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                                                    .addComponent(lenghtErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(diameterErrorLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(quantityLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quantityErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 105, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lenghtErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lengthLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(diameterLabel)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(diameterErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plasticGradeErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(plasticGradeLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(colourLabel)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(colourErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(insulationCheckBox)
                        .addComponent(insulationLabel))
                    .addComponent(generalErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(reinforcementLabel)
                            .addComponent(reinforcementCheckBox2))
                        .addGap(11, 11, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(resistanceLabel)
                            .addComponent(resistanceCheckBox))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(quantityLabel)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(quantityErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalCostLabel)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 952, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Create a empry arraylist called orderBasket to hold all the total cost
    private final List<Double> orderBasket = new ArrayList<>();

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //set the error labels to empty every cal button click
        lenghtErrorLabel.setText("");
        diameterErrorLabel.setText("");
        plasticGradeErrorLabel.setText("");
        quantityErrorLabel.setText("");
        colourErrorLabel.setText("");
        generalErrorLabel.setText("");
        errorLabel.setText("");
        //Initalising the variables to hold the inputs
        double length, diameter, total = 0;
        int plasticGrade, colour, quantity;
        boolean insulation = insulationCheckBox.isSelected();
        boolean reinforcement = reinforcementCheckBox2.isSelected();
        boolean resistance = resistanceCheckBox.isSelected();   // TODO add your handling code here:
        boolean isValid;

        //Check if any of the input text field is empty
        if (jTextField1.getText() == null) {
            lenghtErrorLabel.setText("Length field can't be empty");
            isValid = false;
        } else if (jTextField2.getText() == null) {
            diameterErrorLabel.setText("Diameter field can't be empty");
            isValid = false;
        } else if (jTextField3.getText() == null) {
            plasticGradeErrorLabel.setText("Plastic grade field can't be empty");
            isValid = false;
        } else if (jTextField4.getText() == null) {
            colourErrorLabel.setText("Colour field can't be empty");
            isValid = false;
        } else if (jTextField5.getText() == null) {
            quantityErrorLabel.setText("Quntity field can't be");
            isValid = false;
        } else {
            isValid = true;
        }

        //Validating the input(length) data type 
        try {
            length = Double.parseDouble(jTextField1.getText());

        } catch (Exception exRef) {
            lenghtErrorLabel.setText("Please enter a number for Length");
            System.err.println(exRef);
            isValid = false;
            return;
        }

        //Checking if the input is inbetween the set limit
        if (length < 1 || length >= 6) {
            isValid = false;
            lenghtErrorLabel.setText("Length has to be minimum 1 and maximum 6");
            System.err.println("Length smaller than 0");
        }

        //Validating the input(diameter) data type 
        try {
            diameter = Double.parseDouble(jTextField2.getText());
        } catch (Exception exRef) {
            diameterErrorLabel.setText("Please enter a number for diameter");
            System.err.println(exRef);
            isValid = false;
            return;
        }
        //Checking if the input is inbetween the set limit
        if (diameter < 1 || diameter > 50) {
            isValid = false;
            diameterErrorLabel.setText("Diameter must be inbetween 1 and 50");
            System.err.println("diameter smaller than 0");

        }

        //Validating the input(plasticGrade) data type 
        try {
            plasticGrade = Integer.parseInt(jTextField3.getText());
        } catch (Exception exRef) {
            plasticGradeErrorLabel.setText("Please enter a integer  for Plastic Grade");
            System.err.println(exRef);
            isValid = false;
            return;
        }
        //Checking if the input is inbetween the set limit
        if (plasticGrade <= 0 || plasticGrade > 5) {
            isValid = false;
            plasticGradeErrorLabel.setText("Plastic Grade has to be between 1 and 5");
        }

        //Validating the input(colour) data type 
        try {
            colour = Integer.parseInt(jTextField4.getText());
        } catch (Exception exRef) {
            colourErrorLabel.setText("Colour should be integer");
            System.err.println(exRef);
            isValid = false;
            return;
        }
        //Checking if the input is inbetween the set limit
        if (colour < 0 || colour > 2) {
            isValid = false;
            colourErrorLabel.setText("colour can be 0,1 or 2 depending on the pipe type");
            System.err.println("colour can be 0,1 or 2 depending on the pipe type");
        }
        if (plasticGrade == 1 && colour != 0) {
            colourErrorLabel.setText("Plastic grade must be greater than 1 to have multiple colours");
        }
        //Validating the input(quantity) data type 
        try {
            quantity = Integer.parseInt(jTextField5.getText());
        } catch (Exception exRef) {
            quantityErrorLabel.setText("Quantity should be number");
            System.err.println(exRef);
            isValid = false;
            return;
        }
        //Checking if the input is inbetween the set limit
        if (quantity <= 0 || quantity > 100) {
            isValid = false;
            quantityErrorLabel.setText("Minimum quantity should be 1 and maximum is 100");
            System.err.println("Minimum quantity should be 1");
        }
        String message = getErrorMessages(plasticGrade, colour, insulation, reinforcement, length, diameter, quantity);
        //Perform calculate pipe type method if all the inputs are valid and add to orderBasket plus print out the info
        if (isValid) {
            if (plasticGrade >= 1 && plasticGrade <= 3 && colour == 0 && insulation == false && reinforcement == false) {
                pipeOne pipe1 = new pipeOne(length, diameter, plasticGrade, colour, insulation, reinforcement, resistance, quantity);
                jTextArea1.append(pipe1.printInfo());
                orderBasket.add(pipe1.calcTotalCost());
            } else if (plasticGrade >= 2 && plasticGrade <= 4 && colour == 1 && insulation == false && reinforcement == false) {
                pipeTwo pipe2 = new pipeTwo(length, diameter, plasticGrade, colour, insulation, reinforcement, resistance, quantity);
                jTextArea1.append(pipe2.printInfo());
                orderBasket.add(pipe2.calcTotalCost());
            } else if (plasticGrade >= 2 && plasticGrade <= 5 && colour == 2 && insulation == false && reinforcement == false) {
                pipeThree pipe3 = new pipeThree(length, diameter, plasticGrade, colour, insulation, reinforcement, resistance, quantity);
                jTextArea1.append(pipe3.printInfo());
                orderBasket.add(pipe3.calcTotalCost());
            } else if (plasticGrade >= 2 && plasticGrade <= 5 && colour == 2 && insulation == true && reinforcement == false) {
                pipeFour pipe4 = new pipeFour(length, diameter, plasticGrade, colour, insulation, reinforcement, resistance, quantity);
                jTextArea1.append(pipe4.printInfo());
                orderBasket.add(pipe4.calcTotalCost());
            } else if (plasticGrade >= 2 && plasticGrade <= 5 && colour == 2 && insulation == true && reinforcement == true) {
                pipeFive pipe5 = new pipeFive(length, diameter, plasticGrade, colour, insulation, reinforcement, resistance, quantity);
                jTextArea1.append(pipe5.printInfo());
                orderBasket.add(pipe5.calcTotalCost());
            } else {
                errorLabel.setText(message);
                generalErrorLabel.setText("We don't produce pipe with this configuartion ");
            }
        } else {
            generalErrorLabel.setText("We don't produce pipe with this configuartion ");
        }
        //loop through the list to find to total cost of all the orders
        Iterator<Double> iterator = orderBasket.iterator();
        while (iterator.hasNext()) {
            total += iterator.next();
        }

        DecimalFormat df = new DecimalFormat("£#,##0.00");
        jTextField6.setText(df.format(total));


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void insulationCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insulationCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insulationCheckBoxActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed
    
    //Method to get the correct error message depends on the invalid input 
    public String getErrorMessages(int plasticGrade, int colour, boolean insulation, boolean reinforcement, double length, double diameter, int quantity) {
        String message = "";
        if (plasticGrade == 5 && colour != 2) {
            message += "Colour must be 2 if the plastic grade is 5\n";
        }
        if (plasticGrade >= 4 && colour == 0) {
            message += "Must have 2 colours if the plastic grade is higher than 3\n";
        }
        if (colour != 2 && (insulation == true || reinforcement == true)) {
            message += "Must have 2 colours to have inner insulation or outer reinforcement extras\n";
        }
        if (plasticGrade < 3 && reinforcement == true) {
            message += "Plastic grade must be greater than 2 to have outer reinforcement\n";
        }
        if (insulation == false && reinforcement == true) {
            message += "Must have inner insluation to have outer reinforcement\n";
        }
        return message;
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
            java.util.logging.Logger.getLogger(PipeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PipeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PipeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PipeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PipeInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel colourErrorLabel;
    private javax.swing.JLabel colourLabel;
    private javax.swing.JLabel diameterErrorLabel;
    private javax.swing.JLabel diameterLabel;
    private javax.swing.JTextArea errorLabel;
    private javax.swing.JLabel generalErrorLabel;
    private javax.swing.JCheckBox insulationCheckBox;
    private javax.swing.JLabel insulationLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lenghtErrorLabel;
    private javax.swing.JLabel lengthLabel;
    private javax.swing.JLabel plasticGradeErrorLabel;
    private javax.swing.JLabel plasticGradeLabel;
    private javax.swing.JLabel quantityErrorLabel;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JCheckBox reinforcementCheckBox2;
    private javax.swing.JLabel reinforcementLabel;
    private javax.swing.JCheckBox resistanceCheckBox;
    private javax.swing.JLabel resistanceLabel;
    private javax.swing.JLabel totalCostLabel;
    // End of variables declaration//GEN-END:variables
}
