/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdminRole;

import Model.EcoSystem;
import Model.Employee.Employee;
import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Role.AdminRole;
import Model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hp
 */
public class EnterpriseAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form EnterpriseAdminPanel
     */
    public EnterpriseAdminPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JM_jLabel4 = new javax.swing.JLabel();
        JM_txEntAdmName = new javax.swing.JTextField();
        JM_jScrollPane1 = new javax.swing.JScrollPane();
        tblEntAdmin = new javax.swing.JTable();
        JM_jLabel5 = new javax.swing.JLabel();
        JM_txtEntAdmPwd = new javax.swing.JPasswordField();
        JM_jLabel1 = new javax.swing.JLabel();
        JM_btnBack = new javax.swing.JButton();
        JM_cbEntAdmNet = new javax.swing.JComboBox();
        JM_jLabel6 = new javax.swing.JLabel();
        JM_jLabel2 = new javax.swing.JLabel();
        JM_txtEntAdmUsername = new javax.swing.JTextField();
        JM_jLabel3 = new javax.swing.JLabel();
        JM_cbEnt = new javax.swing.JComboBox();
        JM_btnEntAdmAdd = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(102, 73, 111));

        JM_jLabel4.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JM_jLabel4.setText("Password");

        JM_txEntAdmName.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_txEntAdmName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_txEntAdmNameActionPerformed(evt);
            }
        });

        tblEntAdmin.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        tblEntAdmin.setForeground(new java.awt.Color(102, 0, 102));
        tblEntAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JM_jScrollPane1.setViewportView(tblEntAdmin);

        JM_jLabel5.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JM_jLabel5.setText("Name");

        JM_txtEntAdmPwd.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        JM_jLabel1.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JM_jLabel1.setText("Network");

        JM_btnBack.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        JM_btnBack.setForeground(new java.awt.Color(102, 73, 111));
        JM_btnBack.setText("<< Back");
        JM_btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnBackActionPerformed(evt);
            }
        });

        JM_cbEntAdmNet.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_cbEntAdmNet.setForeground(new java.awt.Color(102, 73, 111));
        JM_cbEntAdmNet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        JM_cbEntAdmNet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_cbEntAdmNetActionPerformed(evt);
            }
        });

        JM_jLabel6.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        JM_jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JM_jLabel6.setText("MANAGE ENTERPRISE ADMIN WORKAREA");

        JM_jLabel2.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JM_jLabel2.setText("Username");

        JM_txtEntAdmUsername.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        JM_jLabel3.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JM_jLabel3.setText("Enterprise");

        JM_cbEnt.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_cbEnt.setForeground(new java.awt.Color(102, 73, 111));
        JM_cbEnt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        JM_btnEntAdmAdd.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        JM_btnEntAdmAdd.setForeground(new java.awt.Color(102, 73, 111));
        JM_btnEntAdmAdd.setText("Add");
        JM_btnEntAdmAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnEntAdmAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JM_jLabel3)
                    .addComponent(JM_jLabel1)
                    .addComponent(JM_jLabel2)
                    .addComponent(JM_jLabel4)
                    .addComponent(JM_jLabel5))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JM_cbEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JM_cbEntAdmNet, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JM_txtEntAdmUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JM_txtEntAdmPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JM_txEntAdmName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(243, 243, 243))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(JM_btnEntAdmAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(JM_btnBack)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JM_jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JM_jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_btnBack)
                    .addComponent(JM_jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(JM_jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_jLabel1)
                    .addComponent(JM_cbEntAdmNet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_jLabel3)
                    .addComponent(JM_cbEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_jLabel2)
                    .addComponent(JM_txtEntAdmUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_jLabel4)
                    .addComponent(JM_txtEntAdmPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_jLabel5)
                    .addComponent(JM_txEntAdmName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JM_btnEntAdmAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 792, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JM_txEntAdmNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_txEntAdmNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_txEntAdmNameActionPerformed

    private void JM_btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_JM_btnBackActionPerformed

    private void JM_cbEntAdmNetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_cbEntAdmNetActionPerformed

        Network net = (Network) JM_cbEntAdmNet.getSelectedItem();
        if (net != null){
            autoPopulateEntCb(net);
        }
    }//GEN-LAST:event_JM_cbEntAdmNetActionPerformed

    private void JM_btnEntAdmAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnEntAdmAddActionPerformed

        Enterprise ent = (Enterprise) JM_cbEnt.getSelectedItem();

        String uname = JM_txtEntAdmUsername.getText();
        String pwd = String.valueOf(JM_txtEntAdmPwd.getPassword());
        String name = JM_txEntAdmName.getText();
        if(uname.equals("") || uname == null || pwd.equals("") || pwd == null){
            JOptionPane.showMessageDialog(null, "Enter Login Information");
            return;
        }
        if(name.equals("") || name == null){
            JOptionPane.showMessageDialog(null, "Enter Name");
            return;
        }
        for(Employee emp: ent.getEmpDir().getEmpList()){
            if(emp.getName().equalsIgnoreCase(name)){
                JOptionPane.showMessageDialog(null, "Existing Employee");
                return;
            }
        }
        Employee emp = ent.getEmpDir().createEmp(name);

        ent.getUserAccDir().createAccount(uname, pwd, emp, new AdminRole());
        autoPopEntAdmin();

        JM_txtEntAdmUsername.setText("");
        JM_txtEntAdmPwd.setText("");
        JM_txEntAdmName.setText("");
    }//GEN-LAST:event_JM_btnEntAdmAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JM_btnBack;
    private javax.swing.JButton JM_btnEntAdmAdd;
    private javax.swing.JComboBox JM_cbEnt;
    private javax.swing.JComboBox JM_cbEntAdmNet;
    private javax.swing.JLabel JM_jLabel1;
    private javax.swing.JLabel JM_jLabel2;
    private javax.swing.JLabel JM_jLabel3;
    private javax.swing.JLabel JM_jLabel4;
    private javax.swing.JLabel JM_jLabel5;
    private javax.swing.JLabel JM_jLabel6;
    private javax.swing.JScrollPane JM_jScrollPane1;
    private javax.swing.JTextField JM_txEntAdmName;
    private javax.swing.JPasswordField JM_txtEntAdmPwd;
    private javax.swing.JTextField JM_txtEntAdmUsername;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable tblEntAdmin;
    // End of variables declaration//GEN-END:variables
}
