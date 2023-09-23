package TrashToCashSystem;

import java.sql.ResultSetMetaData;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UpdateForm extends javax.swing.JFrame {

    public UpdateForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        populateSector();
        populateItem();
        display();
    }

    Connection connect;
    PreparedStatement pre;
    ResultSet rs = null;
    DefaultTableModel model = new DefaultTableModel();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBarangay = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbItem = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        cbBarangay = new javax.swing.JComboBox<>();
        tfQuantity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnRedeemPoints1 = new javax.swing.JButton();
        btnRedeemPoints2 = new javax.swing.JButton();
        btnDataTrash = new javax.swing.JButton();
        btnInputForm = new javax.swing.JButton();
        btnRedeemPoints = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbSector = new javax.swing.JComboBox<>();
        tfTotalResidual = new javax.swing.JTextField();
        lblBarangay1 = new javax.swing.JLabel();
        tfIDNum = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(240, 80));

        jPanel1.setBackground(new java.awt.Color(238, 248, 235));
        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(953, 566));

        lblBarangay.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblBarangay.setForeground(new java.awt.Color(68, 105, 74));
        lblBarangay.setText("Barangay :");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(68, 105, 74));
        jLabel2.setText("Name :");

        tfName.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(68, 105, 74));
        jLabel1.setText("Item :");

        cbItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbItemActionPerformed(evt);
            }
        });

        tblTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Materials", "Value", "Quantity", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTable);

        btnAdd.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(68, 105, 74));
        btnAdd.setText("ADD");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.setFocusPainted(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(68, 105, 74));
        btnRemove.setText("REMOVE");
        btnRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemove.setFocusPainted(false);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(68, 105, 74));
        btnCancel.setText("CANCEL");
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.setFocusPainted(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        cbBarangay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "ADYA", "ANILAO", "ANILAO-LABAC", "ANTIPOLO DEL NORTE", "ANTIPOLO DEL SUR", "BAGONG POOK", "BALINTAWAK", "BANAYBANAY", "BARANGAY 12", "BOLBOK", "BUGTONG NA PULO", "BULACNIN", "BULAKLAKAN", "CALAMIAS", "CUMBA", "DAGATAN", "HALANG", "INOSLOBAN", "KUYAMNGGI", "LATAG", "LODLOD", "LUMBANG", "MABINI", "MALAGONLONG", "MALITLIT", "MARAUOY", "MATAAS NA LUPA", "MUNTING PULO", "PAGOLINGIN BATA", "PAGOLINGIN EAST", "PAGOLINGIN WEST", "PANGAO", "PINAGKAWITAN", "PINAGTONGULAN", "PLARIDEL", "POBLACION BARANGAY 1", "POBLACION BARANGAY 2", "POBLACION BARANGAY 3 ", "POBLACION BARANGAY 4", "POBLACION BARANGAY 5", "POBLACION BARANGAY 6", "POBLACION BARANGAY 7", "POBLACION BARANGAY 8", "POBLACION BARANGAY 9", "POBLACION BARANGAY 9-A", "POBLACION BARANGAY 10", "POBLACION BARANGAY 11", "PUSIL", "QUEZON", "RIZAL", "SABANG", "SAMPAGUITA", "SAN BENITO", "SAN CARLOS", "SAN CELESTINO", "SAN FRANSCISCO", "SAN GUILLERMO", "SAN JOSE", "SAN LUCAS", "SAN SALVADOR", "SAN SEBASTIAN", "SANTO NINO", "SANTO TORIBIO", "SAPAC", "SICO", "TALISAY", "TAMBO", "TANGOB", "TANGUAY", "TIBIG", "TIPACAN" }));
        cbBarangay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBarangayActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(68, 105, 74));
        jLabel5.setText("Quantity :");

        jPanel2.setBackground(new java.awt.Color(218, 243, 210));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system_icon/100x100seal.png"))); // NOI18N

        btnRedeemPoints1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRedeemPoints1.setForeground(new java.awt.Color(68, 105, 74));
        btnRedeemPoints1.setText("MEMBERS");
        btnRedeemPoints1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRedeemPoints1.setFocusPainted(false);
        btnRedeemPoints1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedeemPoints1ActionPerformed(evt);
            }
        });

        btnRedeemPoints2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRedeemPoints2.setForeground(new java.awt.Color(68, 105, 74));
        btnRedeemPoints2.setText("ITEMS AND SECTORS");
        btnRedeemPoints2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRedeemPoints2.setFocusPainted(false);
        btnRedeemPoints2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedeemPoints2ActionPerformed(evt);
            }
        });

        btnDataTrash.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDataTrash.setForeground(new java.awt.Color(68, 105, 74));
        btnDataTrash.setText("DATABASE");
        btnDataTrash.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDataTrash.setFocusPainted(false);
        btnDataTrash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDataTrashMouseExited(evt);
            }
        });
        btnDataTrash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataTrashActionPerformed(evt);
            }
        });

        btnInputForm.setBackground(new java.awt.Color(218, 243, 210));
        btnInputForm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInputForm.setForeground(new java.awt.Color(68, 105, 74));
        btnInputForm.setText("INPUT FORM");
        btnInputForm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInputForm.setFocusPainted(false);
        btnInputForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputFormActionPerformed(evt);
            }
        });

        btnRedeemPoints.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRedeemPoints.setForeground(new java.awt.Color(68, 105, 74));
        btnRedeemPoints.setText("REDEEM POINTS");
        btnRedeemPoints.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRedeemPoints.setFocusPainted(false);
        btnRedeemPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedeemPointsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRedeemPoints, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInputForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRedeemPoints1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRedeemPoints2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDataTrash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addGap(110, 110, 110)
                .addComponent(btnDataTrash, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRedeemPoints1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInputForm, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRedeemPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRedeemPoints2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system_icon/TRASH TO CASH LOGO SMALL.png"))); // NOI18N

        btnUpdate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(68, 105, 74));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(68, 105, 74));
        jLabel7.setText("Sector:");

        cbSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSectorActionPerformed(evt);
            }
        });

        tfTotalResidual.setText("0.0");
        tfTotalResidual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTotalResidualActionPerformed(evt);
            }
        });

        lblBarangay1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblBarangay1.setForeground(new java.awt.Color(68, 105, 74));
        lblBarangay1.setText("ID Number:");

        tfIDNum.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(151, 151, 151))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblBarangay)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(lblBarangay1))
                                .addGap(145, 145, 145)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbBarangay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfQuantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbSector, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tfIDNum, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(173, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfTotalResidual, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(64, 64, 64))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBarangay1)
                    .addComponent(tfIDNum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBarangay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBarangay))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbSector, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbItem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(tfTotalResidual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void display() {
        model = (DefaultTableModel) tblTable.getModel();
        String name, barangay, sector, column, memberID;
        memberID = DataTrash.UpmemberID;
        tfIDNum.setText(DataTrash.UpmemberID);
        String month = DataTrash.Upmonth;
        int year = DataTrash.Upyear;
        barangay = "0";
        sector = "0";
        name = "0";

        try {
            String sql = "SELECT * FROM items WHERE memberID LIKE '" + memberID + "' && month LIKE '" + month + "' && year LIKE '" + year + "'";
            pre = (PreparedStatement) connect.prepareStatement(sql);
            rs = pre.executeQuery();
            if (rs.next()) {
                name = rs.getString("name");
                barangay = rs.getString("barangay");
                sector = rs.getString("sector");

                cbBarangay.setSelectedItem(barangay);
                tfName.setText(name);
                cbSector.setSelectedItem(sector);

                ResultSetMetaData rsMetaData = rs.getMetaData();
                for (int i = 7; i < rsMetaData.getColumnCount(); i++) {
                    column = rsMetaData.getColumnName(i);
                    double quant = rs.getDouble(column);
                    if (quant != 0) {
                        double val = 0.0;
                        char ch = ' ';
                        String itemname = column.toUpperCase();
                        itemname = itemname.replace('_', ch);

                        String getval = "SELECT * FROM materials where item LIKE '" + itemname + "'";
                        PreparedStatement pre2 = (PreparedStatement) connect.prepareStatement(getval);
                        ResultSet rs2 = pre2.executeQuery();

                        while (rs2.next()) {
                            val = rs2.getDouble("value");
                            double total = quant * val;
                            model.addRow(new Object[]{
                                itemname,
                                String.format("%.2f", val),
                                quant,
                                total
                            });

                            System.out.print(itemname);
                            System.out.print(val);
                            System.out.print(quant);
                            System.out.print(total);

                        }

                        pre2.close();
                        rs2.close();

                    }
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(UpdateForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void populateItem() {
        try {
            connect = DatabaseConnection.connectionDB();

            String populateItem = "SELECT * FROM materials WHERE status = 'unarchived'";

            pre = (PreparedStatement) connect.prepareStatement(populateItem);
            rs = pre.executeQuery();

            while (rs.next()) {
                cbItem.addItem(rs.getString("item"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private JFrame frame;

    private void populateSector() {
        try {
            connect = DatabaseConnection.connectionDB();

            String populateSector = "SELECT * FROM sector ";

            pre = (PreparedStatement) connect.prepareStatement(populateSector);
            rs = pre.executeQuery();

            while (rs.next()) {
                cbSector.addItem(rs.getString("sector"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void AddDatarecord(int memberID) {

        try {
            double PlasticKilo = checkifPlasticKilos();
            double PlasticPoint = checkifPlasticPoints();
            double TelaKilo = checkifTelaKilos();
            double TelaPoint = checkifTelaPoints();
            double ResidualPoint = TelaPoint + PlasticPoint;
            double MarketablePoint = checkifMarketablePoints();
            double FinalResidual = (TelaPoint * 1.5);
            double GrandTotal = (TelaPoint) + (PlasticPoint) + (MarketablePoint);
            String month = Month();
            int year = Year();

            String updateTotal = "UPDATE datarecord set plastic_kilos = " + PlasticKilo + ", plastic_points = " + PlasticPoint + ", tela_kilos = " + TelaKilo + ""
                    + ", tela_points = " + TelaPoint + ", totalresidualpoints = " + ResidualPoint + ", marketable = " + MarketablePoint + ", final_residual = " + FinalResidual + ", grandtotal = " + GrandTotal + ""
                    + "   WHERE memberID LIKE '" + memberID + "' && month LIKE '" + month + "' && year LIKE '" + year + "'";

            pre = (PreparedStatement) connect.prepareStatement(updateTotal);
            pre.execute();
            pre.close();

            /*
            This section is for adding each item submitted by that specific member
             */
            AddItemRecord(memberID, month, year);

            /*
            This section is for updating the total number of points of a member in the database
             */
            String getTotal = "SELECT * FROM datarecord WHERE memberID LIKE '" + memberID + "'";

            double totalpoints = 0.0;
            pre = (PreparedStatement) connect.prepareStatement(getTotal);
            rs = pre.executeQuery();

            while (rs.next()) {
                totalpoints += rs.getDouble("grandtotal");

                String updateTotalin_total_points = "UPDATE total_points set totalpoints = " + totalpoints + " WHERE memberID LIKE '" + memberID + "'";

                pre = (PreparedStatement) connect.prepareStatement(updateTotalin_total_points);
                pre.execute();
                pre.close();
            }
            rs.close();

        } catch (SQLException ex) {
            Logger.getLogger(UpdateForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void AddItemRecord(int memberID, String month, int year) {
        try {
            String sql = "SELECT * FROM items where memberID LIKE '" + memberID + "' && month LIKE '" + month + "' && year LIKE '" + year + "'";
            pre = (PreparedStatement) connect.prepareStatement(sql);
            rs = pre.executeQuery();

            if (rs.isBeforeFirst()) {

                String columnname;

                while (rs.next()) {
                    ResultSetMetaData rsMetaData = rs.getMetaData();
                    for (int j = 7; j <= rsMetaData.getColumnCount(); j++) {
                        columnname = rsMetaData.getColumnName(j);
                        for (int i = 0; i < model.getRowCount(); i++) {
                            String itemname = String.valueOf(model.getValueAt(i, 0)).toLowerCase();
                            double itemcount = Double.parseDouble(model.getValueAt(i, 2).toString());
                            char ch = '_';
                            itemname = itemname.replace(' ', ch);
                            if (itemname.equals(columnname)) {
                                String addItem = "UPDATE items SET " + itemname + " = " + itemcount + " WHERE memberID LIKE '" + memberID + "' && month LIKE '" + month + "' && year LIKE '" + year + "'";
                                try (PreparedStatement updPre = (PreparedStatement) connect.prepareStatement(addItem)) {
                                    updPre.execute();
                                }
                            }
                        }
                    }
                }

            } else {
                pre.close();
                rs.close();

                String getItemColumn = "SELECT * FROM items WHERE memberID LIKE '" + memberID + "' && month LIKE '" + month + "' && year LIKE '" + year + "'";
                pre = (PreparedStatement) connect.prepareStatement(getItemColumn);
                rs = pre.executeQuery();

                String columnname;

                while (rs.next()) {
                    ResultSetMetaData rsMetaData = rs.getMetaData();
                    for (int j = 7; j <= rsMetaData.getColumnCount(); j++) {
                        columnname = rsMetaData.getColumnName(j);
                        for (int i = 0; i < model.getRowCount(); i++) {
                            String itemname = String.valueOf(model.getValueAt(i, 0)).toLowerCase();
                            double itemcount = Double.parseDouble(model.getValueAt(i, 2).toString());
                            char ch = '_';
                            itemname = itemname.replace(' ', ch);
                            if (itemname.equals(columnname)) {
                                String addItem = "UPDATE items SET " + itemname + " = " + itemcount + " WHERE memberID LIKE '" + memberID + "' && month LIKE '" + month + "' && year LIKE '" + year + "'";
                                try (PreparedStatement updPre = (PreparedStatement) connect.prepareStatement(addItem)) {
                                    updPre.execute();
                                }
                            }
                        }
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(InputForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void cbItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbItemActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (tfIDNum.getText().equals("") || tfName.getText().equals("") || cbSector.getSelectedItem().equals("----") || cbBarangay.getSelectedItem().equals("----") || cbItem.getSelectedItem().equals("----") || tfQuantity.getText().equals("")) {

            JOptionPane.showMessageDialog(this, "Invalid input. Fill in all fields.");
        } else {
            tfIDNum.setEditable(false);
            tfName.setEditable(false);
            cbBarangay.setEnabled(false);
            cbSector.setEnabled(false);

            String item = cbItem.getSelectedItem().toString();
            double quantity = Double.parseDouble(tfQuantity.getText());

            double value = 0.0;
            double total = 0.0;

            String material = "SELECT * FROM materials where item LIKE '" + item + "'";

            try {
                pre = (PreparedStatement) connect.prepareStatement(material);
                rs = pre.executeQuery();

                if (rs.next()) {
                    value = rs.getDouble("value");
                }

                total = quantity * value;

            } catch (SQLException ex) {
                Logger.getLogger(UpdateForm.class.getName()).log(Level.SEVERE, null, ex);
            }

            model.addRow(new Object[]{
                item,
                String.format("%.2f", value),
                quantity,
                String.format("%.2f", total)
            });
            model = (DefaultTableModel) tblTable.getModel();

            double sum = 0.0;
            String addsum;
            for (int i = 0; i < tblTable.getRowCount(); i++) {
                sum = sum + Double.parseDouble(tblTable.getValueAt(i, 3).toString());
                addsum = String.format("%.2f", sum);

                tfTotalResidual.setText(addsum);

            }
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void cbBarangayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBarangayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBarangayActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        model.removeRow(tblTable.getSelectedRow());

        double remove = 0;
        String removesum = "0.0";
        for (int i = 0; i < tblTable.getRowCount(); i++) {
            remove = remove + Double.parseDouble(tblTable.getValueAt(i, 3).toString());
            removesum = String.format("%.2f", remove);
        }
        tfTotalResidual.setText(removesum);

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        tfName.setEditable(true);
        cbBarangay.setEnabled(true);
        cbSector.setEnabled(true);

        model.setRowCount(0);
        tfName.setText("");
        tfQuantity.setText("");
        cbItem.setSelectedIndex(0);
        cbBarangay.setSelectedIndex(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cbSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSectorActionPerformed


    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        AddDatarecord(Integer.parseInt(tfIDNum.getText()));

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tfTotalResidualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTotalResidualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTotalResidualActionPerformed

    private void btnRedeemPoints1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedeemPoints1ActionPerformed
        // TODO add your handling code here:
        Member member = new Member();
        member.setVisible(true);
        member.setTitle("Members' Records");
        member.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();

    }//GEN-LAST:event_btnRedeemPoints1ActionPerformed

    private void btnRedeemPoints2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedeemPoints2ActionPerformed
        // TODO add your handling code here:
        Options opt = new Options();
        opt.setVisible(true);
        opt.setTitle("Items and Sectors");
        opt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnRedeemPoints2ActionPerformed

    private void btnDataTrashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDataTrashMouseExited

    }//GEN-LAST:event_btnDataTrashMouseExited

    private void btnDataTrashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataTrashActionPerformed
        DataTrash database = new DataTrash();
        database.setVisible(true);
        database.setTitle("DataTRASH");
        database.pack();
        database.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnDataTrashActionPerformed

    private void btnInputFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputFormActionPerformed
        UpdateForm input = new UpdateForm();
        input.setVisible(true);
        input.setTitle("Input Form");
        input.pack();
        input.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnInputFormActionPerformed

    private void btnRedeemPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedeemPointsActionPerformed
        // TODO add your handling code here:
        RedeemForm redeem = new RedeemForm();
        redeem.setVisible(true);
        redeem.setTitle("Redeem Form");
        redeem.pack();
        redeem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnRedeemPointsActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateForm().setVisible(true);
            }
        });
    }

    private double checkifPlasticKilos() {
        double kilos = 0.0;
        for (int i = 0; i < tblTable.getRowCount(); i++) {

            String material = tblTable.getValueAt(i, 0).toString();
            if (material.equals("PLASTIC")) {
                kilos = kilos + Double.parseDouble(tblTable.getValueAt(i, 2).toString());
            }
        }
        return kilos;
    }

    private double checkifPlasticPoints() {
        double points = 0.0;
        for (int i = 0; i < tblTable.getRowCount(); i++) {

            String material = tblTable.getValueAt(i, 0).toString();
            if (material.equals("PLASTIC")) {
                points = points + Double.parseDouble(tblTable.getValueAt(i, 3).toString());
            }
        }
        return points;
    }

    private double checkifTelaKilos() {
        double kilos = 0.0;
        for (int i = 0; i < tblTable.getRowCount(); i++) {

            String material = tblTable.getValueAt(i, 0).toString();
            if (material.equals("TELA")) {
                kilos = kilos + Double.parseDouble(tblTable.getValueAt(i, 2).toString());
            }
        }
        return kilos;
    }

    private double checkifTelaPoints() {
        double points = 0.0;
        for (int i = 0; i < tblTable.getRowCount(); i++) {

            String material = tblTable.getValueAt(i, 0).toString();
            if (material.equals("TELA")) {
                points = points + Double.parseDouble(tblTable.getValueAt(i, 3).toString());
            }
        }
        return points;
    }

    private double checkifMarketablePoints() {
        double points = 0.0;
        for (int i = 0; i < tblTable.getRowCount(); i++) {

            try {
                String material = tblTable.getValueAt(i, 0).toString();
                String sql = "SELECT * FROM materials where item LIKE '" + material + "'";
                pre = (PreparedStatement) connect.prepareStatement(sql);
                rs = pre.executeQuery();
                String category = "";

                if (rs.next()) {
                    category = rs.getString("category");
                }

                if (category.equals("Marketable")) {
                    points = points + Double.parseDouble(tblTable.getValueAt(i, 3).toString());
                }
            } catch (SQLException ex) {
                Logger.getLogger(UpdateForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return points;
    }

    private String Month() {
        Calendar cal = Calendar.getInstance();
        int curMonth = cal.get(Calendar.MONTH);
        String month = "";

        switch (curMonth) {
            case 0:
                month = "January";
                break;
            case 1:
                month = "February";
                break;
            case 2:
                month = "March";
                break;
            case 3:
                month = "April";
                break;
            case 4:
                month = "May";
                break;
            case 5:
                month = "June";
                break;
            case 6:
                month = "July";
                break;
            case 7:
                month = "August";
                break;
            case 8:
                month = "September";
                break;
            case 9:
                month = "October";
                break;
            case 10:
                month = "November";
                break;
            case 11:
                month = "December";
                break;

        }
        return month;
    }

    public int Year() {
        Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        return year;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDataTrash;
    private javax.swing.JButton btnInputForm;
    private javax.swing.JButton btnRedeemPoints;
    private javax.swing.JButton btnRedeemPoints1;
    private javax.swing.JButton btnRedeemPoints2;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbBarangay;
    private javax.swing.JComboBox<String> cbItem;
    private javax.swing.JComboBox<String> cbSector;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBarangay;
    private javax.swing.JLabel lblBarangay1;
    private javax.swing.JTable tblTable;
    private javax.swing.JTextField tfIDNum;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfQuantity;
    private javax.swing.JTextField tfTotalResidual;
    // End of variables declaration//GEN-END:variables
}
