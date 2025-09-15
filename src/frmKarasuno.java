package practica;


import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class frmKarasuno extends javax.swing.JFrame {
    
    Jugador jugadores[];
    
    Color colorOgJtf = new Color(232,223,213);
    Color colorNwJtf = new Color(219,187,167);

    public frmKarasuno() {
        initComponents();
        jtfNombre.requestFocus();
    }
    public void limpiarCampos(){
        JTextField[] campos = {
            jtfNombre,
            jtfEdad,
            jtfEstatura,
            jtfDorsal,
            jtfPosicion
        };
        
        //Recoorer todos los campos
        for(JTextField campo : campos){
            campo.setText("");
            campo.setBackground(colorOgJtf);
            campo.setEditable(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jblTitulo = new javax.swing.JLabel();
        jblAvisos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jblNombre = new javax.swing.JLabel();
        jblEdad = new javax.swing.JLabel();
        jblEstatura = new javax.swing.JLabel();
        jblDorsal = new javax.swing.JLabel();
        jblPosicion = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfEdad = new javax.swing.JTextField();
        jtfEstatura = new javax.swing.JTextField();
        jtfDorsal = new javax.swing.JTextField();
        jtfPosicion = new javax.swing.JTextField();
        jblm = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbnAgregar = new javax.swing.JButton();
        jbnBuscar = new javax.swing.JButton();
        jbnLimpiar = new javax.swing.JButton();
        jbnEliminar = new javax.swing.JButton();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Jugadores");
        setBackground(new java.awt.Color(32, 33, 36));

        jPanel1.setBackground(new java.awt.Color(32, 33, 36));

        jblTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jblTitulo.setForeground(new java.awt.Color(255, 113, 36));
        jblTitulo.setText("Jugadores en Karasuno");

        jblAvisos.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jblAvisos.setForeground(new java.awt.Color(219, 187, 167));
        jblAvisos.setText("Bienvenid@ entrenador(a)");

        jPanel2.setBackground(new java.awt.Color(32, 33, 36));

        jblNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jblNombre.setForeground(new java.awt.Color(232, 223, 213));
        jblNombre.setText("Nombre:");

        jblEdad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jblEdad.setForeground(new java.awt.Color(232, 223, 213));
        jblEdad.setText("Edad:");

        jblEstatura.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jblEstatura.setForeground(new java.awt.Color(232, 223, 213));
        jblEstatura.setText("Estatura:");

        jblDorsal.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jblDorsal.setForeground(new java.awt.Color(232, 223, 213));
        jblDorsal.setText("Dorsal:");

        jblPosicion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jblPosicion.setForeground(new java.awt.Color(232, 223, 213));
        jblPosicion.setText("Posición:");

        jtfNombre.setBackground(new java.awt.Color(232, 223, 213));
        jtfNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(32, 33, 36));
        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreKeyTyped(evt);
            }
        });

        jtfEdad.setBackground(new java.awt.Color(232, 223, 213));
        jtfEdad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jtfEdad.setForeground(new java.awt.Color(32, 33, 36));
        jtfEdad.setToolTipText("Solo números enteros");
        jtfEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfEdadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfEdadKeyTyped(evt);
            }
        });

        jtfEstatura.setBackground(new java.awt.Color(232, 223, 213));
        jtfEstatura.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jtfEstatura.setForeground(new java.awt.Color(32, 33, 36));
        jtfEstatura.setToolTipText("Solo números, sin unidades");
        jtfEstatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEstaturaActionPerformed(evt);
            }
        });
        jtfEstatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfEstaturaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfEstaturaKeyTyped(evt);
            }
        });

        jtfDorsal.setBackground(new java.awt.Color(232, 223, 213));
        jtfDorsal.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jtfDorsal.setForeground(new java.awt.Color(32, 33, 36));
        jtfDorsal.setToolTipText("Solo números enteros");
        jtfDorsal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfDorsalKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDorsalKeyTyped(evt);
            }
        });

        jtfPosicion.setBackground(new java.awt.Color(232, 223, 213));
        jtfPosicion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jtfPosicion.setForeground(new java.awt.Color(32, 33, 36));
        jtfPosicion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfPosicionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPosicionKeyTyped(evt);
            }
        });

        jblm.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jblm.setForeground(new java.awt.Color(232, 223, 213));
        jblm.setText("m");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jblNombre)
                        .addGap(18, 18, 18)
                        .addComponent(jtfNombre))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jblEdad)
                        .addGap(34, 34, 34)
                        .addComponent(jtfEdad))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jblPosicion)
                        .addGap(18, 18, 18)
                        .addComponent(jtfPosicion))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jblDorsal)
                        .addGap(30, 30, 30)
                        .addComponent(jtfDorsal))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jblEstatura)
                        .addGap(18, 18, 18)
                        .addComponent(jtfEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jblm)
                        .addGap(0, 54, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblNombre)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblEdad)
                    .addComponent(jtfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblEstatura)
                    .addComponent(jtfEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblDorsal)
                    .addComponent(jtfDorsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblPosicion)
                    .addComponent(jtfPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(32, 33, 36));

        jbnAgregar.setBackground(new java.awt.Color(39, 45, 78));
        jbnAgregar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jbnAgregar.setForeground(new java.awt.Color(232, 223, 213));
        jbnAgregar.setText("Agregar");
        jbnAgregar.setToolTipText("Asegúrate de completar la información\n");

        jbnBuscar.setBackground(new java.awt.Color(39, 45, 78));
        jbnBuscar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jbnBuscar.setForeground(new java.awt.Color(232, 223, 213));
        jbnBuscar.setText("Buscar");
        jbnBuscar.setToolTipText("Busca por Nombre o Dorsal");

        jbnLimpiar.setBackground(new java.awt.Color(39, 45, 78));
        jbnLimpiar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jbnLimpiar.setForeground(new java.awt.Color(232, 223, 213));
        jbnLimpiar.setText("Limpiar");

        jbnEliminar.setBackground(new java.awt.Color(39, 45, 78));
        jbnEliminar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jbnEliminar.setForeground(new java.awt.Color(232, 223, 213));
        jbnEliminar.setText("Eliminar");
        jbnEliminar.setToolTipText("");
        jbnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jbnAgregar)
                .addGap(18, 18, 18)
                .addComponent(jbnBuscar)
                .addGap(18, 18, 18)
                .addComponent(jbnLimpiar)
                .addGap(18, 18, 18)
                .addComponent(jbnEliminar)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnAgregar)
                    .addComponent(jbnBuscar)
                    .addComponent(jbnLimpiar)
                    .addComponent(jbnEliminar))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jblAvisos)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jblTitulo)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jblAvisos)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbnEliminarActionPerformed

    private void jtfNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyPressed
        char enter = (char) evt.getExtendedKeyCode();
        if(enter == KeyEvent.VK_ENTER){
            jtfNombre.setBackground(colorNwJtf);
            jtfNombre.setEditable(false);
            jtfEdad.requestFocus();
        }
    }//GEN-LAST:event_jtfNombreKeyPressed

    private void jtfEdadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEdadKeyPressed
        char enter = (char) evt.getExtendedKeyCode();
        if(enter == KeyEvent.VK_ENTER){
            jtfEdad.setBackground(colorNwJtf);
            jtfEdad.setEditable(false);
            jtfEstatura.requestFocus();
        }// TODO add your handling code here:
    }//GEN-LAST:event_jtfEdadKeyPressed

    private void jtfEstaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEstaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEstaturaActionPerformed

    private void jtfEstaturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEstaturaKeyPressed
        char enter = (char) evt.getExtendedKeyCode();
        if(enter == KeyEvent.VK_ENTER){
            jtfEstatura.setBackground(colorNwJtf);
            jtfEstatura.setEditable(false);
            jtfDorsal.requestFocus();
        }
    }//GEN-LAST:event_jtfEstaturaKeyPressed

    private void jtfDorsalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDorsalKeyPressed
        char enter = (char) evt.getExtendedKeyCode();
        if (enter == KeyEvent.VK_ENTER) {
            jtfDorsal.setBackground(colorNwJtf);
            jtfDorsal.setEditable(false);
            jtfPosicion.requestFocus();
        }
    }//GEN-LAST:event_jtfDorsalKeyPressed

    private void jtfPosicionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPosicionKeyPressed
        char enter = (char) evt.getExtendedKeyCode();
        if(enter == KeyEvent.VK_ENTER){
            jtfPosicion.setBackground(colorNwJtf);
            jtfPosicion.setEditable(false);
            jbnAgregar.requestFocus();
        }
    }//GEN-LAST:event_jtfPosicionKeyPressed

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyTyped
        char letra = evt.getKeyChar();
        
        if(jtfNombre.getText().length()>40){
            evt.consume();
        } else if(!Character.isLetter(letra)){
            evt.consume();
        }
    }//GEN-LAST:event_jtfNombreKeyTyped

    private void jtfEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEdadKeyTyped
        char numero = evt.getKeyChar();
        if(jtfEdad.getText().length()>2){
            evt.consume();
        } else if (!Character.isDigit(numero)){
            evt.consume();
        }
    }//GEN-LAST:event_jtfEdadKeyTyped

    private void jtfEstaturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEstaturaKeyTyped
        char numero = evt.getKeyChar();
        if(jtfEstatura.getText().length()>3){
            evt.consume();
        } else if (!Character.isDigit(numero)){
            evt.consume();
        }
    }//GEN-LAST:event_jtfEstaturaKeyTyped

    private void jtfDorsalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDorsalKeyTyped
        char numero = evt.getKeyChar();
        if(jtfDorsal.getText().length()>2){
            evt.consume();
        } else if (!Character.isDigit(numero)){
            evt.consume();
        }
    }//GEN-LAST:event_jtfDorsalKeyTyped

    private void jtfPosicionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPosicionKeyTyped
        char letra = evt.getKeyChar();
        
        if(jtfPosicion.getText().length()>12){
            evt.consume();
        } else if(!Character.isLetter(letra)){
            evt.consume();
        }
    }//GEN-LAST:event_jtfPosicionKeyTyped

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
            java.util.logging.Logger.getLogger(frmKarasuno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmKarasuno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmKarasuno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmKarasuno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmKarasuno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jblAvisos;
    private javax.swing.JLabel jblDorsal;
    private javax.swing.JLabel jblEdad;
    private javax.swing.JLabel jblEstatura;
    private javax.swing.JLabel jblNombre;
    private javax.swing.JLabel jblPosicion;
    private javax.swing.JLabel jblTitulo;
    private javax.swing.JLabel jblm;
    private javax.swing.JButton jbnAgregar;
    private javax.swing.JButton jbnBuscar;
    private javax.swing.JButton jbnEliminar;
    private javax.swing.JButton jbnLimpiar;
    private javax.swing.JTextField jtfDorsal;
    private javax.swing.JTextField jtfEdad;
    private javax.swing.JTextField jtfEstatura;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPosicion;
    // End of variables declaration//GEN-END:variables
}
