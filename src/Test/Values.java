/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author Imal
 */
 class Values1 {

    private String DisplayMember;
    private int ValueMember;
    

    //This will be your display member
    @Override
    public String toString() {
        return this.getDisplayMember();
    }

    /**
     * @return the DisplayMember
     */
    public String getDisplayMember() {
        return DisplayMember;
    }

    /**
     * @param DisplayMember the DisplayMember to set
     */
    public void setDisplayMember(String DisplayMember) {
        this.DisplayMember = DisplayMember;
    }

    /**
     * @return the ValueMember
     */
    public int getValueMember() {
        return ValueMember;
    }

    /**
     * @param ValueMember the ValueMember to set
     */
    public void setValueMember(int ValueMember) {
        this.ValueMember = ValueMember;
    }
}
