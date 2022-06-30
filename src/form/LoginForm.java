package form;																				
																				
import java.awt.EventQueue;																				
																				
import javax.swing.JFrame;																				
import javax.swing.JPanel;																				
import java.awt.Color;																				
import java.awt.Cursor;																				
import java.awt.Dimension;																				
																				
import javax.swing.JLabel;																				
import javax.swing.JOptionPane;																				
import javax.swing.SwingConstants;																				
import javax.swing.border.LineBorder;																				
																				
import java.awt.Font;																				
import java.awt.Image;																				
import java.awt.KeyboardFocusManager;																				
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
import java.util.Collections;																				
																				
import javax.swing.border.MatteBorder;																				
import java.awt.event.KeyAdapter;																				
import java.awt.event.KeyEvent;																				
																				
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
		frmLogin.getContentPane().setBackground(Color.WHITE);																		
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
																				
		JLabel lblHotelRiza = new JLabel("Hotel Elite");																		
		lblHotelRiza.setFont(new Font("Century Gothic", Font.BOLD, 16));																		
		lblHotelRiza.setHorizontalAlignment(SwingConstants.CENTER);																		
		lblHotelRiza.setForeground(new Color(187, 129, 62));																		
		lblHotelRiza.setBounds(93, 177, 108, 35);																		
		panel.add(lblHotelRiza);																		
																				
		JLabel lblPhAddr = new JLabel("<html><center>+95 9129 1299 198 | hotelelite.info@gmail.com<br>Pyay Road, Yangon, Myanmar</center></html>");																		
		lblPhAddr.setHorizontalAlignment(SwingConstants.CENTER);																		
		lblPhAddr.setForeground(Color.WHITE);																		
		lblPhAddr.setBounds(2, 210, 290, 37);																		
		panel.add(lblPhAddr);																		
																				
		JLabel lblSince = new JLabel("-Since 2020-");																		
		lblSince.setHorizontalAlignment(SwingConstants.CENTER);																		
		lblSince.setForeground(new Color(187, 129, 62));																		
		lblSince.setBounds(105, 286, 84, 14);																		
		panel.add(lblSince);																		
																				
																				
		JLabel lblNewLabel = new JLabel("");																		
		lblNewLabel.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));																		
		lblNewLabel.setBounds(47, 48, 200, 107);																		
		panel.add(lblNewLabel);																		
																				
		JLabel lblWelcomeFromHotel = new JLabel("Welcome from HOTEL ELITE!");																		
		lblWelcomeFromHotel.setHorizontalAlignment(SwingConstants.LEFT);																		
		lblWelcomeFromHotel.setForeground(new Color(187, 129, 62));																		
		lblWelcomeFromHotel.setFont(new Font("Century Gothic", Font.BOLD, 16));																		
		lblWelcomeFromHotel.setBounds(324, 43, 266, 35);																		
		frmLogin.getContentPane().add(lblWelcomeFromHotel);																		
																				
																				
																				
		JLabel lbl_close = new JLabel("X");																		
		lbl_close.addMouseListener(new MouseAdapter() {																		
			@Override																	
			public void mouseClicked(MouseEvent e) {																	
				System.exit(0);																
			}																	
		});																		
		lbl_close.setHorizontalAlignment(SwingConstants.CENTER);																		
		lbl_close.setForeground(new Color(187, 129, 62));																		
		lbl_close.setFont(new Font("Tahoma", Font.BOLD, 16));																		
		lbl_close.setBounds(662, 0, 31, 28);																		
		frmLogin.getContentPane().add(lbl_close);																		
																				
				JLabel lblLoginForm = new JLabel("Login Form");																
				lblLoginForm.setBounds(324, 100, 85, 23);																
				frmLogin.getContentPane().add(lblLoginForm);																
				lblLoginForm.setForeground(Color.DARK_GRAY);																
				lblLoginForm.setFont(new Font("Tahoma", Font.BOLD, 15));																
																				
						JLabel lblNewLabel_1_1 = new JLabel("Email Address");														
						lblNewLabel_1_1.setBounds(324, 157, 102, 14);														
						frmLogin.getContentPane().add(lblNewLabel_1_1);														
						lblNewLabel_1_1.setForeground(Color.DARK_GRAY);														
						lblNewLabel_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 13));														
																				
								txtEmail = new JTextField();												
								txtEmail.setFocusTraversalKeys(												
									    KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, Collections.EMPTY_SET);											
								txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {												
									  public void keyPressed (java.awt.event.KeyEvent evt){											
									    if (evt.getKeyCode() == KeyEvent.VK_TAB) {											
									    	pwfPassword.requestFocusInWindow();										
									    	LoginService ls = new LoginService();										
									    	Login login = new Login();										
									    	login = ls.getTokenPassword(txtEmail.getText().toString());										
									    	if(login.getrememberme()==1) {										
									    		pwfPassword.setText(login.getloginpassword());									
									    	}										
									    }											
									  }											
									});											
																				
								txtEmail.setBounds(436, 151, 227, 29);												
								frmLogin.getContentPane().add(txtEmail);												
								txtEmail.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(187, 129, 62)));												
								txtEmail.setColumns(10);												
																				
										JLabel lblPassword = new JLabel("Password");										
										lblPassword.setBounds(324, 231, 72, 14);										
										frmLogin.getContentPane().add(lblPassword);										
										lblPassword.setForeground(Color.DARK_GRAY);										
										lblPassword.setFont(new Font("Century Gothic", Font.PLAIN, 13));										
																				
												pwfPassword = new JPasswordField();								
												pwfPassword.addMouseListener(new MouseAdapter() {								
													@Override							
													public void mouseClicked(MouseEvent e) {							
														LoginService ls = new LoginService();						
												    	Login login = new Login();							
												    	login = ls.getTokenPassword(txtEmail.getText().toString());							
												    	if(login.getrememberme()==1) {							
												    		pwfPassword.setText(login.getloginpassword());						
												    	}							
													}							
												});								
												pwfPassword.setBounds(436, 225, 227, 29);								
												frmLogin.getContentPane().add(pwfPassword);								
												pwfPassword.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(187, 129, 62)));								
																				
														JCheckBox chkRememberme = new JCheckBox("Remember me");						
														chkRememberme.setBackground(Color.WHITE);						
														chkRememberme.setBounds(324, 326, 97, 23);						
														frmLogin.getContentPane().add(chkRememberme);						
														chkRememberme.setFont(new Font("Tahoma", Font.PLAIN, 10));						
																				
														JButton btnLogin = new JButton("Login");						
														btnLogin.setBounds(324, 383, 339, 35);						
														frmLogin.getContentPane().add(btnLogin);						
														btnLogin.setFont(new Font("Century Gothic", Font.BOLD, 14));						
														btnLogin.setForeground(Color.WHITE);						
														btnLogin.setBorderPainted(false);						
														btnLogin.setBackground(new Color(187, 129, 62));						
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
																			if(chkRememberme.isSelected()) {	
																				loginService.updateRememberme(1,login);
																			}	
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
	}																			
}																				
