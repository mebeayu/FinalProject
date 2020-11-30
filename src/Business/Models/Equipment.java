/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Models;

/**
 *
 * @author 27246
 */
public class Equipment {
    public String EquipmentID;
    public String EquipmentName;
    public String Enterprise;
    public byte[] Image;
    @Override
    public String toString() {
        return EquipmentName;
    }
}
