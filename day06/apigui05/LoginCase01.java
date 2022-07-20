package day06.apigui05;

import javax.swing.*;

/**
 * LoginCase01
 * 需求：做出用户登陆界面
 * 分析：
 * 1.2 个 Label
 * 2.2 个 TextField
 * 3.1 个 JButton
 * 
 * @author qilin
 */
public class LoginCase01 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setSize(400, 300);
		frame.setTitle("用户登陆");
		frame.setDefaultCloseOperation(3);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setAlwaysOnTop(true);

		// 显示密码和用户名文本
		JLabel label1 = new JLabel("用户名");
		JLabel label2 = new JLabel("密码");

		label1.setBounds(50, 50, 50, 20);
		label2.setBounds(50, 100, 50, 20);

		// 显示登陆按键
		JButton btn = new JButton("登陆");
		btn.setBounds(50, 200, 280, 20);

		// 显示密码和用户名输入框
		JTextField usernamTextField = new JTextField();
		usernamTextField.setBounds(150, 50, 180, 20);

		JTextField passworTextField = new JTextField();
		passworTextField.setBounds(150, 100, 180, 20);

		// 框架添加组件
		frame.add(btn);
		frame.add(label1);
		frame.add(label2);
		frame.add(usernamTextField);
		frame.add(passworTextField);

		frame.setVisible(true);
	}
}
