/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Gihan
 */
public class Bookstock {
    private int bookid;
    private int qty;

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
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public boolean setInitialBookQty(){
        boolean val = false;
        
        try {
            DB.setData("insert into bookstock(qty, bookbookid) values('"+getQty()+"', '"+getBookid()+"')");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new user: " + e);
        }
        
        return val;
        
    }
    
    public boolean updateBookQty(){
        boolean val = false;
        
        try {
            DB.setData("update bookstock set qty = '"+getQty()+"' where bookbookid = '"+getBookid()+"'");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new user: " + e);
        }
        
        return val;
        
    }
    
    public boolean DeductBookStock(int dqty, int bid){
        boolean val = false;
        
        try {
            DB.setData("update bookstock set qty = qty - '"+dqty+"' where bookbookid = '"+bid+"'");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Deduct Books: " + e);
        }
        
        return val;
        
    }
    
    public boolean AddToBookStock(int aqty, int bid){
        boolean val = false;
        
        try {
            DB.setData("update bookstock set qty = qty + '"+aqty+"' where bookbookid = '"+bid+"'");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new user: " + e);
        }
        
        return val;
        
    }
    
}
