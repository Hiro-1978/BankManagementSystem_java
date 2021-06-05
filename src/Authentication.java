
import javax.swing.UIManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class Authentication extends javax.swing.JFrame {
        Connection conn;
        ResultSet rs;
        PreparedStatement pst;
    public Authentication() {
        super("Login");
        initComponents();
        conn = JBConnect.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnlg = new javax.swing.JButton();
        txtpin = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtac = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnnew = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143, 60, 16), 2), "Authentication", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 36), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlg.setFont(new java.awt.Font("Tahoma", 0, 12));
        btnlg.setForeground(new java.awt.Color(143, 60, 16));
        btnlg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bullet.gif"))); // NOI18N
        btnlg.setText("Login");
        btnlg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlgActionPerformed(evt);
            }
        });
        jPanel1.add(btnlg, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 80, 30));
        jPanel1.add(txtpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 220, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(143, 60, 16));
        jLabel2.setText("Enter Account No.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Security-Password-2-icon.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setForeground(new java.awt.Color(143, 60, 16));
        jLabel3.setText("PIN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, 30));
        jPanel1.add(txtac, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 220, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RTEmagicC_ibanking-logo_33_converted.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        btnnew.setFont(new java.awt.Font("Tahoma", 0, 12));
        btnnew.setForeground(new java.awt.Color(143, 60, 16));
        btnnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addusericon.png"))); // NOI18N
        btnnew.setText("New Account");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        jPanel1.add(btnnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 130, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_key.gif"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-518)/2, (screenSize.height-318)/2, 518, 318);
    }// </editor-fold>//GEN-END:initComponents

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        setVisible(false);
        Account nc = new Account();
        nc.setVisible(true);
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnlgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlgActionPerformed
        if (txtac.getText().trim().isEmpty() && txtpin.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ชื่อบัญชีหรือรหัสPIN ไม่ได้กรอก", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtac.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ชื่อบัญชีหรือรหัสPIN ไม่ได้กรอก", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtpin.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ชื่อบัญชีหรือรหัสPIN ไม่ได้กรอก", "error!!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String sql = "SELECT * FROM `account` WHERE Acc=? AND Pin=?";
                pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.setString(1, txtac.getText());
                pst.setString(2, txtpin.getText());
                rs = pst.executeQuery();
                if (rs.next()) {
                    setVisible(false);
                    Loading ld = new Loading();
                    ld.setUpLoading();
                    ld.setVisible(true);
                    rs.close();
                    pst.close();
                } else {
                    JOptionPane.showMessageDialog(null, "ชื่อบัญชีและรหัสPIN ไม่ถูกต้อง", "error!!", JOptionPane.ERROR_MESSAGE);
                    txtac.setText("");
                    txtpin.setText("");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            } 
        }
    }//GEN-LAST:event_btnlgActionPerformed


    public static void main(String args[]) {
        try{
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            }
        }catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }catch(InstantiationException ex){
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }catch(IllegalAccessException ex){
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }catch(javax.swing.UnsupportedLookAndFeelException ex){
            java.util.logging.Logger.getLogger(Authentication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentication().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlg;
    private javax.swing.JButton btnnew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtac;
    private javax.swing.JPasswordField txtpin;
    // End of variables declaration//GEN-END:variables

}
