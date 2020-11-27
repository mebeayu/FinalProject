/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.CustomerOrg.getValue())){
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.PrivateTrainerOrg.getValue())){
            organization = new PrivateTrainerOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.ReceptionOrg.getValue())){
            organization = new ReceptionOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.VipTrainerOrg.getValue())){
            organization = new VipTrainerOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.EngineerOrg.getValue())){
            organization = new EngineerOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.CookOrg.getValue())){
            organization = new CookOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.DietitianOrg.getValue())){
            organization = new DietitianOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.DoctorOrg.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
    public void deleteOrganization(Organization org){
        organizationList.remove(org);
    }
}