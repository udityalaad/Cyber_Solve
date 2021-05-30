/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccns_practicals;

/**
 *
 * @author Uditya
 */
public class Playfair_Cipher extends javax.swing.JFrame {
    
    char MATRIX[][];
    String KEY;
    char FILLER;

    /**
     * Creates new form Playfair_Cipher
     */
    public Playfair_Cipher() {
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

        Filler = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Encrypted_CT = new javax.swing.JTextField();
        Decrypted_PT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        PT = new javax.swing.JTextField();
        Key = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton3.setText("Go Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Plain Text");

        jLabel2.setText("Cipher Text");

        Encrypted_CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Encrypted_CTActionPerformed(evt);
            }
        });

        Decrypted_PT.setToolTipText("");

        jLabel3.setText("Cipher Text");

        jButton1.setText("Find Cipher Text");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Plain Text");

        jButton2.setText("Find Plain Text");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Key");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("PLAYFAIR CIPHER");

        jLabel7.setText("Filler");

        CT.setToolTipText("");
        CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Encrypted_CT, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(PT, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButton1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(83, 83, 83))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CT, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(Decrypted_PT, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(253, 253, 253)))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Key, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Filler, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(278, 278, 278))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Key, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(Filler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jButton1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(PT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Encrypted_CT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30)
                                .addComponent(jButton2))
                            .addComponent(CT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Decrypted_PT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(jButton3)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        setVisible(false);
        new Main_Page().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Encrypted_CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Encrypted_CTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Encrypted_CTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        Encrypted_CT.setText(Encrypt(PT.getText(), Key.getText(), Filler.getText().charAt(0)));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        Decrypted_PT.setText(Decrypt(CT.getText(), Key.getText(), Filler.getText().charAt(0)));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CTActionPerformed

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
            java.util.logging.Logger.getLogger(Playfair_Cipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Playfair_Cipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Playfair_Cipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Playfair_Cipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Playfair_Cipher().setVisible(true);
            }
        });
    }

    
    void Create_Matrix () {
        int no_key_char_in_matrix = 0;
        
        int count = 0;
        boolean finished = false;
        for (int i = 0; i < MATRIX.length; i++) {
            for (int j = 0; j < MATRIX[0].length; j++) {
                while(true) {
                    if (!Matrix_Contains(MATRIX, KEY.charAt(count))) {
                        MATRIX[i][j] = KEY.charAt(count);
                        no_key_char_in_matrix++;
                        
                        count++;
                        break;
                    }
                    
                    count++;
                    
                    if (count == KEY.length()) {
                        finished = true;
                        break;
                    }
                }
                
                if (count == KEY.length()) {
                    finished = true;
                    break;
                }
            }
            
            if (finished) {
                break;
            }
        }
        
        
        char current_character = 'A';
        int i_start = no_key_char_in_matrix / MATRIX.length;
        for (int i = i_start; i < MATRIX.length; i++) {
            int j_start;
            
            if (i == i_start) {
                j_start = no_key_char_in_matrix % MATRIX.length;
            }
            else {
                j_start = 0;
            }
            
            for (int j = j_start; j < MATRIX[0].length; j++) {
                while(true) {
                    if (!Matrix_Contains(MATRIX, current_character)  &&  (current_character != 'J')) {
                        MATRIX[i][j] = current_character++;
                        break;
                    }
                    
                    if (current_character == 'Z') {
                        break;
                    }
                    
                    current_character++;
                }
            }
        }
        
        
        System.out.println("\n\nMatrix:");
        for (int i = 0; i < MATRIX.length; i++) {
            for (int j = 0; j < MATRIX[0].length; j++) {
                System.out.print(MATRIX[i][j]);
                
                if (j != (MATRIX[0].length - 1)) {
                    System.out.print("  ");
                }
            }
            
            System.out.println();
        }
    }
    
    
    
    boolean Matrix_Contains (char[][] matrix, char c) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == c) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    
    
    
    String Encrypt (String plain_text, String key, char filler) {
        KEY = key;
        FILLER = filler;
        
        MATRIX = new char[5][5];
        Create_Matrix();
        
        
        System.out.println("\n\nENCRYPTION PROCESS:");
        System.out.println("  Plain Text:" + plain_text);
        
        plain_text = plain_text.replaceAll("J", "I");
        
        plain_text = Insert_Filler(plain_text);
        
        System.out.println("  Plain Text With Filler:" + plain_text);
        
        String cipher_text = "";
        
        for (int i = 0; i < plain_text.length(); i += 2) {
            int row, col;
            
            int pos_char_1[] = Find_Character_Position_In_Matrix(plain_text.charAt(i));
            int char_1_row = pos_char_1[0];
            int char_1_col = pos_char_1[1];
            
            int pos_char_2[] = Find_Character_Position_In_Matrix(plain_text.charAt(i+1));
            int char_2_row = pos_char_2[0];
            int char_2_col = pos_char_2[1];
            
            
            if (char_1_row == char_2_row) {
                row = char_1_row;
                col = Find_Modulus(char_1_col + 1,  MATRIX[0].length);
                cipher_text += Character.toString(MATRIX[row][col]);
                
                row= char_2_row;
                col = Find_Modulus(char_2_col + 1,  MATRIX[0].length);
                cipher_text += Character.toString(MATRIX[row][col]);
            }
            else if (char_1_col == char_2_col) {
                row = Find_Modulus(char_1_row + 1, MATRIX[0].length);
                col = char_1_col;
                cipher_text += Character.toString(MATRIX[row][col]);
                
                row = Find_Modulus(char_2_row + 1,  MATRIX[0].length);
                col = char_2_col;
                cipher_text += Character.toString(MATRIX[row][col]);
            }
            else {
                row = char_1_row;
                col = char_2_col;
                cipher_text += Character.toString(MATRIX[row][col]);
                
                row = char_2_row;
                col = char_1_col;
                cipher_text += Character.toString(MATRIX[row][col]);
            }
        }
        
        return cipher_text;
    }
    
    
    
    String Decrypt (String cipher_text, String key, char filler) {
        KEY = key;
        FILLER = filler;
        
        MATRIX = new char[5][5];
        Create_Matrix();
        
        
        System.out.println("\nDECRYPTION PROCESS:");
        System.out.println("  Cipher Text:" + cipher_text);
        
        String plain_text = "";
        
        for (int i = 0; i < cipher_text.length(); i += 2) {
            int row, col;
            
            int pos_char_1[] = Find_Character_Position_In_Matrix(cipher_text.charAt(i));
            int char_1_row = pos_char_1[0];
            int char_1_col = pos_char_1[1];
            
            int pos_char_2[] = Find_Character_Position_In_Matrix(cipher_text.charAt(i+1));
            int char_2_row = pos_char_2[0];
            int char_2_col = pos_char_2[1];
            
            if (char_1_row == char_2_row) {
                row = char_1_row;
                col = Find_Modulus(char_1_col - 1, MATRIX[0].length);
                plain_text += Character.toString(MATRIX[row][col]);
                
                row= char_2_row;
                col = Find_Modulus(char_2_col - 1, MATRIX[0].length);
                plain_text += Character.toString(MATRIX[row][col]);
            }
            else if (char_1_col == char_2_col) {
                row = Find_Modulus(char_1_row - 1, MATRIX[0].length);
                col = char_1_col;
                plain_text += Character.toString(MATRIX[row][col]);
                
                row = Find_Modulus(char_2_row - 1, MATRIX[0].length);
                col = char_2_col;
                plain_text += Character.toString(MATRIX[row][col]);
            }
            else {
                row = char_1_row;
                col = char_2_col;
                plain_text += Character.toString(MATRIX[row][col]);
                
                row = char_2_row;
                col = char_1_col;
                plain_text += Character.toString(MATRIX[row][col]);
            }
        }
        
        System.out.println("  Plain Text With Filler:" + plain_text);
        
        plain_text = Remove_Filler(plain_text);
        
        return plain_text;
    }
    
    
    
    String Insert_Filler (String input) {
        String output = input;
        
        for (int i = 0; i < output.length(); i += 2) {
            if (i == (output.length() - 1)) {
                output += Character.toString(FILLER);
            }
            else if (output.charAt(i) == output.charAt(i+1)) {
                output = output.substring(0, i+1) + Character.toString(FILLER) + output.substring(i+1, output.length());
            }
        }
        
        return output;
    }
    
    
    String Remove_Filler (String input) {
        String output = input;
        
        for (int i = 0; i < output.length(); i++) {
            if (output.charAt(i) == FILLER) {
                output = output.substring(0, i) + output.substring(i+1, output.length());
                i--;
            }
        }
        
        return output;
    }
    
    
    
    
    int Find_Modulus (int dividend, int divisor) {
        if (dividend == -1) {
            dividend = divisor - 1;
        }
        
        int quotient = dividend % divisor;
        
        return quotient;
    }
    
    
    int[] Find_Character_Position_In_Matrix (char c) {
        int position[] = new int[2];
        
        for (int i = 0; i < MATRIX.length; i++) {
            for (int j = 0; j < MATRIX[0].length; j++) {
                if (MATRIX[i][j] == c) {
                    position[0] = i;
                    position[1] = j;
                    
                    return position;
                }
            }
        }
        
        return null;
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CT;
    private javax.swing.JTextField Decrypted_PT;
    private javax.swing.JTextField Encrypted_CT;
    private javax.swing.JTextField Filler;
    private javax.swing.JTextField Key;
    private javax.swing.JTextField PT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}