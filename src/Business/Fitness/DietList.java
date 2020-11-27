/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Fitness;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 0
 */
public class DietList {
    private int id;
    private String name;
    private String contact;
    private Date produceTime;
    private String time;
    
    private String breakfast1;
    private String breakfast2;
    private String breakfast3;
    private String lunch1;
    private String lunch2;
    private String lunch3;
    private String dinner1;
    private String dinner2;
    private String dinner3;
    
    public DietList(){
        this.produceTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        time = formatter.format(produceTime);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getBreakfast1() {
        return breakfast1;
    }

    public void setBreakfast1(String breakfast1) {
        this.breakfast1 = breakfast1;
    }

    public String getBreakfast2() {
        return breakfast2;
    }

    public void setBreakfast2(String breakfast2) {
        this.breakfast2 = breakfast2;
    }

    public String getBreakfast3() {
        return breakfast3;
    }

    public void setBreakfast3(String breakfast3) {
        this.breakfast3 = breakfast3;
    }

    public String getLunch1() {
        return lunch1;
    }

    public void setLunch1(String lunch1) {
        this.lunch1 = lunch1;
    }

    public String getLunch2() {
        return lunch2;
    }

    public void setLunch2(String lunch2) {
        this.lunch2 = lunch2;
    }

    public String getLunch3() {
        return lunch3;
    }

    public void setLunch3(String lunch3) {
        this.lunch3 = lunch3;
    }

    public String getDinner1() {
        return dinner1;
    }

    public void setDinner1(String dinner1) {
        this.dinner1 = dinner1;
    }

    public String getDinner2() {
        return dinner2;
    }

    public void setDinner2(String dinner2) {
        this.dinner2 = dinner2;
    }

    public String getDinner3() {
        return dinner3;
    }

    public void setDinner3(String dinner3) {
        this.dinner3 = dinner3;
    }

    public String getTime() {
        return time;
    }
    
    
}
