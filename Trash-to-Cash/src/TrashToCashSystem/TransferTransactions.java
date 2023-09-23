
package TrashToCashSystem;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public final class TransferTransactions extends javax.swing.JFrame {

    
    Connection connect;
    PreparedStatement pre;
    ResultSet rs = null;
    DefaultTableModel model = new DefaultTableModel();
    static String UpmemberID;
    static String Upmonth;
    static int Upyear;
    
    public TransferTransactions() {
        initComponents();
        this.setLocationRelativeTo(null);
        displayTable();
        rowCount();
        // baket ayaw gmag full screen huhu
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    
public void displayTable(){
        
        connect = DatabaseConnection.connectionDB();
        
        model = (DefaultTableModel)tblTable.getModel();
        String sql = "SELECT * FROM transferTransactions";
    
        try 
        {
            pre = connect.prepareStatement(sql);
            rs = pre.executeQuery();
            tblTable.setModel(DbUtils.resultSetToTableModel(rs));
            //tblTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            tblTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            rowCount();
        } catch (SQLException e)
        {
        
            JOptionPane.showMessageDialog (null, e);
    }
    
}


public void rowCount(){
    model = (DefaultTableModel) tblTable.getModel();
    int row = model.getRowCount();
    tfRowCount.setText(Integer.toString(row));
    
}
public void filter(String query){
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<> (model);
        tblTable.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter (query));
    }

public void openFile(String file){
    try{
        File path = new File(file);
        Desktop.getDesktop().open(path);
        
    }catch(IOException ioe){
        System.out.println(ioe);
        
    }
    
}

public static String getmemberID (){
    return UpmemberID;
}

public static String getmonth (){
    return Upmonth;
}

public static int getyear (){
    return Upyear;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        lblBarangay4 = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        lblBarangay1 = new javax.swing.JLabel();
        cbMonth = new javax.swing.JComboBox<>();
        cbYear = new javax.swing.JComboBox<>();
        lblBarangay2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        middle = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        bottom = new javax.swing.JPanel();
        lblBarangay5 = new javax.swing.JLabel();
        tfRowCount = new javax.swing.JTextField();
        btnPrint = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(971, 593));
        setSize(new java.awt.Dimension(971, 593));

        main.setBackground(new java.awt.Color(218, 243, 210));
        main.setPreferredSize(new java.awt.Dimension(971, 593));

        top.setBackground(new java.awt.Color(218, 243, 210));

        lblBarangay4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblBarangay4.setForeground(new java.awt.Color(68, 105, 74));
        lblBarangay4.setText("Search member ID:");

        tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchKeyReleased(evt);
            }
        });

        lblBarangay1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblBarangay1.setForeground(new java.awt.Color(68, 105, 74));
        lblBarangay1.setText("Month:");

        cbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        cbMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMonthActionPerformed(evt);
            }
        });

        cbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        cbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbYearActionPerformed(evt);
            }
        });

        lblBarangay2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblBarangay2.setForeground(new java.awt.Color(68, 105, 74));
        lblBarangay2.setText("Year:");

        jButton1.setBackground(new java.awt.Color(129, 182, 115));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(68, 105, 74));
        jButton1.setText("BACK TO MENU");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(68, 105, 74));
        jButton3.setText("Clear filters");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addComponent(lblBarangay4)
                .addGap(38, 38, 38)
                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBarangay1)
                    .addComponent(lblBarangay2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(topLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLayout.createSequentialGroup()
                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(topLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(topLayout.createSequentialGroup()
                                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblBarangay1)
                                    .addComponent(cbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(topLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lblBarangay2))
                            .addGroup(topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblBarangay4)
                                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27))
        );

        middle.setBackground(new java.awt.Color(196, 226, 187));

        tblTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. ", "Member ID", "Name ", "Barangay ", "Sector ", "Control No. ", "Plastic (Kilos)", "Plastic  (Points)", "Tela (Kilos)", "Tela (Points)", "Residual Points ", "Marketable ", "x1.5", "Grand Points "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTable.setColumnSelectionAllowed(true);
        tblTable.setRowHeight(30);
        tblTable.setShowGrid(false);
        tblTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTable);

        javax.swing.GroupLayout middleLayout = new javax.swing.GroupLayout(middle);
        middle.setLayout(middleLayout);
        middleLayout.setHorizontalGroup(
            middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, middleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        middleLayout.setVerticalGroup(
            middleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(middleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        bottom.setBackground(new java.awt.Color(218, 243, 210));

        lblBarangay5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblBarangay5.setForeground(new java.awt.Color(68, 105, 74));
        lblBarangay5.setText("No. of Results:");

        tfRowCount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfRowCountKeyReleased(evt);
            }
        });

        btnPrint.setBackground(new java.awt.Color(129, 182, 115));
        btnPrint.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(68, 105, 74));
        btnPrint.setText("Print Records");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnExport.setBackground(new java.awt.Color(129, 182, 115));
        btnExport.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExport.setForeground(new java.awt.Color(68, 105, 74));
        btnExport.setText("Export to Excel");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bottomLayout = new javax.swing.GroupLayout(bottom);
        bottom.setLayout(bottomLayout);
        bottomLayout.setHorizontalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bottomLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblBarangay5)
                .addGap(32, 32, 32)
                .addComponent(tfRowCount, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPrint)
                .addGap(18, 18, 18)
                .addComponent(btnExport)
                .addGap(0, 0, 0))
        );
        bottomLayout.setVerticalGroup(
            bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bottomLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfRowCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBarangay5))
                    .addGroup(bottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        header.setBackground(new java.awt.Color(196, 226, 187));

        lblHeader.setBackground(new java.awt.Color(196, 226, 187));
        lblHeader.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(68, 105, 74));
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Transfer Transactions");
        lblHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(middle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(top, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bottom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(top, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(middle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DBOptions main = new DBOptions();
        main.setVisible(true);
        main.setTitle("Databases Form");
        main.pack();
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbYearActionPerformed
        // TODO add your handling code here:
        
        
        model = (DefaultTableModel) tblTable.getModel();
        model.setRowCount(0);
        
        if (cbYear.getSelectedItem().toString().equals("----")){

            if (cbMonth.getSelectedItem().toString().equals("----")){
                model.setRowCount(0);
                displayTable();
                rowCount();
            }
        }else {
            String sql = "SELECT * FROM transferTransactions where date LIKE '%" + cbYear.getSelectedItem().toString() + "%' AND date LIKE '%" + cbMonth.getSelectedItem().toString() + "%'";

            try{
                pre = connect.prepareStatement(sql);
                rs = pre.executeQuery();
                tblTable.setModel(DbUtils.resultSetToTableModel(rs));
                rowCount();
//                tblTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            }catch (SQLException e)
            {
                JOptionPane.showMessageDialog (null, e);
            }

        }

    }//GEN-LAST:event_cbYearActionPerformed

    private void cbMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMonthActionPerformed
        // TODO add your handling code here:
        
        model = (DefaultTableModel) tblTable.getModel();
        model.setRowCount(0);

        if (cbMonth.getSelectedItem().toString().equals("----")){

            if (cbYear.getSelectedItem().toString().equals("----")){
                model.setRowCount(0);
                displayTable();
                rowCount();
            }
        }else {
            String sql = "SELECT * FROM transferTransactions where date LIKE '%" + cbMonth.getSelectedItem().toString() + "%' AND date LIKE '%" + cbYear.getSelectedItem().toString() + "%'";

            try{
                pre = connect.prepareStatement(sql);
                rs = pre.executeQuery();
                tblTable.setModel(DbUtils.resultSetToTableModel(rs));
                rowCount();
//                tblTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

            }catch (SQLException e)
            {
                JOptionPane.showMessageDialog (null, e);
            }

        }

    }//GEN-LAST:event_cbMonthActionPerformed

    private void tfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyReleased
        // TODO add your handling code here:
        String sql = "SELECT * FROM transferTransactions where memberid LIKE '" + tfSearch.getText() + "%'";

        try{
            pre = connect.prepareStatement(sql);
            rs = pre.executeQuery();
            if (rs.next()){
                tblTable.setModel(DbUtils.resultSetToTableModel(rs));
//            tblTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                rowCount();
            } else{
                JOptionPane.showMessageDialog (null, "Member ID does not exist.");            
            }            
            
        }catch (SQLException e)
        {
            JOptionPane.showMessageDialog (null, e);
        }

        filter (tfSearch.getText());

    }//GEN-LAST:event_tfSearchKeyReleased

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser jFileChooser = new JFileChooser();
            jFileChooser.showSaveDialog(this);
            File saveFile = jFileChooser.getSelectedFile();

            if (saveFile != null){
                saveFile = new File(saveFile.toString()+ ".xlsx");
                Workbook wb = new XSSFWorkbook();
                Sheet sheet = wb.createSheet("Trash to Cash");

                Row rowCol = sheet.createRow(0);
                for (int i = 0; i < tblTable.getColumnCount(); i++){
                    Cell cell = rowCol.createCell(i);
                    cell.setCellValue(tblTable.getColumnName(i));

                }

                for (int j = 0; j < tblTable.getRowCount(); j++){
                    Row row = sheet.createRow(j);
                    for (int k = 0; k <tblTable. getColumnCount(); k++){
                        Cell cell = row.createCell(k);
                        if (tblTable.getValueAt(j, k) != null){
                            cell.setCellValue(tblTable.getValueAt(j, k).toString());
                        }
                    }
                }
                FileOutputStream out = new FileOutputStream(new File (saveFile.toString()));
                wb.write(out);
                wb.close();
                out.close();
                openFile(saveFile.toString());

            }else {
                JOptionPane.showMessageDialog(null, "Error exporting data...");
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch (IOException io){
            System.out.println(io);
        }
    }//GEN-LAST:event_btnExportActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:

        MessageFormat header = new MessageFormat("Trash to Cash");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");

        try{
            tblTable.print(JTable.PrintMode.NORMAL, header, footer);

        }catch (java.awt.print.PrinterException e){
            System.err.format("Cannot print records", e.getMessage());

        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void tfRowCountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRowCountKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRowCountKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        tfSearch.setText("");
        cbMonth.setSelectedIndex(0);
        cbYear.setSelectedIndex(0);
        displayTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TransferTransactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransferTransactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransferTransactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransferTransactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransferTransactions().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bottom;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnPrint;
    private javax.swing.JComboBox<String> cbMonth;
    private javax.swing.JComboBox<String> cbYear;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBarangay1;
    private javax.swing.JLabel lblBarangay2;
    private javax.swing.JLabel lblBarangay4;
    private javax.swing.JLabel lblBarangay5;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JPanel main;
    private javax.swing.JPanel middle;
    private javax.swing.JTable tblTable;
    private javax.swing.JTextField tfRowCount;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JPanel top;
    // End of variables declaration//GEN-END:variables
}
