/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.TutorRole;

import Model.WorkQueue.TutorVolunteerWorkReq;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
/**
 *
 * @author Hp
 */
public class ViewReqDetailPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private TutorVolunteerWorkReq req;
    /**
     * Creates new form ViewReqDetailPanel
     */
    public ViewReqDetailPanel(JPanel userProcessContainer, TutorVolunteerWorkReq req) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.req = req;
        autoPopReq();
    }
    
    private void autoPopReq(){
        
            JM_txtTitle.setText(req.getTitle());
            JM_dtChoser.setDate(req.getDate());

            Date time = null;
            String volTime = req.getTime();
            SimpleDateFormat defaultfmt = new SimpleDateFormat("HH:mm");

            try {
                time = defaultfmt.parse(volTime);
            } catch (ParseException ex) {

            }

            JM_tsTime.setValue(time);

            JM_txtNoOfVol.setText(String.valueOf(req.getNumOfVolunteers()));
            JM_txtNoOfHrs.setText(req.getNumOfhours());
            txtRequirements.setText(req.getMessage());
            JM_txtPlace.setText(req.getAddress());
            JM_txtArea.setText(req.getArea());
            JM_txtNoOfStud.setText(String.valueOf(req.getNumOfStudents()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JM_dtChoser = new com.toedter.calendar.JDateChooser();
        JM_jLabel5 = new javax.swing.JLabel();
        JM_jLabel3 = new javax.swing.JLabel();
        JM_jLabel1 = new javax.swing.JLabel();
        JM_txtTitle = new javax.swing.JTextField();
        JM_txtNoOfHrs = new javax.swing.JTextField();
        JM_jLabel2 = new javax.swing.JLabel();
        JM_txtNoOfStud = new javax.swing.JTextField();
        JM_btnBack = new javax.swing.JButton();
        JM_jLabel9 = new javax.swing.JLabel();
        JM_txtArea = new javax.swing.JTextField();
        JM_txtNoOfVol = new javax.swing.JTextField();
        JM_jLabel11 = new javax.swing.JLabel();
        JM_jLabel10 = new javax.swing.JLabel();
        JM_jLabel4 = new javax.swing.JLabel();
        JM_jLabel8 = new javax.swing.JLabel();
        JM_txtPlace = new javax.swing.JTextField();
        JM_jScrollPane1 = new javax.swing.JScrollPane();
        txtRequirements = new javax.swing.JTextArea();
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        JM_tsTime = new javax.swing.JSpinner(sm);
        JM_btnSave = new javax.swing.JButton();
        JM_jLabel7 = new javax.swing.JLabel();
        JM_btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 73, 111));
        setForeground(new java.awt.Color(102, 0, 102));

        JM_dtChoser.setEnabled(false);
        JM_dtChoser.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N

        JM_jLabel5.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JM_jLabel5.setText("Number of Residents:");

        JM_jLabel3.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel3.setText("Date:");

        JM_jLabel1.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JM_jLabel1.setText("Task Description:");

        JM_txtTitle.setEditable(false);
        JM_txtTitle.setBackground(new java.awt.Color(255, 255, 255));
        JM_txtTitle.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_txtTitle.setForeground(new java.awt.Color(102, 0, 102));

        JM_txtNoOfHrs.setEditable(false);
        JM_txtNoOfHrs.setBackground(new java.awt.Color(255, 255, 255));
        JM_txtNoOfHrs.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_txtNoOfHrs.setForeground(new java.awt.Color(102, 0, 102));
        JM_txtNoOfHrs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_txtNoOfHrsActionPerformed(evt);
            }
        });

        JM_jLabel2.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JM_jLabel2.setText("TaskTitle:");

        JM_txtNoOfStud.setEditable(false);
        JM_txtNoOfStud.setBackground(new java.awt.Color(255, 255, 255));
        JM_txtNoOfStud.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_txtNoOfStud.setForeground(new java.awt.Color(102, 0, 102));
        JM_txtNoOfStud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_txtNoOfStudActionPerformed(evt);
            }
        });

        JM_btnBack.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_btnBack.setForeground(new java.awt.Color(102, 73, 111));
        JM_btnBack.setText("<< Back");
        JM_btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnBackActionPerformed(evt);
            }
        });

        JM_jLabel9.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JM_jLabel9.setText("Number of Students:");

        JM_txtArea.setEditable(false);
        JM_txtArea.setBackground(new java.awt.Color(255, 255, 255));
        JM_txtArea.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_txtArea.setForeground(new java.awt.Color(102, 0, 102));

        JM_txtNoOfVol.setEditable(false);
        JM_txtNoOfVol.setBackground(new java.awt.Color(255, 255, 255));
        JM_txtNoOfVol.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_txtNoOfVol.setForeground(new java.awt.Color(102, 0, 102));

        JM_jLabel11.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JM_jLabel11.setText("Area:");

        JM_jLabel10.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        JM_jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JM_jLabel10.setText("Housing Task Details");

        JM_jLabel4.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JM_jLabel4.setText("Number of Hours:");

        JM_jLabel8.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        JM_jLabel8.setText("Shelter Location:");

        JM_txtPlace.setEditable(false);
        JM_txtPlace.setBackground(new java.awt.Color(255, 255, 255));
        JM_txtPlace.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_txtPlace.setForeground(new java.awt.Color(102, 0, 102));

        txtRequirements.setEditable(false);
        txtRequirements.setColumns(20);
        txtRequirements.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtRequirements.setForeground(new java.awt.Color(102, 0, 102));
        txtRequirements.setRows(5);
        JM_jScrollPane1.setViewportView(txtRequirements);

        JSpinner.DateEditor de = new JSpinner.DateEditor(JM_tsTime, "HH:mm");
        JM_tsTime.setEditor(de);
        JM_tsTime.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        JM_tsTime.setEnabled(false);

        JM_btnSave.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_btnSave.setForeground(new java.awt.Color(102, 73, 111));
        JM_btnSave.setText("SAVE");
        JM_btnSave.setEnabled(false);
        JM_btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnSaveActionPerformed(evt);
            }
        });

        JM_jLabel7.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel7.setText("Time: ");

        JM_btnUpdate.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_btnUpdate.setForeground(new java.awt.Color(102, 73, 111));
        JM_btnUpdate.setText("UPDATE");
        JM_btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(JM_btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JM_jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JM_jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JM_jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JM_jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JM_jLabel7)
                                        .addComponent(JM_jLabel3))
                                    .addComponent(JM_jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JM_jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JM_jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JM_jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JM_dtChoser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JM_txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JM_tsTime, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JM_txtPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JM_txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JM_txtNoOfVol, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JM_txtNoOfStud, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JM_jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(JM_txtNoOfHrs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(476, 476, 476)
                        .addComponent(JM_btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(JM_btnSave)))
                .addGap(224, 224, 224))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JM_btnSave, JM_btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(JM_jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(JM_btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_jLabel2)
                    .addComponent(JM_txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JM_jLabel3)
                    .addComponent(JM_dtChoser, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_tsTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JM_jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_txtPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JM_jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JM_jLabel11)
                    .addComponent(JM_txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JM_jLabel5)
                    .addComponent(JM_txtNoOfVol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_jLabel9)
                    .addComponent(JM_txtNoOfStud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JM_jLabel4)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JM_txtNoOfHrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JM_jLabel1)
                    .addComponent(JM_jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JM_btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JM_btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {JM_btnSave, JM_btnUpdate});

    }// </editor-fold>//GEN-END:initComponents

    private void JM_txtNoOfHrsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_txtNoOfHrsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_txtNoOfHrsActionPerformed

    private void JM_txtNoOfStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_txtNoOfStudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_txtNoOfStudActionPerformed

    private void JM_btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TutorPanel tutorPanel = (TutorPanel) component;
        tutorPanel.autoPopReqTbl();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_JM_btnBackActionPerformed

    private void JM_btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnSaveActionPerformed
        // TODO add your handling code here:

        String title = JM_txtTitle.getText();
        if(title == null || title.equals("")){
            JOptionPane.showMessageDialog(null, "Job Title mandatory.");
            return;
        }
        req.setTitle(title);

        Date dt = JM_dtChoser.getDate();
        if(dt == null || dt.equals("")){
            JOptionPane.showMessageDialog(null, "Date mandatory.");
            return;
        }
        if(dt.before(new Date())){
            JOptionPane.showMessageDialog(null, "Date should be valid");
            return;
        }
        req.setDate(dt);

        SimpleDateFormat fmt = new SimpleDateFormat("HH:mm");

        Date time =  (Date) JM_tsTime.getValue();
        String volTime = fmt.format(time);
        if(volTime == null || volTime.equals("")){
            JOptionPane.showMessageDialog(null, "Time field mandatory");
            return;
        }
        req.setTime(volTime);

        String volPlace = JM_txtPlace.getText();
        if(volPlace == null || volPlace.equals("")){
            JOptionPane.showMessageDialog(null, "Place field mandatory.");
            return;
        }
        req.setAddress(volPlace);

        String volArea = JM_txtArea.getText();
        if(volArea == null || volArea.equals("")){
            JOptionPane.showMessageDialog(null, "Area field mandatory.");
            return;
        }
        req.setArea(volArea);

        String noOfHrs = JM_txtNoOfHrs.getText();
        if(noOfHrs == null || noOfHrs.equals("")){
            JOptionPane.showMessageDialog(null, "Number of Hours field mandatory");
            return;
        }
        req.setNumOfhours(noOfHrs);

        String stud = JM_txtNoOfStud.getText();
        if(stud == null || stud.equals("")){
            JOptionPane.showMessageDialog(null, "Number of Students field mandatory.");
            return;
        }

        try {

            Integer.parseInt(stud);

        } catch (NumberFormatException e){

            JOptionPane.showMessageDialog(null, "Please enter a valid number for Number Of Students field.");
            return;
        }
        Integer noOfStud = Integer.parseInt(stud);
        if(noOfStud<=0)
        {
            JOptionPane.showMessageDialog(null, "Number of students should not be less than or equal to zero.");
            return;
        }
        req.setNumOfStudents(noOfStud);

        String noOfVol = JM_txtNoOfVol.getText();
        if(noOfVol == null || noOfVol.equals("")){
            JOptionPane.showMessageDialog(null, "Number of Volunteers field mandatory");
            return;
        }

        try {

            Integer.parseInt(noOfVol);

        } catch (NumberFormatException e){

            JOptionPane.showMessageDialog(null, "Please enter a valid number for Number Of Volunteers field");
            return;
        }
        Integer numbVol = Integer.parseInt(noOfVol);
        if(numbVol<=0)
        {
            JOptionPane.showMessageDialog(null, "Number of volunteers should not be less than or equal to zero.");
            return;
        }

        int curVol = req.getNumOfVolunteers();
        int vacancy = req.getVacancy();

        int assigned = curVol - vacancy;
        if(numbVol < assigned){

            JOptionPane.showMessageDialog(null, "Number of volunteers should be greater than already assigned volunteers.");
            return;

        }

        req.setNumOfVolunteers(numbVol);
        req.setVacancy(req.getNumOfVolunteers()-curVol+vacancy);

        String requirements = txtRequirements.getText();
        if(requirements == null || requirements.equals("")){
            JOptionPane.showMessageDialog(null, "Requirements field mandatory.");
            return;
        }

        if(req.getVacancy()== 0){
            req.setStatus("Completed");
        }
        else if(req.getVacancy()== req.getNumOfVolunteers()){
            req.setStatus("Sent");
        }
        else{
            req.setStatus("Pending");
        }

        JOptionPane.showMessageDialog(null, "Successful updation of request details.");

        JM_txtTitle.setEditable(false);
        JM_txtPlace.setEditable(false);
        JM_txtNoOfVol.setEditable(false);
        JM_txtNoOfStud.setEditable(false);
        JM_txtNoOfHrs.setEditable(false);
        txtRequirements.setEditable(false);
        JM_dtChoser.setEnabled(false);
        JM_tsTime.setEnabled(false);
        JM_txtArea.setEditable(false);
        JM_btnUpdate.setEnabled(true);
        JM_btnSave.setEnabled(false);

    }//GEN-LAST:event_JM_btnSaveActionPerformed

    private void JM_btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnUpdateActionPerformed
        // TODO add your handling code here:
        JM_txtTitle.setEditable(true);
        JM_txtPlace.setEditable(true);
        JM_txtNoOfVol.setEditable(true);
        JM_txtNoOfStud.setEditable(true);
        JM_txtNoOfHrs.setEditable(true);
        txtRequirements.setEditable(true);
        JM_dtChoser.setEnabled(true);
        JM_tsTime.setEnabled(true);
        JM_txtArea.setEditable(true);
        JM_btnUpdate.setEnabled(false);
        JM_btnSave.setEnabled(true);

    }//GEN-LAST:event_JM_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JM_btnBack;
    private javax.swing.JButton JM_btnSave;
    private javax.swing.JButton JM_btnUpdate;
    private com.toedter.calendar.JDateChooser JM_dtChoser;
    private javax.swing.JLabel JM_jLabel1;
    private javax.swing.JLabel JM_jLabel10;
    private javax.swing.JLabel JM_jLabel11;
    private javax.swing.JLabel JM_jLabel2;
    private javax.swing.JLabel JM_jLabel3;
    private javax.swing.JLabel JM_jLabel4;
    private javax.swing.JLabel JM_jLabel5;
    private javax.swing.JLabel JM_jLabel7;
    private javax.swing.JLabel JM_jLabel8;
    private javax.swing.JLabel JM_jLabel9;
    private javax.swing.JScrollPane JM_jScrollPane1;
    private javax.swing.JSpinner JM_tsTime;
    private javax.swing.JTextField JM_txtArea;
    private javax.swing.JTextField JM_txtNoOfHrs;
    private javax.swing.JTextField JM_txtNoOfStud;
    private javax.swing.JTextField JM_txtNoOfVol;
    private javax.swing.JTextField JM_txtPlace;
    private javax.swing.JTextField JM_txtTitle;
    private javax.swing.JTextArea txtRequirements;
    // End of variables declaration//GEN-END:variables
}
