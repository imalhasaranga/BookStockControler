/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;

/**
 *
 * @author Gihan
 */
public class Discount {
    private String discountname;
    private int percentage;
    private int isactive;

    /**
     * @return the discountname
     */
    public String getDiscountname() {
        return discountname;
    }

    /**
     * @param discountname the discountname to set
     */
    public void setDiscountname(String discountname) {
        this.discountname = discountname;
    }

    /**
     * @return the percentage
     */
    public int getPercentage() {
        return percentage;
    }

    /**
     * @param percentage the percentage to set
     */
    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    /**
     * @return the isactive
     */
    public int getIsactive() {
        return isactive;
    }

    /**
     * @param isactive the isactive to set
     */
    public void setIsactive(int isactive) {
        this.isactive = isactive;
    }
    
    public boolean addNewDiscount(){
        boolean val = false;
        
        try {
            DB.setData("insert into discount(name, percentage) values('"+getDiscountname()+"', '"+getPercentage()+"')");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new user: " + e);
        }
        
        return val;
        
    }
    
    public boolean updateDiscount(int discid, int newpercentage){
        boolean val = false;
        
        try {
            DB.setData("update discount set percentage = '"+newpercentage+"' where discountid = '"+discid+"'");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new user: " + e);
        }
        
        return val;
        
    }
    
    public ResultSet getAllDiscountDetails(){
        ResultSet rs = null;
        
        try {
            rs = DB.getData("select * from discount");
        } catch (Exception e) {
            System.out.println("Error from select all discount: " + e);
        }
        
        return rs;
    }
    
    public ResultSet getSelectedDiscount(int discid){
        ResultSet rs = null;
        
        try {
            rs = DB.getData("select * from discount where discountid = '"+discid+"'");
        } catch (Exception e) {
            System.out.println("Error from select all discount: " + e);
        }
        
        return rs;
    }
    
}
