package ProjectJava;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class GUI extends Frame{
	
	public static void main(String[] args) {
		GUI mygui = new GUI();
		mygui.setSize(1000, 1000);					// tao kich thuoc 
		mygui.setVisible(true);						// hien thi farm
		mygui.setTitle("Game Pikachu");				// ten title
		
	}
	//Button[] b = new Button[100];
	Button b = new Button("b1");
	
	
	Label lblInput;
	public GUI(){
		setLayout(new FlowLayout());
		lblInput = new Label();
		lblInput.setBackground(Color.CYAN);
		add(lblInput); 
		lblInput.setText("Enter password"); 
		lblInput.getText();
		add(b);
		NgheClick bonghe = new NgheClick();
		b.addActionListener(bonghe);
	}
	
	public class NgheClick implements ActionListener, WindowListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			((Button)e.getSource()).setLabel("clicked");
			lblInput.setText("clicked");
		}

		@Override
		public void windowOpened(WindowEvent e) {
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	}
}