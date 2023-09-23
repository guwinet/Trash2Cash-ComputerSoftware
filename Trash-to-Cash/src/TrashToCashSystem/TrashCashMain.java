package TrashToCashSystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TrashCashMain extends javax.swing.JFrame {

    public TrashCashMain() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblUser.setText(TrashLogin.user);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnRedeemPoints2 = new javax.swing.JButton();
        btnRedeemPoints1 = new javax.swing.JButton();
        btnDataTrash = new javax.swing.JButton();
        btnInputForm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        center = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setBackground(new java.awt.Color(238, 248, 235));
        main.setPreferredSize(new java.awt.Dimension(971, 593));

        sidebar.setBackground(new java.awt.Color(218, 243, 210));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system_icon/100x100seal.png"))); // NOI18N
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

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

        btnDataTrash.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDataTrash.setForeground(new java.awt.Color(68, 105, 74));
        btnDataTrash.setText("DATABASES");
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system_icon/login_icon.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Currently logged in");

        lblUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(68, 105, 74));
        lblUser.setText("       ");

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInputForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRedeemPoints1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRedeemPoints2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDataTrash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addGap(80, 80, 80)
                .addComponent(btnDataTrash, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRedeemPoints1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnInputForm, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRedeemPoints2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2)
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addComponent(lblUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );

        center.setBackground(new java.awt.Color(238, 248, 235));

        jLabel1.setBackground(new java.awt.Color(238, 248, 235));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system_icon/TRASH TO CASH LOGO.png"))); // NOI18N
        jLabel1.setIconTextGap(0);
        jLabel1.setMaximumSize(new java.awt.Dimension(32767, 32767));

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system_icon/logout.png"))); // NOI18N
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout centerLayout = new javax.swing.GroupLayout(center);
        center.setLayout(centerLayout);
        centerLayout.setHorizontalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerLayout.createSequentialGroup()
                .addGroup(centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(centerLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE))
                .addContainerGap())
        );
        centerLayout.setVerticalGroup(
            centerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(center, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(center, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInputFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputFormActionPerformed
        InputForm input = new InputForm();
        input.setVisible(true);
        input.setTitle("Input Form");
        input.pack();
        input.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        input.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.dispose();
    }//GEN-LAST:event_btnInputFormActionPerformed

    private void btnDataTrashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataTrashActionPerformed
        DBOptions database = new DBOptions();
        database.setVisible(true);
        database.setTitle("Databases");
        database.pack();
        database.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        database.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.dispose();
    }//GEN-LAST:event_btnDataTrashActionPerformed

    private void btnDataTrashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDataTrashMouseExited

    }//GEN-LAST:event_btnDataTrashMouseExited

    private JFrame frame;
    
    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to logout?", "Trash to Cash", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            
            System.exit(0);
        }
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnRedeemPoints1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedeemPoints1ActionPerformed
        // TODO add your handling code here:
        Member member = new Member();
        member.setVisible(true);
        member.setTitle("Members' Records");
        member.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        member.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.dispose();
        
    }//GEN-LAST:event_btnRedeemPoints1ActionPerformed

    private void btnRedeemPoints2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedeemPoints2ActionPerformed
        // TODO add your handling code here:
        
        Options opt = new Options();
        opt.setVisible(true);
        opt.setTitle("Items and Sectors");
        opt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        opt.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.dispose();
    }//GEN-LAST:event_btnRedeemPoints2ActionPerformed

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
            java.util.logging.Logger.getLogger(TrashCashMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrashCashMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrashCashMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrashCashMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrashCashMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDataTrash;
    private javax.swing.JButton btnInputForm;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JButton btnRedeemPoints1;
    private javax.swing.JButton btnRedeemPoints2;
    private javax.swing.JPanel center;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel main;
    private javax.swing.JPanel sidebar;
    // End of variables declaration//GEN-END:variables
}
