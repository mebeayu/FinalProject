/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.restaurant;

import java.util.ArrayList;

/**
 *
 * @author 0
 */
public class Menu {
    private ArrayList<Food> foodList;
    
    public Menu(){
        this.foodList = new ArrayList<Food>();
        
    }

    public ArrayList<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(ArrayList<Food> foodList) {
        this.foodList = foodList;
    }
    
    public void deleteFood(Food food){
        foodList.remove(food);
    }
    
    public Food addFood(){
        Food food = new Food();
        foodList.add(food);
        return food;
    }
}
