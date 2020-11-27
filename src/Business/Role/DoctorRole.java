/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;

/**
 *
 * @author 0
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        for(Network network : system.getNetworkList()){
            for(Enterprise e:network.getEnterpriseDirectory().getEnterpriseList()){
                if(e.getName().equals(enterprise.getName())){
                    for(Enterprise cusEnterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                        if(cusEnterprise.getEnterpriseType()==Enterprise.EnterpriseType.Population){
                            enterprise = cusEnterprise;
                        }
                    }
                }
            }
        }
        return new DoctorWorkAreaJPanel(userProcessContainer, enterprise);
    }

    @Override
    public String getType() {
        return RoleType.Doctor.getValue();
    }
    
}
