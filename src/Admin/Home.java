/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;

/**
 *
 * @author user
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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
        companies = new javax.swing.JButton();
        Applicants = new javax.swing.JButton();
        Categories = new javax.swing.JButton();
        Jobs = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Employees = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        Admins = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        companies.setBackground(new java.awt.Color(0, 0, 153));
        companies.setForeground(new java.awt.Color(255, 255, 255));
        companies.setText("Companies");
        companies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                companiesMouseClicked(evt);
            }
        });

        Applicants.setBackground(new java.awt.Color(0, 0, 153));
        Applicants.setForeground(new java.awt.Color(255, 255, 255));
        Applicants.setText("Applicants");
        Applicants.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApplicantsMouseClicked(evt);
            }
        });

        Categories.setBackground(new java.awt.Color(0, 0, 153));
        Categories.setForeground(new java.awt.Color(255, 255, 255));
        Categories.setText("Categories");
        Categories.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CategoriesMouseClicked(evt);
            }
        });

        Jobs.setBackground(new java.awt.Color(0, 0, 153));
        Jobs.setForeground(new java.awt.Color(255, 255, 255));
        Jobs.setText("Jobs");
        Jobs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JobsMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admins Dashboard");

        Employees.setBackground(new java.awt.Color(0, 0, 153));
        Employees.setForeground(new java.awt.Color(255, 255, 255));
        Employees.setText("Employees");
        Employees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeesMouseClicked(evt);
            }
        });

        LogOut.setBackground(new java.awt.Color(204, 0, 0));
        LogOut.setForeground(new java.awt.Color(255, 255, 255));
        LogOut.setText("LogOut");
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
        });

        Admins.setBackground(new java.awt.Color(0, 0, 153));
        Admins.setForeground(new java.awt.Color(255, 255, 255));
        Admins.setText("Admins");
        Admins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(companies)
                    .addComponent(Employees))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jobs, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Admins, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Categories, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Applicants))
                        .addGap(47, 47, 47))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(companies)
                    .addComponent(Applicants)
                    .addComponent(Jobs))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Employees)
                    .addComponent(Categories)
                    .addComponent(Admins))
                .addGap(49, 49, 49)
                .addComponent(LogOut)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void companiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_companiesMouseClicked
        // TODO add your handling code here:
        // create an instance of the companies frame
Companies compFrame = new Companies();
// show the frame
compFrame.setVisible(true);
// dispose the current frame
this.dispose();
        
    }//GEN-LAST:event_companiesMouseClicked

    private void JobsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JobsMouseClicked
        // TODO add your handling code here:
         // Create a new instance of the Login frame
    Jobs jobsFrame = new Jobs();

    // Set the Login frame to be visible
    jobsFrame.setVisible(true);

    // Close the current frame (assuming it's the main frame of your application)
    this.dispose();
                                  
    }//GEN-LAST:event_JobsMouseClicked

    private void ApplicantsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApplicantsMouseClicked
        // TODO add your handling code here:
         // Create a new instance of the Login frame
    Applicants ApplicantsFrame = new Applicants();

    // Set the Login frame to be visible
    ApplicantsFrame.setVisible(true);

    // Close the current frame (assuming it's the main frame of your application)
    this.dispose();
                                 
        
    }//GEN-LAST:event_ApplicantsMouseClicked

    private void EmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeesMouseClicked
        // TODO add your handling code here:
         // Create a new instance of the Login frame
    Employees EmployeesFrame = new Employees();

    // Set the Login frame to be visible
    EmployeesFrame.setVisible(true);

    // Close the current frame (assuming it's the main frame of your application)
    this.dispose();
                                 
    }//GEN-LAST:event_EmployeesMouseClicked

    private void AdminsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminsMouseClicked
        // TODO add your handling code here:
        Jobs AdminFrame = new Jobs();                              
        AdminFrame.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_AdminsMouseClicked

    private void CategoriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CategoriesMouseClicked
        // TODO add your handling code here:
        Categories catframe = new Categories();
        catframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CategoriesMouseClicked

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
        // TODO add your handling code here:
        this.dispose();
        mainframe mainframe=new mainframe();
        mainframe.setVisible(true);
    }//GEN-LAST:event_LogOutMouseClicked

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
    private javax.swing.JButton Admins;
    private javax.swing.JButton Applicants;
    private javax.swing.JButton Categories;
    private javax.swing.JButton Employees;
    private javax.swing.JButton Jobs;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton companies;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
