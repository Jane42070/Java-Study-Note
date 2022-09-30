package day06.apigui05;

import javax.swing.*;
import java.awt.event.*;

/**
 * ActionListenerDemo01
 * 
 * @author qilin
 */
public class ActionListenerDemo01 {
	public static void main(String[] args) {
		// 创建窗体对象
		JFrame frame = new JFrame();

		frame.setTitle("事件监听机制");
		frame.setLayout(null);
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(3);
		frame.setLocationRelativeTo(null);
		frame.setAlwaysOnTop(true);

		// 创建按钮
		JButton btn1 = new JButton("你点我啊");
		btn1.setBounds(0, 0, 100, 100);
		frame.add(btn1);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("你点我啊");
			}
		});

		frame.setVisible(true);
	}
}
