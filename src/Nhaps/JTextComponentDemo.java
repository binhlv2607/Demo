package Nhaps;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")

public class JTextComponentDemo extends JFrame {

	JTextField tField;
	JPasswordField pwField;
	JTextArea tArea;
	JFormattedTextField formattedField;
	
	public JTextComponentDemo() {
		// JPanel for the text fields
		JPanel tfPanel = new JPanel(new GridLayout(3, 2, 10, 2));
		tfPanel.setBorder(BorderFactory.createTitledBorder("Text Fields: "));
		tfPanel.add(new JLabel("  JTextField: "));
		tField = new JTextField(10);
		tfPanel.add(tField);
		tField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tArea.append("\n You have typed " + tField.getText());
			}
		});

		// password row 2
		tfPanel.add(new JLabel("JPasswordField: "));
		pwField = new JPasswordField(10);
		tfPanel.add(pwField);
		pwField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tArea.append("\nYou password is "
						+ new String(pwField.getPassword()));
			}
		});

		// row 3
		tfPanel.add(new JLabel("  JFormattedTextField"));
		formattedField = new JFormattedTextField(java.util.Calendar
				.getInstance().getTime());
		tfPanel.add(formattedField);
		// Create a JTextArea
		tArea = new JTextArea(
				"A JTextArea is a \" plain\" editable text component, "
						+ "which means that although it can display text in any font, "
						+ "all of the text is in the same font.");
		tArea.setFont(new Font("Serif", Font.ITALIC, 13));
		tArea.setLineWrap(true);
		tArea.setWrapStyleWord(true);
		tArea.setBackground(new Color(204, 238, 241));

		// Wrap the JTextArea inside a JScrollPane
		JScrollPane tAreaScrollPane = new JScrollPane(tArea);
		tAreaScrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10,
				10));
		tAreaScrollPane
				.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		// Setup the content-pane of JFrame in BorderLayout Container cp =
		// this.getContentPane(); cp.setLayout(new BorderLayout(5, 5));
		// cp.add(tfPanel, BorderLayout.NORTH); cp.add(tAreaScrollPane,
		// BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("JTextComponent Demo");
		setSize(350, 350);
		setVisible(true);
		
	}
	
	// main
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() { @Override
	         public void run() {
	            new JTextComponentDemo();
	} });
	}
}
	