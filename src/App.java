import javax.swing.*;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
	private JButton button1;
	private JTextField textField1;
	private JPanel panel;
	private JTextField textField2;
	private JTextField textField3;
	private String text1;

	public App() {
		
		

		this.getContentPane().setLayout(new GridLayout());
		button1 = new JButton("Path");
		textField1 = new JTextField();
		panel = new JPanel();
		textField2 = new JTextField("Request");
		JScrollPane scroll1 = new JScrollPane(textField2);
		textField3 = new JTextField("Response");
		JScrollPane scroll2 = new JScrollPane(textField3);
		text1 = "";
		add(button1);
		add(textField1);
		add(scroll1);
		add(scroll2);


		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				text1 = textField1.getText();
				System.out.println(textField1.getText());
			}
		});
	}
	
	public void start () {
		JFrame frame = this;
		frame.setSize(new Dimension(400,400));
		frame.setPreferredSize(new Dimension(400,400));

		// Display the window.
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JButton getButton1() {
		return button1;
	}

	public void setButton1(JButton button1) {
		this.button1 = button1;
	}

	public JTextField getTextField1() {
		return textField1;
	}

	public void setTextField1(JTextField textField1) {
		this.textField1 = textField1;
	}

	public JTextField getTextField2() {
		return textField2;
	}

	public void setTextField2(JTextField textField2) {
		this.textField2 = textField2;
	}

	public JTextField getTextField3() {
		return textField3;
	}

	public void setTextField3(JTextField textField3) {
		this.textField3 = textField3;
	}

	public String getText1() {
		return text1;
	}

	public void setText1(String text1) {
		this.text1 = text1;
	}

	public static void main(String[] args) {



	}
}
