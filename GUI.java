package verify_email;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/* Muhammad Uzair */


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.util.* ;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField email_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
					GUI frame = new GUI();
					frame.setVisible(true);}});}
	/**
	 * Check Function
	 */
	public  boolean check(List<String> listname) {
		String search =  "gmail.com";
		String search_1= "hotmail.com";
		String search_2= "yahoo.com";
		String search_3= "live.com";
		for(String str: listname) {
		    if(str.trim().contains(search)) {return true;}
		    else if(str.trim().contains(search_1)) {return true;}
		    else if(str.trim().contains(search_2)) {return true;}
		    else if(str.trim().contains(search_3)) {return true;}
			}
		
		return false;}
		
	
	/**
	 * Fetch Data 
	 */
	public  void fetch() {
		String mail = email_field.getText();
		//JOptionPane.showMessageDialog(null,mail);
		if(mail.equals("@gmail.com")) {JOptionPane.showMessageDialog(null, "Invalid Email Address :(");}
		else if(mail.equals("@hotmail.com")){JOptionPane.showMessageDialog(null, "Invalid Email Address :(");}
		else if(mail.equals("@yahoo.com")) {JOptionPane.showMessageDialog(null, "Invalid Email Address :(");}
		else if(mail.equals("@live.com")) {JOptionPane.showMessageDialog(null, "Invalid Email Address :(");}
		else {
		     List<String> names = new ArrayList<String>(Arrays.asList(mail.split("@")));
	         if(check(names) == true){JOptionPane.showMessageDialog(null, "Congratulation !! This Valid Email Address :)");}
	         else{JOptionPane.showMessageDialog(null, "Invalid Email Address :(");}
	}}
	/**
	 * Create the frame.
	 */
	public GUI() {
		setTitle("Email Address verification");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Email Address :");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 123, 197, 34);
		contentPane.add(lblNewLabel);
		
		email_field = new JTextField();
		email_field.setBounds(193, 128, 245, 29);
		contentPane.add(email_field);
		email_field.setColumns(10);
		
		JButton btn_save = new JButton("verify");
		btn_save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 fetch();
			}
		});
		
		btn_save.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_save.setBounds(167, 196, 85, 39);
		contentPane.add(btn_save);
		
		JLabel lblNewLabel_1 = new JLabel("Verify Email Address");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(105, 23, 227, 55);
		contentPane.add(lblNewLabel_1);
	}
}
