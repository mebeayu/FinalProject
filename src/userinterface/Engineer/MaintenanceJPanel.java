/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Engineer;

import Business.Logic.EngDic;
import Business.Models.Equipment;
import Business.Models.Maintenance;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.MainJFrame;

/**
 *
 * @author 27246
 */
public class MaintenanceJPanel extends javax.swing.JPanel {

    private JPanel container;
    String Enterprise;
    /**
     * Creates new form MaintenanceJPanel
     */
    public MaintenanceJPanel(JPanel container) {
        initComponents();
        this.container = container;
        Enterprise =  MainJFrame.userAccount.Enterprise.getName();
        LoadE();
        LoadData();
    }
    public void LoadE(){
        List<Equipment> list = EngDic.QueryEquipment(Enterprise);
        for (int i = 0; i < list.size(); i++) {
            this.comEquipment.addItem(list.get(i));
        }
    }
    public void LoadData(){
        List<Maintenance> list = EngDic.QueryMaintenance(Enterprise);
        DefaultTableModel tableModel = (DefaultTableModel)this.tableMaintenance.getModel();
        String[] cols = new String[]{"ID","Equipment Name","Reason","Time","Status"};
        String[][] rows= new String[list.size()][5];
        for (int i = 0; i < list.size(); i++) {
            rows[i][0] = list.get(i).ID;
            rows[i][1] = list.get(i).EquipmentName;
            rows[i][2] = list.get(i).Reason;
            rows[i][3] = list.get(i).AddTime;
            rows[i][4] = list.get(i).Status;
        }
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

        jLabel1 = new javax.swing.JLabel();
        comEquipment = new javax.swing.JComboBox<Equipment>();
        jLabel2 = new javax.swing.JLabel();
        txtReason = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMaintenance = new javax.swing.JTable();
        btnComplete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        jLabel1.setText("Equipment:");

        comEquipment.setModel(new javax.swing.DefaultComboBoxModel<Equipment>());

        jLabel2.setText("Reason:");

        tableMaintenance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableMaintenance);

        btnComplete.setText("Set Complete");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnComplete))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtReason, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comEquipment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComplete)
                    .addComponent(btnBack))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);  
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Maintenance m = new Maintenance();
        
        m.Enterprise = this.Enterprise;
        Equipment e = (Equipment)this.comEquipment.getSelectedItem();
        m.EquipmentID = e.EquipmentID;
        m.EquipmentName = e.EquipmentName;
        m.Reason = this.txtReason.getText();
        m.Status = "";
        EngDic.AddMaintenance(m);
        LoadData();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        int n = this.tableMaintenance.getSelectedRow();
        if(n<0)return;
        String id = this.tableMaintenance.getValueAt(n, 0).toString();
        EngDic.SetComplete(id);
        this.LoadData();
    }//GEN-LAST:event_btnCompleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnComplete;
    private javax.swing.JComboBox<Equipment> comEquipment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMaintenance;
    private javax.swing.JTextField txtReason;
    // End of variables declaration//GEN-END:variables
}