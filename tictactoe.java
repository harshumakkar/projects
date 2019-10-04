import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class tictactoe implements ActionListener
{
	Frame f;
	JTextField tf1;
	JButton res;
	int count = 0;
		int count00=0;
		int count01=0;
		int count02=0;
		int count10=0;
		int count11=0;
		int count12=0;
		int count20=0;
		int count21=0;
		int count22=0;
	JButton b[][]= {
		{new JButton (),new JButton (),new JButton ()},
		{new JButton (),new JButton (),new JButton ()},
		{new JButton (),new JButton (),new JButton ()},
		};
	tictactoe()
	{
	res = new JButton("Reset button");
	res.setBounds(118,510,150,50);
	f = new Frame();
	tf1=new JTextField("Black's Turn");
	tf1.setHorizontalAlignment(JTextField.CENTER);
	tf1.setBounds(40,50,303,50);
	res.addActionListener(this);
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
		b[i][j].addActionListener(this);
		}
	}
		
	f.add(tf1);
	f.add(res);
	
	f.addWindowListener(new WindowEventListener());
	int x=40,y=200,width_=100,height_=100;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
		b[i][j].setBounds(x,y,width_,height_);
		f.add(b[i][j]);
		x=x+103;
		}
	y=y+100;
	x=40;	
	}
	Toolkit t=f.getToolkit();
	Dimension screensize= t.getScreenSize();
	int width=screensize.width*3/10;
	int height=screensize.height*8/10;
	f.setBounds(width/4,height/6,width,height);
	f.setLayout(null);
	f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		
		
				if(e.getSource()==b[0][0])
				{	
					
					
					if(count00==0)
					{
						count00=1;
					if(count%2==0)
					{
						tf1.setText("White's Turn");
						b[0][0].setText("X");
						b[0][0].setFont(new Font("Arial", Font.PLAIN, 50));
					}
					else
					{
						tf1.setText("Black's Turn");
						b[0][0].setText("O");
						b[0][0].setFont(new Font("Arial", Font.PLAIN, 50));
					}
					count++;
					}
				
				}
				if(e.getSource()==b[0][1])
				{
					
					if(count01==0)
					{
											count01=1;

					if(count%2==0)
					{
						tf1.setText("White's Turn");
						b[0][1].setText("X");
						b[0][1].setFont(new Font("Arial", Font.PLAIN, 50));
					}
					else
					{
						tf1.setText("Black's Turn");
						b[0][1].setText("O");
						b[0][1].setFont(new Font("Arial", Font.PLAIN, 50));
					}
					count++;
					}
				
				}
				if(e.getSource()==b[0][2])
				{
					
					if(count02==0)
					{
											count02=1;

					if(count%2==0)
					{
						tf1.setText("White's Turn");
						b[0][2].setText("X");
						b[0][2].setFont(new Font("Arial", Font.PLAIN, 50));
					}
					else
					{
						tf1.setText("Black's Turn");
						b[0][2].setText("O");
						b[0][2].setFont(new Font("Arial", Font.PLAIN, 50));
					}
									count++;

					}
				}
				if(e.getSource()==b[1][0])
				{
					
					if(count10==0)
					{
											count10=1;

					if(count%2==0)
					{
						tf1.setText("White's Turn");
						b[1][0].setText("X");
						b[1][0].setFont(new Font("Arial", Font.PLAIN, 50));
					}
					else
					{
						tf1.setText("Black's Turn");
						b[1][0].setText("O");
						b[1][0].setFont(new Font("Arial", Font.PLAIN, 50));
					}
					count++;
					}
				
				}
				if(e.getSource()==b[1][1])
				{
					
					if(count11==0)
					{
											count11=1;

					if(count%2==0)
					{
						tf1.setText("White's Turn");
						b[1][1].setText("X");
						b[1][1].setFont(new Font("Arial", Font.PLAIN, 50));
					}
					else
					{
						tf1.setText("Black's Turn");
						b[1][1].setText("O");
						b[1][1].setFont(new Font("Arial", Font.PLAIN, 50));
					}
									count++;

					}
				}
				if(e.getSource()==b[1][2])
				{
					
					if(count12==0)
					{
											count12=1;

					if(count%2==0)
					{
						tf1.setText("White's Turn");
						b[1][2].setText("X");
						b[1][2].setFont(new Font("Arial", Font.PLAIN, 50));
					}
					else
					{
						tf1.setText("Black's Turn");
						b[1][2].setText("O");
						b[1][2].setFont(new Font("Arial", Font.PLAIN, 50));
					}
									count++;

					}
				}
				if(e.getSource()==b[2][0])
				{
					
					if(count20==0)
					{
											count20=1;

					if(count%2==0)
					{
						tf1.setText("White's Turn");
						b[2][0].setText("X");
						b[2][0].setFont(new Font("Arial", Font.PLAIN, 50));
					}
					else
					{
						tf1.setText("Black's Turn");
						b[2][0].setText("O");
						b[2][0].setFont(new Font("Arial", Font.PLAIN, 50));
					}
									count++;

					}
				}
				if(e.getSource()==b[2][1])
				{
					
					if(count21==0)
					{
											count21=1;

					if(count%2==0)
					{
						tf1.setText("White's Turn");
						b[2][1].setText("X");
						b[2][1].setFont(new Font("Arial", Font.PLAIN, 50));
					}
					else
					{
						tf1.setText("Black's Turn");
						b[2][1].setText("O");
						b[2][1].setFont(new Font("Arial", Font.PLAIN, 50));
					}
									count++;

					}
				}
				
				if(e.getSource()==b[2][2])
				{
					
					if(count22==0)
					{
											count22=1;

					if(count%2==0)
					{
						tf1.setText("White's Turn");
						b[2][2].setText("X");
						b[2][2].setFont(new Font("Arial", Font.PLAIN, 50));
					}
					else
					{
						tf1.setText("Black's Turn");
						b[2][2].setText("O");
						b[2][2].setFont(new Font("Arial", Font.PLAIN, 50));
					}
									count++;

					}
				}
				if( (b[0][0].getText()=="X" &&  b[0][1].getText()=="X" &&  b[0][2].getText()=="X") 
				|| (b[1][0].getText()=="X" &&  b[1][1].getText()=="X" &&  b[1][2].getText()=="X")
				|| (b[2][0].getText()=="X" &&  b[2][1].getText()=="X" &&  b[2][2].getText()=="X")
				||(b[0][0].getText()=="X" &&  b[1][0].getText()=="X" &&  b[2][0].getText()=="X") 
				|| (b[0][1].getText()=="X" &&  b[1][1].getText()=="X" &&  b[2][1].getText()=="X")
				|| (b[0][2].getText()=="X" &&  b[1][2].getText()=="X" &&  b[2][2].getText()=="X")
				|| (b[0][0].getText()=="X" &&  b[1][1].getText()=="X" &&  b[2][2].getText()=="X")
				|| (b[0][2].getText()=="X" &&  b[1][1].getText()=="X" &&  b[2][0].getText()=="X"))
				{
					tf1.setText("BLACK WINS....!");
					tf1.setBackground(Color.PINK);
					for(int i=0;i<3;i++)
						{
							for(int j=0;j<3;j++)
								{
									b[i][j].setBackground(Color.BLACK);
								}
						}
				}
				else if((b[0][0].getText()=="O" &&  b[0][1].getText()=="O" &&  b[0][2].getText()=="O") 
				|| (b[1][0].getText()=="O" &&  b[1][1].getText()=="O" &&  b[1][2].getText()=="O")
				|| (b[2][0].getText()=="O" &&  b[2][1].getText()=="O" &&  b[2][2].getText()=="O")
				|| (b[0][0].getText()=="O" &&  b[1][0].getText()=="O" &&  b[2][0].getText()=="O") 
				|| (b[0][1].getText()=="O" &&  b[1][1].getText()=="O" &&  b[2][1].getText()=="O")
				|| (b[0][2].getText()=="O" &&  b[1][2].getText()=="O" &&  b[2][2].getText()=="O")
				|| (b[0][0].getText()=="O" &&  b[1][1].getText()=="O" &&  b[2][2].getText()=="O")
				|| (b[0][2].getText()=="O" &&  b[1][1].getText()=="O" &&  b[2][0].getText()=="O"))
				{
					tf1.setText("WHITE WINS....!");
					tf1.setBackground(Color.PINK);
					for(int i=0;i<3;i++)
						{
							for(int j=0;j<3;j++)
								{
									b[i][j].setBackground(Color.WHITE);
								}
						}
				}
				if(count==9)
				{
					
					tf1.setText("GAME OVER");
					for(int i=0;i<3;i++)
						{
							for(int j=0;j<3;j++)
								{
									b[i][j].setBackground(Color.RED);
								}
						}
					
				}
				
				if(e.getSource()==res)
				{
					new tictactoe();
				}
	}
	public static void main(String... s)
	{
		new tictactoe();
	}
}




class WindowEventListener extends WindowAdapter
{
	public void windowClosing(WindowEvent e1)
	{
		System.exit(0);
	}
}
