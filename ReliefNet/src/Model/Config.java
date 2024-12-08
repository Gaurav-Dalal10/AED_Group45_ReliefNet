/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Model.Employee.Employee;
import Model.Role.SysAdminRole;
import Model.UserAccount.UserAccount;

/**
 *
 * @author Hp
 */
public class Config {
     public static EcoSystem config(){
        
        EcoSystem sys = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee emp = sys.getEmpDir().createEmp("sysadmin");
        
        UserAccount useraccount = sys.getUserAccDir().createAccount("sysadmin", "sysadmin", emp, new SysAdminRole());
        
        return sys;
    }
    
}
