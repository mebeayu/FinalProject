/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;
import Business.Organization.Organization.Type;

/**
 *
 * @author 0
 */
public class OrganizationTypeDirectory {
    private ArrayList<Type> organizationTypeList;
    
    public OrganizationTypeDirectory(){
        this.organizationTypeList = new ArrayList();
    }

    public ArrayList<Type> getOrganizationTypeList() {
        return organizationTypeList;
    }

    public void setOrganizationTypeList(ArrayList<Type> organizationTypeList) {
        this.organizationTypeList = organizationTypeList;
    }
    
    public Type addType(Type type){
        this.organizationTypeList.add(type);
        return type;
    }
}
