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
public class Reportsummary {
    
    public int getTotalInvoices(String date, int userid){
        int totinvoices = 0;
        
        try {
            ResultSet rs = DB.getData("SELECT COUNT(inno) AS totinvoices FROM invoice WHERE DATE(invoicedate) = '"+date+"' AND useruserid = '"+userid+"' AND isactive = '1'");
            rs.next();
            totinvoices = rs.getInt("totinvoices");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return totinvoices;
    }
    
    public int getTotalSoldQty(String date, int userid){
        int totsoldqty = 0;
        
        try {
            ResultSet rs = DB.getData("SELECT SUM(ir.qty) AS totsoldqty FROM invoicerecord ir, invoice inv WHERE DATE(inv.invoicedate) = '"+date+"' AND inv.useruserid = '"+userid+"' AND inv.isactive = '1' AND ir.invoiceinno = inv.inno");
            rs.next();
            totsoldqty = rs.getInt("totsoldqty");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return totsoldqty;
    }
    
    public int getTotalReturnQty(String date, int userid){
        int totreturnqty = 0;
        
        try {
            ResultSet rs = DB.getData("SELECT SUM(rr.qty) AS totreturnqty FROM returnrecord rr, invoice inv WHERE DATE(inv.invoicedate) = '"+date+"' AND inv.useruserid = '"+userid+"' AND inv.isactive = '1' AND rr.invoiceinno = inv.inno");
            rs.next();
            totreturnqty = rs.getInt("totreturnqty");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return totreturnqty;
    }
    
    public int getTotalInvoices(String date, String type, int userid){
        int totinvoices = 0;
        
        try {
            ResultSet rs = DB.getData("SELECT COUNT(inno) AS totinvoices FROM invoice WHERE TYPE = '"+type+"' AND DATE(invoicedate) = '"+date+"' AND useruserid = '"+userid+"' AND isactive = '1'");
            rs.next();
            totinvoices = rs.getInt("totinvoices");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return totinvoices;
    }
    
    public double getTotalAmount(String date, int userid){
        double totalamount = 0.00;
        
        try {
            ResultSet rs = DB.getData("SELECT SUM(paidTotal) AS total FROM invoice WHERE DATE(invoicedate) = '"+date+"' AND useruserid = '"+userid+"' AND isactive = '1'");
            rs.next();
            totalamount = rs.getDouble("total");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return totalamount;
    }
    
    public double getChequeAmount(String date, int userid){
        double chequeamount = 0.00;
        
        try {
            ResultSet rs = DB.getData("SELECT SUM(ch.amount) AS chequeamount FROM chequeinvoice ch, invoice inv WHERE DATE(inv.invoicedate) = '"+date+"' AND inv.type = 'cheque' AND inv.useruserid = '"+userid+"' AND inv.isactive = '1' AND ch.invoiceinno = inv.inno");
            rs.next();
            chequeamount = rs.getDouble("chequeamount");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return chequeamount;
    }
    
    public double getChequeAmount2(String date, int userid){
        double chequeamount = 0.00;
        
        try {
            ResultSet rs = DB.getData("SELECT SUM(ch.amount) AS chequeamount FROM chequeinvoice ch, invoice inv WHERE DATE(inv.invoicedate) = '"+date+"' AND inv.type = 'both' AND inv.useruserid = '"+userid+"' AND inv.isactive = '1' AND ch.invoiceinno = inv.inno");
            rs.next();
            chequeamount = rs.getDouble("chequeamount");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return chequeamount;
    }
    
    public double getReturnAmount(String date, int userid){
        double returnamount = 0.00;
        
        try {
            ResultSet rs = DB.getData("SELECT SUM(amount) AS returntot FROM returnrecord rr, invoice inv WHERE DATE(inv.invoicedate) = '"+date+"' AND inv.useruserid = '"+userid+"' AND inv.isactive = '1' AND rr.invoiceinno = inv.inno");
            rs.next();
            returnamount = rs.getDouble("returntot");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return returnamount;
    }
    
}
