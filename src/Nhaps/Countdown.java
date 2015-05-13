package Nhaps;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Countdown extends Frame implements ActionListener, WindowListener{

	private Label lblCount;
	private TextField tfCount;
	private Button btnCount;
	
	public Countdown() {
		setLayout(new FlowLayout());
		lblCount = new Label("Counter");						// tao mot label voi nhan la counter
		add(lblCount);											// them label vao frame countdown
		tfCount = new TextField(10);							// tao mot textField
		add(tfCount);											// them vao frame
		btnCount = new Button("Countdown"); 					// tao mot button voi nhan laf countdown
		add(btnCount); 											// them button vao frame
		btnCount.addActionListener(this);
		addWindowListener(this); 
		setTitle("Countdown");
		setSize(250, 100); 
		setLocationRelativeTo(null);//appear at center 
		setVisible(true);
	}
	
	public static void main(String[] args) {
        Countdown app = new Countdown();
   }
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
	// phuong thuc tat duoc cua so khi chay chuong trinh nhung phim an va phong t van chay binh 
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0); // Terminate the program
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

	@Override
	public void actionPerformed(ActionEvent e) {
		int count = 0;
		count = Integer.parseInt(tfCount.getText());
		if (tfCount.isEditable()) tfCount.setEditable(false);
		      count--;
		      if(count < 1)
		         btnCount.setEnabled(false);
		      tfCount.setText(count + "");		
	}

}
