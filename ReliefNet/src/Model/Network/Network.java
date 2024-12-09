/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Network;

import Model.Enterprise.EnterpriseDirectory;

/**
 *
 * @author Hp
 */
public class Network {
    private String name;
    private EnterpriseDirectory entDir;

    public EnterpriseDirectory getEntDir() {
        return entDir;
    }

    public void setEntDir(EnterpriseDirectory entDir) {
        this.entDir = entDir;
    }
    
    public Network(){
        entDir=new EnterpriseDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return name;
    }    
}
