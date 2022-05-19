package study0519;

import javax.swing.*;
import java.awt.*;

public class paintJPanelEx extends JFrame 
{
	paintJPanelEx() 
	{
		setTitle("JPanel의 paintComponent() 예제");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel()); 
		setSize(500,500);
		setVisible(true);
	}

	// JPanel을 상속받는 새 패널 구현
	class MyPanel extends JPanel 
	{
		public void paintComponent(Graphics g) 
		{
			super.paintComponent(g); 
			g.setColor(Color.BLUE); // 파란색 선택
			g.drawRect(100,200,100,100);
			
			g.setColor(Color.RED); // 빨간색 선택
			g.drawRect(100,100,100,100); 

			g.setColor(Color.MAGENTA); // 마젠타색 선택
			g.drawRect(200,200,100,100);
			
			g.setColor(Color.BLACK); // 검은색 선택
			g.drawRect(200,100,100,100);
		}
	}

	public static void main(String [] args) {
		new paintJPanelEx();
	}
}
