/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataEntites;
import java.util.Calendar;

/**
 *
 * @author usman
 */
public class Operation extends Contractor{
    
    private int Operation_ID;
    private String Operation_Name;
    private String Equipment_Name;
    private Calendar Set_Up_Time = Calendar.getInstance();
    private Calendar Operation_Time = Calendar.getInstance();
    private Calendar Assembly_Time = Calendar.getInstance();
    private int No_of_Staff;
    
    //--------------------------------------------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="Class Properties...">
    //--------------------------------------------------------------------------------------------------------
    
    public void setOperation_ID ( int ID ) {
        Operation_ID = ID;
    }
    public int getOperation_ID() {
        return Operation_ID;
    }
    //--------------------------------------------------------------------------------------------------------
    public void setOperation_Name ( String name ) {
        Operation_Name = name;
    }
    public String getOperation_Name() {
        return Operation_Name;
    } 
    //--------------------------------------------------------------------------------------------------------
    public void setEquipment_Name ( String name ) {
        Equipment_Name = name;
    }
    public String getEquipment_Name() {
        return Equipment_Name;
    } 
    //--------------------------------------------------------------------------------------------------------
    public void setNo_of_Staff ( int number ) {
        No_of_Staff = number;
    }
    public int getNo_of_Staff() {
        return No_of_Staff;
    }
    //--------------------------------------------------------------------------------------------------------
    public void setSet_Up_Time ( int Hour, int Minute, int Second ) {
        Set_Up_Time.set(Calendar.HOUR, Hour);
        Set_Up_Time.set(Calendar.MINUTE, Minute);
        Set_Up_Time.set(Calendar.SECOND, Second);
    }
    public Calendar getSet_Up_Time() {
        return Set_Up_Time;
    }
    //--------------------------------------------------------------------------------------------------------
    public void setOperation_Time ( int Hour, int Minute, int Second ) {
        Operation_Time.set(Calendar.HOUR, Hour);
        Operation_Time.set(Calendar.MINUTE, Minute);
        Operation_Time.set(Calendar.SECOND, Second);
    }
    public Calendar getOperation_Time() {
        return Operation_Time;
    }
    //--------------------------------------------------------------------------------------------------------
    public void setAssembly_Time ( int Hour, int Minute, int Second ) {
        Assembly_Time.set(Calendar.HOUR, Hour);
        Assembly_Time.set(Calendar.MINUTE, Minute);
        Assembly_Time.set(Calendar.SECOND, Second);
    }
    public Calendar getAssembly_Time() {
        return Assembly_Time;
    }
    //--------------------------------------------------------------------------------------------------------
    //</editor-fold>
    //--------------------------------------------------------------------------------------------------------
}
