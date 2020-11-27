/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        //system
        SystemAdmin("SystemAdmin"),
        
        //customer enterprise
        CustomerAdmin("CustomerAdmin"),
        CustomerWithTrainer("CustomerWithTrainer"),
        Customer("Customer"),
        
        //gym enterprise
        GymAdmin("GymAdmin"),
        PrivateTrainer("PrivateTrainer"),
        CommonTrainer("CommonTrainer"),
        Reception("Reception"),
        Engineer("Engineer"),
        
        //restaurant enterprise
        RestaurantAdmin("RestaurantAdmin"),
        Dietitian("Dietitian"),
        Cooker("Cooker"),
        Delivery("Delivery"),
        
        //physical enterprise
        PhysicalAdmin("PhysicalAdmin"),
        Doctor("Dorctor");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);
    
    public abstract String getType();

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}