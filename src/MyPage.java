
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class MyPage extends javax.swing.JFrame {
        Connection conn;
        ResultSet rs;
        PreparedStatement pst;
    public MyPage() {
        super("Home");
        initComponents();
        conn = JBConnect.connect();
        calendar();
        Account();
    }

    public void calendar(){
                        Calendar cal = new GregorianCalendar();
                        int day = cal.get(Calendar.DAY_OF_MONTH);
                        int month = cal.get(Calendar.MONTH) + 1;
                        int year = cal.get(Calendar.YEAR);
                        txtdate.setText(day + "-" + month + "-" + year);
    }

    public void Account(){
    try{
     String sql="select * from balances";
     pst=conn.prepareStatement(sql);
     rs=pst.executeQuery();
     while(rs.next()){
         String account=rs.getString("Acc");
         cbca.addItem(account);
     }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
}

    public void clear1(){
              txtuser.setText("");
              txtname1.setText("");
              txtacNo1.setText("");
              txtdob1.setText("");
              txtactype1.setText("");
              txtnt1.setText("");
              txtre1.setText("");
              txtgen1.setText("");
              txtmo1.setText("");
              txtadd1.setText("");
              txtse1.setText("");
    }

public void TransferD(){
    try{
          String value1=txtuser3.getText();
          String value2=txttotal3.getText();
          String sql="UPDATE `balances`SET `Balance`='"+value2+"' WHERE `name`='"+value1+"'";
          pst=conn.prepareStatement(sql);
          pst.execute();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
}

public void TransferC(){

     try{
          String value1=(String) cbca.getSelectedItem();
          String value2=txtfinal3.getText();
          String sql="UPDATE `balances`SET `Balance`='"+value2+"' WHERE `Acc`='"+value1+"'";
          pst=conn.prepareStatement(sql);
          pst.execute();
          JOptionPane.showMessageDialog(null, "Transfer Done");
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtname1 = new javax.swing.JTextField();
        txtdob1 = new javax.swing.JTextField();
        txtnt1 = new javax.swing.JTextField();
        txtgen1 = new javax.swing.JTextField();
        txtadd1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtse1 = new javax.swing.JTextField();
        txtmo1 = new javax.swing.JTextField();
        txtre1 = new javax.swing.JTextField();
        txtactype1 = new javax.swing.JTextField();
        txtacNo1 = new javax.swing.JTextField();
        btnedit1 = new javax.swing.JButton();
        btnsave1 = new javax.swing.JButton();
        txtuser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnserch = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtuser2 = new javax.swing.JTextField();
        txtname2 = new javax.swing.JTextField();
        txtacNo2 = new javax.swing.JTextField();
        txtab2 = new javax.swing.JTextField();
        txtda2 = new javax.swing.JTextField();
        btnsearch2 = new javax.swing.JButton();
        txttotal2 = new javax.swing.JTextField();
        btntotal2 = new javax.swing.JButton();
        btndeposit2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtuser3 = new javax.swing.JTextField();
        txtname3 = new javax.swing.JTextField();
        txtacNo3 = new javax.swing.JTextField();
        txtab3 = new javax.swing.JTextField();
        txttr3 = new javax.swing.JTextField();
        txttotal3 = new javax.swing.JTextField();
        cbca = new javax.swing.JComboBox();
        btnsearch3 = new javax.swing.JButton();
        btntotal3 = new javax.swing.JButton();
        txtfinal3 = new javax.swing.JTextField();
        txttc3 = new javax.swing.JTextField();
        btnshow = new javax.swing.JButton();
        btntran = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RTEmagicC_ibanking-logo_33_converted.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(143, 60, 16));
        jLabel3.setText("Date");

        txtdate.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtdate.setForeground(new java.awt.Color(0, 0, 255));
        txtdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdate.setDisabledTextColor(new java.awt.Color(0, 0, 255));
        txtdate.setEnabled(false);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(143, 60, 16), 2));
        jTabbedPane1.setForeground(new java.awt.Color(143, 60, 16));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 16));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(143, 60, 16));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel5.setForeground(new java.awt.Color(143, 60, 16));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Date of Birth");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel6.setForeground(new java.awt.Color(143, 60, 16));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Nationality");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel7.setForeground(new java.awt.Color(143, 60, 16));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Gender");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel8.setForeground(new java.awt.Color(143, 60, 16));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Address");

        txtname1.setEditable(false);
        txtname1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtname1.setPreferredSize(new java.awt.Dimension(200, 25));

        txtdob1.setEditable(false);
        txtdob1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtdob1.setPreferredSize(new java.awt.Dimension(200, 25));

        txtnt1.setEditable(false);
        txtnt1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtnt1.setPreferredSize(new java.awt.Dimension(200, 25));

        txtgen1.setEditable(false);
        txtgen1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtgen1.setPreferredSize(new java.awt.Dimension(200, 25));

        txtadd1.setEditable(false);
        txtadd1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtadd1.setPreferredSize(new java.awt.Dimension(200, 25));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel9.setForeground(new java.awt.Color(143, 60, 16));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Account No.");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel10.setForeground(new java.awt.Color(143, 60, 16));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Account Type");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel11.setForeground(new java.awt.Color(143, 60, 16));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Religion");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel12.setForeground(new java.awt.Color(143, 60, 16));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Mobile");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16));
        jLabel13.setForeground(new java.awt.Color(143, 60, 16));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Security Q.");

        txtse1.setEditable(false);
        txtse1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtse1.setPreferredSize(new java.awt.Dimension(200, 25));

        txtmo1.setEditable(false);
        txtmo1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtmo1.setPreferredSize(new java.awt.Dimension(200, 25));

        txtre1.setEditable(false);
        txtre1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtre1.setPreferredSize(new java.awt.Dimension(200, 25));

        txtactype1.setEditable(false);
        txtactype1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtactype1.setPreferredSize(new java.awt.Dimension(200, 25));

        txtacNo1.setEditable(false);
        txtacNo1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtacNo1.setPreferredSize(new java.awt.Dimension(200, 25));

        btnedit1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnedit1.setForeground(new java.awt.Color(143, 60, 16));
        btnedit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_edit_new.gif"))); // NOI18N
        btnedit1.setText("Edit");
        btnedit1.setPreferredSize(new java.awt.Dimension(110, 30));
        btnedit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnedit1ActionPerformed(evt);
            }
        });

        btnsave1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnsave1.setForeground(new java.awt.Color(143, 60, 16));
        btnsave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Save-icon.png"))); // NOI18N
        btnsave1.setText("Save");
        btnsave1.setPreferredSize(new java.awt.Dimension(110, 30));
        btnsave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsave1ActionPerformed(evt);
            }
        });

        txtuser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(143, 60, 16));
        jLabel2.setText("User");

        btnserch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Eye-2-icon-1.png"))); // NOI18N
        btnserch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnserchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(714, 714, 714)
                        .addComponent(txtuser)
                        .addGap(10, 10, 10)
                        .addComponent(btnserch, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnedit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnsave1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtdob1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7))
                                    .addGap(32, 32, 32)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtadd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtgen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtnt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(176, 176, 176)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel10))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtacNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtactype1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtmo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtuser, 0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(btnserch))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtacNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel10))
                            .addComponent(txtactype1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtmo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel5))
                            .addComponent(txtdob1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtnt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtgen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtadd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnedit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Profile", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(143, 60, 16));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("User");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(143, 60, 16));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Name");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(143, 60, 16));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Account No.");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(143, 60, 16));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Available Balance");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(143, 60, 16));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Deposit Amount");

        txtuser2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtuser2.setPreferredSize(new java.awt.Dimension(200, 25));

        txtname2.setEditable(false);
        txtname2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtname2.setPreferredSize(new java.awt.Dimension(200, 25));

        txtacNo2.setEditable(false);
        txtacNo2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtacNo2.setPreferredSize(new java.awt.Dimension(200, 25));

        txtab2.setEditable(false);
        txtab2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtab2.setPreferredSize(new java.awt.Dimension(200, 25));

        txtda2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtda2.setPreferredSize(new java.awt.Dimension(200, 25));

        btnsearch2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnsearch2.setForeground(new java.awt.Color(143, 60, 16));
        btnsearch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.gif"))); // NOI18N
        btnsearch2.setText("Search");
        btnsearch2.setPreferredSize(new java.awt.Dimension(107, 25));
        btnsearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch2ActionPerformed(evt);
            }
        });

        txttotal2.setEditable(false);
        txttotal2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txttotal2.setPreferredSize(new java.awt.Dimension(200, 25));

        btntotal2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btntotal2.setForeground(new java.awt.Color(143, 60, 16));
        btntotal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.gif"))); // NOI18N
        btntotal2.setText("Total");
        btntotal2.setPreferredSize(new java.awt.Dimension(107, 25));
        btntotal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotal2ActionPerformed(evt);
            }
        });

        btndeposit2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btndeposit2.setForeground(new java.awt.Color(143, 60, 16));
        btndeposit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.gif"))); // NOI18N
        btndeposit2.setText("Deposit");
        btndeposit2.setPreferredSize(new java.awt.Dimension(107, 25));
        btndeposit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeposit2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(339, 339, 339)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(53, 53, 53)
                                        .addComponent(txtacNo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15))
                                        .addGap(103, 103, 103)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(txtuser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnsearch2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(343, 343, 343)
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(txtda2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txttotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btntotal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(114, 114, 114)))
                .addGap(235, 235, 235))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(534, 534, 534)
                .addComponent(btndeposit2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addGap(402, 402, 402))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtuser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtname2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtacNo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnsearch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txttotal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btntotal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btndeposit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Deposit", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel3.setFont(new java.awt.Font("Tahoma", 1, 16));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(143, 60, 16));
        jLabel19.setText("๊User");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(143, 60, 16));
        jLabel20.setText("Name");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(143, 60, 16));
        jLabel21.setText("Account No.");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(143, 60, 16));
        jLabel22.setText("Available Balance");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(143, 60, 16));
        jLabel23.setText("Transfer Amount");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(143, 60, 16));
        jLabel24.setText("Credit Account");

        txtuser3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtuser3.setPreferredSize(new java.awt.Dimension(200, 25));

        txtname3.setEditable(false);
        txtname3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtname3.setPreferredSize(new java.awt.Dimension(200, 25));

        txtacNo3.setEditable(false);
        txtacNo3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtacNo3.setPreferredSize(new java.awt.Dimension(200, 25));

        txtab3.setEditable(false);
        txtab3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtab3.setPreferredSize(new java.awt.Dimension(200, 25));

        txttr3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txttr3.setPreferredSize(new java.awt.Dimension(90, 25));

        txttotal3.setEditable(false);
        txttotal3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txttotal3.setPreferredSize(new java.awt.Dimension(90, 25));

        cbca.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbca.setPreferredSize(new java.awt.Dimension(64, 25));
        cbca.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbcaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        btnsearch3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnsearch3.setForeground(new java.awt.Color(143, 60, 16));
        btnsearch3.setText("Search");
        btnsearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearch3ActionPerformed(evt);
            }
        });

        btntotal3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btntotal3.setForeground(new java.awt.Color(143, 60, 16));
        btntotal3.setText("Total");
        btntotal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotal3ActionPerformed(evt);
            }
        });

        txtfinal3.setEditable(false);
        txtfinal3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtfinal3.setPreferredSize(new java.awt.Dimension(8, 25));

        txttc3.setEditable(false);
        txttc3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txttc3.setPreferredSize(new java.awt.Dimension(8, 25));

        btnshow.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnshow.setForeground(new java.awt.Color(143, 60, 16));
        btnshow.setText("Show");
        btnshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowActionPerformed(evt);
            }
        });

        btntran.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btntran.setForeground(new java.awt.Color(143, 60, 16));
        btntran.setText("Transfer");
        btntran.setPreferredSize(new java.awt.Dimension(80, 25));
        btntran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntranActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addGap(98, 98, 98)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnshow)
                        .addGap(18, 18, 18)
                        .addComponent(btntran, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtacNo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtuser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnsearch3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txttr3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txttotal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btntotal3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cbca, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txttc3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfinal3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtuser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch3))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtname3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(txtacNo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txttr3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntotal3))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(cbca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfinal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnshow)
                    .addComponent(btntran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Transfer", jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel4.setFont(new java.awt.Font("Tahoma", 1, 16));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Withdraw", jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel5.setFont(new java.awt.Font("Tahoma", 1, 16));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Customer List", jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel6.setFont(new java.awt.Font("Tahoma", 1, 16));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Transaction", jPanel6);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel7.setFont(new java.awt.Font("Tahoma", 1, 16));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("View Balance", jPanel7);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel8.setFont(new java.awt.Font("Tahoma", 1, 16));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Change Pin", jPanel8);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jPanel9.setFont(new java.awt.Font("Tahoma", 1, 16));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("About", jPanel9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 530, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(11, 11, 11)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1001)/2, (screenSize.height-621)/2, 1001, 621);
    }// </editor-fold>//GEN-END:initComponents
// หน้า Profile เริ่ม
    private void btnedit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnedit1ActionPerformed
        txtnt1.setEditable(true);
        txtgen1.setEditable(true);
        txtadd1.setEditable(true);
        txtse1.setEditable(true);
        txtmo1.setEditable(true);
        txtre1.setEditable(true);
    }//GEN-LAST:event_btnedit1ActionPerformed

    private void btnserchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnserchActionPerformed

        String sql = "SELECT * FROM `account` WHERE name=?";
        try{
          pst=conn.prepareStatement(sql);
          pst.setString(1, txtuser.getText());
          rs=pst.executeQuery();
          if(rs.next()){
              String add1=rs.getString("name");
              txtname1.setText(add1);
              String add2=rs.getString("Acc");
              txtacNo1.setText(add2);
              String add3=rs.getString("DOB");
              txtdob1.setText(add3);
              String add4=rs.getString("Acc_Type");
              txtactype1.setText(add4);
              String add5=rs.getString("Nationality");
              txtnt1.setText(add5);
              String add6=rs.getString("Reg");
              txtre1.setText(add6);
              String add7=rs.getString("Gen");
              txtgen1.setText(add7);
              String add8=rs.getString("Mob");
              txtmo1.setText(add8);
              String add9=rs.getString("Add");
              txtadd1.setText(add9);
              String add10=rs.getString("Sec.Q");
              txtse1.setText(add10);
              rs.close();
              pst.close();
          }
          else{
             JOptionPane.showMessageDialog(null, "Enter Correct Name");
             clear1();
          }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
               rs.close();
              pst.close();
            }catch(Exception e){
              JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnserchActionPerformed

    private void btnsave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsave1ActionPerformed
          try{
          String value1=txtuser.getText();
          String value2=txtname1.getText();
          String value3=txtdob1.getText();
          String value4=txtgen1.getText();
          String value5=txtnt1.getText();
          String value6=txtadd1.getText();
          String value7=txtmo1.getText();
          String value8=txtre1.getText();
        
          String sql="UPDATE `account` SET `name`='"+value2+"',`DOB`='"+value3+"',`Nationality`='"+value5+"',`Gen`='"+value4+"',"
                  + "`Reg`='"+value8+"',`Mob`='"+value7+"',`Add`='"+value6+"' WHERE name='"+value1+"'";

          pst=conn.prepareStatement(sql);
          pst.execute();
          JOptionPane.showMessageDialog(null, "Saved Succesfully");
          }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnsave1ActionPerformed
// หน้า Profile จบ
// ------------------------------------------------------------------------------------------------------ //
// หน้า Deposit เริ่ม
    private void btnsearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch2ActionPerformed
        String sql="select * from Balances where Name=?";
        try{
          pst=conn.prepareStatement(sql);
          pst.setString(1, txtuser2.getText());
          rs=pst.executeQuery();
          if(rs.next()){
              String add1=rs.getString("Name");
              txtname2.setText(add1);
              String add2=rs.getString("Acc");
              txtacNo2.setText(add2);
              String add3=rs.getString("Balance");
              txtab2.setText(add3);
              rs.close();
              pst.close();
          }
          else{
             JOptionPane.showMessageDialog(null, "Enter Correct Name");
          }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
               rs.close();
              pst.close();
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_btnsearch2ActionPerformed

    private void btntotal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotal2ActionPerformed
      try{
          String a1=txtab2.getText();
          String a2=txtda2.getText();
          int sum=Integer.parseInt(a1)+Integer.parseInt(a2);
          String sum1=String.valueOf(sum);
          txttotal2.setText(sum1);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }       
    }//GEN-LAST:event_btntotal2ActionPerformed

    private void btndeposit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeposit2ActionPerformed
       if(txttotal2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ใส่จำนวนเงิน และกด Total เพื่อรวมจำนวนเงินก่อนทุกครั้ง", "error!!", JOptionPane.ERROR_MESSAGE);
      }else{
        try{
          String value1=txtuser2.getText();
          String value2=txttotal2.getText();
          String sql="UPDATE `balances` SET `Balance`='"+value2+"'  WHERE name='"+value1+"'";
          pst=conn.prepareStatement(sql);
          pst.execute();
          JOptionPane.showMessageDialog(null, "Sucessfully Deposited");
          txtuser2.setText("");
          txtname2.setText("");
          txtacNo2.setText("");
          txtab2.setText("");
          txtda2.setText("");
          txttotal2.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
       }
    }//GEN-LAST:event_btndeposit2ActionPerformed
// หน้า Deposit จบ
// ------------------------------------------------------------------------------------------------------ //
// หน้า Transfer เริ่ม
    private void btnsearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearch3ActionPerformed
String sql="select * from Balances where Name=?";
        try{
          pst=conn.prepareStatement(sql);
          pst.setString(1, txtuser3.getText());
          rs=pst.executeQuery();
          if(rs.next()){
              String add1=rs.getString("Name");
              txtname3.setText(add1);
              String add2=rs.getString("Acc");
              txtacNo3.setText(add2);
              String add3=rs.getString("Balance");
              txtab3.setText(add3);
              rs.close();
              pst.close();
          }
          else{
             JOptionPane.showMessageDialog(null, "Enter Correct Name");
          }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
               rs.close();
              pst.close();
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_btnsearch3ActionPerformed

    private void btntotal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotal3ActionPerformed
        try{
          String a1=txtab3.getText();
          String a2=txttr3.getText();
          int sum=Integer.parseInt(a1)-Integer.parseInt(a2);
          String sum1=String.valueOf(sum);
          txttotal3.setText(sum1);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btntotal3ActionPerformed

    private void btnshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowActionPerformed
        try{
          String a1=txttr3.getText();
          String a2=txttc3.getText();
          int sum=Integer.parseInt(a1)+Integer.parseInt(a2);
          String sum1=String.valueOf(sum);
          txtfinal3.setText(sum1);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnshowActionPerformed

    private void cbcaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbcaPopupMenuWillBecomeInvisible
        try{
          String a1=(String) cbca.getSelectedItem();
          String sql="select * from Balances where Acc=?";
          pst=conn.prepareStatement(sql);
          pst.setString(1, a1);
          rs=pst.executeQuery();
          if(rs.next()){
              String add=rs.getString("Balance");
              txttc3.setText(add);
          }

       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }//GEN-LAST:event_cbcaPopupMenuWillBecomeInvisible

    private void btntranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntranActionPerformed
        TransferD();
        TransferC();
    }//GEN-LAST:event_btntranActionPerformed
// หน้า Transfer จบ
// ------------------------------------------------------------------------------------------------------ //
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndeposit2;
    private javax.swing.JButton btnedit1;
    private javax.swing.JButton btnsave1;
    private javax.swing.JButton btnsearch2;
    private javax.swing.JButton btnsearch3;
    private javax.swing.JToggleButton btnserch;
    private javax.swing.JButton btnshow;
    private javax.swing.JButton btntotal2;
    private javax.swing.JButton btntotal3;
    private javax.swing.JButton btntran;
    private javax.swing.JComboBox cbca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtab2;
    private javax.swing.JTextField txtab3;
    private javax.swing.JTextField txtacNo1;
    private javax.swing.JTextField txtacNo2;
    private javax.swing.JTextField txtacNo3;
    private javax.swing.JTextField txtactype1;
    private javax.swing.JTextField txtadd1;
    private javax.swing.JTextField txtda2;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtdob1;
    private javax.swing.JTextField txtfinal3;
    private javax.swing.JTextField txtgen1;
    private javax.swing.JTextField txtmo1;
    private javax.swing.JTextField txtname1;
    private javax.swing.JTextField txtname2;
    private javax.swing.JTextField txtname3;
    private javax.swing.JTextField txtnt1;
    private javax.swing.JTextField txtre1;
    private javax.swing.JTextField txtse1;
    private javax.swing.JTextField txttc3;
    private javax.swing.JTextField txttotal2;
    private javax.swing.JTextField txttotal3;
    private javax.swing.JTextField txttr3;
    private javax.swing.JTextField txtuser;
    private javax.swing.JTextField txtuser2;
    private javax.swing.JTextField txtuser3;
    // End of variables declaration//GEN-END:variables

}
