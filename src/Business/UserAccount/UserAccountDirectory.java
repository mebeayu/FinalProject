/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Logic.RecDic;
import Business.Models.VipCustomer;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        VipCustomer c = RecDic.CustomerLogin(username, password);
        if(c==null) return null;
        UserAccount ua = new UserAccount();
        ua.customer = c;
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public void deleteUserAccount(UserAccount userAccount){
        userAccountList.remove(userAccount);
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public UserAccount findUserAccount(int id){
        for(UserAccount ua : userAccountList){
            if(ua.getEmployee().getId() == id){
                return ua;
            }
        }
        return null;
    }
}
