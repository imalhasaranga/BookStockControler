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
public class User {
    private String username;
    private String password;
    private String name;
    private String contact;
    private int utype;
    private int isactive;
    private int companyid;

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the utype
     */
    public int getUtype() {
        return utype;
    }

    /**
     * @param utype the utype to set
     */
    public void setUtype(int utype) {
        this.utype = utype;
    }

    /**
     * @return the isactive
     */
    public int getIsactive() {
        return isactive;
    }

    /**
     * @param isactive the isactive to set
     */
    public void setIsactive(int isactive) {
        this.isactive = isactive;
    }

    /**
     * @return the companyid
     */
    public int getCompanyid() {
        return companyid;
    }

    /**
     * @param companyid the companyid to set
     */
    public void setCompanyid(int companyid) {
        this.companyid = companyid;
    }
    
    public boolean addNewUser(){
        boolean val = false;
        System.out.println("ID: " + getUtype());
        try {
            DB.setData("insert into user(username, password, name, contactno, usertypeutypeid, companycompanyid) values('"+getUsername()+"', '"+getPassword()+"', '"+getName()+"', '"+getContact()+"', '"+getUtype()+"', '"+getCompanyid()+"')");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new user: " + e);
        }
        
        return val;
        
    }
    
    public boolean updateUser(int userid, String newname, String newcontact){
        boolean val = false;
        System.out.println("ID: " + userid);
        try {
            DB.setData("update user set name = '"+newname+"', contactno = '"+newcontact+"' where userid = '"+userid+"'");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from update user: " + e);
        }
        
        return val;
        
    }
    
    public boolean setUserAsAdmin(int userid){
        boolean val = false;
        System.out.println("ID: " + userid);
        try {
            DB.setData("update user set usertypeutypeid = '1' where userid = '"+userid+"'");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from update user: " + e);
        }
        
        return val;
        
    }
    
    public boolean setAdminAsUser(int userid){
        boolean val = false;
        System.out.println("ID: " + userid);
        try {
            DB.setData("update user set usertypeutypeid = '2' where userid = '"+userid+"'");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from update user: " + e);
        }
        
        return val;
        
    }
    
    public boolean deactivateUser(int userid){
        boolean val = false;
        
        try {
            DB.setData("update user set isactive = '0' where userid = '"+userid+"'");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from Add new user: " + e);
        }
        
        return val;
        
    }
    
    public boolean changePassword(String newpass, int userid){
        boolean val = false;
        try {
            DB.setData("update user set password = '"+newpass+"' where userid = '"+userid+"'");  
            val = true;
        } catch (Exception e) {
            val = false;
            System.out.println("Error from password change: " + e);
        }
        
        return val;
        
    }
    
    public ResultSet getAllUserDetails(){
        ResultSet rs = null;
        
        try {
            rs = DB.getData("select * from user");
        } catch (Exception e) {
            System.out.println("Error from select all users: " + e);
        }
        
        return rs;
    }
    
    public boolean userValidate(String username, String password){
        boolean val = false;
        try {
            ResultSet rs = DB.getData("select * from user where username = '"+username+"' && password = '"+password+"'");
                if(rs.next()){
                    val = true;
                }else{
                    val = false;
                }
        } catch (Exception e) {
            val = false;
            System.out.println("Error: " + e);
        }
        
        return val;
        
    }
    
    public int getUserTypeId(String logusername){
        int id = 0;
        
        try {
            ResultSet rs = DB.getData("select usertypeutypeid as utypeid from user where username = '"+logusername+"'");
            rs.next();
            id = rs.getInt("utypeid");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return id;
    }
    
    public int getUserId(String logusername){
        int id = 0;
        
        try {
            ResultSet rs = DB.getData("select userid from user where username = '"+logusername+"'");
            rs.next();
            id = rs.getInt("userid");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        return id;
    }
    
}
