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
public class Dealer {
    private int dtypeid;
    private String name;
    private String address;
    private String contact;
    private int isactive;
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the dtypeid
     */
    public int getDtypeid() {
        return dtypeid;
    }

    /**
     * @param dtypeid the dtypeid to set
     */
    public void setDtypeid(int dtypeid) {
        this.dtypeid = dtypeid;
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
    
    public boolean addNewDealer(){
        boolean val = false;
        
        try {
            DB.setData("insert into dealer(dealertypedtypeid, name, address, contact, isactive) values('"+getDtypeid()+"', '"+getName()+"', '"+getAddress()+"', '"+getContact()+"', '"+getIsactive()+"')");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new user: " + e);
        }
        
        return val;
        
    }
    
    public boolean updateDealer(int upid, double newbalance){
        boolean val = false;
        
        try {
            DB.setData("update dealer set name = '"+getName()+"', address = '"+getAddress()+"', contact = '"+getContact()+"' where dealerid = '"+upid+"'"); 
            DB.setData("update dealerbalance set netbalance = '"+newbalance+"' where dealerdealerid = '"+upid+"'"); 
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new user: " + e);
        }
        
        return val;
        
    }
    
    public ResultSet getDealerDetails(String searchterm){
        ResultSet rs = null;
        
        try {
            rs = DB.getData("select * from dealer where name like '"+searchterm+"%'");
        } catch (Exception e) {
            System.out.println("Error from Getdoctortypes: " + e);
        }
        
        return rs;
    }
    
    public ResultSet getDealerToTable(){
        ResultSet rs = null;
        
        try {
            rs = DB.getData("SELECT dl.dealerid, dl.name, dl.address, dl.contact, db.netbalance FROM dealer dl, dealerbalance db WHERE dl.dealerid = db.dealerdealerid AND dl.dealertypedtypeid = '1'");
        } catch (Exception e) {
            System.out.println("Error from Getdoctortypes: " + e);
        }
        
        return rs;
    }
    
    public int getLatDealerId(){
        ResultSet rs = null;
        int dealerid = 0;
        
        try {
            rs = DB.getData("SELECT MAX(dealerid) AS maxdealerid FROM dealer");
            rs.next();
            dealerid = rs.getInt("maxdealerid");
        } catch (Exception e) {
            System.out.println("Error from Getdoctortypes: " + e);
        }
        
        return dealerid;
    }
    
    public String getDealerCity(int did){
        ResultSet rs = null;
        String dcity = "";
        
        try {
            rs = DB.getData("SELECT address from dealer where dealerid = '"+did+"'");
            rs.next();
            String addarray[] = rs.getString("address").split(" "); 
            dcity = addarray[addarray.length - 1];
        } catch (Exception e) {
            System.out.println("Error from getDealerCity: " + e);
        }
        
        return dcity;
    }
    
    
}
