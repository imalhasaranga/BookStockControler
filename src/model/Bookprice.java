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
public class Bookprice {
    private int bookid;
    private double soldprice;
    private String fromdate;
    private String todate;

    /**
     * @return the bookid
     */
    public int getBookid() {
        return bookid;
    }

    /**
     * @param bookid the bookid to set
     */
    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    /**
     * @return the soldprice
     */
    public double getSoldprice() {
        return soldprice;
    }

    /**
     * @param soldprice the soldprice to set
     */
    public void setSoldprice(double soldprice) {
        this.soldprice = soldprice;
    }

    /**
     * @return the fromdate
     */
    public String getFromdate() {
        return fromdate;
    }

    /**
     * @param fromdate the fromdate to set
     */
    public void setFromdate(String fromdate) {
        this.fromdate = fromdate;
    }

    /**
     * @return the todate
     */
    public String getTodate() {
        return todate;
    }

    /**
     * @param todate the todate to set
     */
    public void setTodate(String todate) {
        this.todate = todate;
    }
    
    public boolean setInitialBookPrice(){
        boolean val = false;
        
        try {
            DB.setData("insert into bookprice(bookbookid, soldprice, datefrom, dateto) values('"+getBookid()+"', '"+getSoldprice()+"', '"+fromdate+"', '"+todate+"')");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new user: " + e);
        }
        
        return val;
        
    }
    
    public boolean updateBookPrice(){
        boolean val = false;
        
        try {
            DB.setData("update bookprice set dateto = '"+getFromdate()+"' where bookbookid = '"+getBookid()+"' AND isactive = '1'");
            DB.setData("update bookprice set isactive = '0' where bookbookid = '"+getBookid()+"' AND isactive = '1'");
            DB.setData("insert into bookprice(bookbookid, soldprice, datefrom, dateto) values('"+getBookid()+"', '"+getSoldprice()+"', '"+fromdate+"', '"+todate+"')"); 
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new user: " + e);
        }
        
        return val;
        
    }
    
    public ResultSet getBookPriceDetails(int bookid){
        ResultSet rs = null;
        
        try {
            rs = DB.getData("select * from bookprice where bookbookid = '"+bookid+"'");
        } catch (Exception e) {
            System.out.println("Error from Getdoctortypes: " + e);
        }
        
        return rs;
    }
    
    public ResultSet getCurrentBookPriceDetails(int bookid){
        ResultSet rs = null;
        
        try {
            rs = DB.getData("select * from bookprice where bookbookid = '"+bookid+"' AND isactive = '1'");
        } catch (Exception e) {
            System.out.println("Error from Get Current BookPrice Details: " + e);
        }
        
        return rs;
    }
    
}
