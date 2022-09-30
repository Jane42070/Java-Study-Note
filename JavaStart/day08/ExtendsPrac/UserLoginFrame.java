package day08.ExtendsPrac;

import javax.swing.*;

/**
 * UserLoginFrame
 */
public class UserLoginFrame extends JFrame {
	public UserLoginFrame() {
		this.setTitle("用户登陆");
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setAlwaysOnTop(true);
		this.setLayout(null);
		this.setDefaultCloseOperation(3);

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
		this.add(btn);
		this.add(label1);
		this.add(label2);
		this.add(usernamTextField);
		this.add(passworTextField);

		this.setVisible(true);
	}
}
