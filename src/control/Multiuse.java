/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import model.Book;
import model.Bookdiscount;
import model.Bookprice;
import model.Dealer;
import model.Dealerbalance;

/**
 *
 * @author Gihan
 */
public class Multiuse {
    Dealer dealer;
    Book book;
    Bookprice bookprice;
    Bookdiscount bookdisc;
    Dealerbalance dealerbal;
    
    int bookid;
    int dealerid;
    String dealername;
    String booktitle;
    double dealerbalance;
    double itemprice;
    double discountprice;
    
    
    
    public void delaerSearch(JList list, JScrollPane scroll, String searchterm){
        Vector vec = new Vector();
        dealer = new Dealer();
        
        try {
            ResultSet rs = dealer.getDealerDetails(searchterm);
                while(rs.next()){
                    vec.add(rs.getString("name") + "-" + rs.getString("dealerid")); 
                }
        } catch (Exception e) {
            System.out.println("Error: While Searching " + e);
        }
        
        list.setListData(vec); 
        list.setVisible(true); 
        scroll.setVisible(true);
        
        if(vec.size() == 0){
            scroll.setSize(scroll.getWidth(), 0); 
        }else{
            int y = (32 + (vec.size() - 1) * 18);
            scroll.setSize(scroll.getWidth(), y);
        }
        
    }
    
    public void BookSearch(JList list, JScrollPane scroll, String searchterm){
        Vector vec = new Vector();
        book = new Book();
        
        try {
            ResultSet rs = book.getBookDetails(searchterm);
                while(rs.next()){
                    String res = rs.getString("code") + "/" + rs.getString("title") + "/" + rs.getString("bookid");
                    vec.add(res); 
                    
                }
        } catch (Exception e) {
            System.out.println("Error: While Searching " + e);
        }
        
        list.setListData(vec); 
        list.setVisible(true); 
        scroll.setVisible(true);
        
        if(vec.size() == 0){
            scroll.setSize(scroll.getWidth(), 0); 
        }else{
            int y = (32 + (vec.size() - 1) * 18);
            scroll.setSize(scroll.getWidth(), y);
        }
        
    }
    
    public int getBookId(String text){
        String textarray[] = text.split("/");
        bookid = Integer.parseInt(textarray[2]);
        
        return bookid;
    }
    
    public void setBookId(){
        bookid = 0;
    }
    
    public String getBookTitle(String text){
        String textarray[] = text.split("/");
        booktitle = textarray[1];
        
        return booktitle;
    }
    
    public int getDealerId(String text){
        String textarray[] = text.split("-");
        dealerid = Integer.parseInt(textarray[1]);
        
        return dealerid;
    }
    
    public String getDealerName(String text){
        String textarray[] = text.split("-");
        dealername = textarray[0];
        
        return dealername;
    }
    
    public double getDealerBalance(int did){
        dealerbal = new Dealerbalance();
        
        try {
            ResultSet rs = dealerbal.getDealerBalanceDetails(did);
            rs.next();
            dealerbalance = rs.getDouble("netbalance");
        } catch (Exception e) {
            System.out.println("Error: from get dealer balance control: " + e);
        }
        
        return dealerbalance;
    }
    
    public void loadDiscounts(JComboBox cmb, int bid){
        bookdisc = new Bookdiscount();
        
        try {
            ResultSet rs = bookdisc.getCurrentBookDiscounts(bid);
                while(rs.next()){
                    cmb.addItem(rs.getString("percentage")); 
                }
        } catch (Exception e) {
            System.out.println("Error: from get dealer balance control: " + e);
        }
        
    }
    
    public double getItemPrice(int bid){
        bookprice = new Bookprice();
        
        try {
            ResultSet rs = bookprice.getCurrentBookPriceDetails(bid);
            rs.next();
            itemprice = rs.getDouble("soldprice");
        } catch (Exception e) {
            System.out.println("Error: from get dealer balance control: " + e);
        }
        
        return itemprice;
    }
    
    public double getDiscountPrice(){
        
        
        return discountprice;
    }
    
    
    
    
}
