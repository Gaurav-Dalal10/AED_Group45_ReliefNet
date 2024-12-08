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
public class ResturantEnterprise extends Enterprise{
    
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
    
    public ResturantEnterprise(String name){
        super(name,Enterprise.EntType.Resturant);
    }
    @Override
    public ArrayList<Role> getRoleList() {
        return null;
    }  
}

