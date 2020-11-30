/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.MainJFrame;

/**
 *
 * @author 0
 */
public class CustomerManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerManagementJPanel
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    Enterprise restaurant;
    public CustomerManagementJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise restaurant) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.restaurant = restaurant;
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
        btnHealthInformation = new javax.swing.JButton();
        btnSign = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Please choose operation:");

        btnHealthInformation.setText("Health information");
        btnHealthInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHealthInformationActionPerformed(evt);
            }
        });

        btnSign.setText("Sign in Course");
        btnSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHealthInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(btnSign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(btnHealthInformation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSign)
                .addContainerGap(261, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHealthInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHealthInformationActionPerformed
        // TODO add your handling code here:
        if(userAccount.getRole().getType().equals("Customer")){
            CustomerWorkAreaJPanel customerWorkAreaJPanel = new CustomerWorkAreaJPanel(userProcessContainer, userAccount, restaurant);
            userProcessContainer.add("customerWorkAreaJPanel",customerWorkAreaJPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else{
            VIPCustomerWorkAreaJPanel vipCustomerWorkAreaJPanel = new VIPCustomerWorkAreaJPanel(userProcessContainer, userAccount,restaurant);
            userProcessContainer.add("vipCustomerWorkAreaJPanel",vipCustomerWorkAreaJPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnHealthInformationActionPerformed

    private void btnSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignActionPerformed
        if (MainJFrame.userAccount.customer==null) {
            JOptionPane.showMessageDialog(null, "You have not input cunstomer info");
            return;
        }
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add("workArea",new CourseRecordJPanel(this.userProcessContainer));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHealthInformation;
    private javax.swing.JButton btnSign;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
