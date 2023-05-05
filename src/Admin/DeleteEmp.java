/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class DeleteEmp extends javax.swing.JFrame {

    private Component deleteFrame;

    /**
     * Creates new form AddAdmin
     */
    public DeleteEmp() {
        initComponents();
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
        Gender = new javax.swing.JLabel();
        IdNo = new javax.swing.JLabel();
        Namef = new javax.swing.JTextField();
        Genderf = new javax.swing.JTextField();
        IdNof = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        DELETE = new javax.swing.JButton();
        Update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Gender.setForeground(new java.awt.Color(255, 255, 255));
        Gender.setText("Gender");

        IdNo.setForeground(new java.awt.Color(255, 255, 255));
        IdNo.setText("IdNo");

        Namef.setForeground(new java.awt.Color(255, 255, 255));

        Genderf.setForeground(new java.awt.Color(255, 255, 255));

        IdNof.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Delete/Update Admin");

        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("Name");

        DELETE.setBackground(new java.awt.Color(0, 0, 153));
        DELETE.setForeground(new java.awt.Color(255, 255, 255));
        DELETE.setText("DELETE");
        DELETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DELETEMouseClicked(evt);
            }
        });

        Update.setBackground(new java.awt.Color(0, 0, 153));
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Name)
                                    .addComponent(Gender)
                                    .addComponent(IdNo))
                                .addGap(99, 99, 99)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Namef)
                                    .addComponent(Genderf)
                                    .addComponent(IdNof, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel1)))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(DELETE)
                        .addGap(103, 103, 103)
                        .addComponent(Update)
                        .addGap(73, 73, 73))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(Namef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender)
                    .addComponent(Genderf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdNo)
                    .addComponent(IdNof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DELETE)
                    .addComponent(Update))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DELETEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DELETEMouseClicked
        // TODO add your handling code here:
         // TODO add your handling code here:
        
         try {
            // TODO add your handling code here:
            // Get the values entered by the user in the text fields
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }

        
         // Get the values entered by the user in the text fields
    String name = Namef.getText();
    //String Gender =Genderf.getText();
    //String password = Passwordf.getText();\
    String id =IdNof.getText();

    // Define the database connection URL
    String url = "jdbc:mysql://localhost:3306/desktop";
    String dbUsername = "root";
    String dbPassword = "";

    // Define the SQL SELECT statement
    // Construct the SQL statement to delete the record
    //String sql = "DELETE FROM admin WHERE id = ?";
    String sql = "Delete FROM admin WHERE name=? AND IdNo=?";
//String sql = "DELETE FROM admin WHERE name=? AND IdNo=? AND password=? AND gender=?";

    
    // Try to establish a database connection and execute the SELECT statement
    try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        // Set the parameter values for the DELETE statement
        stmt.setString(1, name);
        stmt.setString(2, id);
        
       // stmt.setString(2, password);
                //stmt.setString(2, Gender);


        // Execute the DELETE statement and get the number of rows affected
        int numRowsAffected = stmt.executeUpdate();

        // Check if any rows were deleted
        if (numRowsAffected > 0) {
            // Deletion successful
            JOptionPane.showMessageDialog(this, "Record deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
         this.dispose();
         // Open the main frame
            Home mainFrame = new Home();
            mainFrame.setVisible(true);
         
        } else {
            // No rows deleted
            JOptionPane.showMessageDialog(this, "Record not found or could not be deleted.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        // Handle any errors that occur while executing the DELETE statement
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
  
    }
    


    }//GEN-LAST:event_DELETEMouseClicked

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        // TODO add your handling code here:
        
         // TODO add your handling code here:
        
         try {
            // TODO add your handling code here:
            // Get the values entered by the user in the text fields
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }

        
         // Get the values entered by the user in the text fields
    String name = Namef.getText();
    String gender =Genderf.getText();
    String id =IdNof.getText();
   // String password = Passwordf.getText();

    // Define the database connection URL
    String url = "jdbc:mysql://localhost:3306/desktop";
    String dbUsername = "root";
    String dbPassword = "";

    // Define the SQL UPDATE statement
String sql = "UPDATE admin SET name=?, gender=? WHERE IdNo=?";

// Try to establish a database connection and execute the UPDATE statement
try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
     PreparedStatement stmt = conn.prepareStatement(sql)) {

    // Set the parameter values for the UPDATE statement
    stmt.setString(1, name);
   // stmt.setString(2, password);
    stmt.setString(2, gender);
    stmt.setString(3, id);

    // Execute the UPDATE statement and get the number of rows affected
    int numRowsAffected = stmt.executeUpdate();

    // Check if any rows were updated
    if (numRowsAffected > 0) {
        // Update successful
        JOptionPane.showMessageDialog(this, "Record updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else {
        // No rows updated
        JOptionPane.showMessageDialog(this, "Record not found or could not be updated.", "Error", JOptionPane.ERROR_MESSAGE);
    }
} catch (SQLException e) {
    // Handle any errors that occur while executing the UPDATE statement
    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
        
    }//GEN-LAST:event_UpdateMouseClicked

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
            java.util.logging.Logger.getLogger(DeleteEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteEmp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DeleteEmp().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DELETE;
    private javax.swing.JLabel Gender;
    private javax.swing.JTextField Genderf;
    private javax.swing.JLabel IdNo;
    private javax.swing.JTextField IdNof;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField Namef;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private static class idField {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public idField() {
        }
    }

}
