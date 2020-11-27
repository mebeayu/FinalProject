/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CookerRole;
import Business.Role.DeliveryRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 0
 */
public class CookOrganization extends Organization{
    public CookOrganization() {
        super(Organization.Type.CookOrg.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CookerRole());
        roles.add(new DeliveryRole());
        return roles;
    }
    
}
