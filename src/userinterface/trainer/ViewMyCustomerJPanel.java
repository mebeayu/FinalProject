/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.trainer;

import Business.Logic.RecDic;
import Business.Logic.TraDic;
import Business.Logic.UserDic;
import Business.Models.User;
import Business.Models.VipCustomer;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.MainJFrame;

/**
 *
 * @author Administrator
 */
public class ViewMyCustomerJPanel extends javax.swing.JPanel {

    JPanel container;
    /**
     * Creates new form ViewMyCustomerJPanel
     */
    public ViewMyCustomerJPanel(JPanel container) {
        initComponents();
        this.container = container;
        LoadData();
    }
    public void LoadData(){
        
        List<VipCustomer> list = TraDic.GetMyCustomer(MainJFrame.userAccount.getUsername());
        String[] cols = new String[]{"UserName","Age","Sex","Height","Weight"};
        String[][] rows= new String[list.size()][5];
        for (int i = 0; i < list.size(); i++) {
            rows[i][0] = list.get(i).username;
            
            rows[i][1] = list.get(i).Age;
            rows[i][2] = list.get(i).Sex;
            rows[i][3] = list.get(i).Height;
            rows[i][4] = list.get(i).Weight;
            //UserDic.GetUser(rows[i][0]);
            
        }
        DefaultTableModel tableModel = (DefaultTableModel)this.tableCustomer.getModel();
        tableModel.setDataVector(rows, cols);
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
        tableCustomer = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableCustomer);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addContainerGap(11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);  
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCustomer;
    // End of variables declaration//GEN-END:variables
}
