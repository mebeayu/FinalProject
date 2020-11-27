/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import Business.restaurant.Food;
import Business.UserAccount.UserAccount;
import java.text.SimpleDateFormat;

/**
 *
 * @author 0
 */
public class Order extends WorkRequest{
    private ArrayList<Food> foodList;
    
    public Order(UserAccount receiver){
        super();
        foodList = new ArrayList<>();
        setReceiver(receiver);
        setStatus("waiting...");
        setResolveTime("-");
    }

    public ArrayList<Food> getFoodList() {
        return foodList;
    }
    
    public void transferMessage(){
        String message = "";
        for(Food food : foodList){
            message += food.getName()+" ";
        }
        setMessage(message);
    }
}
