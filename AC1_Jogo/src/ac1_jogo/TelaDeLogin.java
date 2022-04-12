package ac1_jogo;

import java.awt.Color;
import javax.swing.JOptionPane;

public class TelaDeLogin extends javax.swing.JFrame {

    public TelaDeLogin() {
        initComponents();
        getContentPane().setBackground(Color.blue);
        
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Campo_Login_ = new javax.swing.JTextField();
        Campo_Senha_ = new javax.swing.JPasswordField();
        Campo_Sair_ = new javax.swing.JButton();
        Campo_Iniciar_ = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Campo_Login_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_Login_ActionPerformed(evt);
            }
        });
        getContentPane().add(Campo_Login_, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 70, -1));
        getContentPane().add(Campo_Senha_, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 70, -1));

        Campo_Sair_.setBackground(new java.awt.Color(255, 102, 102));
        Campo_Sair_.setForeground(new java.awt.Color(0, 0, 0));
        Campo_Sair_.setText("Sair");
        Campo_Sair_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_Sair_ActionPerformed(evt);
            }
        });
        getContentPane().add(Campo_Sair_, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 71, -1));

        Campo_Iniciar_.setBackground(new java.awt.Color(153, 255, 153));
        Campo_Iniciar_.setForeground(new java.awt.Color(0, 0, 0));
        Campo_Iniciar_.setText("Jogar");
        Campo_Iniciar_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_Iniciar_ActionPerformed(evt);
            }
        });
        getContentPane().add(Campo_Iniciar_, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 68, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Usuario:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Senha:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Desktop\\Facul\\1 Segunda- Linguagem de Programação\\TelaLoginPoke.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 808, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Campo_Login_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_Login_ActionPerformed
       
    }//GEN-LAST:event_Campo_Login_ActionPerformed

    private void Campo_Iniciar_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_Iniciar_ActionPerformed
        if (Campo_Login_.getText().equals("admin") && "12345".equals(new String(Campo_Senha_.getPassword()))) {
            JOptionPane.showMessageDialog(null, "Acessado!");
            
            TelaBatalha Batalhas = new TelaBatalha();
            Batalhas.setVisible(true);
            dispose();
            
        } else {
            JOptionPane.showMessageDialog(null, "Usuario ou Senha invalida");
        }
    }//GEN-LAST:event_Campo_Iniciar_ActionPerformed

    private void Campo_Sair_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_Sair_ActionPerformed
        this.dispose();
    }//GEN-LAST:event_Campo_Sair_ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Campo_Iniciar_;
    private javax.swing.JTextField Campo_Login_;
    private javax.swing.JButton Campo_Sair_;
    private javax.swing.JPasswordField Campo_Senha_;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
