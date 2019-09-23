import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class graficar extends javax.swing.JApplet {

    @Override
    public void init() {
        resize(350,500);
        this.getContentPane() .setBackground(Color.white);
        
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
            java.util.logging.Logger.getLogger(graficar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(graficar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(graficar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(graficar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    int num1,num2,num3 = 0;
    String funciones;
    double punto,y = 0;
    
    public void grafica(){
        if (valor1.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "Ingrese un valor negativo");
        valor1.requestFocus();
        }else{
            num1 = Integer.parseInt(valor1.getText());
            
            if(num3<num1 || num3 == num1){
            JOptionPane.showMessageDialog(null, "ingrese un valor negativo menor que 0");
            valor1.requestFocus();
            }else{
                if (valor2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor positivo");
                valor2.requestFocus();
                }else{
                num2 = Integer.parseInt(valor2.getText());
                Graphics p = getGraphics();
                p.setColor(new Color(255,255,255));
                p.fillRect(0,100,300,400);
                p.setColor(new Color(0,0,0));
                p.drawLine(50, 300, 300, 300);
                p.drawLine(150, 100, 150, 350);
                p.setColor(new Color(255,0,0));
                
                for(int i =50; i < 300; i+=8){
                    p.drawLine(i, 305, i, 295);
                }
                for (int j = 120; j < 350; j+=8){
                    p.drawLine(145 , j, 155, j);
                }
                //capturamos el valor escogido en el combobox
                funciones = cambio.getSelectedItem().toString();
                
                for(double x = num1; x < num2; x+=0.01){
                punto = 150 + x * 30;
                //instrucciones switch que evalua la variable cambio
                switch(funciones){
                    //coseno
                    case "Cos":
                        y = 300-Math.cos(x)*30;
                        break; 
                    //seno
                    case "Sin":
                        y = 300-Math.sin(x)*30;
                        break;
                    //tangente
                    case "Tan":
                        y = 300-Math.sin(x)*30;
                        break;
                    }
                p.drawLine((int)punto, (int)y, (int)punto + 1, (int)y +1);
                
                }
            }
        }
    }
}
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cambio = new javax.swing.JComboBox<>();
        res = new javax.swing.JButton();
        valor1 = new javax.swing.JTextField();
        valor2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cambio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cos", "Sin", "Tan" }));
        cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambioActionPerformed(evt);
            }
        });
        getContentPane().add(cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 72, -1, -1));

        res.setText("Graficar");
        res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resActionPerformed(evt);
            }
        });
        getContentPane().add(res, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 71, -1, -1));
        getContentPane().add(valor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 74, 91, -1));
        getContentPane().add(valor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 74, 103, -1));

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Ingrese valor X:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 45, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Ingrese valor Y:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 45, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 743, 570));
    }// </editor-fold>//GEN-END:initComponents

    private void resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resActionPerformed
        grafica();
    }//GEN-LAST:event_resActionPerformed

    private void cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cambioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cambio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton res;
    private javax.swing.JTextField valor1;
    private javax.swing.JTextField valor2;
    // End of variables declaration//GEN-END:variables
}
