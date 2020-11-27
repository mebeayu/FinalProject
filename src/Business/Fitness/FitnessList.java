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
public class FitnessList {
    private int id;
    private String name;
    private String contact;
    private Date testTime;
    private String time;
    
    private String height;
    private String weight;
    private String bloodPressure;
    private String heartRate;
    private String BMI;
    private String fatRate;
    private String metabolism;
    private String shoulder;
    private String muscle;
    private String muscleStrength;
    private String muscleEndurance;
    private String cardiopulmonary;
    private String flexibility;
    private String balance;
    
    public FitnessList(){
        this.testTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        time = formatter.format(testTime);
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    public String getBMI() {
        return BMI;
    }

    public void setBMI(String BMI) {
        this.BMI = BMI;
    }

    public String getFatRate() {
        return fatRate;
    }

    public void setFatRate(String fatRate) {
        this.fatRate = fatRate;
    }

    public String getMetabolism() {
        return metabolism;
    }

    public void setMetabolism(String metabolism) {
        this.metabolism = metabolism;
    }

    public String getShoulder() {
        return shoulder;
    }

    public void setShoulder(String shoulder) {
        this.shoulder = shoulder;
    }

    public String getMuscle() {
        return muscle;
    }

    public void setMuscle(String muscle) {
        this.muscle = muscle;
    }

    public String getMuscleStrength() {
        return muscleStrength;
    }

    public void setMuscleStrength(String muscleStrength) {
        this.muscleStrength = muscleStrength;
    }

    public String getMuscleEndurance() {
        return muscleEndurance;
    }

    public void setMuscleEndurance(String muscleEndurance) {
        this.muscleEndurance = muscleEndurance;
    }

    public String getCardiopulmonary() {
        return cardiopulmonary;
    }

    public void setCardiopulmonary(String cardiopulmonary) {
        this.cardiopulmonary = cardiopulmonary;
    }

    public String getFlexibility() {
        return flexibility;
    }

    public void setFlexibility(String flexibility) {
        this.flexibility = flexibility;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getTime() {
        return time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    
}
