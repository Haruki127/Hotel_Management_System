package form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;

import model.Login;
import service.LoginService;

import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class LoginForm {

	private JFrame frmLogin;
	private JPasswordField pwfPassword;
	private JTextField txtEmail;
	private int xx, xy;

	private Image loginImg = new ImageIcon(LoginForm.class.getResource("/images/login_img1.png")).getImage()
			.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

	Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.getContentPane().addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
		        int y = e.getYOnScreen();
		        frmLogin.setLocation(x - xx, y - xy);  
			}
		});
		frmLogin.getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xx = e.getX();
		        xy = e.getY();
			}
		});
		frmLogin.setBounds(((int) size.getWidth() / 4), 100, 694, 458);
		frmLogin.getContentPane().setLayout(null);
		frmLogin.setUndecorated(true);
		frmLogin.getRootPane().setWindowDecorationStyle(JRootPane.NONE);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 290, 458);
		panel.setBackground(new Color(35, 35, 33));
		frmLogin.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblHotelRiza = new JLabel("HOTEL RIZA");
		lblHotelRiza.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHotelRiza.setHorizontalAlignment(SwingConstants.CENTER);
		lblHotelRiza.setForeground(new Color(198, 166, 104));
		lblHotelRiza.setBounds(90, 184, 108, 35);
		panel.add(lblHotelRiza);

		JLabel lblPh = new JLabel("+95 9129 1299 198 | hotelriza.info@gmail.com");
		lblPh.setHorizontalAlignment(SwingConstants.CENTER);
		lblPh.setForeground(Color.WHITE);
		lblPh.setBounds(25, 210, 238, 37);
		panel.add(lblPh);

		JLabel lblAddr = new JLabel("Pyay Road, Yangon, Myanmar");
		lblAddr.setForeground(Color.WHITE);
		lblAddr.setBounds(69, 243, 150, 16);
		panel.add(lblAddr);

		JLabel lblSince = new JLabel("-Since 2020-");
		lblSince.setForeground(new Color(198, 166, 104));
		lblSince.setBounds(107, 286, 91, 14);
		panel.add(lblSince);

		JLabel lblLoginimg = new JLabel("");
		lblLoginimg.setIcon(new ImageIcon(loginImg));
		lblLoginimg.setBounds(91, 48, 104, 109);
		panel.add(lblLoginimg);

		JLabel lblWelcomeFromHotel = new JLabel("Welcome from HOTEL RIZA!");
		lblWelcomeFromHotel.setHorizontalAlignment(SwingConstants.LEFT);
		lblWelcomeFromHotel.setForeground(new Color(198, 166, 104));
		lblWelcomeFromHotel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWelcomeFromHotel.setBounds(324, 43, 266, 35);
		frmLogin.getContentPane().add(lblWelcomeFromHotel);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, Color.LIGHT_GRAY, Color.GRAY));
		panel_1.setBounds(324, 114, 305, 281);
		frmLogin.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 39, 305, 2);
		panel_1.add(separator);

		JLabel lblLoginForm = new JLabel("Login Form");
		lblLoginForm.setForeground(Color.DARK_GRAY);
		lblLoginForm.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLoginForm.setBounds(22, 9, 85, 23);
		panel_1.add(lblLoginForm);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.DARK_GRAY);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPassword.setBounds(22, 141, 72, 14);
		panel_1.add(lblPassword);

		JLabel lblNewLabel_1_1 = new JLabel("Email Address");
		lblNewLabel_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1_1.setBounds(22, 74, 102, 14);
		panel_1.add(lblNewLabel_1_1);

		pwfPassword = new JPasswordField();
		pwfPassword.setBounds(22, 161, 257, 29);
		pwfPassword.setBorder(new LineBorder(new Color(198, 166, 104)));
		panel_1.add(pwfPassword);

		txtEmail = new JTextField();
		txtEmail.setBounds(21, 94, 257, 29);
		txtEmail.setBorder(new LineBorder(new Color(198, 166, 104)));
		panel_1.add(txtEmail);
		txtEmail.setColumns(10);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Remember me");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxNewCheckBox.setBounds(22, 201, 97, 23);
		panel_1.add(chckbxNewCheckBox);

		JLabel lblForgotYourPassword = new JLabel("Forgot Your Password?");
		lblForgotYourPassword.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblForgotYourPassword.setBounds(164, 201, 114, 14);
		panel_1.add(lblForgotYourPassword);
		lblForgotYourPassword.setForeground(new Color(198, 166, 104));

		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCreateAccount.setForeground(new Color(198, 166, 104));
		btnCreateAccount.setBounds(161, 230, 118, 23);
		panel_1.add(btnCreateAccount);

		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				LoginService loginService = new LoginService();
				
				
				String loginText = txtEmail.getText().toString();
				String passText = new String(pwfPassword.getPassword());
				
				if (!loginText.isEmpty() && !passText.isEmpty()) {
					if(!(loginText.matches("^[A-Za-z0-9_]+@[A-Za-z0-9.]+[.]+[A-Za-z]+$"))) 
					{
						JOptionPane.showMessageDialog(null, "Please enter valid Email.");
						txtEmail.requestFocus(true);
					}
					else {
						login.setloginemail(loginText);
						login.setloginpassword(passText);
						int match = loginService.matchPassword(login);
						if (match == 1) {
							HomeForm newHomeForm = new HomeForm();
							newHomeForm.frmHome.setVisible(true);
						} else {
							JOptionPane.showMessageDialog(null, "Wrong Email or Password!");
						}
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter both Email and Password!");
				}
			}
		});
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBorderPainted(false);
		btnLogin.setBackground(new Color(198, 166, 104));
		btnLogin.setBounds(22, 231, 118, 23);
		panel_1.add(btnLogin);

		JLabel lbl_close = new JLabel("X");
		lbl_close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lbl_close.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_close.setForeground(new Color(198, 166, 104));
		lbl_close.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbl_close.setBounds(662, 0, 31, 28);
		frmLogin.getContentPane().add(lbl_close);
	}
}
