/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;

public class Dashboard extends javax.swing.JFrame {

    static boolean maximized = true;
    int xMouse;
    int yMouse;
    
    public Dashboard() {
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

        pnlHeader = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnMaximize = new javax.swing.JButton();
        btnMinimize = new javax.swing.JButton();
        pnlMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        btnEmpleados = new javax.swing.JButton();
        lblEmpleados = new javax.swing.JLabel();
        btnClientes = new javax.swing.JButton();
        lblClientes = new javax.swing.JLabel();
        btnVentas = new javax.swing.JButton();
        lblVentas = new javax.swing.JLabel();
        btnProductos = new javax.swing.JButton();
        lblProductos = new javax.swing.JLabel();
        lblCerrarSesion = new javax.swing.JLabel();
        pnlBody = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cube UI");
        setUndecorated(true);
        setSize(new java.awt.Dimension(1000, 600));

        pnlHeader.setBackground(new java.awt.Color(255, 255, 255));
        pnlHeader.setForeground(new java.awt.Color(255, 255, 255));
        pnlHeader.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlHeaderMouseDragged(evt);
            }
        });
        pnlHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlHeaderMousePressed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit.png"))); // NOI18N
        btnExit.setContentAreaFilled(false);
        btnExit.setFocusable(false);
        btnExit.setOpaque(true);
        btnExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Exit (2).png"))); // NOI18N
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnMaximize.setBackground(new java.awt.Color(255, 255, 255));
        btnMaximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Maximize.png"))); // NOI18N
        btnMaximize.setContentAreaFilled(false);
        btnMaximize.setFocusable(false);
        btnMaximize.setOpaque(true);
        btnMaximize.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Maximize (2).png"))); // NOI18N
        btnMaximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMaximizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMaximizeMouseExited(evt);
            }
        });
        btnMaximize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaximizeActionPerformed(evt);
            }
        });

        btnMinimize.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Minimize.png"))); // NOI18N
        btnMinimize.setContentAreaFilled(false);
        btnMinimize.setFocusable(false);
        btnMinimize.setOpaque(true);
        btnMinimize.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Minimize (2).png"))); // NOI18N
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseExited(evt);
            }
        });
        btnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnMaximize, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnExit))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnMaximize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user1.png"))); // NOI18N

        lblNombreUsuario.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 20)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(44, 62, 80));
        lblNombreUsuario.setText("CONAN DOYLE");

        lblPerfil.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPerfil.setForeground(new java.awt.Color(127, 140, 141));
        lblPerfil.setText("Student");
        lblPerfil.setMaximumSize(new java.awt.Dimension(70, 20));
        lblPerfil.setMinimumSize(new java.awt.Dimension(70, 20));
        lblPerfil.setPreferredSize(new java.awt.Dimension(80, 18));

        btnEmpleados.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(44, 62, 80));
        btnEmpleados.setText("Empleados");
        btnEmpleados.setContentAreaFilled(false);
        btnEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleados.setFocusable(false);

        lblEmpleados.setBackground(new java.awt.Color(0, 204, 106));
        lblEmpleados.setOpaque(true);

        btnClientes.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(44, 62, 80));
        btnClientes.setText("Clientes");
        btnClientes.setContentAreaFilled(false);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.setFocusable(false);
        btnClientes.setPreferredSize(new java.awt.Dimension(100, 27));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        lblClientes.setBackground(new java.awt.Color(255, 255, 255));
        lblClientes.setOpaque(true);

        btnVentas.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(44, 62, 80));
        btnVentas.setText("Ventas");
        btnVentas.setContentAreaFilled(false);
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.setFocusable(false);
        btnVentas.setPreferredSize(new java.awt.Dimension(100, 27));
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        lblVentas.setBackground(new java.awt.Color(255, 255, 255));
        lblVentas.setOpaque(true);
        lblVentas.setPreferredSize(new java.awt.Dimension(100, 0));

        btnProductos.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 16)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(44, 62, 80));
        btnProductos.setText("Productos");
        btnProductos.setContentAreaFilled(false);
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.setFocusable(false);
        btnProductos.setPreferredSize(new java.awt.Dimension(100, 27));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        lblProductos.setBackground(new java.awt.Color(255, 255, 255));
        lblProductos.setOpaque(true);
        lblProductos.setPreferredSize(new java.awt.Dimension(100, 0));

        lblCerrarSesion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCerrarSesion.setForeground(new java.awt.Color(52, 152, 219));
        lblCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCerrarSesion.setText("Cerrar sesión");
        lblCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(lblVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreUsuario)
                            .addComponent(lblPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblCerrarSesion)
                        .addGap(18, 18, 18))))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblNombreUsuario)
                        .addGap(5, 5, 5)
                        .addComponent(lblPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCerrarSesion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmpleados)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                        .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                        .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pnlBody.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlBody, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1000, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(new Color(232,17,35));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnMaximizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizeMouseEntered
        btnMaximize.setBackground(new Color(229,229,229));
    }//GEN-LAST:event_btnMaximizeMouseEntered

    private void btnMaximizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaximizeMouseExited
        btnMaximize.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnMaximizeMouseExited

    private void btnMaximizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaximizeActionPerformed
        if(maximized){
            //handle fullscreen - taskbar
            Dashboard.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            Dashboard.this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximized = false;
        }else{
            setExtendedState(JFrame.NORMAL);
            maximized = true;
        }
    }//GEN-LAST:event_btnMaximizeActionPerformed

    private void btnMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseEntered
        btnMinimize.setBackground(new Color(229,229,229));
    }//GEN-LAST:event_btnMinimizeMouseEntered

    private void btnMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseExited
        btnMinimize.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnMinimizeMouseExited

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeActionPerformed

    private void pnlHeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_pnlHeaderMousePressed

    private void pnlHeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHeaderMouseDragged
        if(maximized){
            int x = evt.getXOnScreen();
            int y = evt.getYOnScreen();
            this.setLocation(x - xMouse, y - yMouse);
        }
    }//GEN-LAST:event_pnlHeaderMouseDragged

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        lblClientes.setBackground(new Color(0,204,106));
        
        lblEmpleados.setBackground(new Color(255,255,255));
        lblVentas.setBackground(new Color(255,255,255));
        lblProductos.setBackground(new Color(255,255,255));
        
        pnlBody.removeAll();
        pnlBody.repaint();
        pnlBody.revalidate();
        //pnlBody.add(pnlNews);
        pnlBody.repaint();
        pnlBody.revalidate();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        lblVentas.setBackground(new Color(0,204,106));
        
        lblEmpleados.setBackground(new Color(255,255,255));
        lblClientes.setBackground(new Color(255,255,255));
        lblProductos.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        lblProductos.setBackground(new Color(0,204,106));
        
        lblEmpleados.setBackground(new Color(255,255,255));
        lblClientes.setBackground(new Color(255,255,255));
        lblVentas.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnProductosActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnClientes;
    public javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMaximize;
    private javax.swing.JButton btnMinimize;
    public javax.swing.JButton btnProductos;
    public javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel lblCerrarSesion;
    public javax.swing.JLabel lblClientes;
    public javax.swing.JLabel lblEmpleados;
    public javax.swing.JLabel lblNombreUsuario;
    public javax.swing.JLabel lblPerfil;
    public javax.swing.JLabel lblProductos;
    public javax.swing.JLabel lblVentas;
    public javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}
