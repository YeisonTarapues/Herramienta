package metodos;

import javax.swing.*;

import static javax.swing.JMenu.*;

public class frmPrincipal extends javax.swing.JFrame {
    
    numfraccionario f1, f2, fresp;

    //se crea el fomulario principal
    public frmPrincipal() {
        initComponents();
        f1 = new numfraccionario();
        f2 = new numfraccionario();
        fresp = new numfraccionario();
        setSize(400,200);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

   //eventos del formulario
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jProgressBar1 = new javax.swing.JProgressBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JmiSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiLlenar = new javax.swing.JMenuItem();
        jmiSumar = new javax.swing.JMenuItem();
        jmiRestar = new javax.swing.JMenuItem();
        jmiMultiplicar = new javax.swing.JMenuItem();
        jmiDividir = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU PRINCIPAL");
        setName("frm1"); // NOI18N
        setUndecorated(true);

        jMenu1.setText("Archivo");

        JmiSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        JmiSalir.setText("Salir");
        JmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmiSalirActionPerformed(evt);
            }
        });
        jMenu1.add(JmiSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jmiLlenar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jmiLlenar.setText("Llenar Fraccionarios");
        jmiLlenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLlenarActionPerformed(evt);
            }
        });
        jMenu2.add(jmiLlenar);

        jmiSumar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jmiSumar.setText("Sumar Fraccionarios");
        jmiSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSumarActionPerformed(evt);
            }
        });
        jMenu2.add(jmiSumar);

        jmiRestar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jmiRestar.setText("Restar Fraccionario");
        jmiRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRestarActionPerformed(evt);
            }
        });
        jMenu2.add(jmiRestar);

        jmiMultiplicar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jmiMultiplicar.setText("Multiplicar Fraccionarios");
        jmiMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMultiplicarActionPerformed(evt);
            }
        });
        jMenu2.add(jmiMultiplicar);

        jmiDividir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jmiDividir.setText("Dividir Fraccionarios");
        jmiDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDividirActionPerformed(evt);
            }
        });
        jMenu2.add(jmiDividir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(265, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmiSalirActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "PROGRAMA TERMINADO");
        System.exit(0);
    }//GEN-LAST:event_JmiSalirActionPerformed

    private void jmiLlenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLlenarActionPerformed
        // TODO add your handling code here:
        frmLlenado f = new frmLlenado(f1,f2);
        f.setVisible(true);
     
    }//GEN-LAST:event_jmiLlenarActionPerformed

    private void jmiSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSumarActionPerformed
      fresp = f1.getsumar2(f2);
      frmSumar fsuma = new frmSumar (f1,f2,fresp);
      fsuma.setVisible(true);
      
      
    }//GEN-LAST:event_jmiSumarActionPerformed

    private void jmiRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRestarActionPerformed
        // TODO add your handling code here:
        fresp = f1.getRestar(f2);
      frmRestar fresta = new frmRestar (f1,f2,fresp);
      fresta.setVisible(true);
      
      
                 
    }//GEN-LAST:event_jmiRestarActionPerformed

    private void jmiMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMultiplicarActionPerformed
        // TODO add your handling code here:
        fresp = f1.getMultiplicar(f2);
      frmMultiplicar fMul = new frmMultiplicar (f1,f2,fresp);
      fMul.setVisible(true);
    }//GEN-LAST:event_jmiMultiplicarActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jmiDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDividirActionPerformed
        // TODO add your handling code here:
         fresp = f1.getDividir(f2);
      frmDividir fDiv = new frmDividir (f1,f2,fresp);
      fDiv.setVisible(true);
    }//GEN-LAST:event_jmiDividirActionPerformed

    //parametros del agumento
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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // se decraran las variables
    private javax.swing.JMenuItem JmiSalir;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JMenuItem jmiDividir;
    private javax.swing.JMenuItem jmiLlenar;
    private javax.swing.JMenuItem jmiMultiplicar;
    private javax.swing.JMenuItem jmiRestar;
    private javax.swing.JMenuItem jmiSumar;

}
