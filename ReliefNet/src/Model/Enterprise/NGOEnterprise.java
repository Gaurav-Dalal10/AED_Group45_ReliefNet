/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author gaura
 */
public class NGOEnterprise extends Enterprise{
    
     public enum Type{
        Admin("Admin Organization"), Health("Health Organization"), Volunteer("Volunteer Organization"), 
        Tutor("Tutor Organization"), Storage("Storage Organization");
        
        private String type;

        public String getType() {
            return type;
        }

        private Type(String type) {
            this.type = type;
        }

    }
    
    
    public NGOEnterprise(String name){
        super(name,EntType.NGO);
    }
    
    @Override
    public ArrayList<Role> getRoleList() {
        return null;
    }   
}

