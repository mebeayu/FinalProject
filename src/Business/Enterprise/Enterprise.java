 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.OrganizationTypeDirectory;
import Business.restaurant.Menu;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private OrganizationTypeDirectory organizationTypeDirectory;
    private Menu menu;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public OrganizationTypeDirectory getOrganizationTypeDirectory() {
        return organizationTypeDirectory;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    
    public enum EnterpriseType{
        Population("Population"),
        Gym("Gym"),
        Restaurant("Restaurant"),
        PhysicalCenter("PhysicalCenter");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
        menu = new Menu();
    }
}
