package myproject;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class apptrack {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					apptrack window = new apptrack();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public apptrack() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1180, 672);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(324, 71, 544, 452);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("E:\\project_poli.png"));
		lblNewLabel.setBounds(0, 0, 544, 452);
		panel.add(lblNewLabel);
		
		
		 String Url = "jdbc:mysql://localhost:3306/soo";
	        String user = "root";
	        String pass = "root";
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("Trying to connect");
	            Connection connection = DriverManager.getConnection(Url,user,pass);
	            String SQL = "INSERT INTO pixel VALUES (a,b)";
	             PreparedStatement preparedStmt = connection.prepareStatement(SQL);
		
	        }catch (Exception e) {
	        	System.out.println("Unable to make connection with DB");
	            e.printStackTrace();
	        }
		
	}
}
