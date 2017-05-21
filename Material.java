/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataEntites;


/**
 *
 * @author usman
 */
public class Material extends Operation{
    
    private int Material_ID;
    private String Material_Name;
    
    //--------------------------------------------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="Class Properties...">
    //--------------------------------------------------------------------------------------------------------
    public void setMaterial_ID ( int ID ) {
        Material_ID = ID;
    }
    public int getMaterial_ID() {
        return Material_ID;
    } 
   //--------------------------------------------------------------------------------------------------------
    public void setMaterial_Name ( String name ) {
        Material_Name = name;
    }
    public String getMaterial_Name() {
        return Material_Name;
    } 
    //--------------------------------------------------------------------------------------------------------
    //</editor-fold>
    //--------------------------------------------------------------------------------------------------------
}
