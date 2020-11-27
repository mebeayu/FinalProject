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
import userinterface.CustomerRole.CustomerManagementJPanel;
import userinterface.CustomerRole.CustomerWorkAreaJPanel;

/**
 *
 * @author 0
 */
public class CustomerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        Enterprise restaurant = null;
        for(Network network : business.getNetworkList()){
            for(Enterprise e:network.getEnterpriseDirectory().getEnterpriseList()){
                if(e.getName().equals(enterprise.getName())){
                    for(Enterprise resEnterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                        if(resEnterprise.getEnterpriseType()==Enterprise.EnterpriseType.Restaurant){
                            restaurant = resEnterprise;
                        }
                    }
                }
            }
        }
        return new CustomerManagementJPanel(userProcessContainer, account, restaurant);
    }

    @Override
    public String getType() {
        return RoleType.Customer.getValue();
    }
    
}
