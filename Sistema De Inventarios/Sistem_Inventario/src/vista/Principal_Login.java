package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.sun.awt.AWTUtilities;
import controlador.FuncionesLogin;

/**
 * 
 *
 */

public class Principal_Login extends JFrame
{
	public JPanel p1;
	public JLabel lblprinc, lbllogo, lblusuario, lblcampoUs, lblcontraseña, lblcampoCon;
	public JTextField txtusuario;
	public JPasswordField jpcontraseña;
	public JButton btniniciar, btncerrar;
	
	public Principal_Login()
	{
            iniciarComponentes();
            FuncionesLogin fun = new FuncionesLogin(this);
            setLocationRelativeTo(null);
            AWTUtilities.setWindowOpaque(this, false);
	}
	
	public void iniciarComponentes()
	{
	p1 = new JPanel();
        lbllogo = new JLabel();
        lblusuario = new JLabel();
        lblcampoUs = new JLabel();
        txtusuario = new JTextField();
        lblcontraseña = new JLabel();
        lblcampoCon = new JLabel();
        jpcontraseña = new JPasswordField();
        btniniciar = new JButton();
        btncerrar = new JButton();
        lblprinc = new JLabel();
        
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(55, 55, 255));
	setMinimumSize(new Dimension(518, 540));
	setUndecorated(true);

        p1.setOpaque(false);
	p1.setLayout(null);
	p1.setBounds(0, 0, 500, 500);
        
        lbllogo.setFont(new Font("Mode G", 0, 36));
        lbllogo.setForeground(new Color(255, 255, 255));
        lbllogo.setHorizontalAlignment(SwingConstants.CENTER);
        lbllogo.setText("Inicio De Sesión");
        lbllogo.setHorizontalTextPosition(SwingConstants.CENTER);
        lbllogo.setBounds(p1.getWidth()/2-170, 90, 340, 50);
        p1.add(lbllogo);
        
        lblusuario.setFont(new Font("Mode G", 0, 14));
        lblusuario.setForeground(new Color(255, 255, 255));
        lblusuario.setHorizontalAlignment(SwingConstants.CENTER);
        lblusuario.setText("Usuario");
        lblusuario.setBounds(p1.getWidth()/2-25, 160, 50, 20);
        p1.add(lblusuario);
        
        lblcampoUs.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png")));
        lblcampoUs.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        lblcampoUs.setBounds(p1.getWidth()/2-100, 180, 200, 40);
        p1.add(lblcampoUs);
        
        txtusuario.setFont(new Font("Tahoma", 1, 16));
        txtusuario.setHorizontalAlignment(JTextField.CENTER);
        txtusuario.setBorder(null);
        txtusuario.setBounds(p1.getWidth()/2-90, 190, 180, 20);
        p1.add(txtusuario);

        lblcontraseña.setFont(new Font("Mode G", 0, 14));
        lblcontraseña.setForeground(new Color(255, 255, 255));
        lblcontraseña.setHorizontalAlignment(SwingConstants.CENTER);
        lblcontraseña.setText("Contraseña");
        lblcontraseña.setBounds(p1.getWidth()/2-230, 240, 460, 20);
        p1.add(lblcontraseña);

        lblcampoCon.setIcon(new ImageIcon(getClass().getResource("/img/txt_med.png")));
        lblcampoCon.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        lblcampoCon.setBounds(p1.getWidth()/2-100, 260, 200, 40);
        p1.add(lblcampoCon);
        
        jpcontraseña.setFont(new Font("Tahoma", 1, 16));
        jpcontraseña.setHorizontalAlignment(JTextField.CENTER);
        jpcontraseña.setBorder(null);
        jpcontraseña.setBounds(p1.getWidth()/2-90, 270, 180, 20);
        p1.add(jpcontraseña);
        
        btniniciar.setFont(new Font("Mode G", 0, 16));
        btniniciar.setIcon(new ImageIcon(getClass().getResource("/img/btn_grande.png")));
        btniniciar.setText("Iniciar");
        btniniciar.setBorder(null);
        btniniciar.setContentAreaFilled(false);
        btniniciar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btniniciar.setHorizontalTextPosition(SwingConstants.CENTER);
        btniniciar.setRolloverIcon(new ImageIcon(getClass().getResource("/img/btn_grande_hov.png")));
        btniniciar.setBounds(p1.getWidth()/2-66, 360, 132, 32);
        p1.add(btniniciar);
        
        btncerrar.setFont(new Font("Mode G", 0, 40));
        btncerrar.setForeground(Color.RED);
        btncerrar.setText("x");
        btncerrar.setBorder(null);
        btncerrar.setContentAreaFilled(false);
        btncerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btncerrar.setHorizontalTextPosition(SwingConstants.CENTER);
        btncerrar.setBounds(420, 220, 33, 33);
        p1.add(btncerrar);
        
        lblprinc.setIcon(new ImageIcon(getClass().getResource("/img/BELIZE-HOLE.png")));
        lblprinc.setCursor(new Cursor(Cursor.MOVE_CURSOR));
        lblprinc.setBounds(0, 0, 500, 500);
        p1.add(lblprinc);
        
        getContentPane().add(p1, BorderLayout.CENTER);
	}
}
