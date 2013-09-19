package airHockey;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.font.TextAttribute;
import java.io.File;
import java.io.IOException;
import java.text.AttributedString;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AirHockey extends JFrame implements KeyListener {
	Image img=null;
	int xb=700,yb=250;
	int xl=650,yl=0;
	int xh=650,yh=60;
	int d=2;
	int a=1,b=1;
	JLabel image =null;
	
	int xhg=0;
	int yhg=0;
	int xlg=0;
	int ylg=0;
	int scoreh=0;
    int scorel=0;
	//AttributedString as0=null,as1,as2,as3,as4,as5,as6,as7,as8,as9,as10;
	public AirHockey()
	{
		
		Toolkit toolkit =  Toolkit.getDefaultToolkit ();
		  Dimension dim = toolkit.getScreenSize();
		  dim.height=dim.height -40;
		  System.out.println("Width of Screen Size is "+dim.width+" pixels");
		  System.out.println("Height of Screen Size is "+dim.height+" pixels");
		setSize(dim);
		setLayout(new BorderLayout());
		JLabel background=new JLabel(new ImageIcon("C:\\Users\\AKA\\Desktop\\Libraries\\Pictures\\airh"));
		add(background);
//		background.setLayout(new FlowLayout());
				setVisible(true);
		
		setBackground(Color.CYAN);
		pause=1;
		addKeyListener(this);
	}
	int i=0;
	
	public void run(){
        try{
            Thread.sleep(4);
        }
         catch(Exception e){ }
        repaint();
}
	public void paint(Graphics g)
	{
		
	
		
		
		xhg=getBounds().width/2-250;
		yhg=20;
		xlg=getBounds().width/2-250;
		ylg=getBounds().height-20;
		yl=getBounds().height-60;
//		image =new JLabel();
//		image.setIcon(new ImageIcon("e://image.jpg"));
//		add(image);
//		try {
//			Image img = ImageIO.read(new File("e://image.jpg"));
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		g.drawImage(img, 0, 0, null);
		
		if(pause!=1)
		{
		xb+=a*d;
		yb+=b*d;
		}
		if(xb>getBounds().width-15||xb<10)
			a=a*-1;
		if(yb==yl-20&& (xb>xl-10)&&xb<xl+85)
			{
				if(xb<=xl+26)
				{b=-1;
				a=-1;
				}
				else if(xb>xl+26&&xb<=xl+52)
				{
					a=0;
					b=-1;
					
				}
				else if (xb>xl+52)
				{
					a=1;
					b=-1;
				}
			}
		 
		if(yb==yh+30&& (xb>xh-10)&&xb<xh+85)
		{
			if(xb<=xh+26)
		{b=1;
		a=-1;
		}
		else if(xb>xh+26&&xb<=xh+52)
		{
			a=0;
			b=1;
			
		}
		else if (xb>xh+52)
		{
			a=1;
			b=1;
		}
		}
//		try {
//			Thread.sleep(2);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		if((yb>getBounds().height-20||yb<30))
		{
				if (xb<getBounds().width/2-250 || xb > getBounds().width/2+250 )
				{		b=b*-1;
				
				}
				else
				{
					if(yb<100)
					{
						scorel++;
						xb=600;
						yb=500;
					
					}
					else if(yb>100)
					{
						scoreh++;
						xb=600;
						yb=500;
						
					}
//					a=a*-1;
//					b=b*-1;
				}
		}			
		
		
		//For stopping paddles from going outside
		if(xl<5)
			xl=5;
		if(xl>getBounds().width-85)
			xl=getBounds().width-85;
		if(xh<5)
			xh=5;
		if(xh>getBounds().width-85)
			xh=getBounds().width-85;
		
		
			
		g.clearRect(0, 0, getBounds().width, getBounds().height); 
		

		g.setColor(Color.LIGHT_GRAY);
//		g.fillRect(xlg, ylg-100, 180, 100);
//		g.fillRect(xhg, yhg+15, 180, 100);
		g.fillOval(xlg,ylg-80 , 500, 200);
		g.fillOval(xhg,yhg-100 , 500, 200);
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(xhg, yhg, 500, 20);
		g.fillRect(xlg, ylg, 500, 20);
//		try {
//			Thread.sleep(2);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
		g.setColor(Color.YELLOW);
		g.fillOval(xb, yb, 15, 15);
		
		g.fillRect(xl, yl, 80, 20);
		g.fillRect(xh, yh, 80, 20);
		
		
	    
	    
		
		
//		
//		Graphics2D g2d = (Graphics2D) g;
//	    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//	    
//	    AttributedString as0 = new AttributedString("0");
//	    AttributedString as1 = new AttributedString("1");
//	    AttributedString as2 = new AttributedString("2");
//	    AttributedString as3 = new AttributedString("3");
//	    AttributedString as4 = new AttributedString("4");
//	    AttributedString as5 = new AttributedString("5");
//	    AttributedString as6 = new AttributedString("6");
//	    AttributedString as7 = new AttributedString("7");
//	    AttributedString as8 = new AttributedString("8");
//	    AttributedString as9 = new AttributedString("9");
//	    AttributedString as10 = new AttributedString("10");
//		
//	    as0.addAttribute(TextAttribute.SIZE, 40);
//	    as1.addAttribute(TextAttribute.SIZE, 40);
//	    as2.addAttribute(TextAttribute.SIZE, 40);
//	    as3.addAttribute(TextAttribute.SIZE, 40);
//	    as4.addAttribute(TextAttribute.SIZE, 40);
//	    as5.addAttribute(TextAttribute.SIZE, 40);
//	    as6.addAttribute(TextAttribute.SIZE, 40);
//	    as7.addAttribute(TextAttribute.SIZE, 40);
//	    as8.addAttribute(TextAttribute.SIZE, 40);
//	    as9.addAttribute(TextAttribute.SIZE, 40);
//	    as10.addAttribute(TextAttribute.SIZE, 40);
//
//	    
	    g.setColor(Color.blue);
	    
		
		g.drawString(""+scorel, 40, 80);
		g.fillRect(xl, yl+5, 80, 10);
		
//		if(scorel==0)
//		    g2d.drawString(as0.getIterator(), 40, 60);
//			else if(scorel==1)
//				g2d.drawString(as1.getIterator(), 40, 60);
//			
//				else if(scorel==2)
//					g2d.drawString(as2.getIterator(), 40, 60);
//			
//					else if(scorel==3)
//						g2d.drawString(as3.getIterator(), 40, 60);
//						else if(scorel==4)
//							g2d.drawString(as4.getIterator(), 40, 60);
//							else if(scorel==5)
//								g2d.drawString(as5.getIterator(), 40, 60);
//									else if(scorel==6)
//										g2d.drawString(as6.getIterator(), 40, 60);
//										else if(scorel==7)
//											g2d.drawString(as7.getIterator(), 40, 60);
//											else if(scorel==8)
//												g2d.drawString(as8.getIterator(), 40, 60);
//												else if(scorel==9)
//													g2d.drawString(as9.getIterator(), 40, 60);
//													else if(scorel==10)
//													{
//														g2d.drawString(as10.getIterator(), 40, 60);
//														pause=1;
//													}
		g.setColor(Color.red);
		g.drawString(""+scoreh, 15, 80);
		g.fillRect(xh, yh+5, 80, 10);
		
		Font font =new Font("Arial",1,40);
		g.setFont(font);
		g.setColor(Color.PINK);
		if(scoreh==5)
		{
			pause=1;
			g.drawString("RED WINS", getBounds().width/2-100, getBounds().height/2);
		}
	
		if(scorel==5)
		{
			pause=1;
			g.drawString("BLUE WINS", getBounds().width/2-100, getBounds().height/2);
		}
	run();
//		if(scoreh==0)
//	    g2d.drawString(as0.getIterator(), 15, 60);
//		else if(scoreh==1)
//			g2d.drawString(as1.getIterator(), 15, 60);
//		
//			else if(scoreh==2)
//				g2d.drawString(as2.getIterator(), 15, 60);
//		
//				else if(scoreh==3)
//					g2d.drawString(as3.getIterator(), 15, 60);
//					else if(scoreh==4)
//						g2d.drawString(as4.getIterator(), 15, 60);
//						else if(scoreh==5)
//							g2d.drawString(as5.getIterator(), 15, 60);
//								else if(scoreh==6)
//									g2d.drawString(as6.getIterator(), 15, 60);
//									else if(scoreh==7)
//										g2d.drawString(as7.getIterator(), 15, 60);
//										else if(scoreh==8)
//											g2d.drawString(as8.getIterator(), 15, 60);
//											else if(scoreh==9)
//												g2d.drawString(as9.getIterator(), 15, 60);
//												else if(scoreh==10)
//												{
//													g2d.drawString(as10.getIterator(), 15, 60);
//													pause=1;
//												}
		
		
		
//		try {
//			Thread.sleep(2);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		repaint();
		
	}
	int pause=-1;
	int k=KeyEvent.VK_S;
	@Override
	public void keyPressed(KeyEvent et) {
		// TODO Auto-generated method stub
		int code=et.getKeyCode();
//		System.out.println(code);
		
		 if(code == KeyEvent.VK_P||code==k)
		 {pause*=-1;
		 k=-1;
		repaint();
		 }
		 if(pause!=1)
		 {
	      if (code == KeyEvent.VK_LEFT) {
	        
	    	  xl-=20;
	         
//	         repaint();
	      }
	      else if (code == KeyEvent.VK_RIGHT) {
	         xl+=20;
//	         repaint();
	      }
	     
	      if (code == KeyEvent.VK_A) {
	         xh-=20;
	         
//	         repaint();
	      }
	      else if (code == KeyEvent.VK_D) {
	         xh+=20;
//	         repaint();
	      }
	     
		 }
		}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
