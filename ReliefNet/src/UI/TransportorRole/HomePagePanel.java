/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.TransportorRole;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.Organisation;
import Model.Organization.TransportOrg;
//import Business.Organization.VolunteerOrg;
import Model.Role.TransportorRole;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.TutorVolunteerWorkReq;
import Model.WorkQueue.HospitalPharmacyWorkReq;
import Model.WorkQueue.VolunteerStorageWorkRequest;
import Model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krishna
 */
public class HomePagePanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount ua;
    private Enterprise ent;
    private TransportOrg org;
    /**
     * Creates new form HomePage
     */
    public HomePagePanel(JPanel userProcessContainer, UserAccount acc, Organisation org,  EcoSystem system, Enterprise ent) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ua = acc;
        this.system = system;
        this.ent = ent;
        this.org = (TransportOrg) org;
        autoPopOrders();
    }
    
    public void autoPopOrders(){    
        DefaultTableModel mdl = (DefaultTableModel) tblOrders.getModel();
        
        mdl.setRowCount(0);

        for (Iterator<WorkRequest> wr = org.getWorkQueue().getWrList().iterator(); wr.hasNext();) {
            WorkRequest workRequest = (WorkRequest) wr.next();
            if(workRequest instanceof VolunteerStorageWorkRequest){
                VolunteerStorageWorkRequest req = (VolunteerStorageWorkRequest) workRequest;
                if(req.getStatus().equalsIgnoreCase("Ordered")){
                    Object[] row = new Object[5];
                    row[0]= req;
                    row[1]=req.getSenderAddress();
                    row[2]= req.getRecieverAddress();
                    row[3] = req.getStatus();
                    mdl.addRow(row);
                }
            }else{
                HospitalPharmacyWorkReq req = (HospitalPharmacyWorkReq) workRequest;
                if(req.getStatus().equalsIgnoreCase("Delivery Requested")){
                    Object[] row = new Object[5];
                    row[0]= req;
                    row[2]= req.getSenderAdd();
                    row[1]= req.getRecieverAdd();
                    row[3] = req.getStatus();
                    mdl.addRow(row);
                }
            }
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
        JM_jScrollPane1 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        JM_jLabel3 = new javax.swing.JLabel();
        JM_dtPickup = new com.toedter.calendar.JDateChooser();
        JM_jLabel4 = new javax.swing.JLabel();
        JM_dtDeliver = new com.toedter.calendar.JDateChooser();
        JM_jLabel5 = new javax.swing.JLabel();
        JM_txtPhNo = new javax.swing.JTextField();
        JM_jLabel1 = new javax.swing.JLabel();
        JM_jScrollPane2 = new javax.swing.JScrollPane();
        txtSenderAddr = new javax.swing.JTextArea();
        JM_jLabel2 = new javax.swing.JLabel();
        JM_jScrollPane3 = new javax.swing.JScrollPane();
        txtReceiverAddr = new javax.swing.JTextArea();
        JM_btnBack = new javax.swing.JButton();
        JM_btnAssignToMe = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setForeground(new java.awt.Color(102, 0, 102));

        JM_jLabel25.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        JM_jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JM_jLabel25.setText("Delivery Work Area");

        tblOrders.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        tblOrders.setForeground(new java.awt.Color(102, 0, 102));
        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Sender Address", "Reciever Address", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrdersMouseClicked(evt);
            }
        });
        JM_jScrollPane1.setViewportView(tblOrders);

        JM_jLabel3.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel3.setText("PickUp Date");

        JM_dtPickup.setForeground(new java.awt.Color(102, 0, 102));
        JM_dtPickup.setToolTipText("");
        JM_dtPickup.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        JM_jLabel4.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel4.setText("Delivery Date");

        JM_dtDeliver.setForeground(new java.awt.Color(102, 0, 102));
        JM_dtDeliver.setToolTipText("");
        JM_dtDeliver.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        JM_jLabel5.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel5.setText("Contact Number");

        JM_txtPhNo.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_txtPhNo.setForeground(new java.awt.Color(102, 0, 102));
        JM_txtPhNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_txtPhNoActionPerformed(evt);
            }
        });

        JM_jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel1.setText("Sender Address");

        txtSenderAddr.setBackground(new java.awt.Color(204, 204, 204));
        txtSenderAddr.setColumns(20);
        txtSenderAddr.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtSenderAddr.setForeground(new java.awt.Color(102, 0, 102));
        txtSenderAddr.setRows(5);
        JM_jScrollPane2.setViewportView(txtSenderAddr);

        JM_jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel2.setText("Reciever Address ");

        txtReceiverAddr.setBackground(new java.awt.Color(204, 204, 204));
        txtReceiverAddr.setColumns(20);
        txtReceiverAddr.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtReceiverAddr.setForeground(new java.awt.Color(102, 0, 102));
        txtReceiverAddr.setRows(5);
        JM_jScrollPane3.setViewportView(txtReceiverAddr);

        JM_btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        JM_btnBack.setForeground(new java.awt.Color(0, 153, 153));
        JM_btnBack.setText("<<<Back");
        JM_btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnBackActionPerformed(evt);
            }
        });

        JM_btnAssignToMe.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_btnAssignToMe.setForeground(new java.awt.Color(0, 153, 153));
        JM_btnAssignToMe.setText("Assign to me");
        JM_btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnAssignToMeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JM_jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 1388, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(698, 698, 698)
                        .addComponent(JM_jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JM_jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)
                        .addComponent(JM_jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(JM_jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(JM_jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JM_dtDeliver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JM_dtPickup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JM_jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 697, Short.MAX_VALUE)
                                    .addComponent(JM_txtPhNo)))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(JM_jLabel1)
                .addGap(387, 387, 387)
                .addComponent(JM_jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JM_btnAssignToMe)
                .addGap(160, 160, 160))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(JM_btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(JM_jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(JM_jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(JM_dtPickup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JM_jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JM_dtDeliver, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(JM_jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JM_txtPhNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 78, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(JM_btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JM_jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_jLabel1)
                    .addComponent(JM_jLabel2)
                    .addComponent(JM_btnAssignToMe, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JM_jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JM_jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrdersMouseClicked

        int selectedRow = tblOrders.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showConfirmDialog(null, "Make a row selection from the table to view desired details.","Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            WorkRequest wr = (WorkRequest) tblOrders.getValueAt(selectedRow, 0);
            if(wr instanceof VolunteerStorageWorkRequest){
                VolunteerStorageWorkRequest workRequest =(VolunteerStorageWorkRequest) wr;
                txtReceiverAddr.setText(workRequest.getRecieverAddress());
                txtSenderAddr.setText(workRequest.getSenderAddress());
            }else{
                HospitalPharmacyWorkReq workRequest =(HospitalPharmacyWorkReq) wr;
                txtSenderAddr.setText(workRequest.getRecieverAdd());
                txtReceiverAddr.setText(workRequest.getSenderAdd());
            }

        }
    }//GEN-LAST:event_tblOrdersMouseClicked

    private void JM_txtPhNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_txtPhNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_txtPhNoActionPerformed

    private void JM_btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnAssignToMeActionPerformed

        int selectedRow = tblOrders.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showConfirmDialog(null, "For request assignment select a row from table.","Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{

            WorkRequest wr = (WorkRequest)tblOrders.getValueAt(selectedRow, 0);
            if(wr instanceof VolunteerStorageWorkRequest){
                VolunteerStorageWorkRequest req = (VolunteerStorageWorkRequest) wr;

                Date pickupDate = JM_dtPickup.getDate();
                if(pickupDate == null || pickupDate.equals("")){
                    JOptionPane.showMessageDialog(null, "Pick Up Date mandatory.");
                    return;
                }
                if(pickupDate.before(new Date())){
                    JOptionPane.showMessageDialog(null, "Enter valid date only.");
                    return;
                }

                req.setPickupDate(pickupDate);

                Date deliverDt = JM_dtDeliver.getDate();
                if(deliverDt == null || deliverDt.equals("")){
                    JOptionPane.showMessageDialog(null, "Delivery Date mandatory.");
                    return;
                }
                if(deliverDt.before(new Date())){
                    JOptionPane.showMessageDialog(null, "Enter valid date only.");
                    return;
                }
                SimpleDateFormat fmt = new SimpleDateFormat("dd/mm/yyyy");
                String delDtStr = fmt.format(deliverDt);
                String pickDtStr = fmt.format(pickupDate);
                if(delDtStr.compareTo(pickDtStr)<0){
                    JOptionPane.showMessageDialog(null, "Can't set delivery date prior to pickupdate.");
                    return;
                }
                req.setExpectedDelivery(deliverDt);

                String phNo = JM_txtPhNo.getText();
                if(phNo == null || phNo.equals("")){
                    JOptionPane.showMessageDialog(null, "Contact Number mandatory.");
                    return;
                }
                if(!checkPhoneNo(phNo)){
                    JOptionPane.showMessageDialog(null, "Invalid Contact Number.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                req.setDeliveryNumber(phNo);

                req.setDelivery(ua);
                ua.getWorkQueue().getWrList().add(req);
                req.setStatus("Delivery Assigned");
                JM_txtPhNo.setText("");
                txtSenderAddr.setText("");
                txtReceiverAddr.setText("");
                JM_dtPickup.setDate(null);
                JM_dtDeliver.setDate(null);
                JOptionPane.showMessageDialog(null, "Delivery Request assignment successful.");

                autoPopOrders();
            }
            else{
                HospitalPharmacyWorkReq req = (HospitalPharmacyWorkReq) wr;
                Date pickupDate = JM_dtPickup.getDate();
                if(pickupDate == null || pickupDate.equals("")){
                    JOptionPane.showMessageDialog(null, "Pick Up Date Mandatory.");
                    return;
                }
                req.setPickupDate(pickupDate);

                Date deliverDt = JM_dtDeliver.getDate();
                if(deliverDt == null || deliverDt.equals("")){
                    JOptionPane.showMessageDialog(null, "Delivery Date Mandatory.");
                    return;
                }
                req.setExpectedDelivery(deliverDt);

                String phNo = JM_txtPhNo.getText();
                if(phNo == null || phNo.equals("")){
                    JOptionPane.showMessageDialog(null, "Contact Number Mandatory");
                    return;
                }
                if(!checkPhoneNo(phNo)){
                    JOptionPane.showMessageDialog(null, "Enter valid phone number", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                req.setDeliveryNo(phNo);

                req.setDelivery(ua);
                ua.getWorkQueue().getWrList().add(req);
                req.setStatus("Delivery Assigned");
                JM_txtPhNo.setText("");
                txtSenderAddr.setText("");
                txtReceiverAddr.setText("");
                JM_dtPickup.setDate(null);
                JM_dtDeliver.setDate(null);
                JOptionPane.showMessageDialog(null, "Delivery Request Assignment Successful");

                autoPopOrders();
            }
        }
    }//GEN-LAST:event_JM_btnAssignToMeActionPerformed

    private void JM_btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_JM_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JM_btnAssignToMe;
    private javax.swing.JButton JM_btnBack;
    private com.toedter.calendar.JDateChooser JM_dtDeliver;
    private com.toedter.calendar.JDateChooser JM_dtPickup;
    private javax.swing.JLabel JM_jLabel1;
    private javax.swing.JLabel JM_jLabel2;
    private javax.swing.JLabel JM_jLabel25;
    private javax.swing.JLabel JM_jLabel3;
    private javax.swing.JLabel JM_jLabel4;
    private javax.swing.JLabel JM_jLabel5;
    private javax.swing.JScrollPane JM_jScrollPane1;
    private javax.swing.JScrollPane JM_jScrollPane2;
    private javax.swing.JScrollPane JM_jScrollPane3;
    private javax.swing.JTextField JM_txtPhNo;
    private javax.swing.JTable tblOrders;
    private javax.swing.JTextArea txtReceiverAddr;
    private javax.swing.JTextArea txtSenderAddr;
    // End of variables declaration//GEN-END:variables
}
