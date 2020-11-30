/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Engineer;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author 27246
 */
public class EngineerMainJPanel extends javax.swing.JPanel {

    private JPanel container;
    /**
     * Creates new form EngineerMainJPanel
     */
    public EngineerMainJPanel(JPanel container) {
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

        btnEqu = new javax.swing.JButton();
        btnMai = new javax.swing.JButton();

        btnEqu.setText("Equipment manage");
        btnEqu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquActionPerformed(evt);
            }
        });

        btnMai.setText("Maintenance");
        btnMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEqu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(340, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEqu)
                .addGap(18, 18, 18)
                .addComponent(btnMai)
                .addContainerGap(292, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEquActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquActionPerformed
        CardLayout layout=(CardLayout)container.getLayout();
        container.add("workArea",new EquipmentJPanel(this.container));
        layout.next(container);    
    }//GEN-LAST:event_btnEquActionPerformed

    private void btnMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaiActionPerformed
        CardLayout layout=(CardLayout)container.getLayout();
        container.add("workArea",new MaintenanceJPanel(this.container));
        layout.next(container);          
    }//GEN-LAST:event_btnMaiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEqu;
    private javax.swing.JButton btnMai;
    // End of variables declaration//GEN-END:variables
}
