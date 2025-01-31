/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.HealthRole;

/**
 *
 * @author gauri
 */

import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Organization.DoctorOrg;
import Model.Organization.HealthOrg;
import Model.Organization.Organisation;
import Model.Organization.PharmacyOrg;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.HospitalDoctorWorkReq;
import Model.WorkQueue.HospitalPharmacyWorkReq;
import Model.WorkQueue.VolunteerStorageWorkRequest;
import Model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import UI.DoctorRole.ProcessPanel;


public class PharmacyWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private HealthOrg org;
    private Enterprise ent;
    private UserAccount ua;
    private Network net;
    
    public PharmacyWorkAreaJPanel(JPanel userProcessContainer, UserAccount acc, Enterprise ent, Network net) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.org = org;
        this.ent = ent;
        this.ua = acc;
        this.net=net;
        populateMedReqTbl();
        System.out.println(ua.getMedicalHistory());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JM_btnrefresh = new javax.swing.JButton();
        JM_jScrollPane1 = new javax.swing.JScrollPane();
        JM_tblmedreq = new javax.swing.JTable();
        JM_btnnewreq = new javax.swing.JButton();
        JM_btndelete = new javax.swing.JButton();
        JM_btnview = new javax.swing.JButton();
        JM_btnBack = new javax.swing.JButton();
        JM_lbltitle = new javax.swing.JLabel();
        JM_lbldelby = new javax.swing.JLabel();
        JM_txtDeliveredBy = new javax.swing.JTextField();
        JM_lbldelcon = new javax.swing.JLabel();
        JM_txtDeliveryContact = new javax.swing.JTextField();
        JM_lbldeldate = new javax.swing.JLabel();
        JM_txtDeliveryDate = new javax.swing.JTextField();
        JM_lblsentby = new javax.swing.JLabel();
        JM_txtSentby = new javax.swing.JTextField();
        JM_lblsendercon = new javax.swing.JLabel();
        JM_txtSenderContact = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 73, 111));
        setForeground(new java.awt.Color(102, 0, 102));

        JM_btnrefresh.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_btnrefresh.setForeground(new java.awt.Color(102, 73, 111));
        JM_btnrefresh.setText("Refresh");
        JM_btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnrefreshActionPerformed(evt);
            }
        });

        JM_jScrollPane1.setBackground(new java.awt.Color(0, 153, 153));

        JM_tblmedreq.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        JM_tblmedreq.setForeground(new java.awt.Color(102, 0, 102));
        JM_tblmedreq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Address", "MedicineList", "Pharmacist", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JM_tblmedreq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JM_tblmedreqMouseClicked(evt);
            }
        });
        JM_jScrollPane1.setViewportView(JM_tblmedreq);

        JM_btnnewreq.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_btnnewreq.setForeground(new java.awt.Color(102, 73, 111));
        JM_btnnewreq.setText("New Request");
        JM_btnnewreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnnewreqActionPerformed(evt);
            }
        });

        JM_btndelete.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_btndelete.setForeground(new java.awt.Color(102, 73, 111));
        JM_btndelete.setText("Delete Request");
        JM_btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btndeleteActionPerformed(evt);
            }
        });

        JM_btnview.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_btnview.setForeground(new java.awt.Color(102, 73, 111));
        JM_btnview.setText("View Status or Updates");
        JM_btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnviewActionPerformed(evt);
            }
        });

        JM_btnBack.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_btnBack.setForeground(new java.awt.Color(102, 73, 111));
        JM_btnBack.setText("<< Back");
        JM_btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnBackActionPerformed(evt);
            }
        });

        JM_lbltitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        JM_lbltitle.setForeground(new java.awt.Color(255, 255, 255));
        JM_lbltitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JM_lbltitle.setText("Request Pharmacy Work Area");

        JM_lbldelby.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_lbldelby.setForeground(new java.awt.Color(255, 255, 255));
        JM_lbldelby.setText("Delivered By");

        JM_txtDeliveredBy.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_txtDeliveredBy.setForeground(new java.awt.Color(102, 0, 102));

        JM_lbldelcon.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_lbldelcon.setForeground(new java.awt.Color(255, 255, 255));
        JM_lbldelcon.setText("Delivery Contact");

        JM_txtDeliveryContact.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_txtDeliveryContact.setForeground(new java.awt.Color(102, 0, 102));

        JM_lbldeldate.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_lbldeldate.setForeground(new java.awt.Color(255, 255, 255));
        JM_lbldeldate.setText("Delivery Date");

        JM_txtDeliveryDate.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_txtDeliveryDate.setForeground(new java.awt.Color(102, 0, 102));

        JM_lblsentby.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_lblsentby.setForeground(new java.awt.Color(255, 255, 255));
        JM_lblsentby.setText("Sent By");

        JM_txtSentby.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_txtSentby.setForeground(new java.awt.Color(102, 0, 102));

        JM_lblsendercon.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_lblsendercon.setForeground(new java.awt.Color(255, 255, 255));
        JM_lblsendercon.setText("Sender Contact");

        JM_txtSenderContact.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_txtSenderContact.setForeground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JM_lbldelby)
                    .addComponent(JM_txtDeliveredBy, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JM_lbldelcon)
                    .addComponent(JM_txtDeliveryContact, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JM_lbldeldate)
                    .addComponent(JM_txtDeliveryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JM_lblsendercon)
                    .addComponent(JM_txtSenderContact, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JM_txtSentby, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(JM_lblsentby)))
                .addContainerGap(432, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JM_btnBack)
                        .addGap(75, 75, 75)
                        .addComponent(JM_lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(JM_btnrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(JM_jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(JM_btnnewreq)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JM_btnview)
                            .addGap(83, 83, 83)
                            .addComponent(JM_btndelete))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JM_btndelete, JM_btnnewreq, JM_btnview});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JM_btnBack)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JM_lbltitle)
                        .addComponent(JM_btnrefresh)))
                .addGap(46, 46, 46)
                .addComponent(JM_jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_btnnewreq, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JM_btnview, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JM_btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_lbldelby)
                    .addComponent(JM_lblsentby))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_txtDeliveredBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JM_txtSentby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_lbldelcon)
                    .addComponent(JM_lblsendercon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_txtDeliveryContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JM_txtSenderContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JM_lbldeldate)
                .addGap(18, 18, 18)
                .addComponent(JM_txtDeliveryDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {JM_btndelete, JM_btnnewreq, JM_btnview});

    }// </editor-fold>//GEN-END:initComponents

    private void JM_btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnrefreshActionPerformed

        populateMedReqTbl();
        JM_txtDeliveredBy.setText("");
        JM_txtDeliveryContact.setText("");
        JM_txtDeliveryDate.setText("");
        JM_txtSenderContact.setText("");
        JM_txtSentby.setText("");
    }//GEN-LAST:event_JM_btnrefreshActionPerformed

    private void JM_tblmedreqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JM_tblmedreqMouseClicked
        int selectedRow = JM_tblmedreq.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showConfirmDialog(null, "Please select a row from table to view details.!","Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{

            WorkRequest w = (WorkRequest) JM_tblmedreq.getValueAt(selectedRow, 0);
            HospitalPharmacyWorkReq wr = (HospitalPharmacyWorkReq) w;

            JM_txtDeliveredBy.setText(wr.getDelivery().getEmp().getName());
            JM_txtDeliveryContact.setText(wr.getDeliveryNo());
            SimpleDateFormat formatter = new SimpleDateFormat("dd MMM, yyyy");
            Date date = wr.getExpectedDelivery();
            String pickDate = formatter.format(date);
            JM_txtDeliveryDate.setText(pickDate);
            JM_txtSenderContact.setText(wr.getRecieverNo());
            JM_txtSentby.setText(wr.getReceiver().getEmp().getName());

        }
    }//GEN-LAST:event_JM_tblmedreqMouseClicked

    private void JM_btnnewreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnnewreqActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("PharmacyReqJPanel", new PharmacyReqJPanel(userProcessContainer, ua, ent, net));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_JM_btnnewreqActionPerformed

    private void JM_btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btndeleteActionPerformed
        int selectedRow = JM_tblmedreq.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Do you want to Delete this request??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                HospitalPharmacyWorkReq request = (HospitalPharmacyWorkReq)JM_tblmedreq.getValueAt(selectedRow, 0);
                if(request.getStatus().equalsIgnoreCase("completed"))
                {
                    JOptionPane.showMessageDialog(null, "Completed Request Cannot be deleted.");
                    return;
                }
                Organisation org = null;
                for(Enterprise ent: net.getEntDir().getEntList())
                {
                    if(ent.getEntType().equals(ent.getEntType().Hospital))
                    {
                        for (Organisation organization : ent.getOrgDir().getOrgList())
                        {
                            if (organization instanceof PharmacyOrg){
                                org = organization;
                                org.getWorkQueue().getWrList().remove(request);

                                for(UserAccount a : org.getUserAccDir().getUserAccList())
                                {
                                    for(WorkRequest w: a.getWorkQueue().getWrList())
                                    {
                                        if(w.equals(request))
                                        {
                                            a.getWorkQueue().getWrList().remove(request);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                if (org!=null){
                    ua.getWorkQueue().getWrList().remove(request);
                }
                populateMedReqTbl();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_JM_btndeleteActionPerformed

    private void JM_btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnviewActionPerformed
        // TODO add your handling code here:
        int selectedRow = JM_tblmedreq.getSelectedRow();
        if(selectedRow>=0)
        {
            HospitalPharmacyWorkReq req = (HospitalPharmacyWorkReq)JM_tblmedreq.getValueAt(selectedRow, 0);
            if(req.getStatus().equalsIgnoreCase("Sent"))
            {
                JOptionPane.showMessageDialog(null, "Updates unavailable");
                return;
            }
            ViewStatusInfoJPanel viewStatusInfoJPanel = new ViewStatusInfoJPanel(userProcessContainer,ent,ua,req);
            userProcessContainer.add("ViewStatusJPanel", viewStatusInfoJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Select a Row");
        }

    }//GEN-LAST:event_JM_btnviewActionPerformed

    private void JM_btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_JM_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JM_btnBack;
    private javax.swing.JButton JM_btndelete;
    private javax.swing.JButton JM_btnnewreq;
    private javax.swing.JButton JM_btnrefresh;
    private javax.swing.JButton JM_btnview;
    private javax.swing.JScrollPane JM_jScrollPane1;
    private javax.swing.JLabel JM_lbldelby;
    private javax.swing.JLabel JM_lbldelcon;
    private javax.swing.JLabel JM_lbldeldate;
    private javax.swing.JLabel JM_lblsendercon;
    private javax.swing.JLabel JM_lblsentby;
    private javax.swing.JLabel JM_lbltitle;
    private javax.swing.JTable JM_tblmedreq;
    private javax.swing.JTextField JM_txtDeliveredBy;
    private javax.swing.JTextField JM_txtDeliveryContact;
    private javax.swing.JTextField JM_txtDeliveryDate;
    private javax.swing.JTextField JM_txtSenderContact;
    private javax.swing.JTextField JM_txtSentby;
    // End of variables declaration//GEN-END:variables
public void populateMedReqTbl() {
       DefaultTableModel mdl = (DefaultTableModel) JM_tblmedreq.getModel();
       mdl.setRowCount(0);
       for (Iterator<WorkRequest> it = ua.getWorkQueue().getWrList().iterator(); it.hasNext();) 
       {
           WorkRequest wrReq = it.next();
           if(wrReq instanceof HospitalPharmacyWorkReq){
           HospitalPharmacyWorkReq req = (HospitalPharmacyWorkReq) wrReq;
           Object[] row = new Object[5];
           row[0] = req;
           row[1]=req.getAddress();
           row[2]=req.getMedList();
           row[3] = req.getReceiver();
           row[4] = req.getStatus();
           mdl.addRow(row);
           }
           
       }
}

}
