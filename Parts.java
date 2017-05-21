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
 * @author Usman Sadiq
 */
public class Parts extends Material
{
    private int Part_ID;
    private String Part_Name;
    private int Diameter;
    private Double Dept;
    private Double Area;
    private int Quantity;
    public List<Operation> optList;

    public Parts() {
        optList = new ArrayList<>();
    }
    //--------------------------------------------------------------------------------------------------------
    // <editor-fold defaultstate="collapsed" desc="Class Properties...">
    //--------------------------------------------------------------------------------------------------------
    public void setPart_ID ( int ID ) {
        Part_ID = ID;
    }
    public int getPart_ID() {
        return Part_ID;
    } 
   //--------------------------------------------------------------------------------------------------------
    public void setPart_Name ( String name ) {
        Part_Name = name;
    }
    public String getPart_Name() {
        return Part_Name;
    } 
    //--------------------------------------------------------------------------------------------------------
    public void setDiameter ( int diameter ) {
        Diameter = diameter;
    }
    public int getDiamter() {
        return Diameter;
    } 
   //--------------------------------------------------------------------------------------------------------
    public void setDept ( Double dept ) {
        Dept = dept;
    }
    public Double getDept() {
        return Dept;
    } 
    //--------------------------------------------------------------------------------------------------------
    public void setArea ( Double area ) {
        Area = area;
    }
    public Double getArea() {
        return Area;
    } 
    //--------------------------------------------------------------------------------------------------------
    public void setQuantity ( int quantity ) {
        Quantity = quantity;
    }
    public int getQuantity() {
        return Quantity;
    }
    //--------------------------------------------------------------------------------------------------------
    //</editor-fold>
    //--------------------------------------------------------------------------------------------------------
}
