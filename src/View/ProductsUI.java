/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;

/**
 *
 * @author Gihan
 */
public class ProductsUI extends javax.swing.JFrame {
    int booktypeid;
    int discountid;
    int selectbookid;
    
    String booktitle;
    String bookcode;
    String bookcat;
    
    Booktype booktype;
    Book book;
    Discount discount;
    Bookdiscount bookdisc;
    Bookprice bookprice;
    Bookstock bookstock;
    
    /**
     * Creates new form ProductsUI
     */
    public ProductsUI() {
        initComponents();
        
        booktype = new Booktype();
        loadBookTypes(booktype.getAllBookTypeDetails()); 
        
        book = new Book();
        loadTable(book.getBooksToTable()); 
        
        discount = new Discount();
        loadDiscounts(discount.getAllDiscountDetails()); 
        
        bupdate.setEnabled(false); 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbbooktype = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        ttitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tcode = new javax.swing.JTextField();
        cmbdiscount = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblbtypes = new javax.swing.JTable();
        bdiscount = new javax.swing.JButton();
        bdiscount1 = new javax.swing.JButton();
        badd = new javax.swing.JButton();
        bupdate = new javax.swing.JButton();
        bupdate2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbooks = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tsearch = new javax.swing.JTextField();
        cmbsearch = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Books Details");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setText("Book Category:");

        cmbbooktype.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmbbooktype.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbbooktypeItemStateChanged(evt);
            }
        });

        jLabel2.setText("Book Title:");

        ttitle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ttitle.setForeground(new java.awt.Color(255, 102, 102));

        jLabel3.setText("Book Code:");

        tcode.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tcode.setForeground(new java.awt.Color(51, 102, 255));

        cmbdiscount.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmbdiscount.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbdiscountItemStateChanged(evt);
            }
        });

        tblbtypes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblbtypes.setForeground(new java.awt.Color(0, 102, 255));
        tblbtypes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Discount", "Percentage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblbtypes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblbtypes.setRowHeight(22);
        tblbtypes.setSelectionBackground(new java.awt.Color(0, 0, 255));
        tblbtypes.setSelectionForeground(new java.awt.Color(255, 255, 204));
        tblbtypes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbtypesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblbtypes);
        tblbtypes.getColumnModel().getColumn(0).setMinWidth(50);
        tblbtypes.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblbtypes.getColumnModel().getColumn(0).setMaxWidth(50);
        tblbtypes.getColumnModel().getColumn(2).setMinWidth(80);
        tblbtypes.getColumnModel().getColumn(2).setPreferredWidth(80);
        tblbtypes.getColumnModel().getColumn(2).setMaxWidth(80);

        bdiscount.setText("Add Discount");
        bdiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdiscountActionPerformed(evt);
            }
        });

        bdiscount1.setText("Remove");
        bdiscount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdiscount1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cmbbooktype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbdiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tcode, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ttitle, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bdiscount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bdiscount1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbbooktype, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbdiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tcode, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bdiscount)
                        .addGap(18, 18, 18)
                        .addComponent(bdiscount1)))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttitle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        badd.setText("Add");
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });

        bupdate.setText("Deactivate");
        bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bupdateActionPerformed(evt);
            }
        });

        bupdate2.setText("Update");
        bupdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bupdate2ActionPerformed(evt);
            }
        });

        tblbooks.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblbooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Code", "Book Title", "Type", "Isactive"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblbooks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblbooks.setRowHeight(22);
        tblbooks.setSelectionBackground(new java.awt.Color(0, 51, 204));
        tblbooks.setSelectionForeground(new java.awt.Color(255, 255, 204));
        tblbooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbooksMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblbooks);
        tblbooks.getColumnModel().getColumn(0).setMinWidth(50);
        tblbooks.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblbooks.getColumnModel().getColumn(0).setMaxWidth(50);
        tblbooks.getColumnModel().getColumn(1).setMinWidth(60);
        tblbooks.getColumnModel().getColumn(1).setPreferredWidth(60);
        tblbooks.getColumnModel().getColumn(1).setMaxWidth(60);
        tblbooks.getColumnModel().getColumn(3).setMinWidth(120);
        tblbooks.getColumnModel().getColumn(3).setPreferredWidth(120);
        tblbooks.getColumnModel().getColumn(3).setMaxWidth(120);
        tblbooks.getColumnModel().getColumn(4).setMinWidth(50);
        tblbooks.getColumnModel().getColumn(4).setPreferredWidth(50);
        tblbooks.getColumnModel().getColumn(4).setMaxWidth(50);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel5.setText("Search:");

        tsearch.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tsearch.setForeground(new java.awt.Color(51, 102, 255));

        cmbsearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Search by Code", "Search by Title" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(badd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bupdate2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(badd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bupdate2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-993)/2, (screenSize.height-616)/2, 993, 616);
    }// </editor-fold>//GEN-END:initComponents

    private void tblbtypesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbtypesMouseClicked
        

    }//GEN-LAST:event_tblbtypesMouseClicked

    private void bdiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdiscountActionPerformed
        DefaultTableModel dt = (DefaultTableModel) tblbtypes.getModel();
        discount = new Discount();
        Vector vec = new Vector();
        
        try {
            ResultSet rs = discount.getSelectedDiscount(getDiscoutId());
            rs.next();
            vec.add(rs.getInt("discountid"));
            vec.add(rs.getString("name")); 
            vec.add(rs.getInt("percentage"));
            dt.addRow(vec); 
        } catch (Exception e) {
            System.out.println("Error: from adding data to table: " + e);
        }
        
        
    }//GEN-LAST:event_bdiscountActionPerformed

    private void cmbdiscountItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbdiscountItemStateChanged
        System.out.println("D.ID: " + getDiscoutId());
    }//GEN-LAST:event_cmbdiscountItemStateChanged

    private void bdiscount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdiscount1ActionPerformed
        DefaultTableModel dt = (DefaultTableModel) tblbtypes.getModel();
        if(tblbtypes.getSelectedRow() != -1){
            dt.removeRow(tblbtypes.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(null, "Select Discount from Table to Remove", "Warning!", 2);
        }
        
    }//GEN-LAST:event_bdiscount1ActionPerformed

    private void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
        boolean addtodb = false;
        if(!tcode.getText().trim().equals("") && !tcode.getText().trim().equals("")){
            book = new Book();
            
            if(!book.checkBookCode(tcode.getText())){ 
                    bookdisc = new Bookdiscount();
            
                    book.setBooktypeid(getTypeId()); 
                    book.setDiscid(9); 
                    book.setCode(tcode.getText()); 
                    book.setTitle(ttitle.getText());
                if(book.addNewBook()){
                    
                    for(int x = 0; x < tblbtypes.getRowCount(); x++){
                        bookdisc.setBookid(book.getLatBookId()); 
                        bookdisc.setDiscountid(Integer.parseInt(tblbtypes.getValueAt(x, 0).toString())); 
                        addtodb = bookdisc.addDiscountForBook();
                        
                    }
                    
                        if(addtodb){
                            
                           bookprice = new Bookprice();
                           bookprice.setBookid(book.getLatBookId()); 
                           bookprice.setSoldprice(0.00); 
                           bookprice.setFromdate(getToday()); 
                           bookprice.setTodate("2222-02-22");
                            if(bookprice.setInitialBookPrice()){
                                
                                bookstock = new Bookstock();
                                bookstock.setBookid(book.getLatBookId()); 
                                bookstock.setQty(0); 
                                
                                    if(bookstock.setInitialBookQty()){
                                        JOptionPane.showMessageDialog(null, "Done! Successfully Added New Book!", "Done!", 1); 
                                        tcode.setText("");
                                        ttitle.setText("");
                                        loadTable(book.getBooksToTable()); 
                                        clearTypeTable();
                                    }else{
                                        JOptionPane.showMessageDialog(null, "Error While Setting Stock Qty to Zero, Try Again!", "Error!", 0);
                                    }
                                
                                
                            }else{
                                JOptionPane.showMessageDialog(null, "Error While Setting Default Price, Try Again!", "Error!", 0);
                            }
 
                        }else{
                            JOptionPane.showMessageDialog(null, "Error While Saving Discount Data, Try Again!", "Error!", 0);
                        }
                        
                }else{
                    JOptionPane.showMessageDialog(null, "Error While Saving Book Data, Try Again!", "Error!", 0);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Book Code in DataBase, Type Different Value!", "Warning!", 2);
            }
            
                
         }else{
            JOptionPane.showMessageDialog(null, "Fill All Values!", "Warning!", 2);
        }

    }//GEN-LAST:event_baddActionPerformed

    private void cmbbooktypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbbooktypeItemStateChanged
        System.out.println("ID: " + getTypeId());
    }//GEN-LAST:event_cmbbooktypeItemStateChanged

    private void bupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupdateActionPerformed
        if(tblbooks.getSelectedRow() != -1){
            if(JOptionPane.showConfirmDialog(null, "Do You Really Want to Deativate the Selected Book?", "Question?", 0) == 0){
                book = new Book();
                    if(book.deactivateBook(selectbookid)){ 
                        JOptionPane.showMessageDialog(null, "Done! The Selected Book Deactivated!", "Done!", 1);
                        loadTable(book.getBooksToTable());
                    }else{
                        JOptionPane.showMessageDialog(null, "Error! While Deactivating, Try Again!", "Error!", 0);
                    }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Select Book from Table to Deactivate!", "Warning!", 2);
        }
    }//GEN-LAST:event_bupdateActionPerformed

    private void tblbooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbooksMouseClicked
        selectbookid = Integer.parseInt(tblbooks.getValueAt(tblbooks.getSelectedRow(), 0).toString()); 
        bookcode = tblbooks.getValueAt(tblbooks.getSelectedRow(), 1).toString();
        booktitle = tblbooks.getValueAt(tblbooks.getSelectedRow(), 2).toString();
        bookcat = tblbooks.getValueAt(tblbooks.getSelectedRow(), 3).toString();
        
        bupdate.setEnabled(true);
        badd.setEnabled(false); 
        bdiscount.setEnabled(false); 
        bdiscount1.setEnabled(false);
        tcode.setEnabled(false);
        
        tcode.setText(bookcode);
        ttitle.setText(booktitle);
        cmbbooktype.setSelectedItem(bookcat); 
        
    }//GEN-LAST:event_tblbooksMouseClicked

    private void bupdate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupdate2ActionPerformed
        if(tblbooks.getSelectedRow() != -1){
            if(JOptionPane.showConfirmDialog(null, "Do You Really Want to Update the Details?", "Question?", 0) == 0){
                book = new Book();
                book.setBooktypeid(getTypeId()); 
                book.setTitle(ttitle.getText()); 
                    if(book.updateBook(selectbookid)){
                        JOptionPane.showMessageDialog(null, "Done! Successfully Updated!", "Done!", 1); 
                        tcode.setText("");
                        ttitle.setText("");
                        loadTable(book.getBooksToTable()); 
                        clearTypeTable();
                    }else{
                        JOptionPane.showMessageDialog(null, "Error! While Updating!", "Error!", 0);
                    }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Select Book from Table to Deactivate!", "Warning!", 2);
        }
        
    }//GEN-LAST:event_bupdate2ActionPerformed

    
    void loadBookTypes(ResultSet rs){
        try {
            while(rs.next()){
                String booktypes = rs.getInt("btypeid") + "-" + rs.getString("type");
                cmbbooktype.addItem(booktypes);  
                 
            }
            
        } catch (SQLException ex) {
            System.out.println("Error from table interface: " + ex);;
        }
        
        
    }
    
    void loadDiscounts(ResultSet rs){
        try {
            while(rs.next()){
                String discounttypes = rs.getInt("discountid") + "-" + rs.getString("name") + " (" + rs.getString("percentage") + ")";
                cmbdiscount.addItem(discounttypes);  
                 
            }
            
        } catch (SQLException ex) {
            System.out.println("Error from table interface: " + ex);;
        }
        
        
    }
    
    void loadTable(ResultSet rs){
        clearTable();
        DefaultTableModel dt = (DefaultTableModel) tblbooks.getModel();
        
        try {
            while(rs.next()){
                Vector vec = new Vector();
                vec.add(rs.getInt("bookid"));
                vec.add(rs.getString("code"));
                vec.add(rs.getString("title"));
                vec.add(rs.getString("btype") + "-" + rs.getString("type"));
                vec.add(rs.getInt("isactive"));
                dt.addRow(vec); 
            }
            
        } catch (SQLException ex) {
            System.out.println("Error from table interface: " + ex);;
        }
        
    }
    
    void clearTable(){
        DefaultTableModel dt = (DefaultTableModel) tblbooks.getModel();
        int rows = tblbooks.getRowCount();
            for(int x=0; x < rows; x++){
                dt.removeRow(0); 
            }
        
    }
    
    void clearTypeTable(){
        DefaultTableModel dt = (DefaultTableModel) tblbtypes.getModel();
        int rows = tblbtypes.getRowCount();
            for(int x=0; x < rows; x++){
                dt.removeRow(0); 
            }
        
    }
    
    int getTypeId(){
        String typearray[] = cmbbooktype.getSelectedItem().toString().split("-"); 
        booktypeid = Integer.parseInt(typearray[0]); 
        
        return booktypeid;
    }
    
    int getDiscoutId(){
        String typearray[] = cmbdiscount.getSelectedItem().toString().split("-"); 
        discountid = Integer.parseInt(typearray[0]); 
        
        return discountid;
    }
    
    String getToday(){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String today = df.format(cal.getTime());
        
        return today;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ProductsUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton badd;
    private javax.swing.JButton bdiscount;
    private javax.swing.JButton bdiscount1;
    private javax.swing.JButton bupdate;
    private javax.swing.JButton bupdate2;
    private javax.swing.JComboBox cmbbooktype;
    private javax.swing.JComboBox cmbdiscount;
    private javax.swing.JComboBox cmbsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblbooks;
    private javax.swing.JTable tblbtypes;
    private javax.swing.JTextField tcode;
    private javax.swing.JTextField tsearch;
    private javax.swing.JTextField ttitle;
    // End of variables declaration//GEN-END:variables
}
