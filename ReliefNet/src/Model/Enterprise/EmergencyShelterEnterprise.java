/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author gaura
 */
public class EmergencyShelterEnterprise extends Enterprise{
    
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
    
    
    public EmergencyShelterEnterprise(String name){
        super(name,Enterprise.EntType.EmergencyShelter);
    }
    
    @Override
    public ArrayList<Role> getRoleList() {
        return null;
    }   
}

