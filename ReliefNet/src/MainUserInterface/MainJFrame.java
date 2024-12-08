/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainUserInterface;

import Model.DB4OUtil.DB4OUtil;
import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Organization.Organisation;
import Model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author monalikapradhan
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public MainJFrame() {
        initComponents();
         system = dB4OUtil.retrieveSystem();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JM_jSplitPane1 = new javax.swing.JSplitPane();
        JM_jPanel1 = new javax.swing.JPanel();
        JM_lblUsername = new javax.swing.JLabel();
        JM_txtUsername = new javax.swing.JTextField();
        JM_jLabel1 = new javax.swing.JLabel();
        JM_txtpwd = new javax.swing.JPasswordField();
        JM_btnlogin = new javax.swing.JButton();
        JM_btnlogout = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        JM_jPanel2 = new javax.swing.JPanel();
        JM_jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JM_jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        JM_lblUsername.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JM_lblUsername.setText("Username:");

        JM_jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        JM_jLabel1.setText("Password:");

        JM_btnlogin.setBackground(new java.awt.Color(102, 73, 111));
        JM_btnlogin.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        JM_btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        JM_btnlogin.setText("Login");
        JM_btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnloginActionPerformed(evt);
            }
        });

        JM_btnlogout.setBackground(new java.awt.Color(102, 73, 111));
        JM_btnlogout.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        JM_btnlogout.setForeground(new java.awt.Color(255, 255, 255));
        JM_btnlogout.setText("Logout");
        JM_btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JM_btnlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JM_jPanel1Layout = new javax.swing.GroupLayout(JM_jPanel1);
        JM_jPanel1.setLayout(JM_jPanel1Layout);
        JM_jPanel1Layout.setHorizontalGroup(
            JM_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JM_jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JM_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JM_lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JM_txtUsername)
                    .addComponent(JM_jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JM_txtpwd)
                    .addComponent(JM_btnlogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JM_btnlogout, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                .addContainerGap())
        );
        JM_jPanel1Layout.setVerticalGroup(
            JM_jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JM_jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(JM_lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JM_txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(JM_jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JM_txtpwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(JM_btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(JM_btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(434, Short.MAX_VALUE))
        );

        JM_jSplitPane1.setLeftComponent(JM_jPanel1);

        container.setLayout(new java.awt.CardLayout());

        JM_jPanel2.setBackground(new java.awt.Color(102, 73, 111));

        JM_jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        JM_jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 72)); // NOI18N
        JM_jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        JM_jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JM_jLabel3.setText("ReliefNet");

        javax.swing.GroupLayout JM_jPanel2Layout = new javax.swing.GroupLayout(JM_jPanel2);
        JM_jPanel2.setLayout(JM_jPanel2Layout);
        JM_jPanel2Layout.setHorizontalGroup(
            JM_jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JM_jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JM_jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1261, Short.MAX_VALUE))
        );
        JM_jPanel2Layout.setVerticalGroup(
            JM_jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JM_jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
        );

        container.add(JM_jPanel2, "card2");

        JM_jSplitPane1.setRightComponent(container);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JM_jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JM_jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JM_btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnloginActionPerformed
        // TODO add your handling code here:
        String UName = JM_txtUsername.getText();
        // Get Password
        char[] pwdArray = JM_txtpwd.getPassword();
        String pwd = String.valueOf(pwdArray);
        
        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount=system.getUserAccDir().authentication(UName, pwd);
        
        Enterprise inEnterprise=null;
        Organisation inOrganization=null;
        Network inNetwork = null;
        
        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:system.getNetList()){
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEntDir().getEntList()){
                    userAccount=enterprise.getUserAccDir().authentication(UName, pwd);
                    if(userAccount==null){
                       //Step 3:check against each organization for each enterprise
                       for(Organisation organization:enterprise.getOrgDir().getOrgList()){
                           userAccount=organization.getUserAccDir().authentication(UName, pwd);
                           if(userAccount!=null){
                               inEnterprise=enterprise;
                               inOrganization=organization;
                               inNetwork=network;
                               break;
                           }
                       }
                        
                    }
                    else{
                       inEnterprise=enterprise;
                       break;
                    }
                    if(inOrganization!=null){
                        break;
                    }  
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }
        
        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            CardLayout layout=(CardLayout)container.getLayout();

            container.add("workArea",userAccount.getRole().workPanel(container, userAccount, inOrganization, inEnterprise, inNetwork, system));
            layout.next(container);
        }
        
        
        
        
        
        
        
        JM_btnlogin.setEnabled(false);
        JM_btnlogout.setEnabled(true);
        JM_txtUsername.setEnabled(false);
        JM_txtpwd.setEnabled(false);
    }//GEN-LAST:event_JM_btnloginActionPerformed

    private void JM_btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JM_btnlogoutActionPerformed
        // TODO add your handling code here:
        JM_btnlogout.setEnabled(false);
        JM_txtUsername.setEnabled(true);
        JM_txtpwd.setEnabled(true);
        JM_btnlogin.setEnabled(true);

        JM_txtUsername.setText("");
        JM_txtpwd.setText("");

        container.removeAll();
        Color color = new Color(180,195,195);
        JPanel blankJP = new JPanel();
        blankJP.setBackground(color);
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_JM_btnlogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JM_btnlogin;
    private javax.swing.JButton JM_btnlogout;
    private javax.swing.JLabel JM_jLabel1;
    private javax.swing.JLabel JM_jLabel3;
    private javax.swing.JPanel JM_jPanel1;
    private javax.swing.JPanel JM_jPanel2;
    private javax.swing.JSplitPane JM_jSplitPane1;
    private javax.swing.JLabel JM_lblUsername;
    private javax.swing.JTextField JM_txtUsername;
    private javax.swing.JPasswordField JM_txtpwd;
    private javax.swing.JPanel container;
    // End of variables declaration//GEN-END:variables
}
