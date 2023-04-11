/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalpage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class violationdet extends javax.swing.JInternalFrame {
private Connection con;
DefaultTableModel model;
    /**
     * Creates new form violationdet
     */
    public violationdet() {
        initComponents();
        viewdetails();
           this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
    }
public void viewdetails(){
   long l = System.currentTimeMillis();
  Date todayDate = new Date(l);
        try {
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ba", "root", "");
             PreparedStatement pst = con.prepareStatement("select * from issue_book_details where DUE < ? and STATUS = ?");
             pst.setDate(1, todayDate);
             pst.setString(2, "PENDING");
             
             ResultSet rs = pst.executeQuery();
             
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DETAILS = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(153, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VIOLATORS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 470, 60));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 840, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DETAILS;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
