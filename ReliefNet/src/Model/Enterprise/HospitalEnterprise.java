/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Hp
 *
 */
public class HospitalEnterprise extends Enterprise{
    
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
    public HospitalEnterprise(String name){
        super(name,Enterprise.EntType.Hospital);
    }
    @Override
    public ArrayList<Role> getRoleList() {
        return null;
    }
}

