
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class loanDetails extends javax.swing.JFrame {

    /**
     * Creates new form loanDetails
     */
    public loanDetails() {
        initComponents();
        Connection conn;
        String url = "jdbc:sqlite:D:/Java Codes (Practices)/7.Salary Processing System/PayRollSystem/Database/database.db";
        
        try{
        
                conn = DriverManager.getConnection(url);
                String sql = "SELECT MID,Name FROM PersonalDetails";
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                int n = 1;
                
                while(rs.next()){
                    String NO = Integer.toString(n);
                    String MID = rs.getString("MID");
                    String Name = rs.getString("Name");
                    
                    // load data to table-----------------------
                    
                    String dataT[] = {NO, MID, Name};
                    
                    DefaultTableModel tb1Model = (DefaultTableModel)jTable1.getModel();
                    tb1Model.addRow(dataT);
                    
                    n++;
                    
                }
                
                String sql2 = "SELECT COUNT(*) FROM loanDetails";
                PreparedStatement pst2 = conn.prepareStatement(sql2);
                ResultSet rs2 = pst2.executeQuery();
                
                String rowCount = rs2.getString(1);
                int rc = Integer.parseInt(rowCount);
                
                loanno.setText("LID"+(rc+1));
        
                conn.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Database Error");
        }
        mid.requestFocus();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        mid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        loanamount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        interest = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        timeduration = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        paymnet = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        loanno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 22)); // NOI18N
        jLabel1.setText("Add loan details");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "MID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(25);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(25);
            jTable1.getColumnModel().getColumn(1).setMinWidth(65);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(65);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(65);
        }

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Loan Amount");

        mid.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        mid.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        mid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                midKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Member ID");

        loanamount.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        loanamount.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        loanamount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loanamountKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("Interest");

        interest.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        interest.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        interest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                interestKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("Time Duration");

        timeduration.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        timeduration.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        timeduration.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                timedurationKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setText("Payment");

        paymnet.setEditable(false);
        paymnet.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        paymnet.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        paymnet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paymnetKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setText("Loan No");

        loanno.setEditable(false);
        loanno.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        loanno.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        loanno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loannoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(loanno))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mid))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(loanamount))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(interest))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(timeduration))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(paymnet))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 79, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(loanamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(interest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(timeduration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(paymnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(loanno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void midKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_midKeyPressed
        int keypad = evt.getKeyCode();
        if(keypad == KeyEvent.VK_ENTER){
            if(mid.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Enter Member ID");
            }
            
            else{
                Connection conn;
                String url = "jdbc:sqlite:D:/Java Codes (Practices)/7.Salary Processing System/PayRollSystem/Database/database.db";
                
                try{
                    conn = DriverManager.getConnection(url);
                    String sql = "SELECT MID FROM PersonalDetails WHERE MID = ?";
                    PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setString(1, mid.getText());
                    ResultSet rs = pst.executeQuery();
                    String midentity = "";
                    while(rs.next()){
                        midentity = rs.getString(1);
                    }
                    
                    if(midentity == null ? mid.getText() == null : midentity.equals(mid.getText())){
                        loanamount.requestFocus();;
                    }else{
                        JOptionPane.showMessageDialog(null, "Invalid Member ID");
                    }
                    
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null,"Error - "+e);
                }
            }
        }else if(keypad == KeyEvent.VK_ESCAPE){
            dispose();
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_midKeyPressed

    private void loanamountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loanamountKeyPressed
        // TODO add your handling code here:
        int keypad = evt.getKeyCode();
        if(keypad == KeyEvent.VK_ENTER){
            if(loanamount.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Enter Loan Amount");
            }else{
                interest.requestFocus();
                JOptionPane.showMessageDialog(null,"Enter Monthly Rate");
            }
        }else if(keypad == KeyEvent.VK_ESCAPE){
            dispose();
        }
    }//GEN-LAST:event_loanamountKeyPressed

    private void interestKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_interestKeyPressed
        // TODO add your handling code here:
        int keypad = evt.getKeyCode();
        if(keypad == KeyEvent.VK_ENTER){
            if(interest.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Enter Interest Rate");
            }else{
                String rate = interest.getText();
                float rateI = Float.parseFloat(rate);
                if(rateI>0 && rateI<=100){
                    timeduration.requestFocus();
                    JOptionPane.showMessageDialog(null,"Enter Number of Months");
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Range of Interest Rate");
                }
            }
        }else if(keypad == KeyEvent.VK_ESCAPE){
            dispose();
        }
    }//GEN-LAST:event_interestKeyPressed

    private void timedurationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timedurationKeyPressed
        // TODO add your handling code here:
        int keypad = evt.getKeyCode();
        if(keypad == KeyEvent.VK_ENTER){
            if(timeduration.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Enter Time Duration");
            }else{
                float amountL = Float.parseFloat(loanamount.getText());
                float rateL = Float.parseFloat(interest.getText());
                int timeDu = Integer.parseInt(timeduration.getText());
                
                float monthlyBalance = ((amountL*rateL/100)/timeDu)+(amountL/timeDu);
                
                paymnet.setText(Float.toString(monthlyBalance));
                
                save.requestFocus();
            }
        }else if(keypad == KeyEvent.VK_ESCAPE){
            dispose();
        }
    }//GEN-LAST:event_timedurationKeyPressed

    private void paymnetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paymnetKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymnetKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        Connection conn;
        String url = "jdbc:sqlite:D:/Java Codes (Practices)/7.Salary Processing System/PayRollSystem/Database/database.db";
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String loan_date = formatter.format(date);
                
        SimpleDateFormat formatter1 = new SimpleDateFormat("HH:mm:ss");
        Date date1 = new Date();
        String loan_time = formatter1.format(date1);
        
        try{
            conn = DriverManager.getConnection(url);
            String sql = "INSERT INTO loanDetails VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,mid.getText());
            pst.setString(2,loanno.getText());
            pst.setString(3,loanamount.getText());
            pst.setString(4,interest.getText());
            pst.setString(5,timeduration.getText());
            pst.setString(6,paymnet.getText());
            pst.setString(7,loanamount.getText());
            pst.setString(8,loan_date);
            pst.setString(9,loan_time);
            pst.execute();
            
            String sql2 = "INSERT INTO LoanRemains VALUES(?,?)";
            PreparedStatement pst2 = conn.prepareStatement(sql2);
            pst2.setString(1,loanno.getText());
            pst2.setString(2,timeduration.getText());
            pst2.execute();
            
            JOptionPane.showMessageDialog(null, "Loan Issuied");
            
            conn.close();
            
            dispose();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error - "+e);
        }
        
    }//GEN-LAST:event_saveActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loanDetails().setVisible(true);
            }
        });
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void loannoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loannoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loannoKeyPressed

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
            java.util.logging.Logger.getLogger(loanDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loanDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loanDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loanDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loanDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField interest;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField loanamount;
    private javax.swing.JTextField loanno;
    private javax.swing.JTextField mid;
    private javax.swing.JTextField paymnet;
    private javax.swing.JButton save;
    private javax.swing.JTextField timeduration;
    // End of variables declaration//GEN-END:variables
}
