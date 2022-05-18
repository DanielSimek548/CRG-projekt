/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package správaskriniek;

import java.awt.PopupMenu;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

//import com.mysql.jdbc.Connection;
/**
 *
 * @author simek
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    Connection con = null;
    PreparedStatement pst = null;
    Statement stmt = null;
    ResultSet rs = null;
    String query = "INSERT INTO `sekciaa` (name, surname, class, number) VALUES (?, ?, ?, ?);";
    String delete = "DELETE FROM `skrinky`.`sekciaa` WHERE `number`=?;";

    public GUI() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtClass = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lockerNumber = new javax.swing.JTextField();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("School locker management system");
        setResizable(false);

        jLabel2.setText("Surname");

        jLabel3.setText("Classroom");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Name");

        jLabel5.setText("Locker number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSurname)
                            .addComponent(txtClass)
                            .addComponent(txtName)
                            .addComponent(lockerNumber))))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lockerNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton)
                    .addComponent(UpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(SearchButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ClearButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
        txtClass.setText("");
        txtName.setText("");
        txtSurname.setText("");
        lockerNumber.setText("");
        //Vymaže vyplnené riadky
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed

        String name = JOptionPane.showInputDialog(rootPane, "Type number of locker you want to delete");
        //Vyskakovanie okno, ktoré sa pýta aké skrinka sa má vymazať

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/skrinky", "root", "");
            stmt = con.createStatement();
            String selectNumber = "SELECT number FROM `skrinky`.`sekciaa` WHERE `number`=" + name + ";";
            rs = stmt.executeQuery(selectNumber);

            rs.next();
            String fname = rs.getString("number");
            //System.out.print(fname);

            if (fname != "0") {
                try {
                    //con = DriverManager.getConnection("jdbc:mysql://localhost/skrinky", "root", "");
                    pst = con.prepareStatement(delete);
                    pst.setString(1, name);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Vymazany lol");

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Neymazany lol");
        }


    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed

        try {
            String idk = lockerNumber.getText();
            con = DriverManager.getConnection("jdbc:mysql://localhost/skrinky", "root", "");
            stmt = con.createStatement();
            String select = "SELECT * FROM `skrinky`.`sekciaa` WHERE  `number`=" + idk + ";";
            rs = stmt.executeQuery(select);

            rs.next();
            String jName = rs.getString("name");
            String jSurname = rs.getString("surname");
            String jClass = rs.getString("class");
            //Zapíše výsledky z sql do stringu 
            
            String tName = txtName.getText();
            String tSurname = txtSurname.getText();
            String tClass = txtClass.getText();
            //Zapíše vyplnené riadky do stringu 

            txtClass.setText("");
            txtName.setText("");
            txtSurname.setText("");
            lockerNumber.setText("");

            String updateN = "UPDATE `skrinky`.`sekciaa` SET `name`='" + tName + "' WHERE  `number`=" + idk + ";";
            pst = con.prepareStatement(updateN);
            pst.executeUpdate();
            //Update mena

            String updateS = "UPDATE `skrinky`.`sekciaa` SET `surname`='" + tSurname + "' WHERE  `number`=" + idk + ";";
            pst = con.prepareStatement(updateS);
            pst.executeUpdate();
            //Update priezviska

            String updateC = "UPDATE `skrinky`.`sekciaa` SET `class`='" + tClass + "' WHERE  `number`=" + idk + ";";
            pst = con.prepareStatement(updateC);
            pst.executeUpdate();
            //Update čísla skrinky

            JOptionPane.showMessageDialog(null, "Zmena uspesna lol");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Skrinka sa nepouziva lol");
        }

    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed

        try {
            String idk = lockerNumber.getText();
            con = DriverManager.getConnection("jdbc:mysql://localhost/skrinky", "root", "");
            stmt = con.createStatement();
            String selectNumber = "SELECT number FROM `skrinky`.`sekciaa` WHERE  `number`=" + idk + ";";
            rs = stmt.executeQuery(selectNumber);

            rs.next();
            String fname = rs.getString("number");
            //Kontrola či skrinka už existuje

            txtClass.setText("");
            txtName.setText("");
            txtSurname.setText("");
            lockerNumber.setText("");

            if (fname != "0") {
                JOptionPane.showMessageDialog(null, "Neregistrovany lol");
                //Ak select najde aspoň jeden výsledok tak nezaregistruje skrinku pretože sa používa
            }
        } catch (Exception ex) {
            //Ak skrinka neexistuje tak využije fukciu, kt. ju zapíše
            Pridaj();
        }

    }//GEN-LAST:event_AddButtonActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
        try {
            String idk = lockerNumber.getText();
            con = DriverManager.getConnection("jdbc:mysql://localhost/skrinky", "root", "");
            stmt = con.createStatement();
            String selectNumber = "SELECT * FROM `skrinky`.`sekciaa` WHERE `number`=" + idk + ";";
            rs = stmt.executeQuery(selectNumber);
            //Vyhľadá všetko s daným číslom skrinky

            rs.next();
            
            String jName = rs.getString("name");
            String jSurname = rs.getString("surname");
            String jClass = rs.getString("class");
            //Zapíše výsledky z sql do stringu 
            
            txtClass.setText(jClass);
            txtName.setText(jName);
            txtSurname.setText(jSurname);
            //Zapíše výsledky do labelov

            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Skrinka sa nepouziva lol");
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    public void Pridaj() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/skrinky", "root", "");
            pst = con.prepareStatement(query);
            pst.setString(1, txtName.getText());
            pst.setString(2, txtSurname.getText());
            pst.setString(3, txtClass.getText());
            pst.setString(4, lockerNumber.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registrovany lol");
            //Všetko čo je zapísané v label zapíše do databázy

            txtClass.setText("");
            txtName.setText("");
            txtSurname.setText("");
            lockerNumber.setText("");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lockerNumber;
    private javax.swing.JTextField txtClass;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
