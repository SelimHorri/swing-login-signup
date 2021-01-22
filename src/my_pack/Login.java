package my_pack;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.border.CompoundBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login {
// Begin Class
	
	private JFrame frame;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JTextField txtUsernameEmail;
	private JPasswordField pwdPassword;
	
// -----------------------------------------Initialize the contents of the frame.----------------------------------------------------
	private void initialize () {
	// Begin initialize()
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 12));
		frame.setTitle("App");
		frame.setBounds(100, 100, 696, 425);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 680, 386);
		frame.getContentPane().add(panel);
		
		panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String pass = new String(pwdPassword.getPassword());
				
				if ( (txtUsernameEmail.getText().isEmpty()) || (txtUsernameEmail.getText().equalsIgnoreCase("Enter Username or Email")) ) {
					txtUsernameEmail.setForeground(Color.lightGray);
					txtUsernameEmail.setText("Enter Username or Email");
				}
				
				if ( (pass.isEmpty()) || (pass.equalsIgnoreCase("Enter Password")) ) {
					pwdPassword.setForeground(Color.lightGray);
					pwdPassword.setText("Enter Password");
				}
				
			}
		});
		panel.setLayout(new CardLayout(0, 0));
		panel_1.setBackground(Color.WHITE);
		panel.add(panel_1, "name_13063931942008");
		panel_1.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel.add(panel_2, "name_13063996798330");
		panel_2.setLayout(null);
		
		JLabel label_2 = new JLabel("");
		label_2.setFont(new Font("Corbel", Font.BOLD, 17));
		label_2.setForeground(Color.RED);
		label_2.setBounds(497, 85, 46, 14);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setFont(new Font("Corbel", Font.BOLD, 17));
		label_3.setForeground(Color.RED);
		label_3.setBounds(497, 146, 46, 14);
		panel_1.add(label_3);
		
		txtUsernameEmail = new JTextField();
		txtUsernameEmail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				int c = e.getKeyCode();
				
				if (c == KeyEvent.VK_ENTER)
					testMyLogin();
				
			}
		});
		txtUsernameEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				if ( (txtUsernameEmail.getText().isEmpty()) || (txtUsernameEmail.getText().equalsIgnoreCase("Enter Username or Email")) ) {
					label_2.setText("  !");
					txtUsernameEmail.setForeground(Color.lightGray);
					txtUsernameEmail.setText("Enter Username or Email");
				}
				else {
					txtUsernameEmail.setForeground(new Color(36, 47, 65));
					label_2.setText(null);
				}
				
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				txtUsernameEmail.setForeground(new Color(36, 47, 65));
				
				if ( (txtUsernameEmail.getText().isEmpty()) || (txtUsernameEmail.getText().equalsIgnoreCase("Enter Username or Email")) ) {
					txtUsernameEmail.setText(null);
				}
				
			}
		});
		txtUsernameEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtUsernameEmail.setForeground(new Color(36, 47, 65));
				
				if ( (txtUsernameEmail.getText().isEmpty()) || (txtUsernameEmail.getText().equalsIgnoreCase("Enter Username or Email")) ) {
					txtUsernameEmail.setText(null);
				}
				
			}
		});
		txtUsernameEmail.setForeground(Color.LIGHT_GRAY);
		txtUsernameEmail.setFont(new Font("Century Gothic", Font.BOLD, 12));
		txtUsernameEmail.setBorder(null);
		txtUsernameEmail.setText("Enter UserName or Email");
		txtUsernameEmail.setBounds(196, 73, 291, 26);
		panel_1.add(txtUsernameEmail);
		txtUsernameEmail.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				int c = e.getKeyCode();
				
				if (c == KeyEvent.VK_ENTER)
					testMyLogin();
				
			}
		});
		pwdPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String pass = new String(pwdPassword.getPassword());
				
				if ( (pass.isEmpty()) || (pass.equalsIgnoreCase("Enter Password")) ) {
					label_3.setText("  !");
					pwdPassword.setForeground(Color.lightGray);
					pwdPassword.setText("Enter Password");
				}
				else {
					pwdPassword.setForeground(new Color(36, 47, 65));
					label_3.setText(null);
				}
				
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				pwdPassword.setForeground(new Color(36, 47, 65));
				
				String pass = new String(pwdPassword.getPassword());
				
				if ( (pass.isEmpty()) || (pass.equalsIgnoreCase("Enter Password")) ) {
					pwdPassword.setText(null);
				}
				
			}
		});
		pwdPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				pwdPassword.setForeground(new Color(36, 47, 65));
				
				String pass = new String(pwdPassword.getPassword());
				
				if ( (pass.isEmpty()) || (pass.equalsIgnoreCase("Enter Password")) ) {
					pwdPassword.setText(null);
				}
				
			}
		});
		pwdPassword.setForeground(Color.LIGHT_GRAY);
		pwdPassword.setFont(new Font("Century Gothic", Font.BOLD, 10));
		pwdPassword.setBorder(null);
		pwdPassword.setText("Enter Password");
		pwdPassword.setBounds(196, 134, 291, 26);
		panel_1.add(pwdPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				testMyLogin();
				
			}
		});
		btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(36, 47, 65));
		btnLogin.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 15));
		btnLogin.setBorder(new CompoundBorder());
		btnLogin.setBounds(196, 273, 291, 37);
		panel_1.add(btnLogin);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(36, 47, 65));
		separator.setBounds(196, 99, 291, 12);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(36, 47, 65));
		separator_1.setBounds(196, 162, 291, 12);
		panel_1.add(separator_1);
		
		JCheckBox chckbxShowPassword = new JCheckBox("Show Password");
		chckbxShowPassword.setFont(new Font("Century Gothic", Font.ITALIC, 11));
		chckbxShowPassword.setBackground(Color.WHITE);
		chckbxShowPassword.setForeground(new Color(36, 47, 65));
		chckbxShowPassword.setCursor(new Cursor(Cursor.HAND_CURSOR));
		chckbxShowPassword.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (chckbxShowPassword.isSelected())
					pwdPassword.setEchoChar( (char) 0 );
				else
					pwdPassword.setEchoChar('*');
				
			}
		});
		chckbxShowPassword.setBounds(275, 199, 118, 23);
		panel_1.add(chckbxShowPassword);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\SLIM-TOSHIBA\\Desktop\\Prg\\- Java -\\bonjj\\images\\contacts_18px.png"));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(144, 75, 42, 32);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\SLIM-TOSHIBA\\Desktop\\Prg\\- Java -\\bonjj\\images\\unlock_18px.png"));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(144, 134, 42, 32);
		panel_1.add(label_1);
		
		JButton btnSignUp = new JButton("Sign Up ?");
		btnSignUp.setFont(new Font("Century Gothic", Font.PLAIN, 11));
		btnSignUp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Sign.demoWind();
				
			}
		});
		btnSignUp.setForeground(new Color(128, 0, 0));
		btnSignUp.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnSignUp.setBorder(null);
		btnSignUp.setBackground(Color.WHITE);
		btnSignUp.setBounds(196, 311, 291, 23);
		panel_1.add(btnSignUp);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(36, 47, 65));
		separator_2.setBounds(196, 334, 291, 14);
		panel_1.add(separator_2);
		
		JButton btnPanel = new JButton("panel1");
		btnPanel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				panel_2.setVisible(false);
				panel_1.setVisible(true);
				
			}
		});
		btnPanel.setBounds(294, 285, 89, 23);
		panel_2.add(btnPanel);
		
		JLabel label_4 = new JLabel("");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setIcon(new ImageIcon("C:\\Users\\SLIM-TOSHIBA\\Desktop\\Prg\\- Java -\\bonjj\\images\\ring.gif"));
		label_4.setBounds(271, 74, 120, 120);
		panel_2.add(label_4);
		
		JLabel lblLoggingIn = new JLabel("Logging in");
		lblLoggingIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoggingIn.setBounds(294, 226, 73, 36);
		panel_2.add(lblLoggingIn);
		
	// End initialize()
	}
	
	private void testMyLogin () {
	// Begin testMyLogin()
		
		String email = txtUsernameEmail.getText().trim();
		String passwd = new String(pwdPassword.getPassword());
		ConnToDB conn = new ConnToDB("for login");
		
		if ( ( (email.isEmpty()) && (passwd.isEmpty()) ) || ( (email.contains("Enter Username or Email")) && (passwd.contains("Enter Password")) ) )
			JOptionPane.showMessageDialog(null,"Type Something !");
			
		else {
			
			if (!conn.hashmap.containsKey(email))
				JOptionPane.showMessageDialog(null,"Email not found in Database\nplease Try again!!!");
			else {
				
				if (conn.hashmap.get(email).equals(passwd)) {
					this.secWind();
				}
				else
					JOptionPane.showMessageDialog(null,"Password not found in Database\nplease Try again!!!");
				
			}
			
		}
		
	// End testMyLogin()
	}
	
	private void secWind () {
	// Begin secWind
		
		panel_1.setVisible(false);
		panel_2.setVisible(true);
		
	// End secWind()
	}

// ---------------------------------------------Create the application.------------------------------------------------------
	Login () {
		initialize();
	}
	
// -----------------------------------------------Launch the application.------------------------------------------------------
	public static void firstWind () {
	// Begin main()
		
		EventQueue.invokeLater(new Runnable () {
			@Override
			public void run () {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	// End main()
	}
	
	
// End Class
}
