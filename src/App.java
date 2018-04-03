import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class App extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton button1;
	private JTextArea textField1;
	private JTextArea textField2;
	private JTextArea textField3;
	private String text1;

	public App() {

		this.getContentPane().setLayout(new GridLayout());
		button1 = new JButton("Path");
		button1.setBackground(new Color(255, 0, 0));
		button1.setFocusPainted(false);
		button1.setBorderPainted(false);
		textField1 = new JTextArea();
		textField1.setFocusable(true);
		textField2 = new JTextArea("Request");
		textField2.setFocusable(false);
		textField2.setFont(new Font("TimesRoman", Font.BOLD, 20));
		JScrollPane scroll1 = new JScrollPane(textField2);
		scroll1.setFocusable(false);
		scroll1.setBorder(null);
		textField3 = new JTextArea("Response");
		textField3.setFont(new Font("TimesRoman", Font.BOLD, 20));
		JScrollPane scroll2 = new JScrollPane(textField3);
		scroll2.setFocusable(false);

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

	public void start() {
		JFrame frame = this;
		frame.setSize(new Dimension(400, 400));
		frame.setPreferredSize(new Dimension(400, 400));

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

	public JTextArea getTextField1() {
		return textField1;
	}

	public void setTextField1(JTextArea textField1) {
		this.textField1 = textField1;
	}

	public JTextArea getTextField2() {
		return textField2;
	}

	public void setTextField2(JTextArea textField2) {
		this.textField2 = textField2;
	}

	public JTextArea getTextField3() {
		return textField3;
	}

	public void setTextField3(JTextArea textField3) {
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
