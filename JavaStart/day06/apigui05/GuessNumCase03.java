package day06.apigui05;

import javax.swing.*;

/**
 * GuessNumCase03
 * 需求：做出猜数字界面
 * 分析：
 * 1 个 Label
 * 1 个 TextField
 * 1 个 JButton
 *
 * @author qilin
 */
public class GuessNumCase03 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setTitle("猜数字");
		frame.setLayout(null);
		frame.setDefaultCloseOperation(3);
		frame.setLocationRelativeTo(null);
		frame.setSize(400, 300);

		JLabel label = new JLabel("系统产生一个 1-100 之间的数字，请猜一猜");
		label.setBounds(70, 50, 350, 20);

		JTextField textField = new JTextField();
		textField.setBounds(120, 100, 150, 20);

		JButton button = new JButton("我猜");
		button.setBounds(150, 150, 100, 20);

		frame.add(label);
		frame.add(textField);
		frame.add(button);
		frame.setVisible(true);
	}
}
