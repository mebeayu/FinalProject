/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CommonTrainerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author 0
 */
public class VipTrainerOrganization extends Organization{
    public VipTrainerOrganization() {
        super(Organization.Type.VipTrainerOrg.getValue());
    }

     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CommonTrainerRole());
        return roles;
    }
    
}
