
package app;

import java.awt.Image;

import javax.swing.ImageIcon;

import recursos.Imagenes01;

/**
 *
 * @author Carlos Privitera
 */
public class VentaPrincipal extends javax.swing.JFrame {

    private ImageIcon Img = new ImageIcon(getClass().getResource("/icoForm64.png"));
    private Image Imag01 = Img.getImage();
    Imagenes01 i = null;
    /** Creates new form VentaPrincipal */
     public VentaPrincipal() {
        initComponents();
        this.jLabel1.setText("");
        this.jLabel2.setText("");
        i = new Imagenes01(jLabel2, jLabel1);
      
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rompe cabeza");
        setIconImage(Imag01);
        setPreferredSize(new java.awt.Dimension(300, 300));
        setSize(new java.awt.Dimension(300, 300));

        jSplitPane1.setDividerLocation(100);

        jScrollPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jScrollPane1ComponentResized(evt);
            }
        });

        jLabel2.setText("jLabel2");
        jLabel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                aaa(evt);
            }
        });
        jScrollPane1.setViewportView(jLabel2);

        jSplitPane1.setRightComponent(jScrollPane1);

        jPanel1.setLayout(null);

        jButton3.setText("+");
        jPanel1.add(jButton3);
        jButton3.setBounds(0, 0, 100, 40);

        jLabel1.setText("jLabel1");
        jLabel1.setDoubleBuffered(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 40, 100, 100);

        jButton4.setText("-");
        jPanel1.add(jButton4);
        jButton4.setBounds(0, 140, 100, 40);

        jLabel3.setText("20 X 20 - 400 piezas");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 220, 100, 60);

        jLabel4.setText("001 de 400");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 184, 100, 30);

        jSplitPane1.setLeftComponent(jPanel1);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        jToolBar1.setRollover(true);

        jButton1.setText("Jugar");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setText("jButton2");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        getAccessibleContext().setAccessibleDescription("Solitario infinito");

        pack();
        setLocationRelativeTo(null);
    }//GEN-END:initComponents

    private void aaa(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_aaa
        // TODO add your handling code here:
        
    }//GEN-LAST:event_aaa

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        i.setJugar(false);
        i.romper(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jScrollPane1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jScrollPane1ComponentResized
        // TODO add your handling code here:
        //i.escalar(jScrollPane1.getWidth() - (jScrollPane1.getVerticalScrollBar().getWidth()*2));
        i.escalar(jScrollPane1.getWidth(), jScrollPane1.getHeight());
    }//GEN-LAST:event_jScrollPane1ComponentResized

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing
                                                                   .UIManager
                                                                   .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing
                         .UIManager
                         .setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util
                .logging
                .Logger
                .getLogger(VentaPrincipal.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util
                .logging
                .Logger
                .getLogger(VentaPrincipal.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util
                .logging
                .Logger
                .getLogger(VentaPrincipal.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util
                .logging
                .Logger
                .getLogger(VentaPrincipal.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt
            .EventQueue
            .invokeLater(new Runnable() {
                public void run() {
                    new VentaPrincipal().setVisible(true);
                    
                }
            });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

}
