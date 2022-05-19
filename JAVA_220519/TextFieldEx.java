package study0519;

import javax.swing.*;
import java.awt.*;

public class TextFieldEx extends JFrame 
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	TextFieldEx() 
	{
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
		
		setTitle("�ؽ�Ʈ�ʵ� ����� ����");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.add(new JLabel("�̸� "));
		c.add(new JTextField(20));
		c.add(new JLabel("�а� "));
		c.add(new JTextField(20)); 
		c.add(new JLabel("�ּ� "));
		c.add(new JTextField(20)); 		

		setSize(300,150);
		setVisible(true);
	}
	public static void main(String [] args) {
		new TextFieldEx();
	}
}
