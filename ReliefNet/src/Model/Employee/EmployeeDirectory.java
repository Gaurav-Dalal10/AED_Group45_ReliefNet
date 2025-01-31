/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Employee;

import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class EmployeeDirectory {
    private ArrayList<Employee> empList;

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
    }

    public EmployeeDirectory() {
        empList = new ArrayList();
    }
    
  public Employee createEmp(String name){
        Employee emp = new Employee();
        emp.setName(name);
        empList.add(emp);
        return emp;
    }
    
    public Volunteer createVolunteer(String name){
        Volunteer vol = new Volunteer();
        vol.setName(name);
        empList.add(vol);
        return vol;
    }
}
