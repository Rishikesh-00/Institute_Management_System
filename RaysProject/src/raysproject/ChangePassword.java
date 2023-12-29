package raysproject;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class ChangePassword extends javax.swing.JFrame {
        boolean flag1=true,flag2=true,flag3=true;
        byte ctr=0;
        File logo,help,show,hide;
        Connection con;
        PreparedStatement stmt;
    public ChangePassword() throws SQLException {
        initComponents();
        con=ConnDb.conLink();
        
        cur_pf.requestFocus();
        this.setTitle("Change Password!");
        this.setLocationRelativeTo(null);
        cur_pf.requestFocus();
        hide_lb.setVisible(false);       
        Image icon=Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/icon/repl_logo_(1)-small.png"));
        this.setIconImage(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        new_pf = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        can_bt = new javax.swing.JButton();
        logo_lb = new javax.swing.JLabel();
        lab = new javax.swing.JLabel();
        cur_pf = new javax.swing.JPasswordField();
        con_pf = new javax.swing.JPasswordField();
        label = new javax.swing.JLabel();
        help_lb = new javax.swing.JLabel();
        new_lb = new javax.swing.JLabel();
        cpas_bt = new javax.swing.JButton();
        hide_lb = new javax.swing.JLabel();
        show_lb = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 225));
        kGradientPanel1.setkGradientFocus(1000);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Current Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, 26));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("New Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 99, 26));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Confirm password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 160, 26));

        new_pf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 255)));
        new_pf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                new_pfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                new_pfFocusLost(evt);
            }
        });
        new_pf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_pfActionPerformed(evt);
            }
        });
        new_pf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                new_pfKeyTyped(evt);
            }
        });
        jPanel1.add(new_pf, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 261, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Change Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 182, 29));

        can_bt.setBackground(new java.awt.Color(204, 0, 51));
        can_bt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        can_bt.setForeground(new java.awt.Color(255, 255, 255));
        can_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel (1).png"))); // NOI18N
        can_bt.setText("CANCEL");
        can_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                can_btActionPerformed(evt);
            }
        });
        jPanel1.add(can_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, -1, 30));

        logo_lb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/repl_logo_(1)-med.png"))); // NOI18N
        logo_lb.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(logo_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 150, 110));
        jPanel1.add(lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 270, 20));

        cur_pf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 255)));
        cur_pf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cur_pfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cur_pfFocusLost(evt);
            }
        });
        cur_pf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cur_pfKeyTyped(evt);
            }
        });
        jPanel1.add(cur_pf, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 261, 30));

        con_pf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(51, 51, 255)));
        con_pf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                con_pfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                con_pfFocusLost(evt);
            }
        });
        con_pf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                con_pfKeyTyped(evt);
            }
        });
        jPanel1.add(con_pf, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 270, 30));
        jPanel1.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 260, 20));

        help_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hint.png"))); // NOI18N
        help_lb.setToolTipText("");
        help_lb.setBorder(new javax.swing.border.MatteBorder(null));
        help_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                help_lbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                help_lbMouseEntered(evt);
            }
        });
        jPanel1.add(help_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 30, 30));
        jPanel1.add(new_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 260, 20));

        cpas_bt.setBackground(new java.awt.Color(0, 116, 226));
        cpas_bt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cpas_bt.setForeground(new java.awt.Color(255, 255, 255));
        cpas_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/changepswd (1).png"))); // NOI18N
        cpas_bt.setText("CHANGE PASSWORD");
        cpas_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpas_btActionPerformed(evt);
            }
        });
        jPanel1.add(cpas_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, 30));

        hide_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hide1.png"))); // NOI18N
        hide_lb.setBorder(new javax.swing.border.MatteBorder(null));
        hide_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hide_lbMouseClicked(evt);
            }
        });
        jPanel1.add(hide_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 30, 30));

        show_lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/open1.png"))); // NOI18N
        show_lb.setBorder(new javax.swing.border.MatteBorder(null));
        show_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                show_lbMouseClicked(evt);
            }
        });
        jPanel1.add(show_lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 30, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pswd.jpeg"))); // NOI18N
        jLabel5.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 300, 250));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cur_pfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cur_pfFocusLost
        
        flcheck(cur_pf);
    }//GEN-LAST:event_cur_pfFocusLost

    private void cur_pfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cur_pfFocusGained
        fgcheck(cur_pf);
    }//GEN-LAST:event_cur_pfFocusGained

    private void cur_pfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cur_pfKeyTyped
        // TODO add your handling code here:
        char ch=evt.getKeyChar();
        if(!(ch>=65&& ch<=90 || ch>=97 && ch<=122 || ch=='@'||ch==8||ch>='0'&&ch<='9'||ch=='!'||ch=='#'||ch=='$'||ch=='%'||ch=='&'||ch=='*'||ch=='_'||ch=='-'||ch=='+'||ch=='.'))

        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_cur_pfKeyTyped

    private void new_pfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_new_pfKeyTyped
        //*******Password strength check*****************
        char ch=evt.getKeyChar();
         if(flag1 &&((ch>=65 && ch<=90)|| (ch>=97 && ch<=122))){
            ctr++;
            flag1=false;
        }
        else if(flag2 && ((ch>=48 && ch<=57))){
            ctr++;
            flag2=false;
        }
        else if(flag3 && !((ch>=65 && ch<=90)|| (ch>=97 && ch<=122)||(ch>=48 && ch<=57)))
        {
            ctr++;
            flag3=false;
        }
        //System.out.println(ctr);
        if(ctr==1){
             new_lb.setForeground(Color.red);
             new_lb.setText("Weak");
        }
        else if(ctr==2){
            new_lb.setForeground(Color.orange);
            new_lb.setText("Medium");
        }
        else if(ctr==3){
            new_lb.setForeground(Color.GREEN);
            new_lb.setText("Strong");
        }
        if(ch==8){
            flag1=flag2=flag3=true;
            ctr=0;
            char hc[]=new_pf.getPassword();
            if(hc.length==0){
                 new_lb.setText("");
            }
           else
            {
                for (byte i = 0; i<hc.length; i++) {
                    if (flag1 && ((hc[i]>=65 && hc[i]<=90)||(hc[i]>=97 && hc[i]<=122) )) {
                        ctr++;
                        flag1=false;
                    }
                    else if (flag2 && ((hc[i]>=48)&& (hc[i]<=57))) {
                        ctr++;
                        flag2=false;
                    }
                    else if(flag1 && !((hc[i]>=65 && hc[i]<=90)||(hc[i]>=97 && hc[i]<=122))||((hc[i]>=48)&& (hc[i]<=57))){
                        ctr++;
                        flag3=false;
                    }
        
                    if(ctr==1){                       
                        new_lb.setForeground(Color.red);
                        new_lb.setText("*Weak");
                    }
                    else  if(ctr==2){                       
                        new_lb.setForeground(Color.orange);
                        new_lb.setText("*Medium");
                    }
                    else if(ctr==3)  {                      
                        new_lb.setForeground(Color.green);
                        new_lb.setText("*Strong");
                    }
                    } 
                }
        }
        //***************keyType validation*******************
        String str=new String(new_pf.getPassword());
        
        if(!(ch>=65&& ch<=90 || ch>=97 && ch<=122 || ch=='@'||ch==8||ch>='0'&&ch<='9'||ch=='!'||ch=='#'||ch=='$'||ch=='%'||ch=='&'||ch=='*'||ch=='_'||ch=='-'||ch=='+'||ch=='.'))
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_new_pfKeyTyped

    private void con_pfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_con_pfKeyTyped
   
    }//GEN-LAST:event_con_pfKeyTyped

    private void con_pfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_con_pfFocusLost
        flcheck(con_pf);
    }//GEN-LAST:event_con_pfFocusLost

    private void new_pfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_new_pfFocusLost
        flcheck(new_pf);
    }//GEN-LAST:event_new_pfFocusLost

    private void new_pfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_new_pfFocusGained
        fgcheck(new_pf);
    }//GEN-LAST:event_new_pfFocusGained

    private void help_lbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help_lbMouseEntered
    }//GEN-LAST:event_help_lbMouseEntered

    private void con_pfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_con_pfFocusGained
        fgcheck(con_pf);
    }//GEN-LAST:event_con_pfFocusGained

    private void new_pfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_pfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_pfActionPerformed

    private void show_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_lbMouseClicked
        // TODO add your handling code here:
        new_pf.setEchoChar((char)0);
        show_lb.setVisible(false);
        hide_lb.setVisible(true);
    }//GEN-LAST:event_show_lbMouseClicked

    private void hide_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_lbMouseClicked
        // TODO add your handling code here:
        new_pf.setEchoChar('*');
        show_lb.setVisible(true);
        hide_lb.setVisible(false);
    }//GEN-LAST:event_hide_lbMouseClicked

    private void can_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_can_btActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_can_btActionPerformed

    private void cpas_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpas_btActionPerformed
        valchk(); 
        boolean chk=true;
        if(new String(cur_pf.getPassword()).isEmpty()||new String(new_pf.getPassword()).isEmpty()||new String(con_pf.getPassword()).isEmpty())
            chk=false;
        else if(new String(cur_pf.getPassword()).equals("*Field is mandatory!")||new String(new_pf.getPassword()).equals("*Field is mandatory!")||new String(con_pf.getPassword()).equals("*Field is mandatory!")){
            chk=false;
        }
        if(chk){
             try {
                stmt=con.prepareStatement("update signup set pas=? where u_id=?");
                stmt.setString(1, new String(new_pf.getPassword()));
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Password Updated Successfully!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Something Went Wrong!");
            } 
        }
        else
            JOptionPane.showMessageDialog(this, "Please fill all the mandatory!");
    }//GEN-LAST:event_cpas_btActionPerformed

    private void help_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_help_lbMouseClicked
        JOptionPane.showMessageDialog(this,"Create a password that:  \n- Contains at least 8 characters\n- Is not commonaly used","Password Hints!",JOptionPane.PLAIN_MESSAGE);

    }//GEN-LAST:event_help_lbMouseClicked

    public void fgcheck(JPasswordField fg){
         String pass1=new String(fg.getPassword());
        if(pass1.equals("*Field is mandatory!")){
            fg.setEchoChar('*');
            fg.setForeground(Color.black);
            fg.setText("");
            fg.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.blue));
           label.setText("");
        }
         else if(fg.equals(new_pf)){
             if(pass1.length()<8){
                 new_lb.setText("");
                 new_pf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.blue));
                 Toolkit.getDefaultToolkit().beep();
             }
         }
         else if(fg.equals(con_pf)){
             label.setText("");
         }
    }
    public void flcheck(JPasswordField fl)
    {   
        String str=new String(fl.getPassword());
        char ch[]=fl.getPassword();
        
         if(ch.length==0){
            
            fl.setForeground(Color.red);
            fl.setEchoChar((char)0);
            fl.setText("*Field is mandatory!");
            fl.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.red));
            Toolkit.getDefaultToolkit().beep();
        }
         else if(fl.equals(new_pf)){
             if(str.length()<8){
                 label.setForeground(Color.red);
                 new_lb.setText("Must be at least 8 characters!");
                 new_pf.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.red));
                 Toolkit.getDefaultToolkit().beep();
             }
         }
        else if(fl.equals(con_pf))
        {
            String newpass=new String(new_pf.getPassword());
            String conpass=new String(con_pf.getPassword());
            if(!(newpass.equals(conpass))){
                label.setForeground(Color.red);
                label.setText("*Password doesn't match!");
                Toolkit.getDefaultToolkit().beep();
            }
            else
                label.setText("");
        }
    }
    public void valchk(){
        flcheck(cur_pf);
        flcheck(new_pf);
        flcheck(con_pf);
    }
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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ChangePassword().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton can_bt;
    private javax.swing.JPasswordField con_pf;
    private javax.swing.JButton cpas_bt;
    private javax.swing.JPasswordField cur_pf;
    private javax.swing.JLabel help_lb;
    private javax.swing.JLabel hide_lb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lab;
    private javax.swing.JLabel label;
    private javax.swing.JLabel logo_lb;
    private javax.swing.JLabel new_lb;
    private javax.swing.JPasswordField new_pf;
    private javax.swing.JLabel show_lb;
    // End of variables declaration//GEN-END:variables
}