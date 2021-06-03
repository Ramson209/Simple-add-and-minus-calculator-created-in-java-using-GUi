import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Calculator
{

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAnswer;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,answer;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					answer=num1+num2;
					textFieldAnswer.setText(Integer.toString(answer));
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
			
			
		});
		textFieldNum1.setBounds(10, 11, 189, 41);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,answer;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					answer=num1-num2;
					textFieldAnswer.setText(Integer.toString(answer));
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
				
			
		});
		textFieldNum2.setBounds(220, 11, 193, 41);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("The Answer Is");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 150, 177, 41);
		frame.getContentPane().add(lblNewLabel_2);
		
		textFieldAnswer = new JTextField();
		textFieldAnswer.setBounds(218, 144, 177, 41);
		frame.getContentPane().add(textFieldAnswer);
		textFieldAnswer.setColumns(10);
		
		btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,answer;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					answer=num1+num2;
					textFieldAnswer.setText(Integer.toString(answer));
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
			
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(33, 77, 143, 46);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Minus");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,answer;
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					answer=num1-num2;
					textFieldAnswer.setText(Integer.toString(answer));
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
			
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(250, 77, 123, 46);
		frame.getContentPane().add(btnNewButton_1);
	}

}
