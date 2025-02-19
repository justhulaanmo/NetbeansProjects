import java.util.regex.*;
import javax.swing.JOptionPane;
import java.awt.Color;
public class SignIn extends javax.swing.JFrame {
    
    private static String username;
    private static String password;
    private static String firstname;
    private static String lastname;
    private static String contact;
    
    
    public SignIn() {
        initComponents();
        pink.requestFocus();
        pack();
        setLocationRelativeTo(null);
        
        su_username.setText("@");
        su_username.setForeground(Color.GRAY);
        
        su_username.addFocusListener(new java.awt.event.FocusAdapter() {
        @Override
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (su_username.getText().equals("@")) {
                su_username.setText("");
                su_username.setForeground(Color.BLACK);
            }
        }
        @Override
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (su_username.getText().isEmpty()) {
                su_username.setText("@");
                su_username.setForeground(Color.GRAY);
               
            } 
        }

    });  
        su_contact.setText("09");
        su_contact.setForeground(Color.GRAY);
        
        su_contact.addFocusListener(new java.awt.event.FocusAdapter() {    
        @Override
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (su_contact.getText().equals("09")) {
                su_contact.setText("");
                su_contact.setForeground(Color.BLACK);
            }
        }
        @Override
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (su_contact.getText().isEmpty()) {
                su_contact.setText("09");
                su_contact.setForeground(Color.GRAY);
               
            } 
        }

    });
        su_contact.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyTyped(java.awt.event.KeyEvent evt) {
        // Limit the input to 11 characters
        if (su_contact.getText().length() >= 11) {
            evt.consume();
        }
    }
});

    }
    
    public String getusername() {
        return username;
    }

    public String getpassword() {
        return password;
    }
    
    public String getfirstname(){
        return firstname;
    }
    
    public String getlastname(){
        return lastname;
    }
    
    public  String getcontact(){
        return contact;
    }
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pink = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        su_firstname = new javax.swing.JTextField();
        su_lastname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        su_contact = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        su_username = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        su_password = new javax.swing.JTextField();
        create = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        female = new javax.swing.JCheckBox();
        male = new javax.swing.JCheckBox();
        ln = new javax.swing.JLabel();
        fn = new javax.swing.JLabel();
        cn = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        un = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pink.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign Up");

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("First Name");

        su_firstname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        su_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                su_firstnameActionPerformed(evt);
            }
        });
        su_firstname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                su_firstnameKeyReleased(evt);
            }
        });

        su_lastname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        su_lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                su_lastnameActionPerformed(evt);
            }
        });
        su_lastname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                su_lastnameKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Contact Number");

        su_contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        su_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                su_contactActionPerformed(evt);
            }
        });
        su_contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                su_contactKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Username");

        su_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        su_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                su_usernameActionPerformed(evt);
            }
        });
        su_username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                su_usernameKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Password");

        su_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        su_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                su_passwordActionPerformed(evt);
            }
        });
        su_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                su_passwordKeyReleased(evt);
            }
        });

        create.setBackground(new java.awt.Color(0, 102, 102));
        create.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        create.setForeground(new java.awt.Color(255, 255, 255));
        create.setText("CREATE");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Sex:");

        female.setForeground(new java.awt.Color(0, 102, 102));
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        male.setForeground(new java.awt.Color(0, 102, 102));
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        ln.setFont(new java.awt.Font("Helvetica Neue", 2, 10)); // NOI18N
        ln.setForeground(new java.awt.Color(255, 51, 51));
        ln.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lnKeyReleased(evt);
            }
        });

        fn.setFont(new java.awt.Font("Helvetica Neue", 2, 10)); // NOI18N
        fn.setForeground(new java.awt.Color(255, 51, 51));
        fn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fnKeyReleased(evt);
            }
        });

        cn.setFont(new java.awt.Font("Helvetica Neue", 2, 10)); // NOI18N
        cn.setForeground(new java.awt.Color(255, 51, 51));
        cn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cnKeyReleased(evt);
            }
        });

        pass.setFont(new java.awt.Font("Helvetica Neue", 2, 10)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 51, 51));
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passKeyReleased(evt);
            }
        });

        un.setFont(new java.awt.Font("Helvetica Neue", 2, 10)); // NOI18N
        un.setForeground(new java.awt.Color(255, 51, 51));
        un.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 2, 12)); // NOI18N
        jLabel12.setText("* Password must be 6-30 characters");

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 2, 12)); // NOI18N
        jLabel13.setText("* contain only letters, numbers, and ,.,_");

        javax.swing.GroupLayout pinkLayout = new javax.swing.GroupLayout(pink);
        pink.setLayout(pinkLayout);
        pinkLayout.setHorizontalGroup(
            pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pinkLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pinkLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pinkLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pinkLayout.createSequentialGroup()
                                .addComponent(su_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(pinkLayout.createSequentialGroup()
                                .addGroup(pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pinkLayout.createSequentialGroup()
                                        .addGroup(pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(su_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                                .addComponent(su_username)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(un, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pinkLayout.createSequentialGroup()
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pinkLayout.createSequentialGroup()
                                            .addGroup(pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(su_contact, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(su_lastname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27))))))
            .addGroup(pinkLayout.createSequentialGroup()
                .addGroup(pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pinkLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(create))
                    .addGroup(pinkLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pinkLayout.setVerticalGroup(
            pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pinkLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(su_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(su_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(su_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(female)
                        .addComponent(male)))
                .addGap(6, 6, 6)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(su_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(un, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pinkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(su_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        getContentPane().add(pink, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 360, 520));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Once you created an account,");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("login using the information that");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("you've input into login section.");

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Remember:");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("back");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("@ GROUP 5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel16)))
                .addGap(100, 100, 100))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(330, 330, 330)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel8)
                .addGap(0, 0, 0)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void su_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_su_firstnameActionPerformed
        // TODO add your handling code here:  
        
    }//GEN-LAST:event_su_firstnameActionPerformed

    private void su_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_su_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_su_contactActionPerformed

    private void su_lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_su_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_su_lastnameActionPerformed

    private void su_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_su_passwordActionPerformed
        // TODO add your handling code here:
     
   
    }//GEN-LAST:event_su_passwordActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        
        String usernamee = su_username.getText();
        String passwordd = su_password.getText();
        String firstnamee = su_firstname.getText();
        String lastnamee = su_lastname.getText();
        String contactt = su_contact.getText();
        
        if (usernamee.isEmpty() || passwordd.isEmpty() || firstnamee.isEmpty() || lastnamee.isEmpty() || contactt.isEmpty()){
           JOptionPane.showMessageDialog(this, "PLEASE FILL OUT ALL FIELDS","ERROR",JOptionPane.WARNING_MESSAGE);
        return;
        }
        String gender;
        if (male.isSelected() && !female.isSelected()) {
        gender = "Male";
        } else if (!male.isSelected() && female.isSelected()) {
        gender = "Female";
        } else {
        JOptionPane.showMessageDialog(this, "Please select only one gender.", "ERROR", JOptionPane.WARNING_MESSAGE);
        return;
        }
        
        if (!firstnamee.matches("^[a-zA-Z]{1,30}$") 
                || !lastnamee.matches("^[a-zA-Z]{1,30}$") 
                || !contactt.matches("^09[0-9]{9}$")  
                || !usernamee.matches("^@[a-zA-Z0-9._]{0,100}$")
                || passwordd.length() < 0 
                && passwordd.matches("^[a-zA-Z0-9@,._]{0,50}$")) {
        JOptionPane.showMessageDialog(this, "Please input the correct format in the wrong field.", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
        
        /*if (!lastnamee.matches("^[a-zA-Z]{1,30}$")) {
        JOptionPane.showMessageDialog(this, "Last name must contain only letters and be 1-30 characters long.", "ERROR", JOptionPane.WARNING_MESSAGE);
        return;
        }
        if (!contactt.matches("^09[0-9]{0,10}$")){
        JOptionPane.showMessageDialog(this, "Contact number must be started 09 and add exactly 9 digits.", "ERROR", JOptionPane.WARNING_MESSAGE);
        return;
        }
        if (!usernamee.matches("^@[a-zA-Z0-9._]{0,100}$")) {
        JOptionPane.showMessageDialog(this, "Username must be start with @ sign then alphanumeric.", "ERROR", JOptionPane.WARNING_MESSAGE);
        return;
        }
        /*if (passwordd.length() < 6 && passwordd.matches("^[a-zA-Z0-9@,._]{0,50}$")) {
        JOptionPane.showMessageDialog(this, "Password must be at least 6 characters long.", "ERROR", JOptionPane.WARNING_MESSAGE);
        }*/
        
        
        else{
        JOptionPane.showMessageDialog(this, "ACCOUNT SUCESSFULLY CREATED", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
         
        datauser.su_lastname = lastnamee;
        datauser.su_firstname = firstnamee;
        datauser.su_username = usernamee;
        datauser.su_password = passwordd;
        datauser.su_contact = contactt;
        datauser.su_sex = gender;
        //datauser dt = new datauser();
        //dt.information(lastnamee, firstnamee, usernamee, passwordd, contactt, gender);
        this.dispose();  
        login lg = new login();
        lg.setVisible(true);   
         
        }
    }//GEN-LAST:event_createActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void su_firstnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_su_firstnameKeyReleased
        String PATTERN = "^[a-zA-Z]{2,30}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(su_firstname.getText());
        if(!match.matches()){
            fn.setText("Invalid Input");
        }
        else{
            fn.setText(null);
            
        } 
    }//GEN-LAST:event_su_firstnameKeyReleased

    private void su_lastnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_su_lastnameKeyReleased
        String PATTERN = "^[a-zA-Z]{0,30}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(su_lastname.getText());
        if(!match.matches()){
            ln.setText("Invalid Input");
        }
        else{
            ln.setText(null);
        }
    }//GEN-LAST:event_su_lastnameKeyReleased

    private void su_contactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_su_contactKeyReleased
        String PATTERN = "^09[0-9]{9}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(su_contact.getText());
        if(!match.matches()){
            cn.setText("Invalid Input");
        }
        else{
            cn.setText(null);
        }
    }//GEN-LAST:event_su_contactKeyReleased

    private void su_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_su_usernameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_su_usernameActionPerformed

    private void su_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_su_passwordKeyReleased
        String PATTERN = "^[a-zA-Z0-9@,._]{0,50}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(su_password.getText());
        if(!match.matches()){
            pass.setText("Invalid Input");
        }
        else{
            pass.setText(null);
        }
        
    }//GEN-LAST:event_su_passwordKeyReleased

    private void su_usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_su_usernameKeyReleased
        String PATTERN = "^@[a-zA-Z0-9._]{0,30}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(su_username.getText());
        if(!match.matches()){
            un.setText("Invalid Input");
        }
        else{
            un.setText(null);
        }
    }//GEN-LAST:event_su_usernameKeyReleased

    private void passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyReleased
        
    }//GEN-LAST:event_passKeyReleased

    private void unKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unKeyReleased
        
    }//GEN-LAST:event_unKeyReleased

    private void cnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnKeyReleased
        
    }//GEN-LAST:event_cnKeyReleased

    private void lnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnKeyReleased
        
    }//GEN-LAST:event_lnKeyReleased

    private void fnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnKeyReleased
        
    }//GEN-LAST:event_fnKeyReleased

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        login lg = new login();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cn;
    private javax.swing.JButton create;
    public javax.swing.JCheckBox female;
    private javax.swing.JLabel fn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel ln;
    public javax.swing.JCheckBox male;
    private javax.swing.JLabel pass;
    private javax.swing.JPanel pink;
    public static javax.swing.JTextField su_contact;
    public static javax.swing.JTextField su_firstname;
    public static javax.swing.JTextField su_lastname;
    public static javax.swing.JTextField su_password;
    public static javax.swing.JTextField su_username;
    private javax.swing.JLabel un;
    // End of variables declaration//GEN-END:variables
}
