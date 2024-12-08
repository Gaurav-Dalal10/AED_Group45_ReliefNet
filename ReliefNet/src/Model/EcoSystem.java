/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Network.Network;
import Model.Organization.Organisation;
import Model.Role.Role;
import Model.Role.SysAdminRole;
import java.util.ArrayList;
/**
 *
 * @author Hp
 */
public class EcoSystem extends Organisation{
    private static EcoSystem system;
    private ArrayList<Network> netList;
    
    public static EcoSystem getInstance(){
        if(system==null){
            system=new EcoSystem();
        }
        return system;
    }
    
    public Network createNetwork(){
        Network net=new Network();
        netList.add(net);
        return net;
    }
    
    @Override
    public ArrayList<Role> getRoleList() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SysAdminRole());
        return roleList;
    }
    
    private EcoSystem(){
        super(null);
        netList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetList() {
        return netList;
    }

    public void setNetList(ArrayList<Network> netList) {
        this.netList = netList;
    }
    
    public boolean checkUniqueUser(String userName){
        if(!this.getUserAccDir().UniqueUsername(userName)){
            return false;
        }
        return true;
    }
    
}
