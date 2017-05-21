/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataEntites;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usman
 */
public class BillOfMaterial{
    
    private int BOM_ID;
    private String BOM_Name;
    private int Stock;
    private int Level;
    public List<Parts> partList;

    public BillOfMaterial() {
        partList = new ArrayList<>();
    }
    //--------------------------------------------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="Class Properties...">
    //--------------------------------------------------------------------------------------------------------
    public void setBOM_ID ( int ID ) {
        BOM_ID = ID;
    }
    public int getBOM_ID() {
        return BOM_ID;
    } 
    //--------------------------------------------------------------------------------------------------------
    public void setBOM_Name ( String name ) {
        BOM_Name = name;
    }
    public String getBOM_Name() {
        return BOM_Name;
    } 
    //--------------------------------------------------------------------------------------------------------
    public void setStock ( int stock ) {
        Stock = stock;
    }
    public int getStock() {
        return Stock;
    } 
    //--------------------------------------------------------------------------------------------------------
    public void setLevel ( int level ) {
        Level = level;
    }
    public int getLevel() {
        return Level;
    } 
    //--------------------------------------------------------------------------------------------------------
    //</editor-fold>
    //--------------------------------------------------------------------------------------------------------
}
