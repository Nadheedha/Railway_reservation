/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package railway_reservation;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.lang.*;
import java.text.SimpleDateFormat;
import javax.swing.table.*;
/**
 *
 * @author archa
 */
public class avail_check extends javax.swing.JFrame {

    /**
     * Creates new form book_tickets
     */
    public avail_check() {
        initComponents();
        this.setLocationRelativeTo(null);
        LoadStartPlace(start_place);
        LoadDestinyPlace(destiny_place);
        
        
    }
    public void LoadStartPlace(JComboBox jComboBox1)
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/railway", "root", "");
            String sql="Select distinct(dplace) from train";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            jComboBox1.removeAllItems();
            while(rs.next())
            {
                jComboBox1.addItem(rs.getString(1));
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }  
            
    }
    public void LoadDestinyPlace(JComboBox jComboBox1)
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/railway", "root", "");
            String sql="Select distinct(aplace) from train";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            jComboBox1.removeAllItems();
            while(rs.next())
            {
                jComboBox1.addItem(rs.getString(1));
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }  
            
    }
    public boolean AddTrain(String tno,String tname,Date ddate,Date adate,Time dtime, Time atime,String dplace, String aplace, int price,int seat_avail){
           try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/railway", "root", "");
            String sql="INSERT INTO `train`(`tno`, `tname`, `ddate`, `adate`, `dtime`, `atime`, `dplace`, `aplace`, `price`, `avail_seat`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,tno);
            pst.setString(2,tname);
            pst.setDate(3,ddate);
            pst.setDate(4,adate);
            pst.setTime(5,dtime);
            pst.setTime(6,atime);
            pst.setString(7, dplace);
            pst.setString(8, aplace);
            pst.setInt(9, price);
            pst.setInt(10, seat_avail);
            if(pst.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null,"TRAIN DETALS ADDED SUCCESSFULLY");
                return true;
            }
            else{
                return false;
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }  
        return false;
    }

    public void fillClientJTable(JTable table)
    {
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/railway", "root", "");
            String sql="Select * from train";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            Object[] row;
            while(rs.next())
            {
                row = new Object[10];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getDate(3);
                row[3] = rs.getDate(4);
                row[4] = rs.getTime(5);
                row[5] = rs.getTime(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                row[8] = rs.getInt(9);
                row[9] = rs.getInt(10);
                
                tableModel.addRow(row);
                
            }
           
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
    public void search(JTable table,JComboBox dplace,JComboBox aplace,String d_date)
    {
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/railway", "root", "");
            String sql="SELECT * FROM `train` WHERE `dplace`=? AND `aplace`=? AND `ddate`=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setObject(1, dplace.getSelectedItem());
            pst.setObject(2, aplace.getSelectedItem());
            pst.setString(3, d_date);
            ResultSet rs=pst.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            Object[] row;
            int k=0;
            while(rs.next())
            {
                k=1;
                row = new Object[10];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getDate(3);
                row[3] = rs.getDate(4);
                row[4] = rs.getTime(5);
                row[5] = rs.getTime(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                row[8] = rs.getInt(9);
                row[9] = rs.getInt(10);
                tableModel.addRow(row);

            }
            con.close();
            if(k==0)
            {
                JOptionPane.showMessageDialog(null, "SORRY FOR THE INCONVENIENCE!!!\n NO TRAIN IS AVAILABLE");
            }     
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        all_avail = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        destiny_place = new javax.swing.JComboBox<>();
        start_date = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        start_place = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        add = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("START PLACE:");

        jScrollPane4.setViewportView(jTree1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TRAIN NO.", "TRAIN NAME", "DEPARTURE DATE", "ARRIVAL DATE", "DEPARTURE TIME", "ARRIVAL TIME", "START PLACE", "DESTINY PLACE", "PRICE", "SEAT_AVAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        all_avail.setBackground(new java.awt.Color(0, 102, 102));
        all_avail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        all_avail.setForeground(new java.awt.Color(255, 255, 255));
        all_avail.setText("ALL AVAILABLE TRAIN");
        all_avail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                all_availMouseClicked(evt);
            }
        });
        all_avail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                all_availActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHECK AVAILABILTY");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("START PLACE:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("DESTINY PLACE:");

        search.setBackground(new java.awt.Color(0, 102, 102));
        search.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        destiny_place.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        destiny_place.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destiny_placeActionPerformed(evt);
            }
        });

        start_date.setDateFormatString("yyyy-MM-dd");
        start_date.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        start_date.setMaxSelectableDate(new java.util.Date(4102428676000L));
        start_date.setMinSelectableDate(new java.util.Date(1634326276000L));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("DEPARTURE DATE:");

        start_place.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        start_place.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_placeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(start_place, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(destiny_place, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(start_date, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(all_avail)
                .addGap(392, 392, 392))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(all_avail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(destiny_place, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel3)
                        .addComponent(start_place, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(start_date, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("RAILWAY RESERVATION SYSTEM");

        add.setBackground(new java.awt.Color(0, 102, 102));
        add.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("HOME");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(158, 158, 158))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void all_availActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_all_availActionPerformed
        
    }//GEN-LAST:event_all_availActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        jTable1.setModel(new DefaultTableModel(null, new String[]{"TRAIN NO.","TRAIN NAME","DEPARTURE DATE","ARRIVAL DATE","DEPARTURE TIME","ARRIVAL TIME","START PLACE","DESTINY PLACE","PRICE","SEAT_AVAIL"}));
        if(start_date.getDate() == null||start_place.getSelectedItem().equals("")||destiny_place.getSelectedItem().equals("")) {
           JOptionPane.showMessageDialog(null, "Enter all details");
        }
        else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String d_date= sdf.format(start_date.getDate());
            search(jTable1,start_place,destiny_place,d_date);
        }
       
    }//GEN-LAST:event_searchActionPerformed

    private void destiny_placeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destiny_placeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destiny_placeActionPerformed

    private void all_availMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_all_availMouseClicked
        jTable1.setModel(new DefaultTableModel(null, new String[]{"TRAIN NO.","TRAIN NAME","DEPARTURE DATE","ARRIVAL DATE","DEPARTURE TIME","ARRIVAL TIME","START PLACE","DESTINY PLACE","PRICE","SEAT_AVAIL"}));
        fillClientJTable(jTable1);
    }//GEN-LAST:event_all_availMouseClicked

    private void start_placeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_placeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_start_placeActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        this.toBack();
        setVisible(false);
        new Home().toFront();
        new Home().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_addActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        boolean a=jTable1.isEditing();
        if (a==false)
        {
            JOptionPane.showMessageDialog(null, "YOU CANNOT EDIT THE TABLE");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        boolean a=jTable1.isEditing();
        if (a==false)
        {
            JOptionPane.showMessageDialog(null, "YOU CANNOT EDIT THE TABLE");
        }
    }//GEN-LAST:event_jTable1KeyPressed

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
            java.util.logging.Logger.getLogger(avail_check.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(avail_check.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(avail_check.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(avail_check.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new avail_check().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    private javax.swing.JButton all_avail;
    private javax.swing.JComboBox<String> destiny_place;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton search;
    private com.toedter.calendar.JDateChooser start_date;
    private javax.swing.JComboBox<String> start_place;
    // End of variables declaration//GEN-END:variables
}
