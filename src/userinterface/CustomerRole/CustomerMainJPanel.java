/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.MainJFrame;

/**
 *
 * @author Administrator
 */
public class CustomerMainJPanel extends javax.swing.JPanel {

    JPanel container;
    /**
     * Creates new form CustomerMainJPanel
     */
    public CustomerMainJPanel(JPanel container) {
        initComponents();
        this.container = container;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSign = new javax.swing.JButton();
        btnHealthInformation = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btnSign.setText("Sign in Course");
        btnSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignActionPerformed(evt);
            }
        });

        btnHealthInformation.setText("Health information");
        btnHealthInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHealthInformationActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Please choose operation:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHealthInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(btnSign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(btnHealthInformation)
                .addGap(18, 18, 18)
                .addComponent(btnSign)
                .addContainerGap(360, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignActionPerformed
       CardLayout layout=(CardLayout)container.getLayout();
        container.add("workArea",new CourseRecordJPanel(this.container));
        layout.next(container);
    }//GEN-LAST:event_btnSignActionPerformed

    private void btnHealthInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHealthInformationActionPerformed
        // TODO add your handling code here:
        if(MainJFrame.userAccount.getRole().getType().equals("Customer")){
            CustomerWorkAreaJPanel customerWorkAreaJPanel = new CustomerWorkAreaJPanel(container, MainJFrame.userAccount, MainJFrame.userAccount.Enterprise);
            container.add("customerWorkAreaJPanel",customerWorkAreaJPanel);
            CardLayout layout=(CardLayout)container.getLayout();
            layout.next(container);
        }
        else{
            VIPCustomerWorkAreaJPanel vipCustomerWorkAreaJPanel = new VIPCustomerWorkAreaJPanel(container, MainJFrame.userAccount,MainJFrame.userAccount.Enterprise);
            container.add("vipCustomerWorkAreaJPanel",vipCustomerWorkAreaJPanel);
            CardLayout layout=(CardLayout)container.getLayout();
            layout.next(container);
        }
    }//GEN-LAST:event_btnHealthInformationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHealthInformation;
    private javax.swing.JButton btnSign;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
