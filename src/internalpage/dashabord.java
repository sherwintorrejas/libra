/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalpage;

import CONFIG.DBCONNECTOR;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class dashabord extends javax.swing.JInternalFrame {
private Connection con;
    /**
     * Creates new form dashabord
     */
    public dashabord() {
        initComponents();
        displayData();
        displayData1();
        nstudent();
          this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
    }
  public void displayData(){
        try{
       
            DBCONNECTOR dbc = new DBCONNECTOR();
            ResultSet rs = dbc.getData("SELECT * FROM student_details");
            studentdet.setModel(DbUtils.resultSetToTableModel(rs));
       
        }catch(SQLException ex){
            System.out.println("Error Message: "+ex);
       
        }
    
     }
  
  public void displayData1(){
        try{
       
            DBCONNECTOR dbc = new DBCONNECTOR();
            ResultSet rs = dbc.getData("SELECT * FROM book_details");
            BOOKDET.setModel(DbUtils.resultSetToTableModel(rs));
       
        }catch(SQLException ex){
            System.out.println("Error Message: "+ex);
       
        }
    
     }
  public void nstudent(){
  PreparedStatement st = null;
 ResultSet rs = null;
  
  long l = System.currentTimeMillis();
  Date todaydate = new Date(l);
  
      try {
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ba", "root", "");
          st = con.prepareStatement("SELECT COUNT(*) FROM student_details");
           rs = st.executeQuery();
          while (rs.next()){
              int count = rs.getInt(1);
              
          nstudents.setText(String.valueOf(count));  
          }
           st = con.prepareStatement("SELECT COUNT(*) FROM book_details");
           rs = st.executeQuery();
           while (rs.next()){
              int count = rs.getInt(1);
              
          nbook.setText(String.valueOf(count));  
          }
           st = con.prepareStatement("SELECT COUNT(*) FROM issue_book_details where STATUS = '"+"PENDING"+"'");
           rs = st.executeQuery();
           while (rs.next()){
              int count = rs.getInt(1);
              
          isbook.setText(String.valueOf(count));  
          }
            st = con.prepareStatement("SELECT COUNT(*) FROM issue_book_details where DUE < '"+todaydate+"' and STATUS = '"+"PENDING"+"'");
           rs = st.executeQuery();
           while (rs.next()){
              int count = rs.getInt(1);
              
            nviolators.setText(String.valueOf(count));  
          }
      } catch (Exception e) {
      e.printStackTrace();
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nbook = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nstudents = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        isbook = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        nviolators = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentdet = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        BOOKDET = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        isbook1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 51, 0));
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 10));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NO. OF BOOKS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        nbook.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        nbook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(nbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 150, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 150, 110));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(153, 51, 0));
        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 10));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NO. OF STUDENTS");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 170, 50));

        nstudents.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        nstudents.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(nstudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 160, 70));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, 110));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setForeground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(153, 51, 0));
        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 10));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ISSUED BOOKS");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 170, 50));

        isbook.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        isbook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(isbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 160, 70));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 160, 110));

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8.setForeground(new java.awt.Color(153, 153, 153));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(153, 51, 0));
        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 10));

        nviolators.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        nviolators.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(nviolators, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 160, 70));

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("NO. OF VIOLATORS");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 50));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, 110));

        jScrollPane2.setViewportView(studentdet);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 760, 110));

        jScrollPane1.setViewportView(BOOKDET);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 760, 130));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("BOOK DETAILS");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 170, 40));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("STUDENT DETAILS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 170, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/photo-1568667256549-094345857637.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 530));

        isbook1.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        isbook1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(isbook1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 140, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BOOKDET;
    private javax.swing.JLabel isbook;
    private javax.swing.JLabel isbook1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nbook;
    private javax.swing.JLabel nstudents;
    private javax.swing.JLabel nviolators;
    private javax.swing.JTable studentdet;
    // End of variables declaration//GEN-END:variables
}
