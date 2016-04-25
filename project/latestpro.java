import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class Project extends JFrame implements ActionListener
{
ImageIcon i1;
JLabel l1,l2,l3,l4;
JPasswordField t1,t2;
JButton jb1,jb2,jb3,jb4;
Container con;
int count=0;
Project(String str)
	{
	super(str);
	con=getContentPane();
	con.setLayout(null);
	con.setBackground(Color.white);
	i1=new ImageIcon("Sample1.gif");
	l1=new JLabel("",i1,JLabel.LEFT);
	l2=new JLabel("ENTER YOUR PIN NUMBER :");
	l3=new JLabel("FOR ADMINISTRATOR LOGIN");
	l4=new JLabel("ENTER YOUR PASSWORD :");
	t1=new JPasswordField();
	t2=new JPasswordField();
	jb1=new JButton("<SUBMIT");
	jb2=new JButton("EXIT");
	jb3=new JButton("PRESS HERE");
	jb4=new JButton("<<SUBMIT");
	l1.setBounds(140,20,480,50);
	l2.setBounds(160,80,170,20);
	l3.setBounds(460,240,170,30);
	l4.setBounds(160,120,170,20);
	t1.setBounds(325,80,130,20);
	t2.setBounds(325,120,130,20);
	jb1.setBounds(475,80,120,20);
	jb2.setBounds(335,150,80,20);
	jb3.setBounds(480,275,120,20);
	jb4.setBounds(475,120,120,20);
	con.add(l1);
	con.add(l2);
	con.add(l3);
	con.add(l4);
	con.add(t1);
	con.add(t2);
	con.add(jb1);
	con.add(jb2);
	con.add(jb3);
	con.add(jb4);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	jb3.addActionListener(this);
	jb4.addActionListener(this);
	}

public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("<SUBMIT"))
		{
		if(t1.getText().equals("10001"))
			{
				JOptionPane.showMessageDialog(this,"PROCESSING YOUR REQUEST.\nCLICK OK.");
				setVisible(false);
				User u=new User("SMART SOFT 1.6.1");
				u.setSize(700,500);
				u.setLocation(300,200);
				u.setResizable(false);
				u.setVisible(true);
			}
		else if(t1.getText().equals(""))
			{
			JOptionPane.showMessageDialog(this,"ERROR :\nYou left it empty.");
			}
		else if(count == 3)
			{
						setVisible(false);
						Errors u=new Errors("SMART SOFT 1.6.1");
						u.setSize(700,500);
						u.setLocation(300,200);
						u.setResizable(false);
						u.setVisible(true);
			}
		else
			{
			JOptionPane.showMessageDialog(this,"Invalid PIN number.\nTry Again.");
			t1.setText("");
			}
		count++;
		}
	else if(ae.getActionCommand().equals("<<SUBMIT"))
		{
		if(t2.getText().equals("160110737001"))
			{
				JOptionPane.showMessageDialog(this,"PROCESSING YOUR REQUEST.\nCLICK OK.");
				setVisible(false);
				Personal u=new Personal("SMART SOFT 1.6.1");
				u.setSize(700,500);
				u.setLocation(300,200);
				u.setResizable(false);
				u.setVisible(true);
			}
		else if(t2.getText().equals(""))
			{
			JOptionPane.showMessageDialog(this,"ERROR :\nYou left it empty.");
			}
		else if(count == 3)
			{
						setVisible(false);
						Errors u=new Errors("SMART SOFT 1.6.1");
						u.setSize(700,500);
						u.setLocation(300,200);
						u.setResizable(false);
						u.setVisible(true);
			}
		else
			{
			JOptionPane.showMessageDialog(this,"Invalid PIN number.\nTry Again.");
			t1.setText("");
			}
		count++;
		}
	else if(ae.getActionCommand().equals("EXIT"))
		{
			JOptionPane.showMessageDialog(this,"CLOSING.\nCLICK OK.");
			System.exit(0);
		}
	else if(ae.getActionCommand().equals("PRESS HERE"))
		{
			JOptionPane.showMessageDialog(this,"PROCESSING YOUR REQUEST.\nCLICK OK.");
			setVisible(false);
			Admin a=new Admin("SMART SOFT 1.6.1");
			a.setSize(700,400);
			a.setLocation(300,200);
			a.setResizable(false);
			a.setVisible(true);
		}
	}
}

class Personal extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5,l6,l7;
JTextField t1;
JButton jb1,jb2;
int count=0;
Personal(String s)
	{
	super(s);
	Container con=getContentPane();
	con.setLayout(null);
	l1=new JLabel("LIST OF OPTIONS TO VIEW");
	l2=new JLabel("1. DRIVERS LICENSE");
	l3=new JLabel("2. MEMBERSHIP CARD");
	l4=new JLabel("3. VOTER CARD");
	l5=new JLabel("4. TO VIEW CURRENT DETAILS");
	l6=new JLabel("5. TO CALC. OUR INTEREST");
	l7=new JLabel("ENTER YOUR DESIRED OPTION");
	t1=new JTextField();
	jb1=new JButton("SUBMIT");
	jb2=new JButton("EXIT");
	l1.setBounds(170,40,300,30);
	l2.setBounds(250,80,200,30);
	l3.setBounds(250,110,200,30);
	l4.setBounds(250,140,200,30);
	l5.setBounds(250,170,300,30);
	l6.setBounds(250,200,300,30);
	l7.setBounds(170,250,300,30);
	t1.setBounds(400,255,130,20);
	jb1.setBounds(265,315,80,20);
	jb2.setBounds(355,315,80,20);
	con.add(l1);
	con.add(l2);
	con.add(l3);
	con.add(l4);
	con.add(l5);
	con.add(l6);
	con.add(l7);
	con.add(t1);
	con.add(jb1);
	con.add(jb2);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("SUBMIT"))
		{
		if(t1.getText().equals("1"))
			{
				setVisible(false);
				PersonalOptionUpdate1 p=new PersonalOptionUpdate1("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else if(t1.getText().equals("2"))
			{
				setVisible(false);
				PersonalOptionUpdate2 p=new PersonalOptionUpdate2("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else if(t1.getText().equals("3"))
			{
				setVisible(false);
				PersonalOptionUpdate3 p=new PersonalOptionUpdate3("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else if(t1.getText().equals("4"))
			{
				UserOptionDetails p=new UserOptionDetails("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setVisible(true);
			}
		else if(t1.getText().equals("5"))
			{
				setVisible(false);
				PersonalOptionUpdate4 p=new PersonalOptionUpdate4("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else if(count == 3)
			{
						setVisible(false);
						Errors u=new Errors("SMART SOFT 1.6.1");
						u.setSize(700,500);
						u.setLocation(300,200);
						u.setResizable(false);
						u.setVisible(true);
			}
		else
			{
			JOptionPane.showMessageDialog(this,"Invalid Selection.\nTry Again.");
			t1.setText("");
			}
		count++;
		}
	else if(ae.getActionCommand().equals("EXIT"))
		{
		JOptionPane.showMessageDialog(this,"You are exiting.\nLogin again when required.\nCLICK OK.");
		setVisible(false);
		Project p=new Project("SMART SOFT 1.6.1");
		p.setSize(700,400);
		p.setLocation(300,200);
		p.setResizable(false);
		p.setVisible(true);
		}
	}
}

class PersonalOptionUpdate1 extends JFrame implements ActionListener
{
ImageIcon i1;
JLabel l1;
JButton jb1;
Container con;
PersonalOptionUpdate1(String str)
	{
	super(str);
	con=getContentPane();
	con.setLayout(null);
	i1=new ImageIcon("Sample3.gif");
	l1=new JLabel();
	l1.setIcon(i1);
	jb1=new JButton("BACK");
	l1.setBounds(190,20,450,300);
	jb1.setBounds(285,320,80,20);
	con.add(l1);
	con.add(jb1);
	jb1.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("BACK"))
		{
						setVisible(false);
						Personal u=new Personal("SMART SOFT 1.6.1");
						u.setSize(700,500);
						u.setLocation(300,200);
						u.setResizable(false);
						u.setVisible(true);
		}
	}
}

class PersonalOptionUpdate2 extends JFrame implements ActionListener
{
ImageIcon i1;
JLabel l1;
JButton jb1;
Container con;
PersonalOptionUpdate2(String str)
	{
	super(str);
	con=getContentPane();
	con.setLayout(null);
	i1=new ImageIcon("Sample4.jpg");
	l1=new JLabel();
	l1.setIcon(i1);
	jb1=new JButton("BACK");
	l1.setBounds(190,20,450,300);
	jb1.setBounds(285,320,80,20);
	con.add(l1);
	con.add(jb1);
	jb1.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("BACK"))
		{
						setVisible(false);
						Personal u=new Personal("SMART SOFT 1.6.1");
						u.setSize(700,500);
						u.setLocation(300,200);
						u.setResizable(false);
						u.setVisible(true);
		}
	}
}

class PersonalOptionUpdate3 extends JFrame implements ActionListener
{
ImageIcon i1;
JLabel l1;
JButton jb1;
Container con;
PersonalOptionUpdate3(String str)
	{
	super(str);
	con=getContentPane();
	con.setLayout(null);
	i1=new ImageIcon("Sample5.jpg");
	l1=new JLabel();
	l1.setIcon(i1);
	jb1=new JButton("BACK");
	l1.setBounds(190,20,450,300);
	jb1.setBounds(285,320,80,20);
	con.add(l1);
	con.add(jb1);
	jb1.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("BACK"))
		{
						setVisible(false);
						Personal u=new Personal("SMART SOFT 1.6.1");
						u.setSize(700,500);
						u.setLocation(300,200);
						u.setResizable(false);
						u.setVisible(true);
		}
	}
}

class PersonalOptionUpdate4 extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5,l6;
JTextField t1,t2,t3,t4,t5;
JButton jb1,jb2;
Container con;
PersonalOptionUpdate4(String str)
	{
	super(str);
	con=getContentPane();
	con.setLayout(null);
	l1=new JLabel("TO CALCULATE INTEREST FOR OUR BALANCE");
	l2=new JLabel("OUR CURRENT BALANCE IS ");
	l3=new JLabel("ENTER THE NUMBER OF YEARS");
	l4=new JLabel("ENTER THE RATE OF INTEREST");
	l5=new JLabel("INTEREST WILL BE ");
	l6=new JLabel("MODIFIED BALANCE WILL BE ");
	t1=new JTextField("XXXXXX");
	t2=new JTextField();
	t3=new JTextField();
	t4=new JTextField();
	t5=new JTextField();
	jb2=new JButton("BACK");
	jb1=new JButton("COMPUTE");
	l1.setBounds(170,40,400,30);
	l2.setBounds(200,80,250,30);
	l3.setBounds(200,110,250,30);
	l4.setBounds(200,140,250,30);
	l5.setBounds(200,170,250,30);
	l6.setBounds(200,200,250,30);
	t1.setBounds(470,85,150,20);
	t2.setBounds(470,115,150,20);
	t3.setBounds(470,145,150,20);
	t4.setBounds(470,175,150,20);
	t5.setBounds(470,205,150,20);
	jb1.setBounds(285,260,100,20);
	jb2.setBounds(395,260,80,20);
	con.add(l1);
	con.add(l2);
	con.add(l3);
	con.add(l4);
	con.add(l5);
	con.add(l6);
	con.add(t1);
	con.add(t2);
	con.add(t3);
	con.add(t4);
	con.add(t5);
	con.add(jb1);
	con.add(jb2);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if (ae.getActionCommand().equals("COMPUTE"))
	{
		if(t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this,"ERROR :\nYou left the text fields empty.");
				setVisible(false);
				PersonalOptionUpdate4 p=new PersonalOptionUpdate4("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else
			{
			Float acc_bal=1f,interest=1f,new_bal=1f;
			String acc_bal1="";
			Float rate=Float.parseFloat(t3.getText().trim());
			Float t=Float.parseFloat(t2.getText().trim());
			try
				{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","root");  
					Statement st=con.createStatement();
					String str="select acc_bal from details where acc_num=160110737001";
					ResultSet rs=st.executeQuery(str);
					while(rs.next())
					{
						acc_bal1=rs.getString(1);
					}
					acc_bal=Float.parseFloat(acc_bal1);
					interest=(acc_bal*rate*t)/100;
					new_bal=acc_bal+interest;
					t1.setText(String.valueOf(acc_bal));
					t4.setText(String.valueOf(interest));
					t5.setText(String.valueOf(new_bal));
					JOptionPane.showMessageDialog(this,"Computed successfully.\nClick OK.");
					st.close();
					con.close();
				}
			catch (Exception e)
				{
					JOptionPane.showMessageDialog(this,"ERROR -->"+e);
				}
			}
	}
	else if(ae.getActionCommand().equals("BACK"))
		{
						setVisible(false);
						Personal u=new Personal("SMART SOFT 1.6.1");
						u.setSize(700,500);
						u.setLocation(300,200);
						u.setResizable(false);
						u.setVisible(true);
		}
	}
}

class User extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
JTextField t1;
JButton jb1,jb2;
int count=0;
User(String s)
	{
	super(s);
	Container con=getContentPane();
	con.setLayout(null);
	l1=new JLabel("ENTER YOUR DESIRED OPTION HERE ");
	l2=new JLabel("1. CREDITS.");
	l3=new JLabel("2. DEBITS.");
	l4=new JLabel("3. PETRO-POINTS");
	l5=new JLabel("LIST OF OPTIONS TO UPDATE");
	l6=new JLabel("4. SHOPPING-POINTS");
	l7=new JLabel("LIST OF OPTIONS TO VIEW");
	l8=new JLabel("5. DRIVERS LICENSE");
	l9=new JLabel("6. MEMBERSHIP CARD");
	l10=new JLabel("7. VOTER CARD");
	l11=new JLabel("8. TO VIEW CURRENT DETAILS");
	t1=new JTextField();
	jb1=new JButton("SUBMIT");
	jb2=new JButton("EXIT");
	l1.setBounds(170,380,300,30);
	l2.setBounds(250,80,200,30);
	l3.setBounds(250,110,200,30);
	l4.setBounds(250,140,200,30);
	l5.setBounds(220,40,300,30);
	l6.setBounds(250,170,200,30);
	l7.setBounds(220,210,300,30);
	l8.setBounds(250,250,200,30);
	l9.setBounds(250,280,200,30);
	l10.setBounds(250,310,200,30);
	l11.setBounds(250,340,200,30);
	t1.setBounds(400,385,130,20);
	jb1.setBounds(265,415,80,20);
	jb2.setBounds(355,415,80,20);
	con.add(l1);
	con.add(l2);
	con.add(l3);
	con.add(l4);
	con.add(l5);
	con.add(l6);
	con.add(l7);
	con.add(l8);
	con.add(l9);
	con.add(l10);
	con.add(l11);
	con.add(t1);
	con.add(jb1);
	con.add(jb2);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("SUBMIT"))
		{
		if(t1.getText().equals("1"))
			{
				setVisible(false);
				UserOptionUpdate1 p=new UserOptionUpdate1("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else if(t1.getText().equals("2"))
			{
				setVisible(false);
				UserOptionUpdate2 p=new UserOptionUpdate2("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else if(t1.getText().equals("3"))
			{
				setVisible(false);
				UserOptionUpdate3 p=new UserOptionUpdate3("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else if(t1.getText().equals("4"))
			{
				setVisible(false);
				UserOptionUpdate4 p=new UserOptionUpdate4("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else if(t1.getText().equals("5"))
			{
				setVisible(false);
				UserOptionUpdate5 p=new UserOptionUpdate5("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else if(t1.getText().equals("6"))
			{
				setVisible(false);
				UserOptionUpdate6 p=new UserOptionUpdate6("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else if(t1.getText().equals("7"))
			{
				setVisible(false);
				UserOptionUpdate7 p=new UserOptionUpdate7("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else if(t1.getText().equals("8"))
			{
				JOptionPane.showMessageDialog(this,"FOR CUSTOMERS DETAILS.\nCLICK OK.");
				UserOptionDetails p=new UserOptionDetails("CUSTOMER'S DETAILS.");
				p.setSize(400,200);
				p.setLocation(400,400);
				p.setVisible(true);
			}
		else if(count == 3)
			{
						setVisible(false);
						Errors u=new Errors("SMART SOFT 1.6.1");
						u.setSize(700,500);
						u.setLocation(300,200);
						u.setResizable(false);
						u.setVisible(true);
			}
		else
			{
			JOptionPane.showMessageDialog(this,"Invalid Selection.\nTry Again.");
			t1.setText("");
			}
		count++;
		}
	else if(ae.getActionCommand().equals("EXIT"))
		{
		JOptionPane.showMessageDialog(this,"You are exiting.\nLogin again when required.\nCLICK OK.");
		setVisible(false);
		Project p=new Project("SMART SOFT 1.6.1");
		p.setSize(700,400);
		p.setLocation(300,200);
		p.setResizable(false);
		p.setVisible(true);
		}
	}
}

class UserOptionDetails extends JFrame
{
Connection con;
JButton b;
Statement st;
String str;
ResultSet rs;
ResultSetMetaData rst;
JTable jt;
JScrollPane jsp;
Container cn;
UserOptionDetails(String s)
	{
	super(s);
		try
			{
				Class.forName("com.mysql.jdbc.Driver");  
	            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","root");  
				st=con.createStatement();
				str="select * from details where acc_num=160110737001";
				rs=st.executeQuery(str);
				rst=rs.getMetaData();
				int cols=rst.getColumnCount();
				int rows=0;
				while(rs.next())
					{
					rows++;
					}
				String column[]=new String[cols];
				String row[][]=new String[rows][cols];
				for(int i=0;i<cols;i++)
					{
					column[i]=rst.getColumnName(i+1);
					}
				rs=st.executeQuery(str);
				for(int i=0;i<rows;i++)
					{
					rs.next();
					for(int j=0;j<cols;j++)
						{
						row[i][j]=rs.getString(j+1);
						}					
					}
				jt=new JTable(row,column);
				int x=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
				int y=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
				jsp=new JScrollPane(jt,y,x);
				cn=getContentPane();
				cn.setLayout(new BorderLayout());
				cn.add(jsp);
				st.close();
				con.close();
			}
		catch (Exception e)
			{
				JOptionPane.showMessageDialog(this,"ERROR -->"+e);
			}
	}
}

class UserOptionUpdate1 extends JFrame implements ActionListener
{
JLabel l1;
JTextField t1,t2;
JButton jb1,jb2;
UserOptionUpdate1(String s)
	{
	super(s);
	Container con=getContentPane();
	con.setLayout(null);
	l1=new JLabel("ENTER THE CREDITS FOR THE TRANSACTION");
	t1=new JTextField();
	jb1=new JButton("SUBMIT");
	jb2=new JButton("BACK");
	l1.setBounds(170,50,250,30);
	t1.setBounds(450,55,140,20);
	jb1.setBounds(285,105,90,20);
	jb2.setBounds(415,105,90,20);
	con.add(l1);
	con.add(t1);
	con.add(jb1);
	con.add(jb2);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("SUBMIT"))
		{
		if(t1.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this,"ERROR :\nYou left the credit balance empty.");
				setVisible(false);
				UserOptionUpdate1 p=new UserOptionUpdate1("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else
			{
			Long cred_pay;
			String s1=t1.getText().trim();
			cred_pay=Long.parseLong(s1);
			try
				{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","root");  
					Statement st=con.createStatement();
					String str="update details set cred_pay=cred_pay+"+cred_pay+" where acc_num=160110737001";
					int x=st.executeUpdate(str);
					str="update details set last_cred=CURDATE() where acc_num=160110737001";
					st.executeUpdate(str);
					if(x == 0)
					{
						JOptionPane.showMessageDialog(this,"Credits couldn't be updated.\nTry again.");
						setVisible(false);
						UserOptionUpdate1 p=new UserOptionUpdate1("SMART SOFT 1.6.1");
						p.setSize(700,400);
						p.setLocation(300,200);
						p.setResizable(false);
						p.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(this,"Credit balance required to pay is updated successfully.\nClick OK.");
						setVisible(false);
						User u=new User("SMART SOFT 1.6.1");
						u.setSize(700,500);
						u.setLocation(300,200);
						u.setResizable(false);
						u.setVisible(true);
					}
					st.close();
					con.close();
				}
			catch (Exception e)
				{
					JOptionPane.showMessageDialog(this,"ERROR -->"+e);
				}
			}
		}
	else if(ae.getActionCommand().equals("BACK"))
		{
				setVisible(false);
				User u=new User("SMART SOFT 1.6.1");
				u.setSize(700,500);
				u.setLocation(300,200);
				u.setResizable(false);
				u.setVisible(true);
		}
	}
}

class UserOptionUpdate2 extends JFrame implements ActionListener
{
JLabel l1;
JTextField t1;
JButton jb1,jb2;
UserOptionUpdate2(String s)
	{
	super(s);
	Container con=getContentPane();
	con.setLayout(null);
	l1=new JLabel("ENTER THE DEBIT AMOUNT FOR THE TRANSACTION");
	t1=new JTextField();
	jb1=new JButton("SUBMIT");
	jb2=new JButton("BACK");
	l1.setBounds(160,50,290,30);
	t1.setBounds(460,55,140,20);
	jb1.setBounds(285,105,90,20);
	jb2.setBounds(415,105,90,20);
	con.add(l1);
	con.add(t1);
	con.add(jb1);
	con.add(jb2);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("SUBMIT"))
		{
		if(t1.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this,"ERROR :\nYou left your account number or account balance empty.");
				setVisible(false);
				UserOptionUpdate2 p=new UserOptionUpdate2("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else
			{
			Long acc_bal;
			String s1=t1.getText().trim();
			acc_bal=Long.parseLong(s1);
			try
				{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","root");  
					Statement st=con.createStatement();
					String str="update details set acc_bal=acc_bal+"+acc_bal+" where acc_num=160110737001";
					int x=st.executeUpdate(str);
					str="update details set last_bal=CURDATE() where acc_num=160110737001";
					st.executeUpdate(str);
					if(x == 0)
					{
						JOptionPane.showMessageDialog(this,"ACCOUNT BALANCE NOT UPDATED SUCCESSFULLY.\nTry again.");
						setVisible(false);
						UserOptionUpdate2 p=new UserOptionUpdate2("SMART SOFT 1.6.1");
						p.setSize(700,400);
						p.setLocation(300,200);
						p.setResizable(false);
						p.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(this,"Account balance updated successfully.\nClick OK.");
						setVisible(false);
						User u=new User("SMART SOFT 1.6.1");
						u.setSize(700,500);
						u.setLocation(300,200);
						u.setResizable(false);
						u.setVisible(true);
					}
					st.close();
					con.close();
				}
			catch (Exception e)
				{
					JOptionPane.showMessageDialog(this,"ERROR -->"+e);
				}
			}
		}
	else if(ae.getActionCommand().equals("BACK"))
		{
				setVisible(false);
				User u=new User("SMART SOFT 1.6.1");
				u.setSize(700,500);
				u.setLocation(300,200);
				u.setResizable(false);
				u.setVisible(true);
		}
	}
}

class UserOptionUpdate3 extends JFrame implements ActionListener
{
JLabel l1;
JTextField t1;
JButton jb1,jb2;
UserOptionUpdate3(String s)
	{
	super(s);
	Container con=getContentPane();
	con.setLayout(null);
	l1=new JLabel("ENTER THE PETRO-POINTS FOR THE TRANSACTION");
	t1=new JTextField();
	jb1=new JButton("SUBMIT");
	jb2=new JButton("BACK");
	l1.setBounds(150,50,300,30);
	t1.setBounds(460,55,140,20);
	jb1.setBounds(285,105,90,20);
	jb2.setBounds(415,105,90,20);
	con.add(l1);
	con.add(t1);
	con.add(jb1);
	con.add(jb2);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("SUBMIT"))
		{
		if(t1.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this,"ERROR :\nYou left the petrol points empty.");
				setVisible(false);
				UserOptionUpdate3 p=new UserOptionUpdate3("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else
			{
			Long petro_pts;
			String s1=t1.getText().trim();
			petro_pts=Long.parseLong(s1);
			try
				{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","root");  
					Statement st=con.createStatement();
					String str="update details set petro_pts=petro_pts+"+petro_pts+" where acc_num=160110737001";
					int x=st.executeUpdate(str);
					if(x == 0)
					{
						JOptionPane.showMessageDialog(this,"POINTS COULDN'T BE UPDATED SUCCESSFULLY.\nTry again.");
						setVisible(false);
						UserOptionUpdate3 p=new UserOptionUpdate3("SMART SOFT 1.6.1");
						p.setSize(700,400);
						p.setLocation(300,200);
						p.setResizable(false);
						p.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(this,"Petrol points changed successfully.\nClick OK.");
						setVisible(false);
						User u=new User("SMART SOFT 1.6.1");
						u.setSize(700,500);
						u.setLocation(300,200);
						u.setResizable(false);
						u.setVisible(true);
					}
					st.close();
					con.close();
				}
			catch (Exception e)
				{
					JOptionPane.showMessageDialog(this,"ERROR -->"+e);
				}
			}
		}
	else if(ae.getActionCommand().equals("BACK"))
		{
				setVisible(false);
				User u=new User("SMART SOFT 1.6.1");
				u.setSize(700,500);
				u.setLocation(300,200);
				u.setResizable(false);
				u.setVisible(true);
		}
	}
}

class UserOptionUpdate4 extends JFrame implements ActionListener
{
JLabel l1;
JTextField t1;
JButton jb1,jb2;
UserOptionUpdate4(String s)
	{
	super(s);
	Container con=getContentPane();
	con.setLayout(null);
	l1=new JLabel("ENTER THE SHOPPING POINTS FOR THE TRANSACTION");
	t1=new JTextField();
	jb1=new JButton("SUBMIT");
	jb2=new JButton("BACK");
	l1.setBounds(150,50,310,30);
	t1.setBounds(470,55,140,20);
	jb1.setBounds(285,105,90,20);
	jb2.setBounds(415,105,90,20);
	con.add(l1);
	con.add(t1);
	con.add(jb1);
	con.add(jb2);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("SUBMIT"))
		{
		if(t1.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this,"ERROR :\nYou left the shopping points column empty.");
				setVisible(false);
				UserOptionUpdate4 p=new UserOptionUpdate4("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else
			{
			Long shop_pts;
			String s1=t1.getText().trim();
			shop_pts=Long.parseLong(s1);
			try
				{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","root");  
					Statement st=con.createStatement();
					String str="update details set shop_pts=shop_pts+"+shop_pts+" where acc_num=160110737001";
					int x=st.executeUpdate(str);
					if(x == 0)
					{
						JOptionPane.showMessageDialog(this,"ACCOUNT NUMBER ENTERED DOESN'T MATCH THE DATABASE.\nTry again.");
						setVisible(false);
						UserOptionUpdate4 p=new UserOptionUpdate4("SMART SOFT 1.6.1");
						p.setSize(700,400);
						p.setLocation(300,200);
						p.setResizable(false);
						p.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(this,"Shopping points changed successfully.\nClick OK.");
						setVisible(false);
						User u=new User("SMART SOFT 1.6.1");
						u.setSize(700,500);
						u.setLocation(300,200);
						u.setResizable(false);
						u.setVisible(true);
					}
					st.close();
					con.close();
				}
			catch (Exception e)
				{
					JOptionPane.showMessageDialog(this,"ERROR -->"+e);
				}
			}
		}
	else if(ae.getActionCommand().equals("BACK"))
		{
				setVisible(false);
				User u=new User("SMART SOFT 1.6.1");
				u.setSize(700,500);
				u.setLocation(300,200);
				u.setResizable(false);
				u.setVisible(true);
		}
	}
}

class UserOptionUpdate5 extends JFrame implements ActionListener
{
ImageIcon i1;
JLabel l1;
JButton jb1;
Container con;
UserOptionUpdate5(String str)
	{
	super(str);
	con=getContentPane();
	con.setLayout(null);
	i1=new ImageIcon("Sample3.gif");
	l1=new JLabel();
	l1.setIcon(i1);
	jb1=new JButton("BACK");
	l1.setBounds(190,20,450,300);
	jb1.setBounds(285,320,80,20);
	con.add(l1);
	con.add(jb1);
	jb1.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("BACK"))
		{
						setVisible(false);
						User u=new User("SMART SOFT 1.6.1");
						u.setSize(700,500);
						u.setLocation(300,200);
						u.setResizable(false);
						u.setVisible(true);
		}
	}
}

class UserOptionUpdate6 extends JFrame implements ActionListener
{
ImageIcon i1;
JLabel l1;
JButton jb1;
Container con;
UserOptionUpdate6(String str)
	{
	super(str);
	con=getContentPane();
	con.setLayout(null);
	i1=new ImageIcon("Sample4.jpg");
	l1=new JLabel();
	l1.setIcon(i1);
	jb1=new JButton("BACK");
	l1.setBounds(190,20,450,300);
	jb1.setBounds(285,320,80,20);
	con.add(l1);
	con.add(jb1);
	jb1.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("BACK"))
		{
						setVisible(false);
						User u=new User("SMART SOFT 1.6.1");
						u.setSize(700,500);
						u.setLocation(300,200);
						u.setResizable(false);
						u.setVisible(true);
		}
	}
}

class UserOptionUpdate7 extends JFrame implements ActionListener
{
ImageIcon i1;
JLabel l1;
JButton jb1;
Container con;
UserOptionUpdate7(String str)
	{
	super(str);
	con=getContentPane();
	con.setLayout(null);
	i1=new ImageIcon("Sample5.jpg");
	l1=new JLabel();
	l1.setIcon(i1);
	jb1=new JButton("BACK");
	l1.setBounds(190,20,450,300);
	jb1.setBounds(285,320,80,20);
	con.add(l1);
	con.add(jb1);
	jb1.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("BACK"))
		{
						setVisible(false);
						User u=new User("SMART SOFT 1.6.1");
						u.setSize(700,500);
						u.setLocation(300,200);
						u.setResizable(false);
						u.setVisible(true);
		}
	}
}

class Errors extends JFrame implements ActionListener
{
ImageIcon i1;
JLabel l1;
JButton jb1;
Container con;
Errors(String str)
	{
	super(str);
	con=getContentPane();
	con.setLayout(null);
	i1=new ImageIcon("Sample2.jpg");
	l1=new JLabel();
	l1.setIcon(i1);
	jb1=new JButton("TO EXIT");
	l1.setBounds(190,20,450,300);
	jb1.setBounds(285,320,80,20);
	con.setBackground(Color.white);
	con.add(l1);
	con.add(jb1);
	jb1.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("TO EXIT"))
		{
				JOptionPane.showMessageDialog(this,"YOUR MINIMUM NUMBER OF TRIES EXCEEDED.\nCONTACT ADMINISTRATOR FOR FURTHER DETAILS.");
				System.exit(0);
		}
	}
}

class Admin extends JFrame implements ActionListener
{
JLabel l1,l2,l3;
JTextField t1;
JPasswordField t2;
JButton jb1,jb2;
int count=0;
Admin(String s)
	{
	super(s);
	Container con=getContentPane();
	con.setLayout(null);
	l1=new JLabel("WELCOME ADMIN.");
	l2=new JLabel("Admin I.D. ");
	l3=new JLabel("Password.");
	t1=new JTextField();
	t2=new JPasswordField();
	jb1=new JButton("SUBMIT");
	jb2=new JButton("BACK");
	l1.setBounds(290,30,300,50);
	l2.setBounds(230,80,100,30);
	l3.setBounds(230,110,100,30);
	t1.setBounds(340,85,140,20);
	t2.setBounds(340,115,140,20);
	jb1.setBounds(255,155,80,20);
	jb2.setBounds(355,155,80,20);
	con.add(l1);
	con.add(l2);
	con.add(l3);
	con.add(t1);
	con.add(t2);
	con.add(jb1);
	con.add(jb2);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("SUBMIT"))
		{
		if(t1.getText().equals("160110737055") && t2.getText().equals("10032"))
			{
				JOptionPane.showMessageDialog(this,"LOGIN SUCCESSFUL.\nCLICK OK.");
				setVisible(false);
				AdminOption p=new AdminOption("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else if(t1.getText().equals("") || t2.getText().equals(""))
			{
			JOptionPane.showMessageDialog(this,"ERROR :\nYou left your I.d. or password empty.");
			t1.setText("");
			t2.setText("");
			}
		else if(count == 3)
			{
						setVisible(false);
						Errors u=new Errors("SMART SOFT 1.6.1");
						u.setSize(700,500);
						u.setLocation(300,200);
						u.setResizable(false);
						u.setVisible(true);
			}
		else
			{
			JOptionPane.showMessageDialog(this,"Invalid I.d. and Password.\nTry Again.");
			t1.setText("");
			t2.setText("");
			}
		count++;
		}
	else if(ae.getActionCommand().equals("BACK"))
		{
		JOptionPane.showMessageDialog(this,"Initial Screen will be displayed.\nCLICK OK.");
		setVisible(false);
		Project p=new Project("SMART SOFT 1.6.1");
		p.setSize(700,400);
		p.setLocation(300,200);
		p.setResizable(false);
		p.setVisible(true);
		}
	}
}

class AdminOption extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5;
JTextField t1;
JButton jb1,jb2;
int count=0;
AdminOption(String s)
	{
	super(s);
	Container con=getContentPane();
	con.setLayout(null);
	l1=new JLabel("1. DISPLAY DETAILS OF CUSTOMERS.");
	l2=new JLabel("2. TO UPDATE CUSTOMERS DETAILS.");
	l3=new JLabel("3. TO DELETE  A CUSTOMER DETAILS PERMANATLY.");
	l4=new JLabel("4. TO INSERT A NEW CUSTOMER.");
	l5=new JLabel("ENTER YOUR DESIRED OPTION :- ");
	t1=new JTextField();
	jb1=new JButton("SUBMIT");
	jb2=new JButton("LOGOUT");
	l1.setBounds(200,50,250,30);
	l2.setBounds(200,80,250,30);
	l3.setBounds(200,110,350,30);
	l4.setBounds(200,140,250,30);
	l5.setBounds(180,190,200,30);
	t1.setBounds(390,195,120,20);
	jb1.setBounds(255,235,90,20);
	jb2.setBounds(355,235,90,20);
	con.add(l1);
	con.add(l2);
	con.add(l3);
	con.add(l4);
	con.add(l5);
	con.add(t1);
	con.add(jb1);
	con.add(jb2);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("SUBMIT"))
		{
		count++;
		if(t1.getText().equals("1"))
			{
				JOptionPane.showMessageDialog(this,"FOR CUSTOMERS DETAILS.\nCLICK OK.");
				AdminOptionCustomer p=new AdminOptionCustomer("CUSTOMER'S DETAILS.");
				p.setSize(400,200);
				p.setLocation(400,400);
				p.setVisible(true);
			}
		else if(t1.getText().equals("2"))
			{
				JOptionPane.showMessageDialog(this,"TO UPDATE.\nCLICK OK.");
				setVisible(false);
				AdminOptionUpdate p=new AdminOptionUpdate("UPDATION TABLE.");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setVisible(true);
			}
		else if(t1.getText().equals("3"))
			{
				JOptionPane.showMessageDialog(this,"TO DELETE.\nCLICK OK.");
				setVisible(false);
				AdminOptionDelete p=new AdminOptionDelete("DELETION PROCESS.");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setVisible(true);
			}
		else if(t1.getText().equals("4"))
			{
				JOptionPane.showMessageDialog(this,"TO INSERT.\nCLICK OK.");
				setVisible(false);
				AdminOptionInsert p=new AdminOptionInsert("INSERTION PROCESS.");
				p.setSize(900,600);
				p.setLocation(200,150);
				p.setVisible(true);
			}
		else if(t1.getText().equals(""))
			{
			JOptionPane.showMessageDialog(this,"ERROR :\nYou left the field empty.");
			t1.setText("");
			}
		else if(count == 3)
			{
						setVisible(false);
						Errors u=new Errors("SMART SOFT 1.6.1");
						u.setSize(700,500);
						u.setLocation(300,200);
						u.setResizable(false);
						u.setVisible(true);
			}
		else
			{
			JOptionPane.showMessageDialog(this,"Invalid selection.\nTry Again.");
			t1.setText("");
			}
		}
	else if(ae.getActionCommand().equals("LOGOUT"))
		{
		JOptionPane.showMessageDialog(this,"Initial Screen will be displayed.\nCLICK OK.");
		setVisible(false);
		Project p=new Project("SMART SOFT 1.6.1");
		p.setSize(700,400);
		p.setLocation(300,200);
		p.setResizable(false);
		p.setVisible(true);
		}
	}
}

class AdminOptionUpdate extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5,l6,l7,l8;
JTextField t1;
JButton jb1,jb2,jb3;
int count=0;
AdminOptionUpdate(String s)
	{
	super(s);
	Container con=getContentPane();
	con.setLayout(null);
	l1=new JLabel("1. TO CHANGE THE PIN NUMBER.");
	l2=new JLabel("2. TO UPDATE CUSTOMERS NAME.");
	l3=new JLabel("3. TO UPDATE CUSTOMERS PHONE NUMBER.");
	l4=new JLabel("4. TO CHANGE THE PETRO_PTS OF THE CUSTOMER.");
	l5=new JLabel("5. TO CHANGE THE SHOPPING_PTS OF THE CUSTOMER.");
	l6=new JLabel("6. TO UPDATE CUSTOMERS ACCOUNT BALANCE.");
	l7=new JLabel("7. TO UPDATE CUSTOMERS CREDITS THAT HE NEEDS TO PAY.");
	l8=new JLabel("ENTER YOUR DESIRED OPTION :- ");
	t1=new JTextField();
	jb1=new JButton("SUBMIT");
	jb2=new JButton("LOGOUT");
	jb3=new JButton("BACK");
	l1.setBounds(200,40,350,30);
	l2.setBounds(200,70,350,30);
	l3.setBounds(200,100,350,30);
	l4.setBounds(200,130,350,30);
	l5.setBounds(200,160,350,30);
	l6.setBounds(200,190,350,30);
	l7.setBounds(200,220,350,30);
	l8.setBounds(180,270,200,30);
	t1.setBounds(390,275,120,20);
	jb1.setBounds(215,315,90,20);
	jb2.setBounds(315,315,90,20);
	jb3.setBounds(415,315,90,20);
	con.add(l1);
	con.add(l2);
	con.add(l3);
	con.add(l4);
	con.add(l5);
	con.add(l6);
	con.add(l7);
	con.add(l8);
	con.add(t1);
	con.add(jb1);
	con.add(jb2);
	con.add(jb3);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	jb3.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("SUBMIT"))
		{
		count++;
		if(t1.getText().equals("1"))
			{				
				setVisible(false);
				AdminOptionUpdate1 p=new AdminOptionUpdate1("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else if(t1.getText().equals("2"))
			{
				setVisible(false);
				AdminOptionUpdate2 p=new AdminOptionUpdate2("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else if(t1.getText().equals("3"))
			{
				setVisible(false);
				AdminOptionUpdate3 p=new AdminOptionUpdate3("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else if(t1.getText().equals("4"))
			{
				setVisible(false);
				AdminOptionUpdate4 p=new AdminOptionUpdate4("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else if(t1.getText().equals("5"))
			{
				setVisible(false);
				AdminOptionUpdate5 p=new AdminOptionUpdate5("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else if(t1.getText().equals("6"))
			{
				setVisible(false);
				AdminOptionUpdate6 p=new AdminOptionUpdate6("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else if(t1.getText().equals("7"))
			{
				setVisible(false);
				AdminOptionUpdate7 p=new AdminOptionUpdate7("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else if(t1.getText().equals(""))
			{
			JOptionPane.showMessageDialog(this,"ERROR :\nYou left the field empty.");
			t1.setText("");
			}
		else if(count == 3)
			{
						setVisible(false);
						Errors u=new Errors("SMART SOFT 1.6.1");
						u.setSize(700,500);
						u.setLocation(300,200);
						u.setResizable(false);
						u.setVisible(true);
			}
		else
			{
			JOptionPane.showMessageDialog(this,"Invalid field.\nTry Again.");
			t1.setText("");
			}
		}
	else if(ae.getActionCommand().equals("LOGOUT"))
		{
			JOptionPane.showMessageDialog(this,"Initial Screen will be displayed.\nCLICK OK.");
			setVisible(false);
			Project p=new Project("SMART SOFT 1.6.1");
			p.setSize(700,400);
			p.setLocation(300,200);
			p.setResizable(false);
			p.setVisible(true);
		}
	else if(ae.getActionCommand().equals("BACK"))
		{
			setVisible(false);
			AdminOption p=new AdminOption("SMART SOFT 1.6.1");
			p.setSize(700,400);
			p.setLocation(300,200);
			p.setResizable(false);
			p.setVisible(true);
		}
	}
}

class AdminOptionUpdate1 extends JFrame implements ActionListener
{
JLabel l1,l2;
JTextField t1,t2;
JButton jb1,jb2;
AdminOptionUpdate1(String s)
	{
	super(s);
	Container con=getContentPane();
	con.setLayout(null);
	l1=new JLabel("ENTER THE ACCOUNT NUMBER ");
	l2=new JLabel("ENTER THE NEW PIN NUMBER ");
	t1=new JTextField();
	t2=new JTextField();
	jb1=new JButton("SUBMIT");
	jb2=new JButton("BACK");
	l1.setBounds(200,50,190,30);
	l2.setBounds(200,80,190,30);
	t1.setBounds(400,55,120,20);
	t2.setBounds(400,85,120,20);
	jb1.setBounds(275,135,90,20);
	jb2.setBounds(395,135,90,20);
	con.add(l1);
	con.add(l2);
	con.add(t1);
	con.add(t2);
	con.add(jb1);
	con.add(jb2);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("SUBMIT"))
		{
		if(t1.getText().equals("") || t2.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this,"ERROR :\nYou left your account number or pin number empty.");
				setVisible(false);
				AdminOptionUpdate1 p=new AdminOptionUpdate1("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else
			{
			Long acc_num,pin_num;
			String s1=t1.getText().trim();
			String s2=t2.getText().trim();
			acc_num=Long.parseLong(s1);
			pin_num=Long.parseLong(s2);
			try
				{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","root");  
					Statement st=con.createStatement();
					String str="update details set pin_num="+pin_num+" where acc_num="+acc_num;
					int x=st.executeUpdate(str);
					if(x == 0)
					{
						JOptionPane.showMessageDialog(this,"ACCOUNT NUMBER ENTERED DOESN'T MATCH THE DATABASE.\nTry again.");
						setVisible(false);
						AdminOptionUpdate1 p=new AdminOptionUpdate1("SMART SOFT 1.6.1");
						p.setSize(700,400);
						p.setLocation(300,200);
						p.setResizable(false);
						p.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(this,"Pin number changed successfully.\nClick OK.");
						setVisible(false);
						AdminOptionUpdate p=new AdminOptionUpdate("SMART SOFT 1.6.1");
						p.setSize(700,400);
						p.setLocation(300,200);
						p.setResizable(false);
						p.setVisible(true);
					}
					st.close();
					con.close();
				}
			catch (Exception e)
				{
					JOptionPane.showMessageDialog(this,"ERROR -->"+e);
				}
			}
		}
	else if(ae.getActionCommand().equals("BACK"))
		{
		setVisible(false);
		AdminOptionUpdate p=new AdminOptionUpdate("SMART SOFT 1.6.1");
		p.setSize(700,400);
		p.setLocation(300,200);
		p.setResizable(false);
		p.setVisible(true);
		}
	}
}

class AdminOptionUpdate2 extends JFrame implements ActionListener
{
JLabel l1,l2;
JTextField t1,t2;
JButton jb1,jb2;
AdminOptionUpdate2(String s)
	{
	super(s);
	Container con=getContentPane();
	con.setLayout(null);
	l1=new JLabel("ENTER THE ACCOUNT NUMBER ");
	l2=new JLabel("ENTER THE NEW CUSTOMERS NAME ");
	t1=new JTextField();
	t2=new JTextField();
	jb1=new JButton("SUBMIT");
	jb2=new JButton("BACK");
	l1.setBounds(200,50,220,30);
	l2.setBounds(200,80,220,30);
	t1.setBounds(430,55,130,20);
	t2.setBounds(430,85,130,20);
	jb1.setBounds(285,135,90,20);
	jb2.setBounds(405,135,90,20);
	con.add(l1);
	con.add(l2);
	con.add(t1);
	con.add(t2);
	con.add(jb1);
	con.add(jb2);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("SUBMIT"))
		{
		if(t1.getText().equals("") || t2.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this,"ERROR :\nYou left your account number or customer's new name empty.");
				setVisible(false);
				AdminOptionUpdate2 p=new AdminOptionUpdate2("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else
			{
			Long acc_num;
			String cus_name;
			String s1=t1.getText().trim();
			String s2=t2.getText().trim();
			acc_num=Long.parseLong(s1);
			cus_name=s2;
			try
				{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","root");  
					Statement st=con.createStatement();
					String str="update details set acc_name='"+cus_name+"' where acc_num="+acc_num;
					int x=st.executeUpdate(str);
					if(x == 0)
					{
						JOptionPane.showMessageDialog(this,"ACCOUNT NUMBER ENTERED DOESN'T MATCH THE DATABASE.\nTry again.");
						setVisible(false);
						AdminOptionUpdate2 p=new AdminOptionUpdate2("SMART SOFT 1.6.1");
						p.setSize(700,400);
						p.setLocation(300,200);
						p.setResizable(false);
						p.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(this,"Customer name changed successfully.\nClick OK.");
						setVisible(false);
						AdminOptionUpdate p=new AdminOptionUpdate("SMART SOFT 1.6.1");
						p.setSize(700,400);
						p.setLocation(300,200);
						p.setResizable(false);
						p.setVisible(true);
					}
					st.close();
					con.close();
				}
			catch (Exception e)
				{
					JOptionPane.showMessageDialog(this,"ERROR -->"+e);
				}
			}
		}
	else if(ae.getActionCommand().equals("BACK"))
		{
		setVisible(false);
		AdminOptionUpdate p=new AdminOptionUpdate("SMART SOFT 1.6.1");
		p.setSize(700,400);
		p.setLocation(300,200);
		p.setResizable(false);
		p.setVisible(true);
		}
	}
}


class AdminOptionUpdate3 extends JFrame implements ActionListener
{
JLabel l1,l2;
JTextField t1,t2;
JButton jb1,jb2;
AdminOptionUpdate3(String s)
	{
	super(s);
	Container con=getContentPane();
	con.setLayout(null);
	l1=new JLabel("ENTER THE ACCOUNT NUMBER ");
	l2=new JLabel("ENTER THE CUSTOMERS NEW PHONE NUMBER ");
	t1=new JTextField();
	t2=new JTextField();
	jb1=new JButton("SUBMIT");
	jb2=new JButton("BACK");
	l1.setBounds(150,50,270,30);
	l2.setBounds(150,80,270,30);
	t1.setBounds(450,55,150,18);
	t2.setBounds(450,85,150,18);
	jb1.setBounds(295,135,90,20);
	jb2.setBounds(415,135,90,20);
	con.add(l1);
	con.add(l2);
	con.add(t1);
	con.add(t2);
	con.add(jb1);
	con.add(jb2);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("SUBMIT"))
		{
		if(t1.getText().equals("") || t2.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this,"ERROR :\nYou left your account number or phone number empty.");
				setVisible(false);
				AdminOptionUpdate3 p=new AdminOptionUpdate3("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else if((t2.getText()).length() != 10)
			{
				JOptionPane.showMessageDialog(this,"ERROR :\nYou entered an invalid phone number .");
				setVisible(false);
				AdminOptionUpdate3 p=new AdminOptionUpdate3("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else
			{
			Long acc_num,phone_no;
			String s1=t1.getText().trim();
			String s2=t2.getText().trim();
			acc_num=Long.parseLong(s1);
			phone_no=Long.parseLong(s2);
			try
				{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","root");  
					Statement st=con.createStatement();
					String str="update details set phone_num="+phone_no+" where acc_num="+acc_num;
					int x=st.executeUpdate(str);
					if(x == 0)
					{
						JOptionPane.showMessageDialog(this,"ACCOUNT NUMBER ENTERED DOESN'T MATCH THE DATABASE.\nTry again.");
						setVisible(false);
						AdminOptionUpdate3 p=new AdminOptionUpdate3("SMART SOFT 1.6.1");
						p.setSize(700,400);
						p.setLocation(300,200);
						p.setResizable(false);
						p.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(this,"Phone number changed successfully.\nClick OK.");
						setVisible(false);
						AdminOptionUpdate p=new AdminOptionUpdate("SMART SOFT 1.6.1");
						p.setSize(700,400);
						p.setLocation(300,200);
						p.setResizable(false);
						p.setVisible(true);
					}
					st.close();
					con.close();
				}
			catch (Exception e)
				{
					JOptionPane.showMessageDialog(this,"ERROR -->"+e);
				}
			}
		}
	else if(ae.getActionCommand().equals("BACK"))
		{
		setVisible(false);
		AdminOptionUpdate p=new AdminOptionUpdate("SMART SOFT 1.6.1");
		p.setSize(700,400);
		p.setLocation(300,200);
		p.setResizable(false);
		p.setVisible(true);
		}
	}
}

class AdminOptionUpdate4 extends JFrame implements ActionListener
{
JLabel l1,l2;
JTextField t1,t2;
JButton jb1,jb2;
AdminOptionUpdate4(String s)
	{
	super(s);
	Container con=getContentPane();
	con.setLayout(null);
	l1=new JLabel("ENTER THE ACCOUNT NUMBER ");
	l2=new JLabel("ENTER THE UPDATED PETROL POINTS ");
	t1=new JTextField();
	t2=new JTextField();
	jb1=new JButton("SUBMIT");
	jb2=new JButton("BACK");
	l1.setBounds(180,50,230,30);
	l2.setBounds(180,80,230,30);
	t1.setBounds(430,55,140,20);
	t2.setBounds(430,85,140,20);
	jb1.setBounds(285,135,90,20);
	jb2.setBounds(415,135,90,20);
	con.add(l1);
	con.add(l2);
	con.add(t1);
	con.add(t2);
	con.add(jb1);
	con.add(jb2);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("SUBMIT"))
		{
		if(t1.getText().equals("") || t2.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this,"ERROR :\nYou left your account number or petrol points empty.");
				setVisible(false);
				AdminOptionUpdate4 p=new AdminOptionUpdate4("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else
			{
			Long acc_num,petro_pts;
			String s1=t1.getText().trim();
			String s2=t2.getText().trim();
			acc_num=Long.parseLong(s1);
			petro_pts=Long.parseLong(s2);
			try
				{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","root");  
					Statement st=con.createStatement();
					String str="update details set petro_pts="+petro_pts+" where acc_num="+acc_num;
					int x=st.executeUpdate(str);
					if(x == 0)
					{
						JOptionPane.showMessageDialog(this,"ACCOUNT NUMBER ENTERED DOESN'T MATCH THE DATABASE.\nTry again.");
						setVisible(false);
						AdminOptionUpdate4 p=new AdminOptionUpdate4("SMART SOFT 1.6.1");
						p.setSize(700,400);
						p.setLocation(300,200);
						p.setResizable(false);
						p.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(this,"Petrol points changed successfully.\nClick OK.");
						setVisible(false);
						AdminOptionUpdate p=new AdminOptionUpdate("SMART SOFT 1.6.1");
						p.setSize(700,400);
						p.setLocation(300,200);
						p.setResizable(false);
						p.setVisible(true);
					}
					st.close();
					con.close();
				}
			catch (Exception e)
				{
					JOptionPane.showMessageDialog(this,"ERROR -->"+e);
				}
			}
		}
	else if(ae.getActionCommand().equals("BACK"))
		{
		setVisible(false);
		AdminOptionUpdate p=new AdminOptionUpdate("SMART SOFT 1.6.1");
		p.setSize(700,400);
		p.setLocation(300,200);
		p.setResizable(false);
		p.setVisible(true);
		}
	}
}

class AdminOptionUpdate5 extends JFrame implements ActionListener
{
JLabel l1,l2;
JTextField t1,t2;
JButton jb1,jb2;
AdminOptionUpdate5(String s)
	{
	super(s);
	Container con=getContentPane();
	con.setLayout(null);
	l1=new JLabel("ENTER THE ACCOUNT NUMBER ");
	l2=new JLabel("ENTER THE UPDATED SHOPPING POINTS ");
	t1=new JTextField();
	t2=new JTextField();
	jb1=new JButton("SUBMIT");
	jb2=new JButton("BACK");
	l1.setBounds(180,50,240,30);
	l2.setBounds(180,80,240,30);
	t1.setBounds(430,55,140,20);
	t2.setBounds(430,85,140,20);
	jb1.setBounds(285,135,90,20);
	jb2.setBounds(415,135,90,20);
	con.add(l1);
	con.add(l2);
	con.add(t1);
	con.add(t2);
	con.add(jb1);
	con.add(jb2);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("SUBMIT"))
		{
		if(t1.getText().equals("") || t2.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this,"ERROR :\nYou left your account number or shopping points empty.");
				setVisible(false);
				AdminOptionUpdate5 p=new AdminOptionUpdate5("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else
			{
			Long acc_num,shop_pts;
			String s1=t1.getText().trim();
			String s2=t2.getText().trim();
			acc_num=Long.parseLong(s1);
			shop_pts=Long.parseLong(s2);
			try
				{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","root");  
					Statement st=con.createStatement();
					String str="update details set shop_pts="+shop_pts+" where acc_num="+acc_num;
					int x=st.executeUpdate(str);
					if(x == 0)
					{
						JOptionPane.showMessageDialog(this,"ACCOUNT NUMBER ENTERED DOESN'T MATCH THE DATABASE.\nTry again.");
						setVisible(false);
						AdminOptionUpdate5 p=new AdminOptionUpdate5("SMART SOFT 1.6.1");
						p.setSize(700,400);
						p.setLocation(300,200);
						p.setResizable(false);
						p.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(this,"Shopping points changed successfully.\nClick OK.");
						setVisible(false);
						AdminOptionUpdate p=new AdminOptionUpdate("SMART SOFT 1.6.1");
						p.setSize(700,400);
						p.setLocation(300,200);
						p.setResizable(false);
						p.setVisible(true);
					}
					st.close();
					con.close();
				}
			catch (Exception e)
				{
					JOptionPane.showMessageDialog(this,"ERROR -->"+e);
				}
			}
		}
	else if(ae.getActionCommand().equals("BACK"))
		{
		setVisible(false);
		AdminOptionUpdate p=new AdminOptionUpdate("SMART SOFT 1.6.1");
		p.setSize(700,400);
		p.setLocation(300,200);
		p.setResizable(false);
		p.setVisible(true);
		}
	}
}

class AdminOptionUpdate6 extends JFrame implements ActionListener
{
JLabel l1,l2;
JTextField t1,t2;
JButton jb1,jb2;
AdminOptionUpdate6(String s)
	{
	super(s);
	Container con=getContentPane();
	con.setLayout(null);
	l1=new JLabel("ENTER THE ACCOUNT NUMBER ");
	l2=new JLabel("ENTER THE UPDATED ACCOUNT BALANCE ");
	t1=new JTextField();
	t2=new JTextField();
	jb1=new JButton("SUBMIT");
	jb2=new JButton("BACK");
	l1.setBounds(180,50,240,30);
	l2.setBounds(180,80,240,30);
	t1.setBounds(430,55,140,20);
	t2.setBounds(430,85,140,20);
	jb1.setBounds(285,135,90,20);
	jb2.setBounds(415,135,90,20);
	con.add(l1);
	con.add(l2);
	con.add(t1);
	con.add(t2);
	con.add(jb1);
	con.add(jb2);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("SUBMIT"))
		{
		if(t1.getText().equals("") || t2.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this,"ERROR :\nYou left your account number or account balance empty.");
				setVisible(false);
				AdminOptionUpdate6 p=new AdminOptionUpdate6("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else
			{
			Long acc_num,acc_bal;
			String s1=t1.getText().trim();
			String s2=t2.getText().trim();
			acc_num=Long.parseLong(s1);
			acc_bal=Long.parseLong(s2);
			try
				{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","root");  
					Statement st=con.createStatement();
					String str="update details set acc_bal="+acc_bal+" where acc_num="+acc_num;
					int x=st.executeUpdate(str);
					if(x == 0)
					{
						JOptionPane.showMessageDialog(this,"ACCOUNT NUMBER ENTERED DOESN'T MATCH THE DATABASE.\nTry again.");
						setVisible(false);
						AdminOptionUpdate6 p=new AdminOptionUpdate6("SMART SOFT 1.6.1");
						p.setSize(700,400);
						p.setLocation(300,200);
						p.setResizable(false);
						p.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(this,"Account balance updated successfully.\nClick OK.");
						setVisible(false);
						AdminOptionUpdate p=new AdminOptionUpdate("SMART SOFT 1.6.1");
						p.setSize(700,400);
						p.setLocation(300,200);
						p.setResizable(false);
						p.setVisible(true);
					}
					st.close();
					con.close();
				}
			catch (Exception e)
				{
					JOptionPane.showMessageDialog(this,"ERROR -->"+e);
				}
			}
		}
	else if(ae.getActionCommand().equals("BACK"))
		{
		setVisible(false);
		AdminOptionUpdate p=new AdminOptionUpdate("SMART SOFT 1.6.1");
		p.setSize(700,400);
		p.setLocation(300,200);
		p.setResizable(false);
		p.setVisible(true);
		}
	}
}

class AdminOptionUpdate7 extends JFrame implements ActionListener
{
JLabel l1,l2;
JTextField t1,t2;
JButton jb1,jb2;
AdminOptionUpdate7(String s)
	{
	super(s);
	Container con=getContentPane();
	con.setLayout(null);
	l1=new JLabel("ENTER THE ACCOUNT NUMBER ");
	l2=new JLabel("ENTER THE UPDATED CREDIT BALANCE ");
	t1=new JTextField();
	t2=new JTextField();
	jb1=new JButton("SUBMIT");
	jb2=new JButton("BACK");
	l1.setBounds(180,50,240,30);
	l2.setBounds(180,80,240,30);
	t1.setBounds(430,55,140,20);
	t2.setBounds(430,85,140,20);
	jb1.setBounds(285,135,90,20);
	jb2.setBounds(415,135,90,20);
	con.add(l1);
	con.add(l2);
	con.add(t1);
	con.add(t2);
	con.add(jb1);
	con.add(jb2);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("SUBMIT"))
		{
		if(t1.getText().equals("") || t2.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this,"ERROR :\nYou left your account number or credit balance empty.");
				setVisible(false);
				AdminOptionUpdate7 p=new AdminOptionUpdate7("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else
			{
			Long acc_num,cred_pay;
			String s1=t1.getText().trim();
			String s2=t2.getText().trim();
			acc_num=Long.parseLong(s1);
			cred_pay=Long.parseLong(s2);
			try
				{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","root");  
					Statement st=con.createStatement();
					String str="update details set cred_pay="+cred_pay+" where acc_num="+acc_num;
					int x=st.executeUpdate(str);
					if(x == 0)
					{
						JOptionPane.showMessageDialog(this,"ACCOUNT NUMBER ENTERED DOESN'T MATCH THE DATABASE.\nTry again.");
						setVisible(false);
						AdminOptionUpdate7 p=new AdminOptionUpdate7("SMART SOFT 1.6.1");
						p.setSize(700,400);
						p.setLocation(300,200);
						p.setResizable(false);
						p.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(this,"Credit balance required to pay updated successfully.\nClick OK.");
						setVisible(false);
						AdminOptionUpdate p=new AdminOptionUpdate("SMART SOFT 1.6.1");
						p.setSize(700,400);
						p.setLocation(300,200);
						p.setResizable(false);
						p.setVisible(true);
					}
					st.close();
					con.close();
				}
			catch (Exception e)
				{
					JOptionPane.showMessageDialog(this,"ERROR -->"+e);
				}
			}
		}
	else if(ae.getActionCommand().equals("BACK"))
		{
		setVisible(false);
		AdminOptionUpdate p=new AdminOptionUpdate("SMART SOFT 1.6.1");
		p.setSize(700,400);
		p.setLocation(300,200);
		p.setResizable(false);
		p.setVisible(true);
		}
	}
}

class AdminOptionDelete extends JFrame implements ActionListener
{
JLabel l1;
JTextField t1;
JButton jb1,jb2;
AdminOptionDelete(String s)
	{
	super(s);
	Container con=getContentPane();
	con.setLayout(null);
	l1=new JLabel("ENTER THE ACCOUNT NUMBER OF THE CUSTOMER .");
	t1=new JTextField();
	jb1=new JButton("DELETE");
	jb2=new JButton("BACK");
	l1.setBounds(140,50,290,30);
	t1.setBounds(440,55,150,18);
	jb1.setBounds(280,95,90,18);
	jb2.setBounds(410,95,90,18);
	con.add(l1);
	con.add(t1);
	con.add(jb1);
	con.add(jb2);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("DELETE"))
		{
		if(t1.getText().equals(""))
			{
				JOptionPane.showMessageDialog(this,"ERROR :\nYou left the customers account number empty.");
				setVisible(false);
				AdminOptionDelete p=new AdminOptionDelete("SMART SOFT 1.6.1");
				p.setSize(700,400);
				p.setLocation(300,200);
				p.setResizable(false);
				p.setVisible(true);
			}
		else
			{
			Long acc_num;
			String s1=t1.getText().trim();
			acc_num=Long.parseLong(s1);
			try
				{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","root");  
					Statement st=con.createStatement();
					String str="delete from details where acc_num="+acc_num;
					int x=st.executeUpdate(str);
					if(x == 0)
					{
						JOptionPane.showMessageDialog(this,"ACCOUNT NUMBER ENTERED DOESN'T MATCH THE DATABASE.\nTry again.");
						setVisible(false);
						AdminOptionDelete p=new AdminOptionDelete("SMART SOFT 1.6.1");
						p.setSize(700,400);
						p.setLocation(300,200);
						p.setResizable(false);
						p.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(this,"Customer details deleted successfully.\nClick OK.");
						setVisible(false);
						AdminOption p=new AdminOption("SMART SOFT 1.6.1");
						p.setSize(700,400);
						p.setLocation(300,200);
						p.setResizable(false);
						p.setVisible(true);
					}
					st.close();
					con.close();
				}
			catch (Exception e)
				{
					JOptionPane.showMessageDialog(this,"ERROR -->"+e);
				}
			}
		}
	else if(ae.getActionCommand().equals("BACK"))
		{
		setVisible(false);
		AdminOption p=new AdminOption("SMART SOFT 1.6.1");
		p.setSize(700,400);
		p.setLocation(300,200);
		p.setResizable(false);
		p.setVisible(true);
		}
	}
}

class AdminOptionInsert extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
JButton jb1,jb2;
AdminOptionInsert(String s)
	{
	super(s);
	Container con=getContentPane();
	con.setLayout(null);
	l1=new JLabel("ENTER NEW ACCOUNT NUMBER OF THE CUSTOMER(12-DIGIT NUMBER).");
	l2=new JLabel("ENTER IT'S RESPECTIVE PIN NUMBER.");
	l3=new JLabel("ENTER THE CUSTOMER NAME.");
	l4=new JLabel("ENTER THE CUSTOMER'S INITIAL BALANCE .");
	l5=new JLabel("ENTER THE CUSTOMER'S CREDITS THAT HE NEEDS TO PAY.");
	l6=new JLabel("ENTER THE LAST TRANSACTION DATE OF BALANCE(YYYY-MM-DD).");
	l7=new JLabel("ENTER THE LAST TRANSACTION DATE OF CREDITS(YYYY-MM-DD).");
	l8=new JLabel("ENTER THE CUSTOMER'S PHONE NUMBER.");
	l9=new JLabel("ENTER THE CUSTOMER'S PETRO POINTS.");
	l10=new JLabel("ENTER THE CUSTOMER'S SHOPPING POINTS.");
	t1=new JTextField("NULL");
	t2=new JTextField("****");
	t3=new JTextField("NULL");
	t4=new JTextField("0");
	t5=new JTextField("0");
	t6=new JTextField("0000-00-00");
	t7=new JTextField("0000-00-00");
	t8=new JTextField("NULL");
	t9=new JTextField("0");
	t10=new JTextField("0");
	jb1=new JButton("INSERT");
	jb2=new JButton("BACK");
	l1.setBounds(100,50,400,25);
	l2.setBounds(100,80,350,25);
	l3.setBounds(100,110,350,25);
	l4.setBounds(100,140,350,25);
	l5.setBounds(100,170,350,25);
	l6.setBounds(100,200,400,25);
	l7.setBounds(100,230,400,25);
	l8.setBounds(100,260,350,25);
	l9.setBounds(100,290,350,25);
	l10.setBounds(100,320,350,25);
	t1.setBounds(520,55,170,18);
	t2.setBounds(520,85,170,18);
	t3.setBounds(520,115,170,18);
	t4.setBounds(520,145,170,18);
	t5.setBounds(520,175,170,18);
	t6.setBounds(520,205,170,18);
	t7.setBounds(520,235,170,18);
	t8.setBounds(520,265,170,18);
	t9.setBounds(520,295,170,18);
	t10.setBounds(520,325,170,18);
	jb1.setBounds(280,375,90,18);
	jb2.setBounds(470,375,90,18);
	con.add(l1);
	con.add(l2);
	con.add(l3);
	con.add(l4);
	con.add(l5);
	con.add(l6);
	con.add(l7);
	con.add(l8);
	con.add(l9);
	con.add(l10);
	con.add(t1);
	con.add(t2);
	con.add(t3);
	con.add(t4);
	con.add(t5);
	con.add(t6);
	con.add(t7);
	con.add(t8);
	con.add(t9);
	con.add(t10);
	con.add(jb1);
	con.add(jb2);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand().equals("INSERT"))
		{
		if(t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals("") || t4.getText().equals("") || t5.getText().equals("") || t6.getText().equals("") || t7.getText().equals("") || t8.getText().equals("") || t9.getText().equals("") || t10.getText().equals(""))
			{
					JOptionPane.showMessageDialog(this,"You left few fields empty.\nPlease fill them.\nClick OK.");
					setVisible(false);
					AdminOptionInsert p=new AdminOptionInsert("INSERTION PROCESS.");
					p.setSize(900,600);
					p.setLocation(200,150);
					p.setVisible(true);
			}
		else
			{
			try
				{
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","root");  
					Statement st=con.createStatement();
					String str="insert into details values("+Long.parseLong(t1.getText())+","+Long.parseLong(t2.getText())+",'"+t3.getText()+"',"+Long.parseLong(t4.getText())+","+Long.parseLong(t5.getText())+",'"+t6.getText()+"','"+t7.getText()+"',"+Long.parseLong(t8.getText())+","+Long.parseLong(t9.getText())+","+Long.parseLong(t10.getText())+")";
					int x=st.executeUpdate(str);
					if(x == 0)
					{
						JOptionPane.showMessageDialog(this,"Customer details not inserted successfully.\nTRY AGAIN.");
						setVisible(false);
						AdminOptionInsert p=new AdminOptionInsert("INSERTION PROCESS.");
						p.setSize(900,600);
						p.setLocation(200,150);
						p.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(this,"Customer details are inserted successfully.\nClick OK.");
						setVisible(false);
						AdminOption p=new AdminOption("SMART SOFT 1.6.1");
						p.setSize(700,400);
						p.setLocation(300,200);
						p.setResizable(false);
						p.setVisible(true);
					}
					st.close();
					con.close();
				}
			catch (Exception e)
				{
					JOptionPane.showMessageDialog(this,"ERROR -->"+e);
				}
			}
		}
		else if(ae.getActionCommand().equals("BACK"))
		{
			setVisible(false);
			AdminOption p=new AdminOption("SMART SOFT 1.6.1");
			p.setSize(700,400);
			p.setLocation(300,200);
			p.setResizable(false);
			p.setVisible(true);
		}
	}	
}

class AdminOptionCustomer extends JFrame
{
Connection con;
Statement st;
String str;
ResultSet rs;
ResultSetMetaData rst;
JTable jt;
JScrollPane jsp;
Container cn;
AdminOptionCustomer(String s)
	{
	super(s);
		try
			{
				Class.forName("com.mysql.jdbc.Driver");  
	            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/smartcard","root","root");  
				st=con.createStatement();
				str="select * from details";
				rs=st.executeQuery(str);
				rst=rs.getMetaData();
				int cols=rst.getColumnCount();
				int rows=0;
				while(rs.next())
					{
					rows++;
					}
				String column[]=new String[cols];
				String row[][]=new String[rows][cols];
				for(int i=0;i<cols;i++)
					{
					column[i]=rst.getColumnName(i+1);
					}
				rs=st.executeQuery(str);
				for(int i=0;i<rows;i++)
					{
					rs.next();
					for(int j=0;j<cols;j++)
						{
						row[i][j]=rs.getString(j+1);
						}					
					}
				jt=new JTable(row,column);
				int x=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
				int y=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
				jsp=new JScrollPane(jt,y,x);
				cn=getContentPane();
				cn.setLayout(new BorderLayout());
				cn.add(jsp);
				st.close();
				con.close();
			}
		catch (Exception e)
			{
				JOptionPane.showMessageDialog(this,"ERROR -->"+e);
			}
	}
}

class MainClass
{
public static void main(String args[])
	{
	Project p=new Project("SMART SOFT 1.6.1");
	p.setSize(700,400);
	p.setLocation(300,200);
	p.setResizable(false);
	p.setVisible(true);
	}
}