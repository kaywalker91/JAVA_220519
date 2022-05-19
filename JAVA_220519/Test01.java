package study0519;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Test01 extends JFrame{
	private static final long serialVersionUID = 1L;
	public Test01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 450);
		setContentPane(new Test02());
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test01();

	}

	class Test02 extends JPanel{
		private static final long serialVersionUID = 1L;
		
		Color color1 = new Color(255,0,0);

		@Override
		protected void paintComponent(Graphics g) { // drawXXX ���� fillXXX�� ���ΰ� ä����.
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawRect(10, 10, 50, 50);
			g.setFont(new Font("Arial", Font.ITALIC, 30));
			g.setColor(Color.RED);
			g.drawString("Java Study", 50, 50);
			g.setColor(color1);
			g.drawLine(40, 40, 200, 200);
			g.setColor(Color.GREEN);
			g.drawOval(50, 50, 100, 100);
			g.fillOval(100, 100, 100, 100);
			ImageIcon image = new ImageIcon("C:\\Users\\DW\\eclipse-workspace\\StudyJava01\\src\\images\\enemy.png");
			Image img = image.getImage();
			g.drawImage(img, 150, 150, 150,150, this);
		}
	}
}
