package airHockey;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame implements ActionListener{

	JButton start =null;

	public Main()
	{
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dim = toolkit.getScreenSize();
		  dim.height=dim.height -40;
		  System.out.println("Width of Screen Size is "+dim.width+" pixels");
		  System.out.println("Height of Screen Size is "+dim.height+" pixels");
		setSize(dim);
		setBackground(Color.RED);
		setVisible(true);
		
		start=new JButton("Click Anywhere to Start");
		add(start);
		start.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
		new AirHockey();
	}
	
	

}
