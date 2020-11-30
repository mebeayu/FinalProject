/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Logic;

import Business.Models.Equipment;
import Business.Models.Maintenance;
import Common.DB;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 27246
 */
public class EngDic {
    public static boolean AddEquipment(String EquipmentName,String Enterprise,byte[] img){
        Equipment e = new Equipment();
        e.EquipmentID = DB.UIID();
        e.EquipmentName = EquipmentName;
        e.Enterprise = Enterprise;
        e.Image  = img;
        return DB.getDB().Store(e);
    }
    public static List<Equipment> QueryEquipment(String Enterprise){
        Equipment e = new Equipment();
        e.Enterprise = Enterprise;
        return DB.getDB().Query(e);
        
    }
    public static Equipment GetEquipment(String ID){
        Equipment e = new Equipment();
        e.EquipmentID = ID;
        List<Equipment> list = DB.getDB().Query(e);
        if (list.size()==0) {
            return null;
        }
        return list.get(0);
    }
    public static boolean DelEquipment(String ID){
        Equipment e = new Equipment();
        e.EquipmentID = ID;
        List<Equipment> list = DB.getDB().Query(e);
        if(list==null||list.size()==0) return false;
        e = list.get(0);
        return DB.getDB().Delete(e);
    }
    public static boolean AddMaintenance(Maintenance m){
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        m.AddTime = dateString;
        m.ID = DB.UIID();
        return DB.getDB().Store(m);
    }
    public static List<Maintenance> QueryMaintenance(String Enterprise){
        Maintenance m = new Maintenance();
        m.Enterprise = Enterprise;
        return DB.getDB().Query(m);
    }
    public static boolean DelMaintenance(String ID){
        Maintenance e = new Maintenance();
        e.ID = ID;
        List<Maintenance> list = DB.getDB().Query(e);
        if(list==null||list.size()==0) return false;
        e = list.get(0);
        return DB.getDB().Delete(e);
    }
    public static boolean  SetComplete(String ID){
        Maintenance e = new Maintenance();
        e.ID = ID;
        List<Maintenance> list = DB.getDB().Query(e);
        if(list==null||list.size()==0) return false;
        e = list.get(0);
        e.Status = "Complete";
        return DB.getDB().Store(e);
    }
    //public static boolean Query
}
