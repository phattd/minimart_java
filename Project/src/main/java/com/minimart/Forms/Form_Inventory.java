/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minimart.Forms;

import com.minimart.DTO.UNIT;

/**
 *
 * @author Pero
 */
public class Form_Inventory extends javax.swing.JFrame {

    /**
     * Creates new form Form_Inventory
     */
    public Form_Inventory() {
        initComponents();
        
        //Center this form
        this.setLocationRelativeTo(null);
        
        //Set Icon
        setModelUnit();
        inven_form_close.setIcon(new javax.swing.ImageIcon("./IMAGES/payment_close.png"));
    }
    public void setBarCode(String barcode)
    {
        text_barcode.setText(barcode);
    }
    public String getBarCode()
    {
        return text_barcode.getText();
    }
    public void setProductName(String name)
    {
        text_productname.setText(name);
    }
    
    public String getProductName()
    {
        return text_productname.getText();
    }
    public void setPrice(int price)
    {
        text_price.setText(price+"");
    }
    public int getPrice()
    {
        int result= Integer.parseInt(text_price.getText());
        return  result;
    }
    public void setQuantity(int quantity)
    {
        text_quantity.setText(quantity+"");
    }
    public void setUnit(String choose)
    {
        unit.setSelectedItem(choose);
    }
    public void setCategory(String choose)
    {
        unit.setSelectedItem(choose);
    }
    public String getUnit()
    {
        return (String) unit.getSelectedItem();
    }
    public  String getCategory()
    {
        return  (String) category.getSelectedItem();
    }
    public void setModelUnit()
    {
        unit.setModel(new javax.swing.DefaultComboBoxModel<>(UNIT.getUnitArray()));
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
        jPanel2 = new javax.swing.JPanel();
        inven_form_close = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inven_title = new javax.swing.JLabel();
        login_user_panel = new javax.swing.JPanel();
        text_barcode = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        login_user_panel1 = new javax.swing.JPanel();
        text_productname = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        category = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        login_user_panel3 = new javax.swing.JPanel();
        text_price = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        unit = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        text_quantity = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(16, 8, 22));

        jPanel2.setBackground(new java.awt.Color(61, 34, 82));
        jPanel2.setPreferredSize(new java.awt.Dimension(900, 70));

        inven_form_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inven_form_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inven_form_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inven_form_closeMouseClicked(evt);
            }
        });

        inven_title.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        inven_title.setForeground(new java.awt.Color(240, 153, 253));
        inven_title.setText("ITEM INFOMATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(inven_title, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inven_form_close, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inven_form_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inven_title, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        login_user_panel.setBackground(new java.awt.Color(221, 220, 220));

        text_barcode.setBackground(new java.awt.Color(221, 220, 220));
        text_barcode.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        text_barcode.setForeground(new java.awt.Color(51, 51, 51));
        text_barcode.setBorder(null);
        text_barcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_barcodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout login_user_panelLayout = new javax.swing.GroupLayout(login_user_panel);
        login_user_panel.setLayout(login_user_panelLayout);
        login_user_panelLayout.setHorizontalGroup(
            login_user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_user_panelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(text_barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        login_user_panelLayout.setVerticalGroup(
            login_user_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_user_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel32.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(236, 112, 255));
        jLabel32.setText("Barcode:");

        jLabel33.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(236, 112, 255));
        jLabel33.setText("Product Name");

        login_user_panel1.setBackground(new java.awt.Color(221, 220, 220));

        text_productname.setBackground(new java.awt.Color(221, 220, 220));
        text_productname.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        text_productname.setForeground(new java.awt.Color(51, 51, 51));
        text_productname.setBorder(null);

        javax.swing.GroupLayout login_user_panel1Layout = new javax.swing.GroupLayout(login_user_panel1);
        login_user_panel1.setLayout(login_user_panel1Layout);
        login_user_panel1Layout.setHorizontalGroup(
            login_user_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_user_panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(text_productname, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        login_user_panel1Layout.setVerticalGroup(
            login_user_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_user_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_productname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel34.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(236, 112, 255));
        jLabel34.setText("Category:");

        category.setBackground(new java.awt.Color(221, 220, 220));
        category.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        category.setForeground(new java.awt.Color(51, 51, 51));
        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soft Drink", "Mineral Water", "Noodles", "Milk", "Snack", "Non-food", " " }));

        jLabel35.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(236, 112, 255));
        jLabel35.setText("Unit:");

        login_user_panel3.setBackground(new java.awt.Color(221, 220, 220));

        text_price.setBackground(new java.awt.Color(221, 220, 220));
        text_price.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        text_price.setForeground(new java.awt.Color(51, 51, 51));
        text_price.setBorder(null);

        javax.swing.GroupLayout login_user_panel3Layout = new javax.swing.GroupLayout(login_user_panel3);
        login_user_panel3.setLayout(login_user_panel3Layout);
        login_user_panel3Layout.setHorizontalGroup(
            login_user_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_user_panel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(text_price)
                .addContainerGap())
        );
        login_user_panel3Layout.setVerticalGroup(
            login_user_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_user_panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_price, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel36.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(236, 112, 255));
        jLabel36.setText("Price:");

        jPanel4.setBackground(new java.awt.Color(153, 0, 255));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel10.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Save");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        unit.setBackground(new java.awt.Color(221, 220, 220));
        unit.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        unit.setForeground(new java.awt.Color(51, 51, 51));
        unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soft Drink", "Mineral Water", "Noodles", "Milk", "Snack", "Non-food", " " }));
        unit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(236, 112, 255));
        jLabel37.setText("Quantity");

        text_quantity.setBackground(new java.awt.Color(221, 220, 220));
        text_quantity.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        text_quantity.setForeground(new java.awt.Color(51, 51, 51));
        text_quantity.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(login_user_panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(490, 490, 490))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(login_user_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(category, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(login_user_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(unit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(text_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(login_user_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(login_user_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(login_user_panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_quantity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inven_form_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inven_form_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_inven_form_closeMouseClicked

    private void unitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitActionPerformed

    private void text_barcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_barcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_barcodeActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> category;
    private javax.swing.JLabel inven_form_close;
    private javax.swing.JLabel inven_title;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel login_user_panel;
    private javax.swing.JPanel login_user_panel1;
    private javax.swing.JPanel login_user_panel3;
    private javax.swing.JTextField text_barcode;
    private javax.swing.JTextField text_price;
    private javax.swing.JTextField text_productname;
    private javax.swing.JTextField text_quantity;
    private javax.swing.JComboBox<String> unit;
    // End of variables declaration//GEN-END:variables
}