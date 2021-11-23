package railway_reservation;

import java.sql.*;
import javax.swing.*;
import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author archa
 */
public class cancel_display extends javax.swing.JFrame {
    public static int seat_avail;
    /**
     * Creates new form display
     */
    public cancel_display() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void seat_availability(String tno)
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/railway", "root", "");
            String sql="SELECT `avail_seat` FROM `train` WHERE `tno` =?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,tno);
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                seat_avail=rs.getInt(1);
            }
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        if(seat_avail>0)
        {
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/railway", "root", "");    
                String b="UPDATE `train` SET `avail_seat`=? WHERE `tno` =?";
                PreparedStatement pst=con.prepareStatement(b);
                seat_avail=seat_avail+1;
                pst.setInt(1, seat_avail);
                pst.setString(2,tno);
                pst.executeUpdate();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
        else
        {
            seat_avail=+1;
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

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pass_name1 = new javax.swing.JLabel();
        pass_name = new javax.swing.JTextField();
        ticket_no1 = new javax.swing.JLabel();
        ticket_no = new javax.swing.JTextField();
        CANCEL = new javax.swing.JButton();
        display_button = new javax.swing.JButton();
        home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("RAILWAY RESERVATION SYSTEM");

        pass_name1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pass_name1.setForeground(new java.awt.Color(255, 255, 255));
        pass_name1.setText("PASSENGERS NAME:");

        pass_name.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        pass_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_nameActionPerformed(evt);
            }
        });

        ticket_no1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ticket_no1.setForeground(new java.awt.Color(255, 255, 255));
        ticket_no1.setText("TICKET NUMBER:");

        ticket_no.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ticket_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticket_noActionPerformed(evt);
            }
        });

        CANCEL.setBackground(new java.awt.Color(0, 102, 102));
        CANCEL.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        CANCEL.setForeground(new java.awt.Color(255, 255, 255));
        CANCEL.setText("CANCEL");
        CANCEL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELActionPerformed(evt);
            }
        });

        display_button.setBackground(new java.awt.Color(0, 102, 102));
        display_button.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        display_button.setForeground(new java.awt.Color(255, 255, 255));
        display_button.setText("DISPLAY");
        display_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        display_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                display_buttonMouseClicked(evt);
            }
        });
        display_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_buttonActionPerformed(evt);
            }
        });

        home.setBackground(new java.awt.Color(0, 102, 102));
        home.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("HOME");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pass_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pass_name, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ticket_no1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ticket_no, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CANCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(display_button, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_name))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ticket_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ticket_no1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CANCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(display_button, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pass_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass_nameActionPerformed

    private void ticket_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticket_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ticket_noActionPerformed

    private void CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELActionPerformed
        String tic_no=ticket_no.getText();
        String passName= pass_name.getText();
        String x;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/railway", "root", "");
            String sql1="SELECT  `train_no`  FROM `pass_list` WHERE `ticket_no`=?";
            PreparedStatement pst1=con.prepareStatement(sql1);
            pst1.setString(1,tic_no);
            ResultSet rs=pst1.executeQuery();    
            if(rs.next())
            {
                x = rs.getString(1);
                seat_availability(x);
            }      
            String sql="DELETE FROM `pass_list` WHERE `ticket_no`=? AND `pass_name`=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,tic_no);
            pst.setString(2, passName);
            if(pst.executeUpdate()>0)
            {
                JOptionPane.showMessageDialog(null,"TICKET NO: "+tic_no+"\nPASSENGER NAME: "+passName+"\nIS CANCELLED SUCCESSFULLY");
            }
            else{
                JOptionPane.showMessageDialog(null,"CANCELLATION FAILED. THE TICKET NUMBER IS NOT FOUND");
            }
            ticket_no.setText("");
            pass_name.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"TRAIN DETAILS IS NOT updated SUCCESSFULLY");
            JOptionPane.showMessageDialog(null, e);
        }  
        
    }//GEN-LAST:event_CANCELActionPerformed

    private void display_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_buttonActionPerformed
        this.hide();
        display i=new display();
        String tic_no=ticket_no.getText();
        String passName= pass_name.getText();
        String TN=null;
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/railway", "root", "");
            String sql="SELECT * FROM `pass_list` WHERE `ticket_no`=? AND `pass_name`=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,tic_no);
            pst.setString(2, passName);
            ResultSet rs=pst.executeQuery();
            if(rs.next()==true)
            {
                i.tic_no.setText(rs.getString(1)); 
                i.pass_name.setText(rs.getString(2));
                i.pass_age.setText(rs.getString(3));
                i.seat_no.setText(rs.getString(4));
                TN=rs.getString(5);
                i.t_no.setText(TN);
                i.t_name.setText(rs.getString(6));
                i.ph_no.setText(rs.getString(7));
                String a="SELECT * FROM `train` WHERE `tno`=?";
                PreparedStatement b=con.prepareStatement(a);
                b.setString(1,TN);
                ResultSet c=b.executeQuery();
                while(c.next()==true)
                {
                    i.d_date.setText(c.getString(3));
                    i.a_date.setText(c.getString(4));
                    i.d_time.setText(c.getString(5));
                    i.a_time.setText(c.getString(6));
                    i.d_place.setText(c.getString(7));
                    i.a_place.setText(c.getString(8));
                }  
                i.setVisible(true);
                i.toFront();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "SORRY !!! TICKET IS NOT FOUND");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "ERROR IN PASS_LIST DB");
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_display_buttonActionPerformed

    private void display_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_display_buttonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_display_buttonMouseClicked

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        this.toBack();
        setVisible(false);
        new Home().toFront();
        new Home().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_homeActionPerformed

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
            java.util.logging.Logger.getLogger(cancel_display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cancel_display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cancel_display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cancel_display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cancel_display().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton CANCEL;
    public javax.swing.JButton display_button;
    public javax.swing.JButton home;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pass_name;
    private javax.swing.JLabel pass_name1;
    private javax.swing.JTextField ticket_no;
    private javax.swing.JLabel ticket_no1;
    // End of variables declaration//GEN-END:variables
}