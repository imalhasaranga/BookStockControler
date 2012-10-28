/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.*;
import java.util.Vector;

/**
 *
 * @author Gihan
 */
public class Printinvoice implements Printable{
    public String title = "Sathara Prakashakayo";
    public String address = "122, Avissawella Road, Maharagama";
    public String contact = "Tel: 0112850981 / 7394141, Fax: 2846256";
    public String email = "sathara@sathara.com";
    
    private static double pixelinch = 72;
    
    private String dealer;
    private String dcity;
    private int dealerid;
    private String date;
    private String time;
    private int inno;
    private String paymethod;
    private double dealerbal;
    private double currdbalance;
    
    private int invoicerows;
    private int returnrows;
    
    private Vector books1;
    private Vector books2;
    private Vector qty1;
    private Vector qty2;
    private Vector iprice1;
    private Vector iprice2;
    private Vector dprice1;
    private Vector dprice2;
    private Vector amount1;
    private Vector amount2;
    
    private double invoicetotal;
    private double returntotal;
    private double totalamount;
    private double cash;
    private double chamount;
    private double balance;
    
    private int chnumber;
    private String chdate;
    private String bank;
    

    /**
     * @return the dealer
     */
    public String getDealer() {
        return dealer;
    }

    /**
     * @param dealer the dealer to set
     */
    public void setDealer(String dealer) {
        this.dealer = dealer;
    }

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
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

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
     * @return the paymethod
     */
    public String getPaymethod() {
        return paymethod;
    }

    /**
     * @param paymethod the paymethod to set
     */
    public void setPaymethod(String paymethod) {
        this.paymethod = paymethod;
    }

    /**
     * @return the books1
     */
    public Vector getBooks1() {
        return books1;
    }

    /**
     * @param books1 the books1 to set
     */
    public void setBooks1(Vector books1) {
        this.books1 = books1;
    }

    /**
     * @return the books2
     */
    public Vector getBooks2() {
        return books2;
    }

    /**
     * @param books2 the books2 to set
     */
    public void setBooks2(Vector books2) {
        this.books2 = books2;
    }

    /**
     * @return the qty1
     */
    public Vector getQty1() {
        return qty1;
    }

    /**
     * @param qty1 the qty1 to set
     */
    public void setQty1(Vector qty1) {
        this.qty1 = qty1;
    }

    /**
     * @return the qty2
     */
    public Vector getQty2() {
        return qty2;
    }

    /**
     * @param qty2 the qty2 to set
     */
    public void setQty2(Vector qty2) {
        this.qty2 = qty2;
    }

    /**
     * @return the amount1
     */
    public Vector getAmount1() {
        return amount1;
    }

    /**
     * @param amount1 the amount1 to set
     */
    public void setAmount1(Vector amount1) {
        this.amount1 = amount1;
    }

    /**
     * @return the amount2
     */
    public Vector getAmount2() {
        return amount2;
    }

    /**
     * @param amount2 the amount2 to set
     */
    public void setAmount2(Vector amount2) {
        this.amount2 = amount2;
    }

    /**
     * @return the invoicetotal
     */
    public double getInvoicetotal() {
        return invoicetotal;
    }

    /**
     * @param invoicetotal the invoicetotal to set
     */
    public void setInvoicetotal(double invoicetotal) {
        this.invoicetotal = invoicetotal;
    }

    /**
     * @return the returntotal
     */
    public double getReturntotal() {
        return returntotal;
    }

    /**
     * @param returntotal the returntotal to set
     */
    public void setReturntotal(double returntotal) {
        this.returntotal = returntotal;
    }

    /**
     * @return the totalamount
     */
    public double getTotalamount() {
        return totalamount;
    }

    /**
     * @param totalamount the totalamount to set
     */
    public void setTotalamount(double totalamount) {
        this.totalamount = totalamount;
    }

    /**
     * @return the cash
     */
    public double getCash() {
        return cash;
    }

    /**
     * @param cash the cash to set
     */
    public void setCash(double cash) {
        this.cash = cash;
    }

    /**
     * @return the chamount
     */
    public double getChamount() {
        return chamount;
    }

    /**
     * @param chamount the chamount to set
     */
    public void setChamount(double chamount) {
        this.chamount = chamount;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the chnumber
     */
    public int getChnumber() {
        return chnumber;
    }

    /**
     * @param chnumber the chnumber to set
     */
    public void setChnumber(int chnumber) {
        this.chnumber = chnumber;
    }

    /**
     * @return the chdate
     */
    public String getChdate() {
        return chdate;
    }

    /**
     * @param chdate the chdate to set
     */
    public void setChdate(String chdate) {
        this.chdate = chdate;
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
     * @return the iprice1
     */
    public Vector getIprice1() {
        return iprice1;
    }

    /**
     * @param iprice1 the iprice1 to set
     */
    public void setIprice1(Vector iprice1) {
        this.iprice1 = iprice1;
    }

    /**
     * @return the iprice2
     */
    public Vector getIprice2() {
        return iprice2;
    }

    /**
     * @param iprice2 the iprice2 to set
     */
    public void setIprice2(Vector iprice2) {
        this.iprice2 = iprice2;
    }

    /**
     * @return the dprice1
     */
    public Vector getDprice1() {
        return dprice1;
    }

    /**
     * @param dprice1 the dprice1 to set
     */
    public void setDprice1(Vector dprice1) {
        this.dprice1 = dprice1;
    }

    /**
     * @return the dprice2
     */
    public Vector getDprice2() {
        return dprice2;
    }

    /**
     * @param dprice2 the dprice2 to set
     */
    public void setDprice2(Vector dprice2) {
        this.dprice2 = dprice2;
    }
    
     /**
     * @return the dealerbal
     */
    public double getDealerbal() {
        return dealerbal;
    }

    /**
     * @param dealerbal the dealerbal to set
     */
    public void setDealerbal(double dealerbal) {
        this.dealerbal = dealerbal;
    }
    
     /**
     * @return the currdbalance
     */
    public double getCurrdbalance() {
        return currdbalance;
    }

    /**
     * @param currdbalance the currdbalance to set
     */
    public void setCurrdbalance(double currdbalance) {
        this.currdbalance = currdbalance;
    }
    
    /**
     * @return the dcity
     */
    public String getDcity() {
        return dcity;
    }

    /**
     * @param dcity the dcity to set
     */
    public void setDcity(String dcity) {
        this.dcity = dcity;
    }
    
    
    
    
    
    
    
    public int getPageHeight(int invrows, int retrows){
        int ph = 140;
        
        for(int x = 0; x < invoicerows; x++){
            ph += 10;
            
        }
        
        for(int x = 0; x < returnrows; x++){
            ph += 10;
            
        }
        
        ph += 160;
    
        return ph;
    }
    
    public void printThisInvoice(int invrows, int retrows){
        PrinterJob pj = PrinterJob.getPrinterJob();
        
        this.invoicerows = invrows;
        this.returnrows = retrows;
        
//Setting Paper Size----------------------------------------------------------------        
//        PageFormat pf = new PageFormat();
//        Paper paper = new Paper();
//        
//        double width = 6.5 * pixelinch;
//        double height = getPageHeight(invrows, retrows); 
//        paper.setSize(width, height); 
//        paper.setImageableArea(width, height, width, height);
//        pf.setPaper(paper); 
//        pj.setPrintable(this, pf); 
//----------------------------------------------------------------------------------        
        
        pj.setPrintable(this); 

            if(pj.printDialog()){
                try {
                    System.out.println("Starting........");
                    pj.print();
                    System.out.println("Done!......");
                } catch (Exception e) {
                    System.out.println("Error: Print Error: " + e);
                }
            }
            
    }
    
    
    @Override
    public int print(Graphics g, PageFormat pf, int pageIndex) throws PrinterException {
        
        if(pageIndex > 0){
            return NO_SUCH_PAGE;
        }
        
        int h = 140;
        Graphics2D gr2d = (Graphics2D)g;
        gr2d.translate(pf.getImageableX(), pf.getImageableY());
        
        Font fonth = new Font("arial", Font.BOLD, 12);
        Font fontn = new Font("arial", Font.PLAIN, 10);
        Font fontd = new Font("arial", Font.PLAIN, 8);
        
        g.setFont(fonth);
        g.drawString(title, 100, 30);
        g.setFont(fontn);
        g.drawString(address, 75, 40);
        g.drawString(contact, 80, 50);
        g.drawString(email, 115, 60);
        g.setFont(fontd);
        g.drawString("Agent: "+getDealer(), 30, 90);
        g.drawString("Date: "+getDate(), 210, 90);
        g.drawString("Time: "+getTime(), 210, 100);
        g.drawString("In.No: "+getInno(), 30, 100);
        g.drawString("Pay Method: "+getPaymethod(), 30, 110);
        g.drawString("Outstanding(Rs): "+getDealerbal(), 210, 110);
        
        g.drawLine(20, 120, 300, 120);
        g.drawString("Book Title", 30, 130);
        g.drawString("Item", 170, 130);
        g.drawString("Price", 170, 140);
        g.drawString("Discount", 200, 130);
        g.drawString("Price", 200, 140);
        g.drawString("Qty", 240, 130);
        g.drawString("Amount", 270, 130);
        g.drawLine(20, 140, 300, 140);
        
        for(int x = 0; x < invoicerows; x++){
            h += 10;
            g.drawString(""+getBooks1().get(x), 20, h);
            g.drawString(""+getIprice1().get(x), 170, h);
            g.drawString(""+getDprice1().get(x), 200, h);
            g.drawString(""+getQty1().get(x), 240, h);
            g.drawString(""+getAmount1().get(x), 270, h);
        }
        
        for(int x = 0; x < returnrows; x++){
            h += 10;
            g.drawString(""+getBooks2().get(x), 20, h);
            g.drawString(""+getIprice2().get(x), 170, h);
            g.drawString(""+getDprice2().get(x), 200, h);
            g.drawString("-"+getQty2().get(x), 240, h);
            g.drawString("-"+getAmount2().get(x), 270, h);
        }
        
        g.drawString("Pre-Outstanding(Rs):", 140, h+30);
        g.drawString(""+getCurrdbalance(), 270, h+30);
        g.drawString("Total Sold(Rs):", 140, h+40);
        g.drawString(""+getInvoicetotal(), 270, h+40);
        g.drawString("Total Return(Rs):", 140, h+50);
        g.drawString(""+getReturntotal(), 270, h+50);
        
        g.drawString("Total Amount(Rs):", 140, h+70);
        g.drawString(""+getTotalamount(), 270, h+70);
        
        g.drawString("Cash(Rs):", 140, h+80);
        g.drawString(""+getCash(), 270, h+80);
            if(getChamount() != 0.0){
                g.drawString("Cheque Amount(Rs):", 140, h+90);
                g.drawString(""+getChamount(), 270, h+90);
            }
        g.drawString("Balance(Rs):", 140, h+100);
        g.drawString(""+getBalance(), 270, h+100);
        
        g.drawLine(20, h+110, 300, h+110);
        g.setFont(fontn);
        
        if(getChamount() != 0.0){
            g.drawString("Cheque No:", 30, h+120);
            g.drawString(""+getChnumber(), 240, h+120);
            g.drawString("Cheque Date:", 30, h+130);
            g.drawString(""+getChdate(), 240, h+130);
            g.drawString("Bank:", 30, h+140);
            g.drawString(""+getBank(), 240, h+140);
        }
        
        return PAGE_EXISTS;
        
    }

    

   
    
    
}
