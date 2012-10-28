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
public class Company {
    private String comname;
    private String address;
    private String con1;
    private String con2;
    private String email;
    private String web;
    private String fax;

    /**
     * @return the comname
     */
    public String getComname() {
        return comname;
    }

    /**
     * @param comname the comname to set
     */
    public void setComname(String comname) {
        this.comname = comname;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the con1
     */
    public String getCon1() {
        return con1;
    }

    /**
     * @param con1 the con1 to set
     */
    public void setCon1(String con1) {
        this.con1 = con1;
    }

    /**
     * @return the con2
     */
    public String getCon2() {
        return con2;
    }

    /**
     * @param con2 the con2 to set
     */
    public void setCon2(String con2) {
        this.con2 = con2;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the web
     */
    public String getWeb() {
        return web;
    }

    /**
     * @param web the web to set
     */
    public void setWeb(String web) {
        this.web = web;
    }

    /**
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = fax;
    }
    
    public ResultSet getCompanyDetails(){
        ResultSet rs = null;
        
        try {
            rs = DB.getData("select * from company where companyid = '1'");
        } catch (Exception e) {
            System.out.println("Error from Get Company Details: " + e);
        }
        
        return rs;
    }
    
}
