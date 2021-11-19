/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Restaurant.Dishes;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author ramcharan
 */
public class ManageMenu extends javax.swing.JPanel {

    /**
     * Creates new form ManageMenu
     */
     EcoSystem system;
     Dishes menu;
    JPanel userProcessContainer;
    UserAccount account;
    public ManageMenu(JPanel userProcessContainer,UserAccount account, EcoSystem system) {
        initComponents();
        this.account=account;
        this.system=system;
        this.userProcessContainer=userProcessContainer;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        amtTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        MenuTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        dishNameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        descTxt = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        addDishBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        energyTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Description:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 90, 30));

        amtTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amtTxtActionPerformed(evt);
            }
        });
        add(amtTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 100, -1));

        MenuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Dish Name", "Description", "Amount (in USD)", "Energy (in Kcal)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(MenuTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 700, 100));

        jLabel2.setText("Dish Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 266, -1, 20));

        dishNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dishNameTxtActionPerformed(evt);
            }
        });
        add(dishNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 100, -1));

        jLabel3.setText("Amount(in USD) :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 120, 30));

        descTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descTxtActionPerformed(evt);
            }
        });
        add(descTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 100, -1));

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        backBtn.setText("<<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        addDishBtn.setText("Add Dish");
        addDishBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDishBtnActionPerformed(evt);
            }
        });
        add(addDishBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, -1, -1));
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, -1, -1));

        energyTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                energyTxtActionPerformed(evt);
            }
        });
        add(energyTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 100, 30));

        jLabel5.setText("Energy (in Kcal):");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void amtTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amtTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amtTxtActionPerformed

    private void dishNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dishNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dishNameTxtActionPerformed

    private void descTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descTxtActionPerformed

    private void addDishBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDishBtnActionPerformed
        // TODO add your handling code here:
        String name=dishNameTxt.getText();
        String desc=descTxt.getText();
        String amount=amtTxt.getText();
        int energy =Integer.parseInt(energyTxt.getText());
       
        
         try {
             if(name==null || name.isEmpty()){
                throw new NullPointerException(" Name field is Empty");
                
                
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, " Name is Empty");
           
            return;
            
        }
        
        try {
             if(desc==null || desc.isEmpty()){
                throw new NullPointerException("Description  field is Empty");
                
                
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Description is Empty");
           
            return;
            
        }
        
         try {
             
            if(amount==null || amount.isEmpty()){
                throw new NullPointerException("amount field is Empty");
            }else if(Pattern.matches("^[0-9]{0,3}$", amount)==false){
                throw new Exception("Invalid amount (Enter 0-3 Digits)");
            }
            
            
        }  catch(NullPointerException e){
             JOptionPane.showMessageDialog(null, "amount is Empty");
            
             
             return;
        }catch (Exception e) {
             JOptionPane.showMessageDialog(null, "amount is of invalid pattern");
             
             
             return;
        }
        
        
        
        for(Restaurant restro:system.getRestaurantDirectory().getRestaurantList()){
           if(restro.getAdminUName().equals(account.getUsername())){
                menu=system.getRestaurantDirectory().AddMenuDishes(restro,name, desc, Double.parseDouble(amount), energy);
            }   
        }
        
        dishNameTxt.setText("");
        descTxt.setText("");
        amtTxt.setText("");
        energyTxt.setText("");
        populateTable();
        
    }//GEN-LAST:event_addDishBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = MenuTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                
                for(Restaurant restro:system.getRestaurantDirectory().getRestaurantList()){
                    if(restro.getAdminUName().equals(account.getUsername())){
                        system.getRestaurantDirectory().DeleteDishes(restro, menu);
                    }   
                }
                populateTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this); 
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void energyTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_energyTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_energyTxtActionPerformed
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) MenuTable.getModel();
        
        model.setRowCount(0);
        
       
        for (Restaurant restro:system.getRestaurantDirectory().getRestaurantList()) {
           
            if (restro.getAdminUName().equals(account.getUsername())) {
                
               for(Dishes menu:restro.getMenu()){
                Object[] row = new Object[4];
                row[0] = menu.getName();
                row[1] = menu.getDescription();
                row[2] = menu.getPrice();
                row[3] = menu.getDishEnergy();
                model.addRow(row);
               }
                
            }
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MenuTable;
    private javax.swing.JButton addDishBtn;
    private javax.swing.JTextField amtTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField descTxt;
    private javax.swing.JTextField dishNameTxt;
    private javax.swing.JTextField energyTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
