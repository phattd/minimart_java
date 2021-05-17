/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minimart.Forms;

import com.minimart.BUS.SanPhamBUS;
import com.minimart.DTO.SanPham;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pero
 */


public final class Dashboard_Form extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard_Form
     */
    // var developer delare//
    private ArrayList<SanPham> sanPhamArrayList=new ArrayList<>();
    private Form_Inventory product_win=new Form_Inventory();
    private DefaultTableModel renderProduct=new DefaultTableModel();
    private int indexProductTable=-1;

    public Dashboard_Form() {

        initComponents();

        //Center this form
        this.setLocationRelativeTo(null);

        //Set Icon            
        //Navigator
        icon_close.setIcon(new javax.swing.ImageIcon("./IMAGES/login_close.png"));

        //Menu
        icon_user_dashboard.setIcon(new javax.swing.ImageIcon("./IMAGES/dashboard_user.png"));
        icon_menu_dashboard.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_dashboard.png"));
        icon_menu_inventory.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_inventory.png"));
        icon_menu_orders.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_orders.png"));
        icon_menu_promotions.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_promotion.png"));
        icon_menu_membership.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_membership.png"));
        icon_menu_users.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_users.png"));

        //Base
        base_bg.setIcon(new javax.swing.ImageIcon("./IMAGES/base_background.png"));

        //Workspace_dashboard
        icon_search_db.setIcon(new javax.swing.ImageIcon("./IMAGES/dashboard_new_search.png"));
        icon_sales_db.setIcon(new javax.swing.ImageIcon("./IMAGES/dashboard_new_sales.png"));

        //Workplace_order
        icon_search_order.setIcon(new javax.swing.ImageIcon("./IMAGES/dashboard_new_search.png"));

        //Workplace_promotion
        icon_promocode.setIcon(new javax.swing.ImageIcon("./IMAGES/promotion_promocode.png"));
        icon_search_promo.setIcon(new javax.swing.ImageIcon("./IMAGES/dashboard_new_search.png"));

        //Workplace_membership
        icon_search_membership.setIcon(new javax.swing.ImageIcon("./IMAGES/dashboard_new_search.png"));
        icon_member_gold.setIcon(new javax.swing.ImageIcon("./IMAGES/membership_gold.png"));
        icon_member_silver.setIcon(new javax.swing.ImageIcon("./IMAGES/membership_silver.png"));
        icon_member_normal.setIcon(new javax.swing.ImageIcon("./IMAGES/membership_normal.png"));

        //Workplace_user
        icon_search_user.setIcon(new javax.swing.ImageIcon("./IMAGES/dashboard_new_search.png"));
        icon_user_image.setIcon(new javax.swing.ImageIcon("./IMAGES/astronaut.png"));

        Workspace_base.setVisible(true);
        Workspace_dashboard.setVisible(false);
        Workspace_inventory.setVisible(false);
        Workspace_orders.setVisible(false);
        Workspace_promotions.setVisible(false);
        Workspace_membership.setVisible(false);
        Workspace_users.setVisible(false);
        Workspace_provider.setVisible(false);

        //hover
        addActionToMenuPanels();

        //Set Table Header
        dashboard_table.getTableHeader().setFont(new Font("iCiel Gotham Medium", Font.PLAIN, 20));
        dashboard_table.getTableHeader().setOpaque(false);
        dashboard_table.getTableHeader().setBackground(new Color(254, 247, 255));

        inventory_table.getTableHeader().setFont(new Font("iCiel Gotham Medium", Font.PLAIN, 20));
        inventory_table.getTableHeader().setOpaque(false);
        inventory_table.getTableHeader().setBackground(new Color(254, 247, 255));

        order_table.getTableHeader().setFont(new Font("iCiel Gotham Medium", Font.PLAIN, 20));
        order_table.getTableHeader().setOpaque(false);
        order_table.getTableHeader().setBackground(new Color(254, 247, 255));

        promotion_table.getTableHeader().setFont(new Font("iCiel Gotham Medium", Font.PLAIN, 20));
        promotion_table.getTableHeader().setOpaque(false);
        promotion_table.getTableHeader().setBackground(new Color(254, 247, 255));

        membership_table.getTableHeader().setFont(new Font("iCiel Gotham Medium", Font.PLAIN, 20));
        membership_table.getTableHeader().setOpaque(false);
        membership_table.getTableHeader().setBackground(new Color(254, 247, 255));

        user_table.getTableHeader().setFont(new Font("iCiel Gotham Medium", Font.PLAIN, 20));
        user_table.getTableHeader().setOpaque(false);
        user_table.getTableHeader().setBackground(new Color(254, 247, 255));


        //load data on table
        controlTableProduct();

    }


    //Function to add action to menu items
    public void addActionToMenuPanels() {
        //Dashboard
        menu_dashboard.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //selected items
                menuitems_1.setForeground(new java.awt.Color(111, 7, 165));
                menuitems_2.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_3.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_4.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_5.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_6.setForeground(new java.awt.Color(169, 169, 169));

                //set icon of selected items
                icon_menu_dashboard.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_new_dashboard.png"));
                icon_menu_inventory.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_inventory.png"));
                icon_menu_orders.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_orders.png"));
                icon_menu_promotions.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_promotion.png"));
                icon_menu_membership.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_membership.png"));
                icon_menu_users.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_users.png"));

                //select the workspace
                Workspace_base.setVisible(false);
                Workspace_dashboard.setVisible(true);
                Workspace_inventory.setVisible(false);
                Workspace_orders.setVisible(false);
                Workspace_promotions.setVisible(false);
                Workspace_membership.setVisible(false);
                Workspace_users.setVisible(false);
                Workspace_provider.setVisible(false);

                //Set Table Header
                dashboard_table.getTableHeader().setFont(new Font("iCiel Gotham Medium", Font.PLAIN, 20));
                dashboard_table.getTableHeader().setOpaque(false);
                dashboard_table.getTableHeader().setBackground(new Color(254, 247, 255));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                menu_dashboard.setBackground(new java.awt.Color(233, 168, 245));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                menu_dashboard.setBackground(new java.awt.Color(243, 230, 245));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                menu_dashboard.setBackground(new java.awt.Color(254, 247, 255));
            }
        });

        //Inventory
        menu_inventory.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //selected items
                menuitems_1.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_2.setForeground(new java.awt.Color(111, 7, 165));
                menuitems_3.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_4.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_5.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_6.setForeground(new java.awt.Color(169, 169, 169));

                //set icon of selected items
                icon_menu_dashboard.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_dashboard.png"));
                icon_menu_inventory.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_new_inventory.png"));
                icon_menu_orders.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_orders.png"));
                icon_menu_promotions.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_promotion.png"));
                icon_menu_membership.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_membership.png"));
                icon_menu_users.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_users.png"));

                //select the workspace
                Workspace_base.setVisible(false);
                Workspace_dashboard.setVisible(false);
                Workspace_inventory.setVisible(true);
                Workspace_orders.setVisible(false);
                Workspace_promotions.setVisible(false);
                Workspace_membership.setVisible(false);
                Workspace_users.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                menu_inventory.setBackground(new java.awt.Color(233, 168, 245));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                menu_inventory.setBackground(new java.awt.Color(243, 230, 245));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                menu_inventory.setBackground(new java.awt.Color(254, 247, 255));
            }
        });

        //Orders
        menu_orders.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //selected items
                menuitems_1.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_2.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_3.setForeground(new java.awt.Color(111, 7, 165));
                menuitems_4.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_5.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_6.setForeground(new java.awt.Color(169, 169, 169));

                //set icon of selected items
                icon_menu_dashboard.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_dashboard.png"));
                icon_menu_inventory.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_inventory.png"));
                icon_menu_orders.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_new_orders.png"));
                icon_menu_promotions.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_promotion.png"));
                icon_menu_membership.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_membership.png"));
                icon_menu_users.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_users.png"));

                //select the workspace
                Workspace_base.setVisible(false);
                Workspace_dashboard.setVisible(false);
                Workspace_inventory.setVisible(false);
                Workspace_orders.setVisible(true);
                Workspace_promotions.setVisible(false);
                Workspace_membership.setVisible(false);
                Workspace_users.setVisible(false);

            }

            @Override
            public void mousePressed(MouseEvent e) {
                menu_orders.setBackground(new java.awt.Color(233, 168, 245));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                menu_orders.setBackground(new java.awt.Color(243, 230, 245));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                menu_orders.setBackground(new java.awt.Color(254, 247, 255));
            }
        });

        //Promotion
        menu_promotion.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //selected items
                menuitems_1.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_2.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_3.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_4.setForeground(new java.awt.Color(111, 7, 165));
                menuitems_5.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_6.setForeground(new java.awt.Color(169, 169, 169));

                //set icon of selected items
                icon_menu_dashboard.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_dashboard.png"));
                icon_menu_inventory.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_inventory.png"));
                icon_menu_orders.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_orders.png"));
                icon_menu_promotions.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_new_promotion.png"));
                icon_menu_membership.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_membership.png"));
                icon_menu_users.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_users.png"));

                //select the workspace
                Workspace_base.setVisible(false);
                Workspace_dashboard.setVisible(false);
                Workspace_inventory.setVisible(false);
                Workspace_orders.setVisible(false);
                Workspace_promotions.setVisible(true);
                Workspace_membership.setVisible(false);
                Workspace_users.setVisible(false);

            }

            @Override
            public void mousePressed(MouseEvent e) {
                menu_promotion.setBackground(new java.awt.Color(233, 168, 245));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                menu_promotion.setBackground(new java.awt.Color(243, 230, 245));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                menu_promotion.setBackground(new java.awt.Color(254, 247, 255));
            }
        });

        //Membership
        menu_membership.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //change color of selected items
                menuitems_1.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_2.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_3.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_4.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_5.setForeground(new java.awt.Color(111, 7, 165));
                menuitems_6.setForeground(new java.awt.Color(169, 169, 169));

                //set icon of selected items
                icon_menu_dashboard.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_dashboard.png"));
                icon_menu_inventory.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_inventory.png"));
                icon_menu_orders.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_orders.png"));
                icon_menu_promotions.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_promotion.png"));
                icon_menu_membership.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_new_membership.png"));
                icon_menu_users.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_users.png"));

                //select the workspace
                Workspace_base.setVisible(false);
                Workspace_dashboard.setVisible(false);
                Workspace_inventory.setVisible(false);
                Workspace_orders.setVisible(false);
                Workspace_promotions.setVisible(false);
                Workspace_membership.setVisible(true);
                Workspace_users.setVisible(false);

            }

            @Override
            public void mousePressed(MouseEvent e) {
                menu_membership.setBackground(new java.awt.Color(233, 168, 245));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                menu_membership.setBackground(new java.awt.Color(243, 230, 245));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                menu_membership.setBackground(new java.awt.Color(254, 247, 255));
            }
        });

        //Users
        menu_users.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {                //change color of selected items
                //change color of selected items
                menuitems_1.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_2.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_3.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_4.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_5.setForeground(new java.awt.Color(169, 169, 169));
                menuitems_6.setForeground(new java.awt.Color(111, 7, 165));

                //set icon of selected items
                icon_menu_dashboard.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_dashboard.png"));
                icon_menu_inventory.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_inventory.png"));
                icon_menu_orders.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_orders.png"));
                icon_menu_promotions.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_promotion.png"));
                icon_menu_membership.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_unselect_membership.png"));
                icon_menu_users.setIcon(new javax.swing.ImageIcon("./IMAGES/menu_new_users.png"));

                //select the workspace
                Workspace_base.setVisible(false);
                Workspace_dashboard.setVisible(false);
                Workspace_inventory.setVisible(false);
                Workspace_orders.setVisible(false);
                Workspace_promotions.setVisible(false);
                Workspace_membership.setVisible(false);
                Workspace_users.setVisible(true);

            }

            @Override
            public void mousePressed(MouseEvent e) {
                menu_users.setBackground(new java.awt.Color(233, 168, 245));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                menu_users.setBackground(new java.awt.Color(243, 230, 245));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                menu_users.setBackground(new java.awt.Color(254, 247, 255));
            }
        });

        //Go to POS
        menu_gotopos.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                menu_gotopos.setBackground(new java.awt.Color(233, 168, 245));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                menu_gotopos.setBackground(new java.awt.Color(243, 230, 245));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                menu_gotopos.setBackground(new java.awt.Color(254, 247, 255));
            }
        });
    }

    public void controlTableProduct()
    {
        //SanPhamBUS sanPhamBUS=new SanPhamBUS();
        //sanPhamArrayList=sanPhamBUS.getdssp();
        SanPham s1=new SanPham("1","Nuoc Suoi","Soft Drink",5000,"Chai",5);
        SanPham s2=new SanPham("2","Bia","Soft Drink",25000,"Chai",5);
        SanPham s3=new SanPham("3","Nuoc String","Soft Drink",10000,"Chai",5);
        sanPhamArrayList.add(s1);
        sanPhamArrayList.add(s2);
        sanPhamArrayList.add(s3);
        renderProduct= (DefaultTableModel) inventory_table.getModel();
        for (SanPham index : sanPhamArrayList)
        {
            renderProduct.addRow(index.toArray());
        }
        inventory_table.setModel(renderProduct);
    }
    public void addDataTableProduct()
    {
        product_win.show();
        SanPham sanPham=product_win.getValue();
        renderProduct= (DefaultTableModel) inventory_table.getModel();
        renderProduct.addRow(sanPham.toArray());
        inventory_table.setModel(renderProduct);
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        dashboard_logo = new javax.swing.JLabel();
        icon_user_dashboard = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menu_dashboard = new javax.swing.JPanel();
        icon_menu_dashboard = new javax.swing.JLabel();
        menuitems_1 = new javax.swing.JLabel();
        menu_inventory = new javax.swing.JPanel();
        icon_menu_inventory = new javax.swing.JLabel();
        menuitems_2 = new javax.swing.JLabel();
        menu_orders = new javax.swing.JPanel();
        icon_menu_orders = new javax.swing.JLabel();
        menuitems_3 = new javax.swing.JLabel();
        menu_promotion = new javax.swing.JPanel();
        icon_menu_promotions = new javax.swing.JLabel();
        menuitems_4 = new javax.swing.JLabel();
        menu_membership = new javax.swing.JPanel();
        icon_menu_membership = new javax.swing.JLabel();
        menuitems_5 = new javax.swing.JLabel();
        menu_users = new javax.swing.JPanel();
        icon_menu_users = new javax.swing.JLabel();
        menuitems_6 = new javax.swing.JLabel();
        menu_gotopos = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        Navigator = new javax.swing.JPanel();
        icon_close = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Workspace_base = new javax.swing.JPanel();
        base_bg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Workspace_dashboard = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dashboard_table = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        icon_search_db = new javax.swing.JLabel();
        icon_sales_db = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        Workspace_inventory = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        inventory_table = new javax.swing.JTable();
        inven_export_btn = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        inven_new_btn = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        inven_edit_btn = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        inven_delete_btn = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        Workspace_orders = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        icon_search_order = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        order_table = new javax.swing.JTable();
        jPanel36 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel37 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel38 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        order_export_btn = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        order_new_btn = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        order_edit_btn = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        order_delete_btn = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        order_intake_btn = new javax.swing.JLabel();
        Workspace_promotions = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        icon_search_promo = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        promotion_table = new javax.swing.JTable();
        promo_view_btn = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        promo_new_btn = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        promo_edit_btn = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        promo_delete_btn = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        icon_promocode = new javax.swing.JLabel();
        Workspace_membership = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        icon_search_membership = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        membership_table = new javax.swing.JTable();
        jPanel54 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        icon_member_silver = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        member_view_btn = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        member_new_btn = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        member_edit_btn = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        member_delete_btn = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jPanel70 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        icon_member_gold = new javax.swing.JLabel();
        jPanel71 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        icon_member_normal = new javax.swing.JLabel();
        Workspace_users = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        icon_search_user = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        user_table = new javax.swing.JTable();
        user_view_btn = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        user_new_btn = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        user_edit_btn = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        user_delete_btn = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        icon_user_image = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        Workspace_provider = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jPanel64 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        icon_search_provider = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        provider_table = new javax.swing.JTable();
        provider_view_btn = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        provider_new_btn = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        provider_edit_btn = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        provider_delete_btn = new javax.swing.JPanel();
        jLabel119 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1600, 900));
        setResizable(false);
        setSize(new java.awt.Dimension(1600, 900));

        Menu.setBackground(new java.awt.Color(254, 247, 255));
        Menu.setForeground(new java.awt.Color(254, 247, 255));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboard_logo.setFont(new java.awt.Font("Casanova Scotia", 1, 24)); // NOI18N
        dashboard_logo.setForeground(new java.awt.Color(111, 7, 165));
        dashboard_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard_logo.setText("Peroro");
        Menu.add(dashboard_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 288, 63));

        icon_user_dashboard.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Menu.add(icon_user_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 149, 100, 60));

        jLabel1.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 24)); // NOI18N
        jLabel1.setText("Pero");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 149, 176, -1));

        jLabel2.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Developer");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 179, 176, 30));

        menu_dashboard.setBackground(new java.awt.Color(254, 247, 255));
        menu_dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_dashboard.setPreferredSize(new java.awt.Dimension(300, 70));

        icon_menu_dashboard.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        menuitems_1.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        menuitems_1.setForeground(new java.awt.Color(169, 169, 169));
        menuitems_1.setText("Dashboard");

        javax.swing.GroupLayout menu_dashboardLayout = new javax.swing.GroupLayout(menu_dashboard);
        menu_dashboard.setLayout(menu_dashboardLayout);
        menu_dashboardLayout.setHorizontalGroup(
            menu_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_menu_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(menuitems_1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_dashboardLayout.setVerticalGroup(
            menu_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(icon_menu_dashboard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuitems_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addContainerGap())
        );

        Menu.add(menu_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 251, -1, -1));

        menu_inventory.setBackground(new java.awt.Color(254, 247, 255));
        menu_inventory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_inventory.setPreferredSize(new java.awt.Dimension(300, 70));

        icon_menu_inventory.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        menuitems_2.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        menuitems_2.setForeground(new java.awt.Color(169, 169, 169));
        menuitems_2.setText("Inventory");

        javax.swing.GroupLayout menu_inventoryLayout = new javax.swing.GroupLayout(menu_inventory);
        menu_inventory.setLayout(menu_inventoryLayout);
        menu_inventoryLayout.setHorizontalGroup(
            menu_inventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_inventoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_menu_inventory, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuitems_2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_inventoryLayout.setVerticalGroup(
            menu_inventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_inventoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu_inventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(icon_menu_inventory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuitems_2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addContainerGap())
        );

        Menu.add(menu_inventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 333, -1, -1));

        menu_orders.setBackground(new java.awt.Color(254, 247, 255));
        menu_orders.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_orders.setPreferredSize(new java.awt.Dimension(300, 70));

        icon_menu_orders.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        menuitems_3.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        menuitems_3.setForeground(new java.awt.Color(169, 169, 169));
        menuitems_3.setText("Orders");

        javax.swing.GroupLayout menu_ordersLayout = new javax.swing.GroupLayout(menu_orders);
        menu_orders.setLayout(menu_ordersLayout);
        menu_ordersLayout.setHorizontalGroup(
            menu_ordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_ordersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_menu_orders, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuitems_3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_ordersLayout.setVerticalGroup(
            menu_ordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_ordersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu_ordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(icon_menu_orders, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuitems_3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addContainerGap())
        );

        Menu.add(menu_orders, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 415, -1, -1));

        menu_promotion.setBackground(new java.awt.Color(254, 247, 255));
        menu_promotion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_promotion.setPreferredSize(new java.awt.Dimension(300, 70));

        icon_menu_promotions.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        menuitems_4.setBackground(new java.awt.Color(238, 232, 240));
        menuitems_4.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        menuitems_4.setForeground(new java.awt.Color(169, 169, 169));
        menuitems_4.setText("Promotions");

        javax.swing.GroupLayout menu_promotionLayout = new javax.swing.GroupLayout(menu_promotion);
        menu_promotion.setLayout(menu_promotionLayout);
        menu_promotionLayout.setHorizontalGroup(
            menu_promotionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_promotionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_menu_promotions, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuitems_4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_promotionLayout.setVerticalGroup(
            menu_promotionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_promotionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu_promotionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(icon_menu_promotions, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuitems_4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addContainerGap())
        );

        Menu.add(menu_promotion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 497, -1, -1));

        menu_membership.setBackground(new java.awt.Color(254, 247, 255));
        menu_membership.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_membership.setPreferredSize(new java.awt.Dimension(300, 70));

        icon_menu_membership.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        menuitems_5.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        menuitems_5.setForeground(new java.awt.Color(169, 169, 169));
        menuitems_5.setText("Membership");

        javax.swing.GroupLayout menu_membershipLayout = new javax.swing.GroupLayout(menu_membership);
        menu_membership.setLayout(menu_membershipLayout);
        menu_membershipLayout.setHorizontalGroup(
            menu_membershipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_membershipLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_menu_membership, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuitems_5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_membershipLayout.setVerticalGroup(
            menu_membershipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_membershipLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu_membershipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(icon_menu_membership, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuitems_5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addContainerGap())
        );

        Menu.add(menu_membership, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 579, -1, -1));

        menu_users.setBackground(new java.awt.Color(254, 247, 255));
        menu_users.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_users.setPreferredSize(new java.awt.Dimension(300, 70));

        icon_menu_users.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        menuitems_6.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        menuitems_6.setForeground(new java.awt.Color(169, 169, 169));
        menuitems_6.setText("Users");

        javax.swing.GroupLayout menu_usersLayout = new javax.swing.GroupLayout(menu_users);
        menu_users.setLayout(menu_usersLayout);
        menu_usersLayout.setHorizontalGroup(
            menu_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_usersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_menu_users, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuitems_6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu_usersLayout.setVerticalGroup(
            menu_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_usersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(icon_menu_users, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menuitems_6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addContainerGap())
        );

        Menu.add(menu_users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 661, -1, -1));

        menu_gotopos.setBackground(new java.awt.Color(254, 247, 255));
        menu_gotopos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu_gotopos.setPreferredSize(new java.awt.Dimension(300, 70));

        jLabel15.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 51, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("GO TO POS");

        javax.swing.GroupLayout menu_gotoposLayout = new javax.swing.GroupLayout(menu_gotopos);
        menu_gotopos.setLayout(menu_gotoposLayout);
        menu_gotoposLayout.setHorizontalGroup(
            menu_gotoposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_gotoposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menu_gotoposLayout.setVerticalGroup(
            menu_gotoposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_gotoposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
        );

        Menu.add(menu_gotopos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 795, -1, -1));

        Navigator.setBackground(new java.awt.Color(254, 247, 255));
        Navigator.setForeground(new java.awt.Color(254, 247, 255));
        Navigator.setPreferredSize(new java.awt.Dimension(1300, 70));

        icon_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        icon_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_closeMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 19)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 51, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("06:31");
        jLabel5.setAutoscrolls(true);

        jLabel6.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("15/05/2021");

        jLabel13.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 51, 0));
        jLabel13.setText("Logout");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout NavigatorLayout = new javax.swing.GroupLayout(Navigator);
        Navigator.setLayout(NavigatorLayout);
        NavigatorLayout.setHorizontalGroup(
            NavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigatorLayout.createSequentialGroup()
                .addGap(939, 939, 939)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(icon_close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        NavigatorLayout.setVerticalGroup(
            NavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigatorLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(NavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(icon_close, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        Workspace_base.setBackground(new java.awt.Color(222, 221, 221));
        Workspace_base.setPreferredSize(new java.awt.Dimension(1300, 0));

        base_bg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Welcome back, Pero!");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel4.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("You can manage everything from here.");

        javax.swing.GroupLayout Workspace_baseLayout = new javax.swing.GroupLayout(Workspace_base);
        Workspace_base.setLayout(Workspace_baseLayout);
        Workspace_baseLayout.setHorizontalGroup(
            Workspace_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base_bg, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Workspace_baseLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(Workspace_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1288, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        Workspace_baseLayout.setVerticalGroup(
            Workspace_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Workspace_baseLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(base_bg, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Workspace_dashboard.setBackground(new java.awt.Color(222, 221, 221));
        Workspace_dashboard.setPreferredSize(new java.awt.Dimension(1300, 855));

        jLabel7.setFont(new java.awt.Font("iCiel Gotham Ultra", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(70, 17, 123));
        jLabel7.setText("What's new today? ");
        jLabel7.setFocusCycleRoot(true);

        jLabel11.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Date Taken:");

        jLabel8.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(184, 44, 219));
        jLabel8.setText("15/05/21");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setFocusTraversalPolicyProvider(true);

        jLabel12.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("-");

        jLabel9.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(184, 44, 219));
        jLabel9.setText("15/05/21");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel1.setBackground(new java.awt.Color(153, 0, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel10.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Search");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(254, 247, 255));

        jLabel14.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Total receipt");

        jLabel16.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(48, 13, 80));
        jLabel16.setText("124");

        jLabel17.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 51));
        jLabel17.setText("+increased by 10%");

        jLabel18.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Total Income");

        jLabel19.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(48, 13, 80));
        jLabel19.setText("12,240,000");

        jLabel20.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 51));
        jLabel20.setText("+increased by 2%");

        jLabel21.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 0, 0));
        jLabel21.setText("-decreased by 17%");

        jLabel22.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(48, 13, 80));
        jLabel22.setText("32");

        jLabel23.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("New member");

        jLabel24.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("Weekly Sales");

        jLabel25.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(48, 13, 80));
        jLabel25.setText("48,790,000");

        jLabel26.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 153, 51));
        jLabel26.setText("+increased by 2%");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel25))
                .addGap(67, 67, 67))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(254, 247, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1210, 560));

        jLabel27.setFont(new java.awt.Font("iCiel Gotham Ultra", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("SALES RECORD");

        dashboard_table.setBackground(new java.awt.Color(254, 247, 255));
        dashboard_table.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        dashboard_table.setForeground(new java.awt.Color(51, 51, 51));
        dashboard_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1233", "12:30 12/05/21", "50000", null, null, null, null, null, "Phat"},
                {"1234", "13:00 12/05/21", "43000", null, null, null, null, null, "Phuc"},
                {"1235", "13:20 12/05/21", "120000", null, null, null, null, null, "Phuc"},
                {"1236", "13:22 12/05/21", "10000", null, null, null, null, null, "Phuc"},
                {"1237", "13:25 12/05/21", "12000", null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Receipt No.", "Date and time", "Total Money", "Total Discount", "Total Pay", "Cash", "Change", "Customer", "Cashier"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dashboard_table.setFocusable(false);
        dashboard_table.setGridColor(new java.awt.Color(254, 247, 255));
        dashboard_table.setRowHeight(70);
        dashboard_table.setRowMargin(0);
        dashboard_table.setSelectionBackground(new java.awt.Color(182, 93, 255));
        dashboard_table.setShowHorizontalLines(false);
        dashboard_table.setShowVerticalLines(false);
        dashboard_table.getTableHeader().setReorderingAllowed(false);
        dashboard_table.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(dashboard_table);
        if (dashboard_table.getColumnModel().getColumnCount() > 0) {
            dashboard_table.getColumnModel().getColumn(0).setResizable(false);
            dashboard_table.getColumnModel().getColumn(1).setResizable(false);
            dashboard_table.getColumnModel().getColumn(2).setResizable(false);
            dashboard_table.getColumnModel().getColumn(3).setResizable(false);
            dashboard_table.getColumnModel().getColumn(4).setResizable(false);
            dashboard_table.getColumnModel().getColumn(5).setResizable(false);
            dashboard_table.getColumnModel().getColumn(6).setResizable(false);
            dashboard_table.getColumnModel().getColumn(7).setResizable(false);
            dashboard_table.getColumnModel().getColumn(8).setResizable(false);
        }

        jPanel6.setBackground(new java.awt.Color(221, 220, 220));

        jLabel29.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 16)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 102));
        jLabel29.setText("Receipt ID:");

        jTextField1.setBackground(new java.awt.Color(221, 220, 220));
        jTextField1.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(27, 27, 27));
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        icon_search_db.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_search_db.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon_search_db, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(icon_search_db, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        icon_sales_db.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel7.setBackground(new java.awt.Color(192, 234, 192));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel28.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(18, 99, 45));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Export");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(245, 184, 184));

        jLabel30.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 51, 51));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Delete");
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(icon_sales_db, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(460, 460, 460)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon_sales_db, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Workspace_dashboardLayout = new javax.swing.GroupLayout(Workspace_dashboard);
        Workspace_dashboard.setLayout(Workspace_dashboardLayout);
        Workspace_dashboardLayout.setHorizontalGroup(
            Workspace_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Workspace_dashboardLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(Workspace_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Workspace_dashboardLayout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Workspace_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Workspace_dashboardLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel9)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Workspace_dashboardLayout.setVerticalGroup(
            Workspace_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Workspace_dashboardLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(Workspace_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Workspace_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(Workspace_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        Workspace_inventory.setBackground(new java.awt.Color(222, 221, 221));
        Workspace_inventory.setPreferredSize(new java.awt.Dimension(1300, 830));

        jPanel9.setBackground(new java.awt.Color(254, 247, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(1220, 730));

        jLabel31.setFont(new java.awt.Font("Myriad Pro Light", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(41, 16, 78));
        jLabel31.setText("ITEM DATA MASTER");
        jLabel31.setPreferredSize(new java.awt.Dimension(48, 48));

        jLabel32.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        jLabel32.setText("Barcode:");

        jLabel33.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        jLabel33.setText("Product Name:");

        jLabel34.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        jLabel34.setText("Category:");

        jTextField2.setBackground(new java.awt.Color(221, 220, 220));
        jTextField2.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 51, 51));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(null);

        jTextField3.setBackground(new java.awt.Color(221, 220, 220));
        jTextField3.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(51, 51, 51));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(221, 220, 220));
        jComboBox1.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soft Drink", "Mineral Water", "Noodles", "Milk", "Snack", "Non-food", " " }));

        jPanel11.setBackground(new java.awt.Color(153, 0, 255));
        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel35.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Apply Filter");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        inventory_table.setBackground(new java.awt.Color(254, 247, 255));
        inventory_table.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        inventory_table.setForeground(new java.awt.Color(51, 51, 51));
        inventory_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barcode", "Product Name.", "Price", "Category", "Unit", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inventory_table.setFocusable(false);
        inventory_table.setGridColor(new java.awt.Color(254, 247, 255));
        inventory_table.setRowHeight(70);
        inventory_table.setRowMargin(0);
        inventory_table.setSelectionBackground(new java.awt.Color(182, 93, 255));
        inventory_table.setShowHorizontalLines(false);
        inventory_table.setShowVerticalLines(false);
        inventory_table.getTableHeader().setReorderingAllowed(false);
        inventory_table.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(inventory_table);
        if (inventory_table.getColumnModel().getColumnCount() > 0) {
            inventory_table.getColumnModel().getColumn(0).setResizable(false);
            inventory_table.getColumnModel().getColumn(1).setResizable(false);
            inventory_table.getColumnModel().getColumn(2).setResizable(false);
            inventory_table.getColumnModel().getColumn(4).setResizable(false);
        }

        inven_export_btn.setBackground(new java.awt.Color(192, 234, 192));
        inven_export_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel36.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(18, 99, 45));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Export");

        javax.swing.GroupLayout inven_export_btnLayout = new javax.swing.GroupLayout(inven_export_btn);
        inven_export_btn.setLayout(inven_export_btnLayout);
        inven_export_btnLayout.setHorizontalGroup(
            inven_export_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inven_export_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        inven_export_btnLayout.setVerticalGroup(
            inven_export_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        inven_new_btn.setBackground(new java.awt.Color(153, 204, 255));
        inven_new_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inven_new_btnMouseClicked(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 51, 204));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("New");
        jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout inven_new_btnLayout = new javax.swing.GroupLayout(inven_new_btn);
        inven_new_btn.setLayout(inven_new_btnLayout);
        inven_new_btnLayout.setHorizontalGroup(
            inven_new_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inven_new_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        inven_new_btnLayout.setVerticalGroup(
            inven_new_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        inven_edit_btn.setBackground(new java.awt.Color(187, 187, 252));
        inven_edit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inven_edit_btnMouseClicked(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(102, 51, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Edit");
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout inven_edit_btnLayout = new javax.swing.GroupLayout(inven_edit_btn);
        inven_edit_btn.setLayout(inven_edit_btnLayout);
        inven_edit_btnLayout.setHorizontalGroup(
            inven_edit_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inven_edit_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        inven_edit_btnLayout.setVerticalGroup(
            inven_edit_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        inven_delete_btn.setBackground(new java.awt.Color(245, 184, 184));

        jLabel39.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 51, 51));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Delete");
        jLabel39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout inven_delete_btnLayout = new javax.swing.GroupLayout(inven_delete_btn);
        inven_delete_btn.setLayout(inven_delete_btnLayout);
        inven_delete_btnLayout.setHorizontalGroup(
            inven_delete_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inven_delete_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        inven_delete_btnLayout.setVerticalGroup(
            inven_delete_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(inven_export_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inven_new_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inven_edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inven_delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 166, Short.MAX_VALUE))
                                    .addComponent(jTextField3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inven_new_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inven_export_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inven_edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inven_delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout Workspace_inventoryLayout = new javax.swing.GroupLayout(Workspace_inventory);
        Workspace_inventory.setLayout(Workspace_inventoryLayout);
        Workspace_inventoryLayout.setHorizontalGroup(
            Workspace_inventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Workspace_inventoryLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        Workspace_inventoryLayout.setVerticalGroup(
            Workspace_inventoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Workspace_inventoryLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Workspace_orders.setBackground(new java.awt.Color(222, 221, 221));
        Workspace_orders.setPreferredSize(new java.awt.Dimension(1300, 830));

        jPanel34.setBackground(new java.awt.Color(254, 247, 255));
        jPanel34.setPreferredSize(new java.awt.Dimension(1220, 790));

        jLabel64.setFont(new java.awt.Font("Myriad Pro Light", 1, 24)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(41, 16, 78));
        jLabel64.setText("ORDER HISTORY");

        jPanel35.setBackground(new java.awt.Color(221, 220, 220));

        jLabel65.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 16)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(102, 102, 102));
        jLabel65.setText("Order ID:");

        jTextField6.setBackground(new java.awt.Color(221, 220, 220));
        jTextField6.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(27, 27, 27));
        jTextField6.setBorder(null);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        icon_search_order.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_search_order.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon_search_order, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(icon_search_order, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        order_table.setBackground(new java.awt.Color(254, 247, 255));
        order_table.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        order_table.setForeground(new java.awt.Color(51, 51, 51));
        order_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"12:30 12/05/21", "1233", "50000", "Phat", null, null},
                {"13:00 12/05/21", "1234", "43000", "Phuc", null, null},
                {"13:20 12/05/21", "1235", "120000", "Phuc", null, null},
                {"13:22 12/05/21", "1236", "10000", "Phuc", null, null},
                {"13:25 12/05/21", "1237", "12000", null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "On Date", "Product ID", "Provider", "Price", "Order Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        order_table.setFocusable(false);
        order_table.setGridColor(new java.awt.Color(254, 247, 255));
        order_table.setRowHeight(70);
        order_table.setRowMargin(0);
        order_table.setSelectionBackground(new java.awt.Color(182, 93, 255));
        order_table.setShowHorizontalLines(false);
        order_table.setShowVerticalLines(false);
        order_table.getTableHeader().setReorderingAllowed(false);
        order_table.setVerifyInputWhenFocusTarget(false);
        jScrollPane5.setViewportView(order_table);
        if (order_table.getColumnModel().getColumnCount() > 0) {
            order_table.getColumnModel().getColumn(0).setResizable(false);
            order_table.getColumnModel().getColumn(1).setResizable(false);
            order_table.getColumnModel().getColumn(2).setResizable(false);
            order_table.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel36.setBackground(new java.awt.Color(254, 247, 255));
        jPanel36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel66.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(52, 20, 101));
        jLabel66.setText("ALL");

        jLabel67.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(204, 0, 255));
        jLabel67.setText("123");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel66)
                .addGap(18, 18, 18)
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel37.setBackground(new java.awt.Color(254, 247, 255));
        jPanel37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel68.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(204, 204, 204));
        jLabel68.setText("PROCESSING");

        jLabel69.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(204, 204, 204));
        jLabel69.setText("23");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel68)
                .addGap(18, 18, 18)
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jPanel38.setBackground(new java.awt.Color(254, 247, 255));
        jPanel38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel70.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(204, 204, 204));
        jLabel70.setText("SUCCESSFUL");

        jLabel71.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(204, 204, 204));
        jLabel71.setText("100");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        order_export_btn.setBackground(new java.awt.Color(192, 234, 192));
        order_export_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel72.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(18, 99, 45));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("Export");

        javax.swing.GroupLayout order_export_btnLayout = new javax.swing.GroupLayout(order_export_btn);
        order_export_btn.setLayout(order_export_btnLayout);
        order_export_btnLayout.setHorizontalGroup(
            order_export_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_export_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        order_export_btnLayout.setVerticalGroup(
            order_export_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        order_new_btn.setBackground(new java.awt.Color(153, 204, 255));
        order_new_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order_new_btnMouseClicked(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 51, 204));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("New");
        jLabel73.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout order_new_btnLayout = new javax.swing.GroupLayout(order_new_btn);
        order_new_btn.setLayout(order_new_btnLayout);
        order_new_btnLayout.setHorizontalGroup(
            order_new_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_new_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        order_new_btnLayout.setVerticalGroup(
            order_new_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        order_edit_btn.setBackground(new java.awt.Color(187, 187, 252));
        order_edit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                order_edit_btnMouseClicked(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(102, 51, 255));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("Edit");
        jLabel74.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout order_edit_btnLayout = new javax.swing.GroupLayout(order_edit_btn);
        order_edit_btn.setLayout(order_edit_btnLayout);
        order_edit_btnLayout.setHorizontalGroup(
            order_edit_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_edit_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        order_edit_btnLayout.setVerticalGroup(
            order_edit_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        order_delete_btn.setBackground(new java.awt.Color(245, 184, 184));

        jLabel75.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 51, 51));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("Delete");
        jLabel75.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout order_delete_btnLayout = new javax.swing.GroupLayout(order_delete_btn);
        order_delete_btn.setLayout(order_delete_btnLayout);
        order_delete_btnLayout.setHorizontalGroup(
            order_delete_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(order_delete_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        order_delete_btnLayout.setVerticalGroup(
            order_delete_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        order_intake_btn.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        order_intake_btn.setForeground(new java.awt.Color(255, 102, 0));
        order_intake_btn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        order_intake_btn.setText("Intake");
        order_intake_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 191, 97), 5, true));
        order_intake_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        order_intake_btn.setFocusCycleRoot(true);

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addComponent(order_export_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(order_new_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(order_edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(order_delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 388, Short.MAX_VALUE)
                                .addComponent(order_intake_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5)
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 487, Short.MAX_VALUE)
                                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator6))
                    .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(order_new_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(order_export_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(order_edit_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(order_delete_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(order_intake_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout Workspace_ordersLayout = new javax.swing.GroupLayout(Workspace_orders);
        Workspace_orders.setLayout(Workspace_ordersLayout);
        Workspace_ordersLayout.setHorizontalGroup(
            Workspace_ordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Workspace_ordersLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        Workspace_ordersLayout.setVerticalGroup(
            Workspace_ordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Workspace_ordersLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Workspace_promotions.setBackground(new java.awt.Color(222, 221, 221));
        Workspace_promotions.setPreferredSize(new java.awt.Dimension(1300, 830));

        jPanel43.setBackground(new java.awt.Color(254, 247, 255));
        jPanel43.setPreferredSize(new java.awt.Dimension(1220, 790));

        jLabel76.setFont(new java.awt.Font("Myriad Pro Light", 1, 24)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(41, 16, 78));
        jLabel76.setText("MY PROMOTION");

        jPanel44.setBackground(new java.awt.Color(221, 220, 220));

        jLabel77.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 16)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(102, 102, 102));
        jLabel77.setText("Promo ID:");

        jTextField7.setBackground(new java.awt.Color(221, 220, 220));
        jTextField7.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(27, 27, 27));
        jTextField7.setBorder(null);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        icon_search_promo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_search_promo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon_search_promo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(icon_search_promo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        promotion_table.setBackground(new java.awt.Color(254, 247, 255));
        promotion_table.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        promotion_table.setForeground(new java.awt.Color(51, 51, 51));
        promotion_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"KMT5COCA", "Coca Giam Gia 10%", "All", null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Promo ID", "Name", "Customer", "Promotion", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        promotion_table.setFocusable(false);
        promotion_table.setGridColor(new java.awt.Color(254, 247, 255));
        promotion_table.setRowHeight(70);
        promotion_table.setRowMargin(0);
        promotion_table.setSelectionBackground(new java.awt.Color(182, 93, 255));
        promotion_table.setShowHorizontalLines(false);
        promotion_table.setShowVerticalLines(false);
        promotion_table.getTableHeader().setReorderingAllowed(false);
        promotion_table.setVerifyInputWhenFocusTarget(false);
        jScrollPane6.setViewportView(promotion_table);
        if (promotion_table.getColumnModel().getColumnCount() > 0) {
            promotion_table.getColumnModel().getColumn(0).setResizable(false);
            promotion_table.getColumnModel().getColumn(1).setResizable(false);
            promotion_table.getColumnModel().getColumn(2).setResizable(false);
            promotion_table.getColumnModel().getColumn(3).setResizable(false);
            promotion_table.getColumnModel().getColumn(4).setResizable(false);
        }

        promo_view_btn.setBackground(new java.awt.Color(233, 195, 252));
        promo_view_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel84.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(204, 0, 255));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("View");

        javax.swing.GroupLayout promo_view_btnLayout = new javax.swing.GroupLayout(promo_view_btn);
        promo_view_btn.setLayout(promo_view_btnLayout);
        promo_view_btnLayout.setHorizontalGroup(
            promo_view_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(promo_view_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        promo_view_btnLayout.setVerticalGroup(
            promo_view_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        promo_new_btn.setBackground(new java.awt.Color(153, 204, 255));
        promo_new_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                promo_new_btnMouseClicked(evt);
            }
        });

        jLabel85.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(0, 51, 204));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("New");
        jLabel85.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout promo_new_btnLayout = new javax.swing.GroupLayout(promo_new_btn);
        promo_new_btn.setLayout(promo_new_btnLayout);
        promo_new_btnLayout.setHorizontalGroup(
            promo_new_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(promo_new_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        promo_new_btnLayout.setVerticalGroup(
            promo_new_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        promo_edit_btn.setBackground(new java.awt.Color(187, 187, 252));
        promo_edit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                promo_edit_btnMouseClicked(evt);
            }
        });

        jLabel86.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(102, 51, 255));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("Edit");
        jLabel86.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout promo_edit_btnLayout = new javax.swing.GroupLayout(promo_edit_btn);
        promo_edit_btn.setLayout(promo_edit_btnLayout);
        promo_edit_btnLayout.setHorizontalGroup(
            promo_edit_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(promo_edit_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        promo_edit_btnLayout.setVerticalGroup(
            promo_edit_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        promo_delete_btn.setBackground(new java.awt.Color(245, 184, 184));

        jLabel87.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 51, 51));
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("Delete");
        jLabel87.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout promo_delete_btnLayout = new javax.swing.GroupLayout(promo_delete_btn);
        promo_delete_btn.setLayout(promo_delete_btnLayout);
        promo_delete_btnLayout.setHorizontalGroup(
            promo_delete_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(promo_delete_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        promo_delete_btnLayout.setVerticalGroup(
            promo_delete_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel16.setBackground(new java.awt.Color(241, 223, 253));

        jLabel40.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(51, 51, 51));
        jLabel40.setText("Current Promotion");

        jLabel41.setFont(new java.awt.Font("iCiel Panton Black Italic", 0, 45)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 0, 204));
        jLabel41.setText("GREAT SAVING !!!");

        jLabel42.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 0, 255));
        jLabel42.setText("MAY 10 - JULY 15");
        jLabel42.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel43.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(75, 23, 128));
        jLabel43.setText("Status:");

        jLabel44.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(161, 7, 114));
        jLabel44.setText("ACTIVATED");

        jLabel45.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(75, 23, 128));
        jLabel45.setText("Promo:");

        jLabel46.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(75, 23, 128));
        jLabel46.setText("8");
        jLabel46.setAutoscrolls(true);

        jLabel47.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(184, 0, 255));
        jLabel47.setText("Set current promotion");
        jLabel47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42))
                    .addComponent(jSeparator2)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel48.setFont(new java.awt.Font("iCiel Gotham Ultra", 0, 24)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(51, 51, 51));
        jLabel48.setText("PROMO-CODE");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addComponent(promo_view_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(promo_new_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(promo_edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(promo_delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(icon_promocode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addComponent(icon_promocode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(promo_new_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(promo_view_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(promo_edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(promo_delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout Workspace_promotionsLayout = new javax.swing.GroupLayout(Workspace_promotions);
        Workspace_promotions.setLayout(Workspace_promotionsLayout);
        Workspace_promotionsLayout.setHorizontalGroup(
            Workspace_promotionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Workspace_promotionsLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        Workspace_promotionsLayout.setVerticalGroup(
            Workspace_promotionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Workspace_promotionsLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Workspace_membership.setBackground(new java.awt.Color(222, 221, 221));
        Workspace_membership.setPreferredSize(new java.awt.Dimension(1300, 830));

        jPanel52.setBackground(new java.awt.Color(254, 247, 255));
        jPanel52.setPreferredSize(new java.awt.Dimension(1220, 790));

        jLabel88.setFont(new java.awt.Font("Myriad Pro Light", 1, 24)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(41, 16, 78));
        jLabel88.setText("MEMBERSHIP");

        jPanel53.setBackground(new java.awt.Color(221, 220, 220));

        jLabel89.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 16)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(102, 102, 102));
        jLabel89.setText("Customer  ID:");
        jLabel89.setAutoscrolls(true);

        jTextField8.setBackground(new java.awt.Color(221, 220, 220));
        jTextField8.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(27, 27, 27));
        jTextField8.setBorder(null);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        icon_search_membership.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_search_membership.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel89)
                .addGap(10, 10, 10)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(icon_search_membership, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(icon_search_membership, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        membership_table.setBackground(new java.awt.Color(254, 247, 255));
        membership_table.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        membership_table.setForeground(new java.awt.Color(51, 51, 51));
        membership_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"12:30 12/05/21", "1233", "50000", "Phat", null},
                {"13:00 12/05/21", "1234", "43000", "Phuc", null},
                {"13:20 12/05/21", "1235", "120000", "Phuc", null},
                {"13:22 12/05/21", "1236", "10000", "Phuc", null},
                {"13:25 12/05/21", "1237", "12000", null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "First Name", "Full Name", "Rank", "Score"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        membership_table.setFocusable(false);
        membership_table.setGridColor(new java.awt.Color(254, 247, 255));
        membership_table.setRowHeight(70);
        membership_table.setRowMargin(0);
        membership_table.setSelectionBackground(new java.awt.Color(182, 93, 255));
        membership_table.setShowHorizontalLines(false);
        membership_table.setShowVerticalLines(false);
        membership_table.getTableHeader().setReorderingAllowed(false);
        membership_table.setVerifyInputWhenFocusTarget(false);
        jScrollPane7.setViewportView(membership_table);
        if (membership_table.getColumnModel().getColumnCount() > 0) {
            membership_table.getColumnModel().getColumn(0).setResizable(false);
            membership_table.getColumnModel().getColumn(1).setResizable(false);
            membership_table.getColumnModel().getColumn(2).setResizable(false);
            membership_table.getColumnModel().getColumn(3).setResizable(false);
            membership_table.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel54.setBackground(new java.awt.Color(254, 247, 255));
        jPanel54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel90.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(204, 204, 204));
        jLabel90.setText("Silver");

        jLabel91.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(204, 204, 204));
        jLabel91.setText("44");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_member_silver, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(icon_member_silver, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                        .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);

        member_view_btn.setBackground(new java.awt.Color(233, 195, 252));
        member_view_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel96.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(204, 0, 255));
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setText("View");

        javax.swing.GroupLayout member_view_btnLayout = new javax.swing.GroupLayout(member_view_btn);
        member_view_btn.setLayout(member_view_btnLayout);
        member_view_btnLayout.setHorizontalGroup(
            member_view_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(member_view_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        member_view_btnLayout.setVerticalGroup(
            member_view_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        member_new_btn.setBackground(new java.awt.Color(153, 204, 255));
        member_new_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                member_new_btnMouseClicked(evt);
            }
        });

        jLabel97.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(0, 51, 204));
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("New");
        jLabel97.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout member_new_btnLayout = new javax.swing.GroupLayout(member_new_btn);
        member_new_btn.setLayout(member_new_btnLayout);
        member_new_btnLayout.setHorizontalGroup(
            member_new_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(member_new_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        member_new_btnLayout.setVerticalGroup(
            member_new_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        member_edit_btn.setBackground(new java.awt.Color(187, 187, 252));
        member_edit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                member_edit_btnMouseClicked(evt);
            }
        });

        jLabel98.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(102, 51, 255));
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setText("Edit");
        jLabel98.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout member_edit_btnLayout = new javax.swing.GroupLayout(member_edit_btn);
        member_edit_btn.setLayout(member_edit_btnLayout);
        member_edit_btnLayout.setHorizontalGroup(
            member_edit_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(member_edit_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        member_edit_btnLayout.setVerticalGroup(
            member_edit_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        member_delete_btn.setBackground(new java.awt.Color(245, 184, 184));

        jLabel99.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 51, 51));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText("Delete");
        jLabel99.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout member_delete_btnLayout = new javax.swing.GroupLayout(member_delete_btn);
        member_delete_btn.setLayout(member_delete_btnLayout);
        member_delete_btnLayout.setHorizontalGroup(
            member_delete_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(member_delete_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        member_delete_btnLayout.setVerticalGroup(
            member_delete_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel70.setBackground(new java.awt.Color(254, 247, 255));
        jPanel70.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel112.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(204, 204, 204));
        jLabel112.setText("Gold");

        jLabel113.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(204, 204, 204));
        jLabel113.setText("4");

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_member_gold, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel112)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(icon_member_gold, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel112, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel113, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel71.setBackground(new java.awt.Color(254, 247, 255));
        jPanel71.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel114.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(51, 51, 51));
        jLabel114.setText("Normal");

        jLabel115.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(153, 83, 5));
        jLabel115.setText("123");
        jLabel115.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_member_normal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel114)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(icon_member_normal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel114, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel115, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addComponent(member_view_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(member_new_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(member_edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(member_delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 510, Short.MAX_VALUE)
                        .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addComponent(jPanel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addGap(32, 32, 32))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator11)
                    .addComponent(jPanel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator10)
                    .addComponent(jPanel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(member_new_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(member_view_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(member_edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(member_delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout Workspace_membershipLayout = new javax.swing.GroupLayout(Workspace_membership);
        Workspace_membership.setLayout(Workspace_membershipLayout);
        Workspace_membershipLayout.setHorizontalGroup(
            Workspace_membershipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Workspace_membershipLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        Workspace_membershipLayout.setVerticalGroup(
            Workspace_membershipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Workspace_membershipLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Workspace_users.setBackground(new java.awt.Color(222, 221, 221));
        Workspace_users.setPreferredSize(new java.awt.Dimension(1300, 830));

        jPanel61.setBackground(new java.awt.Color(254, 247, 255));
        jPanel61.setPreferredSize(new java.awt.Dimension(1220, 790));

        jLabel100.setFont(new java.awt.Font("Myriad Pro Light", 1, 24)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(41, 16, 78));
        jLabel100.setText("USER MANAGEMENT");

        jPanel62.setBackground(new java.awt.Color(221, 220, 220));

        jLabel101.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 16)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(102, 102, 102));
        jLabel101.setText("User ID:");

        jTextField9.setBackground(new java.awt.Color(221, 220, 220));
        jTextField9.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(27, 27, 27));
        jTextField9.setBorder(null);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        icon_search_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_search_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon_search_user, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel62Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(icon_search_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        user_table.setBackground(new java.awt.Color(254, 247, 255));
        user_table.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        user_table.setForeground(new java.awt.Color(51, 51, 51));
        user_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"12:30 12/05/21", "1233", null, null, null, null, "Phat", null, "50000"},
                {"13:00 12/05/21", "1234", null, null, null, null, "Phuc", null, "43000"},
                {"13:20 12/05/21", "1235", null, null, null, null, "Phuc", null, "120000"},
                {"13:22 12/05/21", "1236", null, null, null, null, "Phuc", null, "10000"},
                {"13:25 12/05/21", "1237", null, null, null, null, null, null, "12000"},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "User ID", "First Name", "Last Name", "Birthdate", "Adress", "Phone Number", "Password", "Salary", "Position"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        user_table.setFocusable(false);
        user_table.setGridColor(new java.awt.Color(254, 247, 255));
        user_table.setRowHeight(70);
        user_table.setRowMargin(0);
        user_table.setSelectionBackground(new java.awt.Color(182, 93, 255));
        user_table.setShowHorizontalLines(false);
        user_table.setShowVerticalLines(false);
        user_table.getTableHeader().setReorderingAllowed(false);
        user_table.setVerifyInputWhenFocusTarget(false);
        jScrollPane8.setViewportView(user_table);
        if (user_table.getColumnModel().getColumnCount() > 0) {
            user_table.getColumnModel().getColumn(0).setResizable(false);
            user_table.getColumnModel().getColumn(1).setResizable(false);
            user_table.getColumnModel().getColumn(2).setResizable(false);
            user_table.getColumnModel().getColumn(3).setResizable(false);
            user_table.getColumnModel().getColumn(4).setResizable(false);
            user_table.getColumnModel().getColumn(4).setHeaderValue("Adress");
            user_table.getColumnModel().getColumn(5).setResizable(false);
            user_table.getColumnModel().getColumn(5).setHeaderValue("Phone Number");
            user_table.getColumnModel().getColumn(6).setResizable(false);
            user_table.getColumnModel().getColumn(6).setHeaderValue("Password");
            user_table.getColumnModel().getColumn(7).setResizable(false);
            user_table.getColumnModel().getColumn(7).setHeaderValue("Salary");
            user_table.getColumnModel().getColumn(8).setResizable(false);
            user_table.getColumnModel().getColumn(8).setHeaderValue("Position");
        }

        user_view_btn.setBackground(new java.awt.Color(233, 195, 252));
        user_view_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel108.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(204, 0, 255));
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel108.setText("View");

        javax.swing.GroupLayout user_view_btnLayout = new javax.swing.GroupLayout(user_view_btn);
        user_view_btn.setLayout(user_view_btnLayout);
        user_view_btnLayout.setHorizontalGroup(
            user_view_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_view_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        user_view_btnLayout.setVerticalGroup(
            user_view_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        user_new_btn.setBackground(new java.awt.Color(153, 204, 255));
        user_new_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_new_btnMouseClicked(evt);
            }
        });

        jLabel109.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(0, 51, 204));
        jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel109.setText("New");
        jLabel109.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout user_new_btnLayout = new javax.swing.GroupLayout(user_new_btn);
        user_new_btn.setLayout(user_new_btnLayout);
        user_new_btnLayout.setHorizontalGroup(
            user_new_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_new_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        user_new_btnLayout.setVerticalGroup(
            user_new_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        user_edit_btn.setBackground(new java.awt.Color(187, 187, 252));
        user_edit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_edit_btnMouseClicked(evt);
            }
        });

        jLabel110.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(102, 51, 255));
        jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel110.setText("Edit");
        jLabel110.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout user_edit_btnLayout = new javax.swing.GroupLayout(user_edit_btn);
        user_edit_btn.setLayout(user_edit_btnLayout);
        user_edit_btnLayout.setHorizontalGroup(
            user_edit_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_edit_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel110, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        user_edit_btnLayout.setVerticalGroup(
            user_edit_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel110, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        user_delete_btn.setBackground(new java.awt.Color(245, 184, 184));

        jLabel111.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 51, 51));
        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText("Delete");
        jLabel111.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout user_delete_btnLayout = new javax.swing.GroupLayout(user_delete_btn);
        user_delete_btn.setLayout(user_delete_btnLayout);
        user_delete_btnLayout.setHorizontalGroup(
            user_delete_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_delete_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        user_delete_btnLayout.setVerticalGroup(
            user_delete_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(242, 224, 255));

        icon_user_image.setBackground(new java.awt.Color(254, 247, 255));

        jLabel50.setFont(new java.awt.Font("iCiel Gotham Ultra", 0, 40)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(102, 0, 204));
        jLabel50.setText("Pedro Scott");

        jLabel51.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(51, 51, 51));
        jLabel51.setText("DEVELOPER");

        jLabel52.setFont(new java.awt.Font("Myriad Pro Light", 1, 20)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(51, 51, 51));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("nguyenquangphuoc2465@gmail.com");
        jLabel52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel53.setFont(new java.awt.Font("Myriad Pro Light", 1, 20)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(204, 0, 204));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("Update your info.");
        jLabel53.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel54.setFont(new java.awt.Font("Myriad Pro Light", 1, 20)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(51, 51, 51));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("0981325542");
        jLabel54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(icon_user_image, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel52))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(550, 550, 550)
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(35, 35, 35))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_user_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel51)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addComponent(user_view_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(user_new_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(user_edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(user_delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel61Layout.createSequentialGroup()
                        .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane8)
                            .addGroup(jPanel61Layout.createSequentialGroup()
                                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))))
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user_new_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_view_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout Workspace_usersLayout = new javax.swing.GroupLayout(Workspace_users);
        Workspace_users.setLayout(Workspace_usersLayout);
        Workspace_usersLayout.setHorizontalGroup(
            Workspace_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Workspace_usersLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        Workspace_usersLayout.setVerticalGroup(
            Workspace_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Workspace_usersLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Workspace_provider.setBackground(new java.awt.Color(222, 221, 221));
        Workspace_provider.setPreferredSize(new java.awt.Dimension(1300, 830));

        jPanel63.setBackground(new java.awt.Color(254, 247, 255));
        jPanel63.setPreferredSize(new java.awt.Dimension(1220, 790));

        jLabel102.setFont(new java.awt.Font("Myriad Pro Light", 1, 24)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(41, 16, 78));
        jLabel102.setText("PROVIDER MANAGEMENT");

        jPanel64.setBackground(new java.awt.Color(221, 220, 220));

        jLabel103.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 16)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(102, 102, 102));
        jLabel103.setText("Provider ID:");

        jTextField10.setBackground(new java.awt.Color(221, 220, 220));
        jTextField10.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(27, 27, 27));
        jTextField10.setBorder(null);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        icon_search_provider.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_search_provider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon_search_provider, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel64Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(icon_search_provider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        provider_table.setBackground(new java.awt.Color(254, 247, 255));
        provider_table.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 18)); // NOI18N
        provider_table.setForeground(new java.awt.Color(51, 51, 51));
        provider_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"12:30 12/05/21", "1233", null, null},
                {"13:00 12/05/21", "1234", null, null},
                {"13:20 12/05/21", "1235", null, null},
                {"13:22 12/05/21", "1236", null, null},
                {"13:25 12/05/21", "1237", null, null},
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
                "Provider Id", "Provider Name", "Numberphone", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        provider_table.setFocusable(false);
        provider_table.setGridColor(new java.awt.Color(254, 247, 255));
        provider_table.setRowHeight(70);
        provider_table.setRowMargin(0);
        provider_table.setSelectionBackground(new java.awt.Color(182, 93, 255));
        provider_table.setShowHorizontalLines(false);
        provider_table.setShowVerticalLines(false);
        provider_table.getTableHeader().setReorderingAllowed(false);
        provider_table.setVerifyInputWhenFocusTarget(false);
        jScrollPane9.setViewportView(provider_table);
        if (provider_table.getColumnModel().getColumnCount() > 0) {
            provider_table.getColumnModel().getColumn(0).setResizable(false);
            provider_table.getColumnModel().getColumn(1).setResizable(false);
            provider_table.getColumnModel().getColumn(2).setResizable(false);
            provider_table.getColumnModel().getColumn(3).setResizable(false);
        }

        provider_view_btn.setBackground(new java.awt.Color(233, 195, 252));
        provider_view_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel116.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(204, 0, 255));
        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel116.setText("View");

        javax.swing.GroupLayout provider_view_btnLayout = new javax.swing.GroupLayout(provider_view_btn);
        provider_view_btn.setLayout(provider_view_btnLayout);
        provider_view_btnLayout.setHorizontalGroup(
            provider_view_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(provider_view_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel116, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        provider_view_btnLayout.setVerticalGroup(
            provider_view_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel116, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        provider_new_btn.setBackground(new java.awt.Color(153, 204, 255));
        provider_new_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                provider_new_btnMouseClicked(evt);
            }
        });

        jLabel117.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(0, 51, 204));
        jLabel117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel117.setText("New");
        jLabel117.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout provider_new_btnLayout = new javax.swing.GroupLayout(provider_new_btn);
        provider_new_btn.setLayout(provider_new_btnLayout);
        provider_new_btnLayout.setHorizontalGroup(
            provider_new_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(provider_new_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel117, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        provider_new_btnLayout.setVerticalGroup(
            provider_new_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel117, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        provider_edit_btn.setBackground(new java.awt.Color(187, 187, 252));
        provider_edit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                provider_edit_btnMouseClicked(evt);
            }
        });

        jLabel118.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(102, 51, 255));
        jLabel118.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel118.setText("Edit");
        jLabel118.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout provider_edit_btnLayout = new javax.swing.GroupLayout(provider_edit_btn);
        provider_edit_btn.setLayout(provider_edit_btnLayout);
        provider_edit_btnLayout.setHorizontalGroup(
            provider_edit_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(provider_edit_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel118, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        provider_edit_btnLayout.setVerticalGroup(
            provider_edit_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel118, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        provider_delete_btn.setBackground(new java.awt.Color(245, 184, 184));

        jLabel119.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 20)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(255, 51, 51));
        jLabel119.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel119.setText("Delete");
        jLabel119.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout provider_delete_btnLayout = new javax.swing.GroupLayout(provider_delete_btn);
        provider_delete_btn.setLayout(provider_delete_btnLayout);
        provider_delete_btnLayout.setHorizontalGroup(
            provider_delete_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(provider_delete_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel119, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        provider_delete_btnLayout.setVerticalGroup(
            provider_delete_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel119, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel63Layout.createSequentialGroup()
                        .addComponent(provider_view_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(provider_new_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(provider_edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(provider_delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 558, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel63Layout.createSequentialGroup()
                        .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane9)
                            .addGroup(jPanel63Layout.createSequentialGroup()
                                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))))
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel63Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(231, 231, 231)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(provider_new_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(provider_view_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(provider_edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(provider_delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout Workspace_providerLayout = new javax.swing.GroupLayout(Workspace_provider);
        Workspace_provider.setLayout(Workspace_providerLayout);
        Workspace_providerLayout.setHorizontalGroup(
            Workspace_providerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Workspace_providerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        Workspace_providerLayout.setVerticalGroup(
            Workspace_providerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Workspace_providerLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Workspace_base, javax.swing.GroupLayout.DEFAULT_SIZE, 1302, Short.MAX_VALUE)
                    .addComponent(Navigator, javax.swing.GroupLayout.DEFAULT_SIZE, 1302, Short.MAX_VALUE)
                    .addComponent(Workspace_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 1302, Short.MAX_VALUE)
                    .addComponent(Workspace_inventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Workspace_orders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Workspace_promotions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Workspace_membership, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Workspace_users, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Workspace_provider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(292, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Navigator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Workspace_inventory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Workspace_orders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Workspace_users, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Workspace_membership, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Workspace_promotions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Workspace_base, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Workspace_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Workspace_provider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(3404, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void icon_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_icon_closeMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void inven_new_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inven_new_btnMouseClicked
        product_win.show();
    }//GEN-LAST:event_inven_new_btnMouseClicked

    private void inven_edit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inven_edit_btnMouseClicked
        Form_Inventory inven1 = new Form_Inventory();
        inven1.show();
    }//GEN-LAST:event_inven_edit_btnMouseClicked

    private void order_edit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order_edit_btnMouseClicked
        Form_Order order1 = new Form_Order();
        order1.show();
    }//GEN-LAST:event_order_edit_btnMouseClicked

    private void promo_new_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_promo_new_btnMouseClicked
        Form_Promotion promo1 = new Form_Promotion();
        promo1.show();
    }//GEN-LAST:event_promo_new_btnMouseClicked

    private void promo_edit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_promo_edit_btnMouseClicked
        Form_Promotion promo1 = new Form_Promotion();
        promo1.show();
    }//GEN-LAST:event_promo_edit_btnMouseClicked

    private void member_new_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_new_btnMouseClicked
        Form_Membership member1 = new Form_Membership();
        member1.show();
    }//GEN-LAST:event_member_new_btnMouseClicked

    private void member_edit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_member_edit_btnMouseClicked
        Form_Membership member1 = new Form_Membership();
        member1.show();
    }//GEN-LAST:event_member_edit_btnMouseClicked

    private void user_new_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_new_btnMouseClicked
        Form_User user1 = new Form_User();
        user1.show();
    }//GEN-LAST:event_user_new_btnMouseClicked

    private void user_edit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_edit_btnMouseClicked
        Form_User user1 = new Form_User();
        user1.show();
    }//GEN-LAST:event_user_edit_btnMouseClicked

    private void order_new_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_order_new_btnMouseClicked
        Form_Order order1 = new Form_Order();
        order1.show();
    }//GEN-LAST:event_order_new_btnMouseClicked

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void provider_new_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_provider_new_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_provider_new_btnMouseClicked

    private void provider_edit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_provider_edit_btnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_provider_edit_btnMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Navigator;
    private javax.swing.JPanel Workspace_base;
    private javax.swing.JPanel Workspace_dashboard;
    private javax.swing.JPanel Workspace_inventory;
    private javax.swing.JPanel Workspace_membership;
    private javax.swing.JPanel Workspace_orders;
    private javax.swing.JPanel Workspace_promotions;
    private javax.swing.JPanel Workspace_provider;
    private javax.swing.JPanel Workspace_users;
    private javax.swing.JLabel base_bg;
    private javax.swing.JLabel dashboard_logo;
    private javax.swing.JTable dashboard_table;
    private javax.swing.JLabel icon_close;
    private javax.swing.JLabel icon_member_gold;
    private javax.swing.JLabel icon_member_normal;
    private javax.swing.JLabel icon_member_silver;
    private javax.swing.JLabel icon_menu_dashboard;
    private javax.swing.JLabel icon_menu_inventory;
    private javax.swing.JLabel icon_menu_membership;
    private javax.swing.JLabel icon_menu_orders;
    private javax.swing.JLabel icon_menu_promotions;
    private javax.swing.JLabel icon_menu_users;
    private javax.swing.JLabel icon_promocode;
    private javax.swing.JLabel icon_sales_db;
    private javax.swing.JLabel icon_search_db;
    private javax.swing.JLabel icon_search_membership;
    private javax.swing.JLabel icon_search_order;
    private javax.swing.JLabel icon_search_promo;
    private javax.swing.JLabel icon_search_provider;
    private javax.swing.JLabel icon_search_user;
    private javax.swing.JLabel icon_user_dashboard;
    private javax.swing.JLabel icon_user_image;
    private javax.swing.JPanel inven_delete_btn;
    private javax.swing.JPanel inven_edit_btn;
    private javax.swing.JPanel inven_export_btn;
    private javax.swing.JPanel inven_new_btn;
    private javax.swing.JTable inventory_table;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel member_delete_btn;
    private javax.swing.JPanel member_edit_btn;
    private javax.swing.JPanel member_new_btn;
    private javax.swing.JPanel member_view_btn;
    private javax.swing.JTable membership_table;
    private javax.swing.JPanel menu_dashboard;
    private javax.swing.JPanel menu_gotopos;
    private javax.swing.JPanel menu_inventory;
    private javax.swing.JPanel menu_membership;
    private javax.swing.JPanel menu_orders;
    private javax.swing.JPanel menu_promotion;
    private javax.swing.JPanel menu_users;
    private javax.swing.JLabel menuitems_1;
    private javax.swing.JLabel menuitems_2;
    private javax.swing.JLabel menuitems_3;
    private javax.swing.JLabel menuitems_4;
    private javax.swing.JLabel menuitems_5;
    private javax.swing.JLabel menuitems_6;
    private javax.swing.JPanel order_delete_btn;
    private javax.swing.JPanel order_edit_btn;
    private javax.swing.JPanel order_export_btn;
    private javax.swing.JLabel order_intake_btn;
    private javax.swing.JPanel order_new_btn;
    private javax.swing.JTable order_table;
    private javax.swing.JPanel promo_delete_btn;
    private javax.swing.JPanel promo_edit_btn;
    private javax.swing.JPanel promo_new_btn;
    private javax.swing.JPanel promo_view_btn;
    private javax.swing.JTable promotion_table;
    private javax.swing.JPanel provider_delete_btn;
    private javax.swing.JPanel provider_edit_btn;
    private javax.swing.JPanel provider_new_btn;
    private javax.swing.JTable provider_table;
    private javax.swing.JPanel provider_view_btn;
    private javax.swing.JPanel user_delete_btn;
    private javax.swing.JPanel user_edit_btn;
    private javax.swing.JPanel user_new_btn;
    private javax.swing.JTable user_table;
    private javax.swing.JPanel user_view_btn;
    // End of variables declaration//GEN-END:variables
}
