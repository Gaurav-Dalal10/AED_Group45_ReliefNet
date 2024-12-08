/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Hp
 *
 */
public class MedicalCenterEnterprise extends Enterprise{
    
    public enum Type{
       Doctor("Doctor Organization"), Pharmacy("Pharmacy Organization");
        private String type;

        public String getType() {
            return type;
        }

        private Type(String type) {
            this.type = type;
        }
    }
    public MedicalCenterEnterprise(String name){
        super(name,Enterprise.EntType.MedicalCenter);
    }
    @Override
    public ArrayList<Role> getRoleList() {
        return null;
    }
}

