package day07.GuiCase02;

import javax.swing.*;
import java.awt.event.*;

/**
 * ChatRoom02
 * 1. 把文本框内容发送到文本域中
 * 2. 每次发送的文本内容不带前后空格
 * 3. 多次发送的内容在文本以追加的方式呈现
 * 4. 清空聊天就是把文本域的内容设置为空
 * 
 * @author qilin
 */
public class ChatRoom02 {
	public static void main(String[] args) {
		// 创建窗体对象
		JFrame frame = new JFrame();

		// 设置窗体属性
		frame.setTitle("聊天室");
		frame.setSize(400, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(3);
		frame.setAlwaysOnTop(true);
		frame.setLayout(null);

		// 聊天记录框
		JTextArea messageArea = new JTextArea();
		messageArea.setBounds(10, 10, 360, 200);
		messageArea.setEditable(false);

		// 输入框
		JTextField messageField = new JTextField();
		messageField.setBounds(10, 230, 180, 20);

		// 按钮
		JButton btn1 = new JButton("发送");
		JButton btn2 = new JButton("清空聊天");
		btn1.setBounds(200, 230, 70, 20);
		btn2.setBounds(280, 230, 100, 20);

		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. 把文本框内容发送到文本域中
				/* messageArea.setText(messageField.getText().trim()); */
				messageArea.append(messageField.getText().trim() + "\n");
				// 2. 清空文本框
				messageField.setText("");
			}
		});

		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 清空文本框内容
				messageArea.setText("");
			}
		});

		// 添加组件至窗体
		frame.add(messageArea);
		frame.add(messageField);
		frame.add(btn1);
		frame.add(btn2);

		frame.setVisible(true);
	}
}
