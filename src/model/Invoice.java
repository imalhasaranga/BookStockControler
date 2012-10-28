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
public class Invoice {
    private int dealerid;
    private int userid;
    private double total;
    private double paidtotal;
    private String date;
    private String paytype;

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
     * @return the userid
     */
    public int getUserid() {
        return userid;
    }

    /**
     * @param userid the userid to set
     */
    public void setUserid(int userid) {
        this.userid = userid;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the paidtotal
     */
    public double getPaidtotal() {
        return paidtotal;
    }

    /**
     * @param paidtotal the paidtotal to set
     */
    public void setPaidtotal(double paidtotal) {
        this.paidtotal = paidtotal;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the paytype
     */
    public String getPaytype() {
        return paytype;
    }

    /**
     * @param paytype the paytype to set
     */
    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }
    
    public boolean addNewCashInvoice(){
        boolean val = false;
        
        try {
            DB.setData("insert into invoice(dealerdealerid, useruserid, total, paidtotal, invoicedate) values('"+getDealerid()+"', '"+getUserid()+"', '"+getTotal()+"', '"+getPaidtotal()+"', '"+getDate()+"')");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new cash invoice: " + e);
        }
        
        return val;
        
    }
    
    public boolean addNewInvoice(String paytype){
        boolean val = false;
        
        try {
            DB.setData("insert into invoice(dealerdealerid, useruserid, total, paidtotal, invoicedate, type) values('"+getDealerid()+"', '"+getUserid()+"', '"+getTotal()+"', '"+getPaidtotal()+"', '"+getDate()+"', '"+paytype+"')");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new cheque invoice: " + e);
        }
        
        return val;
        
    }
    
    public boolean cancellInvoice(int invoiceid){
        boolean val = false;
        
        try {
            DB.setData("update invoice set isactive = '0' where inno = '"+invoiceid+"'");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new cheque invoice: " + e);
        }
        
        return val;
        
    }
    
    public int getLatInvoiceNo(){
        ResultSet rs = null;
        int lastid = 0;
        
        try {
            rs = DB.getData("SELECT MAX(inno) AS maxinno FROM invoice");
            rs.next();
            lastid = rs.getInt("maxinno");
        } catch (Exception e) {
            System.out.println("Error from Getdoctortypes: " + e);
        }
        
        return lastid;
    }
    
    public int getDealerLatInvoiceNo(int did){
        ResultSet rs = null;
        int lastid = 0;
        
        try {
            rs = DB.getData("SELECT MAX(inno) AS dealermaxinno FROM invoice WHERE dealerdealerid = '"+did+"'");
            rs.next();
            lastid = rs.getInt("dealermaxinno");
        } catch (Exception e) {
            System.out.println("Error from Getdoctortypes: " + e);
        }
        
        return lastid;
    }
    
    public ResultSet getDateInvoices(String dt){
        ResultSet rs = null;
        
        try {
            rs = DB.getData("SELECT inv.inno, dl.name, inv.total, inv.paidTotal, inv.type, inv.isactive FROM invoice inv, dealer dl WHERE inv.dealerdealerid = dl.dealerid AND DATE(inv.invoicedate) = '"+dt+"' ORDER BY inno desc");
        } catch (Exception e) {
            System.out.println("Error from getDateInvoices: " + e);
        }
        
        return rs;
    }
    
    public ResultSet getDateInvoiceRecs(int inno){
        ResultSet rs = null;
        
        try {
            rs = DB.getData("SELECT bk.title, ir.qty, ir.amount FROM invoicerecord ir, book bk WHERE ir.bookbookid = bk.bookid AND ir.invoiceinno = '"+inno+"' ORDER BY ir.irno");
        } catch (Exception e) {
            System.out.println("Error from getDateInvoiceRecs: " + e);
        }
        
        return rs;
    }
    
    public ResultSet getDateReturnRecs(int inno){
        ResultSet rs = null;
        
        try {
            rs = DB.getData("select bk.title, rr.qty, rr.amount FROM returnrecord rr, book bk WHERE rr.bookbookid = bk.bookid AND rr.invoiceinno = '"+inno+"' ORDER BY rr.rrno");
        } catch (Exception e) {
            System.out.println("Error from getDateReturnRecs: " + e);
        }
        
        return rs;
    }
    
}
