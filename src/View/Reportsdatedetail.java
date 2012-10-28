/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Graphics;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Cheque;
import model.Invoice;

/**
 *
 * @author Gihan
 */
public class Reportsdatedetail extends javax.swing.JFrame {

    Invoice invoice;
    Cheque cheque;
    int selectedin;

    /**
     * Creates new form Reportsdatedetail
     */
    public Reportsdatedetail() {
        initComponents();
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
        bview = new javax.swing.JButton();
        bview2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dtreport = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblinvoices = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblinvrecords = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblreturns = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lchnumber = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lchdate = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lchamount = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbank = new javax.swing.JLabel();
        bcancell = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        linno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Date Detailed Report");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        bview.setText("View Invoices");
        bview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bviewActionPerformed(evt);
            }
        });

        bview2.setText("View Details");
        bview2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bview2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Date:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bview, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bview2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dtreport, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bview, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(bview2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dtreport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tblinvoices.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tblinvoices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "In.No", "Agent Name", "Total Amount", "Paid Amount", "Type", "Active"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblinvoices.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblinvoices.setRowHeight(22);
        tblinvoices.setSelectionBackground(new java.awt.Color(51, 51, 255));
        tblinvoices.setSelectionForeground(new java.awt.Color(255, 255, 204));
        jScrollPane1.setViewportView(tblinvoices);
        tblinvoices.getColumnModel().getColumn(0).setMinWidth(50);
        tblinvoices.getColumnModel().getColumn(0).setPreferredWidth(50);
        tblinvoices.getColumnModel().getColumn(0).setMaxWidth(50);
        tblinvoices.getColumnModel().getColumn(2).setMinWidth(80);
        tblinvoices.getColumnModel().getColumn(2).setPreferredWidth(80);
        tblinvoices.getColumnModel().getColumn(2).setMaxWidth(80);
        tblinvoices.getColumnModel().getColumn(3).setMinWidth(80);
        tblinvoices.getColumnModel().getColumn(3).setPreferredWidth(80);
        tblinvoices.getColumnModel().getColumn(3).setMaxWidth(80);
        tblinvoices.getColumnModel().getColumn(4).setMinWidth(60);
        tblinvoices.getColumnModel().getColumn(4).setPreferredWidth(60);
        tblinvoices.getColumnModel().getColumn(4).setMaxWidth(60);
        tblinvoices.getColumnModel().getColumn(5).setMinWidth(60);
        tblinvoices.getColumnModel().getColumn(5).setPreferredWidth(60);
        tblinvoices.getColumnModel().getColumn(5).setMaxWidth(60);

        tblinvrecords.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblinvrecords.setForeground(new java.awt.Color(204, 0, 0));
        tblinvrecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Title", "Sold Qty", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblinvrecords.setRowHeight(22);
        tblinvrecords.setSelectionBackground(new java.awt.Color(51, 102, 255));
        tblinvrecords.setSelectionForeground(new java.awt.Color(255, 255, 204));
        jScrollPane2.setViewportView(tblinvrecords);
        tblinvrecords.getColumnModel().getColumn(1).setMinWidth(60);
        tblinvrecords.getColumnModel().getColumn(1).setPreferredWidth(60);
        tblinvrecords.getColumnModel().getColumn(1).setMaxWidth(60);
        tblinvrecords.getColumnModel().getColumn(2).setMinWidth(80);
        tblinvrecords.getColumnModel().getColumn(2).setPreferredWidth(80);
        tblinvrecords.getColumnModel().getColumn(2).setMaxWidth(80);

        tblreturns.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tblreturns.setForeground(new java.awt.Color(204, 0, 0));
        tblreturns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Title", "Sold Qty", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblreturns.setRowHeight(22);
        tblreturns.setSelectionBackground(new java.awt.Color(51, 102, 255));
        tblreturns.setSelectionForeground(new java.awt.Color(255, 255, 204));
        jScrollPane3.setViewportView(tblreturns);
        tblreturns.getColumnModel().getColumn(1).setMinWidth(60);
        tblreturns.getColumnModel().getColumn(1).setPreferredWidth(60);
        tblreturns.getColumnModel().getColumn(1).setMaxWidth(60);
        tblreturns.getColumnModel().getColumn(2).setMinWidth(80);
        tblreturns.getColumnModel().getColumn(2).setPreferredWidth(80);
        tblreturns.getColumnModel().getColumn(2).setMaxWidth(80);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cheque / Both Invoices Only");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Cheque Number:");

        lchnumber.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lchnumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lchnumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Date:");

        lchdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lchdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lchdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Cheque Amount:");

        lchamount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lchamount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lchamount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Bank:");

        lbank.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbank.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(49, 49, 49)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lchamount, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lchdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lchnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83))
                            .addComponent(lbank, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lchnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lchdate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lchamount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbank, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        bcancell.setText("Cancell this Invoice");
        bcancell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancellActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Details for Invoice No:");

        linno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        linno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        linno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(linno, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcancell, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(linno, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bcancell, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
        setBounds((screenSize.width-1248)/2, (screenSize.height-678)/2, 1248, 678);
    }// </editor-fold>//GEN-END:initComponents

    private void bviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bviewActionPerformed
        clearTable(tblinvrecords);
        clearTable(tblreturns);
        clearLabels();
        linno.setText("");

        try {
            if (!dtreport.getDate().equals("")) {
                invoice = new Invoice();
                this.loadInvoiceTable(invoice.getDateInvoices(getSelectDate()));
            } else {
                JOptionPane.showMessageDialog(null, "Select the Date!", "Warning!", 2);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Select the Date", "Warning!", 2);
        }



    }

    @Override
    public void paintComponents(Graphics g) {
  }//GEN-LAST:event_bviewActionPerformed

    private void bview2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bview2ActionPerformed
        try {
            if (tblinvoices.getSelectedRow() != -1) {
                invoice = new Invoice();
                int inno = Integer.parseInt(tblinvoices.getValueAt(tblinvoices.getSelectedRow(), 0).toString());
                String type = tblinvoices.getValueAt(tblinvoices.getSelectedRow(), 4).toString();
                linno.setText("" + inno);

                this.loadInvDetailsTable(invoice.getDateInvoiceRecs(inno));
                this.loadReturnTable(invoice.getDateReturnRecs(inno));

                if (type.equals("cheque") || type.equals("both")) {
                    cheque = new Cheque();
                    System.out.println("Inno: " + inno);
                    ResultSet rs = cheque.getChequeDetails(inno);
                    if (rs.next()) {
                        lchnumber.setText("" + rs.getInt("chequeno"));
                        lchdate.setText("" + rs.getString("chdate"));
                        lchamount.setText("" + rs.getDouble("amount"));
                        lbank.setText("" + rs.getString("bank"));
                    }
                } else {
                    clearLabels();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Select the Invoice from Invoice Table!", "Warning!", 2);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_bview2ActionPerformed

    private void bcancellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancellActionPerformed
        try {
            selectedin = Integer.parseInt(tblinvoices.getValueAt(tblinvoices.getSelectedRow(), 0).toString());

            if (selectedin != -1) {
                if (JOptionPane.showConfirmDialog(null, "Do You Really Want Cancell the Invoice? No: " + selectedin, "Question?", 0) == 0) {
                    JPasswordField pwd = new JPasswordField(10);
                    int action = JOptionPane.showConfirmDialog(null, pwd, "Enter Password", JOptionPane.OK_CANCEL_OPTION);
                    
                        if (new String(pwd.getPassword()).equals("rg456rg")) {
                            invoice = new Invoice();
                            invoice.cancellInvoice(selectedin);
                            this.loadInvoiceTable(invoice.getDateInvoices(getSelectDate()));
                        } else {
                            JOptionPane.showMessageDialog(null, "You Can't do This?", "Warning!", 2);
                        }
                        
                }
            } else {
                JOptionPane.showMessageDialog(null, "Select the Invoice to Cancell!", "Warning!", 2);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Select the Invoice to Cancell!", "Warning!", 2);
        }



    }//GEN-LAST:event_bcancellActionPerformed

    void loadInvoiceTable(ResultSet rs) {
        clearTable(tblinvoices);
        DefaultTableModel dt = (DefaultTableModel) tblinvoices.getModel();

        try {
            while (rs.next()) {
                Vector vec = new Vector();
                vec.add(rs.getInt("inno"));
                vec.add(rs.getString("name"));
                vec.add(rs.getDouble("total"));
                vec.add(rs.getDouble("paidtotal"));
                vec.add(rs.getString("type"));
                vec.add(rs.getInt("isactive"));
                dt.addRow(vec);

            }

        } catch (SQLException ex) {
            System.out.println("Error from table interface: " + ex);;
        }

    }

    void loadInvDetailsTable(ResultSet rs) {
        clearTable(tblinvrecords);
        DefaultTableModel dt = (DefaultTableModel) tblinvrecords.getModel();

        try {
            while (rs.next()) {
                Vector vec = new Vector();
                vec.add(rs.getString("title"));
                vec.add(rs.getInt("qty"));
                vec.add(rs.getDouble("amount"));
                dt.addRow(vec);
            }

        } catch (SQLException ex) {
            System.out.println("Error from table interface: " + ex);;
        }

    }

    void loadReturnTable(ResultSet rs) {
        clearTable(tblreturns);
        DefaultTableModel dt = (DefaultTableModel) tblreturns.getModel();

        try {
            while (rs.next()) {
                Vector vec = new Vector();
                vec.add(rs.getString("title"));
                vec.add(rs.getInt("qty"));
                vec.add(rs.getDouble("amount"));
                dt.addRow(vec);
            }

        } catch (SQLException ex) {
            System.out.println("Error from table interface: " + ex);;
        }

    }

    public String getSelectDate() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dob = df.format(dtreport.getDate());
        return dob;

    }

    void clearTable(JTable tbl) {
        DefaultTableModel dt = (DefaultTableModel) tbl.getModel();
        int rows = tbl.getRowCount();
        for (int x = 0; x < rows; x++) {
            dt.removeRow(0);
        }

    }

    void clearLabels() {
        lchnumber.setText("");
        lchdate.setText("");
        lchamount.setText("");
        lbank.setText("");

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
            java.util.logging.Logger.getLogger(Reportsdatedetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportsdatedetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportsdatedetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportsdatedetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Reportsdatedetail().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcancell;
    private javax.swing.JButton bview;
    private javax.swing.JButton bview2;
    private com.toedter.calendar.JDateChooser dtreport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbank;
    private javax.swing.JLabel lchamount;
    private javax.swing.JLabel lchdate;
    private javax.swing.JLabel lchnumber;
    private javax.swing.JLabel linno;
    private javax.swing.JTable tblinvoices;
    private javax.swing.JTable tblinvrecords;
    private javax.swing.JTable tblreturns;
    // End of variables declaration//GEN-END:variables
}
