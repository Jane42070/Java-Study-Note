package day07.GuiCase02;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

/**
 * GuessNumber03
 * 1.系统产生一个 1-100 之间的数字，请猜一猜
 * 2.猜的内容不能为空
 * 3.每次根据猜的数字给出相应提示
 * 
 * @author qilin
 */
public class GuessNumber03 {
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

		Random rand = new Random();
		int num = rand.nextInt(100) + 1;

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String GuessNumber = textField.getText().trim();
				if (GuessNumber.equals("")) {
					return;
				}
				int guess = Integer.parseInt(GuessNumber);
				if (guess > num) {
					JOptionPane.showMessageDialog(frame, "大了");
					textField.setText("");
				} else if (guess < num) {
					JOptionPane.showMessageDialog(frame, "小了");
					textField.setText("");
				} else {
					JOptionPane.showMessageDialog(frame, "猜对了！");
				}
			}
		});

		frame.setVisible(true);
	}
}
