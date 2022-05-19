package study0519;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseAdapterEx extends JFrame 
{
	JLabel la = new JLabel("Hello"); // "Hello" ��¿� ���̺�

	MouseAdapterEx() 
	{
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());

		c.setLayout(null);
		la.setSize(50, 20); // ���̺��� ũ�� 50x20 ����
		la.setLocation(30, 30); // ���̺��� ��ġ (30,30)���� ����
		c.add(la); 

		setSize(200, 200);
		setVisible(true);
	}
    class MyMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}

	public static void main(String [] args) {
		new MouseAdapterEx();
	}
} 
