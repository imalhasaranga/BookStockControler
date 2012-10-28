/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Gihan
 */
public class Cheque {
    private int inno;
    private int chnum;
    private String cdate;
    private String bank;
    private double amount;

    /**
     * @return the inno
     */
    public int getInno() {
        return inno;
    }

    /**
     * @param inno the inno to set
     */
    public void setInno(int inno) {
        this.inno = inno;
    }

    /**
     * @return the chnum
     */
    public int getChnum() {
        return chnum;
    }

    /**
     * @param chnum the chnum to set
     */
    public void setChnum(int chnum) {
        this.chnum = chnum;
    }

    /**
     * @return the cdate
     */
    public String getCdate() {
        return cdate;
    }

    /**
     * @param cdate the cdate to set
     */
    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    /**
     * @return the bank
     */
    public String getBank() {
        return bank;
    }

    /**
     * @param bank the bank to set
     */
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public boolean addChequeData(){
        boolean val = false;
        
        try {
            DB.setData("insert into chequeinvoice(invoiceinno, chequeno, chdate, bank, amount) values('"+getInno()+"', '"+getChnum()+"', '"+getCdate()+"', '"+getBank()+"', '"+getAmount()+"')");  
            val = true;
        } catch (Exception e) {
            val = false;
            JOptionPane.showMessageDialog(null, "Error: From addChequeData(): " + e, "Error!", 0); 
        }
        
        return val;
        
    }
    
    public boolean addChequeData2(){
        boolean val = false;
        
        try {
            Connection con = DB.getCon();
            PreparedStatement pst = null;
            pst = con.prepareStatement("insert into chequeinvoice(invoiceinno, chequeno, chdate, bank, amount) values(?, ?, ?, ?, ?)");
            pst.setString(1, ""+getInno());
            pst.setString(2, ""+getChnum());
            pst.setString(3, ""+getCdate());
            pst.setString(4, ""+getBank());
            pst.setString(5, ""+getAmount());
            pst.executeUpdate();
            val = true;
        } catch (Exception e) {
            val = false;
            JOptionPane.showMessageDialog(null, "Error: From addChequeData(): " + e, "Error!", 0); 
        }
        
        return val;
        
    }
    
    public ResultSet getChequeDetails(int chnumber){
        ResultSet rs = null;
        
        try {
            rs = DB.getData("select * from chequeinvoice where invoiceinno = '"+chnumber+"'");
        } catch (Exception e) {
            System.out.println("Error from getDateReturnRecs: " + e);
        }
        
        return rs;
    }
    
}
