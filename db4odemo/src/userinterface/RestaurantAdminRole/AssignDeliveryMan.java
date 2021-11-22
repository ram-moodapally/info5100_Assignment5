/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Order.Order;
import static Business.Organization.Type.DeliveryMan;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ramcharan
 */
public class AssignDeliveryMan extends javax.swing.JPanel {

    /**
     * Creates new form AssignDeliveryMan
     */
    
    private JPanel userProcessContainer;
    private UserAccount account;
    Order order;
    EcoSystem system;

    public AssignDeliveryMan(JPanel userProcessContainer, UserAccount account, Order order, EcoSystem system) {
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.order = order;
        this.system = system;
        initComponents();
        populateNetworkTable();
    }
    private void populateNetworkTable() {
        jLabel1.setText("Order ID:"+order.getOrder_id());
        DefaultTableModel model = (DefaultTableModel) DeliveryManJTable.getModel();
        
        model.setRowCount(0);
        
        for(DeliveryMan deliveryMan1:system.getDeliveryManDirectory().getDeliveryManList()){
               Object[] row = new Object[1];
               
                row[0] = deliveryMan1;
                
                
                model.addRow(row);
            }
       /* 
       // for()
        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {
            System.out.println(user.getRole().getClass().getName());
            if ("Business.Role.DeliverManRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[1];
               
                row[0] = user.getName();
                
                
                model.addRow(row);
            }
            
        }*/
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        DeliveryManJTable = new javax.swing.JTable();
        AssignOrderBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeliveryManJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DeliveryManJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 404, 91));

        AssignOrderBtn.setText("Assign Order");
        AssignOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignOrderBtnActionPerformed(evt);
            }
        });
        add(AssignOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 130, 30));

        BackBtn.setText("<< Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel1.setText("Available deliver person");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void AssignOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignOrderBtnActionPerformed
        int selectedRow = DeliveryManJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            
            DeliveryMan deliveryMan  = (DeliveryMan)DeliveryManJTable.getValueAt(selectedRow, 0);   
            deliveryMan.getOrderList().add(order);
            order.setStatus("Assign to Deliveryman");
            
            for(Customer cust:system.getCustomerDirectory().getCustList()){
            if(order.getCustomerName().equals(cust.getUserName())){
                for(Order order : cust.getOrderList()){
                    order.setStatus("Assign to Deliveryman");
                }
            }
        }
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
            
        }
    }//GEN-LAST:event_AssignOrderBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignOrderBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JTable DeliveryManJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
