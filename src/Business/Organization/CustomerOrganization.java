/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CustomerRole;
import Business.Role.CustomerWithTrainerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 0
 */
public class CustomerOrganization extends Organization{
    
    public CustomerOrganization() {
        super(Organization.Type.CustomerOrg.getValue());
    }

     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CustomerRole());
        roles.add(new CustomerWithTrainerRole());
        return roles;
    }
    
}
