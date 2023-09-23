package TrashToCashSystem;

import java.sql.ResultSetMetaData;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class InputForm extends javax.swing.JFrame {

    public InputForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        populateSector();
        populateItem();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    Connection connect;
    PreparedStatement pre;
    ResultSet rs = null;
    DefaultTableModel model = new DefaultTableModel();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        center = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        tfTotalResidual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnConfirm = new javax.swing.JButton();
        inputPanel = new javax.swing.JPanel();
        lblBarangay1 = new javax.swing.JLabel();
        tfIDNum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cbBarangay = new javax.swing.JComboBox<>();
        lblBarangay = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfQuantity = new javax.swing.JTextField();
        cbItem = new javax.swing.JComboBox<>();
        cbSector = new javax.swing.JComboBox<>();
        tfName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfDate = new javax.swing.JTextField();
        cbDate = new javax.swing.JCheckBox();
        tfControlNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        sidebar2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnRedeemPoints5 = new javax.swing.JButton();
        btnRedeemPoints6 = new javax.swing.JButton();
        btnDataTrash2 = new javax.swing.JButton();
        btnInputForm2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblUser2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(240, 80));

        main.setBackground(new java.awt.Color(238, 248, 235));
        main.setAutoscrolls(true);
        main.setPreferredSize(new java.awt.Dimension(1127, 686));

        center.setBackground(new java.awt.Color(238, 248, 235));
        center.setMaximumSize(new java.awt.Dimension(2147483647, 0));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(2147483647, 0));

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

        tfTotalResidual.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfTotalResidual.setText("0.0");
        tfTotalResidual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTotalResidualActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system_icon/TRASH TO CASH LOGO SMALL 2.png"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnConfirm.setBackground(new java.awt.Color(129, 182, 115));
        btnConfirm.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnConfirm.setForeground(new java.awt.Color(68, 105, 74));
        btnConfirm.setText("CONFIRM");
        btnConfirm.setPreferredSize(new java.awt.Dimension(93, 25));
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        inputPanel.setBackground(new java.awt.Color(196, 226, 187));

        lblBarangay1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblBarangay1.setForeground(new java.awt.Color(68, 105, 74));
        lblBarangay1.setText("ID Number:");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(68, 105, 74));
        jButton1.setText("Lookup");
        jButton1.setPreferredSize(new java.awt.Dimension(72, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbBarangay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "ADYA", "ANILAO", "ANILAO-LABAC", "ANTIPOLO DEL NORTE", "ANTIPOLO DEL SUR", "BAGONG POOK", "BALINTAWAK", "BANAYBANAY", "BARANGAY 12", "BOLBOK", "BUGTONG NA PULO", "BULACNIN", "BULAKLAKAN", "CALAMIAS", "CUMBA", "DAGATAN", "HALANG", "INOSLOBAN", "KUYAMNGGI", "LATAG", "LODLOD", "LUMBANG", "MABINI", "MALAGONLONG", "MALITLIT", "MARAUOY", "MATAAS NA LUPA", "MUNTING PULO", "PAGOLINGIN BATA", "PAGOLINGIN EAST", "PAGOLINGIN WEST", "PANGAO", "PINAGKAWITAN", "PINAGTONGULAN", "PLARIDEL", "POBLACION BARANGAY 1", "POBLACION BARANGAY 2", "POBLACION BARANGAY 3 ", "POBLACION BARANGAY 4", "POBLACION BARANGAY 5", "POBLACION BARANGAY 6", "POBLACION BARANGAY 7", "POBLACION BARANGAY 8", "POBLACION BARANGAY 9", "POBLACION BARANGAY 9-A", "POBLACION BARANGAY 10", "POBLACION BARANGAY 11", "PUSIL", "QUEZON", "RIZAL", "SABANG", "SAMPAGUITA", "SAN BENITO", "SAN CARLOS", "SAN CELESTINO", "SAN FRANSCISCO", "SAN GUILLERMO", "SAN JOSE", "SAN LUCAS", "SAN SALVADOR", "SAN SEBASTIAN", "SANTO NINO", "SANTO TORIBIO", "SAPAC", "SICO", "TALISAY", "TAMBO", "TANGOB", "TANGUAY", "TIBIG", "TIPACAN" }));
        cbBarangay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBarangayActionPerformed(evt);
            }
        });

        lblBarangay.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblBarangay.setForeground(new java.awt.Color(68, 105, 74));
        lblBarangay.setText("Barangay :");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(68, 105, 74));
        jLabel2.setText("Name :");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(68, 105, 74));
        jLabel7.setText("Sector:");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(68, 105, 74));
        jLabel1.setText("Item :");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(68, 105, 74));
        jLabel5.setText("Quantity :");

        tfQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuantityActionPerformed(evt);
            }
        });

        cbItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbItemActionPerformed(evt);
            }
        });

        cbSector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSectorActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(68, 105, 74));
        jLabel9.setText("Date:");

        tfDate.setPreferredSize(new java.awt.Dimension(118, 30));

        cbDate.setText("Auto-Generated");
        cbDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDateActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(68, 105, 74));
        jLabel3.setText("Control No. :");

        btnAdd.setBackground(new java.awt.Color(129, 182, 115));
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

        btnRemove.setBackground(new java.awt.Color(250, 98, 98));
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

        btnCancel.setBackground(new java.awt.Color(129, 182, 115));
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

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(lblBarangay1))
                        .addGap(18, 18, 18)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addComponent(tfIDNum)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(inputPanelLayout.createSequentialGroup()
                                .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(cbDate))
                            .addComponent(tfControlNo, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBarangay)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbItem, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbSector, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbBarangay, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfQuantity))))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancel)
                .addGap(44, 44, 44))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inputPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDate)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfControlNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBarangay1)
                    .addComponent(tfIDNum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBarangay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBarangay))
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSector, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(40, 40, 40)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbItem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout centerLayout = new javax.swing.GroupLayout(center);
        center.setLayout(centerLayout);
        centerLayout.setHorizontalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(centerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(centerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                        .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConfirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTotalResidual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        centerLayout.setVerticalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(centerLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfTotalResidual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        sidebar2.setBackground(new java.awt.Color(218, 243, 210));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system_icon/100x100seal.png"))); // NOI18N
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnRedeemPoints5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRedeemPoints5.setForeground(new java.awt.Color(68, 105, 74));
        btnRedeemPoints5.setText("ITEMS AND SECTORS");
        btnRedeemPoints5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRedeemPoints5.setFocusPainted(false);
        btnRedeemPoints5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedeemPoints5ActionPerformed(evt);
            }
        });

        btnRedeemPoints6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRedeemPoints6.setForeground(new java.awt.Color(68, 105, 74));
        btnRedeemPoints6.setText("MEMBERS");
        btnRedeemPoints6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRedeemPoints6.setFocusPainted(false);
        btnRedeemPoints6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedeemPoints6ActionPerformed(evt);
            }
        });

        btnDataTrash2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDataTrash2.setForeground(new java.awt.Color(68, 105, 74));
        btnDataTrash2.setText("DATABASES");
        btnDataTrash2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDataTrash2.setFocusPainted(false);
        btnDataTrash2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDataTrash2MouseExited(evt);
            }
        });
        btnDataTrash2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataTrash2ActionPerformed(evt);
            }
        });

        btnInputForm2.setBackground(new java.awt.Color(218, 243, 210));
        btnInputForm2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInputForm2.setForeground(new java.awt.Color(68, 105, 74));
        btnInputForm2.setText("INPUT FORM");
        btnInputForm2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInputForm2.setFocusPainted(false);
        btnInputForm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputForm2ActionPerformed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system_icon/login_icon.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Currently logged in");

        lblUser2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUser2.setForeground(new java.awt.Color(68, 105, 74));
        lblUser2.setText("       ");

        javax.swing.GroupLayout sidebar2Layout = new javax.swing.GroupLayout(sidebar2);
        sidebar2.setLayout(sidebar2Layout);
        sidebar2Layout.setHorizontalGroup(
            sidebar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebar2Layout.createSequentialGroup()
                .addGroup(sidebar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInputForm2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRedeemPoints6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRedeemPoints5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDataTrash2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sidebar2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sidebar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(lblUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidebar2Layout.setVerticalGroup(
            sidebar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebar2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel14)
                .addGap(80, 80, 80)
                .addComponent(btnDataTrash2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRedeemPoints6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnInputForm2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRedeemPoints5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addGroup(sidebar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel15)
                    .addGroup(sidebar2Layout.createSequentialGroup()
                        .addComponent(lblUser2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16)))
                .addContainerGap())
        );

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(sidebar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(center, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(center, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(sidebar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private String date(){
        
        String date;
        
        if (cbDate.isSelected()){
            date = (java.time.LocalDate.now().toString());
        }else {
            date = tfDate.getText();
        }
        
        return date;
    }
    
    private void populateItem (){
        try {
            connect = DatabaseConnection.connectionDB();
            
            String populateItem = "SELECT * FROM materials WHERE status = 'unarchived'";
            
            pre = (PreparedStatement) connect.prepareStatement(populateItem);
            rs = pre.executeQuery();
            
            while (rs.next()){
                cbItem.addItem(rs.getString("item"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(InputForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    private JFrame frame;
    private void populateSector(){
        try {
            connect = DatabaseConnection.connectionDB();
            
            String populateSector = "SELECT * FROM sector ";
            
            pre = (PreparedStatement) connect.prepareStatement(populateSector);
            rs = pre.executeQuery();
            
            while (rs.next()){
                cbSector.addItem(rs.getString("sector"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(InputForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void AddDatarecord(int memberID){
        
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
            String date = date();
            
            String ifexists = "SELECT * FROM datarecord WHERE memberID LIKE '" + tfIDNum.getText() + "' && month LIKE '" + month + "' && year LIKE '" + year + "'";
            pre = (PreparedStatement) connect.prepareStatement(ifexists);
            rs = pre.executeQuery();

            /*
            This section is for those members that have previous records in the same month of the year or it is their second time submitting 
            items for that specific month
            */
            if (rs.next()) {
                if (JOptionPane.showConfirmDialog(frame, "There is an existing record for this member during this month, add record to existing? ", "Trash to Cash",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                    double total = rs.getDouble("grandtotal") + GrandTotal;
                    double exPlasticKilo = rs.getDouble("plastic_kilos") + PlasticKilo;
                    double exPlasticPoint = rs.getDouble("plastic_points") + PlasticPoint;
                    double exTelaKilo = rs.getDouble("tela_kilos") + TelaKilo;
                    double exTelaPoint = rs.getDouble("tela_points") + TelaPoint;
                    double exResidual = rs.getDouble("final_residual") + ResidualPoint;
                    double exMarketable = rs.getDouble("marketable") + MarketablePoint;
                    double exFinalResidual = rs.getDouble("final_residual") + FinalResidual;
                    double exGrandTotal = rs.getDouble("grandtotal") + GrandTotal;

                    String updateTotal = "UPDATE datarecord set grandtotal = " + total + ", plastic_kilos = " + exPlasticKilo + ", plastic_points = " + exPlasticPoint + ", tela_kilos = " + exTelaKilo + ""
                            + ", tela_points = " + exTelaPoint + ", final_residual = " + exResidual + ", marketable = " + exMarketable + ", final_residual = " + exFinalResidual + ", grandtotal = " + exGrandTotal + ""
                            + "   WHERE memberID LIKE '" + memberID + "' && month LIKE '" + month + "' && year LIKE '" + year + "'";

                    pre = (PreparedStatement) connect.prepareStatement(updateTotal);
                    pre.execute();
                    pre.close();

                } else {
                    JOptionPane.showMessageDialog(frame, "Double records is not allowed. Record not added.");
                    pre.close();
                    rs.close();
                }

            } else {

                /* This section is for members that do not have previous records in that specific month of the year
                
                If a new category is added, add a comma and a question mark in the string sql. Also add the new column name 
                 */
                String sql = "INSERT INTO datarecord (memberID, name, barangay, sector, controlno, plastic_kilos, plastic_points, tela_kilos, tela_points, "
                        + "totalresidualpoints, marketable, final_residual, grandtotal, month, year, date"
                        + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

                pre = connect.prepareStatement(sql);

                pre.setInt(1, memberID);
                pre.setString(2, tfName.getText());
                pre.setString(3, (String) cbBarangay.getSelectedItem());
                pre.setString(4, (String) cbSector.getSelectedItem());
                pre.setString(5, tfControlNo.getText());
                pre.setDouble(6, PlasticKilo);
                pre.setDouble(7, PlasticPoint);
                pre.setDouble(8, TelaKilo);
                pre.setDouble(9, TelaPoint);
                pre.setDouble(10, ResidualPoint);
                pre.setDouble(11, MarketablePoint);
                pre.setDouble(12, FinalResidual);
                pre.setDouble(13, GrandTotal);
                pre.setString(14, month);
                pre.setInt(15, year);
                pre.setString(16, date);
                pre.execute();
                pre.close();

                JOptionPane.showMessageDialog(this, "Member Record Added");
            }
            
            /*
            This section is for updating the total number of points of a member in the database
            */
            
            String total_points_exists = "SELECT * FROM total_points WHERE memberID LIKE '" + memberID + "'";

            pre = (PreparedStatement) connect.prepareStatement(total_points_exists);
            rs = pre.executeQuery();
            
            if (rs.next()){
                pre.close();
                rs.close();
                
                String getTotal = "SELECT * FROM datarecord WHERE memberID LIKE '" + memberID + "'";

                double totalpoints = 0.0;
                pre = (PreparedStatement) connect.prepareStatement(getTotal);
                rs = pre.executeQuery();

                while (rs.next()) {
                    totalpoints += rs.getDouble("grandtotal");

                    String updateTotal = "UPDATE total_points set totalpoints = " + totalpoints + " WHERE memberID LIKE '" + memberID + "'";

                    pre = (PreparedStatement) connect.prepareStatement(updateTotal);
                    pre.execute();
                    pre.close();
                }
                rs.close();
            } else {

                String insertTotal = "INSERT INTO total_points(memberID, name, barangay, sector, totalpoints) VALUES (?, ?, ?, ?, ?)";

                pre = (PreparedStatement) connect.prepareStatement(insertTotal);

                pre.setInt(1, memberID);
                pre.setString(2, tfName.getText());
                pre.setString(3, cbBarangay.getSelectedItem().toString());
                pre.setString(4, cbSector.getSelectedItem().toString());
                pre.setDouble(5, GrandTotal);

                pre.execute();
                pre.close();
            }
            
            
            /*
            This section is for adding each item submitted by that specific member
            */
            AddItemRecord(memberID, month, year);
            Calendar cal = Calendar.getInstance(); 
            cal.getTime(); 
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm"); 
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < tblTable.getRowCount(); i++){
                String itemName = String.valueOf(model.getValueAt(i, 0));
                String quan = String.valueOf(model.getValueAt(i, 2));
                sb.append(itemName);
                sb.append(" x"); 
                sb.append(quan);
                sb.append("\n");
            }
            
            String addTransactList = "INSERT INTO transactionList (memberID, transaction, date, time, description, amount) VALUES (?, ?, ?, ?, ?, ?)";
            pre = (PreparedStatement) connect.prepareStatement(addTransactList);
            
            pre.setInt(1, memberID);
            pre.setString(2, "Deposit Items");
            pre.setString(3, date());
            pre.setString(4, String.valueOf(sdf));
            pre.setString(5, sb.toString());
            pre.setDouble(6, Double.parseDouble(tfTotalResidual.getText()));         
            

        }catch (SQLException ex) {
            Logger.getLogger(InputForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void AddItemRecord (int memberID, String month, int year){
        try {
            String name, barangay, sector;
            String sql = "SELECT * FROM items where memberID LIKE '" + memberID + "' && month LIKE '" + month + "' && year LIKE '" + year + "'";
            pre = (PreparedStatement) connect.prepareStatement(sql);
            rs = pre.executeQuery();
            
            name = tfName.getText();
            barangay = cbBarangay.getSelectedItem().toString();
            sector = cbSector.getSelectedItem().toString();
            
            if (rs.isBeforeFirst()) {
                
                String columnname;

                while (rs.next()) {
                    ResultSetMetaData rsMetaData = rs.getMetaData();
                    for (int j = 7; j <= rsMetaData.getColumnCount(); j++) {
                        columnname = rsMetaData.getColumnName(j);
                        for (int i = 0; i < model.getRowCount(); i++) {
                            double itemcurval = rs.getDouble(columnname);
                            String itemname = String.valueOf(model.getValueAt(i, 0)).toLowerCase();
                            double itemcount = Double.parseDouble(model.getValueAt(i, 2).toString());
                            char ch = '_';
                            double finalitemcount = itemcurval + itemcount;
                            itemname = itemname.replace(' ', ch);
                            if (itemname.equals(columnname)) {
                                String addItem = "UPDATE items SET " + itemname + " = " + finalitemcount + " WHERE memberID LIKE '" + memberID + "' && month LIKE '" + month + "' && year LIKE '" + year + "'";
                                try (PreparedStatement updPre = (PreparedStatement) connect.prepareStatement(addItem)) {
                                    updPre.execute();
                                }
                            }
                        }
                    }
                }
                
            } else{ 
                pre.close();
                rs.close();
                
                
                String addItemRecord = "INSERT INTO items(memberID, name, barangay, sector, month, year) VALUES (?, ?, ?, ?, ?, ?)";
                
                pre = (PreparedStatement) connect.prepareStatement(addItemRecord);
                pre.setInt(1, memberID);
                pre.setString(2, name);
                pre.setString(3, barangay);
                pre.setString(4, sector);
                pre.setString(5, month);
                pre.setInt(6, year);
                pre.execute(); 
                pre.close();
                 
                String getItemColumn = "SELECT * FROM items";
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

        if (tfIDNum.getText().equals("") || tfControlNo.getText().equals("") || tfName.getText().equals("") || cbSector.getSelectedItem().equals("----") || cbBarangay.getSelectedItem().equals("----") || cbItem.getSelectedItem().equals("----") || tfQuantity.getText().equals("")){
            
            JOptionPane.showMessageDialog(this, "Invalid input. Fill in all fields.");
        } else {
            connect = DatabaseConnection.connectionDB();
            
            tfIDNum.setEditable(false);
            tfName.setEditable(false);
            cbBarangay.setEnabled(false);
            cbSector.setEnabled(false);

            String barangay = cbBarangay.getSelectedItem().toString();
            String item = cbItem.getSelectedItem().toString();
            double quantity = Double.parseDouble(tfQuantity.getText());
            String sector = cbSector.getSelectedItem().toString();

            double value = 0.0;
            double total = 0.0;
            
            String material = "SELECT * FROM materials where item LIKE '" + item + "'";
            
            try {
                pre = (PreparedStatement) connect.prepareStatement (material);
                rs = pre.executeQuery();
                
                if (rs.next()){
                    value = rs.getDouble("value");
                }
                
                total = quantity * value;
                
            } catch (SQLException ex) {
                Logger.getLogger(InputForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            model = (DefaultTableModel) tblTable.getModel();
            
            model.addRow(new Object[]{
                item,
                String.format("%.2f", value),
                quantity,
                String.format("%.2f", total)
            });
            

            double sum = 0.0;
            String addsum;
            for (int i = 0; i < tblTable.getRowCount(); i++) {
                sum = sum + Double.parseDouble(tblTable.getValueAt(i, 3).toString());
                addsum = String.format("%.2f", sum);
                if (tblTable.getValueAt(i, 0).equals("----") || barangay.equals("----") || sector.equals("----")) {
                    model.removeRow(i);
                    JOptionPane.showMessageDialog(this, "Invalid Input");

                    tfIDNum.setEditable(true);
                    tfName.setEditable(true);
                    cbBarangay.setEnabled(true);
                    cbSector.setEnabled(true);

                }
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
        for (int i = 0; i < tblTable.getRowCount(); i++)
            {
                remove = remove + Double.parseDouble(tblTable.getValueAt(i, 3).toString());
                removesum = String.format("%.2f", remove);
            }
        tfTotalResidual.setText(removesum);
        
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        tfName.setEditable(true);
        cbBarangay.setEnabled(true);
        cbSector.setEnabled(true);
        tfIDNum.setEditable(true);
        
        model.setRowCount(0);
        tfIDNum.setText("");
        tfName.setText("");
        tfQuantity.setText("");
        tfControlNo.setText("");
        cbItem.setSelectedIndex(0);
        cbBarangay.setSelectedIndex(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cbSectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSectorActionPerformed


    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
 
        connect = DatabaseConnection.connectionDB();
        if (connect != null) {

            if (tfControlNo.getText().equals("") || tfName.getText().equals("") || cbBarangay.getSelectedItem().equals("----") || cbSector.getSelectedItem().equals("----") || model.getRowCount() == 0) {

                    JOptionPane.showMessageDialog(this, "Invalid input. Fill in all fields.");
            } else {
                try {

                    if (JOptionPane.showConfirmDialog(frame, "Add Record? ", "Trash to Cash",
                            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                        
                        String ifmemberExists = "SELECT * FROM members WHERE name LIKE '" + tfName.getText() + "' && barangay LIKE '" + cbBarangay.getSelectedItem()+ "' && sector LIKE '" + cbSector.getSelectedItem() + "'";
                        
                        pre = (PreparedStatement) connect.prepareStatement(ifmemberExists);
                        rs = pre.executeQuery();
                        
                        if (!rs.isBeforeFirst()){
                           JOptionPane.showMessageDialog(frame, "This member doesn't have previous record. Please add to members' database");
                              
                        }else {
                            AddDatarecord (Integer.parseInt(tfIDNum.getText()));
                        }
                    }


                } catch (HeadlessException | SQLException e) {

                    JOptionPane.showMessageDialog(null, e);
                }
            }

        } else {
            System.out.println("The connection not available to database");
        }


    }//GEN-LAST:event_btnConfirmActionPerformed

    private void tfTotalResidualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTotalResidualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTotalResidualActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            
            String fetch = "SELECT * FROM members WHERE memberID LIKE '" + tfIDNum.getText() + "'";
            
            connect = DatabaseConnection.connectionDB();
            
            pre = (PreparedStatement) connect.prepareStatement(fetch);
            rs = pre.executeQuery();
            
            String name, barangay, sector;
            
            if (rs.next()){
                name = rs.getString("name");
                barangay = rs.getString("barangay");
                sector = rs.getString("sector");
                
                int indexBrgy = 0;
                for (int i = 0; i < cbBarangay.getItemCount(); i++) {
                    if (barangay.equals(cbBarangay.getItemAt(i))) {
                        indexBrgy = i;
                    }
                }

                int indexSec = 0;
                for (int j = 0; j < cbSector.getItemCount(); j++) {
                    if (sector.equals(cbSector.getItemAt(j))) {
                        indexSec = j;
                    }
                }

                tfName.setText(name);
                cbBarangay.setSelectedIndex(indexBrgy);
                cbSector.setSelectedIndex(indexSec);
            }else {
                JOptionPane.showMessageDialog(this, "ID Number not found");
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(InputForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDateActionPerformed

    private void tfQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQuantityActionPerformed

    private void btnRedeemPoints5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedeemPoints5ActionPerformed
        // TODO add your handling code here:

        Options opt = new Options();
        opt.setVisible(true);
        opt.setTitle("Items and Sectors");
        opt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        opt.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.dispose();
    }//GEN-LAST:event_btnRedeemPoints5ActionPerformed

    private void btnRedeemPoints6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedeemPoints6ActionPerformed
        // TODO add your handling code here:
        Member member = new Member();
        member.setVisible(true);
        member.setTitle("Members' Records");
        member.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        member.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.dispose();
    }//GEN-LAST:event_btnRedeemPoints6ActionPerformed

    private void btnDataTrash2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDataTrash2MouseExited

    }//GEN-LAST:event_btnDataTrash2MouseExited

    private void btnDataTrash2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataTrash2ActionPerformed
        DBOptions database = new DBOptions();
        database.setVisible(true);
        database.setTitle("Databases");
        database.pack();
        database.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        database.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.dispose();
    }//GEN-LAST:event_btnDataTrash2ActionPerformed

    private void btnInputForm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputForm2ActionPerformed
        InputForm input = new InputForm();
        input.setVisible(true);
        input.setTitle("Input Form");
        input.pack();
        input.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        input.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.dispose();
    }//GEN-LAST:event_btnInputForm2ActionPerformed

       
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
            java.util.logging.Logger.getLogger(InputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputForm().setVisible(true);
            }
        });
    }
    
    private double checkifPlasticKilos (){
        double kilos = 0.0;
        for (int i = 0; i < tblTable.getRowCount(); i++){
                
                String material = tblTable.getValueAt(i, 0).toString();
                if (material.equals("PLASTIC"))
                    kilos =  kilos + Double.parseDouble(tblTable.getValueAt(i, 2).toString());
                }
        return kilos;
    }
    
    private double checkifPlasticPoints (){
        double points = 0.0;
        for (int i = 0; i < tblTable.getRowCount(); i++){
                
                String material = tblTable.getValueAt(i, 0).toString();
                if (material.equals("PLASTIC"))
                    points =  points + Double.parseDouble(tblTable.getValueAt(i, 3).toString());
                }
        return points;
    }
    
    private double checkifTelaKilos(){
        double kilos = 0.0;
        for (int i = 0; i < tblTable.getRowCount(); i++){
                
                String material = tblTable.getValueAt(i, 0).toString();
                if (material.equals("TELA"))
                    kilos =  kilos + Double.parseDouble(tblTable.getValueAt(i, 2).toString());
                }
        return kilos;
    }
    
    private double checkifTelaPoints(){
        double points = 0.0;
        for (int i = 0; i < tblTable.getRowCount(); i++){
                
                String material = tblTable.getValueAt(i, 0).toString();
                if (material.equals("TELA"))
                    points =  points + Double.parseDouble(tblTable.getValueAt(i, 3).toString());
                }
        return points;
    }
    
    private double checkifMarketablePoints(){
        double points = 0.0;
        for (int i = 0; i < tblTable.getRowCount(); i++){
                
            try {
                String material = tblTable.getValueAt(i, 0).toString();
                String sql = "SELECT * FROM materials where item LIKE '" + material + "'";
                pre = (PreparedStatement) connect.prepareStatement(sql);
                rs = pre.executeQuery();
                String category = "";
                
                if (rs.next()){
                    category = rs.getString("category");
                }
                
                if (category.equals("Marketable")){
                    points =  points + Double.parseDouble(tblTable.getValueAt(i, 3).toString());
                }
            } catch (SQLException ex) {
                Logger.getLogger(InputForm.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
        return points;
    }
    
    private String Month(){
        Calendar cal = Calendar.getInstance();
        int curMonth = cal.get(Calendar.MONTH);
        String month = "";
        
        switch(curMonth){
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
    
    public int Year(){
        Calendar cal = Calendar.getInstance();
        
        int year = cal.get(Calendar.YEAR);
        return year;
    }
    
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDataTrash2;
    private javax.swing.JButton btnInputForm2;
    private javax.swing.JButton btnRedeemPoints5;
    private javax.swing.JButton btnRedeemPoints6;
    private javax.swing.JButton btnRemove;
    private javax.swing.JComboBox<String> cbBarangay;
    private javax.swing.JCheckBox cbDate;
    private javax.swing.JComboBox<String> cbItem;
    private javax.swing.JComboBox<String> cbSector;
    private javax.swing.JPanel center;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBarangay;
    private javax.swing.JLabel lblBarangay1;
    private javax.swing.JLabel lblUser2;
    private javax.swing.JPanel main;
    private javax.swing.JPanel sidebar2;
    private javax.swing.JTable tblTable;
    private javax.swing.JTextField tfControlNo;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfIDNum;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfQuantity;
    private javax.swing.JTextField tfTotalResidual;
    // End of variables declaration//GEN-END:variables
}
