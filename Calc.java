import java.awt.*;
import java.awt.event.*;
//package com.javacodegeeks.javabasics.stringarray;

public class Calc implements ActionListener
{
	Frame f;
	TextField tf;
	Button b[][]= {{new Button ("%"),new Button("CE"),new Button("C"),new Button("clr"),new Button("\u00F7")},{new Button("\u221A"),new Button("7"),new Button("8"),new Button("9"),new Button("\u00D7")},{new Button("x\u00B2"),new Button("4"),new Button("5"),new Button("6"),new Button("-")},{new Button("x\u00B3"),new Button("1"),new Button("2"),new Button("3"),new Button("+")},{new Button("1/x"),new Button("\u00B1"),new Button("0"),new Button("."),new Button("=")}};

	Calc(String s )
	{
	tf=new TextField();
	f= new Frame(s);
	
	int x=40,y=100,width_=100,height_=100;
			
	
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
		b[i][j].setBounds(x,y,width_,height_);
		f.add(b[i][j]);
		x=x+100;
		}
	y=y+100;
	x=40;	
	}
	
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
	(b[i][j]).addActionListener(this);
		}
	}
			
	Toolkit t=f.getToolkit();
	Dimension screensize= t.getScreenSize();
	int width=screensize.width*8/10;
	int height=screensize.height*8/10;
	f.setBounds(width/8,height/8,width,height);
	
	
	tf.setBounds(40,50,500,50);
	f.add(tf);
	f.setBackground(Color.BLACK);
	f.addWindowListener(new WindowEventListener());
	f.setLayout(null);
	f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
	
		if(e.getSource()== b[1][1])
		{
			if(tf.getText()!= null)
			{
				String s1=tf.getText();
				
			tf.setText( s1 + "7");
			}
			else
			{
				
			tf.setText("7");
			}

				
		}
		if(e.getSource()==b[1][2])
		{
			if(tf.getText()!= null)
			{
				String s1=tf.getText();
				
			tf.setText( s1 + "8");
			}
			else
			{
				
			tf.setText("8");
			}
		}
		if(e.getSource()== b[1][3])
		{
			if(tf.getText()!= null)
			{
				String s1=tf.getText();
				
			tf.setText( s1 + "9");
			}
			else
			{
				
			tf.setText("9");
			}
		}
		if(e.getSource()== b[2][1])
		{
			if(tf.getText()!= null)
			{
				String s1=tf.getText();
				
			tf.setText( s1 + "4");
			}
			else
			{
				
			tf.setText("4");
			}
		}
		if(e.getSource()== b[2][2])
		{
			if(tf.getText()!= null)
			{
				String s1=tf.getText();
				
			tf.setText( s1 + "5");
			}
			else
			{
				
			tf.setText("5");
			}
		}
		if(e.getSource()== b[2][3])
		{
			if(tf.getText()!= null)
			{
				String s1=tf.getText();
				
			tf.setText( s1 + "6");
			}
			else
			{
				
			tf.setText("6");
			}
		}
		if(e.getSource()== b[3][1])
		{
			if(tf.getText()!= null)
			{
				String s1=tf.getText();
				
			tf.setText( s1 + "1");
			}
			else
			{
				
			tf.setText("1");
			}
		}
		if(e.getSource()== b[3][2])
		{
			if(tf.getText()!= null)
			{
				String s1=tf.getText();
				
			tf.setText( s1 + "2");
			}
			else
			{
				
			tf.setText("2");
			}
		}
		if(e.getSource()== b[3][3])
		{
			if(tf.getText()!= null)
			{
				String s1=tf.getText();
				
			tf.setText( s1 + "3");
			}
			else
			{
				
			tf.setText("3");
			}
		}
		if(e.getSource()== b[4][2])
		{
			if(tf.getText()!= null)
			{
				String s1=tf.getText();
				
			tf.setText( s1 + "0");
			}
			else
			{
				
			tf.setText("0");
			}
		}
		if(e.getSource()== b[3][4])
		{
			if(tf.getText()!= null)
			{
				String s1=tf.getText();
				
			tf.setText( s1 + "+");
			}
			
			
		}
		if(e.getSource()== b[2][4])
		{
			if(tf.getText()!= null)
			{
				String s1=tf.getText();
				
			tf.setText( s1 + "-");
			}
			
			
		}
		if(e.getSource()== b[1][4])
		{
			if(tf.getText()!= null)
			{
				String s1=tf.getText();
				
			tf.setText( s1 + "\u00D7");
			}
			
			
		}
		if(e.getSource()== b[0][4])
		{
			if(tf.getText()!= null)
			{
				String s1=tf.getText();
				
			tf.setText( s1 + "\u00F7");
			}
			
			
		}
		if(e.getSource()== b[0][2])
		{
			if(tf.getText()!= null)
			{
				
				
			tf.setText("");
			}
			
			
		}
		if(e.getSource()== b[4][3])
		{
			if(tf.getText()!= null)
			{
				String s1=tf.getText();
				
			tf.setText( s1 + ".");
			}
			
			
		}
		if(e.getSource()== b[0][0])
		{
			if(tf.getText()!= null)
			{
				String s1=tf.getText();
				
			tf.setText( s1 + "%");
			}
			
			
		}
		if(e.getSource()== b[1][0])
		{
			if(tf.getText()!= null)
			{
				String s1=tf.getText();
				
			tf.setText(  "\u221A" + s1);
			}
			
			
		}
		if(e.getSource()== b[2][0])
		{
			if(tf.getText()!= null)
			{
				String s1=tf.getText();
				
			tf.setText( s1 + "\u00B2");
			}
			
			
		}
		if(e.getSource()== b[3][0])
		{
			if(tf.getText()!= null)
			{
				String s1=tf.getText();
				
			tf.setText( s1 + "\u00B3");
			}
			
			
		}
		if(e.getSource()== b[4][0])
		{
			if(tf.getText()!= null)
			{
				String s1=tf.getText();
				
			tf.setText( "1/" + s1);
			}
		}
		if(e.getSource()==b[4][4])
		{
			if(tf.getText()!= null)
			{	
				String s1=tf.getText();
				String findstring="+";
				boolean found=false;
				for(String element:s1)
				{
			//	String[] s1=new String[5];
				
				//String[] parts = new String[s1.length()];
				//parts=s1.split("+");
				//String part1=parts[0];
				//String part2=parts[1];
				//System.out.println(part1);
			//String sum=part1+part2;
			//tf.setText("sum");				
			}
	}
	}
	
	
	public static void main(String[] s)
	{
		new Calc("CASIO");
	}
}
class WindowEventListener extends WindowAdapter
{
	public void windowClosing(WindowEvent e1)
	{
		System.exit(0);
	}
}
