package ac1_jogo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaCarregamento extends javax.swing.JFrame {

    public TelaCarregamento() {
        initComponents();
        
        
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 101; i++) {

                    try {

                        Barra.setValue(i);
                        Thread.sleep(50);
                        if (i == 100) {
                            
                            TelaDeLogin login = new TelaDeLogin();
                            login.setVisible(true);
                            dispose();
                           
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TelaCarregamento.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }

        });

        t.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Barra = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 346, 26));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Desktop\\Facul\\1 Segunda- Linguagem de Programação\\Walllpaper.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCarregamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCarregamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCarregamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCarregamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCarregamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Barra;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
