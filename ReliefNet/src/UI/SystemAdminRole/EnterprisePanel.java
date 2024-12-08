/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdminRole;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krishna
 */
public class EnterprisePanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem system;
    /**
     * Creates new form EnterprisePanel
     */
    public EnterprisePanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;

        autoPopEnt();
        autoPopComboBox();
    }

    private void autoPopEnt() {
        DefaultTableModel mdl = (DefaultTableModel) tblEnterprise.getModel();

        mdl.setRowCount(0);
        for (Network net : system.getNetList()) {
            for (Enterprise ent : net.getEntDir().getEntList()) {
                Object[] row = new Object[3];
                row[0] = ent;
                row[1] = net.getName();
                row[2] = ent.getEntType().getType();

                mdl.addRow(row);
            }
        }
    }
    
    private void autoPopComboBox() {
        JM_cbEntNetwork.removeAllItems();
        JM_cbEntType.removeAllItems();

        for (Network net : system.getNetList()) {
            JM_cbEntNetwork.addItem(net);
        }
        for (Enterprise.EntType type : Enterprise.EntType.values()) {
            JM_cbEntType.addItem(type);
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

        JM_jLabel1 = new javax.swing.JLabel();
        JM_cbEntNetwork = new javax.swing.JComboBox();
        JM_jLabel2 = new javax.swing.JLabel();
        JM_txtEntName = new javax.swing.JTextField();
        JM_jLabel3 = new javax.swing.JLabel();
        JM_cbEntType = new javax.swing.JComboBox();
        JM_btnEntAdd = new javax.swing.JButton();
        JM_btnBack = new javax.swing.JButton();
        JM_jLabel4 = new javax.swing.JLabel();
        JM_jScrollPane1 = new javax.swing.JScrollPane();
        tblEnterprise = new javax.swing.JTable();
        JM_btnEnterpriseDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 73, 111));

        JM_jLabel1.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel1.setText("Network");

        JM_cbEntNetwork.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_cbEntNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JM_cbEntNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_cbEntNetworkActionPerformed(evt);
            }
        });

        JM_jLabel2.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel2.setText("Name");

        JM_txtEntName.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        JM_jLabel3.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel3.setText("Enterprise Type");

        JM_cbEntType.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_cbEntType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JM_cbEntType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_cbEntTypeActionPerformed(evt);
            }
        });

        JM_btnEntAdd.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        JM_btnEntAdd.setForeground(new java.awt.Color(102, 73, 111));
        JM_btnEntAdd.setText("Add");
        JM_btnEntAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnEntAddActionPerformed(evt);
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

        JM_jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        JM_jLabel4.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        JM_jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JM_jLabel4.setText("MANAGE ENTERPRISE WORKAREA");

        tblEnterprise.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        tblEnterprise.setForeground(new java.awt.Color(102, 0, 102));
        tblEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JM_jScrollPane1.setViewportView(tblEnterprise);

        JM_btnEnterpriseDelete.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        JM_btnEnterpriseDelete.setForeground(new java.awt.Color(102, 73, 111));
        JM_btnEnterpriseDelete.setText("DELETE");
        JM_btnEnterpriseDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnEnterpriseDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(JM_btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JM_jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JM_btnEnterpriseDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JM_jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(JM_jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JM_jLabel1)
                                .addComponent(JM_jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JM_cbEntNetwork, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JM_cbEntType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JM_txtEntName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JM_btnEntAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JM_btnBack)
                    .addComponent(JM_jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addComponent(JM_jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JM_btnEnterpriseDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_jLabel1)
                    .addComponent(JM_cbEntNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_jLabel3)
                    .addComponent(JM_cbEntType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_jLabel2)
                    .addComponent(JM_txtEntName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(JM_btnEntAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JM_btnEntAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnEntAddActionPerformed

        Network net = (Network) JM_cbEntNetwork.getSelectedItem();
        Enterprise.EntType type = (Enterprise.EntType) JM_cbEntType.getSelectedItem();

        if (net == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input.");
            return;
        }

        String name = JM_txtEntName.getText();
        if(name.equals("") || name==null){
            JOptionPane.showMessageDialog(null, "Name field Mandatory.");
            return;
        }
        for(Enterprise ent:net.getEntDir().getEntList()){
            if(ent.getName().equalsIgnoreCase(name)){
                JOptionPane.showMessageDialog(null, "Existing Enterprise.");
                return;
            }
        }

        net.getEntDir().createEnt(name, type);

        autoPopEnt();
        
        JM_txtEntName.setText("");
    }//GEN-LAST:event_JM_btnEntAddActionPerformed

    private void JM_btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_JM_btnBackActionPerformed

    private void JM_btnEnterpriseDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnEnterpriseDeleteActionPerformed

        int selectedRow = tblEnterprise.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Make a row selection for enterprise deletion.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Enterprise ent = (Enterprise) tblEnterprise.getValueAt(selectedRow, 0);

            for (Network net : system.getNetList()) {
                for (Enterprise enterprise : net.getEntDir().getEntList()) {

                    if (ent == enterprise) {
                        net.getEntDir().getEntList().remove(ent);
                        break;
                    }

                }
            }

            JOptionPane.showMessageDialog(null, "Successful deletion of enterprise.");
            autoPopEnt();
        }
    }//GEN-LAST:event_JM_btnEnterpriseDeleteActionPerformed

    private void JM_cbEntTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_cbEntTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_cbEntTypeActionPerformed

    private void JM_cbEntNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_cbEntNetworkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_cbEntNetworkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JM_btnBack;
    private javax.swing.JButton JM_btnEntAdd;
    private javax.swing.JButton JM_btnEnterpriseDelete;
    private javax.swing.JComboBox JM_cbEntNetwork;
    private javax.swing.JComboBox JM_cbEntType;
    private javax.swing.JLabel JM_jLabel1;
    private javax.swing.JLabel JM_jLabel2;
    private javax.swing.JLabel JM_jLabel3;
    private javax.swing.JLabel JM_jLabel4;
    private javax.swing.JScrollPane JM_jScrollPane1;
    private javax.swing.JTextField JM_txtEntName;
    private javax.swing.JTable tblEnterprise;
    // End of variables declaration//GEN-END:variables
}