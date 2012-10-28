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
public class Bookdiscount {
    private int bookid;
    private int discountid;

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
     * @return the discountid
     */
    public int getDiscountid() {
        return discountid;
    }

    /**
     * @param discountid the discountid to set
     */
    public void setDiscountid(int discountid) {
        this.discountid = discountid;
    }
    
    public boolean addDiscountForBook(){
        boolean val = false;
        
        try {
            DB.setData("insert into bookdiscount(bookbookid, discountdiscountid) values('"+getBookid()+"', '"+getDiscountid()+"')");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add Discount for book: " + e);
        }
        
        return val;
        
    }
    
    public ResultSet getCurrentBookDiscounts(int bookid){
        ResultSet rs = null;
        
        try {
            rs = DB.getData("SELECT bd.bookbookid, dc.percentage FROM bookdiscount bd, discount dc WHERE bd.bookbookid = '"+bookid+"' AND bd.discountdiscountid = dc.discountid");
        } catch (Exception e) {
            System.out.println("Error from Get Current BookPrice Details: " + e);
        }
        
        return rs;
    }
}
