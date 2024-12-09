/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.TutorRole;

import Model.UserAccount.UserAccount;
import Model.WorkQueue.TutorVolunteerWorkReq;
import java.awt.CardLayout;
import java.awt.Component;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author krishna
 */
public class ViewVolPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private TutorVolunteerWorkReq req;
    /**
     * Creates new form ViewVolOanel
     */
    public ViewVolPanel(JPanel userProcessContainer, TutorVolunteerWorkReq req) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.req = req;
        autoPopVol();
    }
    
    private void autoPopVol(){
        
        DefaultTableModel mdl = (DefaultTableModel) tblVolList.getModel();
       
        mdl.setRowCount(0);
        for (Iterator<UserAccount> wr = req.getUsersList().iterator(); wr.hasNext();) {
            UserAccount ua = (UserAccount) wr.next();
            Object[] row = new Object[5];
            row[0] = ua;
            row[1] = ua.getEmp().getSex();
            
             LocalDate nowDate = LocalDate.now();
             LocalDate dob = ua.getEmp().getDob();
             int age = ua.getEmp().ageCalculator(dob, nowDate);
             
            row[2] = age;
            row[3] = ua.getEmp().getEmail(); 
            row[4] = ua.getEmp().getPhNo();
            mdl.addRow(row);
        }
        
    }

    private void autoPopBlanks(){
        
            JM_txtName.setText("");
            JM_txtSex.setText("");
            JM_txtAge.setText("");
            JM_txtEmail.setText("");
            JM_txtPhNo.setText("");
            txtAddress.setText("");
            JM_txtCity.setText("");
            JM_txtPincode.setText("");
            txtSkills.setText("");
            txtEducation.setText("");
            txtLanguage.setText("");
            JM_txtEnglish.setText("");
            JM_chbEmail.setSelected(false);
            JM_chbExcel.setSelected(false);
            JM_chbPowerPoint.setSelected(false);
            JM_chbWord.setSelected(false);
            JM_chbWeb.setSelected(false);
        
    }
    
    private void autoPopVolDetails(UserAccount ua){
        
            JM_txtName.setText(ua.getEmp().getName());
            JM_txtSex.setText(ua.getEmp().getSex());
            
             LocalDate nowDate = LocalDate.now();
             LocalDate birthdate = ua.getEmp().getDob();
             int age = ua.getEmp().ageCalculator(birthdate, nowDate);
             JM_txtAge.setText(String.valueOf(age));
            
            JM_txtAge.setText(String.valueOf(age));
            JM_txtEmail.setText(ua.getEmp().getEmail());
            JM_txtPhNo.setText(ua.getEmp().getPhNo());
            txtAddress.setText(ua.getVolunteer().getAddress());
            JM_txtPincode.setText(ua.getVolunteer().getPincode());
            txtSkills.setText(ua.getVolunteer().getSkills());
            JM_txtEnglish.setText(ua.getVolunteer().getEngProficent());
            
            autoPopLanguage(ua);
            autoPopEducation(ua);
            
            if(ua.getVolunteer().getExpertise().contains("MS Word")){
                JM_chbWord.setSelected(true);
            }
            if(ua.getVolunteer().getExpertise().contains("MS Excel")){
                JM_chbExcel.setSelected(true);
            }
            if(ua.getVolunteer().getExpertise().contains("PowerPoint")){
                JM_chbPowerPoint.setSelected(true);
            }
            if(ua.getVolunteer().getExpertise().contains("Web Browsing")){
                JM_chbWeb.setSelected(true);
            }
            if(ua.getVolunteer().getExpertise().contains("Email Checking")){
                JM_chbEmail.setSelected(true);
            }   
    }
    
    private void autoPopLanguage(UserAccount ua){
        
        for(String lang: ua.getVolunteer().getLanguages()){
                 txtLanguage.append(lang + "\n");
            }
    }
    
    private void autoPopEducation(UserAccount ua){
        txtEducation.setText("");
        int cnt = 1;
        for(Map.Entry<String,String> entry : ua.getVolunteer().getEduList().entrySet()){
            txtEducation.append(cnt + ".  " + entry.getKey() + " " + entry.getValue() + "\n");
            cnt++;
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

        JM_jLabel9 = new javax.swing.JLabel();
        JM_jLabel20 = new javax.swing.JLabel();
        JM_txtName = new javax.swing.JTextField();
        JM_jLabel1 = new javax.swing.JLabel();
        JM_jScrollPane4 = new javax.swing.JScrollPane();
        txtSkills = new javax.swing.JTextArea();
        JM_jLabel8 = new javax.swing.JLabel();
        JM_jLabel10 = new javax.swing.JLabel();
        JM_txtAge = new javax.swing.JTextField();
        JM_btnDecline = new javax.swing.JButton();
        JM_jLabel3 = new javax.swing.JLabel();
        JM_txtSex = new javax.swing.JTextField();
        JM_jScrollPane1 = new javax.swing.JScrollPane();
        tblVolList = new javax.swing.JTable();
        JM_jLabel2 = new javax.swing.JLabel();
        JM_jLabel21 = new javax.swing.JLabel();
        JM_chbPowerPoint = new javax.swing.JCheckBox();
        JM_chbEmail = new javax.swing.JCheckBox();
        JM_chbWeb = new javax.swing.JCheckBox();
        JM_jLabel17 = new javax.swing.JLabel();
        JM_jLabel15 = new javax.swing.JLabel();
        JM_txtPincode = new javax.swing.JTextField();
        JM_txtCity = new javax.swing.JTextField();
        JM_jLabel18 = new javax.swing.JLabel();
        JM_jLabel14 = new javax.swing.JLabel();
        JM_jLabel19 = new javax.swing.JLabel();
        JM_jScrollPane5 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        JM_jScrollPane3 = new javax.swing.JScrollPane();
        txtLanguage = new javax.swing.JTextArea();
        JM_jLabel13 = new javax.swing.JLabel();
        JM_txtEnglish = new javax.swing.JTextField();
        JM_txtPhNo = new javax.swing.JTextField();
        JM_chbWord = new javax.swing.JCheckBox();
        JM_jLabel6 = new javax.swing.JLabel();
        JM_jLabel11 = new javax.swing.JLabel();
        JM_jLabel5 = new javax.swing.JLabel();
        JM_chbExcel = new javax.swing.JCheckBox();
        JM_txtEmail = new javax.swing.JTextField();
        JM_btnBack = new javax.swing.JButton();
        JM_jScrollPane2 = new javax.swing.JScrollPane();
        txtEducation = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(102, 73, 111));

        JM_jLabel9.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        JM_jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel9.setText("Contact Information");

        JM_jLabel20.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel20.setText("Work Knowledge of:");

        JM_txtName.setEditable(false);
        JM_txtName.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_txtName.setForeground(new java.awt.Color(102, 0, 102));

        JM_jLabel1.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JM_jLabel1.setText("Name: ");

        txtSkills.setEditable(false);
        txtSkills.setColumns(20);
        txtSkills.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtSkills.setRows(5);
        JM_jScrollPane4.setViewportView(txtSkills);

        JM_jLabel8.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        JM_jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel8.setText("Personal Information");

        JM_jLabel10.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        JM_jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JM_jLabel10.setText("Volunteer Details");

        JM_txtAge.setEditable(false);
        JM_txtAge.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_txtAge.setForeground(new java.awt.Color(102, 0, 102));

        JM_btnDecline.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_btnDecline.setForeground(new java.awt.Color(102, 73, 111));
        JM_btnDecline.setText("Decline Request");
        JM_btnDecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnDeclineActionPerformed(evt);
            }
        });

        JM_jLabel3.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel3.setText("Age:");

        JM_txtSex.setEditable(false);
        JM_txtSex.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_txtSex.setForeground(new java.awt.Color(102, 0, 102));

        tblVolList.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        tblVolList.setForeground(new java.awt.Color(102, 0, 102));
        tblVolList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Gender", "Age", "Email ID", "Phone No.", "Nationality"
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
        tblVolList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVolListMouseClicked(evt);
            }
        });
        JM_jScrollPane1.setViewportView(tblVolList);

        JM_jLabel2.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel2.setText("Sex: ");

        JM_jLabel21.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel21.setText("Skills:");

        JM_chbPowerPoint.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_chbPowerPoint.setForeground(new java.awt.Color(255, 255, 255));
        JM_chbPowerPoint.setText("PowerPoint");

        JM_chbEmail.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_chbEmail.setForeground(new java.awt.Color(255, 255, 255));
        JM_chbEmail.setText("Email Checking");
        JM_chbEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_chbEmailActionPerformed(evt);
            }
        });

        JM_chbWeb.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_chbWeb.setForeground(new java.awt.Color(255, 255, 255));
        JM_chbWeb.setText("Web Browsing");

        JM_jLabel17.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        JM_jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel17.setText("Language Proficency & Skills");

        JM_jLabel15.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel15.setText("Pincode:");

        JM_txtPincode.setEditable(false);
        JM_txtPincode.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_txtPincode.setForeground(new java.awt.Color(102, 0, 102));
        JM_txtPincode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_txtPincodeActionPerformed(evt);
            }
        });

        JM_txtCity.setEditable(false);
        JM_txtCity.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_txtCity.setForeground(new java.awt.Color(102, 0, 102));
        JM_txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_txtCityActionPerformed(evt);
            }
        });

        JM_jLabel18.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JM_jLabel18.setText("English: ");

        JM_jLabel14.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel14.setText("City:");

        JM_jLabel19.setFont(new java.awt.Font(".SF NS Mono", 1, 14)); // NOI18N
        JM_jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel19.setText("Other Language:");

        txtAddress.setEditable(false);
        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtAddress.setRows(5);
        JM_jScrollPane5.setViewportView(txtAddress);

        txtLanguage.setEditable(false);
        txtLanguage.setColumns(20);
        txtLanguage.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtLanguage.setRows(5);
        JM_jScrollPane3.setViewportView(txtLanguage);

        JM_jLabel13.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel13.setText("Address:");

        JM_txtEnglish.setEditable(false);
        JM_txtEnglish.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_txtEnglish.setForeground(new java.awt.Color(102, 0, 102));
        JM_txtEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_txtEnglishActionPerformed(evt);
            }
        });

        JM_txtPhNo.setEditable(false);
        JM_txtPhNo.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_txtPhNo.setForeground(new java.awt.Color(102, 0, 102));
        JM_txtPhNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_txtPhNoActionPerformed(evt);
            }
        });

        JM_chbWord.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_chbWord.setForeground(new java.awt.Color(255, 255, 255));
        JM_chbWord.setText("MS Word");
        JM_chbWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_chbWordActionPerformed(evt);
            }
        });

        JM_jLabel6.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel6.setText("Contact Number:");

        JM_jLabel11.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        JM_jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel11.setText("Education");

        JM_jLabel5.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel5.setText("Email Id:");

        JM_chbExcel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        JM_chbExcel.setForeground(new java.awt.Color(255, 255, 255));
        JM_chbExcel.setText("MS Excel");

        JM_txtEmail.setEditable(false);
        JM_txtEmail.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        JM_txtEmail.setForeground(new java.awt.Color(102, 0, 102));
        JM_txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_txtEmailActionPerformed(evt);
            }
        });

        JM_btnBack.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 14)); // NOI18N
        JM_btnBack.setForeground(new java.awt.Color(102, 0, 102));
        JM_btnBack.setText("<< Back");
        JM_btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnBackActionPerformed(evt);
            }
        });

        txtEducation.setEditable(false);
        txtEducation.setColumns(20);
        txtEducation.setFont(new java.awt.Font(".SF NS Mono", 0, 14)); // NOI18N
        txtEducation.setForeground(new java.awt.Color(102, 0, 102));
        txtEducation.setRows(5);
        JM_jScrollPane2.setViewportView(txtEducation);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JM_jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JM_btnBack)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(61, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(127, 127, 127)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JM_txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(JM_txtAge)
                                                .addComponent(JM_txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(JM_jLabel1)
                                    .addComponent(JM_jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JM_jLabel2)
                                    .addComponent(JM_jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JM_jLabel6)
                                            .addComponent(JM_jLabel5)
                                            .addComponent(JM_jLabel13))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JM_txtPhNo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JM_txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JM_txtPincode, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JM_txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JM_jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(JM_jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JM_jLabel14)
                                    .addComponent(JM_jLabel15))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JM_jLabel18)
                                            .addComponent(JM_jLabel19)
                                            .addComponent(JM_jLabel20)
                                            .addComponent(JM_jLabel21))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JM_jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(JM_chbPowerPoint, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(JM_chbWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(JM_chbExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(JM_chbEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(JM_chbWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(JM_txtEnglish, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(JM_jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(JM_jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JM_jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JM_jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JM_jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JM_btnDecline, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JM_btnBack)
                .addGap(15, 15, 15)
                .addComponent(JM_jLabel10)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JM_jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JM_btnDecline, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JM_jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JM_jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JM_jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JM_jLabel1)
                            .addComponent(JM_txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JM_jLabel2)
                            .addComponent(JM_txtSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JM_jLabel3)
                            .addComponent(JM_txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JM_jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JM_jLabel18)
                            .addComponent(JM_txtEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JM_jLabel19)
                            .addComponent(JM_jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JM_chbWord)
                            .addComponent(JM_chbEmail)
                            .addComponent(JM_jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JM_chbExcel)
                            .addComponent(JM_chbWeb))
                        .addGap(11, 11, 11)
                        .addComponent(JM_chbPowerPoint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JM_jLabel21)
                            .addComponent(JM_jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JM_jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JM_jLabel5)
                            .addComponent(JM_txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JM_jLabel6)
                            .addComponent(JM_txtPhNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JM_jLabel13)
                            .addComponent(JM_jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JM_jLabel14)
                                .addGap(34, 34, 34)
                                .addComponent(JM_jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JM_txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JM_txtPincode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JM_btnDeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnDeclineActionPerformed
        int selectedRow = tblVolList.getSelectedRow();
        if(selectedRow>=0){
            int selBtn = JOptionPane.YES_NO_OPTION;
            int selRes = JOptionPane.showConfirmDialog(null, "Do you want to cancel request?","Warning",selBtn);
            
            if(selRes == JOptionPane.YES_OPTION){
                UserAccount vol = (UserAccount)tblVolList.getValueAt(selectedRow, 0);

                vol.getWorkQueue().getWrList().remove(req);
                req.getUsersList().remove(vol);
                
                int vacancy = req.getVacancy();
                req.setVacancy(vacancy + 1);
                if(req.getVacancy()== 0){
                    req.setStatus("Completed");
                }
                else{
                    req.setStatus("Pending");
                }
                autoPopVol();
                autoPopBlanks();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Make row selection");
        }
    }//GEN-LAST:event_JM_btnDeclineActionPerformed

    private void tblVolListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVolListMouseClicked
        int selectedrow= tblVolList.getSelectedRow();
        if (selectedrow>=0)
        {
            UserAccount vol = (UserAccount)tblVolList.getValueAt(selectedrow, 0);
            autoPopVolDetails(vol);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Make row selection","Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tblVolListMouseClicked

    private void JM_txtPincodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_txtPincodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_txtPincodeActionPerformed

    private void JM_txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_txtCityActionPerformed

    private void JM_txtEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_txtEnglishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_txtEnglishActionPerformed

    private void JM_txtPhNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_txtPhNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_txtPhNoActionPerformed

    private void JM_chbWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_chbWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_chbWordActionPerformed

    private void JM_txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_txtEmailActionPerformed

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

    private void JM_chbEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_chbEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JM_chbEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JM_btnBack;
    private javax.swing.JButton JM_btnDecline;
    private javax.swing.JCheckBox JM_chbEmail;
    private javax.swing.JCheckBox JM_chbExcel;
    private javax.swing.JCheckBox JM_chbPowerPoint;
    private javax.swing.JCheckBox JM_chbWeb;
    private javax.swing.JCheckBox JM_chbWord;
    private javax.swing.JLabel JM_jLabel1;
    private javax.swing.JLabel JM_jLabel10;
    private javax.swing.JLabel JM_jLabel11;
    private javax.swing.JLabel JM_jLabel13;
    private javax.swing.JLabel JM_jLabel14;
    private javax.swing.JLabel JM_jLabel15;
    private javax.swing.JLabel JM_jLabel17;
    private javax.swing.JLabel JM_jLabel18;
    private javax.swing.JLabel JM_jLabel19;
    private javax.swing.JLabel JM_jLabel2;
    private javax.swing.JLabel JM_jLabel20;
    private javax.swing.JLabel JM_jLabel21;
    private javax.swing.JLabel JM_jLabel3;
    private javax.swing.JLabel JM_jLabel5;
    private javax.swing.JLabel JM_jLabel6;
    private javax.swing.JLabel JM_jLabel8;
    private javax.swing.JLabel JM_jLabel9;
    private javax.swing.JScrollPane JM_jScrollPane1;
    private javax.swing.JScrollPane JM_jScrollPane2;
    private javax.swing.JScrollPane JM_jScrollPane3;
    private javax.swing.JScrollPane JM_jScrollPane4;
    private javax.swing.JScrollPane JM_jScrollPane5;
    private javax.swing.JTextField JM_txtAge;
    private javax.swing.JTextField JM_txtCity;
    private javax.swing.JTextField JM_txtEmail;
    private javax.swing.JTextField JM_txtEnglish;
    private javax.swing.JTextField JM_txtName;
    private javax.swing.JTextField JM_txtPhNo;
    private javax.swing.JTextField JM_txtPincode;
    private javax.swing.JTextField JM_txtSex;
    private javax.swing.JTable tblVolList;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextArea txtEducation;
    private javax.swing.JTextArea txtLanguage;
    private javax.swing.JTextArea txtSkills;
    // End of variables declaration//GEN-END:variables
}
