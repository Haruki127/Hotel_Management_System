package form;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JSeparator;
import javax.swing.JTextField;

import java.awt.SystemColor;
import javax.swing.border.MatteBorder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.ComponentOrientation;
import java.awt.event.WindowStateListener;
import java.awt.event.WindowEvent;

public class HomeForm {

	JFrame frmHome;
	JTextField txtHomeSearch;
	JLabel lblHomeheader;
	Dimension size = Toolkit.getDefaultToolkit().getScreenSize();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeForm window = new HomeForm();
					window.frmHome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public HomeForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHome = new JFrame();
		frmHome.addWindowStateListener(new WindowStateListener() {
			public void windowStateChanged(WindowEvent e) {
				//maximize
				if(e.getNewState() == 6) {
					lblHomeheader.setBounds(((int)size.getWidth()/2)-100, 18, 91, 26);
					txtHomeSearch.setBounds((int)size.getWidth()-300, 16, 233, 33);
				}
				else if(e.getNewState() == 0) {
					lblHomeheader.setBounds((int)size.getWidth()/3, 18, 91, 26);
					txtHomeSearch.setBounds((int)size.getWidth()/2, 16, 233, 33);
					frmHome.setBounds(0,0, 1000, 500);
					frmHome.setLocationRelativeTo(null);//set frame to center of screen
				}
			}
		});
		frmHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtHomeSearch.setText("Search...");
				txtHomeSearch.setFocusable(false);
			}
		});
		
		frmHome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHome.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frmHome.getContentPane().setLayout(null);
		
		
		JPanel panelHomeHeader = new JPanel();
		panelHomeHeader.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panelHomeHeader.setBounds(0, 0, (int)size.getWidth(), 71);
		frmHome.getContentPane().add(panelHomeHeader);
		panelHomeHeader.setLayout(null);
		
		lblHomeheader = new JLabel("HOTEL RIZA");
		lblHomeheader.setBackground(Color.RED);
		lblHomeheader.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHomeheader.setBounds(((int)size.getWidth()/2)-100, 18, 91, 26);
		lblHomeheader.setForeground(new Color(198, 166, 104));
		panelHomeHeader.add(lblHomeheader);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(198, 166, 104));
		separator.setForeground(new Color(198, 166, 104));
		separator.setBounds(0, 69, (int)size.getWidth(), 6);
		panelHomeHeader.add(separator);
		
		txtHomeSearch = new JTextField();
		txtHomeSearch.setFocusable(false);
		txtHomeSearch.getCaret().setVisible(false);
		txtHomeSearch.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				txtHomeSearch.setFocusable(true);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				txtHomeSearch.setText("");
			}
		});
		txtHomeSearch.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		txtHomeSearch.setBackground(SystemColor.menu);
		txtHomeSearch.setForeground(Color.GRAY);
		txtHomeSearch.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtHomeSearch.setText("Search...");
		txtHomeSearch.setBounds((int)size.getWidth()-300, 16, 233, 33);
		panelHomeHeader.add(txtHomeSearch);
		txtHomeSearch.setColumns(10);
	}
}
