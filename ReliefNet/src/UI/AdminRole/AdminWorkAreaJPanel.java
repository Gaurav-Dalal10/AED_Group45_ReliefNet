/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminRole;

import Model.Enterprise.Enterprise;
import Model.Network.Network;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Hp
 * 
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise ent;
    Network net;
    public AdminWorkAreaJPanel(JPanel userProcessContainer, Network net, Enterprise ent) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ent = ent;
        this.net=net;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lbltitle = new javax.swing.JLabel();
        JM_btnmanageuser = new javax.swing.JButton();
        JM_btnmanageemp = new javax.swing.JButton();
        JM_btnmanageorg = new javax.swing.JButton();
        JM_jLabel1 = new javax.swing.JLabel();
        JM_jLabel2 = new javax.swing.JLabel();
        JM_jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 73, 111));
        setForeground(new java.awt.Color(102, 0, 102));

        Lbltitle.setBackground(new java.awt.Color(102, 73, 111));
        Lbltitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        Lbltitle.setForeground(new java.awt.Color(255, 255, 255));
        Lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbltitle.setText("Administrative Role Work Area");

        JM_btnmanageuser.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        JM_btnmanageuser.setForeground(new java.awt.Color(102, 73, 111));
        JM_btnmanageuser.setText("Manage User");
        JM_btnmanageuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnmanageuserActionPerformed(evt);
            }
        });

        JM_btnmanageemp.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        JM_btnmanageemp.setForeground(new java.awt.Color(102, 73, 111));
        JM_btnmanageemp.setText("Manage Employee");
        JM_btnmanageemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnmanageempActionPerformed(evt);
            }
        });

        JM_btnmanageorg.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        JM_btnmanageorg.setForeground(new java.awt.Color(102, 73, 111));
        JM_btnmanageorg.setText("Manage Organization");
        JM_btnmanageorg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnmanageorgActionPerformed(evt);
            }
        });

        JM_jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/AdminRole/organization.png"))); // NOI18N

        JM_jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/AdminRole/employee.png"))); // NOI18N

        JM_jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/AdminRole/user.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lbltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JM_btnmanageorg, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(JM_btnmanageemp, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JM_jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185)
                        .addComponent(JM_jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(JM_jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(JM_btnmanageuser, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(270, 270, 270))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JM_btnmanageemp, JM_btnmanageorg, JM_btnmanageuser});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(Lbltitle)
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JM_jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JM_jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JM_btnmanageuser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JM_btnmanageemp, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JM_btnmanageorg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JM_jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(314, 401, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JM_btnmanageuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnmanageuserActionPerformed
        // TODO add your handling code here:
        ManageUserAccJPanel manageUserAccJPanel = new ManageUserAccJPanel(userProcessContainer, ent);
        userProcessContainer.add("manageUserAccJPanel", manageUserAccJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_JM_btnmanageuserActionPerformed

    private void JM_btnmanageempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnmanageempActionPerformed

        ManageEmpJPanel manageEmployeeJPanel = new ManageEmpJPanel(userProcessContainer, ent.getOrgDir());
        userProcessContainer.add("manageEmpJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_JM_btnmanageempActionPerformed

    private void JM_btnmanageorgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnmanageorgActionPerformed

        ManageOrgJPanel manageOrganizationJPanel = new ManageOrgJPanel(userProcessContainer, ent.getOrgDir(), ent);
        userProcessContainer.add("manageOrgJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_JM_btnmanageorgActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JM_btnmanageemp;
    private javax.swing.JButton JM_btnmanageorg;
    private javax.swing.JButton JM_btnmanageuser;
    private javax.swing.JLabel JM_jLabel1;
    private javax.swing.JLabel JM_jLabel2;
    private javax.swing.JLabel JM_jLabel3;
    private javax.swing.JLabel Lbltitle;
    // End of variables declaration//GEN-END:variables
}
