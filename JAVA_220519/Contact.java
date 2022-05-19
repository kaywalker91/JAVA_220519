package study0519;

import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Contact extends JFrame 
{
	JTextField tf1 = new JTextField(20);
	JTextField tf2 = new JTextField(20);
	JTextField tf3 = new JTextField(20);
	JTextArea ta = new JTextArea(7, 20); 

	Contact() 
	{
		setTitle("친구등록프로그램");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		FlowLayout flow = new FlowLayout();
		this.setLayout(flow);
		
		Label lbTitle = new Label("친구등록프로그램", Label.CENTER);
		Label lbName = new Label("이름: ", Label.LEFT);
		Label lbAge = new Label("나이: ", Label.LEFT);
		Label lbPlace = new Label("사는곳: ", Label.LEFT);
		
		Button btn = new Button("친구추가");
		
		add(lbTitle);
		lbTitle.setBounds(200, 0, 50, 50);
		Font font = new Font("SansSerif", Font.BOLD, 20);
		lbTitle.setFont(font);
		
		add(lbName);
		lbName.setBounds(50, 150, 50, 30);		
		c.add(tf1);
		tf1.setBounds(100, 150, 100, 30);
		
		add(lbAge);
		lbAge.setBounds(50, 150, 100, 30);
		add(tf2);
		tf2.setBounds(100, 150, 50, 30);
		
		add(lbAge);
		lbAge.setBounds(50, 250, 100, 30);
		add(tf3);
		tf3.setBounds(100, 250, 50, 30);
		
		add(btn);
		btn.setBounds(110, 300, 100, 30);
		
		c.add(new JScrollPane(ta));
		ta.setBounds(50, 350, 70, 70);

		tf1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText() + "\n"); 
				t.setText("");
			}
		});
		
		tf2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText() + "\n"); 
				t.setText("");
			}
		});
		
		tf3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText() + "\n"); 
				t.setText("");
			}
		});
		
		setSize(400,500);
		setVisible(true);
	}
	
	public static void main(String [] args) 
	{
		new Contact();
	}
}

