/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Reception;

import Business.Logic.RecDic;
import Business.Models.VipCustomer;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.MainJFrame;

/**
 *
 * @author Administrator
 */
public class CustomerJPanel extends javax.swing.JPanel {

    JPanel container;
    List<VipCustomer> listVipCustomer;
    /**
     * Creates new form CustomerJPanel
     */
    public CustomerJPanel(JPanel container) {
        initComponents();
        this.container = container;
        LoadTrainerData();
        LoadData();
    }
    public void LoadData(){
        listVipCustomer = RecDic.QueryVipCustomer(MainJFrame.userAccount.Enterprise.getName());
        DefaultTableModel tableModel = (DefaultTableModel)this.tableCustomer.getModel();
        String[] cols = new String[]{"username","Name","Role","Enterprise","Age","Sex","Height","Weight","Mobile","Private Trainer"};
        String[][] rows= new String[listVipCustomer.size()][10];
        for (int i = 0; i < listVipCustomer.size(); i++) {
            rows[i][0] = listVipCustomer.get(i).username;
            rows[i][1] = listVipCustomer.get(i).Name;
            rows[i][2] = listVipCustomer.get(i).Role;
            rows[i][3] = listVipCustomer.get(i).Enterprise;
            rows[i][4] = listVipCustomer.get(i).Age;
            rows[i][5] = listVipCustomer.get(i).Sex;
            rows[i][6] = listVipCustomer.get(i).Height;
            rows[i][7] = listVipCustomer.get(i).Weight;
            rows[i][8] = listVipCustomer.get(i).Mobile;
            rows[i][9] = listVipCustomer.get(i).PrivateTrainerUserName;    
        }
        tableModel.setDataVector(rows, cols);
    }
        public void LoadTrainerData(){
        for (int i = 0; i < MainJFrame.userAccount.Enterprise.getOrganizationDirectory().getOrganizationList().size(); i++) {
            Organization o = MainJFrame.userAccount.Enterprise.getOrganizationDirectory().getOrganizationList().get(i);
            ArrayList<UserAccount> list = o.getUserAccountDirectory().getUserAccountList();
            for (int j = 0; j < list.size(); j++) {
               
                UserAccount u = list.get(j);
                 System.out.println(u.getRole().getType());
                if(u.getRole().getType().equals("PrivateTrainer")){
                    this.combTrainer.addItem(u.getUsername());
                }
            }
        }
       
//        List<User> list = UserDic.QueryUseyByTypes(new String[]{"4"});
//        for (int i = 0; i < list.size(); i++) {
//            this.comboTrainer.addItem(list.get(i));
//        }
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
        txtUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPsw = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        combRole = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboSex = new javax.swing.JComboBox<String>();
        jLabel7 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        combTrainer = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();

        jLabel1.setText("username");

        jLabel2.setText("password");

        jLabel3.setText("Name:");

        jLabel4.setText("Role:");

        combRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "CustomerWithTrainer" }));

        jLabel5.setText("Age:");

        jLabel6.setText("Sex:");

        comboSex.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "male", "female" }));

        jLabel7.setText("Height:");

        jLabel8.setText("Weight:");

        jLabel9.setText("Mobile:");

        jLabel10.setText("Trainer:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCustomer);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnDel.setText("Delete");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(txtHeight))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPsw, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtWeight)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMobile)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combTrainer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(combRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboSex, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 26, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtPsw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(combRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(comboSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(combTrainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDel)
                    .addComponent(btnBack))
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);         // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        VipCustomer  c= new VipCustomer();
        c.username = this.txtUserName.getText();
        c.psw = this.txtPsw.getPassword().toString();
        c.Name = this.txtName.getText();
        c.Role = this.combRole.getSelectedItem().toString();
        c.Age = this.txtAge.getText();
        c.Sex = this.comboSex.getSelectedItem().toString();
        c.Height = this.txtHeight.getText();
        c.Weight = this.txtWeight.getText();
        c.Mobile = this.txtMobile.getText();
        c.Enterprise = MainJFrame.userAccount.Enterprise.getName();
        c.PrivateTrainerUserName = this.combTrainer.getSelectedItem().toString();
        RecDic.SaveVipCoustomInfo(c);
        ReSet();
        LoadData();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        int n = this.tableCustomer.getSelectedRow();
        if(n<0) return;
        RecDic.DelCustomer(this.tableCustomer.getValueAt(n, 0).toString());
        this.LoadData();
    }//GEN-LAST:event_btnDelActionPerformed

    private void tableCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustomerMouseClicked
        int n = this.tableCustomer.getSelectedRow();
        if(n<0) return;
        this.txtUserName.setText(this.listVipCustomer.get(n).username);
        this.txtPsw.setText(this.listVipCustomer.get(n).psw);
        this.txtName.setText(this.listVipCustomer.get(n).Name);
        this.txtAge.setText(this.listVipCustomer.get(n).Age);
        this.txtHeight.setText(this.listVipCustomer.get(n).Height);
        this.txtWeight.setText(this.listVipCustomer.get(n).Weight);
        this.txtMobile.setText(this.listVipCustomer.get(n).Mobile);
    }//GEN-LAST:event_tableCustomerMouseClicked
    public void ReSet(){
        this.txtUserName.setText("");
        this.txtPsw.setText("");
        this.txtName.setText("");
        this.txtAge.setText("");
        this.txtHeight.setText("");
        this.txtWeight.setText("");
        this.txtMobile.setText("");

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> combRole;
    private javax.swing.JComboBox<String> combTrainer;
    private javax.swing.JComboBox<String> comboSex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCustomer;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPsw;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}