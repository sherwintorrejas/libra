/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalpage;
import CONFIG.DBCONNECTOR;
import com.sun.javafx.collections.IntegerArraySyncer;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author User
 */
public class issuebook extends javax.swing.JInternalFrame {
  private Connection connection;
    /**
     * Creates new form issuebook
     */
    public issuebook() {
        initComponents();
          this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
    }
    //get book details
 private void getbookdet(){
 int bookid= Integer.parseInt(isbn.getText());
 try{
  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ba", "root", "");
  PreparedStatement pst = connection.prepareStatement("SELECT * FROM book_details where ISBN =?");
  pst.setInt(1, bookid);
  ResultSet rs = pst.executeQuery();
  
  if(rs.next()){
  i_bn.setText(rs.getString("ISBN"));
  T_TLE.setText(rs.getString("TITTLE"));
  GEN_RE.setText(rs.getString("GENRE"));
  ED_D.setText(rs.getString("EDITION"));
  QUANT.setText(rs.getString("QUANTITY"));
  }else{
  bookerror.setText("INVALID ISBN");
  }
 }catch (SQLException ex){
 ex.printStackTrace();
 
 }
 }
 //get student details
 private void getstudentdet(){
 int sid= Integer.parseInt(studentid.getText());
 try{
  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ba", "root", "");
  PreparedStatement pst = connection.prepareStatement("SELECT * FROM student_details where ID =?");
  pst.setInt(1, sid);
  ResultSet rs = pst.executeQuery();
  
  if(rs.next()){
  id.setText(rs.getString("ID"));
  nme.setText(rs.getString("NAME"));
  lnme.setText(rs.getString("LASTNAME"));
  course.setText(rs.getString("COURSE"));
  yr.setText(rs.getString("YEAR"));
  contact.setText(rs.getString("CONTACT"));
  }else{
  studenterror.setText("INVALID STUDENT ID");
          }
 }catch (SQLException ex){
 ex.printStackTrace();
 }
 }
 //issue book
 public boolean issuebook(){
     boolean isissued = false;
 int bookid= Integer.parseInt(isbn.getText());
  int sid= Integer.parseInt(studentid.getText());
  String bookname= T_TLE.getText();
  String studentname=nme.getText();
  String studentlastname=lnme.getText();
 
  Date uissueddate= ISSUEDATE.getDate();
  Date uduedate=DUEDATE.getDate();
  
  Long l1= uissueddate.getTime();
  long l2=uduedate.getTime();
  
  java.sql.Date sissueddate = new java.sql.Date(l1);
  java.sql.Date sduedate = new java.sql.Date(l2);
  
     try {
     connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ba", "root", "");
     String sql = "insert into issue_book_details(ISBN,TITTLE,ID,NAME,LASTNAME,ISSUED,DUE,STATUS) values(?,?,?,?,?,?,?,?)";
     
     PreparedStatement pst = connection.prepareStatement(sql);
  pst.setInt(1, bookid);
  pst.setString(2, bookname);
  pst.setInt(3, sid);
  pst.setString(4, studentname);
  pst.setString(5, studentlastname);
  pst.setDate(6, sissueddate);
  pst.setDate(7, sduedate);
  pst.setString(8, "PENDING");
  
 
  int rowCount= pst.executeUpdate();
  if(rowCount > 0){
   isissued = true;
  }else{
  isissued = false;
  }
     } catch (Exception e) {
         e.printStackTrace();
     
     }
  return isissued;
 }
 //UPDATE BOOK QUANT
 
 public void updatebookquant(){
 int bookid= Integer.parseInt(isbn.getText());
     try {
          connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ba", "root", "");
          String sql = "update book_details set QUANTITY = QUANTITY - 1 where ISBN =?";
          PreparedStatement pst = connection.prepareStatement(sql);
          pst.setInt(1, bookid);
          
        int rowcount = pst.executeUpdate();
          
          if(rowcount>0){
          JOptionPane.showMessageDialog(this, "BOOK QUANTITY UPDATED");
          int initialcount = Integer.parseInt(QUANT.getText());
          QUANT.setText(Integer.toString(initialcount - 1));
          }else{
          JOptionPane.showMessageDialog(this, "BOOK QUANTITY FAILED TO UPDATED");
          }
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
 
 //CHECK IF BOOK IS ISSUED OR NOT
 public boolean alreadyissued(){
 
 boolean alreadyissued = false;
  int bookid= Integer.parseInt(isbn.getText());
  int sid= Integer.parseInt(studentid.getText());
  
     try {
          connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ba", "root", "");
          String sql = "select * from issue_book_details where ISBN = ? and ID = ? and STATUS =?";
          PreparedStatement pst = connection.prepareStatement(sql);
          
        pst.setInt(1, bookid);
        pst.setInt(2, sid);
        pst.setString(3, "PENDING");
          
            ResultSet rs = pst.executeQuery();
        if(rs.next()){
        alreadyissued = true;
        }else{
        alreadyissued = false;
        }
        
        
     } catch (Exception e) {
         e.printStackTrace();
     }
 return alreadyissued;
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
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        IBOOK = new javax.swing.JButton();
        isbn = new javax.swing.JTextField();
        studentid = new javax.swing.JTextField();
        ISSUEDATE = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        DUEDATE = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        nme = new javax.swing.JLabel();
        lnme = new javax.swing.JLabel();
        course = new javax.swing.JLabel();
        yr = new javax.swing.JLabel();
        studenterror = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ED_D = new javax.swing.JLabel();
        i_bn = new javax.swing.JLabel();
        T_TLE = new javax.swing.JLabel();
        GEN_RE = new javax.swing.JLabel();
        bookerror = new javax.swing.JLabel();
        QUANT = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 51, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(241, 195, 4));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ISSUE BOOK");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 41, 200, 50));

        IBOOK.setText("ISSUE BOOK");
        IBOOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IBOOKActionPerformed(evt);
            }
        });
        jPanel3.add(IBOOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 394, 220, 40));

        isbn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "ISBN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 1, 12))); // NOI18N
        isbn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                isbnFocusLost(evt);
            }
        });
        jPanel3.add(isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 119, 220, 39));

        studentid.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "STUDENT ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 1, 12))); // NOI18N
        studentid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                studentidFocusLost(evt);
            }
        });
        studentid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentidActionPerformed(evt);
            }
        });
        jPanel3.add(studentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 176, 220, 39));

        ISSUEDATE.setDateFormatString("MM/dd/yy");
        jPanel3.add(ISSUEDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 210, 30));

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "ISSUE DATE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 1, 14))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 230, 60));

        DUEDATE.setDateFormatString("MM/dd/yy");
        jPanel3.add(DUEDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 210, 30));

        jLabel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "DUE DATE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 1, 14))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 230, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 310, 530));

        jPanel4.setBackground(new java.awt.Color(153, 102, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(241, 195, 4));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("STUDENT DETAILS");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 200, 50));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CONTACT:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 120, 30));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ID:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 120, 30));

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("NAME:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 120, 30));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("LASTNAME:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, 30));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("COURSE:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 120, 30));

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 153));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("YEAR:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 120, 30));

        contact.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        contact.setForeground(new java.awt.Color(0, 255, 204));
        contact.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 110, 30));

        id.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        id.setForeground(new java.awt.Color(0, 255, 204));
        id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 110, 30));

        nme.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        nme.setForeground(new java.awt.Color(0, 255, 204));
        nme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(nme, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 110, 30));

        lnme.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        lnme.setForeground(new java.awt.Color(0, 255, 204));
        lnme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lnme, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 110, 30));

        course.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        course.setForeground(new java.awt.Color(0, 255, 204));
        course.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 110, 30));

        yr.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        yr.setForeground(new java.awt.Color(0, 255, 204));
        yr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(yr, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 110, 30));

        studenterror.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        studenterror.setForeground(new java.awt.Color(255, 0, 0));
        studenterror.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(studenterror, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 240, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 280, 530));

        jPanel5.setBackground(new java.awt.Color(102, 51, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 195, 4));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BOOK DETAILS");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 200, 50));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("EDITION:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 70, 30));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ISBN:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 70, 30));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("BOOK TITTLE:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, 30));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("GENRE:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 70, 30));

        ED_D.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        ED_D.setForeground(new java.awt.Color(255, 255, 153));
        ED_D.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(ED_D, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 150, 30));

        i_bn.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        i_bn.setForeground(new java.awt.Color(255, 255, 153));
        i_bn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(i_bn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 140, 30));

        T_TLE.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        T_TLE.setForeground(new java.awt.Color(255, 255, 153));
        T_TLE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(T_TLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 140, 30));

        GEN_RE.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        GEN_RE.setForeground(new java.awt.Color(255, 255, 153));
        GEN_RE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(GEN_RE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 150, 30));

        bookerror.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        bookerror.setForeground(new java.awt.Color(255, 0, 0));
        bookerror.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(bookerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 240, 30));

        QUANT.setFont(new java.awt.Font("Yu Gothic UI", 1, 13)); // NOI18N
        QUANT.setForeground(new java.awt.Color(255, 255, 153));
        QUANT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(QUANT, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 150, 30));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 51));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("QUANTITY:");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentidActionPerformed

    private void isbnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_isbnFocusLost
       if(!isbn.getText().equals("")){
       getbookdet();
       }
    }//GEN-LAST:event_isbnFocusLost

    private void studentidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentidFocusLost
        if(!studentid.getText().equals("")){
       getstudentdet();
       }
    }//GEN-LAST:event_studentidFocusLost

    private void IBOOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IBOOKActionPerformed
    if(QUANT.getText().equals("0")){
        JOptionPane.showMessageDialog(this, "BOOK IS NOT AVAILABLE");
    }else{
    
    
        if(alreadyissued() == false){
     
        if(issuebook()== true){
        JOptionPane.showMessageDialog(this, "BOOK ISSUED SUCCESSFULLY");
        updatebookquant();
        }else{
        JOptionPane.showMessageDialog(this, "CAN'T ISSUED BOOK");
      
         }
     }else{
     JOptionPane.showMessageDialog(this, "THIS STUDENT ALREADY HAVE THIS BOOK");
     alreadyissued();
     }
}
    }//GEN-LAST:event_IBOOKActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DUEDATE;
    private javax.swing.JLabel ED_D;
    private javax.swing.JLabel GEN_RE;
    private javax.swing.JButton IBOOK;
    private com.toedter.calendar.JDateChooser ISSUEDATE;
    private javax.swing.JLabel QUANT;
    private javax.swing.JLabel T_TLE;
    private javax.swing.JLabel bookerror;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel course;
    private javax.swing.JLabel i_bn;
    private javax.swing.JLabel id;
    private javax.swing.JTextField isbn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lnme;
    private javax.swing.JLabel nme;
    private javax.swing.JLabel studenterror;
    private javax.swing.JTextField studentid;
    private javax.swing.JLabel yr;
    // End of variables declaration//GEN-END:variables
}
