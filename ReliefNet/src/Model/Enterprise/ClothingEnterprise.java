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
public class ClothingEnterprise extends Enterprise{
    
    public enum Type{
       Transport("Transport Organization");
        private String type;

        public String getType() {
            return type;
        }

        private Type(String type) {
            this.type = type;
        }

    }
    
    public ClothingEnterprise(String name){
        super(name, Enterprise.EntType.Clothing);
    }
    @Override
    public ArrayList<Role> getRoleList() {
        return null;
    }
}