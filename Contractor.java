/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DataEntites;
//import com.mongodb.BasicDBObject;
/**
 *
 * @author usman
 */
public class Contractor{
    
    private int Contractor_ID;
    private String Contractor_Name;
    
    //--------------------------------------------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="Class Properties...">
    //--------------------------------------------------------------------------------------------------------
    public void setContractor_ID ( int ID ) {
        Contractor_ID = ID;
    }
    public int getContractor_ID() {
        return Contractor_ID;
    } 
    //--------------------------------------------------------------------------------------------------------
    public void setContractor_Name ( String name ) {
        Contractor_Name = name;
    }
    public String getContractor_Name() {
        return Contractor_Name;
    } 
    //--------------------------------------------------------------------------------------------------------    
    //</editor-fold>
    //--------------------------------------------------------------------------------------------------------
    
}
