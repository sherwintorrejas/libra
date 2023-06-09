/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalpage;

/**
 *
 * @author User
 */
import CONFIG.DBCONNECTOR;
import com.toedter.calendar.DateUtil;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.JOptionPane;
        
public class viewdet extends javax.swing.JInternalFrame {
private Connection con;
    /**
     * Creates new form viewdet
     */
DefaultTableModel model;
    public viewdet() {
        initComponents();
     viewdetails();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
    }
    public void viewdetails(){
        try {
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ba", "root", "");
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("select * from issue_book_details");
             
             while(rs.next()){
             String id = rs.getString("ISSUED_ID");
             String booktittle = rs.getString("TITTLE");
             String name = rs.getString("NAME");
             String lastname = rs.getString("LASTNAME");
             String issuedate = rs.getString("ISSUED");
             String duedate = rs.getString("DUE");
             String status = rs.getString("STATUS");
             
             Object [] obj = {id,booktittle,name,lastname,issuedate,duedate,status};
             model = (DefaultTableModel) DETAILS.getModel();
             model.addRow(obj);
             
             }
             
             
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    
    }
    public void cleartable(){
    DefaultTableModel model =(DefaultTableModel)DETAILS.getModel();
    model.setRowCount(0);
     
    
    
    }
    
    
  public void search(){
  Date uidate= isdate.getDate();
  Date uddate=ddate.getDate();
  
  Long l1= uidate.getTime();
  long l2=uddate.getTime();
  
  
  java.sql.Date sidate = new java.sql.Date(l1);
  java.sql.Date sddate = new java.sql.Date(l2);
  
      try {
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ba", "root", "");
           String sql = "select * from issue_book_Details where ISSUED BETWEEN ? and ?";
           PreparedStatement pst = con.prepareStatement(sql);
           pst.setDate(1, sidate);
          pst.setDate(2, sddate);
          ResultSet rs = pst.executeQuery();
          if(rs.next() == false){
          JOptionPane.showMessageDialog(this, "NO RECORDS FOUND");
          
          }else{
          
          while(rs.next()){
             String id = rs.getString("ISSUED_ID");
             String booktittle = rs.getString("TITTLE");
             String name = rs.getString("NAME");
             String lastname = rs.getString("LASTNAME");
             String issuedate = rs.getString("ISSUED");
             String duedate = rs.getString("DUE");
             String status = rs.getString("STATUS");
             
             Object [] obj = {id,booktittle,name,lastname,issuedate,duedate,status};
             model = (DefaultTableModel) DETAILS.getModel();
             model.addRow(obj);
             
          }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        DETAILS = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ddate = new com.toedter.calendar.JDateChooser();
        isdate = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DETAILS.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        DETAILS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISSUED ID", "BOOK TITTLE", "NAME", "LASTNAME", "ISSUED DATE", "DUE DATE", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DETAILS.setSelectionForeground(new java.awt.Color(0, 255, 204));
        jScrollPane1.setViewportView(DETAILS);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 840, 310));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 870, 380));

        jPanel2.setBackground(new java.awt.Color(204, 51, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW RECORDS ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 290, 50));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel2.setText("DUE DATE:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 70, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel3.setText("ISSUED DATE:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, -1));

        ddate.setBackground(new java.awt.Color(204, 0, 0));
        ddate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ddate.setDateFormatString("MM/dd/yy");
        jPanel2.add(ddate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 220, 30));

        isdate.setBackground(new java.awt.Color(204, 0, 0));
        isdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        isdate.setDateFormatString("MM/dd/yy");
        jPanel2.add(isdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 220, 30));

        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 110, 30));

        jButton2.setText("VIEW ALL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 110, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if(isdate.getDate() != null && ddate.getDate() != null){ 
          cleartable();
        search();
      }else{
      JOptionPane.showMessageDialog(this, "PLEASE SELECT DATE");
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     cleartable();
     viewdetails();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DETAILS;
    private com.toedter.calendar.JDateChooser ddate;
    private com.toedter.calendar.JDateChooser isdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
