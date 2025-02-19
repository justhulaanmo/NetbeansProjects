
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {
    
    public login() {
        initComponents();
        pink.requestFocus();
        pack();
        setLocationRelativeTo(null);
        
        lg_username.setText("@");
        lg_username.setForeground(Color.GRAY);
        
        // FocusAdapter is abstract class
        lg_username.addFocusListener(new java.awt.event.FocusAdapter() {
        @Override
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (lg_username.getText().equals("@")) {
                lg_username.setText("");
                lg_username.setForeground(Color.RED);
            }
        }
        @Override
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (lg_username.getText().isEmpty()) {
                lg_username.setText("@");
                lg_username.setForeground(Color.GRAY);   } 
        }
    });
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pink = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lg_username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        clickhere = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lg_password = new javax.swing.JPasswordField();
        name = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pink.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("LOG IN");

        lg_username.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        lg_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lg_usernameActionPerformed(evt);
            }
        });
        lg_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lg_usernameKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabel3.setText("Password:");

        login.setBackground(new java.awt.Color(0, 102, 102));
        login.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("LOG IN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabel5.setText("no account yet?");

        clickhere.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        clickhere.setForeground(new java.awt.Color(255, 51, 102));
        clickhere.setText("click here!");
        clickhere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickhereMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabel2.setText("Username:");

        lg_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lg_passwordKeyReleased(evt);
            }
        });

        name.setForeground(new java.awt.Color(255, 0, 0));

        pass.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pinkLayout = new javax.swing.GroupLayout(pink);
        pink.setLayout(pinkLayout);
        pinkLayout.setHorizontalGroup(
            pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pinkLayout.createSequentialGroup()
                .addGroup(pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pinkLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(pinkLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lg_username, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lg_password, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(pinkLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(clickhere, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(269, 269, 269))
            .addGroup(pinkLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pinkLayout.setVerticalGroup(
            pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pinkLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lg_username, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lg_password, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(clickhere, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(pink, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 330, 440));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("W  E  L  C  O  M   E");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("@ GROUP 5");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(41, 41, 41))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lg_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lg_usernameActionPerformed
    
       
    }//GEN-LAST:event_lg_usernameActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        
            
        String username = lg_username.getText();
        String password = new String(lg_password.getPassword());
    
           if (lg_username.getText().isEmpty() || lg_password.getText().isEmpty() || lg_username.getText().equals("@")){
            JOptionPane.showMessageDialog(this, "pakisagutan lahat ba tarunga", "WARNING", JOptionPane.WARNING_MESSAGE);
            
            if (!lg_username.getText().isEmpty()){
                lg_username.setBorder(javax.swing.BorderFactory.createLineBorder(Color.black));
                
            } else{
                lg_username.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                
            }if (lg_password.getText().isEmpty()){
                lg_password.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red));
                
            } else{
                lg_password.setBorder(javax.swing.BorderFactory.createLineBorder(Color.black));
            }
            return;
           }
           
           datauser dt = new datauser();
            if (username.equals(datauser.su_username) && password.equals(datauser.su_password)){
                //if (username.equals(datauser.getsu_username()) && password.equals(datauser.getsu_password())){
          
            JOptionPane.showMessageDialog(this, "SUCCESSFULLY LOGIN!");
            
            information info = new information();
            info.setVisible(true);
            this.dispose();
            
            information.info_fn.setText(datauser.su_firstname);
            information.info_ln.setText(datauser.su_lastname);
            information.info_contact.setText(datauser.su_contact);
            information.info_username.setText(datauser.su_username);
            information.info_password.setText(datauser.su_password);
            }
            else {
              JOptionPane.showMessageDialog(this, "no account found \n please create account first!","WARNING", JOptionPane.WARNING_MESSAGE);  
            }
    }//GEN-LAST:event_loginActionPerformed

    private void clickhereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickhereMouseClicked
        SignIn sign = new SignIn();
        sign.setVisible(true);
        sign.pack();
        sign.setLocationRelativeTo(null);
        this.dispose();
             
    }//GEN-LAST:event_clickhereMouseClicked

    private void loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginKeyPressed

    private void lg_usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lg_usernameKeyReleased
        String PATTERN = "^@[a-zA-Z0-9._]{0,30}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(lg_username.getText());
        if(!match.matches()){
            name.setText("Invalid Input");
        }
        else{
            name.setText(null);
        }
    }//GEN-LAST:event_lg_usernameKeyReleased

    private void lg_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lg_passwordKeyReleased
        String PATTERN = "^[a-zA-Z0-9@,._]{0,255}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(lg_password.getText());
        if(!match.matches()){
            pass.setText("Invalid Input");
        }
        else{
            pass.setText(null);
        }
        
        
    }//GEN-LAST:event_lg_passwordKeyReleased
    
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                new login().setVisible(true);
                
               
              
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel clickhere;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JPasswordField lg_password;
    public static javax.swing.JTextField lg_username;
    private javax.swing.JButton login;
    private javax.swing.JLabel name;
    private javax.swing.JLabel pass;
    private javax.swing.JPanel pink;
    // End of variables declaration//GEN-END:variables
}
