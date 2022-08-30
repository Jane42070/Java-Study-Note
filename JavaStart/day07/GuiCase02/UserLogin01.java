package day07.GuiCase02;

import javax.swing.*;
import java.awt.event.*;

/**
 * UserLogin01
 * 1. 已知的用户名和密码
 * 用户名：itheima
 * 密码：123456
 * 2. 用户名密码的长度都是 6-12 位
 * 3. 点击登陆按钮
 * 先判断输入的用户名和密码是否符合要求
 * 再判断用户登录是否成功
 *
 * @author qilin
 */
public class UserLogin01 {
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

		// 已知的用户名和密码
		String name = "itheima";
		String pwd = "123456";

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = usernamTextField.getText();
				String password = passworTextField.getText();

				// 先判断输入的用户名和密码是否符合要求
				// 用户名和密码的长度都是 6-12 位
				if (username.length() < 6 || username.length() > 12 || password.length() < 6
						|| password.length() > 12) {
					/* System.out.println("用户名的长度是 6-12 位，请重新输入"); */
					JOptionPane.showMessageDialog(frame, "用户名和密码的长度是 6-12 位，请重新输入");
					// 清空文本内容
					usernamTextField.setText("");
					passworTextField.setText("");
					return;
				}

				// 判断登陆是否成功
				if (username.equals(name) && password.equals(pwd)) {
					/* System.out.println("登陆成功"); */
					// static 静态的成员方法和成员变量，是可以通过类名直接访问的
					JOptionPane.showMessageDialog(frame, "登陆成功");
					// 清空文本内容
					usernamTextField.setText("");
					passworTextField.setText("");
				} else {
					/* System.out.println("用户名或者密码有误"); */
					JOptionPane.showMessageDialog(frame, "用户名或者密码有误");
				}
			}
		});

		frame.setVisible(true);
	}
}
