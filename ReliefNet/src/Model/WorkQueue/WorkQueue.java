/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author pritpatel
 */
public class WorkQueue {
    private ArrayList<WorkRequest> wrList;

    public ArrayList<WorkRequest> getWrList() {
        return wrList;
    }
    
    public WorkQueue() {
        wrList = new ArrayList();
    }
    
    public void delRequest(WorkRequest wrRequest){
        wrList.remove(wrRequest);
    }
}
