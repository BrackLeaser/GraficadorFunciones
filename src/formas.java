
import javax.swing.JOptionPane;

public class formas extends javax.swing.JFrame {
    public formas() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numero1 = new javax.swing.JTextField();
        numero2 = new javax.swing.JTextField();
        res = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        contenedor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Open Sans Semibold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Ingrese primer valor:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Open Sans Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Ingrese segundo valor:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        numero1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero1ActionPerformed(evt);
            }
        });
        numero1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numero1KeyTyped(evt);
            }
        });
        getContentPane().add(numero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 200, -1));

        numero2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero2ActionPerformed(evt);
            }
        });
        numero2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numero2KeyTyped(evt);
            }
        });
        getContentPane().add(numero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 200, -1));

        res.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(res, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 234, -1));

        jLabel3.setFont(new java.awt.Font("Open Sans Semibold", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Resultado");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        jButton1.setText("Sumar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jButton2.setText("Restar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        jButton3.setText("Dividir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        jButton4.setText("Multiplicar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, -1, -1));

        jLabel4.setFont(new java.awt.Font("Open Sans Semibold", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Operaciones Basica");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        jButton5.setText("Limpiar Pantalla");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgenes/regresar-flecha-curva.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, 80, 70));

        jButton7.setText("Raiz");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 70, -1));

        jButton8.setText("x^n");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 70, 30));

        contenedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgenes/fondo.jpg"))); // NOI18N
        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double num1 = Double.parseDouble(numero1.getText());
        double num2 = Double.parseDouble(numero2.getText());
        res.setText(String.valueOf(num1+num2));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        double num1 = Double.parseDouble(numero1.getText());
        double num2 = Double.parseDouble(numero2.getText());
        res.setText(String.valueOf(num1-num2));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        double num1 = Double.parseDouble(numero1.getText());
        double num2 = Double.parseDouble(numero2.getText());
        res.setText(String.valueOf(num1/num2));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        double num1 = Double.parseDouble(numero1.getText());
        double num2 = Double.parseDouble(numero2.getText());
        res.setText(String.valueOf(num1*num2));
    }//GEN-LAST:event_jButton4ActionPerformed
                
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        res.setText("");
        numero1.setText("");
        numero2.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        menu cam1 = new menu();
        cam1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String campo1;
        int numero;
        double calcular = 0;
        campo1 = numero1.getText();
        numero = Integer.parseInt(campo1);
        calcular = Math.sqrt(numero);
        res.setText(String.valueOf(calcular));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String campo2, campo3;
        int base, n;
        double calcular = 0;
        campo2 = numero1.getText();
        campo3= numero2.getText();
        base = Integer.parseInt(campo2);
        n = Integer.parseInt(campo3);
        calcular = Math.pow(base,n);
        res.setText(String.valueOf(calcular));
    }//GEN-LAST:event_jButton8ActionPerformed

    private void numero1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numero1KeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9') && (car<',' || car>'.'))evt.consume();
    }//GEN-LAST:event_numero1KeyTyped

    private void numero2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numero2KeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9') && (car<',' || car>'.'))evt.consume();
    }//GEN-LAST:event_numero2KeyTyped

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
            java.util.logging.Logger.getLogger(formas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formas().setVisible(true);
            }});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contenedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField numero1;
    private javax.swing.JTextField numero2;
    private javax.swing.JTextField res;
    // End of variables declaration//GEN-END:variables
}
