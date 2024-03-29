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
public class Hill_Cipher extends javax.swing.JFrame {
    int KEY[][];
    char FILLER;
    
    int s1 = 1, s2 = 0;
    int t1 = 0, t2 = 1;
    
    /**
     * Creates new form Hill_Cipher
     */
    public Hill_Cipher() {
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

        jLabel6 = new javax.swing.JLabel();
        Filler = new javax.swing.JTextField();
        PT = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Encrypted_CT = new javax.swing.JTextField();
        CT = new javax.swing.JTextField();
        Decrypted_PT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Key = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Key");

        jButton3.setText("Go Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Plain Text");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("HILL CIPHER");

        jLabel2.setText("Cipher Text");

        jLabel7.setText("Filler");

        Encrypted_CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Encrypted_CTActionPerformed(evt);
            }
        });

        CT.setToolTipText("");
        CT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTActionPerformed(evt);
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

        Key.setColumns(20);
        Key.setRows(5);
        jScrollPane1.setViewportView(Key);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
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
                .addGap(0, 61, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Filler, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(306, 306, 306))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(Filler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
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
                .addGap(53, 53, 53))
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

    private void CTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        Encrypted_CT.setText(Encrypt(PT.getText(), Key.getText(), Filler.getText().charAt(0)));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        Decrypted_PT.setText(Decrypt(CT.getText()));
    }//GEN-LAST:event_jButton2ActionPerformed

    
    void Initialize (String key_string, char Filler) {
        String array_1[] = key_string.split("\n");
        
        KEY = new int[array_1.length][array_1[0].split("\t").length];
        for (int i = 0; i < KEY.length; i++) {
            String array_2[] = array_1[i].split("\t");
            
            for (int j = 0; j < KEY[0].length; j++) {
                KEY[i][j] = Integer.parseInt(array_2[j]);
            }
        }
        
        
        FILLER = Filler;
    }
    
    
    String Encrypt (String PT, String key_string, char Filler) {
        Initialize (key_string, Filler);
        
        System.out.println("\nENCRYPTION:");
        
        String PT_with_filler = Add_Filler(PT);
        System.out.print("    Adding Filler (if required): PT = " + PT_with_filler);
        
        int PT_matrix[][] = String_To_Matrix(PT_with_filler);
        
        System.out.print("\n\n    CT\t= (K * PT) (mod 26)");
        
        System.out.print("\n\t=");
        int K_into_PT[][] = Multiply_Matrices(KEY, PT_matrix);
        System.out.print("\t  (mod 26)");
        
        System.out.print("\n\t=");
        int CT_matrix[][] = Matrix_Mod(K_into_PT, 26, "All");
        
        String CT = Matrix_To_String(CT_matrix);
        
        return CT;
    }
    
    
    
    String Decrypt (String CT) {
        System.out.println("\n\n\nDECRYPTION:");
        int CT_matrix[][] = String_To_Matrix(CT);
        
        int key_determinant = Determinant(KEY);
        System.out.print("    Det(k) = " + key_determinant);
        
        int mul_inverse_OF_key_det = Find_Multiplicative_Inverse(26, key_determinant);
        
        
        System.out.print("\n\n\n    Adj(k) =");
        int key_adjoint_after[][] = Adjoint(KEY);
        System.out.print("\t=");
        int key_adjoint_after_mod_negative[][] = Matrix_Mod(key_adjoint_after, 26, "Negative Only");
        
        
        System.out.print("\n    K^-1 = (1 / " + key_determinant + ") * Adj(k)");
        System.out.print("\n\t= (" + mul_inverse_OF_key_det + ") * Adj(k)");
        
        System.out.print("\n\t=");
        int key_inverse[][] =  Matrix_Multiply(key_adjoint_after_mod_negative, mul_inverse_OF_key_det);
        System.out.print("\t  (mod 26)");
        
        System.out.print("\n\t=");
        int key_inverse_after_mod[][] = Matrix_Mod(key_inverse, 26, "All");
        
        
        System.out.print("\n    PT\t= (K^-1 * CT) (mod 26)");
        System.out.print("\n\t=");
        int K_inverse_into_PT[][] = Multiply_Matrices(key_inverse_after_mod, CT_matrix);
        System.out.print("\t  (mod 26)");
        
        System.out.print("\n\t=");
        int PT_with_filler_matrix[][] = Matrix_Mod(K_inverse_into_PT, 26, "All");
        
        
        String PT_with_filler = Matrix_To_String(PT_with_filler_matrix);
        System.out.print("\n    PT with Filler (if any): PT = " + PT_with_filler);
        
        String PT = Remove_Filler(PT_with_filler);
        
        return PT;
    }
    
    
    
    String Add_Filler(String s) {
        if ((s.length() % KEY.length) == 0) {
            return s;
        }
        
        String s_with_filler = s;
        for (int i = 0; i < (KEY.length  -  (s.length() % KEY.length)); i++) {
            s_with_filler += Character.toString(FILLER);
        }
        
        return s_with_filler;
    }
    
    
    
    String Remove_Filler(String s) {
        return s.replaceAll(Character.toString(FILLER), "");
    }
    
    
    
    int[][] String_To_Matrix (String s) {
        int matrix[][] = new int[KEY.length][s.length() / KEY.length];
        
        int char_pos = 0;
        for (int i = 0; i <  matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = ((int) s.charAt(char_pos++))  -  65;
            }
        }
        
        return matrix;
    }
    
    
    
    String Matrix_To_String (int matrix[][]) {
        String s = "";
        
        for (int i = 0; i <  matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                s += Character.toString((char) (matrix[j][i] + 65));
            }
        }
        
        return s;
    }
    
    
    
    void Display_Matrix (int matrix[][]) {
        System.out.print("\n");
        
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("\t  ");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
                
                if (j  !=  (matrix[0].length - 1)) {
                    System.out.print("\t");
                }
            }
            
            System.out.print("\n");
        }
    }
    
    
    
    
    int[][] Multiply_Matrices (int[][] matrix_1, int[][] matrix_2) {
        int[][] product_matrix = new int[matrix_1.length][matrix_2[0].length];
        
        for (int i = 0; i <  matrix_1.length; i++) {
            for (int j = 0; j < matrix_2[0].length; j++) {
                int sum = 0;
                
                for (int k = 0; k < matrix_2.length; k++) {
                    sum += matrix_1[i][k] * matrix_2[k][j];
                }
                
                product_matrix[i][j] = sum;
            }
        }
        
        Display_Matrix(product_matrix);
        
        return product_matrix;
    }
    
    
    
    
    int[][] Matrix_Multiply (int matrix[][], int multiplier) {
        int resulting_matrix[][] = new int[matrix.length][matrix[0].length];
        
        for (int i = 0; i <  resulting_matrix.length; i++) {
            for (int j = 0; j < resulting_matrix[0].length; j++) {
                resulting_matrix[i][j] = matrix[i][j] * multiplier;
            }
        }
        
        Display_Matrix(resulting_matrix);
        
        return resulting_matrix;
    }
    
    
    
    int[][] Matrix_Mod (int matrix[][], int divisor, String task) {
        int resulting_matrix[][] = new int[matrix.length][matrix[0].length];
        
        if (task == "All") {
            for (int i = 0; i <  resulting_matrix.length; i++) {
                for (int j = 0; j < resulting_matrix[0].length; j++) {
                    if (matrix[i][j] < 0) {
                        resulting_matrix[i][j] = 26 + (matrix[i][j] % divisor);
                    }
                    else {
                        resulting_matrix[i][j] = matrix[i][j] % divisor;
                    }
                }
            }
        }
        else if (task == "Negative Only") {
            for (int i = 0; i <  resulting_matrix.length; i++) {
                for (int j = 0; j < resulting_matrix[0].length; j++) {
                    if (matrix[i][j] < 0) {
                        resulting_matrix[i][j] = 26 + (matrix[i][j] % divisor);
                    }
                    else {
                        resulting_matrix[i][j] = matrix[i][j];
                    }
                }
            }
        }
        
        Display_Matrix(resulting_matrix);
        
        return resulting_matrix;
    }
    
    
    
    int Determinant (int matrix[][]) {
        // if Matrix contains only one element
        if ((matrix.length == 1)  &&  (matrix[0].length == 1)) {
            return matrix[0][0];
        }
        
        int det = 0;
        int sign = 1;
        
        // Iterate through the elements of first row
        for (int j = 0; j < matrix[0].length; j++) {
            det += sign * matrix[0][j] * Determinant(Get_Cofactor(matrix, 0, j));
            
            sign = - sign;
        }
        
        return det;
    }
    
    
    
    int[][] Get_Cofactor (int matrix[][], int row, int column) {
        int resulting_matrix[][] = new int[matrix.length - 1][matrix[0].length - 1];
        
        int x = 0;
        for (int i = 0; i <  matrix.length; i++) {
            if (i != row) {
                int y = 0;
                
                for (int j = 0; j < matrix[0].length; j++) {
                    if (j != column) {
                        resulting_matrix[x][y] = matrix[i][j];
                        
                        y++;
                    }
                }
                
                x++;
            }
        }
        
        return resulting_matrix;
    }
    
    
    
    int[][] Adjoint (int matrix[][]) {
        int resulting_matrix[][] = new int[matrix.length][matrix[0].length];
        
        // if Matrix contains only one element
        if ((matrix.length == 1)  &&  (matrix[0].length == 1)) {
            resulting_matrix[0][0] = 1;
            
            return resulting_matrix;
        }
        
        // Iterate through the elemnts of first row
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int sign = (int) Math.pow(-1, i + j);
                int cofactor[][] = Get_Cofactor(matrix, i, j);
                
                resulting_matrix[j][i] = sign * Determinant(cofactor);
            }
        }
        
        Display_Matrix(resulting_matrix);
        
        return resulting_matrix;
    }
    
    
    
    int Find_Multiplicative_Inverse (int r1, int r2) {
        System.out.print("\n\n    ---------------------------------------------------------------------------");
        System.out.print("\n                      Multiplicative Inverse of " + r2 + " in Z_" + r2);
        System.out.print("\n    ---------------------------------------------------------------------------");
        System.out.print("\n     q\tr1\tr2\tr\ts1\ts2\ts\tt1\tt2\tt");
        System.out.print("\n    ---------------------------------------------------------------------------");
        
        int gcd = Find_GCD(r1, r2);
        
        System.out.print("\n\n    gcd(" + r1 + "," + r2 + ") = " + gcd);
        
        
        int multiplicative_inverse = -1;
        
        if (gcd == 1) {
            if (t1 < 0) {
                multiplicative_inverse = r1 + t1;
            }
            else {
                multiplicative_inverse = t1;
            }
            System.out.print("\n    Multiplicative Inverse of " + r2 + " in Z_" + r1 + ": " + multiplicative_inverse);
        }
        else {
            System.out.print("\n    Multiplicative Inverse of " + r2 + " in Z_" + r1 + " does not exist.");
        }
        
        s1 = 1;
        s2 = 0;
        
        t1 = 0;
        t2 = 1;
        
        return multiplicative_inverse;
    }
    
    
    
    int Find_GCD (int r1, int r2) {
        if (r2 == 0) {
            System.out.print("\n    \t" + r1 + "\t" + r2 + "\t\t" + s1 + "\t" + s2 + "\t\t" + t1 + "\t" + t2);
            return r1;
        }
        
        int q = r1 / r2;
        int r = r1 % r2;
        
        int s = s1 - (q * s2);
        int t = t1 - (q * t2);
        
        System.out.print("\n     " + q + "\t" + r1 + "\t" + r2 + "\t" + r + "\t" + s1 + "\t" + s2 + "\t" + s + "\t" + t1 + "\t" + t2 + "\t" + t);
        
        s1 = s2;
        s2 = s;
        
        t1 = t2;
        t2 = t;
        
        return Find_GCD (r2, r);
    }
    
    
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
            java.util.logging.Logger.getLogger(Hill_Cipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hill_Cipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hill_Cipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hill_Cipher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hill_Cipher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CT;
    private javax.swing.JTextField Decrypted_PT;
    private javax.swing.JTextField Encrypted_CT;
    private javax.swing.JTextField Filler;
    private javax.swing.JTextArea Key;
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
