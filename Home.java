/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package railway_reservation;

/**
 *
 * @author archa
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ADD4 = new javax.swing.JButton();
        ADD8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        book = new javax.swing.JButton();
        check_avail = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        display = new javax.swing.JButton();
        log_out = new javax.swing.JButton();
        pass_list = new javax.swing.JButton();
        ADD_train = new javax.swing.JButton();

        ADD4.setBackground(new java.awt.Color(0, 102, 102));
        ADD4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ADD4.setForeground(new java.awt.Color(255, 255, 255));
        ADD4.setText("ADD");
        ADD4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ADD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD4ActionPerformed(evt);
            }
        });

        ADD8.setBackground(new java.awt.Color(0, 102, 102));
        ADD8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        ADD8.setForeground(new java.awt.Color(255, 255, 255));
        ADD8.setText("ADD");
        ADD8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ADD8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD8ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("RAILWAY RESERVATION SYSTEM");

        welcome.setBackground(new java.awt.Color(0, 102, 102));
        welcome.setFont(new java.awt.Font("Rosewood Std Regular", 0, 36)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome.setText("welcome   admin");

        book.setBackground(new java.awt.Color(0, 102, 102));
        book.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        book.setForeground(new java.awt.Color(255, 255, 255));
        book.setText("BOOK TICKET");
        book.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });

        check_avail.setBackground(new java.awt.Color(0, 102, 102));
        check_avail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        check_avail.setForeground(new java.awt.Color(255, 255, 255));
        check_avail.setText("CHECK AVAILABILITY");
        check_avail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check_avail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_availActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(0, 102, 102));
        cancel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("CANCEL TICKET");
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        display.setBackground(new java.awt.Color(0, 102, 102));
        display.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        display.setForeground(new java.awt.Color(255, 255, 255));
        display.setText("DISPLAY  TICKET");
        display.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        log_out.setBackground(new java.awt.Color(0, 102, 102));
        log_out.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        log_out.setForeground(new java.awt.Color(255, 255, 255));
        log_out.setText("LOG OUT");
        log_out.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_outActionPerformed(evt);
            }
        });

        pass_list.setBackground(new java.awt.Color(0, 102, 102));
        pass_list.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pass_list.setForeground(new java.awt.Color(255, 255, 255));
        pass_list.setText("PASSENGERS LIST");
        pass_list.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pass_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_listActionPerformed(evt);
            }
        });

        ADD_train.setBackground(new java.awt.Color(0, 102, 102));
        ADD_train.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ADD_train.setForeground(new java.awt.Color(255, 255, 255));
        ADD_train.setText("ADD  TRAIN");
        ADD_train.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ADD_train.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD_trainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(ADD_train, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pass_list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(check_avail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                    .addComponent(welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check_avail, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADD_train, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_list, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void check_availActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_availActionPerformed
        this.toBack();
        avail_check i=new avail_check();
        i.setVisible(true);
        i.toFront();
    }//GEN-LAST:event_check_availActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.toBack();
        cancel_display i=new cancel_display();
        i.display_button.hide();
        i.setVisible(true);
        i.toFront();
    }//GEN-LAST:event_cancelActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        this.toBack();
        cancel_display i=new cancel_display();
        i.CANCEL.hide();
        i.setVisible(true);
        i.toFront();
    }//GEN-LAST:event_displayActionPerformed

    private void ADD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADD4ActionPerformed

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        Login n=new Login();
        this.dispose();
        n.setVisible(true);
        
    }//GEN-LAST:event_log_outActionPerformed

    private void pass_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_listActionPerformed
        this.toBack();
        pass_list i=new pass_list();
        i.setVisible(true);
        i.toFront();
    }//GEN-LAST:event_pass_listActionPerformed

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        this.toBack();
        book_ticket i=new book_ticket();
        i.setVisible(true);
        i.toFront();
    }//GEN-LAST:event_bookActionPerformed

    private void ADD8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADD8ActionPerformed

    private void ADD_trainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD_trainActionPerformed
        Add_train g=new Add_train();
        this.hide();
        g.setVisible(true);
    }//GEN-LAST:event_ADD_trainActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD4;
    private javax.swing.JButton ADD8;
    public javax.swing.JButton ADD_train;
    private javax.swing.JButton book;
    private javax.swing.JButton cancel;
    private javax.swing.JButton check_avail;
    private javax.swing.JButton display;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton log_out;
    public javax.swing.JButton pass_list;
    public javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
