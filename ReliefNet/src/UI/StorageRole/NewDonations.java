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
public class NewDonations extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private StorageOrg org;
    private Enterprise ent;
    private UserAccount ua;
    private Network net;
    /**
     * Creates new form NewDonations
     */
    public NewDonations(JPanel userProcessContainer, UserAccount acc, StorageOrg org, Enterprise ent, Network net) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.org = (StorageOrg)org;
        this.ent = ent;
        this.ua = acc;
        this.net = net;

        autoPopNewDonation();
    }

    public void autoPopNewDonation(){
        DefaultTableModel mdl = (DefaultTableModel)tblNewDonations.getModel();
        
        mdl.setRowCount(0);
        
        for (Iterator<WorkRequest> wr = org.getWorkQueue().getWrList().iterator(); wr.hasNext();) {
            VolunteerStorageWorkRequest req = (VolunteerStorageWorkRequest) wr.next();
                if(req.getStatus().equalsIgnoreCase("Sent")){
                    Object[] row = new Object[4];
                    row[0]=req;
                    row[1] = req.getSender();
                    row[2]=req.getSenderNumber();
                    int sum=0;
                    for(Integer in: req.getQuantity())
                    {
                        sum=sum+in;
                    }
                    row[3]=sum;
                    mdl.addRow(row);
                }
                
        }
       
    }
    
    public void autoPopViewDetails(ArrayList<String> cat, ArrayList<Integer> quantity, ArrayList<String> desc)
    {
        DefaultTableModel mdl = (DefaultTableModel) tbViewlDetails.getModel();
        mdl.setRowCount(0);
        int length= cat.size();
        for(int i=0;i<length;i++)
        {
            Object[] row = new Object[3];
            row[0] = cat.get(i);
            row[1] = quantity.get(i);
            row[2] = desc.get(i);
            mdl.addRow(row);
        }
    }
    
    private boolean checkPhoneNo(String phNo) {
        Pattern pattern = Pattern.compile("^[0-9]{10}$");
        Matcher matcher = pattern.matcher(phNo);
        return matcher.matches();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JM_jLabel25 = new javax.swing.JLabel();
        JM_jLabel2 = new javax.swing.JLabel();
        JM_jLabel1 = new javax.swing.JLabel();
        JM_jScrollPane5 = new javax.swing.JScrollPane();
        tblNewDonations = new javax.swing.JTable();
        JM_jScrollPane6 = new javax.swing.JScrollPane();
        tbViewlDetails = new javax.swing.JTable();
        JM_jLabel24 = new javax.swing.JLabel();
        JM_jScrollPane7 = new javax.swing.JScrollPane();
        txtDelAddr = new javax.swing.JTextArea();
        JM_jLabel11 = new javax.swing.JLabel();
        JM_txtphNo = new javax.swing.JTextField();
        JM_btnOrder = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 73, 111));

        JM_jLabel25.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 32)); // NOI18N
        JM_jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JM_jLabel25.setText("Storage Work Area");

        JM_jLabel2.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 16)); // NOI18N
        JM_jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel2.setText("Donations");

        JM_jLabel1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 16)); // NOI18N
        JM_jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel1.setText("Details");

        tblNewDonations.setForeground(new java.awt.Color(102, 0, 102));
        tblNewDonations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Donation ID", "Sender", "Number", "Total Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNewDonations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNewDonationsMouseClicked(evt);
            }
        });
        JM_jScrollPane5.setViewportView(tblNewDonations);

        tbViewlDetails.setForeground(new java.awt.Color(102, 0, 102));
        tbViewlDetails.setModel(new javax.swing.table.DefaultTableModel(
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
        JM_jScrollPane6.setViewportView(tbViewlDetails);

        JM_jLabel24.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JM_jLabel24.setText("Delivery Address:");

        txtDelAddr.setColumns(20);
        txtDelAddr.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtDelAddr.setRows(5);
        JM_jScrollPane7.setViewportView(txtDelAddr);

        JM_jLabel11.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel11.setText("Contact Number:");

        JM_txtphNo.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_txtphNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_txtphNoActionPerformed(evt);
            }
        });

        JM_btnOrder.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        JM_btnOrder.setForeground(new java.awt.Color(102, 73, 111));
        JM_btnOrder.setText("Order Now");
        JM_btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(JM_jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JM_jLabel1)
                .addGap(495, 495, 495))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JM_jLabel24)
                        .addGap(53, 53, 53)
                        .addComponent(JM_jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JM_jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JM_jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JM_txtphNo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JM_jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(JM_btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JM_jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1213, Short.MAX_VALUE)
                .addGap(181, 181, 181))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(JM_jLabel25)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_jLabel1)
                    .addComponent(JM_jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JM_jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(JM_jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JM_jLabel24)
                    .addComponent(JM_jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JM_jLabel11)
                            .addComponent(JM_txtphNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(JM_btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(131, 131, 131))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblNewDonationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNewDonationsMouseClicked
        int selectedRow = tblNewDonations.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showConfirmDialog(null, "Make row selection to view desired details.","Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            VolunteerStorageWorkRequest req = (VolunteerStorageWorkRequest)tblNewDonations.getValueAt(selectedRow, 0);

            autoPopViewDetails(req.getCategory(),req.getQuantity(),req.getDescription());
        }
    }//GEN-LAST:event_tblNewDonationsMouseClicked

    private void JM_btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblNewDonations.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showConfirmDialog(null, "Opt a row from table to place an order.","Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String addr = txtDelAddr.getText();
        if(addr==null || addr.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Address");
            return;
        }
        String phNo = JM_txtphNo.getText();
        if(phNo == null || phNo.equals("")){
            JOptionPane.showMessageDialog(null, "Phone Number cannot be left empty");
            return;
        }
        if(!checkPhoneNo(phNo)){
            JOptionPane.showMessageDialog(null, "Invalid contact no.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        VolunteerStorageWorkRequest req = (VolunteerStorageWorkRequest)tblNewDonations.getValueAt(selectedRow, 0);
        req.setReceiver(ua);
        req.setRecieverAddress(addr);
        req.setRecieverNumber(phNo);
        req.setStatus("Ordered");
        ua.getWorkQueue().getWrList().add(req);
        JOptionPane.showMessageDialog(null, "Order Successfully Placed . \n Your Order Id for the order is "+req.getOrdID());

        autoPopNewDonation();
        
        DefaultTableModel mdl = (DefaultTableModel) tbViewlDetails.getModel();
        mdl.setRowCount(0);
//        DefaultTableModel mdl1 = (DefaultTableModel) tblOrdDetails.getModel();
//        model2.setRowCount(0);

        for(Enterprise ent: net.getEntDir().getEntList())
        {
            if(ent.getEntType().equals(ent.getEntType().Transpotation))
            {
                for (Organisation organisation : ent.getOrgDir().getOrgList())
                {
                    if (organisation instanceof TransportOrg){
                        organisation.getWorkQueue().getWrList().add(req);
                    }
                }
            }
        }

    }//GEN-LAST:event_JM_btnOrderActionPerformed

    private void JM_txtphNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_txtphNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_txtphNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JM_btnOrder;
    private javax.swing.JLabel JM_jLabel1;
    private javax.swing.JLabel JM_jLabel11;
    private javax.swing.JLabel JM_jLabel2;
    private javax.swing.JLabel JM_jLabel24;
    private javax.swing.JLabel JM_jLabel25;
    private javax.swing.JScrollPane JM_jScrollPane5;
    private javax.swing.JScrollPane JM_jScrollPane6;
    private javax.swing.JScrollPane JM_jScrollPane7;
    private javax.swing.JTextField JM_txtphNo;
    private javax.swing.JTable tbViewlDetails;
    private javax.swing.JTable tblNewDonations;
    private javax.swing.JTextArea txtDelAddr;
    // End of variables declaration//GEN-END:variables
}
