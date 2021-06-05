
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;

public class Account extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    public Account() {
        super("Create Account");
        initComponents();
        conn = JBConnect.connect();
        RandomAcc();
        RandomMIRC();
        RandomPin();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnclr = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnbk = new javax.swing.JButton();
        txtans = new javax.swing.JTextField();
        txtpin = new javax.swing.JTextField();
        cbse = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtam = new javax.swing.JTextField();
        txtmo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtad = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtmiNo = new javax.swing.JTextField();
        cbac = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        btncre = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        cbgen = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cbre = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtacNo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RTEmagicC_ibanking-logo_33_converted.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143, 60, 16), 3), "New Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 36), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnclr.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnclr.setForeground(new java.awt.Color(143, 60, 16));
        btnclr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actions-edit-clear-icon.png"))); // NOI18N
        btnclr.setText("Clear");
        btnclr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclrActionPerformed(evt);
            }
        });
        jPanel1.add(btnclr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(143, 60, 16));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("MIRC No.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, -1));

        btnbk.setFont(new java.awt.Font("Tahoma", 1, 18));
        btnbk.setForeground(new java.awt.Color(143, 60, 16));
        btnbk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.png"))); // NOI18N
        btnbk.setText("Back");
        btnbk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbkActionPerformed(evt);
            }
        });
        jPanel1.add(btnbk, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));

        txtans.setFont(new java.awt.Font("Tahoma", 0, 16));
        txtans.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel1.add(txtans, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));

        txtpin.setEditable(false);
        txtpin.setFont(new java.awt.Font("Tahoma", 1, 16));
        txtpin.setForeground(new java.awt.Color(143, 60, 16));
        txtpin.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel1.add(txtpin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        cbse.setFont(new java.awt.Font("Tahoma", 0, 16));
        cbse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Where are you from?", "What is your weight?", "Where are you work?", "Who is you favarite actor?", "Who is you favarite singer?", "Who is you favarite food?" }));
        cbse.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel1.add(cbse, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel7.setForeground(new java.awt.Color(143, 60, 16));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Address");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 110, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel10.setForeground(new java.awt.Color(143, 60, 16));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Date of Birth");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 100, 110, -1));

        txtam.setFont(new java.awt.Font("Tahoma", 0, 16));
        txtam.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel1.add(txtam, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        txtmo.setFont(new java.awt.Font("Tahoma", 0, 16));
        txtmo.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel1.add(txtmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(143, 60, 16));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("PIN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, -1));

        txtnt.setFont(new java.awt.Font("Tahoma", 0, 16));
        txtnt.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel1.add(txtnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(143, 60, 16));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Mobile");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 220, 110, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(143, 60, 16));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Account Type");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 110, -1));

        txtad.setFont(new java.awt.Font("Tahoma", 0, 16));
        txtad.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel1.add(txtad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(143, 60, 16));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Answer");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 300, 110, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel14.setForeground(new java.awt.Color(143, 60, 16));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Sequrity Q.");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 260, 110, -1));

        txtmiNo.setEditable(false);
        txtmiNo.setFont(new java.awt.Font("Tahoma", 1, 16));
        txtmiNo.setForeground(new java.awt.Color(143, 60, 16));
        txtmiNo.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel1.add(txtmiNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        cbac.setFont(new java.awt.Font("Tahoma", 0, 16));
        cbac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Current", "Deposit", "Fixed Deposits", "Saving", " ", " ", " " }));
        cbac.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel1.add(cbac, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel12.setForeground(new java.awt.Color(143, 60, 16));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Religion");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 180, 110, -1));

        btncre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncre.setForeground(new java.awt.Color(143, 60, 16));
        btncre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addusericon.png"))); // NOI18N
        btncre.setText("Create");
        btncre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreActionPerformed(evt);
            }
        });
        jPanel1.add(btncre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(143, 60, 16));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 110, -1));

        txtname.setFont(new java.awt.Font("Tahoma", 0, 16));
        txtname.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        cbgen.setFont(new java.awt.Font("Tahoma", 0, 16));
        cbgen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Male", "Female" }));
        cbgen.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel1.add(cbgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel8.setForeground(new java.awt.Color(143, 60, 16));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Amount");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 110, -1));

        cbre.setFont(new java.awt.Font("Tahoma", 0, 16));
        cbre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Buddha", "Christian", "Hindu", "Muslim", "Other..." }));
        cbre.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel1.add(cbre, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel9.setForeground(new java.awt.Color(143, 60, 16));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 60, 110, -1));

        txtacNo.setEditable(false);
        txtacNo.setFont(new java.awt.Font("Tahoma", 1, 16));
        txtacNo.setForeground(new java.awt.Color(143, 60, 16));
        txtacNo.setPreferredSize(new java.awt.Dimension(200, 25));
        jPanel1.add(txtacNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel11.setForeground(new java.awt.Color(143, 60, 16));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Nationality");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 140, 110, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(143, 60, 16));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Account No.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 110, -1));

        dob.setDateFormatString("dd MMM yyyy");
        dob.setFont(new java.awt.Font("Tahoma", 0, 16));
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 200, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-771)/2, (screenSize.height-534)/2, 771, 534);
    }// </editor-fold>//GEN-END:initComponents

    private void btncreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreActionPerformed
        String acNo = txtacNo.getText();
        String name = txtname.getText();
        String DOB = ((JTextField) dob.getDateEditor().getUiComponent()).getText();
        String Pin = txtpin.getText();
        String act = cbac.getSelectedItem().toString();
        String nt = txtnt.getText();
        String re = cbre.getSelectedItem().toString();
        String miNo = txtmiNo.getText();
        String gen = cbgen.getSelectedItem().toString();
        String mo = txtmo.getText();
        String ad = txtad.getText();
        String se = cbse.getSelectedItem().toString();
        String ans = txtans.getText();
        String am = txtam.getText();

        String sql = "INSERT INTO `account`(`Acc`, `name`, `DOB`, `Pin`, `Acc_Type`, `Nationality`, `Reg`, `MICR_No`,`Gen`, `Mob`, `Add`, `Sec.Q`, `Sec.A`, `Balance`) "
                + "VALUES ('" + acNo + "','" + name + "','" + DOB + "','" + Pin + "','" + act + "','" + nt + "','" + re + "','" + miNo + "','" + gen + "','" + mo + "','" + ad + "','" + se + "','" + ans + "','" + am + "')";

        if (cbac.getSelectedItem().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (cbgen.getSelectedItem().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtad.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtam.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtname.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (((JTextField) dob.getDateEditor().getUiComponent()).getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtnt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (cbre.getSelectedItem().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtmo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (cbse.getSelectedItem().toString().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else if (txtans.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "กรอกข้อมูลไม่ครบ", "error!!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                pst = (PreparedStatement) conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Account has been create");
                bal();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btncreActionPerformed

    private void btnbkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbkActionPerformed
        setVisible(false);
        Authentication au = new Authentication();
        au.setVisible(true);
    }//GEN-LAST:event_btnbkActionPerformed

    private void btnclrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclrActionPerformed
        clear();
        RandomAcc();
        RandomMIRC();
        RandomPin();
    }//GEN-LAST:event_btnclrActionPerformed

    public void RandomAcc() {
        Random ra = new Random();
        txtacNo.setText("" + ra.nextInt(1000000000 + 1));
    }

    public void RandomMIRC() {
        Random rm = new Random();
        txtmiNo.setText("" + rm.nextInt(100000 + 1));
    }

    public void RandomPin() {
        Random rp = new Random();
        txtpin.setText("" + rp.nextInt(1000000 + 1));
    }

    public void bal() {
        String name = txtname.getText();
        String acNo = txtacNo.getText();
        String miNo = txtmiNo.getText();
        String am = txtam.getText();
        String sql = "INSERT INTO `balances`(`name`, `Acc`, `MICR_No`, `Balance`) VALUES ('" + name + "','" + acNo + "','" + miNo + "','" + am + "')";
        try {
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        clear();
    }

    public void clear() {
        txtacNo.setText("");
        txtmiNo.setText("");
        txtpin.setText("");
        cbac.setSelectedIndex(0);
        cbgen.setSelectedIndex(0);
        txtad.setText("");
        txtam.setText("");
        txtname.setText("");
        ((JTextField) dob.getDateEditor().getUiComponent()).setText("");
        txtnt.setText("");
        cbre.setSelectedIndex(0);
        txtmo.setText("");
        cbse.setSelectedIndex(0);
        txtans.setText("");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Account().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbk;
    private javax.swing.JButton btnclr;
    private javax.swing.JButton btncre;
    private javax.swing.JComboBox cbac;
    private javax.swing.JComboBox cbgen;
    private javax.swing.JComboBox cbre;
    private javax.swing.JComboBox cbse;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtacNo;
    private javax.swing.JTextField txtad;
    private javax.swing.JTextField txtam;
    private javax.swing.JTextField txtans;
    private javax.swing.JTextField txtmiNo;
    private javax.swing.JTextField txtmo;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnt;
    private javax.swing.JTextField txtpin;
    // End of variables declaration//GEN-END:variables
}
