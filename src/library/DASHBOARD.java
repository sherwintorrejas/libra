/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.awt.Color;
import internalpage.*;
import internalpage.dashabord;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DASHBOARD extends javax.swing.JFrame {

    /**
     * Creates new form DASHBOARD
     */
    public DASHBOARD() {
        initComponents();
    }
  Color navcolor = new Color(231,133,0);
    Color headcolor = new Color(227,167,114);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ADDSTUDENT = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ISSUEBOOK = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        VDET = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        DEFLIST = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        LOGOUT = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        ADDBOOK = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RETRUNBOOK = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        VID = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        maindesk = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(231, 133, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboard.setBackground(new java.awt.Color(231, 133, 0));
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardMouseExited(evt);
            }
        });
        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DASHBOARD");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });
        dashboard.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 20));

        jPanel1.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 160, 40));

        ADDSTUDENT.setBackground(new java.awt.Color(231, 133, 0));
        ADDSTUDENT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADDSTUDENTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ADDSTUDENTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ADDSTUDENTMouseExited(evt);
            }
        });
        ADDSTUDENT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ADD STUDENT");
        ADDSTUDENT.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 130, 11));

        jPanel1.add(ADDSTUDENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 160, 30));

        ISSUEBOOK.setBackground(new java.awt.Color(231, 133, 0));
        ISSUEBOOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ISSUEBOOKMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ISSUEBOOKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ISSUEBOOKMouseExited(evt);
            }
        });
        ISSUEBOOK.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("ISSUE BOOK");
        ISSUEBOOK.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, -1));

        jPanel1.add(ISSUEBOOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 160, 30));

        VDET.setBackground(new java.awt.Color(231, 133, 0));
        VDET.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VDETMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VDETMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VDETMouseExited(evt);
            }
        });
        VDET.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("VIEW RECORDS");
        VDET.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 130, 20));

        jPanel1.add(VDET, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 160, 30));

        DEFLIST.setBackground(new java.awt.Color(231, 133, 0));
        DEFLIST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DEFLISTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DEFLISTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DEFLISTMouseExited(evt);
            }
        });
        DEFLIST.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("VIOLATION LIST");
        DEFLIST.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 25));

        jPanel1.add(DEFLIST, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 160, -1));

        LOGOUT.setBackground(new java.awt.Color(231, 133, 0));
        LOGOUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGOUTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LOGOUTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LOGOUTMouseExited(evt);
            }
        });
        LOGOUT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("LOGOUT");
        LOGOUT.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 25));

        jPanel1.add(LOGOUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 160, -1));

        ADDBOOK.setBackground(new java.awt.Color(231, 133, 0));
        ADDBOOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADDBOOKMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ADDBOOKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ADDBOOKMouseExited(evt);
            }
        });
        ADDBOOK.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ADD BOOK");
        ADDBOOK.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 130, 11));

        jPanel1.add(ADDBOOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 160, 30));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("----MANAGE----");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("----CIRCULATION----");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 190, 150, -1));

        RETRUNBOOK.setBackground(new java.awt.Color(231, 133, 0));
        RETRUNBOOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RETRUNBOOKMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RETRUNBOOKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RETRUNBOOKMouseExited(evt);
            }
        });
        RETRUNBOOK.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("RETURN BOOK");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        RETRUNBOOK.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 160, 20));

        jPanel1.add(RETRUNBOOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, 40));

        VID.setBackground(new java.awt.Color(231, 133, 0));
        VID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VIDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VIDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VIDMouseExited(evt);
            }
        });
        VID.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("VIEW ISSUED BOOKS");
        VID.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 30));

        jPanel1.add(VID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 160, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 563));

        jPanel2.setBackground(new java.awt.Color(227, 167, 114));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome, Administrator");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 150, 40));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 50, 40));

        exit.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close (2).png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 50, 40));

        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/minimize-sign (2).png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel2.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 40, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1010, -1));

        javax.swing.GroupLayout maindeskLayout = new javax.swing.GroupLayout(maindesk);
        maindesk.setLayout(maindeskLayout);
        maindeskLayout.setHorizontalGroup(
            maindeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        maindeskLayout.setVerticalGroup(
            maindeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        getContentPane().add(maindesk, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 860, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setBackground(navcolor);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setBackground(headcolor);
    }//GEN-LAST:event_exitMouseExited

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseEntered

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        maindesk.removeAll();
        dashabord dh = new dashabord();
        maindesk.add(dh).setVisible(true);
    }//GEN-LAST:event_dashboardMouseClicked

    private void dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseEntered
        dashboard.setBackground(headcolor);
    }//GEN-LAST:event_dashboardMouseEntered

    private void dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseExited
        dashboard.setBackground(navcolor);
    }//GEN-LAST:event_dashboardMouseExited

    private void ADDSTUDENTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDSTUDENTMouseClicked
         maindesk.removeAll(); 
        addstudent adst= new addstudent();
        maindesk.add(adst).setVisible(true);
    }//GEN-LAST:event_ADDSTUDENTMouseClicked

    private void ADDSTUDENTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDSTUDENTMouseEntered
        ADDSTUDENT.setBackground(headcolor);
    }//GEN-LAST:event_ADDSTUDENTMouseEntered

    private void ADDSTUDENTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDSTUDENTMouseExited
        ADDSTUDENT.setBackground(navcolor);
    }//GEN-LAST:event_ADDSTUDENTMouseExited

    private void ISSUEBOOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ISSUEBOOKMouseClicked
        maindesk.removeAll();
        issuebook ib =new issuebook();
        maindesk.add(ib).setVisible(true);
    }//GEN-LAST:event_ISSUEBOOKMouseClicked

    private void ISSUEBOOKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ISSUEBOOKMouseEntered
        ISSUEBOOK.setBackground(headcolor);
    }//GEN-LAST:event_ISSUEBOOKMouseEntered

    private void ISSUEBOOKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ISSUEBOOKMouseExited
        ISSUEBOOK.setBackground(navcolor);
    }//GEN-LAST:event_ISSUEBOOKMouseExited

    private void VDETMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VDETMouseClicked
        viewdet vd = new viewdet();
        maindesk.add(vd).setVisible(true);
    }//GEN-LAST:event_VDETMouseClicked

    private void VDETMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VDETMouseEntered
        VDET.setBackground(headcolor);
    }//GEN-LAST:event_VDETMouseEntered

    private void VDETMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VDETMouseExited
        VDET.setBackground(navcolor);   // TODO add your handling code here:
    }//GEN-LAST:event_VDETMouseExited

    private void DEFLISTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEFLISTMouseClicked
        maindesk.removeAll();
        violationdet vl =new violationdet();
        maindesk.add(vl).setVisible(true);
    }//GEN-LAST:event_DEFLISTMouseClicked

    private void DEFLISTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEFLISTMouseEntered
        DEFLIST.setBackground(headcolor);
    }//GEN-LAST:event_DEFLISTMouseEntered

    private void DEFLISTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DEFLISTMouseExited
        DEFLIST.setBackground(navcolor);
    }//GEN-LAST:event_DEFLISTMouseExited

    private void LOGOUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUTMouseClicked
        int a = JOptionPane.showConfirmDialog(null,"ARE YOU SURE YOU WANT TO LOGOUT?");
        if(a == JOptionPane.YES_OPTION){
            login in = new login ();
            in.setVisible(true);
            this.dispose();}
    }//GEN-LAST:event_LOGOUTMouseClicked

    private void LOGOUTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUTMouseEntered
        LOGOUT.setBackground(headcolor);
    }//GEN-LAST:event_LOGOUTMouseEntered

    private void LOGOUTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGOUTMouseExited
        LOGOUT.setBackground(navcolor);
    }//GEN-LAST:event_LOGOUTMouseExited

    private void ADDBOOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDBOOKMouseClicked
        maindesk.removeAll();
        addbook ab =new addbook();
        maindesk.add(ab).setVisible(true);
    }//GEN-LAST:event_ADDBOOKMouseClicked

    private void ADDBOOKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDBOOKMouseEntered
        ADDBOOK.setBackground(headcolor);
    }//GEN-LAST:event_ADDBOOKMouseEntered

    private void ADDBOOKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDBOOKMouseExited
        ADDBOOK.setBackground(navcolor);
    }//GEN-LAST:event_ADDBOOKMouseExited

    private void RETRUNBOOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RETRUNBOOKMouseClicked
        maindesk.removeAll();
        returnbook rb = new returnbook();
        maindesk.add(rb).setVisible(true);
    }//GEN-LAST:event_RETRUNBOOKMouseClicked

    private void RETRUNBOOKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RETRUNBOOKMouseEntered
        RETRUNBOOK.setBackground(headcolor);
    }//GEN-LAST:event_RETRUNBOOKMouseEntered

    private void RETRUNBOOKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RETRUNBOOKMouseExited
        RETRUNBOOK.setBackground(navcolor);
    }//GEN-LAST:event_RETRUNBOOKMouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked

       
    }//GEN-LAST:event_jLabel12MouseClicked

    private void VIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VIDMouseClicked
        maindesk.removeAll();
        VIEWISSUEDBOOK VID = new VIEWISSUEDBOOK ();
        maindesk.add(VID).setVisible(true);
    }//GEN-LAST:event_VIDMouseClicked

    private void VIDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VIDMouseEntered
        VID.setBackground(headcolor);
    }//GEN-LAST:event_VIDMouseEntered

    private void VIDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VIDMouseExited
           VID.setBackground(navcolor);
    }//GEN-LAST:event_VIDMouseExited

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
            java.util.logging.Logger.getLogger(DASHBOARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DASHBOARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DASHBOARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DASHBOARD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DASHBOARD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ADDBOOK;
    private javax.swing.JPanel ADDSTUDENT;
    private javax.swing.JPanel DEFLIST;
    private javax.swing.JPanel ISSUEBOOK;
    private javax.swing.JPanel LOGOUT;
    private javax.swing.JPanel RETRUNBOOK;
    private javax.swing.JPanel VDET;
    private javax.swing.JPanel VID;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JDesktopPane maindesk;
    private javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}
