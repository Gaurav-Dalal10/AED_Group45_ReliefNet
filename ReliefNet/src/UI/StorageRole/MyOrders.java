/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.StorageRole;

import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Organization.DoctorOrg;
import Model.Organization.TutorOrg;
import Model.Organization.StorageOrg;
import Model.Organization.Organisation;
import Model.Organization.TransportOrg;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.TutorVolunteerWorkReq;
import Model.WorkQueue.VolunteerStorageWorkRequest;
import Model.WorkQueue.WorkRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Mrinalini
 */
public class MyOrders extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private StorageOrg org;
    private Enterprise ent;
    private UserAccount ua;
    private Network net;
    /**
     * Creates new form MyOrders
     */
    public MyOrders(JPanel userProcessContainer, UserAccount acc, StorageOrg org, Enterprise ent, Network net) {
        initComponents();
                
        this.userProcessContainer = userProcessContainer;
        this.org = (StorageOrg)org;
        this.ent = ent;
        this.ua = acc;
        this.net = net;

        autoPopOrderHistory();
    }
    
    public void autoPopOrderHistory()
    {
        DefaultTableModel mdl = (DefaultTableModel) tblOrderHistory.getModel();
        SimpleDateFormat fmt = new SimpleDateFormat("dd MMM, yyyy");
        mdl.setRowCount(0);
        for (Iterator<WorkRequest> workRequest = ua.getWorkQueue().getWrList().iterator(); workRequest.hasNext();) {
            WorkRequest wr= workRequest.next();
            if(wr instanceof VolunteerStorageWorkRequest)
            {
            VolunteerStorageWorkRequest req = (VolunteerStorageWorkRequest) wr;
            Object[] row = new Object[7];
            row[0] = req;
            row[1] = req.getStatus();
            row[2] = req.getSender();
            row[3] = req.getSenderNumber();
            
            if(req.getExpectedDelivery() ==null){
                row[6] = "";
            }else{
                Date dt = req.getExpectedDelivery();
                String pickupDt = fmt.format(dt);
                row[6] = pickupDt; 
            }
            
            if(req.getDelivery()==null){
                row[4] = "";
            }else{
                row[4] = req.getDelivery().getEmp().getName();
            }
            row[5] = req.getDeliveryNumber();
            mdl.addRow(row);
            }
        }
        
    }
        
    public void autoPopOrderDetails(ArrayList<String> cat, ArrayList<Integer> quantity, ArrayList<String> descr)
    {
        DefaultTableModel mdl = (DefaultTableModel) tblOrdDetails.getModel();
        mdl.setRowCount(0);
        int length= cat.size();
        for(int i=0;i<length;i++)
        {
            Object[] row = new Object[3];
            row[0] = cat.get(i);
            row[1] = quantity.get(i);
            row[2] = descr.get(i);
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

        JM_jLabel7 = new javax.swing.JLabel();
        JM_jLabel3 = new javax.swing.JLabel();
        JM_jLabel4 = new javax.swing.JLabel();
        JM_jScrollPane8 = new javax.swing.JScrollPane();
        tblOrderHistory = new javax.swing.JTable();
        JM_jScrollPane9 = new javax.swing.JScrollPane();
        tblOrdDetails = new javax.swing.JTable();
        JM_btnback = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 73, 111));

        JM_jLabel7.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        JM_jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JM_jLabel7.setText("Inventory Order History");

        JM_jLabel3.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        JM_jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel3.setText("Order History");

        JM_jLabel4.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        JM_jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel4.setText("Details");

        tblOrderHistory.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        tblOrderHistory.setForeground(new java.awt.Color(102, 0, 102));
        tblOrderHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Status", "Sender", "Sender Contact", "Delivery By", "Delivery Contact", "Delivery Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrderHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrderHistoryMouseClicked(evt);
            }
        });
        JM_jScrollPane8.setViewportView(tblOrderHistory);

        tblOrdDetails.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        tblOrdDetails.setForeground(new java.awt.Color(102, 0, 102));
        tblOrdDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category", "Quantity", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JM_jScrollPane9.setViewportView(tblOrdDetails);

        JM_btnback.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_btnback.setForeground(new java.awt.Color(102, 73, 111));
        JM_btnback.setText("<< Back");
        JM_btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(JM_btnback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JM_jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 1276, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JM_jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JM_jLabel3))
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JM_jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JM_jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_jLabel7)
                    .addComponent(JM_btnback))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JM_jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JM_jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JM_jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(259, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblOrderHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrderHistoryMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblOrderHistory.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showConfirmDialog(null, "Make row selection to view details.","Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            VolunteerStorageWorkRequest req = (VolunteerStorageWorkRequest)tblOrderHistory.getValueAt(selectedRow, 0);
            autoPopOrderDetails(req.getCategory(),req.getQuantity(),req.getDescription());
        }
    }//GEN-LAST:event_tblOrderHistoryMouseClicked

    private void JM_btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnbackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        java.awt.CardLayout layout = (java.awt.CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_JM_btnbackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JM_btnback;
    private javax.swing.JLabel JM_jLabel3;
    private javax.swing.JLabel JM_jLabel4;
    private javax.swing.JLabel JM_jLabel7;
    private javax.swing.JScrollPane JM_jScrollPane8;
    private javax.swing.JScrollPane JM_jScrollPane9;
    private javax.swing.JTable tblOrdDetails;
    private javax.swing.JTable tblOrderHistory;
    // End of variables declaration//GEN-END:variables
}
