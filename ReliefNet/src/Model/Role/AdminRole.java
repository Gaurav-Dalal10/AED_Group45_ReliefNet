/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Role;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Organization.Organisation;
import Model.UserAccount.UserAccount;
import UI.AdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Hp
 */
public class AdminRole extends Role{
    @Override
    public JPanel workPanel(JPanel userProcessContainer, UserAccount acc, Organisation org, Enterprise ent,Network net, EcoSystem system) {
        return new AdminWorkAreaJPanel(userProcessContainer,net, ent);
    }
    
     @Override
    public String toString() {
        return Type.Admin.getType();
    }

}