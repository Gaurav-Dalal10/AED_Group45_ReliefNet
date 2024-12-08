/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.TutorRole;

import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Organization.DoctorOrg;
import Model.Organization.TutorOrg;
import Model.Organization.Organisation;
import Model.Organization.VolunteerOrg;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.TutorVolunteerWorkReq;
import Model.WorkQueue.LaboratoryTestWorkReq;
import Model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author krishna
 */
public class TutorPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private TutorOrg org;
    private Enterprise ent;
    private UserAccount ua;
    private Network net;

    /**
     * Creates new form TutorPanel
     */
    public TutorPanel(JPanel userProcessContainer, UserAccount acc, TutorOrg org, Enterprise ent, Network net) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.org = org;
        this.ent = ent;
        this.ua = acc;
        this.net = net;
        autoPopReqTbl();

    }
    
    public void autoPopReqTbl(){
        DefaultTableModel mdl = (DefaultTableModel) tblVolReq.getModel();
        
        SimpleDateFormat fmt = new SimpleDateFormat("dd MMM, yyyy");
        mdl.setRowCount(0);
        for (Iterator<WorkRequest> wr = ua.getWorkQueue().getWrList().iterator(); wr.hasNext();) {
            TutorVolunteerWorkReq req = (TutorVolunteerWorkReq) wr.next();
            Object[] row = new Object[6];
            row[0] = req;
            String dt = fmt.format(req.getDate());
            row[1] = dt;
            row[2] = req.getTime();
            row[3] = req.getNumOfVolunteers(); 
            row[4] = req.getVacancy();
            row[5] = req.getStatus();
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

        JM_btnViewReqDetail = new javax.swing.JButton();
        JM_btnNewReq = new javax.swing.JButton();
        JM_jScrollPane1 = new javax.swing.JScrollPane();
        tblVolReq = new javax.swing.JTable();
        JM_btnRefresh = new javax.swing.JButton();
        JM_jLabel1 = new javax.swing.JLabel();
        JM_btnVolList = new javax.swing.JButton();
        JM_btnDeleteReq = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        JM_btnViewReqDetail.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_btnViewReqDetail.setForeground(new java.awt.Color(0, 153, 153));
        JM_btnViewReqDetail.setText("View Request Details");
        JM_btnViewReqDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnViewReqDetailActionPerformed(evt);
            }
        });

        JM_btnNewReq.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_btnNewReq.setForeground(new java.awt.Color(0, 153, 153));
        JM_btnNewReq.setText("Create New Request");
        JM_btnNewReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnNewReqActionPerformed(evt);
            }
        });

        tblVolReq.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 12)); // NOI18N
        tblVolReq.setForeground(new java.awt.Color(102, 0, 102));
        tblVolReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Job Title", "Date", "Time", "No. of Volunteers", "Vacancy", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVolReq.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        JM_jScrollPane1.setViewportView(tblVolReq);

        JM_btnRefresh.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        JM_btnRefresh.setForeground(new java.awt.Color(102, 0, 102));
        JM_btnRefresh.setText("Refresh");
        JM_btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnRefreshActionPerformed(evt);
            }
        });

        JM_jLabel1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        JM_jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JM_jLabel1.setText("Tutor Panel");

        JM_btnVolList.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_btnVolList.setForeground(new java.awt.Color(0, 153, 153));
        JM_btnVolList.setText("Get Volunteers List");
        JM_btnVolList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnVolListActionPerformed(evt);
            }
        });

        JM_btnDeleteReq.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_btnDeleteReq.setForeground(new java.awt.Color(0, 153, 153));
        JM_btnDeleteReq.setText("Delete Request");
        JM_btnDeleteReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnDeleteReqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JM_jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JM_jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JM_btnDeleteReq, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JM_btnNewReq, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JM_btnVolList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JM_btnViewReqDetail, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 376, Short.MAX_VALUE)
                .addComponent(JM_btnRefresh)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(JM_jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(JM_btnRefresh))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(JM_jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JM_btnNewReq, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JM_btnVolList, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JM_btnDeleteReq, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JM_btnViewReqDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(251, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JM_btnViewReqDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnViewReqDetailActionPerformed
        int selectedrow= tblVolReq.getSelectedRow();
        if (selectedrow>=0)
        {
            TutorVolunteerWorkReq req = (TutorVolunteerWorkReq)tblVolReq.getValueAt(selectedrow, 0);
            ViewReqDetailPanel viewReq = new ViewReqDetailPanel(userProcessContainer, req);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("ViewRequestDetailsJPanel",viewReq);
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Make row selection","Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_JM_btnViewReqDetailActionPerformed

    private void JM_btnNewReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnNewReqActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ReqVolunteerPanel", new ReqVolunteerPanel(userProcessContainer, ua, ent));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_JM_btnNewReqActionPerformed

    private void JM_btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnRefreshActionPerformed

        autoPopReqTbl();
    }//GEN-LAST:event_JM_btnRefreshActionPerformed

    private void JM_btnVolListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnVolListActionPerformed

        int selectedrow= tblVolReq.getSelectedRow();
        if (selectedrow>=0)
        {
            TutorVolunteerWorkReq req = (TutorVolunteerWorkReq)tblVolReq.getValueAt(selectedrow, 0);
            ViewReqDetailPanel viewReq = new ViewReqDetailPanel(userProcessContainer, req);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("ViewVolunteersJPanel",viewReq);
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Make row selection","Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_JM_btnVolListActionPerformed

    private void JM_btnDeleteReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnDeleteReqActionPerformed
        int selectedRow = tblVolReq.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "sure about deleting?","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                TutorVolunteerWorkReq req = (TutorVolunteerWorkReq)tblVolReq.getValueAt(selectedRow, 0);

                Organisation org = null;
                for (Organisation organization : ent.getOrgDir().getOrgList()){
                    if (organization instanceof VolunteerOrg){
                        org = organization;
                        break;}}

                if (org!=null){
                    org.getWorkQueue().getWrList().remove(req);
                    ua.getWorkQueue().getWrList().remove(req);
                }
                autoPopReqTbl();

            }
        }else{
            JOptionPane.showMessageDialog(null, "Make row selection");
        }
    }//GEN-LAST:event_JM_btnDeleteReqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JM_btnDeleteReq;
    private javax.swing.JButton JM_btnNewReq;
    private javax.swing.JButton JM_btnRefresh;
    private javax.swing.JButton JM_btnViewReqDetail;
    private javax.swing.JButton JM_btnVolList;
    private javax.swing.JLabel JM_jLabel1;
    private javax.swing.JScrollPane JM_jScrollPane1;
    private javax.swing.JTable tblVolReq;
    // End of variables declaration//GEN-END:variables
}
