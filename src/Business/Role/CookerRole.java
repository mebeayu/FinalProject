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
import userinterface.Restaurant.CookerWorkAreaJPanel;

/**
 *
 * @author 0
 */
public class CookerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        Enterprise cusEnterprise = null;
        for(Network network : business.getNetworkList()){
            for(Enterprise e:network.getEnterpriseDirectory().getEnterpriseList()){
                if(e.getName().equals(enterprise.getName())){
                    for(Enterprise findEnterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                        if(findEnterprise.getEnterpriseType()==Enterprise.EnterpriseType.Population){
                            cusEnterprise = findEnterprise;
                        }
                    }
                }
            }
        }
        return new CookerWorkAreaJPanel(userProcessContainer, enterprise, cusEnterprise);
    }

    @Override
    public String getType() {
        return RoleType.Cooker.getValue();
    }
    
}
