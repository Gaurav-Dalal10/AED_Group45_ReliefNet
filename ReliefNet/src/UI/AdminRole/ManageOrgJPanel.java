/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminRole;

import Model.Enterprise.Enterprise;
import Model.Enterprise.HospitalEnterprise;
import Model.Enterprise.NGOEnterprise;
import Model.Enterprise.ResturantEnterprise;
import Model.Enterprise.TransportationEnterprise;
import Model.Organization.Organisation;
import Model.Organization.Organisation.Type;
import Model.Organization.OrganisationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hp
 * 
 */

public class ManageOrgJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrgJPanel
     */
    private OrganisationDirectory dir;
    private JPanel userProcessContainer;
    private Enterprise ent;
    
    public ManageOrgJPanel(JPanel userProcessContainer,OrganisationDirectory dir, Enterprise ent) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.dir = dir;
        this.ent = ent;
        autoPopTbl();
        autoPopCB();
    }
    private void autoPopCB(){       
        JM_cborg.removeAllItems();
        if(ent.getEntType().equals(Enterprise.EntType.NGO)){
            for (NGOEnterprise.Type type : NGOEnterprise.Type.values()){
            if (!type.getType().equals(Type.Admin.getOrgType()))
                JM_cborg.addItem(type);
            }
        }else if(ent.getEntType().equals(Enterprise.EntType.Hospital)){
           
            for (HospitalEnterprise.Type type : HospitalEnterprise.Type.values()){
            if (!type.getType().equals(Type.Admin.getOrgType()))
                JM_cborg.addItem(type);
            }
        }else if(ent.getEntType().equals(Enterprise.EntType.Transpotation)){
           
            for (TransportationEnterprise.Type type : TransportationEnterprise.Type.values()){
            if (!type.getType().equals(Type.Admin.getOrgType()))
                JM_cborg.addItem(type);
            }
        } else{
            for(ResturantEnterprise.Type type: ResturantEnterprise.Type.values()){
                JM_cborg.addItem(type);
            }
        }
    }
    
    private void autoPopTbl(){
        DefaultTableModel mdl = (DefaultTableModel) JM_orgtable.getModel();
        mdl.setRowCount(0);
        for (Organisation org : dir.getOrgList()){
            Object[] row = new Object[2];
            row[0] = org.getOrgID();
            row[1] = org.getName();
            mdl.addRow(row);
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

        JM_jScrollPane1 = new javax.swing.JScrollPane();
        JM_orgtable = new javax.swing.JTable();
        JM_btnaddorg = new javax.swing.JButton();
        JM_cborg = new javax.swing.JComboBox();
        JM_lblorgtype = new javax.swing.JLabel();
        JM_btnback = new javax.swing.JButton();
        JM_lbltitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 73, 111));

        JM_orgtable.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        JM_orgtable.setForeground(new java.awt.Color(102, 0, 102));
        JM_orgtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JM_jScrollPane1.setViewportView(JM_orgtable);

        JM_btnaddorg.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        JM_btnaddorg.setForeground(new java.awt.Color(102, 73, 111));
        JM_btnaddorg.setText("Add Organization");
        JM_btnaddorg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnaddorgActionPerformed(evt);
            }
        });

        JM_cborg.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_cborg.setForeground(new java.awt.Color(102, 73, 111));
        JM_cborg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JM_cborg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_cborgActionPerformed(evt);
            }
        });

        JM_lblorgtype.setBackground(new java.awt.Color(255, 255, 255));
        JM_lblorgtype.setFont(new java.awt.Font(".SF NS Mono", 1, 18)); // NOI18N
        JM_lblorgtype.setForeground(new java.awt.Color(255, 255, 255));
        JM_lblorgtype.setText("Organization Type ");

        JM_btnback.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        JM_btnback.setForeground(new java.awt.Color(102, 73, 111));
        JM_btnback.setText("<< Back");
        JM_btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnbackActionPerformed(evt);
            }
        });

        JM_lbltitle.setBackground(new java.awt.Color(255, 255, 255));
        JM_lbltitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        JM_lbltitle.setForeground(new java.awt.Color(255, 255, 255));
        JM_lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JM_lbltitle.setText("MANAGE ORGANIZATION WORKAREA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JM_cborg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JM_btnaddorg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JM_lblorgtype, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(JM_btnback)
                        .addGap(125, 125, 125)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JM_jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JM_lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(511, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_btnback)
                    .addComponent(JM_lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(JM_lblorgtype, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JM_cborg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JM_btnaddorg)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(JM_jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(382, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JM_btnaddorgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnaddorgActionPerformed
    

        if(ent.getEntType().equals(Enterprise.EntType.NGO)){
            NGOEnterprise.Type type = (NGOEnterprise.Type) JM_cborg.getSelectedItem();
                System.out.println("-----"+type+"----"+type.getType()+"-----"+dir.getOrgList());
            for(Organisation org: dir.getOrgList()){
                System.out.println("-------"+org.getName());
                if(org.getName().equals(type.getType())){
                    JOptionPane.showMessageDialog(null, "This organisation already exists.");
                    return;
                }
            }
            System.out.println("0000---------"+dir);
            dir.createNGOOrg(type);

        }else if(ent.getEntType().equals(Enterprise.EntType.Hospital)){
            HospitalEnterprise.Type type = (HospitalEnterprise.Type) JM_cborg.getSelectedItem();
            for(Organisation org: dir.getOrgList()){
                if(org.getName().equals(type.getType())){
                    JOptionPane.showMessageDialog(null, "This organisation already exists.");
                    return;
                }
            }
            dir.createHospOrg(type);
        }else if(ent.getEntType().equals(Enterprise.EntType.Transpotation)){
            TransportationEnterprise.Type type = (TransportationEnterprise.Type) JM_cborg.getSelectedItem();
            for(Organisation org: dir.getOrgList()){
                if(org.getName().equals(type.getType())){
                    JOptionPane.showMessageDialog(null, "This organisation already exists.");
                    return;
                }
            }
            dir.createLTranportationOrg(type);
        }
        else {
            ResturantEnterprise.Type type = (ResturantEnterprise.Type) JM_cborg.getSelectedItem();
            for(Organisation org: dir.getOrgList()){
                if(org.getName().equals(type.getType())){
                    JOptionPane.showMessageDialog(null, "This organisation already exists.");
                    return;
                }
            }
            dir.createRestaurantOrg(type);
        }
        System.out.println("----existed========");
        autoPopTbl();

    }//GEN-LAST:event_JM_btnaddorgActionPerformed

    private void JM_cborgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_cborgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_cborgActionPerformed

    private void JM_btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnbackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_JM_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JM_btnaddorg;
    private javax.swing.JButton JM_btnback;
    private javax.swing.JComboBox JM_cborg;
    private javax.swing.JScrollPane JM_jScrollPane1;
    private javax.swing.JLabel JM_lblorgtype;
    private javax.swing.JLabel JM_lbltitle;
    private javax.swing.JTable JM_orgtable;
    // End of variables declaration//GEN-END:variables
}
