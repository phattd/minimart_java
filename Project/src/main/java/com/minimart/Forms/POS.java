/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minimart.Forms;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.text.TableView;

/**
 *
 * @author Pero
 */
public class POS extends javax.swing.JFrame {

    /**
     * Creates new form POS
     */
    public POS() {
        initComponents();
        
        //center this form
        this.setLocationRelativeTo(null);
        
        //SetIcon
        pos_close.setIcon(new javax.swing.ImageIcon("./IMAGES/system_close.png"));
        icon_instantnoodles.setIcon(new javax.swing.ImageIcon("./IMAGES/category_noodles.png"));
        icon_milk.setIcon(new javax.swing.ImageIcon("./IMAGES/category_milk.png"));
        icon_mineralwater.setIcon(new javax.swing.ImageIcon("./IMAGES/category_mineralwater.png"));
        icon_snack.setIcon(new javax.swing.ImageIcon("./IMAGES/category_snack.png"));
        icon_soap.setIcon(new javax.swing.ImageIcon("./IMAGES/category_nonfood.png"));
        icon_softdrink.setIcon(new javax.swing.ImageIcon("./IMAGES/category_softdrink.png"));
        
        icon_pay.setIcon(new javax.swing.ImageIcon("./IMAGES/POS_pay.png"));
        icon_coupon.setIcon(new javax.swing.ImageIcon("./IMAGES/POS_coupon.png"));
        icon_deleteall.setIcon(new javax.swing.ImageIcon("./IMAGES/POS_deleteall.png"));
        icon_deleteitem.setIcon(new javax.swing.ImageIcon("./IMAGES/POS_deleteitem.png"));
        item_requantity.setIcon(new javax.swing.ImageIcon("./IMAGES/POS_requantity.png"));
        icon_more.setIcon(new javax.swing.ImageIcon("./IMAGES/POS_membership.png"));
        
        icon_refund.setIcon(new javax.swing.ImageIcon("./IMAGES/POS_refund.png"));
        icon_reprint.setIcon(new javax.swing.ImageIcon("./IMAGES/POS_reprint.png"));
        icon_print.setIcon(new javax.swing.ImageIcon("./IMAGES/POS_print.png"));
        icon_logout.setIcon(new javax.swing.ImageIcon("./IMAGES/POS_logout.png"));
        icon_setting.setIcon(new javax.swing.ImageIcon("./IMAGES/POS_setting.png"));
        icon_checkinstock.setIcon(new javax.swing.ImageIcon("./IMAGES/POS_checkinstock.png"));
        icon_sortdown.setIcon(new javax.swing.ImageIcon("./IMAGES/POS_sortdown.png"));
        
        //Set TableHeader
        POS_Table.getTableHeader().setFont(new Font ("iCiel Gotham Medium", Font.PLAIN, 20));
        POS_Table.getTableHeader().setOpaque(false);
        POS_Table.getTableHeader().setBackground(new Color(30,16,41));
        
        //hover
        addHovertoCategory();
    }
    
    public void addHovertoCategory()
    {
        //softdrink
        cg_softdrink.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                //change color of selected item
                cg_softdrink.setBackground(new java.awt.Color(72,37,88));
                cg_mineralwater.setBackground(new java.awt.Color(30,16,41));
                cg_noodles.setBackground(new java.awt.Color(30,16,41));
                cg_milk.setBackground(new java.awt.Color(30,16,41));
                cg_snack.setBackground(new java.awt.Color(30,16,41));
                cg_nonfood.setBackground(new java.awt.Color(30,16,41));

            }

            @Override
            public void mousePressed(MouseEvent e) {
                cg_softdrink.setBackground(new java.awt.Color(41,11,65));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }); 
        
        //mineral water
        cg_mineralwater.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                //change color of selected item
                cg_softdrink.setBackground(new java.awt.Color(30,16,41));
                cg_mineralwater.setBackground(new java.awt.Color(72,37,88));
                cg_noodles.setBackground(new java.awt.Color(30,16,41));
                cg_milk.setBackground(new java.awt.Color(30,16,41));
                cg_snack.setBackground(new java.awt.Color(30,16,41));
                cg_nonfood.setBackground(new java.awt.Color(30,16,41));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }); 
        
        //noodles
        cg_noodles.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                //change color of selected item
                cg_softdrink.setBackground(new java.awt.Color(30,16,41));
                cg_mineralwater.setBackground(new java.awt.Color(30,16,41));
                cg_noodles.setBackground(new java.awt.Color(72,37,88));
                cg_milk.setBackground(new java.awt.Color(30,16,41));
                cg_snack.setBackground(new java.awt.Color(30,16,41));
                cg_nonfood.setBackground(new java.awt.Color(30,16,41));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }); 
        
        //milk
        cg_milk.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                //change color of selected item
                cg_softdrink.setBackground(new java.awt.Color(30,16,41));
                cg_mineralwater.setBackground(new java.awt.Color(30,16,41));
                cg_noodles.setBackground(new java.awt.Color(30,16,41));
                cg_milk.setBackground(new java.awt.Color(72,37,88));
                cg_snack.setBackground(new java.awt.Color(30,16,41));
                cg_nonfood.setBackground(new java.awt.Color(30,16,41));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }); 
        
        //snack
        cg_snack.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                //change color of selected item
                cg_softdrink.setBackground(new java.awt.Color(30,16,41));
                cg_mineralwater.setBackground(new java.awt.Color(30,16,41));
                cg_noodles.setBackground(new java.awt.Color(30,16,41));
                cg_milk.setBackground(new java.awt.Color(30,16,41));
                cg_snack.setBackground(new java.awt.Color(72,37,88));
                cg_nonfood.setBackground(new java.awt.Color(30,16,41));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }); 
        
        //non-food
        cg_nonfood.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                //change color of selected item
                cg_softdrink.setBackground(new java.awt.Color(30,16,41));
                cg_mineralwater.setBackground(new java.awt.Color(30,16,41));
                cg_noodles.setBackground(new java.awt.Color(30,16,41));
                cg_milk.setBackground(new java.awt.Color(30,16,41));
                cg_snack.setBackground(new java.awt.Color(30,16,41));
                cg_nonfood.setBackground(new java.awt.Color(72,37,88));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }); 
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
        POS_Navigator = new javax.swing.JPanel();
        maintitle = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pos_close = new javax.swing.JLabel();
        POS_Category = new javax.swing.JPanel();
        cg_softdrink = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        icon_softdrink = new javax.swing.JLabel();
        cg_sortdown = new javax.swing.JPanel();
        icon_sortdown = new javax.swing.JLabel();
        cg_mineralwater = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        icon_mineralwater = new javax.swing.JLabel();
        cg_noodles = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        icon_instantnoodles = new javax.swing.JLabel();
        cg_milk = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        icon_milk = new javax.swing.JLabel();
        cg_snack = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        icon_snack = new javax.swing.JLabel();
        cg_nonfood = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        icon_soap = new javax.swing.JLabel();
        Barcode_scanner = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        button_barcodescanner = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        POS_Table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        icon_deleteitem = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        icon_deleteall = new javax.swing.JLabel();
        POS_Setquantity_Button = new javax.swing.JPanel();
        item_requantity = new javax.swing.JLabel();
        POS_Promotion_Button = new javax.swing.JPanel();
        icon_coupon = new javax.swing.JLabel();
        POS_Customer_Button = new javax.swing.JPanel();
        icon_more = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        POS_Pay_Button = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        icon_pay = new javax.swing.JLabel();
        POS_refund_button = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        icon_refund = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        icon_print = new javax.swing.JLabel();
        POS_Reprint_Button = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        icon_reprint = new javax.swing.JLabel();
        POS_Checkstock_Button = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        icon_checkinstock = new javax.swing.JLabel();
        POS_Setting_Button = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        icon_setting = new javax.swing.JLabel();
        POS_Logout_Button = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        icon_logout = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1600, 900));
        setResizable(false);
        setSize(new java.awt.Dimension(1600, 900));

        jPanel1.setBackground(new java.awt.Color(16, 8, 22));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        POS_Navigator.setBackground(new java.awt.Color(18, 9, 24));

        maintitle.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        maintitle.setForeground(new java.awt.Color(236, 112, 255));
        maintitle.setText("Hi Pero!");

        jLabel8.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("14/06/2021 13:00");

        pos_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pos_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pos_closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout POS_NavigatorLayout = new javax.swing.GroupLayout(POS_Navigator);
        POS_Navigator.setLayout(POS_NavigatorLayout);
        POS_NavigatorLayout.setHorizontalGroup(
            POS_NavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(POS_NavigatorLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(maintitle, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(pos_close, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        POS_NavigatorLayout.setVerticalGroup(
            POS_NavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(POS_NavigatorLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(POS_NavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pos_close, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(POS_NavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maintitle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        POS_Category.setBackground(new java.awt.Color(30, 16, 41));
        POS_Category.setPreferredSize(new java.awt.Dimension(200, 788));

        cg_softdrink.setBackground(new java.awt.Color(30, 16, 41));
        cg_softdrink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SOFT DRINK");

        icon_softdrink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout cg_softdrinkLayout = new javax.swing.GroupLayout(cg_softdrink);
        cg_softdrink.setLayout(cg_softdrinkLayout);
        cg_softdrinkLayout.setHorizontalGroup(
            cg_softdrinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cg_softdrinkLayout.createSequentialGroup()
                .addGroup(cg_softdrinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon_softdrink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        cg_softdrinkLayout.setVerticalGroup(
            cg_softdrinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cg_softdrinkLayout.createSequentialGroup()
                .addComponent(icon_softdrink, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(12, 12, 12))
        );

        cg_sortdown.setBackground(new java.awt.Color(44, 20, 62));

        icon_sortdown.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_sortdown.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout cg_sortdownLayout = new javax.swing.GroupLayout(cg_sortdown);
        cg_sortdown.setLayout(cg_sortdownLayout);
        cg_sortdownLayout.setHorizontalGroup(
            cg_sortdownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cg_sortdownLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_sortdown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        cg_sortdownLayout.setVerticalGroup(
            cg_sortdownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cg_sortdownLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_sortdown, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cg_mineralwater.setBackground(new java.awt.Color(30, 16, 41));
        cg_mineralwater.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel14.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("MINERAL WATER");

        icon_mineralwater.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout cg_mineralwaterLayout = new javax.swing.GroupLayout(cg_mineralwater);
        cg_mineralwater.setLayout(cg_mineralwaterLayout);
        cg_mineralwaterLayout.setHorizontalGroup(
            cg_mineralwaterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cg_mineralwaterLayout.createSequentialGroup()
                .addGroup(cg_mineralwaterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon_mineralwater, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cg_mineralwaterLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cg_mineralwaterLayout.setVerticalGroup(
            cg_mineralwaterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cg_mineralwaterLayout.createSequentialGroup()
                .addComponent(icon_mineralwater, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(12, 12, 12))
        );

        cg_noodles.setBackground(new java.awt.Color(30, 16, 41));
        cg_noodles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel16.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("INSTANT NOODLES");

        icon_instantnoodles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout cg_noodlesLayout = new javax.swing.GroupLayout(cg_noodles);
        cg_noodles.setLayout(cg_noodlesLayout);
        cg_noodlesLayout.setHorizontalGroup(
            cg_noodlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cg_noodlesLayout.createSequentialGroup()
                .addGroup(cg_noodlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon_instantnoodles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                .addContainerGap())
        );
        cg_noodlesLayout.setVerticalGroup(
            cg_noodlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cg_noodlesLayout.createSequentialGroup()
                .addComponent(icon_instantnoodles, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(9, 9, 9))
        );

        cg_milk.setBackground(new java.awt.Color(30, 16, 41));
        cg_milk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel18.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("MILK");

        icon_milk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout cg_milkLayout = new javax.swing.GroupLayout(cg_milk);
        cg_milk.setLayout(cg_milkLayout);
        cg_milkLayout.setHorizontalGroup(
            cg_milkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cg_milkLayout.createSequentialGroup()
                .addGroup(cg_milkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon_milk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                .addContainerGap())
        );
        cg_milkLayout.setVerticalGroup(
            cg_milkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cg_milkLayout.createSequentialGroup()
                .addComponent(icon_milk, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(12, 12, 12))
        );

        cg_snack.setBackground(new java.awt.Color(30, 16, 41));
        cg_snack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel20.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("SNACK");

        icon_snack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout cg_snackLayout = new javax.swing.GroupLayout(cg_snack);
        cg_snack.setLayout(cg_snackLayout);
        cg_snackLayout.setHorizontalGroup(
            cg_snackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cg_snackLayout.createSequentialGroup()
                .addGroup(cg_snackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon_snack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                .addContainerGap())
        );
        cg_snackLayout.setVerticalGroup(
            cg_snackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cg_snackLayout.createSequentialGroup()
                .addComponent(icon_snack, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(12, 12, 12))
        );

        cg_nonfood.setBackground(new java.awt.Color(30, 16, 41));
        cg_nonfood.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel22.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("NON-FOOD");

        icon_soap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout cg_nonfoodLayout = new javax.swing.GroupLayout(cg_nonfood);
        cg_nonfood.setLayout(cg_nonfoodLayout);
        cg_nonfoodLayout.setHorizontalGroup(
            cg_nonfoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cg_nonfoodLayout.createSequentialGroup()
                .addGroup(cg_nonfoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon_soap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                .addContainerGap())
        );
        cg_nonfoodLayout.setVerticalGroup(
            cg_nonfoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cg_nonfoodLayout.createSequentialGroup()
                .addComponent(icon_soap, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout POS_CategoryLayout = new javax.swing.GroupLayout(POS_Category);
        POS_Category.setLayout(POS_CategoryLayout);
        POS_CategoryLayout.setHorizontalGroup(
            POS_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cg_sortdown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, POS_CategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(POS_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cg_softdrink, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cg_noodles, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cg_milk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cg_snack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cg_nonfood, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(cg_mineralwater, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        POS_CategoryLayout.setVerticalGroup(
            POS_CategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(POS_CategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cg_softdrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cg_mineralwater, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cg_noodles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cg_milk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cg_snack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cg_nonfood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cg_sortdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Barcode_scanner.setBackground(new java.awt.Color(30, 16, 41));

        jTextField1.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setToolTipText("");

        button_barcodescanner.setBackground(new java.awt.Color(236, 112, 255));
        button_barcodescanner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 16, 41));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter");

        javax.swing.GroupLayout button_barcodescannerLayout = new javax.swing.GroupLayout(button_barcodescanner);
        button_barcodescanner.setLayout(button_barcodescannerLayout);
        button_barcodescannerLayout.setHorizontalGroup(
            button_barcodescannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_barcodescannerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );
        button_barcodescannerLayout.setVerticalGroup(
            button_barcodescannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button_barcodescannerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Barcode_scannerLayout = new javax.swing.GroupLayout(Barcode_scanner);
        Barcode_scanner.setLayout(Barcode_scannerLayout);
        Barcode_scannerLayout.setHorizontalGroup(
            Barcode_scannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barcode_scannerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_barcodescanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Barcode_scannerLayout.setVerticalGroup(
            Barcode_scannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barcode_scannerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Barcode_scannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button_barcodescanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(30, 16, 41));
        jPanel25.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        POS_Table.setAutoCreateRowSorter(true);
        POS_Table.setBackground(new java.awt.Color(16, 8, 22));
        POS_Table.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 14)); // NOI18N
        POS_Table.setForeground(new java.awt.Color(236, 112, 255));
        POS_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Qty.", "Price", "Total"
            }
        ));
        POS_Table.setGridColor(new java.awt.Color(16, 8, 22));
        POS_Table.setRowHeight(40);
        POS_Table.setRowMargin(0);
        POS_Table.setSelectionBackground(new java.awt.Color(236, 112, 255));
        POS_Table.setSelectionForeground(new java.awt.Color(30, 16, 41));
        POS_Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(POS_Table);
        if (POS_Table.getColumnModel().getColumnCount() > 0) {
            POS_Table.getColumnModel().getColumn(0).setResizable(false);
            POS_Table.getColumnModel().getColumn(1).setResizable(false);
            POS_Table.getColumnModel().getColumn(2).setResizable(false);
            POS_Table.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.setBackground(new java.awt.Color(42, 22, 57));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        icon_deleteitem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_deleteitem, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_deleteitem, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel28.setBackground(new java.awt.Color(42, 22, 57));
        jPanel28.setForeground(new java.awt.Color(204, 204, 204));
        jPanel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        icon_deleteall.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_deleteall, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_deleteall, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        POS_Setquantity_Button.setBackground(new java.awt.Color(42, 22, 57));
        POS_Setquantity_Button.setForeground(new java.awt.Color(204, 204, 204));
        POS_Setquantity_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        POS_Setquantity_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                POS_Setquantity_ButtonMouseClicked(evt);
            }
        });

        item_requantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout POS_Setquantity_ButtonLayout = new javax.swing.GroupLayout(POS_Setquantity_Button);
        POS_Setquantity_Button.setLayout(POS_Setquantity_ButtonLayout);
        POS_Setquantity_ButtonLayout.setHorizontalGroup(
            POS_Setquantity_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(POS_Setquantity_ButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(item_requantity, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        POS_Setquantity_ButtonLayout.setVerticalGroup(
            POS_Setquantity_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(POS_Setquantity_ButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(item_requantity, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        POS_Promotion_Button.setBackground(new java.awt.Color(42, 22, 57));
        POS_Promotion_Button.setForeground(new java.awt.Color(204, 204, 204));
        POS_Promotion_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        POS_Promotion_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                POS_Promotion_ButtonMouseClicked(evt);
            }
        });

        icon_coupon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout POS_Promotion_ButtonLayout = new javax.swing.GroupLayout(POS_Promotion_Button);
        POS_Promotion_Button.setLayout(POS_Promotion_ButtonLayout);
        POS_Promotion_ButtonLayout.setHorizontalGroup(
            POS_Promotion_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(POS_Promotion_ButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_coupon, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        POS_Promotion_ButtonLayout.setVerticalGroup(
            POS_Promotion_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(POS_Promotion_ButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_coupon, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        POS_Customer_Button.setBackground(new java.awt.Color(42, 22, 57));
        POS_Customer_Button.setForeground(new java.awt.Color(204, 204, 204));
        POS_Customer_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        POS_Customer_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                POS_Customer_ButtonMouseClicked(evt);
            }
        });

        icon_more.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_more.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_moreMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout POS_Customer_ButtonLayout = new javax.swing.GroupLayout(POS_Customer_Button);
        POS_Customer_Button.setLayout(POS_Customer_ButtonLayout);
        POS_Customer_ButtonLayout.setHorizontalGroup(
            POS_Customer_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(POS_Customer_ButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_more, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        POS_Customer_ButtonLayout.setVerticalGroup(
            POS_Customer_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(POS_Customer_ButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_more, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(20, 10, 29));

        jLabel3.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 153));
        jLabel3.setText("Subtotal:");

        jLabel4.setFont(new java.awt.Font("iCiel Gotham Medium", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("150000");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("VND");

        jLabel6.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("Discount:");

        jLabel7.setFont(new java.awt.Font("iCiel Gotham Medium", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("0");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("VND");

        jLabel19.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("TOTAL :");

        jLabel21.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 40)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 102, 204));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("150000");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 153, 153));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("VND");

        jSeparator2.setBackground(new java.awt.Color(148, 69, 187));
        jSeparator2.setForeground(new java.awt.Color(143, 34, 171));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jSeparator2)
        );

        jLabel10.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Item: 18");

        jSeparator1.setBackground(new java.awt.Color(149, 61, 149));
        jSeparator1.setForeground(new java.awt.Color(255, 102, 255));

        jLabel12.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Customer:");

        jLabel24.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 153, 153));
        jLabel24.setText("Nguyen Quang Phuoc");

        POS_Pay_Button.setBackground(new java.awt.Color(247, 81, 225));
        POS_Pay_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        POS_Pay_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                POS_Pay_ButtonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                POS_Pay_ButtonMousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("iCiel Gotham Ultra", 0, 32)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(30, 16, 41));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("PAY NOW!");

        icon_pay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout POS_Pay_ButtonLayout = new javax.swing.GroupLayout(POS_Pay_Button);
        POS_Pay_Button.setLayout(POS_Pay_ButtonLayout);
        POS_Pay_ButtonLayout.setHorizontalGroup(
            POS_Pay_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(POS_Pay_ButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(POS_Pay_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(icon_pay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        POS_Pay_ButtonLayout.setVerticalGroup(
            POS_Pay_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, POS_Pay_ButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        POS_refund_button.setBackground(new java.awt.Color(42, 22, 57));
        POS_refund_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        POS_refund_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                POS_refund_buttonMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Refund");

        icon_refund.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout POS_refund_buttonLayout = new javax.swing.GroupLayout(POS_refund_button);
        POS_refund_button.setLayout(POS_refund_buttonLayout);
        POS_refund_buttonLayout.setHorizontalGroup(
            POS_refund_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(POS_refund_buttonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(POS_refund_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(POS_refund_buttonLayout.createSequentialGroup()
                        .addComponent(icon_refund, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        POS_refund_buttonLayout.setVerticalGroup(
            POS_refund_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, POS_refund_buttonLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(icon_refund, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(42, 22, 57));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel15.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Print Last");

        icon_print.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(icon_print, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(icon_print, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        POS_Reprint_Button.setBackground(new java.awt.Color(42, 22, 57));
        POS_Reprint_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        POS_Reprint_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                POS_Reprint_ButtonMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Reprint");

        icon_reprint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout POS_Reprint_ButtonLayout = new javax.swing.GroupLayout(POS_Reprint_Button);
        POS_Reprint_Button.setLayout(POS_Reprint_ButtonLayout);
        POS_Reprint_ButtonLayout.setHorizontalGroup(
            POS_Reprint_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(POS_Reprint_ButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(POS_Reprint_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(POS_Reprint_ButtonLayout.createSequentialGroup()
                        .addComponent(icon_reprint, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        POS_Reprint_ButtonLayout.setVerticalGroup(
            POS_Reprint_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, POS_Reprint_ButtonLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(icon_reprint, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        POS_Checkstock_Button.setBackground(new java.awt.Color(42, 22, 57));
        POS_Checkstock_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel25.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Check In-Stock");

        icon_checkinstock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_checkinstock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_checkinstockMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout POS_Checkstock_ButtonLayout = new javax.swing.GroupLayout(POS_Checkstock_Button);
        POS_Checkstock_Button.setLayout(POS_Checkstock_ButtonLayout);
        POS_Checkstock_ButtonLayout.setHorizontalGroup(
            POS_Checkstock_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(POS_Checkstock_ButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(POS_Checkstock_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(POS_Checkstock_ButtonLayout.createSequentialGroup()
                        .addComponent(icon_checkinstock, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        POS_Checkstock_ButtonLayout.setVerticalGroup(
            POS_Checkstock_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, POS_Checkstock_ButtonLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(icon_checkinstock, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        POS_Setting_Button.setBackground(new java.awt.Color(42, 22, 57));
        POS_Setting_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        POS_Setting_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                POS_Setting_ButtonMouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Setting");

        icon_setting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout POS_Setting_ButtonLayout = new javax.swing.GroupLayout(POS_Setting_Button);
        POS_Setting_Button.setLayout(POS_Setting_ButtonLayout);
        POS_Setting_ButtonLayout.setHorizontalGroup(
            POS_Setting_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(POS_Setting_ButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(POS_Setting_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(POS_Setting_ButtonLayout.createSequentialGroup()
                        .addComponent(icon_setting, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        POS_Setting_ButtonLayout.setVerticalGroup(
            POS_Setting_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, POS_Setting_ButtonLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(icon_setting, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        POS_Logout_Button.setBackground(new java.awt.Color(42, 22, 57));
        POS_Logout_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel27.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Log Out");

        icon_logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout POS_Logout_ButtonLayout = new javax.swing.GroupLayout(POS_Logout_Button);
        POS_Logout_Button.setLayout(POS_Logout_ButtonLayout);
        POS_Logout_ButtonLayout.setHorizontalGroup(
            POS_Logout_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(POS_Logout_ButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(POS_Logout_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(POS_Logout_ButtonLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(icon_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        POS_Logout_ButtonLayout.setVerticalGroup(
            POS_Logout_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, POS_Logout_ButtonLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(icon_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(POS_Setquantity_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(POS_Promotion_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(POS_Customer_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(POS_Pay_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(POS_Checkstock_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(338, 338, 338))
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addComponent(POS_Setting_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(169, 169, 169))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel25Layout.createSequentialGroup()
                                    .addComponent(POS_refund_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(POS_Reprint_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(POS_Logout_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(13, 13, 13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(POS_Setquantity_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(POS_Promotion_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(POS_Customer_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(POS_refund_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(POS_Checkstock_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(POS_Setting_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(POS_Reprint_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(POS_Logout_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(POS_Pay_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel28.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("UNDER CONSTRUCTION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(POS_Navigator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Barcode_scanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(POS_Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(POS_Navigator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Barcode_scanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(247, 247, 247)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(POS_Category, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void pos_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pos_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_pos_closeMouseClicked

    private void POS_Pay_ButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_POS_Pay_ButtonMousePressed
        POS_Pay_Button.setBackground(new java.awt.Color(247,81,225));
    }//GEN-LAST:event_POS_Pay_ButtonMousePressed

    private void POS_Setquantity_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_POS_Setquantity_ButtonMouseClicked
        POS_setquantity posquantity1 = new POS_setquantity();
        posquantity1.show();
    }//GEN-LAST:event_POS_Setquantity_ButtonMouseClicked

    private void POS_Promotion_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_POS_Promotion_ButtonMouseClicked
        POS_promotion pospromo1 = new POS_promotion();
        pospromo1.show();
    }//GEN-LAST:event_POS_Promotion_ButtonMouseClicked

    private void POS_Pay_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_POS_Pay_ButtonMouseClicked
        POS_payment pospayment1 = new POS_payment();
        pospayment1.show();
    }//GEN-LAST:event_POS_Pay_ButtonMouseClicked

    private void POS_Reprint_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_POS_Reprint_ButtonMouseClicked
        POS_reprint posreprint1 = new POS_reprint();
        posreprint1.show();
    }//GEN-LAST:event_POS_Reprint_ButtonMouseClicked

    private void POS_Setting_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_POS_Setting_ButtonMouseClicked
        POS_settingform possetting1 = new POS_settingform();
        possetting1.show();
    }//GEN-LAST:event_POS_Setting_ButtonMouseClicked

    private void icon_moreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_moreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_icon_moreMouseClicked

    private void POS_Customer_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_POS_Customer_ButtonMouseClicked
        POS_customers poscustomer1 = new POS_customers();
        poscustomer1.show();
    }//GEN-LAST:event_POS_Customer_ButtonMouseClicked

    private void POS_refund_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_POS_refund_buttonMouseClicked
        POS_refund posrefund = new POS_refund();
        posrefund.show();
    }//GEN-LAST:event_POS_refund_buttonMouseClicked

    private void icon_checkinstockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_checkinstockMouseClicked
        POS_checkinstock poscheckin1 = new POS_checkinstock();
        poscheckin1.show();
    }//GEN-LAST:event_icon_checkinstockMouseClicked
    
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
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barcode_scanner;
    private javax.swing.JPanel POS_Category;
    private javax.swing.JPanel POS_Checkstock_Button;
    private javax.swing.JPanel POS_Customer_Button;
    private javax.swing.JPanel POS_Logout_Button;
    private javax.swing.JPanel POS_Navigator;
    private javax.swing.JPanel POS_Pay_Button;
    private javax.swing.JPanel POS_Promotion_Button;
    private javax.swing.JPanel POS_Reprint_Button;
    private javax.swing.JPanel POS_Setquantity_Button;
    private javax.swing.JPanel POS_Setting_Button;
    private javax.swing.JTable POS_Table;
    private javax.swing.JPanel POS_refund_button;
    private javax.swing.JPanel button_barcodescanner;
    private javax.swing.JPanel cg_milk;
    private javax.swing.JPanel cg_mineralwater;
    private javax.swing.JPanel cg_nonfood;
    private javax.swing.JPanel cg_noodles;
    private javax.swing.JPanel cg_snack;
    private javax.swing.JPanel cg_softdrink;
    private javax.swing.JPanel cg_sortdown;
    private javax.swing.JLabel icon_checkinstock;
    private javax.swing.JLabel icon_coupon;
    private javax.swing.JLabel icon_deleteall;
    private javax.swing.JLabel icon_deleteitem;
    private javax.swing.JLabel icon_instantnoodles;
    private javax.swing.JLabel icon_logout;
    private javax.swing.JLabel icon_milk;
    private javax.swing.JLabel icon_mineralwater;
    private javax.swing.JLabel icon_more;
    private javax.swing.JLabel icon_pay;
    private javax.swing.JLabel icon_print;
    private javax.swing.JLabel icon_refund;
    private javax.swing.JLabel icon_reprint;
    private javax.swing.JLabel icon_setting;
    private javax.swing.JLabel icon_snack;
    private javax.swing.JLabel icon_soap;
    private javax.swing.JLabel icon_softdrink;
    private javax.swing.JLabel icon_sortdown;
    private javax.swing.JLabel item_requantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel maintitle;
    private javax.swing.JLabel pos_close;
    // End of variables declaration//GEN-END:variables
}
