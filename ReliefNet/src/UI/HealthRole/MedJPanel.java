/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.HealthRole;

/**
 *
 * @author Mrinalini
 */

import Model.Enterprise.Enterprise;
import Model.Medicare;
import Model.Network.Network;
import Model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MedJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MedJPanel
     */
     private JPanel userProcessContainer;
    private Medicare med;
    private int flag=0;
    
    public MedJPanel(JPanel userProcessContainer,Medicare med, int flag) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.med = med;
        JM_txtname.setText(med.getMed_name());
        JM_txtquant.setText(med.getMed_quantity()+"");
        this.flag = flag;
        if(flag==1){
            JM_btnSave.setVisible(false);
            JM_btnUpdate.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JM_lbltitle = new javax.swing.JLabel();
        JM_lblname = new javax.swing.JLabel();
        JM_txtname = new javax.swing.JTextField();
        JM_lblquant = new javax.swing.JLabel();
        JM_txtquant = new javax.swing.JTextField();
        JM_btnSave = new javax.swing.JButton();
        JM_btnUpdate = new javax.swing.JButton();
        JM_btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 73, 111));

        JM_lbltitle.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        JM_lbltitle.setForeground(new java.awt.Color(255, 255, 255));
        JM_lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JM_lbltitle.setText("Medicine Details");

        JM_lblname.setBackground(new java.awt.Color(255, 255, 255));
        JM_lblname.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_lblname.setForeground(new java.awt.Color(255, 255, 255));
        JM_lblname.setText("Name:");

        JM_txtname.setEditable(false);
        JM_txtname.setForeground(new java.awt.Color(102, 0, 102));

        JM_lblquant.setBackground(new java.awt.Color(255, 255, 255));
        JM_lblquant.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_lblquant.setForeground(new java.awt.Color(255, 255, 255));
        JM_lblquant.setText("Quantity:");

        JM_txtquant.setEditable(false);
        JM_txtquant.setForeground(new java.awt.Color(102, 0, 102));

        JM_btnSave.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        JM_btnSave.setForeground(new java.awt.Color(102, 73, 111));
        JM_btnSave.setText("Save");
        JM_btnSave.setEnabled(false);
        JM_btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnSaveActionPerformed(evt);
            }
        });

        JM_btnUpdate.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        JM_btnUpdate.setForeground(new java.awt.Color(102, 73, 111));
        JM_btnUpdate.setText("Update");
        JM_btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnUpdateActionPerformed(evt);
            }
        });

        JM_btnBack.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        JM_btnBack.setForeground(new java.awt.Color(102, 73, 111));
        JM_btnBack.setText("<< Back");
        JM_btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(JM_btnBack)
                .addGap(297, 297, 297)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JM_lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JM_lblname)
                            .addComponent(JM_lblquant))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JM_btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(JM_btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JM_txtname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JM_txtquant, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(572, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JM_btnSave, JM_btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JM_lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JM_btnBack))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JM_lblname))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_lblquant)
                    .addComponent(JM_txtquant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JM_btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(478, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {JM_btnSave, JM_btnUpdate});

    }// </editor-fold>//GEN-END:initComponents

    private void JM_btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnSaveActionPerformed
        // TODO add your handling code here:
        String quanttxt = JM_txtquant.getText();
        if(quanttxt.equals("") || quanttxt==null){
            JOptionPane.showMessageDialog(null,"Enter medicine details.");
            return;
        }
        try{
            Integer.parseInt(JM_txtquant.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Enter Quantity");
            return;
        }
        int final_quant = Integer.parseInt(quanttxt);
        med.setMed_quantity(final_quant);
        JOptionPane.showMessageDialog(null, "Successfully updated Medicine details");
        JM_txtquant.setEditable(false);
        JM_btnSave.setEnabled(false);
        JM_btnUpdate.setEnabled(true);

    }//GEN-LAST:event_JM_btnSaveActionPerformed

    private void JM_btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnUpdateActionPerformed
        // TODO add your handling code here:
        JM_txtquant.setEditable(true);
        JM_btnSave.setEnabled(true);
        JM_btnUpdate.setEnabled(false);
    }//GEN-LAST:event_JM_btnUpdateActionPerformed

    private void JM_btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnBackActionPerformed
        // TODO add your handling code here:
        if(flag==1){
            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout)userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
            return;
        }
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PharmacyReqJPanel pharmacyReqJPanel = (PharmacyReqJPanel) component;
        pharmacyReqJPanel.populatemedtbl();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_JM_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JM_btnBack;
    private javax.swing.JButton JM_btnSave;
    private javax.swing.JButton JM_btnUpdate;
    private javax.swing.JLabel JM_lblname;
    private javax.swing.JLabel JM_lblquant;
    private javax.swing.JLabel JM_lbltitle;
    private javax.swing.JTextField JM_txtname;
    private javax.swing.JTextField JM_txtquant;
    // End of variables declaration//GEN-END:variables
}
