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
public class Repbooksummary {
    
    public int getTotalSoldQty(String fromdate, String todate, int bookid){
        int totsoldqty = 0;
        
        try {
            ResultSet rs = DB.getData("SELECT SUM(ir.qty) AS totsoldqty FROM invoicerecord ir, invoice inv WHERE ir.bookbookid = '"+bookid+"' AND DATE(inv.invoicedate) BETWEEN '"+fromdate+"' AND '"+todate+"' AND ir.invoiceinno = inv.inno");
            rs.next();
            totsoldqty = rs.getInt("totsoldqty");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return totsoldqty;
    }
    
    public double getTotalSoldAmount(String fromdate, String todate, int bookid){
        double totsoldamount = 0;
        
        try {
            ResultSet rs = DB.getData("SELECT SUM(ir.amount) AS totsoldamount FROM invoicerecord ir, invoice inv WHERE ir.bookbookid = '"+bookid+"' AND DATE(inv.invoicedate) BETWEEN '"+fromdate+"' AND '"+todate+"' AND ir.invoiceinno = inv.inno");
            rs.next();
            totsoldamount = rs.getDouble("totsoldamount");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return totsoldamount;
    }
    
    public int getTotalReturnQty(String fromdate, String todate, int bookid){
        int totreturnqty = 0;
        
        try {
            ResultSet rs = DB.getData("SELECT SUM(rr.qty) AS totreturnqty FROM returnrecord rr, invoice inv WHERE rr.bookbookid = '"+bookid+"' AND DATE(inv.invoicedate) BETWEEN '"+fromdate+"' AND '"+todate+"' AND rr.invoiceinno = inv.inno");
            rs.next();
            totreturnqty = rs.getInt("totreturnqty");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return totreturnqty;
    }
    
    public double getTotalReturnAmount(String fromdate, String todate, int bookid){
        double totreturnamount = 0;
        
        try {
            ResultSet rs = DB.getData("SELECT SUM(rr.amount) AS totreturnamount FROM returnrecord rr, invoice inv WHERE rr.bookbookid = '"+bookid+"' AND DATE(inv.invoicedate) BETWEEN '"+fromdate+"' AND '"+todate+"' AND rr.invoiceinno = inv.inno");
            rs.next();
            totreturnamount = rs.getDouble("totreturnamount");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return totreturnamount;
    }
    
    public ResultSet getBookAllDetails(){
        ResultSet rs = null;
        
        try {
            rs = DB.getData("SELECT bk.bookid, SUM(ir.qty) AS soldqty, SUM(ir.amount) AS soldamount FROM book bk, invoicerecord ir WHERE bk.bookid = ir.bookbookid GROUP BY bk.bookid ORDER BY bk.bookid");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return rs;
    }
    
    public ResultSet getBookAllDetails2(){
        ResultSet rs = null;
        
        try {
            rs = DB.getData("SELECT bk.bookid, SUM(rr.qty) AS returnqty, SUM(rr.amount) AS returnamount FROM book bk, returnrecord rr WHERE bk.bookid = rr.bookbookid GROUP BY bk.bookid ORDER BY bk.bookid");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return rs;
    }
    
    
}
