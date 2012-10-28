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
public class Booktype {
    private String booktype;
    private int isactive;

    /**
     * @return the booktype
     */
    public String getBooktype() {
        return booktype;
    }

    /**
     * @param booktype the booktype to set
     */
    public void setBooktype(String booktype) {
        this.booktype = booktype;
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
    
    public boolean addNewBookType(){
        boolean val = false;
        
        try {
            DB.setData("insert into booktype(type) values('"+getBooktype()+"')");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new user: " + e);
        }
        
        return val;
        
    }
    
    public boolean updateBookType(int typeid, String newtype){
        boolean val = false;
        
        try {
            DB.setData("update booktype set type = '"+newtype+"' where btypeid = '"+typeid+"'");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new user: " + e);
        }
        
        return val;
        
    }
    
    public boolean deativateBookType(int typeid){
        boolean val = false;
        
        try {
            DB.setData("update booktype set isactive = '0' where btypeid = '"+typeid+"'");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new user: " + e);
        }
        
        return val;
        
    }
    
    public boolean activateBookType(int typeid){
        boolean val = false;
        
        try {
            DB.setData("update booktype set isactive = '1' where btypeid = '"+typeid+"'");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new user: " + e);
        }
        
        return val;
        
    }
    
    public ResultSet getAllBookTypeDetails(){
        ResultSet rs = null;
        
        try {
            rs = DB.getData("select * from booktype");
        } catch (Exception e) {
            System.out.println("Error from select all book types: " + e);
        }
        
        return rs;
    }
    
}
