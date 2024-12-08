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
public class FoodBankEnterprise extends Enterprise{
    
    public enum Type{
       Restaurant("Restaurant Organization");
        private String type;
        public String getType() {
            return type;
        }

        private Type(String type) {
            this.type = type;
        }
    }
    
    public FoodBankEnterprise(String name){
        super(name,Enterprise.EntType.FoodBank);
    }
    @Override
    public ArrayList<Role> getRoleList() {
        return null;
    }  
}

