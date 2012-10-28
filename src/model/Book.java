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
public class Book {
    private int booktypeid;
    private int discid;
    private String code;
    private String title;

    /**
     * @return the booktypeid
     */
    public int getBooktypeid() {
        return booktypeid;
    }

    /**
     * @param booktypeid the booktypeid to set
     */
    public void setBooktypeid(int booktypeid) {
        this.booktypeid = booktypeid;
    }

    /**
     * @return the discid
     */
    public int getDiscid() {
        return discid;
    }

    /**
     * @param discid the discid to set
     */
    public void setDiscid(int discid) {
        this.discid = discid;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    public boolean addNewBook(){
        boolean val = false;
        
        try {
            DB.setData("insert into book(booktypebtypeid, discountdiscountid, code, title) values('"+getBooktypeid()+"', '"+getDiscid()+"', '"+getCode()+"', '"+getTitle()+"')");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new user: " + e);
        }
        
        return val;
        
    }
    
    public int addNewBook2(){
        int setDataAndGet = 0;
        
        try {
            setDataAndGet = DB.setDataAndGet("insert into book(booktypebtypeid, discountdiscountid, code, title) values('"+getBooktypeid()+"', '"+getDiscid()+"', '"+getCode()+"', '"+getTitle()+"')");
        } catch (Exception e) {
            System.out.println("Error from Add new user: " + e);
        }
        
        return setDataAndGet;
        
    }
    
    public boolean deactivateBook(int bookid){
        boolean val = false;
        
        try {
            DB.setData("update book set isactive = '0' where bookid = '"+bookid+"'");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new user: " + e);
        }
        
        return val;
        
    }
    
    public boolean updateBook(int bookid){
        boolean val = false;
        
        try {
            DB.setData("update book set title = '"+getTitle()+"', booktypebtypeid = '"+getBooktypeid()+"' where bookid = '"+bookid+"'");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new user: " + e);
        }
        
        return val;
        
    }
    
    public ResultSet getBookDetails(String searchterm){
        ResultSet rs = null;
        
        try {
            rs = DB.getData("select * from book where code like '"+searchterm+"%' OR title like'"+searchterm+"%' AND isactive = '1'");
        } catch (Exception e) {
            System.out.println("Error from Getdoctortypes: " + e);
        }
        
        return rs;
    }
    
    public boolean checkBookCode(String newcode){
        boolean checkval = false;
        
        try {
            ResultSet rs = DB.getData("select * from book where code = '"+newcode+"'");
                if(rs.next()){
                    checkval = true;
                }else{
                    checkval = false;
                }
        } catch (Exception e) {
            checkval = false;
            System.out.println("Error from Getdoctortypes: " + e);
        }
        
        return checkval;
    }
    
    public int getLatBookId(){
        ResultSet rs = null;
        int bookid = 0;
        
        try {
            rs = DB.getData("SELECT MAX(bookid) AS maxbookid FROM book");
            rs.next();
            bookid = rs.getInt("maxbookid");
        } catch (Exception e) {
            System.out.println("Error from Getdoctortypes: " + e);
        }
        
        return bookid;
    }
    
    public ResultSet getBooksToTable(){
        ResultSet rs = null;
        
        try {
            rs = DB.getData("SELECT bk.bookid, bk.code, bk.title, bk.booktypebtypeid AS btype, bt.type, bk.isactive FROM book bk, booktype bt WHERE bk.booktypebtypeid = bt.btypeid ORDER BY bookid");
        } catch (Exception e) {
            System.out.println("Error from Get books to table: " + e);
        }
        
        return rs;
    }
    
    public ResultSet getBooksToTable2(){
        ResultSet rs = null;
        
        try {
            rs = DB.getData("SELECT bk.bookid, bk.code, bk.title, bt.type, bp.soldprice FROM book bk, booktype bt, bookprice bp WHERE bk.booktypebtypeid = bt.btypeid AND bk.bookid = bp.bookbookid AND bp.isactive = '1' ORDER BY bookid");
        } catch (Exception e) {
            System.out.println("Error from Get books to table: " + e);
        }
        
        return rs;
    }
    
    public ResultSet getBooksToTable3(){
        ResultSet rs = null;
        
        try {
            rs = DB.getData("SELECT bk.bookid, bk.code, bk.title, bt.type, bs.qty FROM book bk, booktype bt, bookstock bs WHERE bk.booktypebtypeid = bt.btypeid AND bk.bookid = bs.bookbookid ORDER BY bookid");
        } catch (Exception e) {
            System.out.println("Error from Get books to table: " + e);
        }
        
        return rs;
    }
    
    public ResultSet getBooksDetails(){
        ResultSet rs = null;
        
        try {
            rs = DB.getData("select * from book");
        } catch (Exception e) {
            System.out.println("Error from getBooksDetails: " + e);
        }
        
        return rs;
    }
    
    
}
