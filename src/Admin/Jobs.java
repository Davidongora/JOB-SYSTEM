/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Jobs extends javax.swing.JFrame {

   // private int JobsId;
   // private String title;
    

    /**
     * Creates new form Admin
     */
    public Jobs() {
        initComponents();
        
    // Connect to the database
     try {
            // TODO add your handling code here:
            // Get the values entered by the user in the text fields
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
           try {
    // Define the database connection URL
    String url = "jdbc:mysql://localhost:3306/desktop";
    String dbUsername = "root";
    String dbPassword = "";

    // Define the SQL SELECT statement
    String sql = "SELECT JobsId, title, company, location, duration, salary FROM jobs";

    // Try to establish a database connection and execute the SELECT statement
    try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        // Create a new DefaultTableModel to hold the data for the JTable
        DefaultTableModel model = new DefaultTableModel();

        // Add the column names to the model
        model.addColumn("JobsId");
        model.addColumn("title");
        model.addColumn("Company");
        model.addColumn("location");
        model.addColumn("duration");
        model.addColumn("salary");
        
       

        // Iterate over the ResultSet and add the data to the model
        while (rs.next()) {
            int JobsId = rs.getInt("JobsId");
            String name = rs.getString("title");
            String company = rs.getString("Company");
            String location = rs.getString("location");
            int duration = rs.getInt("duration");
            int salary = rs.getInt("salary");
            
            //String company = rs.getString("company");
            
            
           
            

            model.addRow(new Object[]{JobsId, name, company, location, duration, salary});
        }

        // Set the model for the JTable
        AdminT.setModel(model);
    }
} catch (SQLException e) {
// Handle any errors that occur while executing the SELECT statement
            //, "Error: " +, "Error",JOptionPane.ERROR_MESSAGE);
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
        Add = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        AdminT = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Show = new javax.swing.JButton();
        Update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        Add.setBackground(new java.awt.Color(0, 0, 153));
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setText("Add");
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(0, 0, 153));
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
        });

        Close.setBackground(new java.awt.Color(0, 0, 153));
        Close.setForeground(new java.awt.Color(255, 255, 255));
        Close.setText("Close");
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        AdminT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "JobsId", "Title", "Company", "Location", "Salary", "Duration"
            }
        ));
        jScrollPane1.setViewportView(AdminT);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("JOBS RECORD");

        Show.setBackground(new java.awt.Color(0, 0, 153));
        Show.setForeground(new java.awt.Color(255, 255, 255));
        Show.setText("Show");
        Show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowMouseClicked(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(Show)
                                .addGap(26, 26, 26)
                                .addComponent(Update)
                                .addGap(18, 18, 18)
                                .addComponent(Add)
                                .addGap(26, 26, 26)
                                .addComponent(Delete))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(Close)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Show)
                    .addComponent(Update)
                    .addComponent(Add)
                    .addComponent(Delete))
                .addGap(18, 18, 18)
                .addComponent(Close)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        // TODO add your handling code here:
        this.dispose();
        
        Home homeframe = new Home();
        homeframe.setVisible(true);
    }//GEN-LAST:event_CloseMouseClicked

    private void ShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            // Get the values entered by the user in the text fields
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }

                                               
    try {
        // Define the database connection URL
        String url = "jdbc:mysql://localhost:3306/desktop";
        String username = "root";
        String password = "";

        // Define the SQL SELECT statement
        String sql = "SELECT * FROM jobs";

        // Try to establish a database connection and execute the SELECT statement
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            // Remove all existing rows from the table model
            DefaultTableModel model = (DefaultTableModel) AdminT.getModel();
            model.setRowCount(0);

            // Loop through the result set and add each row to the table model
            while (rs.next()) {
                Object[] row = new Object[] {
                    rs.getInt("JobsId"),
                    rs.getString("title"),
                    rs.getString("company"),
                    rs.getString("location"),
                     rs.getInt("duration"),
                     rs.getInt("salary")
                   // rs.getInt("JobsId")
                        
                };
                model.addRow(row);
            }

            // Show a message to indicate that the refresh was successful
            JOptionPane.showMessageDialog(this, "Table refreshed successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException e) {
        // Handle any errors that occur while executing the SELECT statement
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }


        
        
        
    }//GEN-LAST:event_ShowMouseClicked

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        // TODO add your handling code here:
        this.dispose();
        
        DeleteJobs DeleteAdmin = new DeleteJobs();
        DeleteAdmin.setVisible(true);
               
    }//GEN-LAST:event_UpdateMouseClicked

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        // TODO add your handling code here:
        AddJobs AddJobs = new AddJobs();
        AddJobs.setVisible(true);
        
        
    }//GEN-LAST:event_AddMouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        // TODO add your handling code here:
        DeleteJobs delframe= new DeleteJobs();
        delframe.setVisible(true);
    }//GEN-LAST:event_DeleteMouseClicked

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
            java.util.logging.Logger.getLogger(Jobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jobs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jobs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTable AdminT;
    private javax.swing.JButton Close;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Show;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private static class S {

        private int ERROR_MESSAGE;

        public S() {
        }
    }

    private static class nameField {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void setText(String name) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public nameField() {
        }
    }

    private static class locationField {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public locationField() {
        }
    }

    private static class idNoField {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void setText(String id) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public idNoField() {
        }
    }

    private static class passwordField {

        private static void setText(String password) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public passwordField() {
        }
    }

    private static class genderTextField {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public genderTextField() {
        }
    }

    private static class locationTextField {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public locationTextField() {
        }
    }

    private static class idNoTextField {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public idNoTextField() {
        }
    }
}
