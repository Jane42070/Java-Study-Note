package day06.apigui05;

import javax.swing.*;

/**
 * ChatRoomCase02
 * 需求：做出聊天室界面
 * 分析：
 * 1. 1 个 JTextArea
 * 2. 1 个 JTextField
 * 3. 2 个 JButton
 *
 * @author qilin
 */
public class ChatRoomCase02 {
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

		// 添加组件至窗体
		frame.add(messageArea);
		frame.add(messageField);
		frame.add(btn1);
		frame.add(btn2);

		frame.setVisible(true);
	}
}
