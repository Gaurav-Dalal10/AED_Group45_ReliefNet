/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Enterprise;

/**
 *
 * @author gaura
 */
public abstract class Enterprise extends Organisation{
    
    private EntType entType;
    private OrganisationDirectory orgDir;

    public EntType getEntType() {
        return entType;
    }

    public void setEntType(EntType entType) {
        this.entType = entType;
    }
    
    public OrganisationDirectory getOrgDir() {
        return orgDir;
    }
    
    public enum EntType{

        Hospital("MedicalCenter"), 
        NGO("EmergencyShelter"),
        Transpotation("Clothing"),
        Resturant("FoodBank");

        
        private String type;

        public String getType() {
            return type;
        }

        private EntType(String type) {
            this.type = type;
        }
 
        @Override
        public String toString(){
        return type;
    }
    }
    
    public Enterprise(String name,EntType type){
        super(name);
        this.entType=type;
        orgDir=new OrganisationDirectory();
    }
    
}
