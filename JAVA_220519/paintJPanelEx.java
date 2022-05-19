package study0519;

import javax.swing.*;
import java.awt.*;

public class paintJPanelEx extends JFrame 
{
	paintJPanelEx() 
	{
		setTitle("JPanel�� paintComponent() ����");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel()); 
		setSize(500,500);
		setVisible(true);
	}

	// JPanel�� ��ӹ޴� �� �г� ����
	class MyPanel extends JPanel 
	{
		public void paintComponent(Graphics g) 
		{
			super.paintComponent(g); 
			g.setColor(Color.BLUE); // �Ķ��� ����
			g.drawRect(100,200,100,100);
			
			g.setColor(Color.RED); // ������ ����
			g.drawRect(100,100,100,100); 

			g.setColor(Color.MAGENTA); // ����Ÿ�� ����
			g.drawRect(200,200,100,100);
			
			g.setColor(Color.BLACK); // ������ ����
			g.drawRect(200,100,100,100);
		}
	}

	public static void main(String [] args) {
		new paintJPanelEx();
	}
}
