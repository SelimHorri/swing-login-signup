package my_pack;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Sign {
// Begin Class
	
	private JFrame frmSignUp;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtEmail;
	private JPasswordField pwdPassword1;
	private JPasswordField pwdPassword2;
	
// -------------------------------------------Initialize the contents of the frame---------------------------------------------------------
	private void initialize () {
	// Begin initialize()
		
		frmSignUp = new JFrame();
		frmSignUp.setResizable(false);
		frmSignUp.setTitle("Sign up");
		frmSignUp.getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String pass = new String(pwdPassword1.getPassword());
				String pass2 = new String(pwdPassword2.getPassword());
				
				if ( (txtFirstName.getText().isEmpty()) || (txtFirstName.getText().equalsIgnoreCase("Enter First name")) ) {
					txtFirstName.setForeground(Color.GRAY);
					txtFirstName.setText("Enter First name");
				}
				
				if ( (txtLastName.getText().isEmpty()) || (txtLastName.getText().equalsIgnoreCase("Enter Last name")) ) {
					txtLastName.setForeground(Color.GRAY);
					txtLastName.setText("Enter Last name");
				}
				
				if ( (txtEmail.getText().isEmpty()) || (txtEmail.getText().equalsIgnoreCase("Enter Email")) ) {
					txtEmail.setForeground(Color.GRAY);
					txtEmail.setText("Enter Email");
				}
				
				if ( (pass.isEmpty()) || (pass.equalsIgnoreCase("Enter Password")) ) {
					pwdPassword1.setForeground(Color.GRAY);
					pwdPassword1.setText("Enter Password");
				}
				
				if ( (pass2.isEmpty()) || (pass2.equalsIgnoreCase("Enter Password")) ) {
					pwdPassword2.setForeground(Color.GRAY);
					pwdPassword2.setText("Enter Password");
				}
				
			}
		});
		frmSignUp.getContentPane().setBackground(new Color(36, 47, 65));
		frmSignUp.setBounds(100, 100, 953, 509);
		frmSignUp.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frmSignUp.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(97, 212, 195));
		panel.setBounds(0, 0, 470, 479);
		frmSignUp.getContentPane().add(panel);
		panel.setLayout(null);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(new Color(255, 255, 255));
		separator_3.setBounds(97, 289, 285, 12);
		panel.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(new Color(255, 255, 255));
		separator_4.setBounds(133, 312, 207, 12);
		panel.add(separator_4);
		
		JLabel lblFullName = new JLabel("First Name :");
		lblFullName.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblFullName.setForeground(Color.LIGHT_GRAY);
		lblFullName.setBounds(570, 39, 88, 19);
		frmSignUp.getContentPane().add(lblFullName);
		
		JLabel lblPassword = new JLabel("PASSWORD :");
		lblPassword.setForeground(Color.LIGHT_GRAY);
		lblPassword.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblPassword.setBounds(570, 269, 88, 19);
		frmSignUp.getContentPane().add(lblPassword);
		
		JLabel lblEmail = new JLabel("EMAIL :");
		lblEmail.setForeground(Color.LIGHT_GRAY);
		lblEmail.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblEmail.setBounds(570, 196, 51, 19);
		frmSignUp.getContentPane().add(lblEmail);
		
		txtFirstName = new JTextField();
		txtFirstName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				int c = e.getKeyCode();
				
				if (c == KeyEvent.VK_ENTER)
					saveInDatabase();
				
			}
		});
		txtFirstName.setCaretColor(new Color(255, 255, 255));
		txtFirstName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				if ( (txtFirstName.getText().isEmpty()) || (txtFirstName.getText().equals("Enter First name")) ) {
					txtFirstName.setForeground(Color.GRAY);
					txtFirstName.setText("Enter First name");
				}
				
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				txtFirstName.setForeground(Color.WHITE);
				
				if ( (txtFirstName.getText().isEmpty()) || (txtFirstName.getText().equals("Enter First name"))) {
					txtFirstName.setText(null);
				}
				
			}
		});
		txtFirstName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtFirstName.setForeground(Color.WHITE);
				
				if ( (txtFirstName.getText().isEmpty()) || (txtFirstName.getText().equals("Enter First name"))) {
					txtFirstName.setText(null);
				}
				
			}
		});
		txtFirstName.setFont(new Font("Century Gothic", 0, 12)); // NOI18N
		txtFirstName.setForeground(Color.GRAY);
		txtFirstName.setText("Enter First name");
		txtFirstName.setBorder(null);
		txtFirstName.setDisabledTextColor(new Color(204, 204, 204));
		txtFirstName.setBackground(new Color(36, 47, 65));
		txtFirstName.setBounds(570, 69, 285, 23);
		frmSignUp.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(570, 96, 285, 12);
		frmSignUp.getContentPane().add(separator);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setForeground(Color.LIGHT_GRAY);
		lblLastName.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblLastName.setBounds(570, 119, 88, 19);
		frmSignUp.getContentPane().add(lblLastName);
		
		txtLastName = new JTextField();
		txtLastName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				int c = e.getKeyCode();
				
				if (c == KeyEvent.VK_ENTER)
					saveInDatabase();
				
			}
		});
		txtLastName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				if ( (txtLastName.getText().isEmpty()) || (txtLastName.getText().equalsIgnoreCase("Enter Last name")) ) {
					txtLastName.setForeground(Color.GRAY);
					txtLastName.setText("Enter Last name");
				}
				
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				txtLastName.setForeground(Color.WHITE);
				
				if ( (txtLastName.getText().isEmpty()) || (txtLastName.getText().equalsIgnoreCase("Enter Last name")) ) {
					txtLastName.setText(null);
				}
				
			}
		});
		txtLastName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtLastName.setForeground(Color.WHITE);
				
				if ( (txtLastName.getText().isEmpty()) || (txtLastName.getText().equalsIgnoreCase("Enter Last name")) ) {
					txtLastName.setText(null);
				}
				
			}
		});
		txtLastName.setText("Enter Last name");
		txtLastName.setForeground(Color.GRAY);
		txtLastName.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtLastName.setDisabledTextColor(new Color(204, 204, 204));
		txtLastName.setColumns(10);
		txtLastName.setCaretColor(Color.WHITE);
		txtLastName.setBorder(null);
		txtLastName.setBackground(new Color(36, 47, 65));
		txtLastName.setBounds(570, 149, 285, 23);
		frmSignUp.getContentPane().add(txtLastName);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(570, 173, 285, 12);
		frmSignUp.getContentPane().add(separator_5);
		
		txtEmail = new JTextField();
		txtEmail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				int c = e.getKeyCode();
				
				if (c == KeyEvent.VK_ENTER)
					saveInDatabase();
				
			}
		});
		txtEmail.setCaretColor(new Color(255, 255, 255));
		txtEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				if ( (txtEmail.getText().isEmpty()) || (txtEmail.getText().equals("Enter Email")) ) {
					txtEmail.setForeground(Color.GRAY);
					txtEmail.setText("Enter Email");
				}
				
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				txtEmail.setForeground(Color.WHITE);
				
				if ( (txtEmail.getText().isEmpty()) || (txtEmail.getText().equals("Enter Email")) ) {
					txtEmail.setText(null);
				}
				
			}
		});
		txtEmail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtEmail.setForeground(Color.WHITE);
				
				if ( (txtEmail.getText().isEmpty()) || (txtEmail.getText().equals("Enter Email")) ) {
					txtEmail.setText(null);
				}
				
			}
		});
		txtEmail.setText("Enter Email");
		txtEmail.setForeground(Color.GRAY);
		txtEmail.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtEmail.setDisabledTextColor(new Color(204, 204, 204));
		txtEmail.setColumns(10);
		txtEmail.setBorder(null);
		txtEmail.setBackground(new Color(36, 47, 65));
		txtEmail.setBounds(570, 223, 285, 23);
		frmSignUp.getContentPane().add(txtEmail);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(570, 320, 285, 12);
		frmSignUp.getContentPane().add(separator_1);
		
		pwdPassword1 = new JPasswordField();
		pwdPassword1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				int c = e.getKeyCode();
				
				if (c == KeyEvent.VK_ENTER)
					saveInDatabase();
				
			}
		});
		pwdPassword1.setCaretColor(new Color(255, 255, 255));
		pwdPassword1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String pass = new String(pwdPassword1.getPassword());
				
				if ( (pass.isEmpty()) || (pass.equals("Enter Password")) ) {
					pwdPassword1.setForeground(Color.GRAY);
					pwdPassword1.setText("Enter Password");
				}
				
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				pwdPassword1.setForeground(Color.WHITE);
				
				String pass = new String(pwdPassword1.getPassword());
				
				if ( (pass.isEmpty()) || (pass.equals("Enter Password"))) {
					pwdPassword1.setText(null);
				}
				
			}
		});
		pwdPassword1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				pwdPassword1.setForeground(Color.WHITE);
				
				String pass = new String(pwdPassword1.getPassword());
				
				if ( (pass.isEmpty()) || (pass.equals("Enter Password"))) {
					pwdPassword1.setText(null);
				}
				
			}
		});
		pwdPassword1.setText("Enter Password");
		pwdPassword1.setBorder(null);
		pwdPassword1.setFont(new Font("Century Gothic", 0, 10)); // NOI18N
		pwdPassword1.setForeground(Color.GRAY);
		pwdPassword1.setBackground(new Color(36, 47, 65));
		pwdPassword1.setBounds(570, 299, 285, 19);
		frmSignUp.getContentPane().add(pwdPassword1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(570, 247, 285, 12);
		frmSignUp.getContentPane().add(separator_2);
		
		JLabel lblRetypePassword = new JLabel("Retype Password :");
		lblRetypePassword.setForeground(Color.LIGHT_GRAY);
		lblRetypePassword.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblRetypePassword.setBounds(570, 343, 129, 19);
		frmSignUp.getContentPane().add(lblRetypePassword);
		
		pwdPassword2 = new JPasswordField();
		pwdPassword2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				int c = e.getKeyCode();
				
				if (c == KeyEvent.VK_ENTER)
					saveInDatabase();
				
			}
		});
		pwdPassword2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				String pass = new String(pwdPassword2.getPassword());
				
				if ( (pass.isEmpty()) || (pass.equals("Enter Password")) ) {
					pwdPassword2.setForeground(Color.GRAY);
					pwdPassword2.setText("Enter Password");
				}
				
			}
			@Override
			public void focusGained(FocusEvent e) {
				
				pwdPassword2.setForeground(Color.WHITE);
				
				String pass = new String(pwdPassword2.getPassword());
				
				if ( (pass.isEmpty()) || (pass.equals("Enter Password"))) {
					pwdPassword2.setText(null);
				}
				
			}
		});
		pwdPassword2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				pwdPassword2.setForeground(Color.WHITE);
				
				String pass = new String(pwdPassword2.getPassword());
				
				if ( (pass.isEmpty()) || (pass.equals("Enter Password"))) {
					pwdPassword2.setText(null);
				}
				
			}
		});
		pwdPassword2.setText("Enter Password");
		pwdPassword2.setForeground(Color.GRAY);
		pwdPassword2.setFont(new Font("Century Gothic", Font.PLAIN, 10));
		pwdPassword2.setCaretColor(Color.WHITE);
		pwdPassword2.setBorder(null);
		pwdPassword2.setBackground(new Color(36, 47, 65));
		pwdPassword2.setBounds(570, 373, 285, 19);
		frmSignUp.getContentPane().add(pwdPassword2);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(570, 392, 285, 12);
		frmSignUp.getContentPane().add(separator_6);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				saveInDatabase();
				
			}
		});
		btnSave.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnSave.setBorder(new CompoundBorder(new LineBorder(new Color(0, 128, 128)), null));
		btnSave.setBackground(Color.WHITE);
		btnSave.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 14));
		btnSave.setForeground(new Color(36, 47, 65));
		btnSave.setBounds(790, 432, 89, 23);
		frmSignUp.getContentPane().add(btnSave);
		
		JCheckBox chckPassword = new JCheckBox("Show Password");
		chckPassword.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (chckPassword.isSelected()) {
					pwdPassword1.setEchoChar( (char) 0 );
					pwdPassword2.setEchoChar( (char) 0 );
				}
				
				else {
					pwdPassword1.setEchoChar('*');
					pwdPassword2.setEchoChar('*');
				}
				
			}
		});
		chckPassword.setBackground(new Color(36, 47, 65));
		chckPassword.setFont(new Font("Century Gothic", Font.ITALIC, 10));
		chckPassword.setForeground(new Color(97, 212, 195));
		chckPassword.setBounds(570, 399, 105, 23);
		frmSignUp.getContentPane().add(chckPassword);
		
	// End initialize()
	}
	
	private void saveInDatabase () {
	// Begin saveInDatabase()
		
		String fname = txtFirstName.getText().trim();
		String lname = txtLastName.getText().trim();
		String email = txtEmail.getText().trim();
		String passwd1 = new String(pwdPassword1.getPassword());
		String passwd2 = new String(pwdPassword2.getPassword());
		
		if ( ( (fname.isEmpty()) || (lname.isEmpty()) || (email.isEmpty()) || (passwd1.isEmpty()) || (passwd2.isEmpty()) ) || ( (fname.contains("Enter First name")) || (lname.contains("Enter Last name")) || (email.contains("Enter Email")) || (passwd1.contains("Enter Password")) || (passwd2.contains("Enter Password")) ) ) {
			// label.setText(null);
			JOptionPane.showMessageDialog(null,"Missing Data!!\\nComplete tuple data to save in Database.");
		}
		
		else {
			
			if ( !(passwd1.equals(passwd2)) ) {
				// label.setText("Uncompatible password !");
				JOptionPane.showMessageDialog(null,"Uncompatible password !");
			}
			
			else {
				// label.setText(null);
				ConnToDB cc = new ConnToDB("");
				cc.insertData(fname,lname,email,passwd1);
				JOptionPane.showMessageDialog(null,"Data saved successfully");
				txtFirstName.setText(null);
				txtLastName.setText(null);
				txtEmail.setText(null);
				pwdPassword1.setText(null);
				pwdPassword2.setText(null);
			}
			
		}
		
	// End saveInDatabase()
	}
	
// -------------------------------------------Create the application.----------------------------------------------------------------------
	Sign () {
		initialize();
	}
	
// -------------------------------------------Launch the application.----------------------------------------------------------------------
	public static void demoWind () {
	// Begin demoWind()
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run () {
				try {
					Sign window = new Sign();
					window.frmSignUp.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	// Begin demoWind()
	}
	
	
// End Class
}
