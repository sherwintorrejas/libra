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
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
public class addstudent extends javax.swing.JInternalFrame {

    /**
     * Creates new form addstudent
     */
    public addstudent() {
        initComponents();
        displayData();
          this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
    }
   public void reset(){
   EN.setText("");
   ELN.setText("");
   EC.setText("");
   EY.setText("");
   ECT.setText("");
   
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
    public void filltable () throws SQLException{
        try{
            DBCONNECTOR dbc = new DBCONNECTOR();
            ResultSet rs = dbc.getData("SELECT * FROM student_details");
            studentdet.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException ex){
        
        
        
        
        
        }
    
    }
    public boolean validation(){
  String name= EN.getText();
String lastnmae =  ELN.getText();
  String course= EC.getText();
String year= EY.getText();
String contact= ECT.getText();
 if (name.equals("")){
 JOptionPane.showMessageDialog(this, "PLEASE ENTER STUDENT NAME");
 return false;
 }
 if(lastnmae.equals("")){
 JOptionPane.showMessageDialog(this, "PLEASE ENTER LASTNAME");
 return false;
 }
if(course.equals("")){
 JOptionPane.showMessageDialog(this, "PLEASE ENTER COURSE");
 return false;
 }     
 if(year.equals("")){
 JOptionPane.showMessageDialog(this, "PLEASE ENTER YEAR");
 return false;
 }    
  if(contact.equals("")){
 JOptionPane.showMessageDialog(this, "PLEASE ENTER CONTACT");
 return false;
 }        
 
   return true;  
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
        studentdet = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        UPDATE = new javax.swing.JButton();
        ADD = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        ECT = new javax.swing.JTextField();
        EY = new javax.swing.JTextField();
        EC = new javax.swing.JTextField();
        ELN = new javax.swing.JTextField();
        EN = new javax.swing.JTextField();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentdet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentdetMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studentdet);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 510));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/library-books-laptop-table-wallpaper-preview.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 550, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 540, 500));

        jPanel2.setBackground(new java.awt.Color(227, 167, 114));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADD STUDENT");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 280, 40));

        ID.setBackground(new java.awt.Color(241, 195, 4));
        ID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ID.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "ENTER ID", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 1, 12))); // NOI18N
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        jPanel2.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 210, 40));

        UPDATE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        UPDATE.setText("UPDATE");
        UPDATE.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        jPanel2.add(UPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 80, 30));

        ADD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ADD.setText("ADD");
        ADD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel2.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 80, 30));

        DELETE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DELETE.setText("DELETE");
        DELETE.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        jPanel2.add(DELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 80, 30));

        ECT.setBackground(new java.awt.Color(241, 195, 4));
        ECT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ECT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ECT.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "ENTER CONTACT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 1, 12))); // NOI18N
        ECT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ECTKeyPressed(evt);
            }
        });
        jPanel2.add(ECT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 210, 40));

        EY.setBackground(new java.awt.Color(241, 195, 4));
        EY.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EY.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EY.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "ENTER YEAR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 1, 12))); // NOI18N
        EY.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EYKeyPressed(evt);
            }
        });
        jPanel2.add(EY, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 210, 40));

        EC.setBackground(new java.awt.Color(241, 195, 4));
        EC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EC.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "ENTER COURSE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 1, 12))); // NOI18N
        jPanel2.add(EC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 210, 40));

        ELN.setBackground(new java.awt.Color(241, 195, 4));
        ELN.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ELN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ELN.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "ENTER LASTNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 1, 12))); // NOI18N
        jPanel2.add(ELN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 210, 40));

        EN.setBackground(new java.awt.Color(241, 195, 4));
        EN.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EN.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "ENTER NAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI", 1, 12))); // NOI18N
        EN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENActionPerformed(evt);
            }
        });
        jPanel2.add(EN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 210, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
      if(validation()== true){
        DBCONNECTOR dbc = new DBCONNECTOR();
        int num = dbc.updateData("UPDATE student_details "
       + "SET NAME = '"+EN.getText()+"', LASTNAME='"+ELN.getText()+"', "
                        + "COURSE ='"+EC.getText()+"', YEAR='"+EY.getText()+"', CONTACT='"+ECT.getText()+"'  "
                                + "WHERE ID = '"+ID.getText()+"'");
       
        if(num == 0){
           
        }else{
           JOptionPane.showMessageDialog(null, "Updated Successfully!");
           displayData();
           reset();
        }
      }
    }//GEN-LAST:event_UPDATEActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        if(validation()== true){
        DBCONNECTOR dbc = new DBCONNECTOR();
        dbc.insertData("INSERT INTO student_details ( NAME, LASTNAME, COURSE, YEAR, CONTACT) "
                + "VALUES ('"+EN.getText()+"', '"+ELN.getText()+"','"+EC.getText()+"','"+EY.getText()+"','"+ECT.getText()+"')");
        displayData();
        reset();
        }
    }//GEN-LAST:event_ADDActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
    int rowIndex = studentdet.getSelectedRow();
       if(rowIndex < 0){
           JOptionPane.showMessageDialog(null, "Please select a data first");
       }else{
            TableModel model = studentdet.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String ID = value.toString();
             int a=JOptionPane.showConfirmDialog(null,"Are you sure?");  
                    if(a==JOptionPane.YES_OPTION){  
                            DBCONNECTOR dbc = new DBCONNECTOR();
                            dbc.deleteData(Integer.parseInt(ID));
                            displayData();
                            reset();
                    }    
       }
    }//GEN-LAST:event_DELETEActionPerformed

    private void ENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ENActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void studentdetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentdetMouseClicked
       
        int rowIndex = studentdet.getSelectedRow();
        if(rowIndex <0){
        
        }else{
        TableModel model = studentdet.getModel();
        ID.setText(""+model.getValueAt(rowIndex, 0));
        EN.setText(""+model.getValueAt(rowIndex, 1));
        ELN.setText(""+model.getValueAt(rowIndex, 2));
        EC.setText(""+model.getValueAt(rowIndex, 3));
        EY.setText(""+model.getValueAt(rowIndex, 4));
        ECT.setText(""+model.getValueAt(rowIndex, 5));
        }
    }//GEN-LAST:event_studentdetMouseClicked

    private void EYKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EYKeyPressed
       char c =evt.getKeyChar();
        if(Character.isLetter(c)){
        EY.setEditable(false);
        JOptionPane.showMessageDialog(this, "Please enter number only");
        }else{
        EY.setEditable(true);
        
        }
    }//GEN-LAST:event_EYKeyPressed

    private void ECTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ECTKeyPressed
        char c =evt.getKeyChar();
        if(Character.isLetter(c)){
        ECT.setEditable(false);
        JOptionPane.showMessageDialog(this, "Please enter number only");
        }else{
        ECT.setEditable(true);
        
        }
    }//GEN-LAST:event_ECTKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton DELETE;
    private javax.swing.JTextField EC;
    private javax.swing.JTextField ECT;
    private javax.swing.JTextField ELN;
    private javax.swing.JTextField EN;
    private javax.swing.JTextField EY;
    private javax.swing.JTextField ID;
    private javax.swing.JButton UPDATE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable studentdet;
    // End of variables declaration//GEN-END:variables

}