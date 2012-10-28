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
public class Dealerbalance {
    private int dealerid;
    private double netbalance;
    private String balancedate;

    /**
     * @return the dealerid
     */
    public int getDealerid() {
        return dealerid;
    }

    /**
     * @param dealerid the dealerid to set
     */
    public void setDealerid(int dealerid) {
        this.dealerid = dealerid;
    }

    /**
     * @return the netbalance
     */
    public double getNetbalance() {
        return netbalance;
    }

    /**
     * @param netbalance the netbalance to set
     */
    public void setNetbalance(double netbalance) {
        this.netbalance = netbalance;
    }

    /**
     * @return the balancedate
     */
    public String getBalancedate() {
        return balancedate;
    }

    /**
     * @param balancedate the balancedate to set
     */
    public void setBalancedate(String balancedate) {
        this.balancedate = balancedate;
    }
    
    public boolean setInitialDealerBalance(){
        boolean val = false;
        
        try {
            DB.setData("insert into dealerbalance(dealerdealerid, netbalance, balancedate) values('"+getDealerid()+"', '"+getNetbalance()+"', '"+getBalancedate()+"')");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new user: " + e);
        }
        
        return val;
        
    }
    
    public boolean updateDealerBalance(){
        boolean val = false;
        
        try {
            DB.setData("update dealerbalance set netbalance = '"+getNetbalance()+"', balancedate = '"+getBalancedate()+"' where dealerdealerid = '"+getDealerid()+"'"); 
            System.out.println("Net Bal: " + getNetbalance());
            System.out.println("ID: " + getDealerid());
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new user: " + e);
        }
        
        return val;
        
    }
    
    public ResultSet getDealerBalanceDetails(int dealerid){
        ResultSet rs = null;
        
        try {
            rs = DB.getData("select * from dealerbalance where dealerdealerid = '"+dealerid+"'");
        } catch (Exception e) {
            System.out.println("Error from Getdoctortypes: " + e);
        }
        
        return rs;
    }
    
}
