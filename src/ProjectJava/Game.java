package ProjectJava;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JFrame;

public class Game extends JFrame {

	public static void main(String[] args) {

		Game mygame = new Game();
		
		mygame.setBackground(Color.GREEN);
		mygame.setSize(1000, 1000);					// tao kich thuoc 
		mygame.setVisible(true);						// hien thi farm
		mygame.setTitle("Game Pikachu");				// ten title
		
	}
	
	public Game (){
		setLayout(new FlowLayout());
		Label lable = new Label();
		//lable.setBackground(Color.darkGray);
		add(lable); 
		//lable.setText("Enter password"); 
		//lable.getText();
		
	}
}
