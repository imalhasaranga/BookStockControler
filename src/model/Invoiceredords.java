/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Gihan
 */
public class Invoiceredords {
    private int inno;
    private int bookid;
    private int qty;
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
    
    public boolean addNewInvoiceRecord(){
        boolean val = false;
        
        try {
            DB.setData("insert into invoicerecord(invoiceinno, bookbookid, qty, amount) values('"+getInno()+"', '"+getBookid()+"', '"+getQty()+"', '"+getAmount()+"')");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new cash invoice: " + e);
        }
        
        return val;
        
    }
    
    
}
